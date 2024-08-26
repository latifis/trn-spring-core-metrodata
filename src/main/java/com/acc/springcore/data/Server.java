package com.acc.springcore.data;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Server {

    public void start(){
        log.info("Server started");
    }

    public void stop(){
        log.info("Server stopped");
    }

}
