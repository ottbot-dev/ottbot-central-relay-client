package dev.ottbot.centralrelay.client;

import dev.ottbot.centralrelay.ApiClient;
import dev.ottbot.centralrelay.EncodingUtils;
import dev.ottbot.centralrelay.model.ApiResponse;

import dev.ottbot.centralrelay.model.PageViewUserAdminView;
import dev.ottbot.centralrelay.model.Pageable;
import dev.ottbot.centralrelay.model.UserAdminInputView;
import dev.ottbot.centralrelay.model.UserAdminView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-22T15:30:33.297029192Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public interface UserControllerApi extends ApiClient.Api {


  /**
   * 
   * 
   * @param userAdminInputView  (required)
   * @return UserAdminView
   */
  @RequestLine("POST /admin/users")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  UserAdminView createUser(UserAdminInputView userAdminInputView);

  /**
   * 
   * Similar to <code>createUser</code> but it also returns the http response headers .
   * 
   * @param userAdminInputView  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /admin/users")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<UserAdminView> createUserWithHttpInfo(UserAdminInputView userAdminInputView);



  /**
   * 
   * 
   * @param id  (required)
   */
  @RequestLine("DELETE /admin/users/{id}")
  @Headers({
    "Accept: application/json",
  })
  void deleteUser(@Param("id") String id);

  /**
   * 
   * Similar to <code>deleteUser</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   */
  @RequestLine("DELETE /admin/users/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteUserWithHttpInfo(@Param("id") String id);



  /**
   * 
   * 
   * @param id  (required)
   * @return UserAdminView
   */
  @RequestLine("GET /admin/users/{id}")
  @Headers({
    "Accept: */*",
  })
  UserAdminView getUser(@Param("id") String id);

  /**
   * 
   * Similar to <code>getUser</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /admin/users/{id}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<UserAdminView> getUserWithHttpInfo(@Param("id") String id);



  /**
   * 
   * 
   * @param pageable  (required)
   * @return PageViewUserAdminView
   */
  @RequestLine("GET /admin/users?pageable={pageable}")
  @Headers({
    "Accept: */*",
  })
  PageViewUserAdminView getUsers(@Param("pageable") Pageable pageable);

  /**
   * 
   * Similar to <code>getUsers</code> but it also returns the http response headers .
   * 
   * @param pageable  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /admin/users?pageable={pageable}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<PageViewUserAdminView> getUsersWithHttpInfo(@Param("pageable") Pageable pageable);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>getUsers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetUsersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>pageable -  (required)</li>
   *   </ul>
   * @return PageViewUserAdminView
   */
  @RequestLine("GET /admin/users?pageable={pageable}")
  @Headers({
  "Accept: */*",
  })
  PageViewUserAdminView getUsers(@QueryMap(encoded=true) GetUsersQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>getUsers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>pageable -  (required)</li>
      *   </ul>
          * @return PageViewUserAdminView
      */
      @RequestLine("GET /admin/users?pageable={pageable}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<PageViewUserAdminView> getUsersWithHttpInfo(@QueryMap(encoded=true) GetUsersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getUsers</code> method in a fluent style.
   */
  public static class GetUsersQueryParams extends HashMap<String, Object> {
    public GetUsersQueryParams pageable(final Pageable value) {
      put("pageable", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param id  (required)
   * @param userAdminInputView  (required)
   * @return UserAdminView
   */
  @RequestLine("PUT /admin/users/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  UserAdminView updateUser(@Param("id") String id, UserAdminInputView userAdminInputView);

  /**
   * 
   * Similar to <code>updateUser</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @param userAdminInputView  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /admin/users/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<UserAdminView> updateUserWithHttpInfo(@Param("id") String id, UserAdminInputView userAdminInputView);


}
