<METHOD_START> public void void ( java.lang.String ... java.lang.String[] ) { Assert . noNullElements ( java.lang.String[] , STRING ) ; this . java.util.List<java.lang.String> . boolean ( java.util.Arrays . java.util.List<java.lang.String> ( java.lang.String[] ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ( ) { return this . java.util.List<java.lang.String> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( WebSocketSession org.springframework.integration.websocket.support.WebSocketSession , WebSocketMessage < ? > org.springframework.integration.websocket.support.WebSocketMessage<?> , MessageChannel org.springframework.integration.websocket.support.MessageChannel ) throws java.lang.Exception { SimpMessageHeaderAccessor org.springframework.integration.websocket.support.SimpMessageHeaderAccessor = SimpMessageHeaderAccessor . create ( SimpMessageType . MESSAGE ) ; org.springframework.integration.websocket.support.SimpMessageHeaderAccessor . setSessionId ( org.springframework.integration.websocket.support.WebSocketSession . getId ( ) ) ; org.springframework.integration.websocket.support.SimpMessageHeaderAccessor . setSessionAttributes ( org.springframework.integration.websocket.support.WebSocketSession . getAttributes ( ) ) ; org.springframework.integration.websocket.support.SimpMessageHeaderAccessor . setUser ( org.springframework.integration.websocket.support.WebSocketSession . getPrincipal ( ) ) ; org.springframework.integration.websocket.support.SimpMessageHeaderAccessor . setHeader ( STRING , org.springframework.integration.websocket.support.WebSocketMessage<> . getPayloadLength ( ) ) ; org.springframework.integration.websocket.support.SimpMessageHeaderAccessor . setLeaveMutable ( true ) ; Message < ? > org.springframework.integration.websocket.support.Message<?> = MessageBuilder . createMessage ( org.springframework.integration.websocket.support.WebSocketMessage<> . getPayload ( ) , org.springframework.integration.websocket.support.SimpMessageHeaderAccessor . getMessageHeaders ( ) ) ; try { SimpAttributesContextHolder . setAttributesFromMessage ( org.springframework.integration.websocket.support.Message<> ) ; org.springframework.integration.websocket.support.MessageChannel . send ( org.springframework.integration.websocket.support.Message<> ) ; } finally { SimpAttributesContextHolder . resetAttributes ( ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( WebSocketSession org.springframework.integration.websocket.support.WebSocketSession , Message < ? > org.springframework.integration.websocket.support.Message<?> ) throws java.lang.Exception { java.lang.Object java.lang.Object = org.springframework.integration.websocket.support.Message<> . getPayload ( ) ; if ( java.lang.Object instanceof java.lang.String ) { org.springframework.integration.websocket.support.WebSocketSession . sendMessage ( new TextMessage ( ( java.lang.String ) java.lang.Object ) ) ; } else if ( java.lang.Object instanceof byte [] ) { org.springframework.integration.websocket.support.WebSocketSession . sendMessage ( new TextMessage ( ( byte [] ) java.lang.Object ) ) ; } else if ( java.lang.Object instanceof java.nio.ByteBuffer ) { org.springframework.integration.websocket.support.WebSocketSession . sendMessage ( new TextMessage ( ( ( java.nio.ByteBuffer ) java.lang.Object ) . byte[] ( ) ) ) ; } else { throw new java.lang.IllegalArgumentException ( STRING + java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) + STRING + java.util.Arrays .< java.lang.Class<?> < ? > > java.util.List<java.lang.Class<?>> ( java.lang.String .class , byte [] .class , java.nio.ByteBuffer .class ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( Message < ? > org.springframework.integration.websocket.support.Message<?> ) { return SimpMessageHeaderAccessor . getSessionId ( org.springframework.integration.websocket.support.Message<> . getHeaders ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( WebSocketSession org.springframework.integration.websocket.support.WebSocketSession , MessageChannel org.springframework.integration.websocket.support.MessageChannel ) throws java.lang.Exception { }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( WebSocketSession org.springframework.integration.websocket.support.WebSocketSession , CloseStatus org.springframework.integration.websocket.support.CloseStatus , MessageChannel org.springframework.integration.websocket.support.MessageChannel )			throws java.lang.Exception { }  <METHOD_END>