package com.enjin.sdk.schemas.shared.fragments.inputs;

import com.google.gson.annotations.SerializedName;

/**
 * TODO
 * @see BalanceFragmentArguments
 */
public enum TokenIdFormat {

    @SerializedName("hex64")
    HEX64,
    @SerializedName("hex256")
    HEX256,
    @SerializedName("uint256")
    UINT256

}