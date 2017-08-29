<METHOD_START> @ Before public void void ( ) { java.io.File java.io.File = new java.io.File ( java.lang.String , STRING ) ; java.io.File . boolean ( ) ; this . java.io.File = java.io.File ; }  <METHOD_END>
<METHOD_START> @ After public void void ( ) { if ( this . org.springframework.integration.file.tail.FileTailingMessageProducerSupport != null ) { org.springframework.integration.file.tail.FileTailingMessageProducerSupport . stop ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test @ TailAvailable public void void ( ) java.lang.Exception { OSDelegatingFileTailingMessageProducer org.springframework.integration.file.tail.OSDelegatingFileTailingMessageProducer = new OSDelegatingFileTailingMessageProducer ( ) ; org.springframework.integration.file.tail.OSDelegatingFileTailingMessageProducer . setOptions ( java.lang.String ) ; void ( org.springframework.integration.file.tail.OSDelegatingFileTailingMessageProducer , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ApacheCommonsFileTailingMessageProducer org.springframework.integration.file.tail.ApacheCommonsFileTailingMessageProducer = new ApacheCommonsFileTailingMessageProducer ( ) ; org.springframework.integration.file.tail.ApacheCommonsFileTailingMessageProducer . setPollingDelay ( NUMBER ) ; org.springframework.integration.file.tail.ApacheCommonsFileTailingMessageProducer . setEnd ( false ) ; void ( org.springframework.integration.file.tail.ApacheCommonsFileTailingMessageProducer , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test @ TailAvailable public void void ( ) java.io.IOException { java.io.File java.io.File = java.io.File . java.io.File ( STRING , STRING ) ; java.lang.String java.lang.String = STRING ; java.io.File java.io.File = java.io.File . java.io.File ( STRING , STRING ) ; java.lang.String java.lang.String = STRING ; OSDelegatingFileTailingMessageProducer org.springframework.integration.file.tail.OSDelegatingFileTailingMessageProducer = new OSDelegatingFileTailingMessageProducer ( ) ; org.springframework.integration.file.tail.OSDelegatingFileTailingMessageProducer . setFile ( java.io.File ) ; org.springframework.integration.file.tail.OSDelegatingFileTailingMessageProducer . setOptions ( java.lang.String ) ; org.springframework.integration.file.tail.OSDelegatingFileTailingMessageProducer . setOutputChannel ( new QueueChannel ( ) ) ; org.springframework.integration.file.tail.OSDelegatingFileTailingMessageProducer . setTailAttemptsDelay ( NUMBER ) ; org.springframework.integration.file.tail.OSDelegatingFileTailingMessageProducer . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.file.tail.OSDelegatingFileTailingMessageProducer . afterPropertiesSet ( ) ; org.springframework.integration.file.tail.OSDelegatingFileTailingMessageProducer . start ( ) ; assertEquals ( STRING + java.lang.String + STRING + java.io.File . java.lang.String ( ) , org.springframework.integration.file.tail.OSDelegatingFileTailingMessageProducer . getCommand ( ) ) ; org.springframework.integration.file.tail.OSDelegatingFileTailingMessageProducer . stop ( ) ; org.springframework.integration.file.tail.OSDelegatingFileTailingMessageProducer . setFile ( java.io.File ) ; org.springframework.integration.file.tail.OSDelegatingFileTailingMessageProducer . start ( ) ; assertEquals ( STRING + java.lang.String + STRING + java.io.File . java.lang.String ( ) , org.springframework.integration.file.tail.OSDelegatingFileTailingMessageProducer . getCommand ( ) ) ; org.springframework.integration.file.tail.OSDelegatingFileTailingMessageProducer . stop ( ) ; org.springframework.integration.file.tail.OSDelegatingFileTailingMessageProducer . setOptions ( java.lang.String ) ; org.springframework.integration.file.tail.OSDelegatingFileTailingMessageProducer . start ( ) ; assertEquals ( STRING + java.lang.String + STRING + java.io.File . java.lang.String ( ) , org.springframework.integration.file.tail.OSDelegatingFileTailingMessageProducer . getCommand ( ) ) ; org.springframework.integration.file.tail.OSDelegatingFileTailingMessageProducer . stop ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ApacheCommonsFileTailingMessageProducer org.springframework.integration.file.tail.ApacheCommonsFileTailingMessageProducer = new ApacheCommonsFileTailingMessageProducer ( ) ; ThreadPoolTaskScheduler org.springframework.integration.file.tail.ThreadPoolTaskScheduler = new ThreadPoolTaskScheduler ( ) ; org.springframework.integration.file.tail.ThreadPoolTaskScheduler . afterPropertiesSet ( ) ; org.springframework.integration.file.tail.ApacheCommonsFileTailingMessageProducer . setTaskScheduler ( org.springframework.integration.file.tail.ThreadPoolTaskScheduler ) ; java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; org.springframework.integration.file.tail.ApacheCommonsFileTailingMessageProducer . setApplicationEventPublisher ( event -> { if ( event instanceof FileTailingIdleEvent ) { idleCountDownLatch . countDown ( ) ; } if ( event instanceof FileTailingEvent ) { FileTailingEvent fileTailingEvent = ( FileTailingEvent ) event ; if ( fileTailingEvent . getMessage ( ) . contains ( STRING ) ) { fileExistCountDownLatch . countDown ( ) ; } } } ) ; java.io.File java.io.File = spy ( new java.io.File ( this . java.io.File , STRING ) ) ; java.io.File . boolean ( ) ; org.springframework.integration.file.tail.ApacheCommonsFileTailingMessageProducer . setFile ( java.io.File ) ; org.springframework.integration.file.tail.ApacheCommonsFileTailingMessageProducer . setOutputChannel ( new NullChannel ( ) ) ; org.springframework.integration.file.tail.ApacheCommonsFileTailingMessageProducer . setIdleEventInterval ( NUMBER ) ; org.springframework.integration.file.tail.ApacheCommonsFileTailingMessageProducer . afterPropertiesSet ( ) ; org.springframework.integration.file.tail.ApacheCommonsFileTailingMessageProducer . start ( ) ; boolean boolean = java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; assertTrue ( STRING , boolean ) ; boolean boolean = java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; assertFalse ( STRING , boolean ) ; verify ( java.io.File , atLeastOnce ( ) ) . exists ( ) ; java.io.File . boolean ( ) ; boolean boolean = java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; assertTrue ( STRING , boolean ) ; org.springframework.integration.file.tail.ApacheCommonsFileTailingMessageProducer . stop ( ) ; java.io.File . boolean ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( FileTailingMessageProducerSupport org.springframework.integration.file.tail.FileTailingMessageProducerSupport , java.lang.String java.lang.String )			throws java.lang.Exception { this . org.springframework.integration.file.tail.FileTailingMessageProducerSupport = org.springframework.integration.file.tail.FileTailingMessageProducerSupport ; ThreadPoolTaskScheduler org.springframework.integration.file.tail.ThreadPoolTaskScheduler = new ThreadPoolTaskScheduler ( ) ; org.springframework.integration.file.tail.ThreadPoolTaskScheduler . afterPropertiesSet ( ) ; org.springframework.integration.file.tail.FileTailingMessageProducerSupport . setTaskScheduler ( org.springframework.integration.file.tail.ThreadPoolTaskScheduler ) ; final java.util.List<org.springframework.integration.file.tail.FileTailingEvent> < FileTailingEvent > java.util.List<org.springframework.integration.file.tail.FileTailingEvent> = new java.util.ArrayList<org.springframework.integration.file.tail.FileTailingEvent> < FileTailingEvent > ( ) ; org.springframework.integration.file.tail.FileTailingMessageProducerSupport . setApplicationEventPublisher ( event -> { FileTailingEvent tailEvent = ( FileTailingEvent ) event ; logger . debug ( event ) ; events . add ( tailEvent ) ; } ) ; org.springframework.integration.file.tail.FileTailingMessageProducerSupport . setFile ( new java.io.File ( java.io.File , STRING ) ) ; QueueChannel org.springframework.integration.file.tail.QueueChannel = new QueueChannel ( ) ; org.springframework.integration.file.tail.FileTailingMessageProducerSupport . setOutputChannel ( org.springframework.integration.file.tail.QueueChannel ) ; org.springframework.integration.file.tail.FileTailingMessageProducerSupport . setTailAttemptsDelay ( NUMBER ) ; org.springframework.integration.file.tail.FileTailingMessageProducerSupport . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.file.tail.FileTailingMessageProducerSupport . afterPropertiesSet ( ) ; java.io.File java.io.File = new java.io.File ( java.io.File , STRING ) ; java.io.File java.io.File = new java.io.File ( java.io.File , STRING ) ; java.io.File . boolean ( ) ; java.io.File . boolean ( ) ; org.springframework.integration.file.tail.FileTailingMessageProducerSupport . start ( ) ; void ( org.springframework.integration.file.tail.FileTailingMessageProducerSupport , java.lang.String ) ; java.io.FileOutputStream java.io.FileOutputStream = new java.io.FileOutputStream ( java.io.File ) ; for ( int int = NUMBER ; int < NUMBER ; int ++ ) { java.io.FileOutputStream . void ( ( STRING + int + STRING ) . byte[] ( ) ) ; } java.io.FileOutputStream . void ( ) ; java.io.FileOutputStream . void ( ) ; for ( int int = NUMBER ; int < NUMBER ; int ++ ) { Message < ? > org.springframework.integration.file.tail.Message<?> = org.springframework.integration.file.tail.QueueChannel . receive ( NUMBER ) ; assertNotNull ( STRING , org.springframework.integration.file.tail.Message<> ) ; assertEquals ( STRING + int , org.springframework.integration.file.tail.Message<> . getPayload ( ) ) ; } java.io.File . boolean ( java.io.File ) ; java.io.File = new java.io.File ( java.io.File , STRING ) ; java.io.FileOutputStream = new java.io.FileOutputStream ( java.io.File ) ; if ( org.springframework.integration.file.tail.FileTailingMessageProducerSupport instanceof ApacheCommonsFileTailingMessageProducer ) { java.lang.Thread . void ( NUMBER ) ; } for ( int int = NUMBER ; int < NUMBER ; int ++ ) { java.io.FileOutputStream . void ( ( STRING + int + STRING ) . byte[] ( ) ) ; } java.io.FileOutputStream . void ( ) ; java.io.FileOutputStream . void ( ) ; for ( int int = NUMBER ; int < NUMBER ; int ++ ) { Message < ? > org.springframework.integration.file.tail.Message<?> = org.springframework.integration.file.tail.QueueChannel . receive ( NUMBER ) ; assertNotNull ( STRING , org.springframework.integration.file.tail.Message<> ) ; assertEquals ( STRING + int , org.springframework.integration.file.tail.Message<> . getPayload ( ) ) ; assertEquals ( java.io.File , org.springframework.integration.file.tail.Message<> . getHeaders ( ) . get ( FileHeaders . ORIGINAL_FILE ) ) ; assertEquals ( java.io.File . java.lang.String ( ) , org.springframework.integration.file.tail.Message<> . getHeaders ( ) . get ( FileHeaders . FILENAME ) ) ; } assertThat ( java.util.List<org.springframework.integration.file.tail.FileTailingEvent> . size ( ) , greaterThanOrEqualTo ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( FileTailingMessageProducerSupport org.springframework.integration.file.tail.FileTailingMessageProducerSupport , java.lang.String java.lang.String ) throws java.lang.Exception { int int = NUMBER ; DirectFieldAccessor org.springframework.integration.file.tail.DirectFieldAccessor = new DirectFieldAccessor ( org.springframework.integration.file.tail.FileTailingMessageProducerSupport ) ; while ( int < NUMBER ) { if ( org.springframework.integration.file.tail.DirectFieldAccessor . getPropertyValue ( java.lang.String ) == null ) { java.lang.Thread . void ( NUMBER ) ; } else { return; } } fail ( STRING ) ; }  <METHOD_END>