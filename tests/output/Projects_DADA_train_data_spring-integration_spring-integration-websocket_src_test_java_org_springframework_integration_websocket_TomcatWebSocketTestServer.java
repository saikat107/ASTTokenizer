<METHOD_START> public void ( java.lang.Class<?> < ? > ... java.lang.Class<?>[] ) { this . org.springframework.integration.websocket.Tomcat = new Tomcat ( ) ; this . org.springframework.integration.websocket.Tomcat . setPort ( NUMBER ) ; this . org.springframework.integration.websocket.Tomcat . setBaseDir ( java.lang.String ( ) ) ; this . org.springframework.integration.websocket.AnnotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext ( ) ; this . org.springframework.integration.websocket.AnnotationConfigWebApplicationContext . register ( java.lang.Class<?>[] ) ; Context org.springframework.integration.websocket.Context = this . org.springframework.integration.websocket.Tomcat . addContext ( STRING , java.lang.System . java.lang.String ( STRING ) ) ; org.springframework.integration.websocket.Context . addApplicationListener ( WsContextListener .class . java.lang.String ( ) ) ; Tomcat . addServlet ( org.springframework.integration.websocket.Context , STRING , new DispatcherServlet ( this . org.springframework.integration.websocket.AnnotationConfigWebApplicationContext ) ) . setAsyncSupported ( true ) ; org.springframework.integration.websocket.Context . addServletMappingDecoded ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( ) { try { java.io.File java.io.File = java.io.File . java.io.File ( STRING , STRING ) ; java.io.File . boolean ( ) ; java.io.File . boolean ( ) ; java.io.File . void ( ) ; return java.io.File . java.lang.String ( ) ; } catch ( java.io.IOException java.io.IOException ) { throw new java.lang.RuntimeException ( STRING , java.io.IOException ) ; } }  <METHOD_END>
<METHOD_START> public org.springframework.integration.websocket.AnnotationConfigWebApplicationContext org.springframework.integration.websocket.AnnotationConfigWebApplicationContext ( ) { return this . org.springframework.integration.websocket.AnnotationConfigWebApplicationContext ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return STRING + this . org.springframework.integration.websocket.Tomcat . getConnector ( ) . getLocalPort ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.lang.Exception { this . org.springframework.integration.websocket.Tomcat . start ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.lang.Exception { this . org.springframework.integration.websocket.Tomcat . stop ( ) ; }  <METHOD_END>