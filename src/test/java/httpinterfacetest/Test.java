package httpinterfacetest;
import org.apache.http.client.*;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import sun.net.www.http.HttpClient;

import java.io.IOException;
import java.net.URI;


public class Test {
    public static void main(String[] args) throws IOException {
        CloseableHttpClient client= HttpClients.createDefault();
        HttpGet httpGet=new HttpGet("http://localhost:8080/mobilePhone?model=iPhone+6S");
        CloseableHttpResponse response=null;
        try {
            response=client.execute(httpGet);
            String res= EntityUtils.toString(response.getEntity());
            System.out.println(res);

        } catch (Exception e) {
            e.printStackTrace();
        }
        //uri方式
        URI uri=null;
        try {
            uri=new URIBuilder().setScheme("http").setHost("localhost").setPort(8080).setPath("/mobilePhone").setParameter("model","iPhone 6S").build();

        }catch (Exception e){
            e.printStackTrace();
        }
        HttpGet httpGet1=new HttpGet(uri);
        CloseableHttpResponse response1=null;
        response1=client.execute(httpGet1);
        System.out.println(EntityUtils.toString(response1.getEntity()));



    }
}
