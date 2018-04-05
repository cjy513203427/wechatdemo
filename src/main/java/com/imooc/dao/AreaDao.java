package com.imooc.dao;

import com.imooc.entity.Area;

import java.util.List;

/**
 * Created by hasee on 2018/3/27.
 */
public interface AreaDao {
    /**
     * 列出区域列表
     * @return
     */
    List<Area> queryArea();

    /**
     * 根据Id列出具体区域
     * @param areaId
     * @return
     */
    Area queryAreaById(int areaId);
    int insertArea(Area area);
    int updateArea(Area area);
    int deleteArea(int areaId);
}
