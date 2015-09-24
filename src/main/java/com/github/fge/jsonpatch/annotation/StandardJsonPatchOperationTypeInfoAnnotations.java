package com.github.fge.jsonpatch.annotation;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.github.fge.jsonpatch.operation.*;
import com.github.fge.jsonpatch.annotation.JsonPatchOperationTypeInfoAnnotations;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "op")

@JsonSubTypes({
    @JsonSubTypes.Type(name = AddOperation.OPERATION_NAME, value = AddOperation.class),
    @JsonSubTypes.Type(name = CopyOperation.OPERATION_NAME, value = CopyOperation.class),
    @JsonSubTypes.Type(name = MoveOperation.OPERATION_NAME, value = MoveOperation.class),
    @JsonSubTypes.Type(name = RemoveOperation.OPERATION_NAME, value = RemoveOperation.class),
    @JsonSubTypes.Type(name = ReplaceOperation.OPERATION_NAME, value = ReplaceOperation.class),
    @JsonSubTypes.Type(name = TestOperation.OPERATION_NAME, value = TestOperation.class)
})
public class StandardJsonPatchOperationTypeInfoAnnotations implements JsonPatchOperationTypeInfoAnnotations {
}
