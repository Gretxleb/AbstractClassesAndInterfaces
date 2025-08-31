import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SimpleLogger implements Logger {
    @Override
    public void log(String msg) {
        System.out.println("[" + LocalDateTime.now() + "] <" + msg + ">");
    }
}
