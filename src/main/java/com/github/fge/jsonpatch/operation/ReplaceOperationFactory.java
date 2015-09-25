package com.github.fge.jsonpatch.operation;

public final class ReplaceOperationFactory extends JsonPatchOperationFactoryBase
{
    public String getOperationName()
    {
        return ReplaceOperation.OPERATION_NAME;
    }
    public Class<? extends JsonPatchOperation> getOperationClass()
    {
        return ReplaceOperation.class;
    }
}
