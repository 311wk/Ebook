package com.qf.mapper;

import com.qf.AcTests;
import com.qf.pojo.EbookEntry;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

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
}
