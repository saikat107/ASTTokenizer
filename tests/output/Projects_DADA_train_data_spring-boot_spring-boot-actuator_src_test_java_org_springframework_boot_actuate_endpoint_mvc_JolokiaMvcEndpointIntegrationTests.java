<METHOD_START> @ Before public void void ( ) { this . org.springframework.boot.actuate.endpoint.mvc.MockMvc = MockMvcBuilders . webAppContextSetup ( this . org.springframework.boot.actuate.endpoint.mvc.WebApplicationContext ) . build ( ) ; EnvironmentTestUtils . addEnvironment ( ( ConfigurableApplicationContext ) this . org.springframework.boot.actuate.endpoint.mvc.WebApplicationContext , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.Set<? extends org.springframework.boot.actuate.endpoint.mvc.MvcEndpoint> < ? extends MvcEndpoint > java.util.Set<? extends org.springframework.boot.actuate.endpoint.mvc.MvcEndpoint> = this . org.springframework.boot.actuate.endpoint.mvc.MvcEndpoints . getEndpoints ( ) ; assertThat ( java.util.Set<> ) . hasAtLeastOneElementOfType ( JolokiaMvcEndpoint .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.actuate.endpoint.mvc.MockMvc . perform ( get ( STRING ) ) . andExpect ( status ( ) . isOk ( ) ) . andExpect ( content ( ) . string ( containsString ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.actuate.endpoint.mvc.MockMvc . perform ( get ( STRING ) ) . andExpect ( status ( ) . isOk ( ) ) . andExpect ( content ( ) . string ( containsString ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.actuate.endpoint.mvc.MockMvc . perform ( get ( STRING ) ) . andExpect ( status ( ) . isOk ( ) ) . andExpect ( content ( ) . string ( containsString ( STRING ) ) ) ; }  <METHOD_END>