package com.zking.base;

import com.zking.utils.BuildSQLUtils;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

import java.util.List;

public interface BaseDao<T> {
    @InsertProvider(type = BuildSQLUtils.class, method = "BuildSQLForInsert")
    void insert(T t);

    @DeleteProvider(type = BuildSQLUtils.class, method = "BuildSQLForDelete")
    void delete(T t, String basisName);

    @UpdateProvider(type = BuildSQLUtils.class, method = "BuildSQLForUpdate")
    void update(T t, String basisName);

    @SelectProvider(type = BuildSQLUtils.class, method = "BuildSQLForQueryList")
    List<T> queryList(BaseEntity entity, Integer begin, Integer end);


}
