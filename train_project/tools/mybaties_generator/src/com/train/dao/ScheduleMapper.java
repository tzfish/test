package com.train.dao;

import com.train.dao.entity.Schedule;

public interface ScheduleMapper {
    int deleteByPrimaryKey(Integer schdid);

    int insert(Schedule record);

    int insertSelective(Schedule record);

    Schedule selectByPrimaryKey(Integer schdid);

    int updateByPrimaryKeySelective(Schedule record);

    int updateByPrimaryKey(Schedule record);
}