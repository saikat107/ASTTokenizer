<METHOD_START> @ Before public void void ( ) { org.springframework.integration.config.annotation.TestApplicationContext . registerChannel ( STRING , org.springframework.integration.config.annotation.DirectChannel ) ; org.springframework.integration.config.annotation.TestApplicationContext . registerChannel ( STRING , org.springframework.integration.config.annotation.QueueChannel ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.InterruptedException { MessagingAnnotationPostProcessor org.springframework.integration.config.annotation.MessagingAnnotationPostProcessor = new MessagingAnnotationPostProcessor ( ) ; org.springframework.integration.config.annotation.MessagingAnnotationPostProcessor . setBeanFactory ( org.springframework.integration.config.annotation.TestApplicationContext . getBeanFactory ( ) ) ; org.springframework.integration.config.annotation.MessagingAnnotationPostProcessor . afterPropertiesSet ( ) ; org.springframework.integration.config.annotation.SplitterAnnotationPostProcessorTests.TestSplitter org.springframework.integration.config.annotation.SplitterAnnotationPostProcessorTests.TestSplitter = new org.springframework.integration.config.annotation.SplitterAnnotationPostProcessorTests.TestSplitter ( ) ; org.springframework.integration.config.annotation.MessagingAnnotationPostProcessor . postProcessAfterInitialization ( org.springframework.integration.config.annotation.SplitterAnnotationPostProcessorTests.TestSplitter , STRING ) ; org.springframework.integration.config.annotation.TestApplicationContext . refresh ( ) ; org.springframework.integration.config.annotation.DirectChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; Message < ? > org.springframework.integration.config.annotation.Message<?> = org.springframework.integration.config.annotation.QueueChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.config.annotation.Message<> ) ; assertEquals ( STRING , org.springframework.integration.config.annotation.Message<> . getPayload ( ) ) ; Message < ? > org.springframework.integration.config.annotation.Message<?> = org.springframework.integration.config.annotation.QueueChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.config.annotation.Message<> ) ; assertEquals ( STRING , org.springframework.integration.config.annotation.Message<> . getPayload ( ) ) ; Message < ? > org.springframework.integration.config.annotation.Message<?> = org.springframework.integration.config.annotation.QueueChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.config.annotation.Message<> ) ; assertEquals ( STRING , org.springframework.integration.config.annotation.Message<> . getPayload ( ) ) ; Message < ? > org.springframework.integration.config.annotation.Message<?> = org.springframework.integration.config.annotation.QueueChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.config.annotation.Message<> ) ; assertEquals ( STRING , org.springframework.integration.config.annotation.Message<> . getPayload ( ) ) ; assertNull ( org.springframework.integration.config.annotation.QueueChannel . receive ( NUMBER ) ) ; AbstractEndpoint org.springframework.integration.config.annotation.AbstractEndpoint = org.springframework.integration.config.annotation.TestApplicationContext . getBean ( AbstractEndpoint .class ) ; assertTrue ( org.springframework.integration.config.annotation.SplitterAnnotationPostProcessorTests.TestSplitter . boolean ( ) ) ; org.springframework.integration.config.annotation.AbstractEndpoint . stop ( ) ; assertFalse ( org.springframework.integration.config.annotation.SplitterAnnotationPostProcessorTests.TestSplitter . boolean ( ) ) ; org.springframework.integration.config.annotation.AbstractEndpoint . start ( ) ; assertTrue ( org.springframework.integration.config.annotation.SplitterAnnotationPostProcessorTests.TestSplitter . boolean ( ) ) ; org.springframework.integration.config.annotation.TestApplicationContext . stop ( ) ; }  <METHOD_END>
<METHOD_START> @ Splitter ( inputChannel = STRING , outputChannel = STRING ) public java.lang.String [] java.lang.String[] ( java.lang.String java.lang.String ) { return java.lang.String . java.lang.String[] ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { this . boolean = true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { this . boolean = false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return this . boolean ; }  <METHOD_END>