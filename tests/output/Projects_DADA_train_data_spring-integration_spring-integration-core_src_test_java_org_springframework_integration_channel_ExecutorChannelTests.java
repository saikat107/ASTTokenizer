<METHOD_START> @ Test public void void ( ) java.lang.Exception { SimpleAsyncTaskExecutor org.springframework.integration.channel.SimpleAsyncTaskExecutor = new SimpleAsyncTaskExecutor ( ) ; org.springframework.integration.channel.SimpleAsyncTaskExecutor . setThreadNamePrefix ( STRING ) ; ExecutorChannel org.springframework.integration.channel.ExecutorChannel = new ExecutorChannel ( org.springframework.integration.channel.SimpleAsyncTaskExecutor ) ; java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; org.springframework.integration.channel.ExecutorChannelTests.TestHandler org.springframework.integration.channel.ExecutorChannelTests.TestHandler = new org.springframework.integration.channel.ExecutorChannelTests.TestHandler ( java.util.concurrent.CountDownLatch ) ; org.springframework.integration.channel.ExecutorChannel . subscribe ( org.springframework.integration.channel.ExecutorChannelTests.TestHandler ) ; org.springframework.integration.channel.ExecutorChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; assertEquals ( NUMBER , java.util.concurrent.CountDownLatch . long ( ) ) ; assertNotNull ( org.springframework.integration.channel.ExecutorChannelTests.TestHandler . java.lang.Thread ) ; assertFalse ( java.lang.Thread . java.lang.Thread ( ) . boolean ( org.springframework.integration.channel.ExecutorChannelTests.TestHandler . java.lang.Thread ) ) ; assertEquals ( STRING , org.springframework.integration.channel.ExecutorChannelTests.TestHandler . java.lang.Thread . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { int int = NUMBER ; ConcurrentTaskExecutor org.springframework.integration.channel.ConcurrentTaskExecutor = new ConcurrentTaskExecutor ( java.util.concurrent.Executors . java.util.concurrent.ScheduledExecutorService ( new CustomizableThreadFactory ( STRING ) ) ) ; ExecutorChannel org.springframework.integration.channel.ExecutorChannel = new ExecutorChannel ( org.springframework.integration.channel.ConcurrentTaskExecutor , new RoundRobinLoadBalancingStrategy ( ) ) ; java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( int ) ; org.springframework.integration.channel.ExecutorChannelTests.TestHandler org.springframework.integration.channel.ExecutorChannelTests.TestHandler = new org.springframework.integration.channel.ExecutorChannelTests.TestHandler ( java.util.concurrent.CountDownLatch ) ; org.springframework.integration.channel.ExecutorChannelTests.TestHandler org.springframework.integration.channel.ExecutorChannelTests.TestHandler = new org.springframework.integration.channel.ExecutorChannelTests.TestHandler ( java.util.concurrent.CountDownLatch ) ; org.springframework.integration.channel.ExecutorChannelTests.TestHandler org.springframework.integration.channel.ExecutorChannelTests.TestHandler = new org.springframework.integration.channel.ExecutorChannelTests.TestHandler ( java.util.concurrent.CountDownLatch ) ; org.springframework.integration.channel.ExecutorChannel . subscribe ( org.springframework.integration.channel.ExecutorChannelTests.TestHandler ) ; org.springframework.integration.channel.ExecutorChannel . subscribe ( org.springframework.integration.channel.ExecutorChannelTests.TestHandler ) ; org.springframework.integration.channel.ExecutorChannel . subscribe ( org.springframework.integration.channel.ExecutorChannelTests.TestHandler ) ; for ( int int = NUMBER ; int < int ; int ++ ) { org.springframework.integration.channel.ExecutorChannel . send ( new GenericMessage < java.lang.String > ( STRING + int ) ) ; } java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; assertEquals ( NUMBER , java.util.concurrent.CountDownLatch . long ( ) ) ; assertNotNull ( org.springframework.integration.channel.ExecutorChannelTests.TestHandler . java.lang.Thread ) ; assertFalse ( java.lang.Thread . java.lang.Thread ( ) . boolean ( org.springframework.integration.channel.ExecutorChannelTests.TestHandler . java.lang.Thread ) ) ; assertTrue ( org.springframework.integration.channel.ExecutorChannelTests.TestHandler . java.lang.Thread . java.lang.String ( ) . boolean ( STRING ) ) ; assertNotNull ( org.springframework.integration.channel.ExecutorChannelTests.TestHandler . java.lang.Thread ) ; assertFalse ( java.lang.Thread . java.lang.Thread ( ) . boolean ( org.springframework.integration.channel.ExecutorChannelTests.TestHandler . java.lang.Thread ) ) ; assertTrue ( org.springframework.integration.channel.ExecutorChannelTests.TestHandler . java.lang.Thread . java.lang.String ( ) . boolean ( STRING ) ) ; assertNotNull ( org.springframework.integration.channel.ExecutorChannelTests.TestHandler . java.lang.Thread ) ; assertFalse ( java.lang.Thread . java.lang.Thread ( ) . boolean ( org.springframework.integration.channel.ExecutorChannelTests.TestHandler . java.lang.Thread ) ) ; assertTrue ( org.springframework.integration.channel.ExecutorChannelTests.TestHandler . java.lang.Thread . java.lang.String ( ) . boolean ( STRING ) ) ; assertEquals ( NUMBER , org.springframework.integration.channel.ExecutorChannelTests.TestHandler . java.util.concurrent.atomic.AtomicInteger . int ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.channel.ExecutorChannelTests.TestHandler . java.util.concurrent.atomic.AtomicInteger . int ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.channel.ExecutorChannelTests.TestHandler . java.util.concurrent.atomic.AtomicInteger . int ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { int int = NUMBER ; ConcurrentTaskExecutor org.springframework.integration.channel.ConcurrentTaskExecutor = new ConcurrentTaskExecutor ( java.util.concurrent.Executors . java.util.concurrent.ScheduledExecutorService ( new CustomizableThreadFactory ( STRING ) ) ) ; ExecutorChannel org.springframework.integration.channel.ExecutorChannel = new ExecutorChannel ( org.springframework.integration.channel.ConcurrentTaskExecutor , new RoundRobinLoadBalancingStrategy ( ) ) ; java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( int ) ; org.springframework.integration.channel.ExecutorChannelTests.TestHandler org.springframework.integration.channel.ExecutorChannelTests.TestHandler = new org.springframework.integration.channel.ExecutorChannelTests.TestHandler ( java.util.concurrent.CountDownLatch ) ; org.springframework.integration.channel.ExecutorChannelTests.TestHandler org.springframework.integration.channel.ExecutorChannelTests.TestHandler = new org.springframework.integration.channel.ExecutorChannelTests.TestHandler ( java.util.concurrent.CountDownLatch ) ; org.springframework.integration.channel.ExecutorChannelTests.TestHandler org.springframework.integration.channel.ExecutorChannelTests.TestHandler = new org.springframework.integration.channel.ExecutorChannelTests.TestHandler ( java.util.concurrent.CountDownLatch ) ; org.springframework.integration.channel.ExecutorChannel . subscribe ( org.springframework.integration.channel.ExecutorChannelTests.TestHandler ) ; org.springframework.integration.channel.ExecutorChannel . subscribe ( org.springframework.integration.channel.ExecutorChannelTests.TestHandler ) ; org.springframework.integration.channel.ExecutorChannel . subscribe ( org.springframework.integration.channel.ExecutorChannelTests.TestHandler ) ; org.springframework.integration.channel.ExecutorChannelTests.TestHandler . boolean = true ; for ( int int = NUMBER ; int < int ; int ++ ) { org.springframework.integration.channel.ExecutorChannel . send ( new GenericMessage < java.lang.String > ( STRING + int ) ) ; } java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; assertEquals ( NUMBER , java.util.concurrent.CountDownLatch . long ( ) ) ; assertNotNull ( org.springframework.integration.channel.ExecutorChannelTests.TestHandler . java.lang.Thread ) ; assertFalse ( java.lang.Thread . java.lang.Thread ( ) . boolean ( org.springframework.integration.channel.ExecutorChannelTests.TestHandler . java.lang.Thread ) ) ; assertTrue ( org.springframework.integration.channel.ExecutorChannelTests.TestHandler . java.lang.Thread . java.lang.String ( ) . boolean ( STRING ) ) ; assertNotNull ( org.springframework.integration.channel.ExecutorChannelTests.TestHandler . java.lang.Thread ) ; assertFalse ( java.lang.Thread . java.lang.Thread ( ) . boolean ( org.springframework.integration.channel.ExecutorChannelTests.TestHandler . java.lang.Thread ) ) ; assertTrue ( org.springframework.integration.channel.ExecutorChannelTests.TestHandler . java.lang.Thread . java.lang.String ( ) . boolean ( STRING ) ) ; assertNotNull ( org.springframework.integration.channel.ExecutorChannelTests.TestHandler . java.lang.Thread ) ; assertFalse ( java.lang.Thread . java.lang.Thread ( ) . boolean ( org.springframework.integration.channel.ExecutorChannelTests.TestHandler . java.lang.Thread ) ) ; assertTrue ( org.springframework.integration.channel.ExecutorChannelTests.TestHandler . java.lang.Thread . java.lang.String ( ) . boolean ( STRING ) ) ; assertEquals ( NUMBER , org.springframework.integration.channel.ExecutorChannelTests.TestHandler . java.util.concurrent.atomic.AtomicInteger . int ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.channel.ExecutorChannelTests.TestHandler . java.util.concurrent.atomic.AtomicInteger . int ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.channel.ExecutorChannelTests.TestHandler . java.util.concurrent.atomic.AtomicInteger . int ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { int int = NUMBER ; ConcurrentTaskExecutor org.springframework.integration.channel.ConcurrentTaskExecutor = new ConcurrentTaskExecutor ( java.util.concurrent.Executors . java.util.concurrent.ScheduledExecutorService ( new CustomizableThreadFactory ( STRING ) ) ) ; ExecutorChannel org.springframework.integration.channel.ExecutorChannel = new ExecutorChannel ( org.springframework.integration.channel.ConcurrentTaskExecutor , null ) ; java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( int ) ; org.springframework.integration.channel.ExecutorChannelTests.TestHandler org.springframework.integration.channel.ExecutorChannelTests.TestHandler = new org.springframework.integration.channel.ExecutorChannelTests.TestHandler ( java.util.concurrent.CountDownLatch ) ; org.springframework.integration.channel.ExecutorChannelTests.TestHandler org.springframework.integration.channel.ExecutorChannelTests.TestHandler = new org.springframework.integration.channel.ExecutorChannelTests.TestHandler ( java.util.concurrent.CountDownLatch ) ; org.springframework.integration.channel.ExecutorChannelTests.TestHandler org.springframework.integration.channel.ExecutorChannelTests.TestHandler = new org.springframework.integration.channel.ExecutorChannelTests.TestHandler ( java.util.concurrent.CountDownLatch ) ; org.springframework.integration.channel.ExecutorChannel . subscribe ( org.springframework.integration.channel.ExecutorChannelTests.TestHandler ) ; org.springframework.integration.channel.ExecutorChannel . subscribe ( org.springframework.integration.channel.ExecutorChannelTests.TestHandler ) ; org.springframework.integration.channel.ExecutorChannel . subscribe ( org.springframework.integration.channel.ExecutorChannelTests.TestHandler ) ; org.springframework.integration.channel.ExecutorChannelTests.TestHandler . boolean = true ; for ( int int = NUMBER ; int < int ; int ++ ) { org.springframework.integration.channel.ExecutorChannel . send ( new GenericMessage < java.lang.String > ( STRING + int ) ) ; } java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; assertEquals ( NUMBER , java.util.concurrent.CountDownLatch . long ( ) ) ; assertNotNull ( org.springframework.integration.channel.ExecutorChannelTests.TestHandler . java.lang.Thread ) ; assertFalse ( java.lang.Thread . java.lang.Thread ( ) . boolean ( org.springframework.integration.channel.ExecutorChannelTests.TestHandler . java.lang.Thread ) ) ; assertTrue ( org.springframework.integration.channel.ExecutorChannelTests.TestHandler . java.lang.Thread . java.lang.String ( ) . boolean ( STRING ) ) ; assertNotNull ( org.springframework.integration.channel.ExecutorChannelTests.TestHandler . java.lang.Thread ) ; assertFalse ( java.lang.Thread . java.lang.Thread ( ) . boolean ( org.springframework.integration.channel.ExecutorChannelTests.TestHandler . java.lang.Thread ) ) ; assertTrue ( org.springframework.integration.channel.ExecutorChannelTests.TestHandler . java.lang.Thread . java.lang.String ( ) . boolean ( STRING ) ) ; assertNull ( org.springframework.integration.channel.ExecutorChannelTests.TestHandler . java.lang.Thread ) ; assertEquals ( NUMBER , org.springframework.integration.channel.ExecutorChannelTests.TestHandler . java.util.concurrent.atomic.AtomicInteger . int ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.channel.ExecutorChannelTests.TestHandler . java.util.concurrent.atomic.AtomicInteger . int ( ) ) ; assertEquals ( int , org.springframework.integration.channel.ExecutorChannelTests.TestHandler . java.util.concurrent.atomic.AtomicInteger . int ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ExecutorChannel org.springframework.integration.channel.ExecutorChannel = new ExecutorChannel ( new SyncTaskExecutor ( ) ) ; org.springframework.integration.channel.ExecutorChannel . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.channel.ExecutorChannel . afterPropertiesSet ( ) ; MessageHandler org.springframework.integration.channel.MessageHandler = mock ( MessageHandler .class ) ; Message < ? > org.springframework.integration.channel.Message<?> = mock ( Message .class ) ; org.springframework.integration.channel.ExecutorChannelTests.BeforeHandleInterceptor org.springframework.integration.channel.ExecutorChannelTests.BeforeHandleInterceptor = new org.springframework.integration.channel.ExecutorChannelTests.BeforeHandleInterceptor ( ) ; org.springframework.integration.channel.ExecutorChannelTests.BeforeHandleInterceptor . void ( org.springframework.integration.channel.Message<> ) ; org.springframework.integration.channel.ExecutorChannel . addInterceptor ( org.springframework.integration.channel.ExecutorChannelTests.BeforeHandleInterceptor ) ; org.springframework.integration.channel.ExecutorChannel . subscribe ( org.springframework.integration.channel.MessageHandler ) ; org.springframework.integration.channel.ExecutorChannel . send ( new GenericMessage < java.lang.Object > ( STRING ) ) ; verify ( org.springframework.integration.channel.MessageHandler ) . handleMessage ( org.springframework.integration.channel.Message<> ) ; assertEquals ( NUMBER , org.springframework.integration.channel.ExecutorChannelTests.BeforeHandleInterceptor . java.util.concurrent.atomic.AtomicInteger ( ) . int ( ) ) ; assertTrue ( org.springframework.integration.channel.ExecutorChannelTests.BeforeHandleInterceptor . boolean ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ExecutorChannel org.springframework.integration.channel.ExecutorChannel = new ExecutorChannel ( new SyncTaskExecutor ( ) ) ; org.springframework.integration.channel.ExecutorChannel . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.channel.ExecutorChannel . afterPropertiesSet ( ) ; Message < java.lang.Object > org.springframework.integration.channel.Message<java.lang.Object> = new GenericMessage < java.lang.Object > ( STRING ) ; MessageHandler org.springframework.integration.channel.MessageHandler = mock ( MessageHandler .class ) ; java.lang.IllegalStateException java.lang.IllegalStateException = new java.lang.IllegalStateException ( STRING ) ; willThrow ( java.lang.IllegalStateException ) . given ( org.springframework.integration.channel.MessageHandler ) . handleMessage ( org.springframework.integration.channel.Message<java.lang.Object> ) ; org.springframework.integration.channel.ExecutorChannelTests.BeforeHandleInterceptor org.springframework.integration.channel.ExecutorChannelTests.BeforeHandleInterceptor = new org.springframework.integration.channel.ExecutorChannelTests.BeforeHandleInterceptor ( ) ; org.springframework.integration.channel.ExecutorChannel . addInterceptor ( org.springframework.integration.channel.ExecutorChannelTests.BeforeHandleInterceptor ) ; org.springframework.integration.channel.ExecutorChannel . subscribe ( org.springframework.integration.channel.MessageHandler ) ; try { org.springframework.integration.channel.ExecutorChannel . send ( org.springframework.integration.channel.Message<java.lang.Object> ) ; } catch ( MessageDeliveryException org.springframework.integration.channel.MessageDeliveryException ) { assertSame ( java.lang.IllegalStateException , org.springframework.integration.channel.MessageDeliveryException . getCause ( ) ) ; } verify ( org.springframework.integration.channel.MessageHandler ) . handleMessage ( org.springframework.integration.channel.Message<java.lang.Object> ) ; assertEquals ( NUMBER , org.springframework.integration.channel.ExecutorChannelTests.BeforeHandleInterceptor . java.util.concurrent.atomic.AtomicInteger ( ) . int ( ) ) ; assertTrue ( org.springframework.integration.channel.ExecutorChannelTests.BeforeHandleInterceptor . boolean ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ExecutorChannel org.springframework.integration.channel.ExecutorChannel = new ExecutorChannel ( mock ( java.util.concurrent.Executor .class ) ) ; try { org.springframework.integration.channel.ExecutorChannel . subscribe ( m -> { } ) ; org.springframework.integration.channel.ExecutorChannel . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.channel.ExecutorChannel . afterPropertiesSet ( ) ; fail ( STRING ) ; } catch ( java.lang.IllegalStateException java.lang.IllegalStateException ) { assertThat ( java.lang.IllegalStateException . java.lang.String ( ) , equalTo ( STRING + STRING ) ) ; } }  <METHOD_END>
<METHOD_START> void ( java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch ) { this . java.util.concurrent.CountDownLatch = java.util.concurrent.CountDownLatch ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Message < ? > org.springframework.integration.channel.Message<?> ) { this . java.lang.Thread = java.lang.Thread . java.lang.Thread ( ) ; if ( this . boolean ) { throw new java.lang.RuntimeException ( STRING ) ; } this . java.util.concurrent.atomic.AtomicInteger . int ( ) ; this . java.util.concurrent.CountDownLatch . void ( ) ; }  <METHOD_END>
<METHOD_START> void ( ) { super(); }  <METHOD_END>
<METHOD_START> public void void ( Message < ? > org.springframework.integration.channel.Message<?> ) { this . org.springframework.integration.channel.Message<?> = org.springframework.integration.channel.Message<> ; }  <METHOD_END>
<METHOD_START> public java.util.concurrent.atomic.AtomicInteger java.util.concurrent.atomic.AtomicInteger ( ) { return this . java.util.concurrent.atomic.AtomicInteger ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.channel.Message<?> < ? > org.springframework.integration.channel.Message<?> ( Message < ? > org.springframework.integration.channel.Message<?> , MessageChannel org.springframework.integration.channel.MessageChannel , MessageHandler org.springframework.integration.channel.MessageHandler ) { assertNotNull ( org.springframework.integration.channel.Message<> ) ; this . java.util.concurrent.atomic.AtomicInteger . int ( ) ; return ( this . org.springframework.integration.channel.Message<> != null ? this . org.springframework.integration.channel.Message<> : org.springframework.integration.channel.Message<> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Message < ? > org.springframework.integration.channel.Message<?> , MessageChannel org.springframework.integration.channel.MessageChannel , MessageHandler org.springframework.integration.channel.MessageHandler , java.lang.Exception java.lang.Exception ) { this . boolean = true ; }  <METHOD_END>