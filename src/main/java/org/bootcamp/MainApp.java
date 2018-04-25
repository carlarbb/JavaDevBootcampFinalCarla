package org.bootcamp;

import org.bootcamp.service.InsuranceCalculationResult;
import org.bootcamp.service.InsuranceCalculatorService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.applet.Main;

import java.util.List;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class MainApp {

    public static void main(String[] args) {
        System.out.println("Hello");
        SpringApplication.run(MainApp.class, args);
    }

}
