package com.example.ex17_mybatis_param.dao;

import com.example.ex17_mybatis_param.dto.SimpleBbsDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ISimpleBbsDao {

    public List<SimpleBbsDto> listDao();

    public SimpleBbsDto viewDao(String id);

    public int writeDao(String writer, String title, String content);

    public int deleteDao(@Param("_id") String id);
}
