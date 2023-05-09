package com.example.exercise;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan(basePackageClasses = ExerciseMembersApplication.class)
@MapperScan("com.example.exercise")
public class ExerciseMembersApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExerciseMembersApplication.class, args);
    }

}