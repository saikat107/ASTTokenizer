<METHOD_START> @ Test public void void ( ) java.lang.Exception { ResponseEntity < java.lang.String > sample.tomcat.jsp.ResponseEntity<java.lang.String> = this . sample.tomcat.jsp.TestRestTemplate . getForEntity ( STRING , java.lang.String .class ) ; assertThat ( sample.tomcat.jsp.ResponseEntity<java.lang.String> . getStatusCode ( ) ) . isEqualTo ( HttpStatus . OK ) ; assertThat ( sample.tomcat.jsp.ResponseEntity<java.lang.String> . getBody ( ) ) . contains ( STRING ) ; }  <METHOD_END>