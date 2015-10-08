package com.github.fge.jsonpatch;

import com.github.fge.jsonpatch.operation.JsonPatchOperation;

import java.io.IOException;

public final class StandardJsonPatchTestSuite extends JsonPatchTestSuite
{
    public StandardJsonPatchTestSuite()
        throws IOException
    {
        super("standard", JsonPatch.getReader());
    }
}

