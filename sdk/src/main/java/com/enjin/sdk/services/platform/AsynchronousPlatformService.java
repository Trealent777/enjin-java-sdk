package com.enjin.sdk.services.platform;

import com.enjin.sdk.graphql.GraphQLResponse;
import com.enjin.sdk.http.HttpCallback;
import com.enjin.sdk.models.platform.GasPrices;
import com.enjin.sdk.models.platform.GetGasPrice;
import com.enjin.sdk.models.platform.GetPlatform;
import com.enjin.sdk.models.platform.PlatformDetails;

/**
 * Asynchronous methods for querying the platform.
 *
 * @author Evan Lindsay
 */
public interface AsynchronousPlatformService {

    /**
     * Gets the platform details and settings.
     *
     * @param query    the query.
     * @param callback the callback.
     */
    void getPlatformAsync(GetPlatform query, HttpCallback<GraphQLResponse<PlatformDetails>> callback);

    /**
     * Gets the latest gas prices.
     *
     * @param query    the query.
     * @param callback the callback.
     */
    void getGasPriceAsync(GetGasPrice query, HttpCallback<GraphQLResponse<GasPrices>> callback);
}
