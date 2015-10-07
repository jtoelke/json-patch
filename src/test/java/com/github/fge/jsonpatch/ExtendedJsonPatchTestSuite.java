package com.github.fge.jsonpatch;

import com.github.fge.jsonpatch.operation.ExtendedJsonPatchOperation;

import java.io.IOException;

public final class ExtendedJsonPatchTestSuite extends JsonPatchTestSuite
{
    public ExtendedJsonPatchTestSuite()
        throws IOException
    {
        super("extended", ExtendedJsonPatch.class);
    }
}

