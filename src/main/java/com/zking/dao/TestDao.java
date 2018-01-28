package com.zking.dao;

import com.zking.base.BaseDao;
import com.zking.entity.PersonEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TestDao extends BaseDao<PersonEntity> {



    public List<PersonEntity> getAll();

}
