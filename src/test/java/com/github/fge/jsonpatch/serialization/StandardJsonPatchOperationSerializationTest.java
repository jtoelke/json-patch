package com.github.fge.jsonpatch.serialization;

import com.github.fge.jsonpatch.JsonPatch;
import org.testng.annotations.Test;

import java.io.IOException;

@Test
public abstract class StandardJsonPatchOperationSerializationTest extends JsonPatchOperationSerializationTest
{
    protected StandardJsonPatchOperationSerializationTest(final String operationName)
        throws IOException
    {
        super("standard", operationName, JsonPatch.getReader(), JsonPatch.getWriter());
    }
}
