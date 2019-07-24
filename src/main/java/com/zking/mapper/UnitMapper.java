package com.zking.mapper;

import com.zking.model.Unit;

import java.util.List;

public interface UnitMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(Unit record);

    int insertSelective(Unit record);

    Unit selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(Unit record);

    int updateByPrimaryKey(Unit record);

    List<Unit> queryAllUnit();
}