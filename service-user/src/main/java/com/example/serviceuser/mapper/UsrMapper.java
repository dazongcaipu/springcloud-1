package com.example.serviceuser.mapper;

import java.util.List;

import com.example.serviceuser.model.entity.Usr;
import com.example.serviceuser.model.entity.UsrExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface UsrMapper {
    long countByExample(UsrExample example);

    int deleteByExample(UsrExample example);

    int insert(Usr record);

    int insertSelective(Usr record);

    List<Usr> selectByExample(UsrExample example);

    int updateByExampleSelective(@Param("record") Usr record, @Param("example") UsrExample example);

    int updateByExample(@Param("record") Usr record, @Param("example") UsrExample example);
}