<METHOD_START> @ Test public void void ( ) java.lang.Exception { ResponseEntity < java.lang.String > sample.actuator.ui.ResponseEntity<java.lang.String> = new TestRestTemplate ( ) . getForEntity ( STRING + this . int , java.lang.String .class ) ; assertThat ( sample.actuator.ui.ResponseEntity<java.lang.String> . getStatusCode ( ) ) . isEqualTo ( HttpStatus . OK ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { @ java.lang.SuppressWarnings ( STRING ) ResponseEntity < java.util.Map > sample.actuator.ui.ResponseEntity<java.util.Map> = new TestRestTemplate ( ) . getForEntity ( STRING + this . int + STRING , java.util.Map .class ) ; assertThat ( sample.actuator.ui.ResponseEntity<java.util.Map> . getStatusCode ( ) ) . isEqualTo ( HttpStatus . UNAUTHORIZED ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ResponseEntity < java.lang.String > sample.actuator.ui.ResponseEntity<java.lang.String> = new TestRestTemplate ( ) . getForEntity ( STRING + this . int + STRING , java.lang.String .class ) ; assertThat ( sample.actuator.ui.ResponseEntity<java.lang.String> . getStatusCode ( ) ) . isEqualTo ( HttpStatus . OK ) ; assertThat ( sample.actuator.ui.ResponseEntity<java.lang.String> . getBody ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>