package com.zking.mapper;

import com.zking.model.Cstatus;

import java.util.List;

public interface CstatusMapper {
    int deleteByPrimaryKey(Integer csid);

    int insert(Cstatus record);

    int insertSelective(Cstatus record);

    Cstatus selectByPrimaryKey(Integer csid);

    int updateByPrimaryKeySelective(Cstatus record);

    int updateByPrimaryKey(Cstatus record);

    List<Cstatus> queryAllCstatus();

    List<Cstatus> queryNoAll();
}