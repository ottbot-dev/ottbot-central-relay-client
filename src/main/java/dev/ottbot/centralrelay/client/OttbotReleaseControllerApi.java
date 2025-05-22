package dev.ottbot.centralrelay.client;

import dev.ottbot.centralrelay.ApiClient;
import dev.ottbot.centralrelay.EncodingUtils;
import dev.ottbot.centralrelay.model.ApiResponse;

import dev.ottbot.centralrelay.model.OttbotReleaseView;
import dev.ottbot.centralrelay.model.PageViewOttbotReleaseView;
import dev.ottbot.centralrelay.model.Pageable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-22T15:30:33.297029192Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public interface OttbotReleaseControllerApi extends ApiClient.Api {


  /**
   * 
   * 
   * @param ottbotReleaseView  (required)
   * @return OttbotReleaseView
   */
  @RequestLine("POST /admin/release")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  OttbotReleaseView createRelease(OttbotReleaseView ottbotReleaseView);

  /**
   * 
   * Similar to <code>createRelease</code> but it also returns the http response headers .
   * 
   * @param ottbotReleaseView  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /admin/release")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<OttbotReleaseView> createReleaseWithHttpInfo(OttbotReleaseView ottbotReleaseView);



  /**
   * 
   * 
   * @param id  (required)
   */
  @RequestLine("DELETE /admin/release/{id}")
  @Headers({
    "Accept: application/json",
  })
  void deleteRelease(@Param("id") String id);

  /**
   * 
   * Similar to <code>deleteRelease</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   */
  @RequestLine("DELETE /admin/release/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteReleaseWithHttpInfo(@Param("id") String id);



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

  /**
   * 
   * 
   * @param pageable  (required)
   * @return PageViewOttbotReleaseView
   */
  @RequestLine("GET /data/release?pageable={pageable}")
  @Headers({
    "Accept: */*",
  })
  PageViewOttbotReleaseView listReleases(@Param("pageable") Pageable pageable);

  /**
   * 
   * Similar to <code>listReleases</code> but it also returns the http response headers .
   * 
   * @param pageable  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /data/release?pageable={pageable}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<PageViewOttbotReleaseView> listReleasesWithHttpInfo(@Param("pageable") Pageable pageable);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>listReleases</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListReleasesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>pageable -  (required)</li>
   *   </ul>
   * @return PageViewOttbotReleaseView
   */
  @RequestLine("GET /data/release?pageable={pageable}")
  @Headers({
  "Accept: */*",
  })
  PageViewOttbotReleaseView listReleases(@QueryMap(encoded=true) ListReleasesQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>listReleases</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>pageable -  (required)</li>
      *   </ul>
          * @return PageViewOttbotReleaseView
      */
      @RequestLine("GET /data/release?pageable={pageable}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<PageViewOttbotReleaseView> listReleasesWithHttpInfo(@QueryMap(encoded=true) ListReleasesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listReleases</code> method in a fluent style.
   */
  public static class ListReleasesQueryParams extends HashMap<String, Object> {
    public ListReleasesQueryParams pageable(final Pageable value) {
      put("pageable", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param ottbotReleaseView  (required)
   * @return OttbotReleaseView
   */
  @RequestLine("PUT /admin/release")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  OttbotReleaseView updateRelease(OttbotReleaseView ottbotReleaseView);

  /**
   * 
   * Similar to <code>updateRelease</code> but it also returns the http response headers .
   * 
   * @param ottbotReleaseView  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /admin/release")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<OttbotReleaseView> updateReleaseWithHttpInfo(OttbotReleaseView ottbotReleaseView);


}
