package com.train.dao;

import com.train.dao.entity.TrainClass;

public interface TrainClassMapper {
    int deleteByPrimaryKey(Integer classno);

    int insert(TrainClass record);

    int insertSelective(TrainClass record);

    TrainClass selectByPrimaryKey(Integer classno);

    int updateByPrimaryKeySelective(TrainClass record);

    int updateByPrimaryKey(TrainClass record);
}