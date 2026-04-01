import java.util.Timer;
import java.util.TimerTask;

public class SchedulerService {

    public static void scheduleEmail(String from, String password, String to,
                                     String subject, String message, long delay) {

        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                EmailSender.sendEmail(from, password, to, subject, message);
            }
        }, delay);
    }
}
