package ru.vlapin.experiments.demo9;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;

@SpringBootApplication
@ComponentScan(includeFilters = @Filter(Aspect.class))
public class Demo9Application {

  public static void main(String[] args) {
    SpringApplication.run(Demo9Application.class, args);
  }
}
