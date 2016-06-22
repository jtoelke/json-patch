package com.github.fge.jsonpatch.operation;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.github.fge.jackson.jsonpointer.JsonPointer;
import com.github.fge.jsonpatch.operation.policy.PathMissingPolicy;

/**
 * Extended JSON Patch {@code translate} operation.
 *
 * The operation will translate a {@code fromValue} to a {@code toValue} at {@code path} if it exists.
 * It will do nothing if the actual value at {@code path} is not equal to {@code fromValue}.
 * It will throw a "no such path" error if there is no value at {@code path}.
 */
public final class TranslateOperation extends TranslateOperationBase
{
    public static final String OPERATION_NAME = "translate";

    @JsonCreator
    public TranslateOperation(@JsonProperty("path") final JsonPointer path,
                              @JsonProperty("from") final JsonNode fromValue,
                              @JsonProperty("value") final JsonNode toValue)
    {
        super(OPERATION_NAME, path, fromValue, toValue, PathMissingPolicy.THROW);
    }
}

