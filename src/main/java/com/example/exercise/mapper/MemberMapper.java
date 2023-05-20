package com.example.exercise.mapper;

import com.example.exercise.dto.JoinDto;
import com.example.exercise.dto.LoginDto;
import com.example.exercise.vo.Member;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MemberMapper {

    @Select("SELECT * FROM members")
    List<Member> findByAll();

    @Insert("INSERT INTO members (member_id, member_name, member_password) VALUES (#{memberId}, #{memberName}, #{memberPassword})")
    boolean insertMember(JoinDto joinDto);

    @Select("SELECT * FROM members WHERE member_id = #{memberId}")
    Member findById(LoginDto loginDto);

    @Delete("DELETE FROM members WHERE member_id = #{memberId}")
    boolean deleteMember(String memberId);
}
