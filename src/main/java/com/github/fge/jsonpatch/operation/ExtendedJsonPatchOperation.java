package com.github.fge.jsonpatch.operation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "op")

@JsonSubTypes({
    @JsonSubTypes.Type(name = AddOperation.OPERATION_NAME, value = AddOperation.class),
    @JsonSubTypes.Type(name = CopyOperation.OPERATION_NAME, value = CopyOperation.class),
    @JsonSubTypes.Type(name = MoveOperation.OPERATION_NAME, value = MoveOperation.class),
    @JsonSubTypes.Type(name = RemoveOperation.OPERATION_NAME, value = RemoveOperation.class),
    @JsonSubTypes.Type(name = ReplaceOperation.OPERATION_NAME, value = ReplaceOperation.class),
    @JsonSubTypes.Type(name = TestOperation.OPERATION_NAME, value = TestOperation.class),
    @JsonSubTypes.Type(name = OmitOperation.OPERATION_NAME, value = OmitOperation.class),
    @JsonSubTypes.Type(name = OmitOptionalOperation.OPERATION_NAME, value = OmitOptionalOperation.class)
})

@JsonIgnoreProperties(ignoreUnknown = true)
public interface ExtendedJsonPatchOperation extends JsonPatchOperation
{
}
