/*******************************************************************************
 * Copyright (c) 2021 Eurotech and/or its affiliates and others
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Eurotech
 ******************************************************************************/
package org.eclipse.kura.system;

public class SystemResourceInfo {

    private String name;
    private String version;
    private SystemResourceType type;

    public SystemResourceInfo(String name) {
        super();
        this.name = name;
    }

    public SystemResourceInfo(String name, String version, String type) {
        this(name);
        this.version = version;
        this.type = SystemResourceType.valueOf(type);
    }

    public SystemResourceInfo(String name, String version, SystemResourceType type) {
        this(name);
        this.version = version;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public SystemResourceType getType() {
        return type;
    }

    public void setType(SystemResourceType type) {
        this.type = type;
    }

    public String getTypeString() {
        return type.toString();
    }

    public void setType(String type) {
        this.type = SystemResourceType.valueOf(type);
    }
}
