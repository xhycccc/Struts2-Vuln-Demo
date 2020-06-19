package org.test.DynamicFeature.JsonSerialize.Gson;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.test.DynamicFeature.JsonSerialize.Fastjson.User;

import java.io.IOException;

public class TesteGson {
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        User user = new User();
        user.setUsername("Vincent");
        user.setAge(25);
        user.setSecret("23333");

        String json = gson.toJson(user);
        System.out.println(json);

        Object obj = gson.fromJson(json, User.class);
        System.out.println(obj);

        Runtime rt = (Runtime)gson.fromJson("{}", java.lang.Runtime.class);
        rt.getRuntime().exec("calc");
    }
}
