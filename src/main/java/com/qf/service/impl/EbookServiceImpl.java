package com.qf.service.impl;

import com.qf.mapper.EbookMapper;
import com.qf.pojo.EbookEntry;
import com.qf.service.EbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * cwy 2019/7/19 22:10
 **/
@Service
public class EbookServiceImpl implements EbookService {

    @Autowired
    private EbookMapper ebookMapper;


    @Override
    public List<EbookEntry> findAll() {

        return ebookMapper.findAll();
    }

    @Override
    public Integer delete(Integer id) {
        return ebookMapper.delete(id);
    }

    @Override
    public Integer updateById(EbookEntry ebookEntry) {
        return ebookMapper.update(ebookEntry);
    }

    @Override
    public Integer add(EbookEntry ebookEntry) {
        return ebookMapper.add(ebookEntry);
    }
}
