package com.community.community.provider;

import com.community.community.dto.AccesstokecDTO;
import okhttp3.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class GithubProvider {
     public String getAccessToken(AccesstokecDTO accesstokecDTO){
         final MediaType JSON
                 = MediaType.get("application/json; charset=utf-8");

         OkHttpClient client = new OkHttpClient();


             RequestBody body = RequestBody.create(json, JSON);
             Request request = new Request.Builder()
                     .url("https://github.com/login/oauth/access_token")
                     .post(body)
                     .build();
             try (Response response = client.newCall(request).execute()) {
                 String string = response.body().string();
                 System.out.println(string);
                 return string;
             } catch (IOException e) {
                 e.printStackTrace();
             }
             return null;
         }
     }

