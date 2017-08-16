package com.veuve.mydemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * 定时任务工具类
 * @Configuration
 * @EnableScheduling
 */

public class SchedulingConfig {

    @Scheduled(cron = "0/20 * * * * ?") // 每20秒执行一次
    public void scheduler() {
        System.out.println(">>>>>>>>> SchedulingConfig.scheduler()");
    }
}
