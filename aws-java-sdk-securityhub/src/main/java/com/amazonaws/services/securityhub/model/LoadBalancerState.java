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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the state of the load balancer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/LoadBalancerState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoadBalancerState implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The state code. The initial state of the load balancer is provisioning.
     * </p>
     * <p>
     * After the load balancer is fully set up and ready to route traffic, its state is active.
     * </p>
     * <p>
     * If the load balancer could not be set up, its state is failed.
     * </p>
     */
    private String code;
    /**
     * <p>
     * A description of the state.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * The state code. The initial state of the load balancer is provisioning.
     * </p>
     * <p>
     * After the load balancer is fully set up and ready to route traffic, its state is active.
     * </p>
     * <p>
     * If the load balancer could not be set up, its state is failed.
     * </p>
     * 
     * @param code
     *        The state code. The initial state of the load balancer is provisioning.</p>
     *        <p>
     *        After the load balancer is fully set up and ready to route traffic, its state is active.
     *        </p>
     *        <p>
     *        If the load balancer could not be set up, its state is failed.
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The state code. The initial state of the load balancer is provisioning.
     * </p>
     * <p>
     * After the load balancer is fully set up and ready to route traffic, its state is active.
     * </p>
     * <p>
     * If the load balancer could not be set up, its state is failed.
     * </p>
     * 
     * @return The state code. The initial state of the load balancer is provisioning.</p>
     *         <p>
     *         After the load balancer is fully set up and ready to route traffic, its state is active.
     *         </p>
     *         <p>
     *         If the load balancer could not be set up, its state is failed.
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The state code. The initial state of the load balancer is provisioning.
     * </p>
     * <p>
     * After the load balancer is fully set up and ready to route traffic, its state is active.
     * </p>
     * <p>
     * If the load balancer could not be set up, its state is failed.
     * </p>
     * 
     * @param code
     *        The state code. The initial state of the load balancer is provisioning.</p>
     *        <p>
     *        After the load balancer is fully set up and ready to route traffic, its state is active.
     *        </p>
     *        <p>
     *        If the load balancer could not be set up, its state is failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerState withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * A description of the state.
     * </p>
     * 
     * @param reason
     *        A description of the state.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * A description of the state.
     * </p>
     * 
     * @return A description of the state.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * A description of the state.
     * </p>
     * 
     * @param reason
     *        A description of the state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerState withReason(String reason) {
        setReason(reason);
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
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoadBalancerState == false)
            return false;
        LoadBalancerState other = (LoadBalancerState) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public LoadBalancerState clone() {
        try {
            return (LoadBalancerState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.LoadBalancerStateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
