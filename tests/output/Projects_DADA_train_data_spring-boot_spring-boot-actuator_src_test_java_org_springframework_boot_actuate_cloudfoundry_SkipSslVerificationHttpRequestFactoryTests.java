<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = java.lang.String ( ) ; SkipSslVerificationHttpRequestFactory org.springframework.boot.actuate.cloudfoundry.SkipSslVerificationHttpRequestFactory = new SkipSslVerificationHttpRequestFactory ( ) ; RestTemplate org.springframework.boot.actuate.cloudfoundry.RestTemplate = new RestTemplate ( org.springframework.boot.actuate.cloudfoundry.SkipSslVerificationHttpRequestFactory ) ; ResponseEntity < java.lang.String > org.springframework.boot.actuate.cloudfoundry.ResponseEntity<java.lang.String> = org.springframework.boot.actuate.cloudfoundry.RestTemplate . getForEntity ( java.lang.String , java.lang.String .class ) ; assertThat ( org.springframework.boot.actuate.cloudfoundry.ResponseEntity<java.lang.String> . getStatusCode ( ) ) . isEqualTo ( HttpStatus . OK ) ; this . org.springframework.boot.actuate.cloudfoundry.ExpectedException . expect ( ResourceAccessException .class ) ; this . org.springframework.boot.actuate.cloudfoundry.ExpectedException . expectCause ( org.springframework.boot.actuate.cloudfoundry.Matcher<java.lang.Throwable> ( ) ) ; RestTemplate org.springframework.boot.actuate.cloudfoundry.RestTemplate = new RestTemplate ( ) ; org.springframework.boot.actuate.cloudfoundry.RestTemplate . getForEntity ( java.lang.String , java.lang.String .class ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.actuate.cloudfoundry.Matcher<java.lang.Throwable> < java.lang.Throwable > org.springframework.boot.actuate.cloudfoundry.Matcher<java.lang.Throwable> ( ) { return instanceOf ( javax.net.ssl.SSLHandshakeException .class ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( ) { TomcatServletWebServerFactory org.springframework.boot.actuate.cloudfoundry.TomcatServletWebServerFactory = new TomcatServletWebServerFactory ( NUMBER ) ; org.springframework.boot.actuate.cloudfoundry.TomcatServletWebServerFactory . setSsl ( org.springframework.boot.actuate.cloudfoundry.Ssl ( STRING , STRING ) ) ; WebServer org.springframework.boot.actuate.cloudfoundry.WebServer = org.springframework.boot.actuate.cloudfoundry.TomcatServletWebServerFactory . getWebServer ( new ServletRegistrationBean <> ( new ExampleServlet ( ) , STRING ) ) ; org.springframework.boot.actuate.cloudfoundry.WebServer . start ( ) ; return STRING + org.springframework.boot.actuate.cloudfoundry.WebServer . getPort ( ) + STRING ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.actuate.cloudfoundry.Ssl org.springframework.boot.actuate.cloudfoundry.Ssl ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { Ssl org.springframework.boot.actuate.cloudfoundry.Ssl = new Ssl ( ) ; org.springframework.boot.actuate.cloudfoundry.Ssl . setEnabled ( true ) ; org.springframework.boot.actuate.cloudfoundry.Ssl . setKeyPassword ( java.lang.String ) ; org.springframework.boot.actuate.cloudfoundry.Ssl . setKeyStore ( java.lang.String ) ; org.springframework.boot.actuate.cloudfoundry.Ssl . setKeyStorePassword ( STRING ) ; return org.springframework.boot.actuate.cloudfoundry.Ssl ; }  <METHOD_END>