import java.util.regex.*;

class regex {
    public static void main(String[] args) {
        String text = "医嘱：Aspirin 100mg, 每日2次（饭后）®";
        // 分离英文药品名和中文说明
        Pattern pattern = Pattern.compile("\\p{IsLatin}+|\\p{IsHan}+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        // Output: 医嘱 Aspirin 每日 次 饭后
    }
}