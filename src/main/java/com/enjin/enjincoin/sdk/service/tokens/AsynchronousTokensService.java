package com.enjin.enjincoin.sdk.service.tokens;

import com.enjin.enjincoin.sdk.graphql.GraphQLResponse;
import com.enjin.enjincoin.sdk.model.service.tokens.CreateTokenResult;
import com.enjin.enjincoin.sdk.model.service.tokens.GetTokens;
import com.enjin.enjincoin.sdk.model.service.tokens.GetTokensResult;
import com.enjin.enjincoin.sdk.model.service.tokens.ImportToken;
import com.enjin.enjincoin.sdk.model.service.tokens.UpdateToken;
import com.enjin.enjincoin.sdk.model.service.tokens.UpdateTokenResult;
import com.enjin.enjincoin.sdk.http.Callback;

public interface AsynchronousTokensService {

    /**
     * @param callback
     */
    void getAllTokensAsync(Callback<GraphQLResponse<GetTokensResult>> callback);

    /**
     * @param query
     * @param callback
     */
    void getTokensAsync(GetTokens query,
                        Callback<GraphQLResponse<GetTokensResult>> callback);

    /**
     * @param query
     * @param callback
     */
    void importTokenAsync(ImportToken query,
                          Callback<GraphQLResponse<CreateTokenResult>> callback);

    /**
     * @param query
     * @param callback
     */
    void updateTokenAsync(UpdateToken query,
                          Callback<GraphQLResponse<UpdateTokenResult>> callback);

}