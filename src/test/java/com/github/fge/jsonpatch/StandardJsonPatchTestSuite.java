package com.github.fge.jsonpatch;

import java.io.IOException;

public final class StandardJsonPatchTestSuite extends JsonPatchTestSuite
{
    public StandardJsonPatchTestSuite()
        throws IOException
    {
        super("standard", StandardJsonPatchFactory.create());
    }
}

