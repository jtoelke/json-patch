package com.github.fge.jsonpatch;

import com.github.fge.jsonpatch.operation.JsonPatchOperationFactory;
import com.github.fge.jsonpatch.operation.OmitOperationFactory;
import com.github.fge.jsonpatch.operation.OmitOptionalOperationFactory;

import java.io.IOException;
import java.util.ArrayList;

public final class ExtendedJsonPatchTestSuite extends JsonPatchTestSuite
{
    public ExtendedJsonPatchTestSuite()
        throws IOException
    {
        super("extended", getAdditionalOperations());
    }
    private static ArrayList<JsonPatchOperationFactory> getAdditionalOperations()
    {
        ArrayList<JsonPatchOperationFactory> additionalOperations = new ArrayList<JsonPatchOperationFactory>();
        additionalOperations.add(new OmitOperationFactory());
        additionalOperations.add(new OmitOptionalOperationFactory());
        return additionalOperations;
    }
}

