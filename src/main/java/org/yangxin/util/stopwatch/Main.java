package org.yangxin.util.stopwatch;

import org.springframework.util.StopWatch;

import java.util.concurrent.TimeUnit;

/**
 * @author yangxin
 * 2024/3/22 17:30
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        StopWatch stopWatch1 = new StopWatch("1");
        stopWatch1.start("1");
        TimeUnit.SECONDS.sleep(2);
        stopWatch1.stop();
        System.out.println("Execution Time: " + stopWatch1.getTotalTimeMillis() + " milliseconds");
        System.out.println(stopWatch1.getId() + " -> " + stopWatch1.getLastTaskName() + " -> " + stopWatch1.getTotalTimeMillis());

        StopWatch stopWatch2 = new StopWatch("2");
        stopWatch2.start("2");
        TimeUnit.SECONDS.sleep(5);
        stopWatch2.stop();
        System.out.println("Execution Time: " + stopWatch2.getTotalTimeMillis() + " milliseconds");
        System.out.println(stopWatch2.getId() + " -> " + stopWatch2.getLastTaskName() + " -> " + stopWatch2.getTotalTimeMillis());
    }
}
