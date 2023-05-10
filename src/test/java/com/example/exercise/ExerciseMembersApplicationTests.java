package com.example.exercise;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Slf4j
@RequiredArgsConstructor
@SpringBootTest
class ExerciseMembersApplicationTests {

//    private final DataSource dataSource;
//    private final JdbcTemplate jdbcTemplate;

    @Test
    void contextLoads() throws SQLException {
//        Connection connection = dataSource.getConnection();

//        log.info("DBCP : {}", dataSource.getClass());
//        log.info("Url : {}", connection.getMetaData().getURL());
//        log.info("userName : {}", connection.getMetaData().getUserName());

//        jdbcTemplate.execute("INSERT INTO members(member_id, member_name, member_password) VALUES ('member3id','member3name','1234')");
    }

}
