package com.example.ex15_mybatis;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IMyUserDao {
	List<MyUserDTO> list();
}
