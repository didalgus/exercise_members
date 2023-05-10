CREATE TABLE members(
                        seq bigint NOT NULL AUTO_INCREMENT,
                        member_id varchar(50) NOT NULL,
                        member_name varchar(50) NOT NULL,
                        member_password varchar(80) NOT NULL,
                        create_at datetime NOT NULL DEFAULT CURRENT_TIMESTAMP(),
                        PRIMARY KEY (seq)
);

INSERT INTO members(member_id, member_name, member_password) VALUES ('member1id','member1name','1234');