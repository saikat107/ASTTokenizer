<METHOD_START> @ Test public void void ( ) { org.springframework.integration.router.config.ConfigurableApplicationContext . start ( ) ; Message < ? > org.springframework.integration.router.config.Message<?> = MessageBuilder . withPayload ( STRING ) . build ( ) ; Message < ? > org.springframework.integration.router.config.Message<?> = MessageBuilder . withPayload ( NUMBER ) . build ( ) ; Message < ? > org.springframework.integration.router.config.Message<?> = MessageBuilder . withPayload ( new java.lang.Integer [] { NUMBER , NUMBER , NUMBER } ) . build ( ) ; Message < ? > org.springframework.integration.router.config.Message<?> = MessageBuilder . withPayload ( new java.lang.Long [] { NUMBER , NUMBER , NUMBER } ) . build ( ) ; org.springframework.integration.router.config.PayloadTypeRouterParserTests.TestService . void ( org.springframework.integration.router.config.Message<> ) ; org.springframework.integration.router.config.PayloadTypeRouterParserTests.TestService . void ( org.springframework.integration.router.config.Message<> ) ; org.springframework.integration.router.config.PayloadTypeRouterParserTests.TestService . void ( org.springframework.integration.router.config.Message<> ) ; org.springframework.integration.router.config.PayloadTypeRouterParserTests.TestService . void ( org.springframework.integration.router.config.Message<> ) ; PollableChannel org.springframework.integration.router.config.PollableChannel = ( PollableChannel ) org.springframework.integration.router.config.ConfigurableApplicationContext . getBean ( STRING ) ; PollableChannel org.springframework.integration.router.config.PollableChannel = ( PollableChannel ) org.springframework.integration.router.config.ConfigurableApplicationContext . getBean ( STRING ) ; PollableChannel org.springframework.integration.router.config.PollableChannel = ( PollableChannel ) org.springframework.integration.router.config.ConfigurableApplicationContext . getBean ( STRING ) ; PollableChannel org.springframework.integration.router.config.PollableChannel = ( PollableChannel ) org.springframework.integration.router.config.ConfigurableApplicationContext . getBean ( STRING ) ; assertTrue ( org.springframework.integration.router.config.PollableChannel . receive ( NUMBER ) . getPayload ( ) instanceof java.lang.String ) ; assertTrue ( org.springframework.integration.router.config.PollableChannel . receive ( NUMBER ) . getPayload ( ) instanceof java.lang.Integer ) ; assertTrue ( org.springframework.integration.router.config.PollableChannel . receive ( NUMBER ) . getPayload ( ) . getClass ( ) . isArray ( ) ) ; assertTrue ( org.springframework.integration.router.config.PollableChannel . receive ( NUMBER ) . getPayload ( ) . getClass ( ) . isArray ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = BeanDefinitionStoreException .class ) public void void ( ) { java.io.ByteArrayInputStream java.io.ByteArrayInputStream = new java.io.ByteArrayInputStream ( java.lang.String . byte[] ( ) ) ; GenericApplicationContext org.springframework.integration.router.config.GenericApplicationContext = new GenericApplicationContext ( ) ; XmlBeanDefinitionReader org.springframework.integration.router.config.XmlBeanDefinitionReader = new XmlBeanDefinitionReader ( org.springframework.integration.router.config.GenericApplicationContext ) ; org.springframework.integration.router.config.XmlBeanDefinitionReader . setValidationMode ( XmlBeanDefinitionReader . VALIDATION_XSD ) ; org.springframework.integration.router.config.XmlBeanDefinitionReader . loadBeanDefinitions ( new InputStreamResource ( java.io.ByteArrayInputStream ) ) ; }  <METHOD_END>
<METHOD_START> void void ( Message < ? > org.springframework.integration.router.config.Message<?> );  <METHOD_END>