import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SmartLogger implements Logger {
    private int logCount = 0;

    @Override
    public void log(String msg) {
        logCount++;
        String status = "INFO";
        if (msg.toLowerCase().contains("error")) {
            status = "ERROR";
        }
        System.out.println(status + "#" + logCount + " [" + LocalDateTime.now() + "] <" + msg + ">");
    }
}
