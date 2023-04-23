package com.example.ex18_mybatis_resultnum.dao;

import com.example.ex18_mybatis_resultnum.dto.SimpleBbsDto;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ISimpleBbsDao {

    public List<SimpleBbsDto> listDao();

    public SimpleBbsDto viewDao(String id);

    public int writeDao(Map<String, String> map);

    public int deleteDao(@Param("_id") String id);
    public int articleCount();
}
