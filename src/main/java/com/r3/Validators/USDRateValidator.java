package com.r3.Validators;

import com.r3.Models.USDRateResponse;
import org.testng.Assert;

public class USDRateValidator {
    public void rateValidator1(USDRateResponse response){
        //checking for the result
        Assert.assertEquals("success",response.getResult().toString().toLowerCase(),"Result did not match");
        //Checking for price range of AED
        double aedRate = response.getRates().get("AED");
        boolean inRange = aedRate>3.6 && aedRate<3.7;
        Assert.assertEquals(true,inRange, "AED Rate is not in expected range - "+aedRate);
        //Verifing 162 rates are returned
        Assert.assertEquals(162, response.getRates().size(),"Size is not as expected");
    }
}
