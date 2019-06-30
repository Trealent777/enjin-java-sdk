package com.enjin.enjincoin.sdk.service.users;

import com.enjin.enjincoin.sdk.graphql.GraphQLResponse;
import com.enjin.enjincoin.sdk.model.service.users.AuthUser;
import com.enjin.enjincoin.sdk.model.service.users.CreateUser;
import com.enjin.enjincoin.sdk.model.service.users.GetUsers;
import com.enjin.enjincoin.sdk.http.HttpCallback;
import com.enjin.enjincoin.sdk.model.service.users.User;

import java.util.List;

/**
 * Asynchronous methods for querying and mutating users.
 *
 * @author Evan Lindsay
 */
public interface AsynchronousUsersService {

    /**
     * Gets users that match the query parameters.
     *
     * @param query    the query.
     * @param callback the callback.
     */
    void getUsersAsync(GetUsers query,
                       HttpCallback<GraphQLResponse<List<User>>> callback);

    /**
     * Creates a new user.
     *
     * @param query    the query.
     * @param callback the callback.
     */
    void createUserAsync(CreateUser query,
                         HttpCallback<GraphQLResponse<User>> callback);

    /**
     * Authenticates a user and returns the users access tokens.
     *
     * @param query    the query.
     * @param callback the callback.
     */
    void loginUserAsync(AuthUser query,
                        HttpCallback<GraphQLResponse<User>> callback);

}
