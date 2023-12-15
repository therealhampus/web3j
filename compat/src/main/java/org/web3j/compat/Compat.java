/*
 * Copyright 2023 Web3 Labs Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.web3j.compat;

/**
 * Provides compatibility methods to substitute those methods from Java SDK that are not supported
 * on Android.
 */
public final class Compat {
    private Compat() {}

    /** Ports {@link String#join(CharSequence, CharSequence...)}. */
    public static String join(CharSequence delimiter, CharSequence... elements) {
        if (elements.length == 0) {
            return "";
        }

        final StringBuilder sb = new StringBuilder(7 * elements.length);
        sb.append(elements[0]);
        for (int i = 1; i < elements.length; i++) {
            sb.append(delimiter);
            sb.append(elements[i]);
        }
        return sb.toString();
    }
}
