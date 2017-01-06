package com.github.fge.jsonpatch.serialization;

import com.github.fge.jsonpatch.operation.MoveOptionalOperation;

import java.io.IOException;

public class MoveOptionalOperationSerializationTest
    extends ExtendedJsonPatchOperationSerializationTest
{
    public MoveOptionalOperationSerializationTest()
        throws IOException
    {
        super(MoveOptionalOperation.OPERATION_NAME);
    }
}
