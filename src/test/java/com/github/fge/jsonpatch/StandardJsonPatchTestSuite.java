package com.github.fge.jsonpatch;

import com.github.fge.jsonpatch.annotation.StandardJsonPatchOperationTypeInfoAnnotations;

import java.io.IOException;

public final class StandardJsonPatchTestSuite extends JsonPatchTestSuite
{
    public StandardJsonPatchTestSuite()
        throws IOException
    {
        super("standard", StandardJsonPatchOperationTypeInfoAnnotations.class);
    }
}

