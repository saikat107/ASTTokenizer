<METHOD_START> @ ExceptionHandler org.springframework.data.rest.webmvc.support.ResponseEntity<java.lang.Void> < java.lang.Void > org.springframework.data.rest.webmvc.support.ResponseEntity<java.lang.Void> ( HttpRequestMethodNotSupportedException org.springframework.data.rest.webmvc.support.HttpRequestMethodNotSupportedException ) { HttpHeaders org.springframework.data.rest.webmvc.support.HttpHeaders = new HttpHeaders ( ) ; org.springframework.data.rest.webmvc.support.HttpHeaders . setAllow ( org.springframework.data.rest.webmvc.support.HttpRequestMethodNotSupportedException . getSupportedHttpMethods ( ) ) ; return new ResponseEntity < java.lang.Void > ( org.springframework.data.rest.webmvc.support.HttpHeaders , HttpStatus . INTERNAL_SERVER_ERROR ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Link org.springframework.data.rest.webmvc.support.Link = client . discoverUnique ( STRING ) ; mvc . perform ( get ( org.springframework.data.rest.webmvc.support.Link . getHref ( ) ) ) . andExpect ( status ( ) . isInternalServerError ( ) ) ; }  <METHOD_END>