package com.github.fge.jsonpatch;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ExtendedJsonPatchFactoryTest
{
    @Test
    public void createCreatesAJsonPatchFactory()
    {
        assertEquals(JsonPatchFactory.class, ExtendedJsonPatchFactory.create().getClass());
    }
}
