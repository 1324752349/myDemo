package com.mafengwo.demo.beanProcessor;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * @author chenminrui
 * @date 2020-04-07 4:19 下午
 */
public class JobProxy {

    static HashSet<String> jobName = new HashSet<>();

    public static void put(String jobname){
        jobName.add(jobname);
    }

    public static boolean hasjobname(String jobname){
        return jobName.contains(jobname);
    }
}
