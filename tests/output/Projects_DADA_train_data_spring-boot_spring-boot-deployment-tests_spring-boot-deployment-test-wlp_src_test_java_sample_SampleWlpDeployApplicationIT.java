<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING + this . int + STRING ; ResponseEntity < java.lang.String > sample.ResponseEntity<java.lang.String> = new TestRestTemplate ( ) . getForEntity ( java.lang.String , java.lang.String .class ) ; assertThat ( sample.ResponseEntity<java.lang.String> . getStatusCode ( ) ) . isEqualTo ( HttpStatus . OK ) ; assertThat ( sample.ResponseEntity<java.lang.String> . getBody ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>