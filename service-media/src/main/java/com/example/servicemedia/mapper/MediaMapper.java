package com.example.servicemedia.mapper;

import com.example.servicemedia.model.entity.Media;
import com.example.servicemedia.model.entity.MediaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface MediaMapper {
    long countByExample(MediaExample example);

    int deleteByExample(MediaExample example);

    int insert(Media record);

    int insertSelective(Media record);

    List<Media> selectByExampleWithBLOBs(MediaExample example);

    List<Media> selectByExample(MediaExample example);

    int updateByExampleSelective(@Param("record") Media record, @Param("example") MediaExample example);

    int updateByExampleWithBLOBs(@Param("record") Media record, @Param("example") MediaExample example);

    int updateByExample(@Param("record") Media record, @Param("example") MediaExample example);
}