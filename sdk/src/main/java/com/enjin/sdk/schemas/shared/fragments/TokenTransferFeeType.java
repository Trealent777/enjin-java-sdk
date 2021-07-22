package com.enjin.sdk.schemas.shared.fragments;

/**
 * The transfer fee strategy type.
 *
 * @author Evan Lindsay
 * @see Token
 * @see TokenTransferFeeSettings
 */
public enum TokenTransferFeeType {

    NONE,
    PER_TRANSFER,
    PER_CRYPTO_ITEM,
    RATIO_CUT,
    RATIO_EXTRA

}
