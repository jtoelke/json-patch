package com.github.fge.jsonpatch.operation;

public final class OmitOperationFactory extends JsonPatchOperationFactoryBase
{
    public String getOperationName()
    {
        return OmitOperation.OPERATION_NAME;
    }
    public Class<? extends JsonPatchOperation> getOperationClass()
    {
        return OmitOperation.class;
    }
}
