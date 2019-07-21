package com.qf.mapper;

import com.qf.AcTests;
import com.qf.pojo.EbookEntry;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * cwy 2019/7/19 22:04
 **/

public class EbookMapperTest extends AcTests {


    @Autowired
    private EbookMapper ebookMapper;


    @Test
    public void findAll() {
        List<EbookEntry> list = ebookMapper.findAll();
        System.out.println(list);

    }

    @Test
    @Transactional
    public void delete(){
        Integer count = ebookMapper.delete(3);
        Assert.assertEquals(new Integer(1), count);
    }

    @Test
    @Transactional
    public void update(){
        EbookEntry ebookEntry = new EbookEntry();
        ebookEntry.setId(2);
        ebookEntry.setCategoryId(2);
        ebookEntry.setSummary("飞翔牛逼");
        Integer count = ebookMapper.update(ebookEntry);

        Assert.assertEquals(new Integer(1), count);
    }

    @Test
    @Transactional
    public void add(){
        EbookEntry ebookEntry = new EbookEntry();
        ebookEntry.setCategoryId(1);
        ebookEntry.setTitle("光头强");
        ebookEntry.setSummary("光头强又来砍树了");
        ebookEntry.setCreatedate(new Date());
        Integer count = ebookMapper.add(ebookEntry);
        Assert.assertEquals(new Integer(1),count);
    }
}
