package com.github.fge.jsonpatch.serialization;

import com.github.fge.jsonpatch.operation.OmitOptionalOperationFactory;

import java.io.IOException;

public final class OmitOptionalOperationSerializationTest extends ExtendedJsonPatchOperationSerializationTest
{
    public OmitOptionalOperationSerializationTest() throws IOException
    {
        super(new OmitOptionalOperationFactory());
    }
}
