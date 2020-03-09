package test;

import java.text.SimpleDateFormat;
import java.util.Date;

/***
 * 日期格式化，SimpleDateFormat
 * yyyy：年
 * MM：月
 * dd：日
 * hh：1~12小时制(1-12)
 * HH：24小时制(0-23)
 * mm：分
 * ss：秒
 * S：毫秒
 * E：星期几
 * D：一年中的第几天
 * F：一月中的第几个星期(会把这个月总共过的天数除以7)
 * w：一年中的第几个星期
 * W：一月中的第几星期(会根据实际情况来算)
 * a：上下午标识
 * k：和HH差不多，表示一天24小时制(1-24)。
 * K：和hh差不多，表示一天12小时制(0-11)。
 * z：表示时区
 */
public class DateFormat {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss yyyy-MM-dd E");
        System.out.printf("格式化后的日期为：%s",df.format(date));
    }
}
