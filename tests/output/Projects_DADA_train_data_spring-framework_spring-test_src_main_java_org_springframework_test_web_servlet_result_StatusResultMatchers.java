<METHOD_START> protected void ( ) {	}  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( final Matcher < java.lang.Integer > org.springframework.test.web.servlet.result.Matcher<java.lang.Integer> ) { return new ResultMatcher ( ) { @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { assertThat ( STRING , org.springframework.test.web.servlet.result.MvcResult . getResponse ( ) . getStatus ( ) , org.springframework.test.web.servlet.result.Matcher<java.lang.Integer> ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { assertThat ( STRING , org.springframework.test.web.servlet.result.MvcResult . getResponse ( ) . getStatus ( ) , org.springframework.test.web.servlet.result.Matcher<java.lang.Integer> ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( final int int ) { return new ResultMatcher ( ) { @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { assertEquals ( STRING , int , org.springframework.test.web.servlet.result.MvcResult . getResponse ( ) . getStatus ( ) ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { assertEquals ( STRING , int , org.springframework.test.web.servlet.result.MvcResult . getResponse ( ) . getStatus ( ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return new ResultMatcher ( ) { @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { assertEquals ( STRING + org.springframework.test.web.servlet.result.MvcResult . getResponse ( ) . getStatus ( ) , HttpStatus . Series . INFORMATIONAL , HttpStatus.Series ( org.springframework.test.web.servlet.result.MvcResult ) ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { assertEquals ( STRING + org.springframework.test.web.servlet.result.MvcResult . getResponse ( ) . getStatus ( ) , HttpStatus . Series . INFORMATIONAL , HttpStatus.Series ( org.springframework.test.web.servlet.result.MvcResult ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return new ResultMatcher ( ) { @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { assertEquals ( STRING + org.springframework.test.web.servlet.result.MvcResult . getResponse ( ) . getStatus ( ) , HttpStatus . Series . SUCCESSFUL , HttpStatus.Series ( org.springframework.test.web.servlet.result.MvcResult ) ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { assertEquals ( STRING + org.springframework.test.web.servlet.result.MvcResult . getResponse ( ) . getStatus ( ) , HttpStatus . Series . SUCCESSFUL , HttpStatus.Series ( org.springframework.test.web.servlet.result.MvcResult ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return new ResultMatcher ( ) { @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { assertEquals ( STRING + org.springframework.test.web.servlet.result.MvcResult . getResponse ( ) . getStatus ( ) , HttpStatus . Series . REDIRECTION , HttpStatus.Series ( org.springframework.test.web.servlet.result.MvcResult ) ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { assertEquals ( STRING + org.springframework.test.web.servlet.result.MvcResult . getResponse ( ) . getStatus ( ) , HttpStatus . Series . REDIRECTION , HttpStatus.Series ( org.springframework.test.web.servlet.result.MvcResult ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return new ResultMatcher ( ) { @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { assertEquals ( STRING + org.springframework.test.web.servlet.result.MvcResult . getResponse ( ) . getStatus ( ) , HttpStatus . Series . CLIENT_ERROR , HttpStatus.Series ( org.springframework.test.web.servlet.result.MvcResult ) ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { assertEquals ( STRING + org.springframework.test.web.servlet.result.MvcResult . getResponse ( ) . getStatus ( ) , HttpStatus . Series . CLIENT_ERROR , HttpStatus.Series ( org.springframework.test.web.servlet.result.MvcResult ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return new ResultMatcher ( ) { @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { assertEquals ( STRING + org.springframework.test.web.servlet.result.MvcResult . getResponse ( ) . getStatus ( ) , HttpStatus . Series . SERVER_ERROR , HttpStatus.Series ( org.springframework.test.web.servlet.result.MvcResult ) ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { assertEquals ( STRING + org.springframework.test.web.servlet.result.MvcResult . getResponse ( ) . getStatus ( ) , HttpStatus . Series . SERVER_ERROR , HttpStatus.Series ( org.springframework.test.web.servlet.result.MvcResult ) ) ; }  <METHOD_END>
<METHOD_START> private HttpStatus . HttpStatus.Series HttpStatus.Series ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) { int int = org.springframework.test.web.servlet.result.MvcResult . getResponse ( ) . getStatus ( ) ; HttpStatus org.springframework.test.web.servlet.result.HttpStatus = HttpStatus . valueOf ( int ) ; return org.springframework.test.web.servlet.result.HttpStatus . series ( ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( final Matcher < ? super java.lang.String > org.springframework.test.web.servlet.result.Matcher<? super java.lang.String> ) { return new ResultMatcher ( ) { @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { assertThat ( STRING , org.springframework.test.web.servlet.result.MvcResult . getResponse ( ) . getErrorMessage ( ) , org.springframework.test.web.servlet.result.Matcher<> ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { assertThat ( STRING , org.springframework.test.web.servlet.result.MvcResult . getResponse ( ) . getErrorMessage ( ) , org.springframework.test.web.servlet.result.Matcher<> ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( final java.lang.String java.lang.String ) { return new ResultMatcher ( ) { @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { assertEquals ( STRING , java.lang.String , org.springframework.test.web.servlet.result.MvcResult . getResponse ( ) . getErrorMessage ( ) ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { assertEquals ( STRING , java.lang.String , org.springframework.test.web.servlet.result.MvcResult . getResponse ( ) . getErrorMessage ( ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . CONTINUE ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . SWITCHING_PROTOCOLS ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . PROCESSING ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . valueOf ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . OK ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . CREATED ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . ACCEPTED ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . NON_AUTHORITATIVE_INFORMATION ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . NO_CONTENT ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . RESET_CONTENT ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . PARTIAL_CONTENT ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . MULTI_STATUS ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . ALREADY_REPORTED ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . IM_USED ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . MULTIPLE_CHOICES ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . MOVED_PERMANENTLY ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . FOUND ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Deprecated public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . MOVED_TEMPORARILY ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . SEE_OTHER ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . NOT_MODIFIED ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Deprecated public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . USE_PROXY ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . TEMPORARY_REDIRECT ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . valueOf ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . BAD_REQUEST ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . UNAUTHORIZED ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . PAYMENT_REQUIRED ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . FORBIDDEN ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . NOT_FOUND ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . METHOD_NOT_ALLOWED ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . NOT_ACCEPTABLE ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . PROXY_AUTHENTICATION_REQUIRED ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . REQUEST_TIMEOUT ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . CONFLICT ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . GONE ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . LENGTH_REQUIRED ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . PRECONDITION_FAILED ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . PAYLOAD_TOO_LARGE ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Deprecated public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . REQUEST_ENTITY_TOO_LARGE ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . URI_TOO_LONG ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Deprecated public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . REQUEST_URI_TOO_LONG ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . UNSUPPORTED_MEDIA_TYPE ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . REQUESTED_RANGE_NOT_SATISFIABLE ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . EXPECTATION_FAILED ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . valueOf ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Deprecated public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . INSUFFICIENT_SPACE_ON_RESOURCE ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Deprecated public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . METHOD_FAILURE ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Deprecated public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . DESTINATION_LOCKED ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . UNPROCESSABLE_ENTITY ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . LOCKED ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . FAILED_DEPENDENCY ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . UPGRADE_REQUIRED ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . valueOf ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . valueOf ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . valueOf ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . valueOf ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . INTERNAL_SERVER_ERROR ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . NOT_IMPLEMENTED ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . BAD_GATEWAY ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . SERVICE_UNAVAILABLE ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . GATEWAY_TIMEOUT ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . HTTP_VERSION_NOT_SUPPORTED ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . VARIANT_ALSO_NEGOTIATES ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . INSUFFICIENT_STORAGE ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . LOOP_DETECTED ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . valueOf ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . NOT_EXTENDED ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return org.springframework.test.web.servlet.result.ResultMatcher ( HttpStatus . valueOf ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( final HttpStatus org.springframework.test.web.servlet.result.HttpStatus ) { return new ResultMatcher ( ) { @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) { assertEquals ( STRING , org.springframework.test.web.servlet.result.HttpStatus . value ( ) , org.springframework.test.web.servlet.result.MvcResult . getResponse ( ) . getStatus ( ) ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) { assertEquals ( STRING , org.springframework.test.web.servlet.result.HttpStatus . value ( ) , org.springframework.test.web.servlet.result.MvcResult . getResponse ( ) . getStatus ( ) ) ; }  <METHOD_END>