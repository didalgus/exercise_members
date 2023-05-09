package com.example.exercise.mapper;

import com.example.exercise.vo.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface MemberMapper {

    @Select("SELECT * FROM members")
    List<Member> findByAll();
}
