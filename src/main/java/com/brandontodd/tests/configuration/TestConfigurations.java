package com.brandontodd.tests.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfigurations {

    @Value("${TEST_VALUE:0}")
    private Integer testValue;

    public Integer getTestValue() {
        return testValue;
    }

    public void setTestValue(Integer testValue) {
        this.testValue = testValue;
    }
}
