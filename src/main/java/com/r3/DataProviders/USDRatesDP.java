package com.r3.DataProviders;

import org.testng.annotations.DataProvider;

public class USDRatesDP {
    //Different test data can be passed from here
    @DataProvider(name = "ratesTest")
    public Object[][] ratesTest(){
        return new Object[][]{
                {"1.Get rates from API and do the validations"},
        };
        }
    }

