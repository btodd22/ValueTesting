package com.brandontodd.tests.services;

import com.brandontodd.tests.configuration.TestConfigurations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServices {

    @Autowired
    private TestConfigurations testConfigurations;

    public Integer getTestConfiguration() {
        return testConfigurations.getTestValue();
    }
}
