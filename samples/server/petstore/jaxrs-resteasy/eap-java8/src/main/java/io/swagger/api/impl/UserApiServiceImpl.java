package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;


import java.util.List;
import io.swagger.model.User;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;


public class UserApiServiceImpl implements UserApi {
      public Response createUser(User user,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response createUsersWithArrayInput(List<User> user,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response createUsersWithListInput(List<User> user,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response deleteUser(String username,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getUserByName(String username,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response loginUser(String username,String password,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response logoutUser(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response updateUser(String username,User user,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
