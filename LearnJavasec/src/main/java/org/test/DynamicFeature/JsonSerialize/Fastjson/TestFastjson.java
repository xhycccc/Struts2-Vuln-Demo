package org.test.DynamicFeature.JsonSerialize.Fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.ParserConfig;

public class TestFastjson {
    public static void main(String[] args) {
        ParserConfig.getGlobalInstance().addAccept("org.test.DynamicFeature.JsonSerialize.Fastjson.User");
        String myJSON = "{\"@type\":\"org.test.DynamicFeature.JsonSerialize.Fastjson.User\", \"age\":25, \"username\":\"Vincent\", \"secret\":\"2333\"}";
        JSONObject u3 = JSON.parseObject(myJSON);
        System.out.println(u3.getClass().getName());
        System.out.println(u3.get("username"));
    }
}
