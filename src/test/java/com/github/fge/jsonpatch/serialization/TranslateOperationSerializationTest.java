package com.github.fge.jsonpatch.serialization;

import com.github.fge.jsonpatch.operation.OmitOperation;

import java.io.IOException;

public final class TranslateOperationSerializationTest extends ExtendedJsonPatchOperationSerializationTest
{
    public TranslateOperationSerializationTest() throws IOException
    {
        super(OmitOperation.OPERATION_NAME);
    }
}
