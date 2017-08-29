<METHOD_START> public void ( java.lang.String java.lang.String , SockJsServiceConfig org.springframework.web.socket.sockjs.transport.session.SockJsServiceConfig , WebSocketHandler org.springframework.web.socket.sockjs.transport.session.WebSocketHandler , java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { super( java.lang.String , org.springframework.web.socket.sockjs.transport.session.SockJsServiceConfig , org.springframework.web.socket.sockjs.transport.session.WebSocketHandler , java.util.Map<java.lang.String,java.lang.Object> ); this . java.util.Queue<java.lang.String> = new java.util.concurrent.LinkedBlockingQueue <> ( org.springframework.web.socket.sockjs.transport.session.SockJsServiceConfig . getHttpMessageCacheSize ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.net.URI java.net.URI ( ) { return this . java.net.URI ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.socket.sockjs.transport.session.HttpHeaders org.springframework.web.socket.sockjs.transport.session.HttpHeaders ( ) { return this . org.springframework.web.socket.sockjs.transport.session.HttpHeaders ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.security.Principal java.security.Principal ( ) { return this . java.security.Principal ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.net.InetSocketAddress java.net.InetSocketAddress ( ) { return this . java.net.InetSocketAddress ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.net.InetSocketAddress java.net.InetSocketAddress ( ) { return this . java.net.InetSocketAddress ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> protected java.util.Queue<java.lang.String> < java.lang.String > java.util.Queue<java.lang.String> ( ) { return this . java.util.Queue<java.lang.String> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { ServerHttpAsyncRequestControl org.springframework.web.socket.sockjs.transport.session.ServerHttpAsyncRequestControl = this . org.springframework.web.socket.sockjs.transport.session.ServerHttpAsyncRequestControl ; return ( org.springframework.web.socket.sockjs.transport.session.ServerHttpAsyncRequestControl != null && ! org.springframework.web.socket.sockjs.transport.session.ServerHttpAsyncRequestControl . isCompleted ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( int int ) { }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return - NUMBER ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( int int ) { }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return - NUMBER ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.List<org.springframework.web.socket.sockjs.transport.session.WebSocketExtension> < WebSocketExtension > java.util.List<org.springframework.web.socket.sockjs.transport.session.WebSocketExtension> ( ) { return java.util.Collections . java.util.List<org.springframework.web.socket.sockjs.transport.session.WebSocketExtension> ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( ServerHttpRequest org.springframework.web.socket.sockjs.transport.session.ServerHttpRequest , ServerHttpResponse org.springframework.web.socket.sockjs.transport.session.ServerHttpResponse , SockJsFrameFormat org.springframework.web.socket.sockjs.transport.session.SockJsFrameFormat ) throws org.springframework.web.socket.sockjs.transport.session.SockJsException { this . java.net.URI = org.springframework.web.socket.sockjs.transport.session.ServerHttpRequest . getURI ( ) ; this . org.springframework.web.socket.sockjs.transport.session.HttpHeaders = org.springframework.web.socket.sockjs.transport.session.ServerHttpRequest . getHeaders ( ) ; this . java.security.Principal = org.springframework.web.socket.sockjs.transport.session.ServerHttpRequest . getPrincipal ( ) ; try { this . java.net.InetSocketAddress = org.springframework.web.socket.sockjs.transport.session.ServerHttpRequest . getLocalAddress ( ) ; } catch ( java.lang.Exception java.lang.Exception ) { } try { this . java.net.InetSocketAddress = org.springframework.web.socket.sockjs.transport.session.ServerHttpRequest . getRemoteAddress ( ) ; } catch ( java.lang.Exception java.lang.Exception ) { } synchronized ( this . responseLock ) { try { this . org.springframework.web.socket.sockjs.transport.session.ServerHttpResponse = org.springframework.web.socket.sockjs.transport.session.ServerHttpResponse ; this . org.springframework.web.socket.sockjs.transport.session.SockJsFrameFormat = org.springframework.web.socket.sockjs.transport.session.SockJsFrameFormat ; this . org.springframework.web.socket.sockjs.transport.session.ServerHttpAsyncRequestControl = org.springframework.web.socket.sockjs.transport.session.ServerHttpRequest . getAsyncRequestControl ( org.springframework.web.socket.sockjs.transport.session.ServerHttpResponse ) ; this . org.springframework.web.socket.sockjs.transport.session.ServerHttpAsyncRequestControl . start ( - NUMBER ) ; void ( org.springframework.web.socket.sockjs.transport.session.ServerHttpRequest ) ; delegateConnectionEstablished ( ) ; void ( org.springframework.web.socket.sockjs.transport.session.ServerHttpRequest , org.springframework.web.socket.sockjs.transport.session.ServerHttpResponse , true ) ; this . boolean = boolean ( ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { tryCloseWithSockJsTransportError ( java.lang.Throwable , CloseStatus . SERVER_ERROR ) ; throw new SockJsTransportFailureException ( STRING , getId ( ) , java.lang.Throwable ) ; } } }  <METHOD_END>
<METHOD_START> public void void ( ServerHttpRequest org.springframework.web.socket.sockjs.transport.session.ServerHttpRequest , ServerHttpResponse org.springframework.web.socket.sockjs.transport.session.ServerHttpResponse , SockJsFrameFormat org.springframework.web.socket.sockjs.transport.session.SockJsFrameFormat ) throws org.springframework.web.socket.sockjs.transport.session.SockJsException { synchronized ( this . responseLock ) { try { if ( isClosed ( ) ) { org.springframework.web.socket.sockjs.transport.session.ServerHttpResponse . getBody ( ) . write ( SockJsFrame . closeFrameGoAway ( ) . getContentBytes ( ) ) ; return; } this . org.springframework.web.socket.sockjs.transport.session.ServerHttpResponse = org.springframework.web.socket.sockjs.transport.session.ServerHttpResponse ; this . org.springframework.web.socket.sockjs.transport.session.SockJsFrameFormat = org.springframework.web.socket.sockjs.transport.session.SockJsFrameFormat ; this . org.springframework.web.socket.sockjs.transport.session.ServerHttpAsyncRequestControl = org.springframework.web.socket.sockjs.transport.session.ServerHttpRequest . getAsyncRequestControl ( org.springframework.web.socket.sockjs.transport.session.ServerHttpResponse ) ; this . org.springframework.web.socket.sockjs.transport.session.ServerHttpAsyncRequestControl . start ( - NUMBER ) ; void ( org.springframework.web.socket.sockjs.transport.session.ServerHttpRequest ) ; void ( org.springframework.web.socket.sockjs.transport.session.ServerHttpRequest , org.springframework.web.socket.sockjs.transport.session.ServerHttpResponse , false ) ; this . boolean = boolean ( ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { tryCloseWithSockJsTransportError ( java.lang.Throwable , CloseStatus . SERVER_ERROR ) ; throw new SockJsTransportFailureException ( STRING , getId ( ) , java.lang.Throwable ) ; } } }  <METHOD_END>
<METHOD_START> private void void ( ServerHttpRequest org.springframework.web.socket.sockjs.transport.session.ServerHttpRequest ) { if ( org.springframework.web.socket.sockjs.transport.session.ServerHttpRequest instanceof ServletServerHttpRequest ) { ServletRequest org.springframework.web.socket.sockjs.transport.session.ServletRequest = ( ( ServletServerHttpRequest ) org.springframework.web.socket.sockjs.transport.session.ServerHttpRequest ) . getServletRequest ( ) ; ShallowEtagHeaderFilter . disableContentCaching ( org.springframework.web.socket.sockjs.transport.session.ServletRequest ) ; } }  <METHOD_END>
<METHOD_START> protected abstract void void ( ServerHttpRequest org.springframework.web.socket.sockjs.transport.session.ServerHttpRequest , ServerHttpResponse org.springframework.web.socket.sockjs.transport.session.ServerHttpResponse , boolean boolean ) throws java.io.IOException ;  <METHOD_END>
<METHOD_START> @ java.lang.Override protected final void void ( java.lang.String java.lang.String ) throws org.springframework.web.socket.sockjs.transport.session.SockJsTransportFailureException { synchronized ( this . responseLock ) { this . java.util.Queue<java.lang.String> . boolean ( java.lang.String ) ; if ( logger . isTraceEnabled ( ) ) { logger . trace ( this . java.util.Queue<java.lang.String> . int ( ) + STRING + this . getId ( ) ) ; } if ( boolean ( ) && this . boolean ) { if ( logger . isTraceEnabled ( ) ) { logger . trace ( STRING ) ; } cancelHeartbeat ( ) ; void ( ) ; } else { if ( logger . isTraceEnabled ( ) ) { logger . trace ( STRING ) ; } } } }  <METHOD_END>
<METHOD_START> protected abstract void void ( ) org.springframework.web.socket.sockjs.transport.session.SockJsTransportFailureException ;  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( CloseStatus org.springframework.web.socket.sockjs.transport.session.CloseStatus ) { void ( ) ; }  <METHOD_END>
<METHOD_START> protected void void ( ) { synchronized ( this . responseLock ) { ServerHttpAsyncRequestControl org.springframework.web.socket.sockjs.transport.session.ServerHttpAsyncRequestControl = this . org.springframework.web.socket.sockjs.transport.session.ServerHttpAsyncRequestControl ; this . org.springframework.web.socket.sockjs.transport.session.ServerHttpAsyncRequestControl = null ; this . boolean = false ; this . org.springframework.web.socket.sockjs.transport.session.ServerHttpResponse = null ; updateLastActiveTime ( ) ; if ( org.springframework.web.socket.sockjs.transport.session.ServerHttpAsyncRequestControl != null && ! org.springframework.web.socket.sockjs.transport.session.ServerHttpAsyncRequestControl . isCompleted ( ) ) { if ( org.springframework.web.socket.sockjs.transport.session.ServerHttpAsyncRequestControl . isStarted ( ) ) { try { org.springframework.web.socket.sockjs.transport.session.ServerHttpAsyncRequestControl . complete ( ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { logger . debug ( STRING + java.lang.Throwable . java.lang.String ( ) ) ; } } } } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( SockJsFrame org.springframework.web.socket.sockjs.transport.session.SockJsFrame ) throws java.io.IOException { if ( boolean ( ) ) { java.lang.String java.lang.String = this . org.springframework.web.socket.sockjs.transport.session.SockJsFrameFormat . format ( org.springframework.web.socket.sockjs.transport.session.SockJsFrame ) ; if ( logger . isTraceEnabled ( ) ) { logger . trace ( STRING + java.lang.String ) ; } this . org.springframework.web.socket.sockjs.transport.session.ServerHttpResponse . getBody ( ) . write ( java.lang.String . byte[] ( SockJsFrame . CHARSET ) ) ; this . org.springframework.web.socket.sockjs.transport.session.ServerHttpResponse . flush ( ) ; } }  <METHOD_END>