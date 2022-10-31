import java.util.Timer;

public class eyeTimer {

    static final long length = 1200000; 

    static Timer timer = new Timer();
    public static void main(String[] args){
        timer.schedule(new timerHelper(), length);
    }
}
