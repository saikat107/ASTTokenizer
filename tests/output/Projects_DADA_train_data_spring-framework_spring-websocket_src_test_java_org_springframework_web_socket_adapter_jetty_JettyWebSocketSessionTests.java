<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { TestPrincipal org.springframework.web.socket.adapter.jetty.TestPrincipal = new TestPrincipal ( STRING ) ; JettyWebSocketSession org.springframework.web.socket.adapter.jetty.JettyWebSocketSession = new JettyWebSocketSession ( java.util.Map<java.lang.String,java.lang.Object> , org.springframework.web.socket.adapter.jetty.TestPrincipal ) ; assertSame ( org.springframework.web.socket.adapter.jetty.TestPrincipal , org.springframework.web.socket.adapter.jetty.JettyWebSocketSession . getPrincipal ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { TestPrincipal org.springframework.web.socket.adapter.jetty.TestPrincipal = new TestPrincipal ( STRING ) ; UpgradeRequest org.springframework.web.socket.adapter.jetty.UpgradeRequest = Mockito . mock ( UpgradeRequest .class ) ; given ( org.springframework.web.socket.adapter.jetty.UpgradeRequest . getUserPrincipal ( ) ) . willReturn ( org.springframework.web.socket.adapter.jetty.TestPrincipal ) ; UpgradeResponse org.springframework.web.socket.adapter.jetty.UpgradeResponse = Mockito . mock ( UpgradeResponse .class ) ; given ( org.springframework.web.socket.adapter.jetty.UpgradeResponse . getAcceptedSubProtocol ( ) ) . willReturn ( null ) ; Session org.springframework.web.socket.adapter.jetty.Session = Mockito . mock ( Session .class ) ; given ( org.springframework.web.socket.adapter.jetty.Session . getUpgradeRequest ( ) ) . willReturn ( org.springframework.web.socket.adapter.jetty.UpgradeRequest ) ; given ( org.springframework.web.socket.adapter.jetty.Session . getUpgradeResponse ( ) ) . willReturn ( org.springframework.web.socket.adapter.jetty.UpgradeResponse ) ; JettyWebSocketSession org.springframework.web.socket.adapter.jetty.JettyWebSocketSession = new JettyWebSocketSession ( java.util.Map<java.lang.String,java.lang.Object> ) ; org.springframework.web.socket.adapter.jetty.JettyWebSocketSession . initializeNativeSession ( org.springframework.web.socket.adapter.jetty.Session ) ; reset ( org.springframework.web.socket.adapter.jetty.Session ) ; assertSame ( org.springframework.web.socket.adapter.jetty.TestPrincipal , org.springframework.web.socket.adapter.jetty.JettyWebSocketSession . getPrincipal ( ) ) ; verifyNoMoreInteractions ( org.springframework.web.socket.adapter.jetty.Session ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { UpgradeRequest org.springframework.web.socket.adapter.jetty.UpgradeRequest = Mockito . mock ( UpgradeRequest .class ) ; given ( org.springframework.web.socket.adapter.jetty.UpgradeRequest . getUserPrincipal ( ) ) . willReturn ( null ) ; UpgradeResponse org.springframework.web.socket.adapter.jetty.UpgradeResponse = Mockito . mock ( UpgradeResponse .class ) ; given ( org.springframework.web.socket.adapter.jetty.UpgradeResponse . getAcceptedSubProtocol ( ) ) . willReturn ( null ) ; Session org.springframework.web.socket.adapter.jetty.Session = Mockito . mock ( Session .class ) ; given ( org.springframework.web.socket.adapter.jetty.Session . getUpgradeRequest ( ) ) . willReturn ( org.springframework.web.socket.adapter.jetty.UpgradeRequest ) ; given ( org.springframework.web.socket.adapter.jetty.Session . getUpgradeResponse ( ) ) . willReturn ( org.springframework.web.socket.adapter.jetty.UpgradeResponse ) ; JettyWebSocketSession org.springframework.web.socket.adapter.jetty.JettyWebSocketSession = new JettyWebSocketSession ( java.util.Map<java.lang.String,java.lang.Object> ) ; org.springframework.web.socket.adapter.jetty.JettyWebSocketSession . initializeNativeSession ( org.springframework.web.socket.adapter.jetty.Session ) ; reset ( org.springframework.web.socket.adapter.jetty.Session ) ; assertNull ( org.springframework.web.socket.adapter.jetty.JettyWebSocketSession . getPrincipal ( ) ) ; verifyNoMoreInteractions ( org.springframework.web.socket.adapter.jetty.Session ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { java.lang.String java.lang.String = STRING ; UpgradeRequest org.springframework.web.socket.adapter.jetty.UpgradeRequest = Mockito . mock ( UpgradeRequest .class ) ; given ( org.springframework.web.socket.adapter.jetty.UpgradeRequest . getUserPrincipal ( ) ) . willReturn ( null ) ; UpgradeResponse org.springframework.web.socket.adapter.jetty.UpgradeResponse = Mockito . mock ( UpgradeResponse .class ) ; given ( org.springframework.web.socket.adapter.jetty.UpgradeResponse . getAcceptedSubProtocol ( ) ) . willReturn ( java.lang.String ) ; Session org.springframework.web.socket.adapter.jetty.Session = Mockito . mock ( Session .class ) ; given ( org.springframework.web.socket.adapter.jetty.Session . getUpgradeRequest ( ) ) . willReturn ( org.springframework.web.socket.adapter.jetty.UpgradeRequest ) ; given ( org.springframework.web.socket.adapter.jetty.Session . getUpgradeResponse ( ) ) . willReturn ( org.springframework.web.socket.adapter.jetty.UpgradeResponse ) ; JettyWebSocketSession org.springframework.web.socket.adapter.jetty.JettyWebSocketSession = new JettyWebSocketSession ( java.util.Map<java.lang.String,java.lang.Object> ) ; org.springframework.web.socket.adapter.jetty.JettyWebSocketSession . initializeNativeSession ( org.springframework.web.socket.adapter.jetty.Session ) ; reset ( org.springframework.web.socket.adapter.jetty.Session ) ; assertSame ( java.lang.String , org.springframework.web.socket.adapter.jetty.JettyWebSocketSession . getAcceptedProtocol ( ) ) ; verifyNoMoreInteractions ( org.springframework.web.socket.adapter.jetty.Session ) ; }  <METHOD_END>