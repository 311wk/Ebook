package com.qf.service.impl;

import com.qf.AcTests;
import com.qf.pojo.EbookEntry;
import com.qf.service.EbookService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

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
}
