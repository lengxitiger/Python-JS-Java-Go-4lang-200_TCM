import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class now {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatted = now.format(formatter);
        System.out.println("\nnow time->");
        System.out.println(formatted);
    }
}