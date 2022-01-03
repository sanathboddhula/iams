package com.sb.iams;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sb.iams.data.model.Policy;
import com.sb.iams.data.model.Role;
import com.sb.iams.data.model.User;
import com.sb.iams.data.model.UserGroup;

import java.io.File;

public class PojoToJSONTest {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            //JSON String to Object
            //JSON file to Java object
            User obj = mapper.readValue(new File("src/main/resources/sample_jsons/User.json"), User.class);
            System.out.println(obj.toString());

            //Object to Json
            User user = new User();
            String jsonString = mapper.writeValueAsString(user);
            System.out.println(jsonString);

            UserGroup userGroup = new UserGroup();
            jsonString = mapper.writeValueAsString(userGroup);
            System.out.println(jsonString);

            Role role = new Role();
            jsonString = mapper.writeValueAsString(role);
            System.out.println(jsonString);

            Policy policy = new Policy();
            jsonString = mapper.writeValueAsString(policy);
            System.out.println(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
