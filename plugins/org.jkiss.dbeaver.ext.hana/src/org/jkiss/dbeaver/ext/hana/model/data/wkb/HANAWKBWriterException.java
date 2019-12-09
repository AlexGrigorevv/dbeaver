/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2019 DBeaver Corp and others
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
 *
 * Contributors:
 *    Stefan Uhrig - initial implementation
 */
package org.jkiss.dbeaver.ext.hana.model.data.wkb;

/**
 * Exception thrown if WKB writing fails.
 */
public class HANAWKBWriterException extends Exception {

    private static final long serialVersionUID = 1L;

    public HANAWKBWriterException(String message) {
        super(message);
    }

    public HANAWKBWriterException(Throwable cause) {
        super(cause);
    }

    public HANAWKBWriterException(String message, Throwable cause) {
        super(message, cause);
    }
}
