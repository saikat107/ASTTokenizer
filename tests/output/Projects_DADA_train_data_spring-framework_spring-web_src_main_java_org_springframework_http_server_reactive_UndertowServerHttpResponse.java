<METHOD_START> public void ( HttpServerExchange org.springframework.http.server.reactive.HttpServerExchange , DataBufferFactory org.springframework.http.server.reactive.DataBufferFactory ) { super( org.springframework.http.server.reactive.DataBufferFactory ); Assert . notNull ( org.springframework.http.server.reactive.HttpServerExchange , STRING ) ; this . org.springframework.http.server.reactive.HttpServerExchange = org.springframework.http.server.reactive.HttpServerExchange ; }  <METHOD_END>
<METHOD_START> public org.springframework.http.server.reactive.HttpServerExchange org.springframework.http.server.reactive.HttpServerExchange ( ) { return this . org.springframework.http.server.reactive.HttpServerExchange ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { HttpStatus org.springframework.http.server.reactive.HttpStatus = this . getStatusCode ( ) ; if ( org.springframework.http.server.reactive.HttpStatus != null ) { org.springframework.http.server.reactive.HttpServerExchange ( ) . setStatusCode ( org.springframework.http.server.reactive.HttpStatus . value ( ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.http.server.reactive.Mono<java.lang.Void> < java.lang.Void > org.springframework.http.server.reactive.Mono<java.lang.Void> ( java.io.File java.io.File , long long , long long ) { return doCommit ( ( ) { FileChannel source = null ; try { source = new FileInputStream ( file ) . getChannel ( ) ; StreamSinkChannel destination = getUndertowExchange ( ) . getResponseChannel ( ) ; Channels . transferBlocking ( destination , source , position , count ) ; return Mono . empty ( ) ; } catch ( IOException ex ) { return Mono . error ( ex ) ; } finally { if ( source != null ) { try { source . close ( ) ; } catch ( IOException ex ) { } } } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { for ( java.util.Map . java.util.Map.Entry<java.lang.String,java.util.List<java.lang.String>> < java.lang.String , java.util.List<java.lang.String> < java.lang.String > > java.util.Map.Entry<java.lang.String,java.util.List<java.lang.String>> : getHeaders ( ) . entrySet ( ) ) { HttpString org.springframework.http.server.reactive.HttpString = HttpString . tryFromString ( java.util.Map.Entry<java.lang.String,java.util.List<java.lang.String>> . java.lang.String ( ) ) ; this . org.springframework.http.server.reactive.HttpServerExchange . getResponseHeaders ( ) . addAll ( org.springframework.http.server.reactive.HttpString , java.util.Map.Entry<java.lang.String,java.util.List<java.lang.String>> . java.util.List<java.lang.String> ( ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { for ( java.lang.String java.lang.String : getCookies ( ) . keySet ( ) ) { for ( ResponseCookie org.springframework.http.server.reactive.ResponseCookie : getCookies ( ) . get ( java.lang.String ) ) { Cookie org.springframework.http.server.reactive.Cookie = new CookieImpl ( java.lang.String , org.springframework.http.server.reactive.ResponseCookie . getValue ( ) ) ; if ( ! org.springframework.http.server.reactive.ResponseCookie . getMaxAge ( ) . isNegative ( ) ) { org.springframework.http.server.reactive.Cookie . setMaxAge ( ( int ) org.springframework.http.server.reactive.ResponseCookie . getMaxAge ( ) . getSeconds ( ) ) ; } org.springframework.http.server.reactive.ResponseCookie . getDomain ( ) . ifPresent ( org.springframework.http.server.reactive.Cookie :: setDomain ) ; org.springframework.http.server.reactive.ResponseCookie . getPath ( ) . ifPresent ( org.springframework.http.server.reactive.Cookie :: setPath ) ; org.springframework.http.server.reactive.Cookie . setSecure ( org.springframework.http.server.reactive.ResponseCookie . isSecure ( ) ) ; org.springframework.http.server.reactive.Cookie . setHttpOnly ( org.springframework.http.server.reactive.ResponseCookie . isHttpOnly ( ) ) ; this . org.springframework.http.server.reactive.HttpServerExchange . getResponseCookies ( ) . putIfAbsent ( java.lang.String , org.springframework.http.server.reactive.Cookie ) ; } } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.http.server.reactive.Processor<? super org.springframework.http.server.reactive.Publisher<? extends org.springframework.http.server.reactive.DataBuffer>,java.lang.Void> < ? super Publisher < ? extends DataBuffer > , java.lang.Void > org.springframework.http.server.reactive.Processor<? super org.springframework.http.server.reactive.Publisher<? extends org.springframework.http.server.reactive.DataBuffer>,java.lang.Void> ( ) { return new org.springframework.http.server.reactive.UndertowServerHttpResponse.ResponseBodyFlushProcessor ( ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.http.server.reactive.UndertowServerHttpResponse.ResponseBodyProcessor org.springframework.http.server.reactive.UndertowServerHttpResponse.ResponseBodyProcessor ( ) { if ( this . org.springframework.http.server.reactive.StreamSinkChannel == null ) { this . org.springframework.http.server.reactive.StreamSinkChannel = this . org.springframework.http.server.reactive.HttpServerExchange . getResponseChannel ( ) ; } org.springframework.http.server.reactive.UndertowServerHttpResponse.ResponseBodyProcessor org.springframework.http.server.reactive.UndertowServerHttpResponse.ResponseBodyProcessor = new org.springframework.http.server.reactive.UndertowServerHttpResponse.ResponseBodyProcessor ( this . org.springframework.http.server.reactive.StreamSinkChannel ) ; org.springframework.http.server.reactive.UndertowServerHttpResponse.ResponseBodyProcessor . void ( ) ; return org.springframework.http.server.reactive.UndertowServerHttpResponse.ResponseBodyProcessor ; }  <METHOD_END>
<METHOD_START> public void ( StreamSinkChannel org.springframework.http.server.reactive.StreamSinkChannel ) { Assert . notNull ( org.springframework.http.server.reactive.StreamSinkChannel , STRING ) ; this . org.springframework.http.server.reactive.StreamSinkChannel = org.springframework.http.server.reactive.StreamSinkChannel ; }  <METHOD_END>
<METHOD_START> public void void ( ) { this . org.springframework.http.server.reactive.StreamSinkChannel . getWriteSetter ( ) . set ( c -> onWritePossible ( ) ) ; this . org.springframework.http.server.reactive.StreamSinkChannel . resumeWrites ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( ) { return false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( DataBuffer org.springframework.http.server.reactive.DataBuffer ) throws java.io.IOException { if ( this . java.nio.ByteBuffer == null ) { return false ; } if ( logger . isTraceEnabled ( ) ) { logger . trace ( STRING + org.springframework.http.server.reactive.DataBuffer ) ; } int int = this . java.nio.ByteBuffer . int ( ) ; int int = int ( this . java.nio.ByteBuffer ) ; if ( logger . isTraceEnabled ( ) ) { logger . trace ( STRING + int + STRING + int ) ; } return int == int ; }  <METHOD_END>
<METHOD_START> private int int ( java.nio.ByteBuffer java.nio.ByteBuffer ) throws java.io.IOException { int int ; int int = NUMBER ; do { int = this . org.springframework.http.server.reactive.StreamSinkChannel . write ( java.nio.ByteBuffer ) ; int += int ; } while ( java.nio.ByteBuffer . boolean ( ) && int > NUMBER ); return int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( DataBuffer org.springframework.http.server.reactive.DataBuffer ) { super. receiveData ( org.springframework.http.server.reactive.DataBuffer ) ; this . java.nio.ByteBuffer = org.springframework.http.server.reactive.DataBuffer . asByteBuffer ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { if ( logger . isTraceEnabled ( ) ) { logger . trace ( STRING + this . currentData ) ; } DataBufferUtils . release ( this . currentData ) ; this . currentData = null ; this . java.nio.ByteBuffer = null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( DataBuffer org.springframework.http.server.reactive.DataBuffer ) { return ( org.springframework.http.server.reactive.DataBuffer . readableByteCount ( ) == NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.http.server.reactive.Processor<? super org.springframework.http.server.reactive.DataBuffer,java.lang.Void> < ? super DataBuffer , java.lang.Void > org.springframework.http.server.reactive.Processor<? super org.springframework.http.server.reactive.DataBuffer,java.lang.Void> ( ) { return org.springframework.http.server.reactive.UndertowServerHttpResponse .this . org.springframework.http.server.reactive.UndertowServerHttpResponse.ResponseBodyProcessor ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) java.io.IOException { if ( org.springframework.http.server.reactive.UndertowServerHttpResponse .this . org.springframework.http.server.reactive.StreamSinkChannel != null ) { if ( logger . isTraceEnabled ( ) ) { logger . trace ( STRING ) ; } org.springframework.http.server.reactive.UndertowServerHttpResponse .this . org.springframework.http.server.reactive.StreamSinkChannel . flush ( ) ; } }  <METHOD_END>