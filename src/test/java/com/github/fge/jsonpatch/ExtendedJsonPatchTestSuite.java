package com.github.fge.jsonpatch;

import com.github.fge.jsonpatch.annotation.ExtendedJsonPatchOperationTypeInfoAnnotations;

import java.io.IOException;

public final class ExtendedJsonPatchTestSuite extends JsonPatchTestSuite
{
    public ExtendedJsonPatchTestSuite()
        throws IOException
    {
        super("extended", ExtendedJsonPatchOperationTypeInfoAnnotations.class);
    }
}

