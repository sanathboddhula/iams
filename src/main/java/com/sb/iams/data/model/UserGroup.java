package com.sb.iams.data.model;

import lombok.Data;

import java.util.List;

@Data
public class UserGroup {
    private String groupName;
    private String groupDescription;
    private List<Role> roles;
}
