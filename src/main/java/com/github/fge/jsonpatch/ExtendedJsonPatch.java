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
    private static final MessageBundle BUNDLE
        = MessageBundles.getBundle(JsonPatchMessages.class);

    private static final ObjectMapper MAPPER;
    private static final ObjectReader READER;
    private static final ObjectWriter WRITER;

    static
    {
        MAPPER = JacksonUtils.newMapper();
        MAPPER.registerSubtypes(
                new NamedType(AddOperation.class, AddOperation.OPERATION_NAME),
                new NamedType(CopyOperation.class, CopyOperation.OPERATION_NAME),
                new NamedType(MoveOperation.class, MoveOperation.OPERATION_NAME),
                new NamedType(RemoveOperation.class, RemoveOperation.OPERATION_NAME),
                new NamedType(ReplaceOperation.class, ReplaceOperation.OPERATION_NAME),
                new NamedType(TestOperation.class, TestOperation.OPERATION_NAME),
                new NamedType(OmitOperation.class, OmitOperation.OPERATION_NAME),
                new NamedType(OmitOptionalOperation.class, OmitOptionalOperation.OPERATION_NAME)
        );
        READER = MAPPER.reader();
        WRITER = MAPPER.writer();
    }

    public static ObjectReader getReader()
    {
        return READER;
    }

    public static ObjectWriter getWriter()
    {
        return WRITER;
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
