API_ID=$(awslocal apigateway get-rest-apis --output text | grep java-lambda-api-gateway-demo | awk '{ print $5 }')
curl http://localhost:4566/restapis/${API_ID}/dev/_user_request_/some_endpoint_123
