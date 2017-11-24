package com.e3expo.e3.middleware.mapper;

import com.e3expo.e3.model.DesignerWorkingYears;

public interface DesignerWorkingYearsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DesignerWorkingYears record);

    int insertSelective(DesignerWorkingYears record);

    DesignerWorkingYears selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DesignerWorkingYears record);

    int updateByPrimaryKey(DesignerWorkingYears record);
}