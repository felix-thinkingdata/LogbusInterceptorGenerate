package cn.thinkingdata.generate.utils;


import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by zhoujin on 2017/11/24.
 */
public class DateUtil {
    public enum DateType {DATE, DATETIME_SECOND, DATETIME_MS, NOT_DATE}

    private static final DateFormat DAY_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
    private static final DateFormat SECOND_DATE_FORMAT  = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static final DateFormat MSEC_DATE_FORMAT  = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    private static final DateFormat HOUR_DATE_FROMAT  = new SimpleDateFormat("yyyyMMddHH");

    private static final DateFormat PARTITION_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
    private static final DateFormat SHORT_DATE_FORMAT = new SimpleDateFormat("yyyyMMdd");
    private static final DateFormat LONG_DATE_FORMAT = new SimpleDateFormat("yyyyMMddHHmmss");
    private static final DateFormat PRECISE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");




    public static DateType getDateType(String str) {
        if (str == null) {
            return DateType.NOT_DATE;
        } else if (str.length() == 10) {
            for (int i = 0; i < str.length(); i++) {
                if (!isVaildDateChar(str.charAt(i), i)) {
                    return DateType.NOT_DATE;
                }
            }
            return DateType.DATE;
        } else if (str.length() == 19) {
            for (int i = 0; i < str.length(); i++) {
                if (!isVaildDateChar(str.charAt(i), i)) {
                    return DateType.NOT_DATE;
                }
            }
            return DateType.DATETIME_SECOND;
        } else if (str.length() == 23) {
            for (int i = 0; i < str.length(); i++) {
                if (!isVaildDateChar(str.charAt(i), i)) {
                    return DateType.NOT_DATE;
                }
            }
            return DateType.DATETIME_MS;
        }
        return DateType.NOT_DATE;
    }

