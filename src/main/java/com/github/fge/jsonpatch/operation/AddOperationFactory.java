package com.github.fge.jsonpatch.operation;

public final class AddOperationFactory extends JsonPatchOperationFactoryBase
{
    public String getOperationName()
    {
        return AddOperation.OPERATION_NAME;
    }
    public Class<? extends JsonPatchOperation> getOperationClass()
    {
        return AddOperation.class;
    }
}
