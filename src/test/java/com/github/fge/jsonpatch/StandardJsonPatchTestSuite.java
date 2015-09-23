package com.github.fge.jsonpatch;

import com.github.fge.jsonpatch.operation.JsonPatchOperationFactory;

import java.io.IOException;
import java.util.ArrayList;

public final class StandardJsonPatchTestSuite extends JsonPatchTestSuite
{
    public StandardJsonPatchTestSuite()
        throws IOException
    {
        super("standard", new ArrayList<JsonPatchOperationFactory>());
    }
}

