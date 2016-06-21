package com.github.fge.jsonpatch.serialization;

import com.github.fge.jsonpatch.operation.TranslateOptionalOperation;

import java.io.IOException;

public final class TranslateOptionalOperationSerializationTest extends ExtendedJsonPatchOperationSerializationTest
{
    public TranslateOptionalOperationSerializationTest() throws IOException
    {
        super(TranslateOptionalOperation.OPERATION_NAME);
    }
}
