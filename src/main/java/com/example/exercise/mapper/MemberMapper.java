package com.example.exercise.mapper;

import com.example.exercise.dto.JoinDto;
import com.example.exercise.dto.LoginDto;
import com.example.exercise.vo.MemberVO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MemberMapper {

    @Select("SELECT * FROM members")
    List<MemberVO> findByAll();

    @Insert("INSERT INTO members (member_id, member_name, member_password) VALUES (#{memberId}, #{memberName}, HASH('MD5',#{memberPassword}))")
    int insertMember(JoinDto joinDto);

    @Select("SELECT member_id, member_name, member_password FROM members WHERE member_id = #{memberId}")
    MemberVO findById(LoginDto loginDto);

    @Delete("DELETE FROM members WHERE member_id = #{memberId}")
    int deleteMember(String memberId);

    @Select("SELECT HASH('MD5', #{word}) AS hashWord")
    String selectHash(String word);
}
