/*
 * Copyright 2021-Present Okta, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.okta.idx.sdk.api.model;

public class RecoverPasswordOptions {

    public RecoverPasswordOptions(String username, AuthenticatorType authenticatorType) {
        this.username = username;
        this.authenticatorType = authenticatorType;
    }

    private String username;

    private AuthenticatorType authenticatorType;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public AuthenticatorType getAuthenticatorType() {
        return authenticatorType;
    }

    public void setAuthenticatorType(AuthenticatorType authenticatorType) {
        this.authenticatorType = authenticatorType;
    }
}
