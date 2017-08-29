<METHOD_START> @ Before public void void ( ) { this . org.springframework.integration.http.config.MockRestServiceServer = MockRestServiceServer . createServer ( this . org.springframework.integration.http.config.RestTemplate ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.integration.http.config.MockRestServiceServer . expect ( requestTo ( STRING ) ) . andExpect ( method ( HttpMethod . POST ) ) . andRespond ( withSuccess ( HttpMethod . POST . name ( ) , MediaType . TEXT_PLAIN ) ) ; this . org.springframework.integration.http.config.MessageChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; Message < ? > org.springframework.integration.http.config.Message<?> = this . org.springframework.integration.http.config.QueueChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.http.config.Message<> ) ; assertTrue ( org.springframework.integration.http.config.Message<> . getPayload ( ) instanceof ResponseEntity ) ; this . org.springframework.integration.http.config.MockRestServiceServer . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.integration.http.config.MockRestServiceServer . expect ( requestTo ( STRING ) ) . andExpect ( method ( HttpMethod . POST ) ) . andRespond ( withSuccess ( HttpMethod . POST . name ( ) , MediaType . TEXT_PLAIN ) ) ; this . org.springframework.integration.http.config.MessageChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; Message < ? > org.springframework.integration.http.config.Message<?> = this . org.springframework.integration.http.config.QueueChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.http.config.Message<> ) ; assertTrue ( org.springframework.integration.http.config.Message<> . getPayload ( ) instanceof java.lang.String ) ; this . org.springframework.integration.http.config.MockRestServiceServer . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.integration.http.config.MockRestServiceServer . expect ( requestTo ( STRING ) ) . andExpect ( method ( HttpMethod . POST ) ) . andRespond ( withSuccess ( HttpMethod . POST . name ( ) , MediaType . TEXT_PLAIN ) ) ; this . org.springframework.integration.http.config.MessageChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; Message < ? > org.springframework.integration.http.config.Message<?> = this . org.springframework.integration.http.config.QueueChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.http.config.Message<> ) ; assertTrue ( org.springframework.integration.http.config.Message<> . getPayload ( ) instanceof java.lang.String ) ; this . org.springframework.integration.http.config.MockRestServiceServer . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.integration.http.config.MockRestServiceServer = MockRestServiceServer . createServer ( this . org.springframework.integration.http.config.RestTemplate ) ; this . org.springframework.integration.http.config.MockRestServiceServer . expect ( requestTo ( STRING ) ) . andExpect ( method ( HttpMethod . POST ) ) . andRespond ( withSuccess ( HttpMethod . POST . name ( ) , MediaType . TEXT_PLAIN ) ) ; this . org.springframework.integration.http.config.MessageChannel . send ( new GenericMessage < java.lang.Class<?> < ? > > ( java.lang.String .class ) ) ; Message < ? > org.springframework.integration.http.config.Message<?> = this . org.springframework.integration.http.config.QueueChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.http.config.Message<> ) ; assertTrue ( org.springframework.integration.http.config.Message<> . getPayload ( ) instanceof java.lang.String ) ; this . org.springframework.integration.http.config.MockRestServiceServer . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.integration.http.config.MockRestServiceServer . expect ( requestTo ( STRING ) ) . andExpect ( method ( HttpMethod . POST ) ) . andRespond ( withSuccess ( HttpMethod . POST . name ( ) , MediaType . TEXT_PLAIN ) ) ; this . org.springframework.integration.http.config.MessageChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; Message < ? > org.springframework.integration.http.config.Message<?> = this . org.springframework.integration.http.config.QueueChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.http.config.Message<> ) ; assertTrue ( org.springframework.integration.http.config.Message<> . getPayload ( ) instanceof byte [] ) ; this . org.springframework.integration.http.config.MockRestServiceServer . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.integration.http.config.MockRestServiceServer . expect ( requestTo ( STRING ) ) . andExpect ( method ( HttpMethod . POST ) ) . andRespond ( withSuccess ( HttpMethod . POST . name ( ) , MediaType . TEXT_PLAIN ) ) ; this . org.springframework.integration.http.config.MessageChannel . send ( new GenericMessage < byte [] > ( STRING . byte[] ( ) ) ) ; Message < ? > org.springframework.integration.http.config.Message<?> = this . org.springframework.integration.http.config.QueueChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.http.config.Message<> ) ; assertTrue ( org.springframework.integration.http.config.Message<> . getPayload ( ) instanceof byte [] ) ; this . org.springframework.integration.http.config.MockRestServiceServer . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { try { this . org.springframework.integration.http.config.MessageChannel . send ( new GenericMessage < byte [] > ( STRING . byte[] ( ) ) ) ; fail ( STRING ) ; } catch ( java.lang.Exception java.lang.Exception ) { assertThat ( java.lang.Exception , Matchers . instanceOf ( MessageHandlingException .class ) ) ; java.lang.Throwable java.lang.Throwable = java.lang.Exception . java.lang.Throwable ( ) ; assertThat ( java.lang.Throwable , Matchers . instanceOf ( java.lang.IllegalStateException .class ) ) ; assertThat ( java.lang.Throwable . java.lang.String ( ) , Matchers . containsString ( STRING + STRING ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { try { new ClassPathXmlApplicationContext ( STRING , this . java.lang.Class<? extends org.springframework.integration.http.config.OutboundResponseTypeTests> ( ) ) . close ( ) ; fail ( STRING ) ; } catch ( BeansException org.springframework.integration.http.config.BeansException ) { assertTrue ( org.springframework.integration.http.config.BeansException instanceof BeanDefinitionParsingException ) ; assertTrue ( org.springframework.integration.http.config.BeansException . getMessage ( ) . contains ( STRING + STRING ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.integration.http.config.MockRestServiceServer . expect ( requestTo ( STRING ) ) . andExpect ( method ( HttpMethod . POST ) ) . andExpect ( header ( HttpHeaders . CONTENT_TYPE , MediaType . APPLICATION_JSON . toString ( ) ) ) . andRespond ( withSuccess ( HttpMethod . POST . name ( ) , MediaType . TEXT_PLAIN ) ) ; this . org.springframework.integration.http.config.MessageChannel . send ( new GenericMessage < java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > > ( java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ) ) ; this . org.springframework.integration.http.config.MockRestServiceServer . verify ( ) ; }  <METHOD_END>