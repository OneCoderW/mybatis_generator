package cn.zifangsky.mapper;

import cn.zifangsky.model.epayCardBin;

public interface epayCardBinMapper {
    int deleteByPrimaryKey(Long id);

    int insert(epayCardBin record);

    int insertSelective(epayCardBin record);

    epayCardBin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(epayCardBin record);

    int updateByPrimaryKey(epayCardBin record);
}