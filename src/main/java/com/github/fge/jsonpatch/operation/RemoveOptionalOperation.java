/*
 * Copyright (c) 2016, Jessica Beller (jbeller@box.com)
 *
 * This software is dual-licensed under:
 *
 * - the Lesser General Public License (LGPL) version 3.0 or, at your option, any
 *   later version;
 * - the Apache Software License (ASL) version 2.0.
 *
 * The text of this file and of both licenses is available at the root of this
 * project or, if you have the jar distribution, in directory META-INF/, under
 * the names LGPL-3.0.txt and ASL-2.0.txt respectively.
 *
 * Direct link to the sources:
 *
 * - LGPL 3.0: https://www.gnu.org/licenses/lgpl-3.0.txt
 * - ASL 2.0: http://www.apache.org/licenses/LICENSE-2.0.txt
 */

package com.github.fge.jsonpatch.operation;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.github.fge.jackson.jsonpointer.JsonPointer;
import com.github.fge.jsonpatch.operation.policy.PathMissingPolicy;

/**
 * JSON Path {@code remove?} operation
 *
 * <p>This operation will remove ({@code path}) if it exists.</p>
 */
public final class RemoveOptionalOperation extends RemoveOperationBase
{
    public static final String OPERATION_NAME = "remove?";

    @JsonCreator
    public RemoveOptionalOperation(@JsonProperty("path") final JsonPointer path)
    {
        super(OPERATION_NAME, path, PathMissingPolicy.SKIP);
    }

}
