<METHOD_START> @ Test public void void ( ) { try { new ClassPathXmlApplicationContext ( STRING , java.lang.Class<? extends org.springframework.integration.file.config.FileOutboundChannelAdapterParserWithErrorsTests> ( ) ) . close ( ) ; } catch ( BeanDefinitionParsingException org.springframework.integration.file.config.BeanDefinitionParsingException ) { assertEquals ( STRING + STRING + STRING + STRING , org.springframework.integration.file.config.BeanDefinitionParsingException . getMessage ( ) ) ; return; } fail ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { try { new ClassPathXmlApplicationContext ( STRING , java.lang.Class<? extends org.springframework.integration.file.config.FileOutboundChannelAdapterParserWithErrorsTests> ( ) ) . close ( ) ; } catch ( BeanDefinitionParsingException org.springframework.integration.file.config.BeanDefinitionParsingException ) { assertEquals ( STRING + STRING + STRING , org.springframework.integration.file.config.BeanDefinitionParsingException . getMessage ( ) ) ; return; } fail ( STRING ) ; }  <METHOD_END>