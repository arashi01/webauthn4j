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

package com.webauthn4j.test.authenticator.u2f.exception;

import com.webauthn4j.util.WIP;

@WIP
public class FIDOU2FException extends RuntimeException {

    public FIDOU2FException(String message, Throwable cause) {
        super(message, cause);
    }

    public FIDOU2FException(Throwable cause) {
        super(cause);
    }

    public FIDOU2FException(String message) {
        super(message);
    }
}
