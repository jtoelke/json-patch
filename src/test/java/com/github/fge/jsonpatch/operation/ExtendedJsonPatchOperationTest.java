package com.github.fge.jsonpatch.operation;

import org.testng.annotations.Test;

import java.io.IOException;

@Test
public abstract class ExtendedJsonPatchOperationTest extends JsonPatchOperationTest
{
    protected ExtendedJsonPatchOperationTest(final JsonPatchOperationFactory operationFactory)
        throws IOException
    {
        super("extended", operationFactory);
    }
}
