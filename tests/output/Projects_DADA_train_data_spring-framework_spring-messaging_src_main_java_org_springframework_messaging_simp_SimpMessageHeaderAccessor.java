<METHOD_START> protected void ( SimpMessageType org.springframework.messaging.simp.SimpMessageType , java.util.Map<java.lang.String,java.util.List<java.lang.String>> < java.lang.String , java.util.List<java.lang.String> < java.lang.String > > java.util.Map<java.lang.String,java.util.List<java.lang.String>> ) { super( java.util.Map<java.lang.String,java.util.List<java.lang.String>> ); Assert . notNull ( org.springframework.messaging.simp.SimpMessageType , STRING ) ; setHeader ( java.lang.String , org.springframework.messaging.simp.SimpMessageType ) ; org.springframework.messaging.simp.IdTimestampMessageHeaderInitializer . initHeaders ( this ) ; }  <METHOD_END>
<METHOD_START> protected void ( Message < ? > org.springframework.messaging.simp.Message<?> ) { super( org.springframework.messaging.simp.Message<> ); org.springframework.messaging.simp.IdTimestampMessageHeaderInitializer . initHeaders ( this ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.messaging.simp.MessageHeaderAccessor org.springframework.messaging.simp.MessageHeaderAccessor ( Message < ? > org.springframework.messaging.simp.Message<?> ) { return org.springframework.messaging.simp.SimpMessageHeaderAccessor ( org.springframework.messaging.simp.Message<> ) ; }  <METHOD_END>
<METHOD_START> public void void ( SimpMessageType org.springframework.messaging.simp.SimpMessageType ) { if ( org.springframework.messaging.simp.SimpMessageType ( ) == null ) { setHeader ( java.lang.String , org.springframework.messaging.simp.SimpMessageType ) ; } }  <METHOD_END>
<METHOD_START> public org.springframework.messaging.simp.SimpMessageType org.springframework.messaging.simp.SimpMessageType ( ) { return ( SimpMessageType ) getHeader ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { Assert . notNull ( java.lang.String , STRING ) ; setHeader ( java.lang.String , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return ( java.lang.String ) getHeader ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { setHeader ( java.lang.String , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return ( java.lang.String ) getHeader ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { setHeader ( java.lang.String , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return ( java.lang.String ) getHeader ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { setHeader ( java.lang.String , java.util.Map<java.lang.String,java.lang.Object> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( ) { return ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ) getHeader ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.security.Principal java.security.Principal ) { setHeader ( java.lang.String , java.security.Principal ) ; }  <METHOD_END>
<METHOD_START> public java.security.Principal java.security.Principal ( ) { return ( java.security.Principal ) getHeader ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( java.lang.Object java.lang.Object ) { if ( org.springframework.messaging.simp.SimpMessageType ( ) == null ) { return super. getDetailedLogMessage ( java.lang.Object ) ; } java.lang.StringBuilder java.lang.StringBuilder = java.lang.StringBuilder ( ) ; if ( ! CollectionUtils . isEmpty ( java.util.Map<java.lang.String,java.lang.Object> ( ) ) ) { java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) . java.lang.StringBuilder ( java.util.Map<java.lang.String,java.lang.Object> ( ) . int ( ) ) . java.lang.StringBuilder ( STRING ) ; } java.lang.StringBuilder . java.lang.StringBuilder ( getShortPayloadLogMessage ( java.lang.Object ) ) ; return java.lang.StringBuilder . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) @ java.lang.Override public java.lang.String java.lang.String ( java.lang.Object java.lang.Object ) { if ( org.springframework.messaging.simp.SimpMessageType ( ) == null ) { return super. getDetailedLogMessage ( java.lang.Object ) ; } java.lang.StringBuilder java.lang.StringBuilder = java.lang.StringBuilder ( ) ; if ( ! CollectionUtils . isEmpty ( java.util.Map<java.lang.String,java.lang.Object> ( ) ) ) { java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) . java.lang.StringBuilder ( java.util.Map<java.lang.String,java.lang.Object> ( ) ) ; } if ( ! CollectionUtils . isEmpty ( ( java.util.Map<java.lang.String,java.util.List<java.lang.String>> < java.lang.String , java.util.List<java.lang.String> < java.lang.String > > ) getHeader ( NATIVE_HEADERS ) ) ) { java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) . java.lang.StringBuilder ( getHeader ( NATIVE_HEADERS ) ) ; } java.lang.StringBuilder . java.lang.StringBuilder ( getDetailedPayloadLogMessage ( java.lang.Object ) ) ; return java.lang.StringBuilder . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> private java.lang.StringBuilder java.lang.StringBuilder ( ) { java.lang.StringBuilder java.lang.StringBuilder = new java.lang.StringBuilder ( ) ; java.lang.StringBuilder . java.lang.StringBuilder ( org.springframework.messaging.simp.SimpMessageType ( ) . name ( ) ) ; if ( java.lang.String ( ) != null ) { java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) . java.lang.StringBuilder ( java.lang.String ( ) ) ; } if ( java.lang.String ( ) != null ) { java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) . java.lang.StringBuilder ( java.lang.String ( ) ) ; } java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) . java.lang.StringBuilder ( java.lang.String ( ) ) ; if ( java.security.Principal ( ) != null ) { java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) . java.lang.StringBuilder ( java.security.Principal ( ) . java.lang.String ( ) ) ; } return java.lang.StringBuilder ; }  <METHOD_END>
<METHOD_START> public static org.springframework.messaging.simp.SimpMessageHeaderAccessor org.springframework.messaging.simp.SimpMessageHeaderAccessor ( ) { return new org.springframework.messaging.simp.SimpMessageHeaderAccessor ( SimpMessageType . MESSAGE , null ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.messaging.simp.SimpMessageHeaderAccessor org.springframework.messaging.simp.SimpMessageHeaderAccessor ( SimpMessageType org.springframework.messaging.simp.SimpMessageType ) { return new org.springframework.messaging.simp.SimpMessageHeaderAccessor ( org.springframework.messaging.simp.SimpMessageType , null ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.messaging.simp.SimpMessageHeaderAccessor org.springframework.messaging.simp.SimpMessageHeaderAccessor ( Message < ? > org.springframework.messaging.simp.Message<?> ) { return new org.springframework.messaging.simp.SimpMessageHeaderAccessor ( org.springframework.messaging.simp.Message<> ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.messaging.simp.SimpMessageType org.springframework.messaging.simp.SimpMessageType ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { return ( SimpMessageType ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.String java.lang.String ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { return ( java.lang.String ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.String java.lang.String ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { return ( java.lang.String ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.String java.lang.String ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { return ( java.lang.String ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public static java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { return ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public static java.security.Principal java.security.Principal ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { return ( java.security.Principal ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public static long [] long[] ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { return ( long [] ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String ) ; }  <METHOD_END>