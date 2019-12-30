package com.provivi.likun.unitTest;

import com.provivi.likun.entity.FirstName;
import com.provivi.likun.service.FirstNameService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.AssertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class FirstNameTest {

    @Autowired
    FirstNameService firstNameService;

    @Test
    public void getOneFirstNameTest() throws Exception {
        FirstName obj = firstNameService.getOneFirstName();
        Assert.assertNotNull(obj);
    }

}
