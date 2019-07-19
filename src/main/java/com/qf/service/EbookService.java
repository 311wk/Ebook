package com.qf.service;

import com.qf.pojo.EbookEntry;

import java.util.List;

/**
 * cwy 2019/7/19 22:09
 **/

public interface EbookService {

    //查询所有的信息
    List<EbookEntry> findAll();
}
