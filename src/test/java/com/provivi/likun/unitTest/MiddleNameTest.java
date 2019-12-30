package com.provivi.likun.unitTest;


import com.provivi.likun.entity.MiddleName;
import com.provivi.likun.service.MiddleNameService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;


@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class MiddleNameTest {

    @Autowired
    MiddleNameService middleNameService;

    @Test
    public void getOneMiddleNameTest() throws Exception {
        MiddleName obj = middleNameService.getOneMiddleName();
        Assert.assertNotNull(obj);
    }
}
