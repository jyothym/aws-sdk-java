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
package com.amazonaws.services.cognitosync.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;

import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitosync.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.*;
import com.amazonaws.protocol.Protocol;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetIdentityPoolConfigurationRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetIdentityPoolConfigurationRequestProtocolMarshaller implements
        Marshaller<Request<GetIdentityPoolConfigurationRequest>, GetIdentityPoolConfigurationRequest> {

    private static final OperationInfo SDK_OPERATION_BINDING = OperationInfo.builder().protocol(Protocol.REST_JSON)
            .requestUri("/identitypools/{IdentityPoolId}/configuration").httpMethodName(HttpMethodName.GET).hasExplicitPayloadMember(false)
            .hasPayloadMembers(false).serviceName("AmazonCognitoSync").build();

    private final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory;

    public GetIdentityPoolConfigurationRequestProtocolMarshaller(com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<GetIdentityPoolConfigurationRequest> marshall(GetIdentityPoolConfigurationRequest getIdentityPoolConfigurationRequest) {

        if (getIdentityPoolConfigurationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            final ProtocolRequestMarshaller<GetIdentityPoolConfigurationRequest> protocolMarshaller = protocolFactory.createProtocolMarshaller(
                    SDK_OPERATION_BINDING, getIdentityPoolConfigurationRequest);

            protocolMarshaller.startMarshalling();
            GetIdentityPoolConfigurationRequestMarshaller.getInstance().marshall(getIdentityPoolConfigurationRequest, protocolMarshaller);
            return protocolMarshaller.finishMarshalling();
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
