<METHOD_START> public void ( WebSocketHandler org.springframework.web.socket.handler.WebSocketHandler ) { super( org.springframework.web.socket.handler.WebSocketHandler ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( WebSocketSession org.springframework.web.socket.handler.WebSocketSession ) throws java.lang.Exception { if ( org.springframework.web.socket.handler.Log . isDebugEnabled ( ) ) { org.springframework.web.socket.handler.Log . debug ( STRING + org.springframework.web.socket.handler.WebSocketSession ) ; } super. afterConnectionEstablished ( org.springframework.web.socket.handler.WebSocketSession ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( WebSocketSession org.springframework.web.socket.handler.WebSocketSession , WebSocketMessage < ? > org.springframework.web.socket.handler.WebSocketMessage<?> ) throws java.lang.Exception { if ( org.springframework.web.socket.handler.Log . isTraceEnabled ( ) ) { org.springframework.web.socket.handler.Log . trace ( STRING + org.springframework.web.socket.handler.WebSocketMessage<> + STRING + org.springframework.web.socket.handler.WebSocketSession ) ; } super. handleMessage ( org.springframework.web.socket.handler.WebSocketSession , org.springframework.web.socket.handler.WebSocketMessage<> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( WebSocketSession org.springframework.web.socket.handler.WebSocketSession , java.lang.Throwable java.lang.Throwable ) throws java.lang.Exception { if ( org.springframework.web.socket.handler.Log . isDebugEnabled ( ) ) { org.springframework.web.socket.handler.Log . debug ( STRING + org.springframework.web.socket.handler.WebSocketSession , java.lang.Throwable ) ; } super. handleTransportError ( org.springframework.web.socket.handler.WebSocketSession , java.lang.Throwable ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( WebSocketSession org.springframework.web.socket.handler.WebSocketSession , CloseStatus org.springframework.web.socket.handler.CloseStatus ) throws java.lang.Exception { if ( org.springframework.web.socket.handler.Log . isDebugEnabled ( ) ) { org.springframework.web.socket.handler.Log . debug ( org.springframework.web.socket.handler.WebSocketSession + STRING + org.springframework.web.socket.handler.CloseStatus ) ; } super. afterConnectionClosed ( org.springframework.web.socket.handler.WebSocketSession , org.springframework.web.socket.handler.CloseStatus ) ; }  <METHOD_END>