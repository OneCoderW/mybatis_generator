package cn.zifangsky.mapper;

import cn.zifangsky.model.epay_card_bin;

public interface epay_card_binMapper {
    int deleteByPrimaryKey(Long id);

    int insert(epay_card_bin record);

    int insertSelective(epay_card_bin record);

    epay_card_bin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(epay_card_bin record);

    int updateByPrimaryKey(epay_card_bin record);
}