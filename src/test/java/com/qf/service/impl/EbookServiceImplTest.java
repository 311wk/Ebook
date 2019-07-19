package com.qf.service.impl;

import com.qf.AcTests;
import com.qf.pojo.EbookEntry;
import com.qf.service.EbookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

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
}
