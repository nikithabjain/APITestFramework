package com.r3.Tests;

import com.google.gson.Gson;
import com.r3.DataProviders.USDRatesDP;
import com.r3.Models.USDRateResponse;
import com.r3.Utils.APIUtil;
import com.r3.Utils.SystemArgs;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class USDRatesTest {

    Gson gson = new Gson();
    @Test(dataProvider = "ratesTest", dataProviderClass = USDRatesDP.class)
    public void usdRatesTest(String testCase){
        //This statement can be replaced for LOG.Info
        System.out.println("Running...."+testCase);
        try {
            HttpResponse httpResponse = APIUtil.httpGet(SystemArgs.getRates);
            //Checking if response is 200
            Assert.assertEquals(200,httpResponse.getStatusLine().getStatusCode(),"Did not recieve 200");
            HttpEntity entity = httpResponse.getEntity();
            String res = EntityUtils.toString(entity);
            System.out.println(res);//replace with log
            USDRateResponse response = gson.fromJson(res,USDRateResponse.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
