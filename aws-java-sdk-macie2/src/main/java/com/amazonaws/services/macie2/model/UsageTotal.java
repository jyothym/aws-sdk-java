/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides aggregated data for a usage metric. The value for the metric reports usage data for an account during the
 * past 30 days.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UsageTotal" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UsageTotal implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of currency that the value for the metric (estimatedCost) is reported in.
     * </p>
     */
    private String currency;
    /**
     * <p>
     * The estimated value for the metric.
     * </p>
     */
    private String estimatedCost;
    /**
     * <p>
     * The name of the metric. Possible values are: DATA_INVENTORY_EVALUATION, for monitoring S3 buckets; and,
     * SENSITIVE_DATA_DISCOVERY, for analyzing sensitive data.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The type of currency that the value for the metric (estimatedCost) is reported in.
     * </p>
     * 
     * @param currency
     *        The type of currency that the value for the metric (estimatedCost) is reported in.
     * @see Currency
     */

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * <p>
     * The type of currency that the value for the metric (estimatedCost) is reported in.
     * </p>
     * 
     * @return The type of currency that the value for the metric (estimatedCost) is reported in.
     * @see Currency
     */

    public String getCurrency() {
        return this.currency;
    }

    /**
     * <p>
     * The type of currency that the value for the metric (estimatedCost) is reported in.
     * </p>
     * 
     * @param currency
     *        The type of currency that the value for the metric (estimatedCost) is reported in.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Currency
     */

    public UsageTotal withCurrency(String currency) {
        setCurrency(currency);
        return this;
    }

    /**
     * <p>
     * The type of currency that the value for the metric (estimatedCost) is reported in.
     * </p>
     * 
     * @param currency
     *        The type of currency that the value for the metric (estimatedCost) is reported in.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Currency
     */

    public UsageTotal withCurrency(Currency currency) {
        this.currency = currency.toString();
        return this;
    }

    /**
     * <p>
     * The estimated value for the metric.
     * </p>
     * 
     * @param estimatedCost
     *        The estimated value for the metric.
     */

    public void setEstimatedCost(String estimatedCost) {
        this.estimatedCost = estimatedCost;
    }

    /**
     * <p>
     * The estimated value for the metric.
     * </p>
     * 
     * @return The estimated value for the metric.
     */

    public String getEstimatedCost() {
        return this.estimatedCost;
    }

    /**
     * <p>
     * The estimated value for the metric.
     * </p>
     * 
     * @param estimatedCost
     *        The estimated value for the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageTotal withEstimatedCost(String estimatedCost) {
        setEstimatedCost(estimatedCost);
        return this;
    }

    /**
     * <p>
     * The name of the metric. Possible values are: DATA_INVENTORY_EVALUATION, for monitoring S3 buckets; and,
     * SENSITIVE_DATA_DISCOVERY, for analyzing sensitive data.
     * </p>
     * 
     * @param type
     *        The name of the metric. Possible values are: DATA_INVENTORY_EVALUATION, for monitoring S3 buckets; and,
     *        SENSITIVE_DATA_DISCOVERY, for analyzing sensitive data.
     * @see UsageType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The name of the metric. Possible values are: DATA_INVENTORY_EVALUATION, for monitoring S3 buckets; and,
     * SENSITIVE_DATA_DISCOVERY, for analyzing sensitive data.
     * </p>
     * 
     * @return The name of the metric. Possible values are: DATA_INVENTORY_EVALUATION, for monitoring S3 buckets; and,
     *         SENSITIVE_DATA_DISCOVERY, for analyzing sensitive data.
     * @see UsageType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The name of the metric. Possible values are: DATA_INVENTORY_EVALUATION, for monitoring S3 buckets; and,
     * SENSITIVE_DATA_DISCOVERY, for analyzing sensitive data.
     * </p>
     * 
     * @param type
     *        The name of the metric. Possible values are: DATA_INVENTORY_EVALUATION, for monitoring S3 buckets; and,
     *        SENSITIVE_DATA_DISCOVERY, for analyzing sensitive data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageType
     */

    public UsageTotal withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The name of the metric. Possible values are: DATA_INVENTORY_EVALUATION, for monitoring S3 buckets; and,
     * SENSITIVE_DATA_DISCOVERY, for analyzing sensitive data.
     * </p>
     * 
     * @param type
     *        The name of the metric. Possible values are: DATA_INVENTORY_EVALUATION, for monitoring S3 buckets; and,
     *        SENSITIVE_DATA_DISCOVERY, for analyzing sensitive data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageType
     */

    public UsageTotal withType(UsageType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCurrency() != null)
            sb.append("Currency: ").append(getCurrency()).append(",");
        if (getEstimatedCost() != null)
            sb.append("EstimatedCost: ").append(getEstimatedCost()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UsageTotal == false)
            return false;
        UsageTotal other = (UsageTotal) obj;
        if (other.getCurrency() == null ^ this.getCurrency() == null)
            return false;
        if (other.getCurrency() != null && other.getCurrency().equals(this.getCurrency()) == false)
            return false;
        if (other.getEstimatedCost() == null ^ this.getEstimatedCost() == null)
            return false;
        if (other.getEstimatedCost() != null && other.getEstimatedCost().equals(this.getEstimatedCost()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        hashCode = prime * hashCode + ((getEstimatedCost() == null) ? 0 : getEstimatedCost().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public UsageTotal clone() {
        try {
            return (UsageTotal) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.UsageTotalMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
