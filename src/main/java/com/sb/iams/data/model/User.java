package com.sb.iams.data.model;

import lombok.Data;

import java.util.List;

@Data
public class User {

    private String userId;
    private String password;
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private List<UserGroup> userGroups;
    private List<Role> roles;

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder("User{" +
//                "userId='" + userId + '\'' +
//                ", password='" + password + '\'' +
//                ", firstName='" + firstName + '\'' +
//                ", middleName='" + middleName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", email='" + email + '\'' +
//                ", userGroups=" + userGroups +
//                ", roles=" + roles +
//                '}');
//
//
////        if (userGroups != null) {
////            sb.append("\n");
////            for (UserGroup userGroup : userGroups
////            ) {
////                sb.append(userGroup.toString());
////            }
////        }
////
////        if (roles != null) {
////            sb.append("\n");
////            for (Role role : roles
////            ) {
////                sb.append(role.toString());
////            }
////        }
//        return sb.toString();
//    }
}
