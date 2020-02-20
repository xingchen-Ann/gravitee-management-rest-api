/**
 * Copyright (C) 2015 The Gravitee team (http://gravitee.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gravitee.rest.api.model.permissions;

/**
 * @author Nicolas GERAUD (nicolas.geraud at graviteesource.com) 
 * @author GraviteeSource Team
 */
public enum PortalPermission implements Permission {
    METADATA(     "METADATA",      1000),
    DOCUMENTATION("DOCUMENTATION", 1100),
    APPLICATION(  "APPLICATION",   1200),
    VIEW(         "VIEW",          1300),
    TOP_APIS(     "TOP_APIS",      1400),
    SETTINGS(     "SETTINGS",      1500),
    API_HEADER(   "API_HEADER",    1600),
    IDENTITY_PROVIDER("IDENTITY_PROVIDER",   1700),
    CLIENT_REGISTRATION_PROVIDER("CLIENT_REGISTRATION_PROVIDER",   1800),
    THEME("THEME",   1900);

    String name;
    int mask;

    PortalPermission(String name, int mask) {
        this.name = name;
        this.mask = mask;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getMask() {
        return mask;
    }

}
