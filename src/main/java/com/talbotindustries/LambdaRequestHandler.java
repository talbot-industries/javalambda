package com.talbotindustries;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;

public class LambdaRequestHandler implements RequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {
    @Override
    public APIGatewayProxyResponseEvent handleRequest(APIGatewayProxyRequestEvent requestEvent, Context context) {

        var headers = requestEvent.getHeaders() != null;

        var text = "\n\nHELLO FROM JAVA LAMBDA\n\nYou called with: " +
                requestEvent.getHttpMethod() + " " + requestEvent.getPath() + " " +
                (headers ? requestEvent.getHeaders().toString() : "");

        return new APIGatewayProxyResponseEvent().withStatusCode(200).withBody(text);
    }
}
