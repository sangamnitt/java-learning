package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

//@Configuration
public class AppConfig {

    // create ThreadPoolTaskExecutor Bean
    //@Bean
    ThreadPoolTaskExecutor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(100);
        executor.setMaxPoolSize(200);
        executor.setQueueCapacity(500);
        executor.setThreadNamePrefix("MyTaskExecutor-");
        return executor;
    }


}
