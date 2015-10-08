package com.github.fge.jsonpatch;

import java.io.IOException;

public final class ExtendedJsonPatchTestSuite extends JsonPatchTestSuite
{
    public ExtendedJsonPatchTestSuite()
        throws IOException
    {
        super("extended", ExtendedJsonPatchFactory.create());
    }
}

