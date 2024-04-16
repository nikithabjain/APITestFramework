package com.r3.Utils;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.http.HttpClient;

public class APIUtil {
    /* this method can be used for creating a closeable client with certificates for different hosts etc*/
    public static CloseableHttpClient getHttpClient(){
        return HttpClients.createDefault();
    }

    /* this method can be used for using httpGet calls, along with url Headers can also be passed in the params */
    public static HttpResponse httpGet(String url) throws IOException {
        HttpGet httpGet = new HttpGet(url);
        //set header here if needed
        HttpResponse httpResponse = null;
        try{
            httpResponse=getHttpClient().execute(httpGet);
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return httpResponse;
    }
    /* other http methods can be added in this class */
}

