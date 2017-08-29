<METHOD_START> @ Before public void void ( ) { super. setUp ( ) ; this . org.springframework.web.socket.sockjs.transport.session.TestWebSocketSession = new TestWebSocketSession ( ) ; this . org.springframework.web.socket.sockjs.transport.session.TestWebSocketSession . setOpen ( true ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.web.socket.sockjs.transport.session.WebSocketServerSockJsSessionTests.TestWebSocketServerSockJsSession org.springframework.web.socket.sockjs.transport.session.WebSocketServerSockJsSessionTests.TestWebSocketServerSockJsSession ( ) { return new org.springframework.web.socket.sockjs.transport.session.WebSocketServerSockJsSessionTests.TestWebSocketServerSockJsSession ( this . sockJsConfig , this . webSocketHandler , java.util.Collections .< java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertFalse ( this . session . isActive ( ) ) ; this . session . initializeDelegateSession ( this . org.springframework.web.socket.sockjs.transport.session.TestWebSocketSession ) ; assertTrue ( this . session . isActive ( ) ) ; this . org.springframework.web.socket.sockjs.transport.session.TestWebSocketSession . setOpen ( false ) ; assertFalse ( this . session . isActive ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . session . initializeDelegateSession ( this . org.springframework.web.socket.sockjs.transport.session.TestWebSocketSession ) ; assertEquals ( java.util.Collections . java.util.List ( new TextMessage ( STRING ) ) , this . org.springframework.web.socket.sockjs.transport.session.TestWebSocketSession . getSentMessages ( ) ) ; assertEquals ( java.util.Arrays . java.util.List<java.lang.String> ( STRING ) , this . session . heartbeatSchedulingEvents ) ; verify ( this . webSocketHandler ) . afterConnectionEstablished ( this . session ) ; verifyNoMoreInteractions ( this . taskScheduler , this . webSocketHandler ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { TextWebSocketHandler org.springframework.web.socket.sockjs.transport.session.TextWebSocketHandler = new TextWebSocketHandler ( ) { @ java.lang.Override public void void ( WebSocketSession org.springframework.web.socket.sockjs.transport.session.WebSocketSession ) throws java.lang.Exception { org.springframework.web.socket.sockjs.transport.session.WebSocketSession . sendMessage ( new TextMessage ( STRING ) ) ; } } ; org.springframework.web.socket.sockjs.transport.session.WebSocketServerSockJsSessionTests.TestWebSocketServerSockJsSession org.springframework.web.socket.sockjs.transport.session.WebSocketServerSockJsSessionTests.TestWebSocketServerSockJsSession = new org.springframework.web.socket.sockjs.transport.session.WebSocketServerSockJsSessionTests.TestWebSocketServerSockJsSession ( this . sockJsConfig , org.springframework.web.socket.sockjs.transport.session.TextWebSocketHandler , null ) ; org.springframework.web.socket.sockjs.transport.session.WebSocketServerSockJsSessionTests.TestWebSocketServerSockJsSession . initializeDelegateSession ( this . org.springframework.web.socket.sockjs.transport.session.TestWebSocketSession ) ; java.util.List<org.springframework.web.socket.sockjs.transport.session.TextMessage> < TextMessage > java.util.List<org.springframework.web.socket.sockjs.transport.session.TextMessage> = java.util.Arrays . java.util.List ( new TextMessage ( STRING ) , new TextMessage ( STRING ) ) ; assertEquals ( java.util.List<org.springframework.web.socket.sockjs.transport.session.TextMessage> , this . org.springframework.web.socket.sockjs.transport.session.TestWebSocketSession . getSentMessages ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( WebSocketSession org.springframework.web.socket.sockjs.transport.session.WebSocketSession ) throws java.lang.Exception { org.springframework.web.socket.sockjs.transport.session.WebSocketSession . sendMessage ( new TextMessage ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . session . handleMessage ( new TextMessage ( STRING ) , this . org.springframework.web.socket.sockjs.transport.session.TestWebSocketSession ) ; verifyNoMoreInteractions ( this . webSocketHandler ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TextMessage org.springframework.web.socket.sockjs.transport.session.TextMessage = new TextMessage ( STRING ) ; this . session . handleMessage ( org.springframework.web.socket.sockjs.transport.session.TextMessage , this . org.springframework.web.socket.sockjs.transport.session.TestWebSocketSession ) ; verify ( this . webSocketHandler ) . handleMessage ( this . session , new TextMessage ( STRING ) ) ; verifyNoMoreInteractions ( this . webSocketHandler ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TextMessage org.springframework.web.socket.sockjs.transport.session.TextMessage = new TextMessage ( STRING ) ; this . session . handleMessage ( org.springframework.web.socket.sockjs.transport.session.TextMessage , this . org.springframework.web.socket.sockjs.transport.session.TestWebSocketSession ) ; this . session . isClosed ( ) ; verify ( this . webSocketHandler ) . handleTransportError ( same ( this . session ) , any ( java.io.IOException .class ) ) ; verifyNoMoreInteractions ( this . webSocketHandler ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . session . initializeDelegateSession ( this . org.springframework.web.socket.sockjs.transport.session.TestWebSocketSession ) ; this . session . sendMessageInternal ( STRING ) ; assertEquals ( java.util.Arrays . java.util.List ( new TextMessage ( STRING ) , new TextMessage ( STRING ) ) , this . org.springframework.web.socket.sockjs.transport.session.TestWebSocketSession . getSentMessages ( ) ) ; assertEquals ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING , STRING ) , this . session . heartbeatSchedulingEvents ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . session . initializeDelegateSession ( this . org.springframework.web.socket.sockjs.transport.session.TestWebSocketSession ) ; this . session . close ( CloseStatus . NOT_ACCEPTABLE ) ; assertEquals ( CloseStatus . NOT_ACCEPTABLE , this . org.springframework.web.socket.sockjs.transport.session.TestWebSocketSession . getCloseStatus ( ) ) ; }  <METHOD_END>
<METHOD_START> public void ( SockJsServiceConfig org.springframework.web.socket.sockjs.transport.session.SockJsServiceConfig , WebSocketHandler org.springframework.web.socket.sockjs.transport.session.WebSocketHandler , java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { super( STRING , org.springframework.web.socket.sockjs.transport.session.SockJsServiceConfig , org.springframework.web.socket.sockjs.transport.session.WebSocketHandler , java.util.Map<java.lang.String,java.lang.Object> ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { this . java.util.List<java.lang.String> . boolean ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { this . java.util.List<java.lang.String> . boolean ( STRING ) ; }  <METHOD_END>