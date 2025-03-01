package dev.ottbot.centralrelay.client;

import dev.ottbot.centralrelay.ApiClient;
import dev.ottbot.centralrelay.EncodingUtils;
import dev.ottbot.centralrelay.model.ApiResponse;

import dev.ottbot.centralrelay.model.OttbotReleaseView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-01T20:07:32.319323780Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public interface OttbotReleaseControllerApi extends ApiClient.Api {


  /**
   * 
   * 
   * @param id  (required)
   * @return OttbotReleaseView
   */
  @RequestLine("GET /data/release/{id}")
  @Headers({
    "Accept: */*",
  })
  OttbotReleaseView getRelease(@Param("id") String id);

  /**
   * 
   * Similar to <code>getRelease</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /data/release/{id}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<OttbotReleaseView> getReleaseWithHttpInfo(@Param("id") String id);



  /**
   * 
   * 
   * @param ottBotService  (required)
   * @param channel  (required)
   * @param version  (optional)
   * @return OttbotReleaseView
   */
  @RequestLine("GET /data/release/{ottBotService}/{channel}?version={version}")
  @Headers({
    "Accept: */*",
  })
  OttbotReleaseView getReleaseVersion(@Param("ottBotService") String ottBotService, @Param("channel") String channel, @Param("version") String version);

  /**
   * 
   * Similar to <code>getReleaseVersion</code> but it also returns the http response headers .
   * 
   * @param ottBotService  (required)
   * @param channel  (required)
   * @param version  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /data/release/{ottBotService}/{channel}?version={version}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<OttbotReleaseView> getReleaseVersionWithHttpInfo(@Param("ottBotService") String ottBotService, @Param("channel") String channel, @Param("version") String version);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>getReleaseVersion</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetReleaseVersionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param ottBotService  (required)
   * @param channel  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>version -  (optional)</li>
   *   </ul>
   * @return OttbotReleaseView
   */
  @RequestLine("GET /data/release/{ottBotService}/{channel}?version={version}")
  @Headers({
  "Accept: */*",
  })
  OttbotReleaseView getReleaseVersion(@Param("ottBotService") String ottBotService, @Param("channel") String channel, @QueryMap(encoded=true) GetReleaseVersionQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>getReleaseVersion</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param ottBotService  (required)
              * @param channel  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>version -  (optional)</li>
      *   </ul>
          * @return OttbotReleaseView
      */
      @RequestLine("GET /data/release/{ottBotService}/{channel}?version={version}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<OttbotReleaseView> getReleaseVersionWithHttpInfo(@Param("ottBotService") String ottBotService, @Param("channel") String channel, @QueryMap(encoded=true) GetReleaseVersionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getReleaseVersion</code> method in a fluent style.
   */
  public static class GetReleaseVersionQueryParams extends HashMap<String, Object> {
    public GetReleaseVersionQueryParams version(final String value) {
      put("version", EncodingUtils.encode(value));
      return this;
    }
  }
}
