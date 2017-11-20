package com.train.dao;

import com.train.dao.entity.Family;

public interface FamilyMapper {
    int deleteByPrimaryKey(Integer famyid);

    int insert(Family record);

    int insertSelective(Family record);

    Family selectByPrimaryKey(Integer famyid);

    int updateByPrimaryKeySelective(Family record);

    int updateByPrimaryKey(Family record);
}