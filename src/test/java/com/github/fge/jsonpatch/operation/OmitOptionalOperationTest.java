package com.github.fge.jsonpatch.operation;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.fge.jackson.JacksonUtils;
import com.github.fge.jackson.jsonpointer.JsonPointer;
import com.github.fge.jsonpatch.JsonPatchException;
import com.github.fge.jsonpatch.operation.ExtendedJsonPatchOperationTest;
import com.github.fge.jsonpatch.operation.JsonPatchOperation;
import com.github.fge.jsonpatch.operation.OmitOptionalOperation;
import com.github.fge.jsonpatch.operation.OmitOptionalOperationFactory;
import com.google.common.collect.Lists;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import static org.testng.Assert.*;

public final class OmitOptionalOperationTest extends ExtendedJsonPatchOperationTest
{
    public OmitOptionalOperationTest()
            throws IOException
    {
        super(new OmitOptionalOperationFactory());
    }

    @DataProvider
    public final Iterator<Object[]> getNodesForMissingNodeTest()
    {
        final List<Object[]> list = Lists.newArrayList();

        list.add(new Object[]{
                JacksonUtils.nodeFactory().objectNode().put("foo", "bar")
        });
        list.add(new Object[]{
                JacksonUtils.nodeFactory().arrayNode().add("foo")
        });
        list.add(new Object[]{
                JacksonUtils.nodeFactory().nullNode()
        });
        list.add(new Object[]{
                JacksonUtils.nodeFactory().textNode("foo")
        });
        list.add(new Object[]{
                JacksonUtils.nodeFactory().numberNode(123)
        });
        return list.iterator();
    }

    @Test(dataProvider = "getNodesForMissingNodeTest")
    public void omittingRootWithMatchingValueReturnsMissingNode(JsonNode node)
            throws JsonPatchException
    {
        final JsonPatchOperation op = new OmitOptionalOperation(JsonPointer.empty(), node);
        final JsonNode ret = op.apply(node);
        assertTrue(ret.isMissingNode());
    }
}
