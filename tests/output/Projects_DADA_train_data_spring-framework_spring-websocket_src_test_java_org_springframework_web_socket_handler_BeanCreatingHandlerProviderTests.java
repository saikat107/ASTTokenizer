<METHOD_START> @ Test public void void ( ) { BeanCreatingHandlerProvider < org.springframework.web.socket.handler.BeanCreatingHandlerProviderTests.SimpleEchoHandler > org.springframework.web.socket.handler.BeanCreatingHandlerProvider<org.springframework.web.socket.handler.BeanCreatingHandlerProviderTests.SimpleEchoHandler> = new BeanCreatingHandlerProvider <> ( org.springframework.web.socket.handler.BeanCreatingHandlerProviderTests.SimpleEchoHandler .class ) ; assertNotNull ( org.springframework.web.socket.handler.BeanCreatingHandlerProvider<org.springframework.web.socket.handler.BeanCreatingHandlerProviderTests.SimpleEchoHandler> . getHandler ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { @ java.lang.SuppressWarnings ( STRING ) ConfigurableApplicationContext org.springframework.web.socket.handler.ConfigurableApplicationContext = new AnnotationConfigApplicationContext ( org.springframework.web.socket.handler.BeanCreatingHandlerProviderTests.Config .class ) ; BeanCreatingHandlerProvider < org.springframework.web.socket.handler.BeanCreatingHandlerProviderTests.EchoHandler > org.springframework.web.socket.handler.BeanCreatingHandlerProvider<org.springframework.web.socket.handler.BeanCreatingHandlerProviderTests.EchoHandler> = new BeanCreatingHandlerProvider <> ( org.springframework.web.socket.handler.BeanCreatingHandlerProviderTests.EchoHandler .class ) ; org.springframework.web.socket.handler.BeanCreatingHandlerProvider<org.springframework.web.socket.handler.BeanCreatingHandlerProviderTests.EchoHandler> . setBeanFactory ( org.springframework.web.socket.handler.ConfigurableApplicationContext . getBeanFactory ( ) ) ; assertNotNull ( org.springframework.web.socket.handler.BeanCreatingHandlerProvider<org.springframework.web.socket.handler.BeanCreatingHandlerProviderTests.EchoHandler> . getHandler ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = BeanInstantiationException .class ) public void void ( ) { BeanCreatingHandlerProvider < org.springframework.web.socket.handler.BeanCreatingHandlerProviderTests.EchoHandler > org.springframework.web.socket.handler.BeanCreatingHandlerProvider<org.springframework.web.socket.handler.BeanCreatingHandlerProviderTests.EchoHandler> = new BeanCreatingHandlerProvider <> ( org.springframework.web.socket.handler.BeanCreatingHandlerProviderTests.EchoHandler .class ) ; org.springframework.web.socket.handler.BeanCreatingHandlerProvider<org.springframework.web.socket.handler.BeanCreatingHandlerProviderTests.EchoHandler> . getHandler ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.web.socket.handler.BeanCreatingHandlerProviderTests.EchoService org.springframework.web.socket.handler.BeanCreatingHandlerProviderTests.EchoService ( ) { return new org.springframework.web.socket.handler.BeanCreatingHandlerProviderTests.EchoService ( ) ; }  <METHOD_END>
<METHOD_START> @ Autowired public void ( org.springframework.web.socket.handler.BeanCreatingHandlerProviderTests.EchoService org.springframework.web.socket.handler.BeanCreatingHandlerProviderTests.EchoService ) { this . org.springframework.web.socket.handler.BeanCreatingHandlerProviderTests.EchoService = org.springframework.web.socket.handler.BeanCreatingHandlerProviderTests.EchoService ; }  <METHOD_END>