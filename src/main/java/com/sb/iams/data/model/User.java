package com.sb.iams.data.model;

import java.util.List;

public class User {

    private String userId;
    private String password;
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private List<UserGroup> userGroups;
    private List<Role> roles;
}
