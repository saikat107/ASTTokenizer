<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.integration.gateway.GatewayWithPayloadExpressionTests.SampleGateway . void ( STRING ) ; Message < ? > org.springframework.integration.gateway.Message<?> = org.springframework.integration.gateway.PollableChannel . receive ( NUMBER ) ; assertEquals ( STRING , org.springframework.integration.gateway.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.integration.gateway.GatewayWithPayloadExpressionTests.SampleGateway . void ( STRING ) ; Message < ? > org.springframework.integration.gateway.Message<?> = org.springframework.integration.gateway.PollableChannel . receive ( NUMBER ) ; assertEquals ( NUMBER , org.springframework.integration.gateway.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.integration.gateway.GatewayWithPayloadExpressionTests.SampleAnnotatedGateway . void ( STRING , STRING ) ; Message < ? > org.springframework.integration.gateway.Message<?> = org.springframework.integration.gateway.PollableChannel . receive ( NUMBER ) ; assertEquals ( STRING , org.springframework.integration.gateway.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.integration.gateway.GatewayWithPayloadExpressionTests.SampleGateway . void ( ) ; Message < ? > org.springframework.integration.gateway.Message<?> = org.springframework.integration.gateway.PollableChannel . receive ( NUMBER ) ; assertEquals ( STRING , org.springframework.integration.gateway.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> void void ( java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> void void ( java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> void void ( )  <METHOD_END>
<METHOD_START> @ Payload ( STRING ) void void ( java.lang.String java.lang.String , java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> public int int ( java.lang.String java.lang.String ) { int int = NUMBER ; for ( byte byte : java.lang.String . byte[] ( ) ) { int += byte ; } return int ; }  <METHOD_END>