<METHOD_START> public void ( Endpoint org.springframework.web.socket.client.standard.Endpoint , java.lang.String java.lang.String , java.lang.Object ... java.lang.Object[] ) { super( java.lang.String , java.lang.Object[] ); Assert . notNull ( org.springframework.web.socket.client.standard.Endpoint , STRING ) ; this . org.springframework.web.socket.client.standard.BeanCreatingHandlerProvider<org.springframework.web.socket.client.standard.Endpoint> = null ; this . org.springframework.web.socket.client.standard.Endpoint = org.springframework.web.socket.client.standard.Endpoint ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.Class<? extends org.springframework.web.socket.client.standard.Endpoint> < ? extends Endpoint > java.lang.Class<? extends org.springframework.web.socket.client.standard.Endpoint> , java.lang.String java.lang.String , java.lang.Object ... java.lang.Object[] ) { super( java.lang.String , java.lang.Object[] ); Assert . notNull ( java.lang.Class<> , STRING ) ; this . org.springframework.web.socket.client.standard.BeanCreatingHandlerProvider<org.springframework.web.socket.client.standard.Endpoint> = new BeanCreatingHandlerProvider <> ( java.lang.Class<> ) ; this . org.springframework.web.socket.client.standard.Endpoint = null ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String ... java.lang.String[] ) { this . ClientEndpointConfig.Builder . preferredSubprotocols ( java.util.Arrays . java.util.List<java.lang.String> ( java.lang.String[] ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( Extension ... org.springframework.web.socket.client.standard.Extension[] ) { this . ClientEndpointConfig.Builder . extensions ( java.util.Arrays . java.util.List ( org.springframework.web.socket.client.standard.Extension[] ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.List<java.lang.Class<? extends org.springframework.web.socket.client.standard.Encoder>> < java.lang.Class<? extends org.springframework.web.socket.client.standard.Encoder> < ? extends Encoder > > java.util.List<java.lang.Class<? extends org.springframework.web.socket.client.standard.Encoder>> ) { this . ClientEndpointConfig.Builder . encoders ( java.util.List<java.lang.Class<? extends org.springframework.web.socket.client.standard.Encoder>> ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.List<java.lang.Class<? extends org.springframework.web.socket.client.standard.Decoder>> < java.lang.Class<? extends org.springframework.web.socket.client.standard.Decoder> < ? extends Decoder > > java.util.List<java.lang.Class<? extends org.springframework.web.socket.client.standard.Decoder>> ) { this . ClientEndpointConfig.Builder . decoders ( java.util.List<java.lang.Class<? extends org.springframework.web.socket.client.standard.Decoder>> ) ; }  <METHOD_END>
<METHOD_START> public void void ( Configurator org.springframework.web.socket.client.standard.Configurator ) { this . ClientEndpointConfig.Builder . configurator ( org.springframework.web.socket.client.standard.Configurator ) ; }  <METHOD_END>
<METHOD_START> public void void ( WebSocketContainer org.springframework.web.socket.client.standard.WebSocketContainer ) { this . org.springframework.web.socket.client.standard.WebSocketContainer = org.springframework.web.socket.client.standard.WebSocketContainer ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.socket.client.standard.WebSocketContainer org.springframework.web.socket.client.standard.WebSocketContainer ( ) { return this . org.springframework.web.socket.client.standard.WebSocketContainer ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( BeanFactory org.springframework.web.socket.client.standard.BeanFactory ) { if ( this . org.springframework.web.socket.client.standard.BeanCreatingHandlerProvider<org.springframework.web.socket.client.standard.Endpoint> != null ) { this . org.springframework.web.socket.client.standard.BeanCreatingHandlerProvider<org.springframework.web.socket.client.standard.Endpoint> . setBeanFactory ( org.springframework.web.socket.client.standard.BeanFactory ) ; } }  <METHOD_END>
<METHOD_START> public void void ( TaskExecutor org.springframework.web.socket.client.standard.TaskExecutor ) { Assert . notNull ( org.springframework.web.socket.client.standard.TaskExecutor , STRING ) ; this . org.springframework.web.socket.client.standard.TaskExecutor = org.springframework.web.socket.client.standard.TaskExecutor ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.socket.client.standard.TaskExecutor org.springframework.web.socket.client.standard.TaskExecutor ( ) { return this . org.springframework.web.socket.client.standard.TaskExecutor ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { this . org.springframework.web.socket.client.standard.TaskExecutor . execute ( new java.lang.Runnable ( ) { @ java.lang.Override public void void ( ) { try { if ( logger . isInfoEnabled ( ) ) { logger . info ( STRING + getUri ( ) ) ; } Endpoint org.springframework.web.socket.client.standard.Endpoint = ( org.springframework.web.socket.client.standard.Endpoint != null ) ? org.springframework.web.socket.client.standard.Endpoint : org.springframework.web.socket.client.standard.BeanCreatingHandlerProvider<org.springframework.web.socket.client.standard.Endpoint> . getHandler ( ) ; ClientEndpointConfig org.springframework.web.socket.client.standard.ClientEndpointConfig = ClientEndpointConfig.Builder . build ( ) ; org.springframework.web.socket.client.standard.Session = org.springframework.web.socket.client.standard.WebSocketContainer ( ) . connectToServer ( org.springframework.web.socket.client.standard.Endpoint , org.springframework.web.socket.client.standard.ClientEndpointConfig , getUri ( ) ) ; logger . info ( STRING ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { logger . error ( STRING , java.lang.Throwable ) ; } } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { try { if ( logger . isInfoEnabled ( ) ) { logger . info ( STRING + getUri ( ) ) ; } Endpoint org.springframework.web.socket.client.standard.Endpoint = ( org.springframework.web.socket.client.standard.Endpoint != null ) ? org.springframework.web.socket.client.standard.Endpoint : org.springframework.web.socket.client.standard.BeanCreatingHandlerProvider<org.springframework.web.socket.client.standard.Endpoint> . getHandler ( ) ; ClientEndpointConfig org.springframework.web.socket.client.standard.ClientEndpointConfig = ClientEndpointConfig.Builder . build ( ) ; org.springframework.web.socket.client.standard.Session = org.springframework.web.socket.client.standard.WebSocketContainer ( ) . connectToServer ( org.springframework.web.socket.client.standard.Endpoint , org.springframework.web.socket.client.standard.ClientEndpointConfig , getUri ( ) ) ; logger . info ( STRING ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { logger . error ( STRING , java.lang.Throwable ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) java.lang.Exception { try { if ( boolean ( ) ) { this . org.springframework.web.socket.client.standard.Session . close ( ) ; } } finally { this . org.springframework.web.socket.client.standard.Session = null ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( ) { return ( this . org.springframework.web.socket.client.standard.Session != null && this . org.springframework.web.socket.client.standard.Session . isOpen ( ) ) ; }  <METHOD_END>