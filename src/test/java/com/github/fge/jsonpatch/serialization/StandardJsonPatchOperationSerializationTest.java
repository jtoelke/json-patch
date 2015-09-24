package com.github.fge.jsonpatch.serialization;

import com.github.fge.jsonpatch.annotation.StandardJsonPatchOperationTypeInfoAnnotations;
import org.testng.annotations.Test;

import java.io.IOException;

@Test
public abstract class StandardJsonPatchOperationSerializationTest extends JsonPatchOperationSerializationTest
{
    protected StandardJsonPatchOperationSerializationTest(final String operationName)
        throws IOException
    {
        super("standard", operationName, StandardJsonPatchOperationTypeInfoAnnotations.class);
    }
}
