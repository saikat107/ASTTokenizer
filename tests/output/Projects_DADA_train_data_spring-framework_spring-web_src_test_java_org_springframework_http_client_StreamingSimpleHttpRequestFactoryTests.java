<METHOD_START> @ java.lang.Override protected org.springframework.http.client.ClientHttpRequestFactory org.springframework.http.client.ClientHttpRequestFactory ( ) { SimpleClientHttpRequestFactory org.springframework.http.client.SimpleClientHttpRequestFactory = new SimpleClientHttpRequestFactory ( ) ; org.springframework.http.client.SimpleClientHttpRequestFactory . setBufferRequestBody ( false ) ; return org.springframework.http.client.SimpleClientHttpRequestFactory ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { final java.lang.String java.lang.String = STRING ; final java.lang.String java.lang.String = STRING ; ClientHttpRequestInterceptor org.springframework.http.client.ClientHttpRequestInterceptor = new ClientHttpRequestInterceptor ( ) { @ java.lang.Override public org.springframework.http.client.ClientHttpResponse org.springframework.http.client.ClientHttpResponse ( HttpRequest org.springframework.http.client.HttpRequest , byte [] byte[] , ClientHttpRequestExecution org.springframework.http.client.ClientHttpRequestExecution )					throws java.io.IOException { org.springframework.http.client.HttpRequest . getHeaders ( ) . add ( java.lang.String , java.lang.String ) ; return org.springframework.http.client.ClientHttpRequestExecution . execute ( org.springframework.http.client.HttpRequest , byte[] ) ; } } ; InterceptingClientHttpRequestFactory org.springframework.http.client.InterceptingClientHttpRequestFactory = new InterceptingClientHttpRequestFactory ( org.springframework.http.client.ClientHttpRequestFactory ( ) , java.util.Collections . java.util.List ( org.springframework.http.client.ClientHttpRequestInterceptor ) ) ; ClientHttpResponse org.springframework.http.client.ClientHttpResponse = null ; try { ClientHttpRequest org.springframework.http.client.ClientHttpRequest = org.springframework.http.client.InterceptingClientHttpRequestFactory . createRequest ( new java.net.URI ( baseUrl + STRING ) , HttpMethod . GET ) ; org.springframework.http.client.ClientHttpResponse = org.springframework.http.client.ClientHttpRequest . execute ( ) ; assertEquals ( STRING , HttpStatus . OK , org.springframework.http.client.ClientHttpResponse . getStatusCode ( ) ) ; HttpHeaders org.springframework.http.client.HttpHeaders = org.springframework.http.client.ClientHttpResponse . getHeaders ( ) ; assertEquals ( STRING , java.lang.String , org.springframework.http.client.HttpHeaders . getFirst ( java.lang.String ) ) ; } finally { if ( org.springframework.http.client.ClientHttpResponse != null ) { org.springframework.http.client.ClientHttpResponse . close ( ) ; } } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.http.client.ClientHttpResponse org.springframework.http.client.ClientHttpResponse ( HttpRequest org.springframework.http.client.HttpRequest , byte [] byte[] , ClientHttpRequestExecution org.springframework.http.client.ClientHttpRequestExecution )					throws java.io.IOException { org.springframework.http.client.HttpRequest . getHeaders ( ) . add ( java.lang.String , java.lang.String ) ; return org.springframework.http.client.ClientHttpRequestExecution . execute ( org.springframework.http.client.HttpRequest , byte[] ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Ignore public void void ( ) java.lang.Exception { java.util.Random java.util.Random = new java.util.Random ( ) ; ClientHttpResponse org.springframework.http.client.ClientHttpResponse = null ; try { ClientHttpRequest org.springframework.http.client.ClientHttpRequest = factory . createRequest ( new java.net.URI ( baseUrl + STRING ) , HttpMethod . POST ) ; final int int = NUMBER ; final int int = java.lang.Integer . int / int ; java.io.OutputStream java.io.OutputStream = org.springframework.http.client.ClientHttpRequest . getBody ( ) ; for ( int int = NUMBER ; int < int ; int ++ ) { byte [] byte[] = new byte [ int ] ; java.util.Random . void ( byte[] ) ; java.io.OutputStream . void ( byte[] ) ; } org.springframework.http.client.ClientHttpResponse = org.springframework.http.client.ClientHttpRequest . execute ( ) ; assertEquals ( STRING , HttpStatus . OK , org.springframework.http.client.ClientHttpResponse . getStatusCode ( ) ) ; } finally { if ( org.springframework.http.client.ClientHttpResponse != null ) { org.springframework.http.client.ClientHttpResponse . close ( ) ; } } }  <METHOD_END>