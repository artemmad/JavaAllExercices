package com.company.task17_18;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

public class main17_18 {

    public static class GetExample {
        OkHttpClient client = new OkHttpClient();

        String run(String url) throws IOException {
            Request request = new Request.Builder()
                    .url(url)
                    .build();

            Response response = client.newCall(request).execute();
                return response.body().string();
            }
        }

    public static void main(String[] args) throws IOException {
/*        First first = new First();
        first.check();
        Second second=new Second();
       second.check();
        Third third = new Third();
        third.check();
*/
        GetExample example = new GetExample();
        String response = example.run("https://yandex.ru/?win=183&clid=1985927");
        System.out.println(response);



    }
}
