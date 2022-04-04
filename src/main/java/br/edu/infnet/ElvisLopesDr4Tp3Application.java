package br.edu.infnet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ElvisLopesDr4Tp3Application {

    public static void main(String[] args) {
        SpringApplication.run(ElvisLopesDr4Tp3Application.class, args);
    }

}
