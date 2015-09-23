package com.github.fge.jsonpatch.operation;

public final class RemoveOperationFactory extends JsonPatchOperationFactoryBase
{
    public String getOperationName()
    {
        return RemoveOperation.OPERATION_NAME;
    }
    public Class<? extends JsonPatchOperation> getOperationClass()
    {
        return RemoveOperation.class;
    }
}
