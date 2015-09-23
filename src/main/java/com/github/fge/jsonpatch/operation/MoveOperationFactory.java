package com.github.fge.jsonpatch.operation;

public final class MoveOperationFactory extends JsonPatchOperationFactoryBase
{
    public String getOperationName()
    {
        return MoveOperation.OPERATION_NAME;
    }
    public Class<? extends JsonPatchOperation> getOperationClass()
    {
        return MoveOperation.class;
    }
}
