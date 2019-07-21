package com.qf.service.impl;

import com.qf.AcTests;
import com.qf.pojo.EbookEntry;
import com.qf.service.EbookService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * cwy 2019/7/19 22:11
 **/

public class EbookServiceImplTest extends AcTests {

    @Autowired
    private EbookService ebookService;

    @Test
    public void findAll() {

        List<EbookEntry> list = ebookService.findAll();
        System.out.println(list);
    }

    @Test
    @Transactional
    public void delete(){

        Integer count = ebookService.delete(3);
        Assert.assertEquals(new Integer(1), count);

    }

    @Test
    @Transactional
    public void update(){
        EbookEntry ebookEntry = new EbookEntry();
        ebookEntry.setId(2);
        ebookEntry.setCategoryId(2);
        ebookEntry.setSummary("飞翔牛逼");
        Integer count = ebookService.updateById(ebookEntry);

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
        Integer count = ebookService.add(ebookEntry);
        Assert.assertEquals(new Integer(1),count);
    }
}
