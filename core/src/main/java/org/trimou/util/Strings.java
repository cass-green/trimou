/*
 * Copyright 2013 Martin Kouba
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.trimou.util;

import org.trimou.annotations.Internal;

/**
 *
 * @author Martin Kouba
 */
@Internal
public final class Strings {

    public static final String EMPTY = "";

    public static final String GAP = " ";

    public static final String LINE_SEPARATOR = System
            .getProperty("line.separator");

    public static final String LINUX_LINE_SEPARATOR = "\n";

    public static final String WINDOWS_LINE_SEPARATOR = "\r\n";

    public static final String SLASH = "/";

    public static final String FILE_SEPARATOR = System
            .getProperty("file.separator");

    public static final String KEY_SEPARATOR = ".";

}
