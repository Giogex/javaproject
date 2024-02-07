package utils;

import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;

public class TimeCycle {
    public static void timeManager(){
        Integer[] hours = {6, 12, 18, 0};

        Timer timer = new Timer();

        LocalTime currentTime = LocalTime.now();

        for (Integer hour : hours) {
            long delay = calculateDelay(hour, currentTime.getHour());
            timer.schedule(new MessageTask(hour), delay);
        }
    }

    private static long calculateDelay(Integer targetHour, Integer currentHour) {
        long delay;

        delay = (targetHour - currentHour) * 3600000;

        if (delay <= 0) {
            delay += 24 * 3600000;
        }

        return delay;
    }

    static class MessageTask extends TimerTask {
        private int hour;

        public MessageTask(int hour) {
            this.hour = hour;
        }

        @Override
        public void run() {
            String periodOfDay;
            if (hour == 6) {
                periodOfDay = "morning";
            } else if (hour == 12) {
                periodOfDay = "noon";
            } else if (hour == 18) {
                periodOfDay = "evening";
            } else {
                periodOfDay = "night";
            }

            System.out.println("It's " + hour + " o'clock and it's " + periodOfDay + ".");
        }
    }
}
