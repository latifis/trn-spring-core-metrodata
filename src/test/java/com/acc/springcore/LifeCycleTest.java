package com.acc.springcore;

import com.acc.springcore.config.LifeCycleConfig;
import com.acc.springcore.data.Server;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCycleTest {
    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(LifeCycleConfig.class);
        context.registerShutdownHook();
    }

    @Test
    void testServer(){
        Server server = context.getBean(Server.class);
    }
}
