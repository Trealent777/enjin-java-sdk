package com.enjin.enjincoin.sdk.service.ethereum.impl;

import com.enjin.enjincoin.sdk.graphql.GraphQLRequest;
import com.enjin.enjincoin.sdk.graphql.GraphQLResponse;
import com.enjin.enjincoin.sdk.graphql.GraphQuery;
import com.enjin.enjincoin.sdk.model.service.ethereum.Block;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

import java.math.BigInteger;

public interface EthereumRetrofitService {

    @POST("graphql")
    @GraphQuery("GetBlockHeight")
    @Headers("Content-Type: application/json")
    Call<GraphQLResponse<Block>> getBlock(@Body GraphQLRequest request);

}
