<METHOD_START> void ( T T ) { this( T , true ); }  <METHOD_END>
<METHOD_START> void ( T T , boolean boolean ) { Assert . notNull ( T , STRING ) ; this . T = T ; this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public T T ( ) { return this . T ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Object java.lang.Object ) { if ( this == java.lang.Object ) { return true ; } if ( ! ( java.lang.Object instanceof org.springframework.web.socket.AbstractWebSocketMessage ) ) { return false ; } org.springframework.web.socket.AbstractWebSocketMessage<?> < ? > org.springframework.web.socket.AbstractWebSocketMessage<?> = ( org.springframework.web.socket.AbstractWebSocketMessage<?> < ? > ) java.lang.Object ; return ObjectUtils . nullSafeEquals ( this . T , org.springframework.web.socket.AbstractWebSocketMessage<> . payload ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return ObjectUtils . nullSafeHashCode ( this . T ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return java.lang.Class<? extends org.springframework.web.socket.AbstractWebSocketMessage> ( ) . java.lang.String ( ) + STRING + java.lang.String ( ) + STRING + getPayloadLength ( ) + STRING + boolean ( ) + STRING ; }  <METHOD_END>
<METHOD_START> protected abstract java.lang.String java.lang.String ( )  <METHOD_END>
