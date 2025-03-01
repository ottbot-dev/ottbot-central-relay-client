package dev.ottbot.centralrelay.client;

import dev.ottbot.centralrelay.ApiClient;
import dev.ottbot.centralrelay.model.OttbotReleaseView;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OttbotReleaseControllerApi
 */
class OttbotReleaseControllerApiTest {

    private OttbotReleaseControllerApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(OttbotReleaseControllerApi.class);
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    void getReleaseTest() {
        String id = null;
        // OttbotReleaseView response = api.getRelease(id);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    void getReleaseVersionTest() {
        String ottBotService = null;
        String channel = null;
        String version = null;
        // OttbotReleaseView response = api.getReleaseVersion(ottBotService, channel, version);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void getReleaseVersionTestQueryMap() {
        String ottBotService = null;
        String channel = null;
        OttbotReleaseControllerApi.GetReleaseVersionQueryParams queryParams = new OttbotReleaseControllerApi.GetReleaseVersionQueryParams()
            .version(null);
        // OttbotReleaseView response = api.getReleaseVersion(ottBotService, channel, queryParams);

    // TODO: test validations
    }
    
}
