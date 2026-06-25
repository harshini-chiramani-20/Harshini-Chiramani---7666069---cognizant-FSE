package com.cts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class DataServiceTest {

    @Test
    public void testMockingAndStubbing() {

        // Create Mock Object
        ExternalApi api = mock(ExternalApi.class);

        // Stub the method
        when(api.getData()).thenReturn("Mockito Working");

        // Inject mock
        DataService service = new DataService(api);

        // Call method
        String result = service.fetchData();

        // Verify
        assertEquals("Mockito Working", result);
    }
}