package com.zking.mapper;

import com.zking.model.Sstatus;

public interface SstatusMapper {
    int deleteByPrimaryKey(Integer ssid);

    int insert(Sstatus record);

    int insertSelective(Sstatus record);

    Sstatus selectByPrimaryKey(Integer ssid);

    int updateByPrimaryKeySelective(Sstatus record);

    int updateByPrimaryKey(Sstatus record);
}