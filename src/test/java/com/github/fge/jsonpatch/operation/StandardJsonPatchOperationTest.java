package com.github.fge.jsonpatch.operation;

import org.testng.annotations.Test;

import java.io.IOException;

@Test
public abstract class StandardJsonPatchOperationTest extends JsonPatchOperationTest
{
    protected StandardJsonPatchOperationTest(final String operationName)
        throws IOException
    {
        super("standard", operationName, JsonPatchOperation.class);
    }
}
