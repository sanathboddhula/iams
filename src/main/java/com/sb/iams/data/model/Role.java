package com.sb.iams.data.model;

import lombok.Data;

import java.util.List;

@Data
public class Role {
    private String roleName;

    private List<Policy> policies;
}
