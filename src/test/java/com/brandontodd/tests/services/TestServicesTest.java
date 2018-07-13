package com.brandontodd.tests.services;

import com.brandontodd.tests.configuration.TestConfigurations;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { TestConfigurations.class, TestServices.class })
public class TestServicesTest {

    @Autowired
    private TestServices TestServices;

    @org.junit.Test
    public void testConfiguration() {
        Assert.assertEquals(TestServices.getTestConfiguration(), Integer.valueOf(0));
    }
}