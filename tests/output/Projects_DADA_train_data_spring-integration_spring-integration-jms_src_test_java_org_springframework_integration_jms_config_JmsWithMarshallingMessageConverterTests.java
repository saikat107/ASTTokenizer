<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { ActiveMqTestUtils . prepare ( ) ; ConfigurableApplicationContext org.springframework.integration.jms.config.ConfigurableApplicationContext = new ClassPathXmlApplicationContext ( STRING , org.springframework.integration.jms.config.JmsWithMarshallingMessageConverterTests .class ) ; MessageChannel org.springframework.integration.jms.config.MessageChannel = org.springframework.integration.jms.config.ConfigurableApplicationContext . getBean ( STRING , MessageChannel .class ) ; PollableChannel org.springframework.integration.jms.config.PollableChannel = org.springframework.integration.jms.config.ConfigurableApplicationContext . getBean ( STRING , PollableChannel .class ) ; org.springframework.integration.jms.config.MessageChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; Message < java.lang.String > org.springframework.integration.jms.config.Message<java.lang.String> = ( Message < java.lang.String > ) org.springframework.integration.jms.config.PollableChannel . receive ( ) ; MessageHeaders org.springframework.integration.jms.config.MessageHeaders = org.springframework.integration.jms.config.Message<java.lang.String> . getHeaders ( ) ; assertNotNull ( org.springframework.integration.jms.config.MessageHeaders . get ( STRING ) ) ; assertEquals ( STRING , org.springframework.integration.jms.config.Message<java.lang.String> . getPayload ( ) ) ; org.springframework.integration.jms.config.ConfigurableApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return java.lang.String . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Object java.lang.Object , javax.xml.transform.Result javax.xml.transform.Result ) throws java.io.IOException , org.springframework.integration.jms.config.XmlMappingException { java.lang.String java.lang.String = null ; if ( java.lang.Object instanceof Message < ? > ) { java.lang.String = ( java.lang.String ) ( ( Message < ? > ) java.lang.Object ) . getPayload ( ) ; } else { java.lang.String = ( java.lang.String ) java.lang.Object ; } ( ( javax.xml.transform.stream.StreamResult ) javax.xml.transform.Result ) . java.io.OutputStream ( ) . void ( java.lang.String . byte[] ( ) ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( java.lang.Class<?> < ? > java.lang.Class<?> ) { return true ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( java.lang.Class<?> < ? > java.lang.Class<?> ) { return true ; }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( javax.xml.transform.Source javax.xml.transform.Source ) throws java.io.IOException , org.springframework.integration.jms.config.XmlMappingException { java.io.InputStream java.io.InputStream = ( ( javax.xml.transform.stream.StreamSource ) javax.xml.transform.Source ) . java.io.InputStream ( ) ; byte [] byte[] = new byte [ java.io.InputStream . int ( ) ] ; java.io.InputStream . int ( byte[] ) ; return new GenericMessage < java.lang.String > ( new java.lang.String ( byte[] ) ) ; }  <METHOD_END>