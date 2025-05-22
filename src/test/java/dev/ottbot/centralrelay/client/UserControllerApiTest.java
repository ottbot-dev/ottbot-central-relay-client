package dev.ottbot.centralrelay.client;

import dev.ottbot.centralrelay.ApiClient;
import dev.ottbot.centralrelay.model.PageViewUserAdminView;
import dev.ottbot.centralrelay.model.Pageable;
import dev.ottbot.centralrelay.model.UserAdminInputView;
import dev.ottbot.centralrelay.model.UserAdminView;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserControllerApi
 */
class UserControllerApiTest {

    private UserControllerApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(UserControllerApi.class);
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    void createUserTest() {
        UserAdminInputView userAdminInputView = null;
        // UserAdminView response = api.createUser(userAdminInputView);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    void deleteUserTest() {
        String id = null;
        // api.deleteUser(id);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    void getUserTest() {
        String id = null;
        // UserAdminView response = api.getUser(id);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    void getUsersTest() {
        Pageable pageable = null;
        // PageViewUserAdminView response = api.getUsers(pageable);

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
    void getUsersTestQueryMap() {
        UserControllerApi.GetUsersQueryParams queryParams = new UserControllerApi.GetUsersQueryParams()
            .pageable(null);
        // PageViewUserAdminView response = api.getUsers(queryParams);

    // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    void updateUserTest() {
        String id = null;
        UserAdminInputView userAdminInputView = null;
        // UserAdminView response = api.updateUser(id, userAdminInputView);

        // TODO: test validations
    }

    
}
