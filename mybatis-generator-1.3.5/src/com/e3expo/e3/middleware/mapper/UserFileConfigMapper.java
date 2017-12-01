package com.e3expo.e3.middleware.mapper;

import com.e3expo.e3.model.UserFileConfig;

public interface UserFileConfigMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserFileConfig record);

    int insertSelective(UserFileConfig record);

    UserFileConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserFileConfig record);

    int updateByPrimaryKey(UserFileConfig record);
}