<METHOD_START> @ BeforeClass public static void void ( ) { org.springframework.data.rest.webmvc.Logger = ( Logger ) LoggerFactory . getLogger ( RepositoryRestExceptionHandler .class ) ; org.springframework.data.rest.webmvc.Level = org.springframework.data.rest.webmvc.Logger . getLevel ( ) ; org.springframework.data.rest.webmvc.Logger . setLevel ( Level . OFF ) ; }  <METHOD_END>
<METHOD_START> @ AfterClass public static void void ( ) { org.springframework.data.rest.webmvc.Logger . setLevel ( org.springframework.data.rest.webmvc.Level ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ResponseEntity < ExceptionMessage > org.springframework.data.rest.webmvc.ResponseEntity<org.springframework.data.rest.webmvc.ExceptionMessage> = org.springframework.data.rest.webmvc.RepositoryRestExceptionHandler . handleNotReadable ( new HttpMessageNotReadableException ( STRING ) ) ; assertThat ( org.springframework.data.rest.webmvc.ResponseEntity<org.springframework.data.rest.webmvc.ExceptionMessage> . getStatusCode ( ) ) . isEqualTo ( HttpStatus . BAD_REQUEST ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ResponseEntity < ExceptionMessage > org.springframework.data.rest.webmvc.ResponseEntity<org.springframework.data.rest.webmvc.ExceptionMessage> = org.springframework.data.rest.webmvc.RepositoryRestExceptionHandler . handleConflict ( new DataIntegrityViolationException ( STRING ) ) ; assertThat ( org.springframework.data.rest.webmvc.ResponseEntity<org.springframework.data.rest.webmvc.ExceptionMessage> . getStatusCode ( ) ) . isEqualTo ( HttpStatus . CONFLICT ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.String java.lang.String = STRING ; ResponseEntity < ExceptionMessage > org.springframework.data.rest.webmvc.ResponseEntity<org.springframework.data.rest.webmvc.ExceptionMessage> = org.springframework.data.rest.webmvc.RepositoryRestExceptionHandler . handleMiscFailures ( new java.lang.Exception ( java.lang.String ) ) ; assertThat ( org.springframework.data.rest.webmvc.ResponseEntity<org.springframework.data.rest.webmvc.ExceptionMessage> . getBody ( ) ) . isNotNull ( ) ; assertThat ( org.springframework.data.rest.webmvc.ResponseEntity<org.springframework.data.rest.webmvc.ExceptionMessage> . getBody ( ) . getMessage ( ) ) . isEqualTo ( java.lang.String ) ; }  <METHOD_END>