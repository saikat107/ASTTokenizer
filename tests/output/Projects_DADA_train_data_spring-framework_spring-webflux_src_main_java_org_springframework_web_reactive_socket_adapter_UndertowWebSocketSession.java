<METHOD_START> public void ( WebSocketChannel org.springframework.web.reactive.socket.adapter.WebSocketChannel , HandshakeInfo org.springframework.web.reactive.socket.adapter.HandshakeInfo , DataBufferFactory org.springframework.web.reactive.socket.adapter.DataBufferFactory ) { this( org.springframework.web.reactive.socket.adapter.WebSocketChannel , org.springframework.web.reactive.socket.adapter.HandshakeInfo , org.springframework.web.reactive.socket.adapter.DataBufferFactory , null ); }  <METHOD_END>
<METHOD_START> public void ( WebSocketChannel org.springframework.web.reactive.socket.adapter.WebSocketChannel , HandshakeInfo org.springframework.web.reactive.socket.adapter.HandshakeInfo , DataBufferFactory org.springframework.web.reactive.socket.adapter.DataBufferFactory , MonoProcessor < java.lang.Void > org.springframework.web.reactive.socket.adapter.MonoProcessor<java.lang.Void> ) { super( org.springframework.web.reactive.socket.adapter.WebSocketChannel , ObjectUtils . getIdentityHexString ( org.springframework.web.reactive.socket.adapter.WebSocketChannel ) , org.springframework.web.reactive.socket.adapter.HandshakeInfo , org.springframework.web.reactive.socket.adapter.DataBufferFactory , org.springframework.web.reactive.socket.adapter.MonoProcessor<java.lang.Void> ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> protected void void ( ) { getDelegate ( ) . suspendReceives ( ) ; }  <METHOD_END>
<METHOD_START> protected void void ( ) { getDelegate ( ) . resumeReceives ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( WebSocketMessage org.springframework.web.reactive.socket.adapter.WebSocketMessage ) throws java.io.IOException { java.nio.ByteBuffer java.nio.ByteBuffer = org.springframework.web.reactive.socket.adapter.WebSocketMessage . getPayload ( ) . asByteBuffer ( ) ; if ( WebSocketMessage . Type . TEXT . equals ( org.springframework.web.reactive.socket.adapter.WebSocketMessage . getType ( ) ) ) { getSendProcessor ( ) . setReadyToSend ( false ) ; java.lang.String java.lang.String = new java.lang.String ( java.nio.ByteBuffer . byte[] ( ) , java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ; WebSockets . sendText ( java.lang.String , getDelegate ( ) , new org.springframework.web.reactive.socket.adapter.UndertowWebSocketSession.SendProcessorCallback ( ) ) ; } else if ( WebSocketMessage . Type . BINARY . equals ( org.springframework.web.reactive.socket.adapter.WebSocketMessage . getType ( ) ) ) { getSendProcessor ( ) . setReadyToSend ( false ) ; WebSockets . sendBinary ( java.nio.ByteBuffer , getDelegate ( ) , new org.springframework.web.reactive.socket.adapter.UndertowWebSocketSession.SendProcessorCallback ( ) ) ; } else if ( WebSocketMessage . Type . PING . equals ( org.springframework.web.reactive.socket.adapter.WebSocketMessage . getType ( ) ) ) { getSendProcessor ( ) . setReadyToSend ( false ) ; WebSockets . sendPing ( java.nio.ByteBuffer , getDelegate ( ) , new org.springframework.web.reactive.socket.adapter.UndertowWebSocketSession.SendProcessorCallback ( ) ) ; } else if ( WebSocketMessage . Type . PONG . equals ( org.springframework.web.reactive.socket.adapter.WebSocketMessage . getType ( ) ) ) { getSendProcessor ( ) . setReadyToSend ( false ) ; WebSockets . sendPong ( java.nio.ByteBuffer , getDelegate ( ) , new org.springframework.web.reactive.socket.adapter.UndertowWebSocketSession.SendProcessorCallback ( ) ) ; } else { throw new java.lang.IllegalArgumentException ( STRING + org.springframework.web.reactive.socket.adapter.WebSocketMessage . getType ( ) ) ; } return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.reactive.socket.adapter.Mono<java.lang.Void> < java.lang.Void > org.springframework.web.reactive.socket.adapter.Mono<java.lang.Void> ( CloseStatus org.springframework.web.reactive.socket.adapter.CloseStatus ) { CloseMessage org.springframework.web.reactive.socket.adapter.CloseMessage = new CloseMessage ( org.springframework.web.reactive.socket.adapter.CloseStatus . getCode ( ) , org.springframework.web.reactive.socket.adapter.CloseStatus . getReason ( ) ) ; if ( ! getDelegate ( ) . isCloseFrameSent ( ) ) { WebSockets . sendClose ( org.springframework.web.reactive.socket.adapter.CloseMessage , getDelegate ( ) , null ) ; } return Mono . empty ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( WebSocketChannel org.springframework.web.reactive.socket.adapter.WebSocketChannel , java.lang.Void java.lang.Void ) { getSendProcessor ( ) . setReadyToSend ( true ) ; getSendProcessor ( ) . onWritePossible ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( WebSocketChannel org.springframework.web.reactive.socket.adapter.WebSocketChannel , java.lang.Void java.lang.Void , java.lang.Throwable java.lang.Throwable ) { getSendProcessor ( ) . cancel ( ) ; getSendProcessor ( ) . onError ( java.lang.Throwable ) ; }  <METHOD_END>