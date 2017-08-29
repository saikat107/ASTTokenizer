<METHOD_START> @ Before public final void void ( ) java.lang.Exception { this . org.springframework.http.client.AsyncClientHttpRequestFactory = org.springframework.http.client.AsyncClientHttpRequestFactory ( ) ; if ( this . org.springframework.http.client.AsyncClientHttpRequestFactory instanceof InitializingBean ) { ( ( InitializingBean ) this . org.springframework.http.client.AsyncClientHttpRequestFactory ) . afterPropertiesSet ( ) ; } }  <METHOD_END>
<METHOD_START> @ After public final void void ( ) java.lang.Exception { if ( this . org.springframework.http.client.AsyncClientHttpRequestFactory instanceof DisposableBean ) { ( ( DisposableBean ) this . org.springframework.http.client.AsyncClientHttpRequestFactory ) . destroy ( ) ; } }  <METHOD_END>
<METHOD_START> protected abstract org.springframework.http.client.AsyncClientHttpRequestFactory org.springframework.http.client.AsyncClientHttpRequestFactory ( )  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.net.URI java.net.URI = new java.net.URI ( baseUrl + STRING ) ; AsyncClientHttpRequest org.springframework.http.client.AsyncClientHttpRequest = this . org.springframework.http.client.AsyncClientHttpRequestFactory . createAsyncRequest ( java.net.URI , HttpMethod . GET ) ; assertEquals ( STRING , HttpMethod . GET , org.springframework.http.client.AsyncClientHttpRequest . getMethod ( ) ) ; assertEquals ( STRING , java.net.URI , org.springframework.http.client.AsyncClientHttpRequest . getURI ( ) ) ; java.util.concurrent.Future<org.springframework.http.client.ClientHttpResponse> < ClientHttpResponse > java.util.concurrent.Future<org.springframework.http.client.ClientHttpResponse> = org.springframework.http.client.AsyncClientHttpRequest . executeAsync ( ) ; ClientHttpResponse org.springframework.http.client.ClientHttpResponse = java.util.concurrent.Future<org.springframework.http.client.ClientHttpResponse> . get ( ) ; try { assertEquals ( STRING , HttpStatus . NOT_FOUND , org.springframework.http.client.ClientHttpResponse . getStatusCode ( ) ) ; } finally { org.springframework.http.client.ClientHttpResponse . close ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.net.URI java.net.URI = new java.net.URI ( baseUrl + STRING ) ; AsyncClientHttpRequest org.springframework.http.client.AsyncClientHttpRequest = this . org.springframework.http.client.AsyncClientHttpRequestFactory . createAsyncRequest ( java.net.URI , HttpMethod . GET ) ; assertEquals ( STRING , HttpMethod . GET , org.springframework.http.client.AsyncClientHttpRequest . getMethod ( ) ) ; assertEquals ( STRING , java.net.URI , org.springframework.http.client.AsyncClientHttpRequest . getURI ( ) ) ; ListenableFuture < ClientHttpResponse > org.springframework.http.client.ListenableFuture<org.springframework.http.client.ClientHttpResponse> = org.springframework.http.client.AsyncClientHttpRequest . executeAsync ( ) ; org.springframework.http.client.ListenableFuture<org.springframework.http.client.ClientHttpResponse> . addCallback ( new ListenableFutureCallback < ClientHttpResponse > ( ) { @ java.lang.Override public void void ( ClientHttpResponse org.springframework.http.client.ClientHttpResponse ) { try { assertEquals ( STRING , HttpStatus . NOT_FOUND , org.springframework.http.client.ClientHttpResponse . getStatusCode ( ) ) ; } catch ( java.io.IOException java.io.IOException ) { fail ( java.io.IOException . java.lang.String ( ) ) ; } } @ java.lang.Override public void void ( java.lang.Throwable java.lang.Throwable ) { fail ( java.lang.Throwable . java.lang.String ( ) ) ; } } ) ; ClientHttpResponse org.springframework.http.client.ClientHttpResponse = org.springframework.http.client.ListenableFuture<org.springframework.http.client.ClientHttpResponse> . get ( ) ; try { assertEquals ( STRING , HttpStatus . NOT_FOUND , org.springframework.http.client.ClientHttpResponse . getStatusCode ( ) ) ; } finally { org.springframework.http.client.ClientHttpResponse . close ( ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ClientHttpResponse org.springframework.http.client.ClientHttpResponse ) { try { assertEquals ( STRING , HttpStatus . NOT_FOUND , org.springframework.http.client.ClientHttpResponse . getStatusCode ( ) ) ; } catch ( java.io.IOException java.io.IOException ) { fail ( java.io.IOException . java.lang.String ( ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Throwable java.lang.Throwable ) { fail ( java.lang.Throwable . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { AsyncClientHttpRequest org.springframework.http.client.AsyncClientHttpRequest = this . org.springframework.http.client.AsyncClientHttpRequestFactory . createAsyncRequest ( new java.net.URI ( baseUrl + STRING ) , HttpMethod . PUT ) ; assertEquals ( STRING , HttpMethod . PUT , org.springframework.http.client.AsyncClientHttpRequest . getMethod ( ) ) ; java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; org.springframework.http.client.AsyncClientHttpRequest . getHeaders ( ) . add ( java.lang.String , java.lang.String ) ; java.lang.String java.lang.String = STRING ; org.springframework.http.client.AsyncClientHttpRequest . getHeaders ( ) . add ( java.lang.String , java.lang.String ) ; final byte [] byte[] = STRING . byte[] ( STRING ) ; org.springframework.http.client.AsyncClientHttpRequest . getHeaders ( ) . setContentLength ( byte[] . int ) ; if ( org.springframework.http.client.AsyncClientHttpRequest instanceof StreamingHttpOutputMessage ) { StreamingHttpOutputMessage org.springframework.http.client.StreamingHttpOutputMessage = ( StreamingHttpOutputMessage ) org.springframework.http.client.AsyncClientHttpRequest ; org.springframework.http.client.StreamingHttpOutputMessage . setBody ( outputStream -> StreamUtils . copy ( body , outputStream ) ) ; } else { StreamUtils . copy ( byte[] , org.springframework.http.client.AsyncClientHttpRequest . getBody ( ) ) ; } java.util.concurrent.Future<org.springframework.http.client.ClientHttpResponse> < ClientHttpResponse > java.util.concurrent.Future<org.springframework.http.client.ClientHttpResponse> = org.springframework.http.client.AsyncClientHttpRequest . executeAsync ( ) ; ClientHttpResponse org.springframework.http.client.ClientHttpResponse = java.util.concurrent.Future<org.springframework.http.client.ClientHttpResponse> . get ( ) ; try { assertEquals ( STRING , HttpStatus . OK , org.springframework.http.client.ClientHttpResponse . getStatusCode ( ) ) ; assertTrue ( STRING , org.springframework.http.client.ClientHttpResponse . getHeaders ( ) . containsKey ( java.lang.String ) ) ; assertEquals ( STRING , java.util.Arrays . java.util.List<java.lang.String> ( java.lang.String , java.lang.String ) , org.springframework.http.client.ClientHttpResponse . getHeaders ( ) . get ( java.lang.String ) ) ; byte [] byte[] = FileCopyUtils . copyToByteArray ( org.springframework.http.client.ClientHttpResponse . getBody ( ) ) ; assertTrue ( STRING , java.util.Arrays . boolean ( byte[] , byte[] ) ) ; } finally { org.springframework.http.client.ClientHttpResponse . close ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { AsyncClientHttpRequest org.springframework.http.client.AsyncClientHttpRequest = this . org.springframework.http.client.AsyncClientHttpRequestFactory . createAsyncRequest ( new java.net.URI ( baseUrl + STRING ) , HttpMethod . POST ) ; final byte [] byte[] = STRING . byte[] ( STRING ) ; if ( org.springframework.http.client.AsyncClientHttpRequest instanceof StreamingHttpOutputMessage ) { StreamingHttpOutputMessage org.springframework.http.client.StreamingHttpOutputMessage = ( StreamingHttpOutputMessage ) org.springframework.http.client.AsyncClientHttpRequest ; org.springframework.http.client.StreamingHttpOutputMessage . setBody ( outputStream -> StreamUtils . copy ( body , outputStream ) ) ; } else { StreamUtils . copy ( byte[] , org.springframework.http.client.AsyncClientHttpRequest . getBody ( ) ) ; } java.util.concurrent.Future<org.springframework.http.client.ClientHttpResponse> < ClientHttpResponse > java.util.concurrent.Future<org.springframework.http.client.ClientHttpResponse> = org.springframework.http.client.AsyncClientHttpRequest . executeAsync ( ) ; ClientHttpResponse org.springframework.http.client.ClientHttpResponse = java.util.concurrent.Future<org.springframework.http.client.ClientHttpResponse> . get ( ) ; try { FileCopyUtils . copy ( byte[] , org.springframework.http.client.AsyncClientHttpRequest . getBody ( ) ) ; fail ( STRING ) ; } catch ( java.lang.IllegalStateException java.lang.IllegalStateException ) { } finally { org.springframework.http.client.ClientHttpResponse . close ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { AsyncClientHttpRequest org.springframework.http.client.AsyncClientHttpRequest = this . org.springframework.http.client.AsyncClientHttpRequestFactory . createAsyncRequest ( new java.net.URI ( baseUrl + STRING ) , HttpMethod . POST ) ; org.springframework.http.client.AsyncClientHttpRequest . getHeaders ( ) . add ( STRING , STRING ) ; byte [] byte[] = STRING . byte[] ( STRING ) ; FileCopyUtils . copy ( byte[] , org.springframework.http.client.AsyncClientHttpRequest . getBody ( ) ) ; java.util.concurrent.Future<org.springframework.http.client.ClientHttpResponse> < ClientHttpResponse > java.util.concurrent.Future<org.springframework.http.client.ClientHttpResponse> = org.springframework.http.client.AsyncClientHttpRequest . executeAsync ( ) ; ClientHttpResponse org.springframework.http.client.ClientHttpResponse = java.util.concurrent.Future<org.springframework.http.client.ClientHttpResponse> . get ( ) ; try { org.springframework.http.client.AsyncClientHttpRequest . getHeaders ( ) . add ( STRING , STRING ) ; fail ( STRING ) ; } catch ( java.lang.UnsupportedOperationException java.lang.UnsupportedOperationException ) { } finally { org.springframework.http.client.ClientHttpResponse . close ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING , HttpMethod . GET ) ; void ( STRING , HttpMethod . HEAD ) ; void ( STRING , HttpMethod . POST ) ; void ( STRING , HttpMethod . PUT ) ; void ( STRING , HttpMethod . OPTIONS ) ; void ( STRING , HttpMethod . DELETE ) ; }  <METHOD_END>
<METHOD_START> protected void void ( java.lang.String java.lang.String , HttpMethod org.springframework.http.client.HttpMethod ) throws java.lang.Exception { ClientHttpResponse org.springframework.http.client.ClientHttpResponse = null ; try { AsyncClientHttpRequest org.springframework.http.client.AsyncClientHttpRequest = this . org.springframework.http.client.AsyncClientHttpRequestFactory . createAsyncRequest ( new java.net.URI ( baseUrl + STRING + java.lang.String ) , org.springframework.http.client.HttpMethod ) ; if ( org.springframework.http.client.HttpMethod == HttpMethod . POST || org.springframework.http.client.HttpMethod == HttpMethod . PUT || org.springframework.http.client.HttpMethod == HttpMethod . PATCH ) { org.springframework.http.client.AsyncClientHttpRequest . getBody ( ) . write ( NUMBER ) ; } java.util.concurrent.Future<org.springframework.http.client.ClientHttpResponse> < ClientHttpResponse > java.util.concurrent.Future<org.springframework.http.client.ClientHttpResponse> = org.springframework.http.client.AsyncClientHttpRequest . executeAsync ( ) ; org.springframework.http.client.ClientHttpResponse = java.util.concurrent.Future<org.springframework.http.client.ClientHttpResponse> . get ( ) ; assertEquals ( STRING , HttpStatus . OK , org.springframework.http.client.ClientHttpResponse . getStatusCode ( ) ) ; assertEquals ( STRING , java.lang.String . java.lang.String ( java.util.Locale . java.util.Locale ) , org.springframework.http.client.AsyncClientHttpRequest . getMethod ( ) . name ( ) ) ; } finally { if ( org.springframework.http.client.ClientHttpResponse != null ) { org.springframework.http.client.ClientHttpResponse . close ( ) ; } } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.net.URI java.net.URI = new java.net.URI ( baseUrl + STRING ) ; AsyncClientHttpRequest org.springframework.http.client.AsyncClientHttpRequest = this . org.springframework.http.client.AsyncClientHttpRequestFactory . createAsyncRequest ( java.net.URI , HttpMethod . GET ) ; java.util.concurrent.Future<org.springframework.http.client.ClientHttpResponse> < ClientHttpResponse > java.util.concurrent.Future<org.springframework.http.client.ClientHttpResponse> = org.springframework.http.client.AsyncClientHttpRequest . executeAsync ( ) ; java.util.concurrent.Future<org.springframework.http.client.ClientHttpResponse> . cancel ( true ) ; assertTrue ( java.util.concurrent.Future<org.springframework.http.client.ClientHttpResponse> . isCancelled ( ) ) ; }  <METHOD_END>