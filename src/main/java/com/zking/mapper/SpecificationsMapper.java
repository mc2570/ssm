package com.zking.mapper;

import com.zking.model.Specifications;

public interface SpecificationsMapper {
    int deleteByPrimaryKey(Integer spid);

    int insert(Specifications record);

    int insertSelective(Specifications record);

    Specifications selectByPrimaryKey(Integer spid);

    int updateByPrimaryKeySelective(Specifications record);

    int updateByPrimaryKey(Specifications record);
}