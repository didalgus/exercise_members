CREATE TABLE members(
                      seq bigint NOT NULL AUTO_INCREMENT COMMENT '일련번호',
                      member_id varchar(50) NOT NULL COMMENT '아이디',
                      member_name varchar(50) NOT NULL COMMENT '이름',
                      member_password varchar(80) NOT NULL COMMENT '비밀번호',
                      create_at datetime NOT NULL DEFAULT CURRENT_TIMESTAMP() COMMENT '생성일시',
                      PRIMARY KEY (seq)
);

INSERT INTO members(member_id, member_name, member_password) VALUES ('test', 'hong gil-dong', HASH('MD5', '1234'));
INSERT INTO members(member_id, member_name, member_password) VALUES ('delete_id', 'hong gil-dong2', HASH('MD5', '1234'));