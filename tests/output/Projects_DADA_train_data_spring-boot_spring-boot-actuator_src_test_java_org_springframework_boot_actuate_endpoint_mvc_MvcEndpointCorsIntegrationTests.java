<METHOD_START> @ Before public void void ( ) { this . org.springframework.boot.actuate.endpoint.mvc.AnnotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext ( ) ; this . org.springframework.boot.actuate.endpoint.mvc.AnnotationConfigWebApplicationContext . setServletContext ( new MockServletContext ( ) ) ; this . org.springframework.boot.actuate.endpoint.mvc.AnnotationConfigWebApplicationContext . register ( JacksonAutoConfiguration .class , HttpMessageConvertersAutoConfiguration .class , EndpointAutoConfiguration .class , EndpointWebMvcAutoConfiguration .class , PropertyPlaceholderAutoConfiguration .class , AuditAutoConfiguration .class , JolokiaAutoConfiguration .class , WebMvcAutoConfiguration .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.boot.actuate.endpoint.mvc.MockMvc ( ) . perform ( options ( STRING ) . header ( STRING , STRING ) . header ( HttpHeaders . ACCESS_CONTROL_REQUEST_METHOD , STRING ) ) . andExpect ( header ( ) . doesNotExist ( HttpHeaders . ACCESS_CONTROL_ALLOW_ORIGIN ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { EnvironmentTestUtils . addEnvironment ( this . org.springframework.boot.actuate.endpoint.mvc.AnnotationConfigWebApplicationContext , STRING ) ; org.springframework.boot.actuate.endpoint.mvc.MockMvc ( ) . perform ( options ( STRING ) . header ( STRING , STRING ) . header ( HttpHeaders . ACCESS_CONTROL_REQUEST_METHOD , STRING ) ) . andExpect ( status ( ) . isForbidden ( ) ) ; org.springframework.boot.actuate.endpoint.mvc.ResultActions ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { EnvironmentTestUtils . addEnvironment ( this . org.springframework.boot.actuate.endpoint.mvc.AnnotationConfigWebApplicationContext , STRING ) ; org.springframework.boot.actuate.endpoint.mvc.ResultActions ( ) . andExpect ( header ( ) . string ( HttpHeaders . ACCESS_CONTROL_MAX_AGE , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { EnvironmentTestUtils . addEnvironment ( this . org.springframework.boot.actuate.endpoint.mvc.AnnotationConfigWebApplicationContext , STRING , STRING ) ; org.springframework.boot.actuate.endpoint.mvc.ResultActions ( ) . andExpect ( header ( ) . string ( HttpHeaders . ACCESS_CONTROL_MAX_AGE , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { EnvironmentTestUtils . addEnvironment ( this . org.springframework.boot.actuate.endpoint.mvc.AnnotationConfigWebApplicationContext , STRING ) ; org.springframework.boot.actuate.endpoint.mvc.MockMvc ( ) . perform ( options ( STRING ) . header ( STRING , STRING ) . header ( HttpHeaders . ACCESS_CONTROL_REQUEST_METHOD , STRING ) . header ( HttpHeaders . ACCESS_CONTROL_REQUEST_HEADERS , STRING ) ) . andExpect ( status ( ) . isForbidden ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { EnvironmentTestUtils . addEnvironment ( this . org.springframework.boot.actuate.endpoint.mvc.AnnotationConfigWebApplicationContext , STRING , STRING ) ; org.springframework.boot.actuate.endpoint.mvc.MockMvc ( ) . perform ( options ( STRING ) . header ( STRING , STRING ) . header ( HttpHeaders . ACCESS_CONTROL_REQUEST_METHOD , STRING ) . header ( HttpHeaders . ACCESS_CONTROL_REQUEST_HEADERS , STRING ) ) . andExpect ( status ( ) . isOk ( ) ) . andExpect ( header ( ) . string ( HttpHeaders . ACCESS_CONTROL_ALLOW_HEADERS , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { EnvironmentTestUtils . addEnvironment ( this . org.springframework.boot.actuate.endpoint.mvc.AnnotationConfigWebApplicationContext , STRING ) ; org.springframework.boot.actuate.endpoint.mvc.MockMvc ( ) . perform ( options ( STRING ) . header ( HttpHeaders . ORIGIN , STRING ) . header ( HttpHeaders . ACCESS_CONTROL_REQUEST_METHOD , STRING ) ) . andExpect ( status ( ) . isForbidden ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { EnvironmentTestUtils . addEnvironment ( this . org.springframework.boot.actuate.endpoint.mvc.AnnotationConfigWebApplicationContext , STRING , STRING ) ; org.springframework.boot.actuate.endpoint.mvc.MockMvc ( ) . perform ( options ( STRING ) . header ( HttpHeaders . ORIGIN , STRING ) . header ( HttpHeaders . ACCESS_CONTROL_REQUEST_METHOD , STRING ) ) . andExpect ( status ( ) . isOk ( ) ) . andExpect ( header ( ) . string ( HttpHeaders . ACCESS_CONTROL_ALLOW_METHODS , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { EnvironmentTestUtils . addEnvironment ( this . org.springframework.boot.actuate.endpoint.mvc.AnnotationConfigWebApplicationContext , STRING , STRING ) ; org.springframework.boot.actuate.endpoint.mvc.ResultActions ( ) . andExpect ( header ( ) . string ( HttpHeaders . ACCESS_CONTROL_ALLOW_CREDENTIALS , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { EnvironmentTestUtils . addEnvironment ( this . org.springframework.boot.actuate.endpoint.mvc.AnnotationConfigWebApplicationContext , STRING , STRING ) ; org.springframework.boot.actuate.endpoint.mvc.ResultActions ( ) . andExpect ( header ( ) . doesNotExist ( HttpHeaders . ACCESS_CONTROL_ALLOW_CREDENTIALS ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { EnvironmentTestUtils . addEnvironment ( this . org.springframework.boot.actuate.endpoint.mvc.AnnotationConfigWebApplicationContext , STRING ) ; org.springframework.boot.actuate.endpoint.mvc.MockMvc ( ) . perform ( options ( STRING ) . header ( STRING , STRING ) . header ( HttpHeaders . ACCESS_CONTROL_REQUEST_METHOD , STRING ) ) . andExpect ( status ( ) . isForbidden ( ) ) ; org.springframework.boot.actuate.endpoint.mvc.ResultActions ( STRING ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.actuate.endpoint.mvc.MockMvc org.springframework.boot.actuate.endpoint.mvc.MockMvc ( ) { this . org.springframework.boot.actuate.endpoint.mvc.AnnotationConfigWebApplicationContext . refresh ( ) ; return MockMvcBuilders . webAppContextSetup ( this . org.springframework.boot.actuate.endpoint.mvc.AnnotationConfigWebApplicationContext ) . build ( ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.actuate.endpoint.mvc.ResultActions org.springframework.boot.actuate.endpoint.mvc.ResultActions ( ) java.lang.Exception { return org.springframework.boot.actuate.endpoint.mvc.ResultActions ( STRING ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.actuate.endpoint.mvc.ResultActions org.springframework.boot.actuate.endpoint.mvc.ResultActions ( java.lang.String java.lang.String ) throws java.lang.Exception { return org.springframework.boot.actuate.endpoint.mvc.MockMvc ( ) . perform ( options ( java.lang.String ) . header ( HttpHeaders . ORIGIN , STRING ) . header ( HttpHeaders . ACCESS_CONTROL_REQUEST_METHOD , STRING ) ) . andExpect ( header ( ) . string ( HttpHeaders . ACCESS_CONTROL_ALLOW_ORIGIN , STRING ) ) . andExpect ( status ( ) . isOk ( ) ) ; }  <METHOD_END>