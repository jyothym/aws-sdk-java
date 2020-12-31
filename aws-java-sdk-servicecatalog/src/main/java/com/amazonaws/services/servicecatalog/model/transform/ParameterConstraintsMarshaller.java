/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicecatalog.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.servicecatalog.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ParameterConstraintsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ParameterConstraintsMarshaller {

    private static final MarshallingInfo<List> ALLOWEDVALUES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AllowedValues").build();
    private static final MarshallingInfo<String> ALLOWEDPATTERN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllowedPattern").build();
    private static final MarshallingInfo<String> CONSTRAINTDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConstraintDescription").build();
    private static final MarshallingInfo<String> MAXLENGTH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MaxLength").build();
    private static final MarshallingInfo<String> MINLENGTH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MinLength").build();
    private static final MarshallingInfo<String> MAXVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MaxValue").build();
    private static final MarshallingInfo<String> MINVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MinValue").build();

    private static final ParameterConstraintsMarshaller instance = new ParameterConstraintsMarshaller();

    public static ParameterConstraintsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ParameterConstraints parameterConstraints, ProtocolMarshaller protocolMarshaller) {

        if (parameterConstraints == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(parameterConstraints.getAllowedValues(), ALLOWEDVALUES_BINDING);
            protocolMarshaller.marshall(parameterConstraints.getAllowedPattern(), ALLOWEDPATTERN_BINDING);
            protocolMarshaller.marshall(parameterConstraints.getConstraintDescription(), CONSTRAINTDESCRIPTION_BINDING);
            protocolMarshaller.marshall(parameterConstraints.getMaxLength(), MAXLENGTH_BINDING);
            protocolMarshaller.marshall(parameterConstraints.getMinLength(), MINLENGTH_BINDING);
            protocolMarshaller.marshall(parameterConstraints.getMaxValue(), MAXVALUE_BINDING);
            protocolMarshaller.marshall(parameterConstraints.getMinValue(), MINVALUE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
