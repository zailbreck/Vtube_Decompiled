/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.InvocationHandler
 *  org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
 */
package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface;

public interface WebMessageBoundaryInterface
extends FeatureFlagHolderBoundaryInterface {
    public String getData();

    public InvocationHandler[] getPorts();
}

