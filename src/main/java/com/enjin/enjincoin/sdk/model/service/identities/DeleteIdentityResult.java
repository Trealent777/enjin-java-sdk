package com.enjin.enjincoin.sdk.model.service.identities;

import com.google.gson.annotations.SerializedName;

public class DeleteIdentityResult {

    @SerializedName("DeleteEnjinIdentity")
    private Identity identity;

    public Identity getIdentity() {
        return this.identity;
    }
}