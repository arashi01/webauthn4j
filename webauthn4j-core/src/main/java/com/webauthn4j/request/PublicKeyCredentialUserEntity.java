/*
 * Copyright 2002-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.webauthn4j.request;

public class PublicKeyCredentialUserEntity extends PublicKeyCredentialEntity {

    // ~ Instance fields
    // ================================================================================================

    private byte[] id;
    private String displayName;

    public PublicKeyCredentialUserEntity(byte[] id, String name, String displayName, String icon) {
        super(name, icon);
        this.id = id;
        this.displayName = displayName;
    }

    public PublicKeyCredentialUserEntity(byte[] id, String name, String displayName) {
        super(name);
        this.id = id;
        this.displayName = displayName;
    }

    public PublicKeyCredentialUserEntity() {
        super();
    }

    public byte[] getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }

}