package com.github.fge.jsonpatch.serialization;

import com.github.fge.jsonpatch.operation.TranslateOperation;

import java.io.IOException;

public final class TranslateOperationSerializationTest extends ExtendedJsonPatchOperationSerializationTest
{
    public TranslateOperationSerializationTest() throws IOException
    {
        super(TranslateOperation.OPERATION_NAME);
    }
}
