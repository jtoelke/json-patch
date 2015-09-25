package com.github.fge.jsonpatch.operation;

public final class OmitOptionalOperationFactory extends JsonPatchOperationFactoryBase
{
    public String getOperationName()
    {
        return OmitOptionalOperation.OPERATION_NAME;
    }
    public Class<? extends JsonPatchOperation> getOperationClass()
    {
        return OmitOptionalOperation.class;
    }
}
