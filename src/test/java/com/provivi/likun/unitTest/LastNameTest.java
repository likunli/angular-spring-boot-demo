package com.provivi.likun.unitTest;


import com.provivi.likun.entity.LastName;
import com.provivi.likun.service.LastNameService;
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
public class LastNameTest {

    @Autowired
    LastNameService lastNameService;

    @Test
    public void getOneLastNameTest() throws Exception {
        LastName obj = lastNameService.getOneLastName();
        Assert.assertNotNull(obj);
    }

}
