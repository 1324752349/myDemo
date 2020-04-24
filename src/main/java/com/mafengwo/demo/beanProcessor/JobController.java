package com.mafengwo.demo.beanProcessor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenminrui
 * @date 2020-04-07 4:27 下午
 */
@RestController
public class JobController {

    @JobInjected
    private Job1 jobService;

    @GetMapping("/testJob")
    public String jobDemo(){
        jobService.excuterJob();
        return "ok";
    }
}
