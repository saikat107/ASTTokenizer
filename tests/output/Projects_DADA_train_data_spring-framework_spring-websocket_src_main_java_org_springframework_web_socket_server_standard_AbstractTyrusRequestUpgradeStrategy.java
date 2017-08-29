<METHOD_START> private static java.lang.reflect.Constructor<?> < ? > java.lang.reflect.Constructor<?> ( ) { for ( java.lang.reflect.Constructor<?> < ? > java.lang.reflect.Constructor<?> : TyrusEndpointWrapper .class . java.lang.reflect.Constructor<?>[] ( ) ) { java.lang.Class<?> < ? > [] java.lang.Class<?>[] = java.lang.reflect.Constructor<> . java.lang.Class<?>[] ( ) ; if ( Endpoint .class == java.lang.Class<?>[] [ NUMBER ] && EndpointConfig .class == java.lang.Class<?>[] [ NUMBER ] ) { return java.lang.reflect.Constructor<> ; } } throw new java.lang.IllegalStateException ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String [] java.lang.String[] ( ) { return StringUtils . tokenizeToStringArray ( Version . getSupportedWireProtocolVersions ( ) , STRING ) ; }  <METHOD_END>
<METHOD_START> protected java.util.List<org.springframework.web.socket.server.standard.WebSocketExtension> < WebSocketExtension > java.util.List<org.springframework.web.socket.server.standard.WebSocketExtension> ( WebSocketContainer org.springframework.web.socket.server.standard.WebSocketContainer ) { try { return super. getInstalledExtensions ( org.springframework.web.socket.server.standard.WebSocketContainer ) ; } catch ( java.lang.UnsupportedOperationException java.lang.UnsupportedOperationException ) { return new java.util.ArrayList<org.springframework.web.socket.server.standard.WebSocketExtension> <> ( NUMBER ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ServerHttpRequest org.springframework.web.socket.server.standard.ServerHttpRequest , ServerHttpResponse org.springframework.web.socket.server.standard.ServerHttpResponse , java.lang.String java.lang.String , java.util.List<org.springframework.web.socket.server.standard.Extension> < Extension > java.util.List<org.springframework.web.socket.server.standard.Extension> , Endpoint org.springframework.web.socket.server.standard.Endpoint )			throws org.springframework.web.socket.server.standard.HandshakeFailureException { HttpServletRequest org.springframework.web.socket.server.standard.HttpServletRequest = getHttpServletRequest ( org.springframework.web.socket.server.standard.ServerHttpRequest ) ; HttpServletResponse org.springframework.web.socket.server.standard.HttpServletResponse = getHttpServletResponse ( org.springframework.web.socket.server.standard.ServerHttpResponse ) ; TyrusServerContainer org.springframework.web.socket.server.standard.TyrusServerContainer = ( TyrusServerContainer ) getContainer ( org.springframework.web.socket.server.standard.HttpServletRequest ) ; TyrusWebSocketEngine org.springframework.web.socket.server.standard.TyrusWebSocketEngine = ( TyrusWebSocketEngine ) org.springframework.web.socket.server.standard.TyrusServerContainer . getWebSocketEngine ( ) ; java.lang.Object java.lang.Object = null ; boolean boolean ; try { java.lang.String java.lang.String = STRING + java.util.Random . long ( ) ; java.lang.Object = java.lang.Object ( org.springframework.web.socket.server.standard.Endpoint , java.lang.String , java.lang.String , java.util.List<org.springframework.web.socket.server.standard.Extension> , org.springframework.web.socket.server.standard.TyrusServerContainer , org.springframework.web.socket.server.standard.TyrusWebSocketEngine ) ; void ( org.springframework.web.socket.server.standard.TyrusWebSocketEngine , java.lang.Object ) ; HttpHeaders org.springframework.web.socket.server.standard.HttpHeaders = org.springframework.web.socket.server.standard.ServerHttpRequest . getHeaders ( ) ; RequestContext org.springframework.web.socket.server.standard.RequestContext = org.springframework.web.socket.server.standard.RequestContext ( org.springframework.web.socket.server.standard.HttpServletRequest , java.lang.String , org.springframework.web.socket.server.standard.HttpHeaders ) ; TyrusUpgradeResponse org.springframework.web.socket.server.standard.TyrusUpgradeResponse = new TyrusUpgradeResponse ( ) ; UpgradeInfo org.springframework.web.socket.server.standard.UpgradeInfo = org.springframework.web.socket.server.standard.TyrusWebSocketEngine . upgrade ( org.springframework.web.socket.server.standard.RequestContext , org.springframework.web.socket.server.standard.TyrusUpgradeResponse ) ; boolean = SUCCESS . equals ( org.springframework.web.socket.server.standard.UpgradeInfo . getStatus ( ) ) ; if ( boolean ) { if ( logger . isTraceEnabled ( ) ) { logger . trace ( STRING + org.springframework.web.socket.server.standard.TyrusUpgradeResponse . getHeaders ( ) ) ; } void ( org.springframework.web.socket.server.standard.HttpServletRequest , org.springframework.web.socket.server.standard.HttpServletResponse , org.springframework.web.socket.server.standard.UpgradeInfo , org.springframework.web.socket.server.standard.TyrusUpgradeResponse ) ; } } catch ( java.lang.Exception java.lang.Exception ) { void ( org.springframework.web.socket.server.standard.TyrusWebSocketEngine , java.lang.Object ) ; throw new HandshakeFailureException ( STRING + org.springframework.web.socket.server.standard.ServerHttpRequest . getURI ( ) , java.lang.Exception ) ; } void ( org.springframework.web.socket.server.standard.TyrusWebSocketEngine , java.lang.Object ) ; if ( ! boolean ) { throw new HandshakeFailureException ( STRING + org.springframework.web.socket.server.standard.ServerHttpRequest . getURI ( ) ) ; } }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( Endpoint org.springframework.web.socket.server.standard.Endpoint , java.lang.String java.lang.String , java.lang.String java.lang.String , java.util.List<org.springframework.web.socket.server.standard.Extension> < Extension > java.util.List<org.springframework.web.socket.server.standard.Extension> , WebSocketContainer org.springframework.web.socket.server.standard.WebSocketContainer , TyrusWebSocketEngine org.springframework.web.socket.server.standard.TyrusWebSocketEngine )			throws org.springframework.web.socket.server.standard.DeploymentException { ServerEndpointRegistration org.springframework.web.socket.server.standard.ServerEndpointRegistration = new ServerEndpointRegistration ( java.lang.String , org.springframework.web.socket.server.standard.Endpoint ) ; org.springframework.web.socket.server.standard.ServerEndpointRegistration . setSubprotocols ( java.util.Collections . java.util.List<java.lang.String> ( java.lang.String ) ) ; org.springframework.web.socket.server.standard.ServerEndpointRegistration . setExtensions ( java.util.List<org.springframework.web.socket.server.standard.Extension> ) ; return java.lang.Object ( org.springframework.web.socket.server.standard.ServerEndpointRegistration , this . org.springframework.web.socket.server.standard.ComponentProviderService , org.springframework.web.socket.server.standard.WebSocketContainer , org.springframework.web.socket.server.standard.TyrusWebSocketEngine ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.web.socket.server.standard.RequestContext org.springframework.web.socket.server.standard.RequestContext ( HttpServletRequest org.springframework.web.socket.server.standard.HttpServletRequest , java.lang.String java.lang.String , HttpHeaders org.springframework.web.socket.server.standard.HttpHeaders ) { RequestContext org.springframework.web.socket.server.standard.RequestContext = RequestContext . Builder . create ( ) . requestURI ( java.net.URI . java.net.URI ( java.lang.String ) ) . userPrincipal ( org.springframework.web.socket.server.standard.HttpServletRequest . getUserPrincipal ( ) ) . secure ( org.springframework.web.socket.server.standard.HttpServletRequest . isSecure ( ) ) . remoteAddr ( org.springframework.web.socket.server.standard.HttpServletRequest . getRemoteAddr ( ) ) . build ( ) ; for ( java.lang.String java.lang.String : org.springframework.web.socket.server.standard.HttpHeaders . keySet ( ) ) { org.springframework.web.socket.server.standard.RequestContext . getHeaders ( ) . put ( java.lang.String , org.springframework.web.socket.server.standard.HttpHeaders . get ( java.lang.String ) ) ; } return org.springframework.web.socket.server.standard.RequestContext ; }  <METHOD_END>
<METHOD_START> private void void ( TyrusWebSocketEngine org.springframework.web.socket.server.standard.TyrusWebSocketEngine , java.lang.Object java.lang.Object ) { if ( java.lang.Object != null ) { try { void ( org.springframework.web.socket.server.standard.TyrusWebSocketEngine , java.lang.Object ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { } } }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( ServerEndpointRegistration org.springframework.web.socket.server.standard.ServerEndpointRegistration , ComponentProviderService org.springframework.web.socket.server.standard.ComponentProviderService , WebSocketContainer org.springframework.web.socket.server.standard.WebSocketContainer , TyrusWebSocketEngine org.springframework.web.socket.server.standard.TyrusWebSocketEngine ) throws org.springframework.web.socket.server.standard.DeploymentException { DirectFieldAccessor org.springframework.web.socket.server.standard.DirectFieldAccessor = new DirectFieldAccessor ( org.springframework.web.socket.server.standard.TyrusWebSocketEngine ) ; java.lang.Object java.lang.Object = org.springframework.web.socket.server.standard.DirectFieldAccessor . getPropertyValue ( STRING ) ; java.lang.Object java.lang.Object = org.springframework.web.socket.server.standard.DirectFieldAccessor . getPropertyValue ( STRING ) ; try { if ( boolean ) { return java.lang.reflect.Constructor<> . newInstance ( org.springframework.web.socket.server.standard.ServerEndpointRegistration . getEndpoint ( ) , org.springframework.web.socket.server.standard.ServerEndpointRegistration , org.springframework.web.socket.server.standard.ComponentProviderService , org.springframework.web.socket.server.standard.WebSocketContainer , STRING , org.springframework.web.socket.server.standard.ServerEndpointRegistration . getConfigurator ( ) , java.lang.Object , java.lang.Object , null , java.lang.Boolean . java.lang.Boolean ) ; } else { return java.lang.reflect.Constructor<> . newInstance ( org.springframework.web.socket.server.standard.ServerEndpointRegistration . getEndpoint ( ) , org.springframework.web.socket.server.standard.ServerEndpointRegistration , org.springframework.web.socket.server.standard.ComponentProviderService , org.springframework.web.socket.server.standard.WebSocketContainer , STRING , org.springframework.web.socket.server.standard.ServerEndpointRegistration . getConfigurator ( ) , java.lang.Object , java.lang.Object , null ) ; } } catch ( java.lang.Exception java.lang.Exception ) { throw new HandshakeFailureException ( STRING + org.springframework.web.socket.server.standard.ServerEndpointRegistration , java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> private void void ( TyrusWebSocketEngine org.springframework.web.socket.server.standard.TyrusWebSocketEngine , java.lang.Object java.lang.Object ) { try { java.lang.reflect.Method . java.lang.Object ( org.springframework.web.socket.server.standard.TyrusWebSocketEngine , java.lang.Object ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new HandshakeFailureException ( STRING + java.lang.Object , java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> private void void ( TyrusWebSocketEngine org.springframework.web.socket.server.standard.TyrusWebSocketEngine , java.lang.Object java.lang.Object ) { try { java.lang.reflect.Method . java.lang.Object ( org.springframework.web.socket.server.standard.TyrusWebSocketEngine , java.lang.Object ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new HandshakeFailureException ( STRING + java.lang.Object , java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> protected abstract void void ( HttpServletRequest org.springframework.web.socket.server.standard.HttpServletRequest , HttpServletResponse org.springframework.web.socket.server.standard.HttpServletResponse , UpgradeInfo org.springframework.web.socket.server.standard.UpgradeInfo , TyrusUpgradeResponse org.springframework.web.socket.server.standard.TyrusUpgradeResponse ) throws java.io.IOException , org.springframework.web.socket.server.standard.ServletException ;  <METHOD_END>