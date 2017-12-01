package com.e3expo.e3.middleware.mapper;

import com.e3expo.e3.model.RfpDetail;

public interface RfpDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RfpDetail record);

    int insertSelective(RfpDetail record);

    RfpDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RfpDetail record);

    int updateByPrimaryKey(RfpDetail record);
}