package com.cts;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class NotificationServiceTest {

    @Test
    public void testVerifyInteraction() {

        // Create Mock
        ExternalApi api = mock(ExternalApi.class);

        // Inject Mock
        NotificationService service = new NotificationService(api);

        // Call Method
        service.notifyUser("Welcome");

        // Verify Interaction
        verify(api).sendData("Welcome");
    }
}