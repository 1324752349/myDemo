package com.mafengwo.demo.simpledataformat;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.*;

/**
 * @author chenminrui
 * @date 2020-05-13 10:14 上午
 */
public class DataformatDemo {


    //build a threadFactory
    public static ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().setNameFormat(("demo-pool-%d")).build();

    private static ExecutorService executorService = new ThreadPoolExecutor(5, 200,
            0L, TimeUnit.MILLISECONDS,
            new LinkedBlockingQueue<Runnable>(1024), namedThreadFactory, new
            ThreadPoolExecutor.
                    AbortPolicy());

    public static CountDownLatch countDownLatch = new CountDownLatch(100);
    public static void main(String[] args) throws InterruptedException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Set<String> set = Collections.synchronizedSet(new HashSet<>());
        for (int  i =0 ;i<100;i++){
            //get current time
            Calendar calendar = Calendar.getInstance();
            int finial  = i;
            executorService.execute(()->{
                    //add one day
                synchronized (sdf) {
                    calendar.add(Calendar.DATE, finial);
                    String format = sdf.format(calendar.getTime());
                    set.add(format);
                    countDownLatch.countDown();//--1;
                }
            });
        }
        countDownLatch.await();
        System.out.println(set.size());
    }
}
