package week7;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class ImportExample {

    public static void ImportExample() {
        TimeZone time;
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // 현재 아시아 시간 가져오기
        time = TimeZone.getTimeZone("Asia/Seoul");
        df.setTimeZone(time);
        System.out.format("%s %n %s %n", time.getDisplayName(), df.format(date));
    }
}
