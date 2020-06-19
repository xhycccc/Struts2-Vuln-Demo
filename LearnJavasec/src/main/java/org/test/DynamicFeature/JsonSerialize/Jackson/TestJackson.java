package org.test.DynamicFeature.JsonSerialize.Jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.test.DynamicFeature.Expresstion.OGNL.User;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestJackson {
    public static void main(String[] args) throws IOException {
        //使用databind需要定义一个最基础的ObjectMapper对象
        ObjectMapper mapper = new ObjectMapper();

        User user = new User();
        user.setUsername("Vincent");
        user.setAge(25);
        user.setPassword("23333");

        //serialize
        String jsonString = mapper.writeValueAsString(user);
        System.out.println(jsonString);

        //unserialize
        System.out.println(mapper.readValue(jsonString, User.class));
    }
}