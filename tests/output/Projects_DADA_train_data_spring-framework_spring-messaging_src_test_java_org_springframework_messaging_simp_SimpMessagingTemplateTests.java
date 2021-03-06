<METHOD_START> @ Before public void void ( ) { this . org.springframework.messaging.simp.StubMessageChannel = new StubMessageChannel ( ) ; this . org.springframework.messaging.simp.SimpMessagingTemplate = new SimpMessagingTemplate ( this . org.springframework.messaging.simp.StubMessageChannel ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.messaging.simp.SimpMessagingTemplate . convertAndSendToUser ( STRING , STRING , STRING ) ; java.util.List<org.springframework.messaging.simp.Message<byte[]>> < Message < byte [] > > java.util.List<org.springframework.messaging.simp.Message<byte[]>> = this . org.springframework.messaging.simp.StubMessageChannel . getMessages ( ) ; assertEquals ( NUMBER , java.util.List<org.springframework.messaging.simp.Message<byte[]>> . size ( ) ) ; Message < byte [] > org.springframework.messaging.simp.Message<byte[]> = java.util.List<org.springframework.messaging.simp.Message<byte[]>> . get ( NUMBER ) ; SimpMessageHeaderAccessor org.springframework.messaging.simp.SimpMessageHeaderAccessor = MessageHeaderAccessor . getAccessor ( org.springframework.messaging.simp.Message<byte[]> , SimpMessageHeaderAccessor .class ) ; assertNotNull ( org.springframework.messaging.simp.SimpMessageHeaderAccessor ) ; assertEquals ( SimpMessageType . MESSAGE , org.springframework.messaging.simp.SimpMessageHeaderAccessor . getMessageType ( ) ) ; assertEquals ( STRING , org.springframework.messaging.simp.SimpMessageHeaderAccessor . getDestination ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.messaging.simp.SimpMessagingTemplate . convertAndSendToUser ( STRING , STRING , STRING ) ; java.util.List<org.springframework.messaging.simp.Message<byte[]>> < Message < byte [] > > java.util.List<org.springframework.messaging.simp.Message<byte[]>> = this . org.springframework.messaging.simp.StubMessageChannel . getMessages ( ) ; assertEquals ( NUMBER , java.util.List<org.springframework.messaging.simp.Message<byte[]>> . size ( ) ) ; SimpMessageHeaderAccessor org.springframework.messaging.simp.SimpMessageHeaderAccessor = MessageHeaderAccessor . getAccessor ( java.util.List<org.springframework.messaging.simp.Message<byte[]>> . get ( NUMBER ) , SimpMessageHeaderAccessor .class ) ; assertNotNull ( org.springframework.messaging.simp.SimpMessageHeaderAccessor ) ; assertEquals ( STRING , org.springframework.messaging.simp.SimpMessageHeaderAccessor . getDestination ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = java.util.Collections .< java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( STRING , STRING ) ; this . org.springframework.messaging.simp.SimpMessagingTemplate . convertAndSend ( STRING , STRING , java.util.Map<java.lang.String,java.lang.Object> ) ; java.util.List<org.springframework.messaging.simp.Message<byte[]>> < Message < byte [] > > java.util.List<org.springframework.messaging.simp.Message<byte[]>> = this . org.springframework.messaging.simp.StubMessageChannel . getMessages ( ) ; SimpMessageHeaderAccessor org.springframework.messaging.simp.SimpMessageHeaderAccessor = MessageHeaderAccessor . getAccessor ( java.util.List<org.springframework.messaging.simp.Message<byte[]>> . get ( NUMBER ) , SimpMessageHeaderAccessor .class ) ; assertNotNull ( org.springframework.messaging.simp.SimpMessageHeaderAccessor ) ; assertNull ( org.springframework.messaging.simp.SimpMessageHeaderAccessor . toMap ( ) . get ( STRING ) ) ; assertEquals ( java.util.Arrays . java.util.List<java.lang.String> ( STRING ) , org.springframework.messaging.simp.SimpMessageHeaderAccessor . getNativeHeader ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( NativeMessageHeaderAccessor . NATIVE_HEADERS , new LinkedMultiValueMap < java.lang.String , java.lang.String > ( ) ) ; this . org.springframework.messaging.simp.SimpMessagingTemplate . convertAndSend ( STRING , STRING , java.util.Map<java.lang.String,java.lang.Object> ) ; java.util.List<org.springframework.messaging.simp.Message<byte[]>> < Message < byte [] > > java.util.List<org.springframework.messaging.simp.Message<byte[]>> = this . org.springframework.messaging.simp.StubMessageChannel . getMessages ( ) ; SimpMessageHeaderAccessor org.springframework.messaging.simp.SimpMessageHeaderAccessor = MessageHeaderAccessor . getAccessor ( java.util.List<org.springframework.messaging.simp.Message<byte[]>> . get ( NUMBER ) , SimpMessageHeaderAccessor .class ) ; assertNotNull ( org.springframework.messaging.simp.SimpMessageHeaderAccessor ) ; assertEquals ( STRING , org.springframework.messaging.simp.SimpMessageHeaderAccessor . toMap ( ) . get ( STRING ) ) ; assertNull ( org.springframework.messaging.simp.SimpMessageHeaderAccessor . getNativeHeader ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.messaging.simp.SimpMessagingTemplate . setUserDestinationPrefix ( STRING ) ; this . org.springframework.messaging.simp.SimpMessagingTemplate . convertAndSendToUser ( STRING , STRING , STRING ) ; java.util.List<org.springframework.messaging.simp.Message<byte[]>> < Message < byte [] > > java.util.List<org.springframework.messaging.simp.Message<byte[]>> = this . org.springframework.messaging.simp.StubMessageChannel . getMessages ( ) ; assertEquals ( NUMBER , java.util.List<org.springframework.messaging.simp.Message<byte[]>> . size ( ) ) ; Message < byte [] > org.springframework.messaging.simp.Message<byte[]> = java.util.List<org.springframework.messaging.simp.Message<byte[]>> . get ( NUMBER ) ; SimpMessageHeaderAccessor org.springframework.messaging.simp.SimpMessageHeaderAccessor = MessageHeaderAccessor . getAccessor ( org.springframework.messaging.simp.Message<byte[]> , SimpMessageHeaderAccessor .class ) ; assertNotNull ( org.springframework.messaging.simp.SimpMessageHeaderAccessor ) ; assertEquals ( SimpMessageType . MESSAGE , org.springframework.messaging.simp.SimpMessageHeaderAccessor . getMessageType ( ) ) ; assertEquals ( STRING , org.springframework.messaging.simp.SimpMessageHeaderAccessor . getDestination ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { SimpMessageHeaderAccessor org.springframework.messaging.simp.SimpMessageHeaderAccessor = SimpMessageHeaderAccessor . create ( ) ; org.springframework.messaging.simp.SimpMessageHeaderAccessor . setHeader ( STRING , STRING ) ; org.springframework.messaging.simp.SimpMessageHeaderAccessor . setNativeHeader ( STRING , STRING ) ; org.springframework.messaging.simp.SimpMessageHeaderAccessor . setLeaveMutable ( true ) ; MessageHeaders org.springframework.messaging.simp.MessageHeaders = org.springframework.messaging.simp.SimpMessageHeaderAccessor . getMessageHeaders ( ) ; this . org.springframework.messaging.simp.SimpMessagingTemplate . convertAndSend ( STRING , STRING , org.springframework.messaging.simp.MessageHeaders ) ; java.util.List<org.springframework.messaging.simp.Message<byte[]>> < Message < byte [] > > java.util.List<org.springframework.messaging.simp.Message<byte[]>> = this . org.springframework.messaging.simp.StubMessageChannel . getMessages ( ) ; Message < byte [] > org.springframework.messaging.simp.Message<byte[]> = java.util.List<org.springframework.messaging.simp.Message<byte[]>> . get ( NUMBER ) ; assertSame ( org.springframework.messaging.simp.MessageHeaders , org.springframework.messaging.simp.Message<byte[]> . getHeaders ( ) ) ; assertFalse ( org.springframework.messaging.simp.SimpMessageHeaderAccessor . isMutable ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = this . org.springframework.messaging.simp.SimpMessagingTemplate . processHeadersToSend ( null ) ; assertNotNull ( java.util.Map<java.lang.String,java.lang.Object> ) ; assertTrue ( STRING + java.util.Map<java.lang.String,java.lang.Object> . java.lang.Class<? extends java.util.Map> ( ) . java.lang.String ( ) , MessageHeaders .class . boolean ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Class<? extends java.util.Map> ( ) ) ) ; SimpMessageHeaderAccessor org.springframework.messaging.simp.SimpMessageHeaderAccessor = MessageHeaderAccessor . getAccessor ( ( MessageHeaders ) java.util.Map<java.lang.String,java.lang.Object> , SimpMessageHeaderAccessor .class ) ; assertTrue ( org.springframework.messaging.simp.SimpMessageHeaderAccessor . isMutable ( ) ) ; assertEquals ( SimpMessageType . MESSAGE , org.springframework.messaging.simp.SimpMessageHeaderAccessor . getMessageType ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { SimpMessageHeaderAccessor org.springframework.messaging.simp.SimpMessageHeaderAccessor = SimpMessageHeaderAccessor . create ( ) ; org.springframework.messaging.simp.SimpMessageHeaderAccessor . setHeader ( STRING , STRING ) ; org.springframework.messaging.simp.SimpMessageHeaderAccessor . setNativeHeader ( STRING , STRING ) ; org.springframework.messaging.simp.SimpMessageHeaderAccessor . setLeaveMutable ( true ) ; MessageHeaders org.springframework.messaging.simp.MessageHeaders = org.springframework.messaging.simp.SimpMessageHeaderAccessor . getMessageHeaders ( ) ; Message < ? > org.springframework.messaging.simp.Message<?> = MessageBuilder . createMessage ( STRING , org.springframework.messaging.simp.MessageHeaders ) ; this . org.springframework.messaging.simp.SimpMessagingTemplate . doSend ( STRING , org.springframework.messaging.simp.Message<> ) ; java.util.List<org.springframework.messaging.simp.Message<byte[]>> < Message < byte [] > > java.util.List<org.springframework.messaging.simp.Message<byte[]>> = this . org.springframework.messaging.simp.StubMessageChannel . getMessages ( ) ; Message < byte [] > org.springframework.messaging.simp.Message<byte[]> = java.util.List<org.springframework.messaging.simp.Message<byte[]>> . get ( NUMBER ) ; assertSame ( org.springframework.messaging.simp.Message<> , org.springframework.messaging.simp.Message<byte[]> ) ; assertFalse ( org.springframework.messaging.simp.SimpMessageHeaderAccessor . isMutable ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { StompHeaderAccessor org.springframework.messaging.simp.StompHeaderAccessor = StompHeaderAccessor . create ( StompCommand . SUBSCRIBE ) ; org.springframework.messaging.simp.StompHeaderAccessor . setDestination ( STRING ) ; Message < ? > org.springframework.messaging.simp.Message<?> = MessageBuilder . createMessage ( new byte [ NUMBER ] , org.springframework.messaging.simp.StompHeaderAccessor . getMessageHeaders ( ) ) ; this . org.springframework.messaging.simp.SimpMessagingTemplate . doSend ( STRING , org.springframework.messaging.simp.Message<> ) ; java.util.List<org.springframework.messaging.simp.Message<byte[]>> < Message < byte [] > > java.util.List<org.springframework.messaging.simp.Message<byte[]>> = this . org.springframework.messaging.simp.StubMessageChannel . getMessages ( ) ; Message < byte [] > org.springframework.messaging.simp.Message<byte[]> = java.util.List<org.springframework.messaging.simp.Message<byte[]>> . get ( NUMBER ) ; MessageHeaderAccessor org.springframework.messaging.simp.MessageHeaderAccessor = MessageHeaderAccessor . getAccessor ( org.springframework.messaging.simp.Message<byte[]> , MessageHeaderAccessor .class ) ; assertEquals ( StompHeaderAccessor .class , org.springframework.messaging.simp.MessageHeaderAccessor . getClass ( ) ) ; assertEquals ( STRING , ( ( StompHeaderAccessor ) org.springframework.messaging.simp.MessageHeaderAccessor ) . getDestination ( ) ) ; }  <METHOD_END>
