package dev.ottbot.centralrelay.client;

import dev.ottbot.centralrelay.ApiClient;
import dev.ottbot.centralrelay.EncodingUtils;
import dev.ottbot.centralrelay.model.ApiResponse;

import dev.ottbot.centralrelay.model.UserMeInputView;
import dev.ottbot.centralrelay.model.UserMeView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-22T15:30:33.297029192Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public interface MeControllerApi extends ApiClient.Api {


  /**
   * 
   * 
   * @return UserMeView
   */
  @RequestLine("GET /data/users/me")
  @Headers({
    "Accept: */*",
  })
  UserMeView getMe();

  /**
   * 
   * Similar to <code>getMe</code> but it also returns the http response headers .
   * 
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /data/users/me")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<UserMeView> getMeWithHttpInfo();



  /**
   * 
   * 
   * @param userMeInputView  (required)
   * @return UserMeView
   */
  @RequestLine("PUT /data/users/me")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  UserMeView getMe1(UserMeInputView userMeInputView);

  /**
   * 
   * Similar to <code>getMe1</code> but it also returns the http response headers .
   * 
   * @param userMeInputView  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /data/users/me")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<UserMeView> getMe1WithHttpInfo(UserMeInputView userMeInputView);


}
