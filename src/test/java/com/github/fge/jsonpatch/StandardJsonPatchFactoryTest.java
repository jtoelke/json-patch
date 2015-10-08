package com.github.fge.jsonpatch;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StandardJsonPatchFactoryTest
{
    @Test
    public void createCreatesAJsonPatchFactory()
    {
        assertEquals(JsonPatchFactory.class, StandardJsonPatchFactory.create().getClass());
    }
}
