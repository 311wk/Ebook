package com.qf.mapper;

import com.qf.pojo.EbookEntry;

import java.util.List;

/**
 * cwy 2019/7/19 21:28
 **/
public interface EbookMapper {

    //展示图书列表
    List<EbookEntry> findAll();

    //根据分类查询图书列表
    List<EbookEntry> findByName(Integer id);

    //按照entry删除书
    Integer delete(Integer id);
}
