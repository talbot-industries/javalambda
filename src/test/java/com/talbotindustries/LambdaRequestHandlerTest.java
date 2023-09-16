package com.talbotindustries;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class LambdaRequestHandlerTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void responseShouldHaveBody()
    {
        // Given
        var handler = new LambdaRequestHandler();

        // When
        var result = handler.handleRequest(new APIGatewayProxyRequestEvent(), null);

        // Then
        assertFalse(result.getBody().isEmpty());
    }
}
