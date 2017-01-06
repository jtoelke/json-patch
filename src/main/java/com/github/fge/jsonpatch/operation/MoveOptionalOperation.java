package com.github.fge.jsonpatch.operation;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.github.fge.jackson.jsonpointer.JsonPointer;
import com.github.fge.jsonpatch.JsonPatchException;
import com.github.fge.jsonpatch.operation.policy.PathMissingPolicy;

/**
 * JSON Patch {@code move?} operation
 *
 * <p>For this operation, {@code from} points to the value to move, and {@code
 * path} points to the new location of the moved value.</p>
 *
 * <p>As for {@code add}:</p>
 *
 * <ul>
 *     <li>the value at the destination path is either created or replaced;</li>
 *     <li>it is created only if the immediate parent exists;</li>
 *     <li>{@code -} appends at the end of an array.</li>
 * </ul>
 *
 * <p>It is no error condition if {@code from} does not point to a JSON value,
 * in this case nothing is done.
 * </p>
 *
 * <p>The specification adds another rule that the {@code from} path must not be
 * an immediate parent of {@code path}. Unfortunately, that doesn't really work.
 * Consider this patch:</p>
 *
 * <pre>
 *     { "op": "move", "from": "/0", "path": "/0/x" }
 * </pre>
 *
 * <p>Even though {@code /0} is an immediate parent of {@code /0/x}, when this
 * patch is applied to:</p>
 *
 * <pre>
 *     [ "victim", {} ]
 * </pre>
 *
 * <p>it actually succeeds and results in the patched value:</p>
 *
 * <pre>
 *     [ { "x": "victim" } ]
 * </pre>
 */
public final class MoveOptionalOperation
    extends MoveOperationBase
{
    public static final String OPERATION_NAME = "move?";

    @JsonCreator
    public MoveOptionalOperation(@JsonProperty("from") final JsonPointer from,
        @JsonProperty("path") final JsonPointer path)
    {
        super(OPERATION_NAME, from, path, PathMissingPolicy.SKIP);
    }
}
