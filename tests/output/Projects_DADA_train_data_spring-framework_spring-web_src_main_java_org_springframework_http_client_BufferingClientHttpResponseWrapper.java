<METHOD_START> void ( ClientHttpResponse org.springframework.http.client.ClientHttpResponse ) { this . org.springframework.http.client.ClientHttpResponse = org.springframework.http.client.ClientHttpResponse ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.http.client.HttpStatus org.springframework.http.client.HttpStatus ( ) java.io.IOException { return this . org.springframework.http.client.ClientHttpResponse . getStatusCode ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) java.io.IOException { return this . org.springframework.http.client.ClientHttpResponse . getRawStatusCode ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) java.io.IOException { return this . org.springframework.http.client.ClientHttpResponse . getStatusText ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.http.client.HttpHeaders org.springframework.http.client.HttpHeaders ( ) { return this . org.springframework.http.client.ClientHttpResponse . getHeaders ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.io.InputStream java.io.InputStream ( ) java.io.IOException { if ( this . byte[] == null ) { this . byte[] = StreamUtils . copyToByteArray ( this . org.springframework.http.client.ClientHttpResponse . getBody ( ) ) ; } return new java.io.ByteArrayInputStream ( this . byte[] ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { this . org.springframework.http.client.ClientHttpResponse . close ( ) ; }  <METHOD_END>