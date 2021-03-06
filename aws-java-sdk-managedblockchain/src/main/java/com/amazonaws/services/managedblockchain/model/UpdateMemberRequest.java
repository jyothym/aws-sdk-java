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
package com.amazonaws.services.managedblockchain.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/UpdateMember" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateMemberRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the Managed Blockchain network to which the member belongs.
     * </p>
     */
    private String networkId;
    /**
     * <p>
     * The unique identifier of the member.
     * </p>
     */
    private String memberId;
    /**
     * <p>
     * Configuration properties for publishing to Amazon CloudWatch Logs.
     * </p>
     */
    private MemberLogPublishingConfiguration logPublishingConfiguration;

    /**
     * <p>
     * The unique identifier of the Managed Blockchain network to which the member belongs.
     * </p>
     * 
     * @param networkId
     *        The unique identifier of the Managed Blockchain network to which the member belongs.
     */

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    /**
     * <p>
     * The unique identifier of the Managed Blockchain network to which the member belongs.
     * </p>
     * 
     * @return The unique identifier of the Managed Blockchain network to which the member belongs.
     */

    public String getNetworkId() {
        return this.networkId;
    }

    /**
     * <p>
     * The unique identifier of the Managed Blockchain network to which the member belongs.
     * </p>
     * 
     * @param networkId
     *        The unique identifier of the Managed Blockchain network to which the member belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMemberRequest withNetworkId(String networkId) {
        setNetworkId(networkId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the member.
     * </p>
     * 
     * @param memberId
     *        The unique identifier of the member.
     */

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     * <p>
     * The unique identifier of the member.
     * </p>
     * 
     * @return The unique identifier of the member.
     */

    public String getMemberId() {
        return this.memberId;
    }

    /**
     * <p>
     * The unique identifier of the member.
     * </p>
     * 
     * @param memberId
     *        The unique identifier of the member.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMemberRequest withMemberId(String memberId) {
        setMemberId(memberId);
        return this;
    }

    /**
     * <p>
     * Configuration properties for publishing to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param logPublishingConfiguration
     *        Configuration properties for publishing to Amazon CloudWatch Logs.
     */

    public void setLogPublishingConfiguration(MemberLogPublishingConfiguration logPublishingConfiguration) {
        this.logPublishingConfiguration = logPublishingConfiguration;
    }

    /**
     * <p>
     * Configuration properties for publishing to Amazon CloudWatch Logs.
     * </p>
     * 
     * @return Configuration properties for publishing to Amazon CloudWatch Logs.
     */

    public MemberLogPublishingConfiguration getLogPublishingConfiguration() {
        return this.logPublishingConfiguration;
    }

    /**
     * <p>
     * Configuration properties for publishing to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param logPublishingConfiguration
     *        Configuration properties for publishing to Amazon CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMemberRequest withLogPublishingConfiguration(MemberLogPublishingConfiguration logPublishingConfiguration) {
        setLogPublishingConfiguration(logPublishingConfiguration);
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
        if (getNetworkId() != null)
            sb.append("NetworkId: ").append(getNetworkId()).append(",");
        if (getMemberId() != null)
            sb.append("MemberId: ").append(getMemberId()).append(",");
        if (getLogPublishingConfiguration() != null)
            sb.append("LogPublishingConfiguration: ").append(getLogPublishingConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateMemberRequest == false)
            return false;
        UpdateMemberRequest other = (UpdateMemberRequest) obj;
        if (other.getNetworkId() == null ^ this.getNetworkId() == null)
            return false;
        if (other.getNetworkId() != null && other.getNetworkId().equals(this.getNetworkId()) == false)
            return false;
        if (other.getMemberId() == null ^ this.getMemberId() == null)
            return false;
        if (other.getMemberId() != null && other.getMemberId().equals(this.getMemberId()) == false)
            return false;
        if (other.getLogPublishingConfiguration() == null ^ this.getLogPublishingConfiguration() == null)
            return false;
        if (other.getLogPublishingConfiguration() != null && other.getLogPublishingConfiguration().equals(this.getLogPublishingConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkId() == null) ? 0 : getNetworkId().hashCode());
        hashCode = prime * hashCode + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        hashCode = prime * hashCode + ((getLogPublishingConfiguration() == null) ? 0 : getLogPublishingConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateMemberRequest clone() {
        return (UpdateMemberRequest) super.clone();
    }

}
