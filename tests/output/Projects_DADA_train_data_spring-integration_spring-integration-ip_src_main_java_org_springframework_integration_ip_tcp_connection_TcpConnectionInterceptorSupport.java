<METHOD_START> public void ( ) { super(); }  <METHOD_END>
<METHOD_START> public void ( ApplicationEventPublisher org.springframework.integration.ip.tcp.connection.ApplicationEventPublisher ) { super( org.springframework.integration.ip.tcp.connection.ApplicationEventPublisher ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { this . org.springframework.integration.ip.tcp.connection.TcpConnectionSupport . close ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return this . org.springframework.integration.ip.tcp.connection.TcpConnectionSupport . isOpen ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( ) java.lang.Exception { return this . org.springframework.integration.ip.tcp.connection.TcpConnectionSupport . getPayload ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return this . org.springframework.integration.ip.tcp.connection.TcpConnectionSupport . getHostName ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return this . org.springframework.integration.ip.tcp.connection.TcpConnectionSupport . getHostAddress ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return this . org.springframework.integration.ip.tcp.connection.TcpConnectionSupport . getPort ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( ) { return this . org.springframework.integration.ip.tcp.connection.TcpConnectionSupport . getDeserializerStateKey ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( TcpListener org.springframework.integration.ip.tcp.connection.TcpListener ) { this . org.springframework.integration.ip.tcp.connection.TcpListener = org.springframework.integration.ip.tcp.connection.TcpListener ; this . org.springframework.integration.ip.tcp.connection.TcpConnectionSupport . registerListener ( this ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( TcpSender org.springframework.integration.ip.tcp.connection.TcpSender ) { this . org.springframework.integration.ip.tcp.connection.TcpSender = org.springframework.integration.ip.tcp.connection.TcpSender ; this . org.springframework.integration.ip.tcp.connection.TcpConnectionSupport . registerSender ( this ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return this . org.springframework.integration.ip.tcp.connection.TcpConnectionSupport . getConnectionId ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.ip.tcp.connection.SocketInfo org.springframework.integration.ip.tcp.connection.SocketInfo ( ) { return this . org.springframework.integration.ip.tcp.connection.TcpConnectionSupport . getSocketInfo ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { this . org.springframework.integration.ip.tcp.connection.TcpConnectionSupport . run ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( TcpMessageMapper org.springframework.integration.ip.tcp.connection.TcpMessageMapper ) { this . org.springframework.integration.ip.tcp.connection.TcpConnectionSupport . setMapper ( org.springframework.integration.ip.tcp.connection.TcpMessageMapper ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.ip.tcp.connection.Deserializer<?> < ? > org.springframework.integration.ip.tcp.connection.Deserializer<?> ( ) { return this . org.springframework.integration.ip.tcp.connection.TcpConnectionSupport . getDeserializer ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Deserializer < ? > org.springframework.integration.ip.tcp.connection.Deserializer<?> ) { this . org.springframework.integration.ip.tcp.connection.TcpConnectionSupport . setDeserializer ( org.springframework.integration.ip.tcp.connection.Deserializer<> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.ip.tcp.connection.Serializer<?> < ? > org.springframework.integration.ip.tcp.connection.Serializer<?> ( ) { return this . org.springframework.integration.ip.tcp.connection.TcpConnectionSupport . getSerializer ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Serializer < ? > org.springframework.integration.ip.tcp.connection.Serializer<?> ) { this . org.springframework.integration.ip.tcp.connection.TcpConnectionSupport . setSerializer ( org.springframework.integration.ip.tcp.connection.Serializer<> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return this . org.springframework.integration.ip.tcp.connection.TcpConnectionSupport . isServer ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public javax.net.ssl.SSLSession javax.net.ssl.SSLSession ( ) { return this . org.springframework.integration.ip.tcp.connection.TcpConnectionSupport . getSslSession ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( Message < ? > org.springframework.integration.ip.tcp.connection.Message<?> ) { if ( this . org.springframework.integration.ip.tcp.connection.TcpListener == null ) { if ( org.springframework.integration.ip.tcp.connection.Message<> instanceof ErrorMessage ) { return false ; } else { throw new NoListenerException ( STRING ) ; } } return this . org.springframework.integration.ip.tcp.connection.TcpListener . onMessage ( org.springframework.integration.ip.tcp.connection.Message<> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Message < ? > org.springframework.integration.ip.tcp.connection.Message<?> ) throws java.lang.Exception { this . org.springframework.integration.ip.tcp.connection.TcpConnectionSupport . send ( org.springframework.integration.ip.tcp.connection.Message<> ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.ip.tcp.connection.TcpConnectionSupport org.springframework.integration.ip.tcp.connection.TcpConnectionSupport ( ) { return this . org.springframework.integration.ip.tcp.connection.TcpConnectionSupport ; }  <METHOD_END>
<METHOD_START> public void void ( TcpConnectionSupport org.springframework.integration.ip.tcp.connection.TcpConnectionSupport ) { this . org.springframework.integration.ip.tcp.connection.TcpConnectionSupport = org.springframework.integration.ip.tcp.connection.TcpConnectionSupport ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.ip.tcp.connection.TcpListener org.springframework.integration.ip.tcp.connection.TcpListener ( ) { return this . org.springframework.integration.ip.tcp.connection.TcpListener ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( TcpConnection org.springframework.integration.ip.tcp.connection.TcpConnection ) { if ( this . org.springframework.integration.ip.tcp.connection.TcpSender != null ) { this . org.springframework.integration.ip.tcp.connection.TcpSender . addNewConnection ( this ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( TcpConnection org.springframework.integration.ip.tcp.connection.TcpConnection ) { if ( this . org.springframework.integration.ip.tcp.connection.TcpSender != null ) { this . org.springframework.integration.ip.tcp.connection.TcpSender . removeDeadConnection ( this ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public long long ( ) { return this . org.springframework.integration.ip.tcp.connection.TcpConnectionSupport . incrementAndGetConnectionSequence ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.ip.tcp.connection.TcpSender org.springframework.integration.ip.tcp.connection.TcpSender ( ) { return this . org.springframework.integration.ip.tcp.connection.TcpSender ; }  <METHOD_END>
<METHOD_START> protected boolean boolean ( ) { if ( this . java.lang.Boolean != null ) { return this . java.lang.Boolean ; } TcpSender org.springframework.integration.ip.tcp.connection.TcpSender = this . org.springframework.integration.ip.tcp.connection.TcpSender ( ) ; while ( org.springframework.integration.ip.tcp.connection.TcpSender instanceof org.springframework.integration.ip.tcp.connection.TcpConnectionInterceptorSupport ) { org.springframework.integration.ip.tcp.connection.TcpSender = ( ( org.springframework.integration.ip.tcp.connection.TcpConnectionInterceptorSupport ) org.springframework.integration.ip.tcp.connection.TcpSender ) . org.springframework.integration.ip.tcp.connection.TcpSender ( ) ; } this . java.lang.Boolean = org.springframework.integration.ip.tcp.connection.TcpSender != null ; return this . java.lang.Boolean ; }  <METHOD_END>