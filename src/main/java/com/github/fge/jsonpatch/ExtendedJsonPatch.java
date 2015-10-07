package com.github.fge.jsonpatch;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.JsonNode;
import com.github.fge.jackson.JacksonUtils;
import com.github.fge.jsonpatch.operation.*;
import com.github.fge.msgsimple.bundle.MessageBundle;
import com.github.fge.msgsimple.load.MessageBundles;
import com.google.common.collect.ImmutableList;

import java.io.IOException;
import java.util.List;

public class ExtendedJsonPatch extends JsonPatch
{
    /**
     * Constructor
     *
     * <p>Normally, you should never have to use it.</p>
     *
     * @param operations the list of operations for this patch
     * @see JsonPatchOperation
     */
    @JsonCreator
    public ExtendedJsonPatch(final List<ExtendedJsonPatchOperation> operations)
    {
        super(operations);
    }

    /**
     * Static factory method to build a JSON Patch out of a JSON representation
     *
     * @param node the JSON representation of the generated JSON Patch
     * @return a JSON Patch
     * @throws IOException input is not a valid JSON patch
     * @throws NullPointerException input is null
     */
    public static JsonPatch fromJson(final JsonNode node)
            throws IOException
    {
        BUNDLE.checkNotNull(node, "jsonPatch.nullInput");
        return JacksonUtils.getReader().withType(ExtendedJsonPatch.class)
            .readValue(node);
    }
}
