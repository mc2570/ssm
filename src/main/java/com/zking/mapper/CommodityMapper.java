package com.zking.mapper;

import com.zking.model.Commodity;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface CommodityMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Commodity record);

    int insertSelective(Commodity record);

    Commodity selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Commodity record);

    int updateByPrimaryKey(Commodity record);

    List<Commodity> queryAllCommoditys(@Param("pageIndex") Integer pageIndex, @Param("pageSize") Integer pageSize,@Param("pageQuery") String pageQuery,@Param("pageType") String pageType,@Param("pageCstatus") String pageCstatus );

    int queryAllCounts(@Param("pageQuery") String pageQuery,@Param("pageType") String pageType,@Param("pageCstatus") String pageCstatus);

    Commodity queryOneCommodity(Integer cid);

    void updateCommodity(@Param("commodity") Commodity commodity);
}