package com.github.fge.jsonpatch;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.github.fge.jackson.JacksonUtils;
import com.github.fge.jsonpatch.operation.*;
import com.github.fge.msgsimple.bundle.MessageBundle;
import com.github.fge.msgsimple.load.MessageBundles;

import java.io.IOException;

public class ExtendedJsonPatch
{
    protected static final MessageBundle BUNDLE
        = MessageBundles.getBundle(JsonPatchMessages.class);

    private static final ObjectMapper mapper;

    static
    {
        final ObjectMapper newMapper = JacksonUtils.newMapper();
        newMapper.registerSubtypes(
                new NamedType(AddOperation.class, AddOperation.OPERATION_NAME),
                new NamedType(CopyOperation.class, CopyOperation.OPERATION_NAME),
                new NamedType(MoveOperation.class, MoveOperation.OPERATION_NAME),
                new NamedType(RemoveOperation.class, RemoveOperation.OPERATION_NAME),
                new NamedType(ReplaceOperation.class, ReplaceOperation.OPERATION_NAME),
                new NamedType(TestOperation.class, TestOperation.OPERATION_NAME),
                new NamedType(OmitOperation.class, OmitOperation.OPERATION_NAME),
                new NamedType(OmitOptionalOperation.class, OmitOptionalOperation.OPERATION_NAME)
        );
        mapper = newMapper;
    }

    public static ObjectReader getReader()
    {
        return mapper.reader();
    }

    public static ObjectWriter getWriter()
    {
        return mapper.writer();
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
        return getReader().withType(JsonPatch.class)
            .readValue(node);
    }
}
