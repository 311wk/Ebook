package com.qf;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * cwy 2019/7/19 22:05
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:applicationContext-mapper.xml",
        "classpath:applicationContext-service.xml"
})
public class AcTests {

}
