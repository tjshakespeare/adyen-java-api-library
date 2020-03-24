/*
 *                       ######
 *                       ######
 * ############    ####( ######  #####. ######  ############   ############
 * #############  #####( ######  #####. ######  #############  #############
 *        ######  #####( ######  #####. ######  #####  ######  #####  ######
 * ###### ######  #####( ######  #####. ######  #####  #####   #####  ######
 * ###### ######  #####( ######  #####. ######  #####          #####  ######
 * #############  #############  #############  #############  #####  ######
 *  ############   ############  #############   ############  #####  ######
 *                                      ######
 *                               #############
 *                               ############
 *
 * Adyen Java API Library
 *
 * Copyright (c) 2020 Adyen B.V.
 * This file is open source and available under the MIT license.
 * See the LICENSE file for more info.
 */

package com.adyen.model.checkout.paymentMethodDetails;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * DragonpayDetails
 */

public class DragonpayDetails extends GenericIssuerPaymentMethodDetails {

    @SerializedName("shopperEmail")
    private String shopperEmail = null;

    public DragonpayDetails() {
        this.type = "dragonpay";
    }

    public DragonpayDetails issuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    public DragonpayDetails shopperEmail(String shopperEmail) {
        this.shopperEmail = shopperEmail;
        return this;
    }

    /**
     * The shopper’s email address.
     *
     * @return shopperEmail
     **/
    public String getShopperEmail() {
        return shopperEmail;
    }

    public void setShopperEmail(String shopperEmail) {
        this.shopperEmail = shopperEmail;
    }

    public DragonpayDetails type(String type) {
        this.type = type;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DragonpayDetails dragonpayDetails = (DragonpayDetails) o;
        return Objects.equals(this.issuer, dragonpayDetails.issuer) &&
                Objects.equals(this.shopperEmail, dragonpayDetails.shopperEmail) &&
                Objects.equals(this.type, dragonpayDetails.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(issuer, shopperEmail, type);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DragonpayDetails {\n");

        sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
        sb.append("    shopperEmail: ").append(toIndentedString(shopperEmail)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
