package cn.zifangsky.mapper;

import cn.zifangsky.model.TestUsers;

public interface TestUsersMapper {
    int deleteByPrimaryKey(String userName);

    int insert(TestUsers record);

    int insertSelective(TestUsers record);

    TestUsers selectByPrimaryKey(String userName);

    int updateByPrimaryKeySelective(TestUsers record);

    int updateByPrimaryKey(TestUsers record);
}