    public synchronized static Date parserDateStr(String str) {
        try {
            if (str.length() == 10) {
                return DAY_DATE_FORMAT.parse(str);
            } else if (str.length() == 19) {
                return SECOND_DATE_FORMAT.parse(str);
            } else if (str.length() == 23) {
                return MSEC_DATE_FORMAT.parse(str);
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    public synchronized static Date parseDateString(String dateStr) {
        int length = dateStr.length();
        DateFormat format;

        if (8 == length) {
            format = SHORT_DATE_FORMAT;
            try {
                return format.parse(dateStr);
            } catch (ParseException e) {

            }
        } else if (14 == length) {
            format = LONG_DATE_FORMAT;
            try {
                return format.parse(dateStr);
            } catch (ParseException e) {

            }
        } else if (10 == length) {
            format = PARTITION_DATE_FORMAT;
            try {
                return format.parse(dateStr);
            } catch (ParseException e) {

            }

            format = new SimpleDateFormat("yyyy/MM/dd");
            try {
                return format.parse(dateStr);
            } catch (ParseException e) {

            }
        } else if (19 == length) {
            format = PRECISE_DATE_FORMAT;
            try {
                return format.parse(dateStr);
            } catch (ParseException e) {

            }
        } else if (21 == length) {
            format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
            try {
                return format.parse(dateStr);
            } catch (ParseException e) {

            }
        } else if (23 == length) {
            format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            try {
                return format.parse(dateStr);
            } catch (ParseException e) {

            }
        }

        throw new RuntimeException("can not parse date string :" + dateStr);
    }

    public synchronized static String formatHourPatternDate(Date date) {
        return HOUR_DATE_FROMAT.format(date);
    }

    public synchronized static String getLastPointHourDate(Date date, int intervalHour) {
        long timeMs = date.getTime();
        long hourPointMs = timeMs - (timeMs + 28800000) % (intervalHour * 3600000);
        return HOUR_DATE_FROMAT.format(new Date(hourPointMs));
    }

    public synchronized static Date getLastPointMinutesDate(Date date, int intervalMinutes) {
        long timeMs = date.getTime();
        long minutePointMs = timeMs - (timeMs + 28800000) % (intervalMinutes * 60000);
        return new Date(minutePointMs);
    }

    public synchronized static String getLastPointHourDateAhead(Date date, int intervalHour) {
        long timeMs = date.getTime();
        long hourPointMs = timeMs - (timeMs + 28800000) % (intervalHour * 3600000) - (intervalHour * 3600000);
        return HOUR_DATE_FROMAT.format(new Date(hourPointMs));
    }


    public synchronized static String formatSecondPatterndate(Date date) {
        return SECOND_DATE_FORMAT.format(date);
    }

    public synchronized static String formatDatePatterndate(Date date) {
        return DAY_DATE_FORMAT.format(date);
    }

    public synchronized static String formatMsPatterndate(Date date) {
        return MSEC_DATE_FORMAT.format(date);
    }

    public synchronized static String getOffsetDatePartitionString(Date currentDate, int offsetDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.DATE, offsetDate);
        return DAY_DATE_FORMAT.format(calendar.getTime());
    }

    public synchronized static Date getOffsetDate(Date currentDate, int offsetDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.DATE, offsetDate);
        return calendar.getTime();
    }

    public synchronized static Date getOffsetHourDate(Date date, int offsetHour) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR, offsetHour);
        return calendar.getTime();
    }

    public synchronized static Date getOffsetMinuteDate(Date date, int offsetMinute) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE, offsetMinute);
        return calendar.getTime();
    }

    private static boolean isVaildDateChar(char c, int index) {
        if (index == 0) {
            return (c >= '1' && c <= '2');
        } else if (index >= 1 && index <= 3) {
            return (c >= '0' && c <= '9');
        } else if (index == 4 || index == 7) {
            return c == '-';
        } else if (index == 5) {
            return (c >= '0' && c <= '1');
        } else if (index == 6 || index == 9 || index == 12 || index == 15 || index == 18) {
            return (c >= '0' && c <= '9');
        } else if (index == 8) {
            return (c >= '0' && c <= '3');
        } else if (index == 10) {
            return c == ' ';
        } else if (index == 11) {
            return (c >= '0' && c <= '2');
        } else if (index == 13 || index == 16) {
            return c == ':';
        } else if (index == 14 || index == 17) {
            return (c >= '0' && c <= '5');
        } else if (index == 19) {
            return c == '.';
        } else if (index >= 20 && index <= 22) {
            return (c >= '0' && c <= '9');
        } else {
            return false;
        }

    }


    /**
     * describe: 判断日期格式
     *
     * @author: felix@thinkingdata.cn creat_date: 2019/2/27 0027 creat_time:
     * 20:01
     **/
    public static boolean isDate(String ymd) {
        try {
            if (ymd == null || ymd.length() == 0 || ymd.length() < 10) {
                return false;
            } else {
                SimpleDateFormat dateFormat;
                if (ymd.length() == 10) {
                    dateFormat = new SimpleDateFormat("yyyy-MM-dd");

                } else {
                    return false;
                }
                dateFormat.setLenient(false);
                dateFormat.parse(ymd);
                return true;
            }
        } catch (Exception e) {
            return false;
        }


    }

    public static boolean compare(String date1, String date2) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        format.setLenient(false);
        Date startDate;
        Date endDate;
        try {
            startDate = format.parse(date1);
            endDate = format.parse(date2);
        } catch (ParseException e) {
            return false;
        }

        return startDate.getTime() <= endDate.getTime();

    }


    /**
     * 归档时间有效期
     *
     * @return : null
     * @Author: Felix.Wang
     * @Date: 2019/11/1 17:17
     */
    public static boolean periodValidity(String date) {

        try {
            //一个月前
            DateTime validityDateTime = DateTime.now().minusMonths(1);

            DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");
            DateTime inputDate = DateTime.parse(date, formatter);

            return inputDate.isBefore(validityDateTime.getMillis());
        } catch (Exception e) {
            return false;
        }


    }

    public synchronized static String getOffsetDateShortString(
            Date currentDate, int offsetDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.DATE, offsetDate);
        return SHORT_DATE_FORMAT.format(calendar.getTime());
    }
    public static String formatDayPatterndate(Date date){
        return DAY_DATE_FORMAT.format(date);
    }
}
