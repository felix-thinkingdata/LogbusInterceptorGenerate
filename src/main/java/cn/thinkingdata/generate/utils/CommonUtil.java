package cn.thinkingdata.generate.utils;


import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.tools.ant.DirectoryScanner;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.management.ManagementFactory;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFilePermission;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

/**
 * Created by zhoujin on 2018/7/3.
 */
public class CommonUtil {


    private static char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
            'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b',
            'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
            'x', 'y', 'z', '0', '1'};

    private static Random random = new Random();

    //生成指定长度的随机字符串
    public static synchronized String createRandomString(int length) {
        if (length > 0) {
            int index = 0;
            char[] temp = new char[length];
            int num = random.nextInt();
            for (int i = 0; i < length % 5; i++) {
                temp[index++] = ch[num & 63];
                num >>= 6;
            }
            for (int i = 0; i < length / 5; i++) {
                num = random.nextInt();
                for (int j = 0; j < 5; j++) {
                    temp[index++] = ch[num & 63];
                    num >>= 6;
                }
            }
            return new String(temp, 0, length);
        } else if (length == 0) {
            return "";
        } else {
            throw new IllegalArgumentException();
        }
    }


    public static String generateTimeUuid() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String timeStamp = sdf.format(new Date());
        return timeStamp;

    }

    public static String generateShortUuid() {
        StringBuffer shortBuffer = new StringBuffer();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        for (int i = 0; i < 8; i++) {
            String str = uuid.substring(i * 4, i * 4 + 4);
            int x = Integer.parseInt(str, 16);
            shortBuffer.append(ch[x % 0x3E]);
        }
        return shortBuffer.toString();

    }

    public static String getMD5Str(String str) throws Exception {
        return getHexString(string2md5(str));
    }

    private static byte[] string2md5(String str) throws Exception {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.reset();
        return messageDigest.digest(str.getBytes(StandardCharsets.UTF_8));
    }

    public static String getHexString(byte[] tmp) {
        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] str = new char[16 * 2];
        int k = 0;
        for (int i = 0; i < 16; i++) {

            byte byte0 = tmp[i];
            str[k++] = hexDigits[byte0 >>> 4 & 0xf];
            str[k++] = hexDigits[byte0 & 0xf];
        }
        return new String(str);
    }

    public static String[] getFilesByFilePattern(String filePattern) {
        if (!filePattern.contains("*")) {
            return new String[]{filePattern};
        }
        String[] tokens = getScanBaseDirAndPattern(filePattern);
        String baseDir = tokens[0];
        DirectoryScanner scanner = new DirectoryScanner();
        scanner.setBasedir(baseDir);
        scanner.setIncludes(new String[]{tokens[1]});
        scanner.scan();
        String[] files = scanner.getIncludedFiles();
        for (int i = 0; i < files.length; i++) {
            files[i] = baseDir + files[i];
        }
        return files;
    }

    public static String getFileContent(String file) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line);
            sb.append("\n");
        }
        return sb.toString();
    }


    public static List<String> getFileLogContent(String file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        List<String> content = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            content.add(line);
        }
        return content;
    }
    /**
     * 设置秘钥权限为600
     *
     * @return : null
     * @Author: Felix.Wang
     * @Date: 2019/10/22 10:27
     */
    public static void setAs600(String filePath) throws IOException {

        Set<PosixFilePermission> perms = new HashSet<PosixFilePermission>();
        // add owners permission
        perms.add(PosixFilePermission.OWNER_READ);
        perms.add(PosixFilePermission.OWNER_WRITE);
        Files.setPosixFilePermissions(Paths.get(filePath), perms);

    }
    public static String generateTempFileWithContent(String content) throws IOException {
        String tempFilePath = "/tmp/" + UUID.randomUUID().toString();
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFilePath));
        writer.write(content);
        writer.flush();
        writer.close();
        return tempFilePath;
    }

    public static void delFile(String fileStr) {
        File file = new File(fileStr);
        if (file.exists()) {
            file.delete();
        }
    }


    private static String[] getScanBaseDirAndPattern(String filePattern) {
        String[] results = new String[2];
        String[] tokens = filePattern.split("/", -1);
        StringBuilder baseDirBd = new StringBuilder();
        int index = -1;
        while (index < tokens.length - 1) {
            index++;
            String token = tokens[index];
            if (token.contains("*")) {
                break;
            } else if (index == tokens.length - 1) {
                break;
            } else {
                baseDirBd.append(token).append("/");
            }

        }
        String baseDir = baseDirBd.toString();
        if ("".equals(baseDir)) {
            baseDir = "./";
        }

        StringBuilder patternBd = new StringBuilder();
        for (int i = index; i < tokens.length; i++) {
            patternBd.append(tokens[i]).append("/");
        }
        String pattern = patternBd.substring(0, patternBd.length() - 1);

        results[0] = baseDir;
        results[1] = pattern;
        return results;
    }

    public static String getContentFromResFile(String filePath) throws IOException {
        InputStream resourceAsStream = CommonUtil.class.getResourceAsStream(filePath);
        String line;
        BufferedReader reader = new BufferedReader(new InputStreamReader(resourceAsStream));
        StringBuilder sb = new StringBuilder();
        while ((line = reader.readLine()) != null){
            sb.append(line);
            sb.append("\n");
        }
        reader.close();
        return sb.toString();
    }


    public static String getContentFromFile(String filePath) throws IOException {
        String line;
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        StringBuilder sb = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            sb.append(line);
            sb.append("\n");
        }
        reader.close();
        return sb.toString();
    }


    public static void setAsExecutable(String filePath) throws IOException {

        Set<PosixFilePermission> perms = new HashSet<PosixFilePermission>();
        // add owners permission
        perms.add(PosixFilePermission.OWNER_READ);
        perms.add(PosixFilePermission.OWNER_WRITE);
        perms.add(PosixFilePermission.OWNER_EXECUTE);
        // add group permissions
        perms.add(PosixFilePermission.GROUP_READ);
        perms.add(PosixFilePermission.GROUP_EXECUTE);
        // add others permissions
        perms.add(PosixFilePermission.OTHERS_READ);
        perms.add(PosixFilePermission.OTHERS_EXECUTE);

        Files.setPosixFilePermissions(Paths.get(filePath), perms);

    }




    public static int hashIndexWithMurmur3(String data, int totalNum){
        if(data == null){
            return random.nextInt(totalNum);
        }
        HashCode hashCode = Hashing.murmur3_32().hashBytes(data.getBytes());
        return toPositive(hashCode.asInt()) % totalNum;
    }
    private static int toPositive(int number) {
        return number & 2147483647;
    }

    public static String getHostName(){
        try {
            return (InetAddress.getLocalHost()).getHostName();
        } catch (UnknownHostException uhe) {
            String host = uhe.getMessage();
            if (host != null) {
                int colon = host.indexOf(':');
                if (colon > 0) {
                    return host.substring(0, colon);
                }
            }
            return "UnknownHost";
        }
    }


    public static <T> T mapToObject(Map<String, Object> map, Class<?> beanClass) throws Exception {
        if (map == null) {
            return null;
        }
        Object obj = beanClass.newInstance();
        BeanUtils.populate(obj,map);
        return (T) obj;
    }


    public static String getRuntimeProcessName(){
        return ManagementFactory.getRuntimeMXBean().getName();
    }
}
