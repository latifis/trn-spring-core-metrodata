package com.acc.springcore.config;

import com.acc.springcore.data.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifeCycleConfig {

    @Bean(initMethod = "start", destroyMethod = "stop")
    public Server server(){
        return new Server();
    }

}
