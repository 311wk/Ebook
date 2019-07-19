package com.qf.mapper;

import com.qf.AcTests;
import com.qf.pojo.EbookEntry;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

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
}
