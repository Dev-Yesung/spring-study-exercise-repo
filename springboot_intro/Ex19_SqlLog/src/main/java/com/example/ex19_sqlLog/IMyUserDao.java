package com.example.ex19_sqlLog;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IMyUserDao {

    List<MyUserDTO> list();
}
