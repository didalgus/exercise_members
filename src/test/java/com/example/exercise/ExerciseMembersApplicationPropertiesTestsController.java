package com.example.exercise;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class ExerciseMembersApplicationPropertiesTestsController {

    @Value("${spring.datasource.url}")
    private String databaseUrl;

    @Value("${spring.h2.console.path}")
    private String h2Console;

    @Value("${logging.level.root}")
    private String logging;


    @Test
    public void 어플리케이션실행시_초기화변수() {
        log.info("profiles : {}", databaseUrl);
        log.info("active : {}", h2Console);
        log.info("logging : {}", logging);
    }
}
