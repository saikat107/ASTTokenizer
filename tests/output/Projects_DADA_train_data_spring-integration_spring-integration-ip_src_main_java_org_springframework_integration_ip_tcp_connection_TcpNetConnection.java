<METHOD_START> public void ( java.net.Socket java.net.Socket , boolean boolean , boolean boolean , ApplicationEventPublisher org.springframework.integration.ip.tcp.connection.ApplicationEventPublisher , java.lang.String java.lang.String ) { super( java.net.Socket , boolean , boolean , org.springframework.integration.ip.tcp.connection.ApplicationEventPublisher , java.lang.String ); this . java.net.Socket = java.net.Socket ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { this . setNoReadErrorOnClose ( true ) ; try { this . java.net.Socket . void ( ) ; } catch ( java.lang.Exception java.lang.Exception ) {		} super. close ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return ! this . java.net.Socket . boolean ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) public synchronized void void ( Message < ? > org.springframework.integration.ip.tcp.connection.Message<?> ) throws java.lang.Exception { if ( this . java.io.OutputStream == null ) { int int = this . java.net.Socket . int ( ) ; this . java.io.OutputStream = new java.io.BufferedOutputStream ( this . java.net.Socket . java.io.OutputStream ( ) , int > NUMBER ? int : NUMBER ) ; } java.lang.Object java.lang.Object = this . getMapper ( ) . fromMessage ( org.springframework.integration.ip.tcp.connection.Message<> ) ; this . long = java.lang.System . long ( ) ; try { ( ( Serializer < java.lang.Object > ) this . getSerializer ( ) ) . serialize ( java.lang.Object , this . java.io.OutputStream ) ; this . java.io.OutputStream . void ( ) ; } catch ( java.lang.Exception java.lang.Exception ) { this . publishConnectionExceptionEvent ( new MessagingException ( org.springframework.integration.ip.tcp.connection.Message<> , STRING , java.lang.Exception ) ) ; this . closeConnection ( true ) ; throw java.lang.Exception ; } if ( logger . isDebugEnabled ( ) ) { logger . debug ( getConnectionId ( ) + STRING + org.springframework.integration.ip.tcp.connection.Message<> ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( ) java.lang.Exception { return this . getDeserializer ( ) . deserialize ( this . java.net.Socket . java.io.InputStream ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return this . java.net.Socket . int ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( ) { try { return this . java.net.Socket . java.io.InputStream ( ) ; } catch ( java.lang.Exception java.lang.Exception ) { return null ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public javax.net.ssl.SSLSession javax.net.ssl.SSLSession ( ) { if ( this . java.net.Socket instanceof javax.net.ssl.SSLSocket ) { return ( ( javax.net.ssl.SSLSocket ) this . java.net.Socket ) . javax.net.ssl.SSLSession ( ) ; } else { return null ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { boolean boolean = true ; if ( logger . isDebugEnabled ( ) ) { logger . debug ( this . getConnectionId ( ) + STRING ) ; } while ( boolean ) { Message < ? > org.springframework.integration.ip.tcp.connection.Message<?> = null ; try { org.springframework.integration.ip.tcp.connection.Message<?> = this . getMapper ( ) . toMessage ( this ) ; this . long = java.lang.System . long ( ) ; } catch ( java.lang.Exception java.lang.Exception ) { this . publishConnectionExceptionEvent ( java.lang.Exception ) ; if ( boolean ( java.lang.Exception ) ) { boolean = false ; } } if ( boolean && org.springframework.integration.ip.tcp.connection.Message<> != null ) { if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING + org.springframework.integration.ip.tcp.connection.Message<> ) ; } try { TcpListener org.springframework.integration.ip.tcp.connection.TcpListener = getListener ( ) ; if ( org.springframework.integration.ip.tcp.connection.TcpListener == null ) { throw new NoListenerException ( STRING ) ; } org.springframework.integration.ip.tcp.connection.TcpListener . onMessage ( org.springframework.integration.ip.tcp.connection.Message<> ) ; } catch ( NoListenerException org.springframework.integration.ip.tcp.connection.NoListenerException ) { if ( logger . isWarnEnabled ( ) ) { logger . warn ( STRING + getConnectionId ( ) + STRING + org.springframework.integration.ip.tcp.connection.Message<> ) ; } } catch ( java.lang.Exception java.lang.Exception ) { logger . error ( STRING + org.springframework.integration.ip.tcp.connection.Message<> , java.lang.Exception ) ; } } } }  <METHOD_END>
<METHOD_START> protected boolean boolean ( java.lang.Exception java.lang.Exception ) { boolean boolean = true ; if ( ! this . isServer ( ) && java.lang.Exception instanceof java.net.SocketTimeoutException ) { long long = java.lang.System . long ( ) ; try { int int = this . java.net.Socket . int ( ) ; if ( long - this . long < int && long - this . long < int * NUMBER ) { boolean = false ; } if ( ! boolean && logger . isDebugEnabled ( ) ) { logger . debug ( STRING + this . getConnectionId ( ) ) ; } } catch ( java.net.SocketException java.net.SocketException ) { logger . error ( STRING , java.net.SocketException ) ; } } if ( boolean ) { boolean boolean = this . isNoReadErrorOnClose ( ) ; closeConnection ( true ) ; if ( ! ( java.lang.Exception instanceof SoftEndOfStreamException ) ) { if ( java.lang.Exception instanceof java.net.SocketTimeoutException ) { if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING + this . getConnectionId ( ) ) ; } } else { if ( boolean ) { if ( logger . isTraceEnabled ( ) ) { logger . trace ( STRING + this . getConnectionId ( ) , java.lang.Exception ) ; } else if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING + this . getConnectionId ( ) + STRING + java.lang.Exception . java.lang.Class<? extends java.lang.Exception> ( ) . java.lang.String ( ) + STRING + ( java.lang.Exception . java.lang.Throwable ( ) != null ? java.lang.Exception . java.lang.Throwable ( ) + STRING : STRING ) + java.lang.Exception . java.lang.String ( ) ) ; } } else if ( logger . isTraceEnabled ( ) ) { logger . error ( STRING + this . getConnectionId ( ) , java.lang.Exception ) ; } else { logger . error ( STRING + this . getConnectionId ( ) + STRING + java.lang.Exception . java.lang.Class<? extends java.lang.Exception> ( ) . java.lang.String ( ) + STRING + ( java.lang.Exception . java.lang.Throwable ( ) != null ? java.lang.Exception . java.lang.Throwable ( ) + STRING : STRING ) + java.lang.Exception . java.lang.String ( ) ) ; } } this . sendExceptionToListener ( java.lang.Exception ) ; } } return boolean ; }  <METHOD_END>