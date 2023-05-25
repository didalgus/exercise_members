# member_springboot2.7_h2

멤버 데이터를 Database에 저장, 암호화된 비밀번호로 로그인을 구현한다. 

## Spec.

- SpringBoot 2.7.11
- lombok 1.18.20
- Junit 5
- mockito 4.5.1
- mybaits 3.5.11
- H2 (Database) 2.1.2146
- thymeleaf 3.0.15


## APIs.

| type | url |
|---|---|
|main | http://localhost:8080/ |  
|가입 | http://localhost:8080/join/form|
|로그인 | http://localhost:8080/login/form |
|리스트 | http://localhost:8080/members/list |
## 암호화

HASH  
http://h2database.com/html/functions.html#hash

## H2 Database 

http://localhost:8080/h2-console

jdbc:h2:mem:membersdb

user : sa 
password : 


SELECT * FROM members

## mybatis

https://mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/