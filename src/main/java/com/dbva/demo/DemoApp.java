package com.dbva.demo;

import org.h2.tools.Server;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.sql.SQLException;

//c:\programs\H2\bin>java -jar h2-2.1.214.jar -webAllowOthers -tcpAllowOthers

@SpringBootApplication
public class DemoApp {

    public static void main(String[] args) {
        SpringApplication.run(DemoApp.class, args);
    }

    //@PostConstruct
    //public void startH2Server() {
    //    try {
    //        Server server = Server.createTcpServer("-tcpPort", "9092", "-tcpAllowOthers", "-ifNotExists").start();
    //    } catch (SQLException e) {
    //        throw new RuntimeException("Failed to start H2 server: ", e);
    //    }
    //}
}
