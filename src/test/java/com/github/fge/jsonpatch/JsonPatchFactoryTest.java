package com.github.fge.jsonpatch;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.mockito.Mockito.*;
import static org.testng.Assert.*;

public class JsonPatchFactoryTest
{
    @Test
    public void getReaderReturnsTheReaderFromTheMapper()
    {
        ObjectMapper mapper = mock(ObjectMapper.class);
        ObjectReader reader = mock(ObjectReader.class);
        when(mapper.reader()).thenReturn(reader);
        JsonPatchFactory factory = new JsonPatchFactory(mapper);
        assertSame(reader, factory.getReader());
    }
    @Test
    public void getWriterReturnsTheWriterFromTheMapper()
    {
        ObjectMapper mapper = mock(ObjectMapper.class);
        ObjectWriter writer = mock(ObjectWriter.class);
        when(mapper.writer()).thenReturn(writer);
        JsonPatchFactory factory = new JsonPatchFactory(mapper);
        assertSame(writer, factory.getWriter());
    }
    @Test
    public void fromJsonParsesIntoJsonPatch()
            throws IOException
    {
        ObjectMapper mapper = mock(ObjectMapper.class);
        ObjectReader reader = mock(ObjectReader.class);
        ObjectReader readerWithType = mock(ObjectReader.class);
        JsonNode node = mock(JsonNode.class);
        JsonPatch patch = mock(JsonPatch.class);
        when(mapper.reader()).thenReturn(reader);
        when(reader.withType(JsonPatch.class)).thenReturn(readerWithType);
        when(readerWithType.readValue(any(JsonNode.class))).thenReturn(patch);
        JsonPatchFactory factory = new JsonPatchFactory(mapper);

        assertSame(patch, factory.fromJson(node));
    }
}
