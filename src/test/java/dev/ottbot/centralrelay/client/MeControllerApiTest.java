package dev.ottbot.centralrelay.client;

import dev.ottbot.centralrelay.ApiClient;
import dev.ottbot.centralrelay.model.UserMeView;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MeControllerApi
 */
class MeControllerApiTest {

    private MeControllerApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(MeControllerApi.class);
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    void getMeTest() {
        // UserMeView response = api.getMe();

        // TODO: test validations
    }

    
}
