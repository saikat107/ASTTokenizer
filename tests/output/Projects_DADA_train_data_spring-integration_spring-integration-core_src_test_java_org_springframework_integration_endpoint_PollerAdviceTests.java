<METHOD_START> @ Test public void void ( ) java.lang.Exception { SourcePollingChannelAdapter org.springframework.integration.endpoint.SourcePollingChannelAdapter = new SourcePollingChannelAdapter ( ) ; final java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . setSource ( ( ) { latch . countDown ( ) ; return null ; } ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . setTrigger ( new Trigger ( ) { private boolean boolean ; @ java.lang.Override public java.util.Date java.util.Date ( TriggerContext org.springframework.integration.endpoint.TriggerContext ) { java.util.Date java.util.Date = boolean ? null : new java.util.Date ( java.lang.System . long ( ) + NUMBER ) ; boolean = true ; return java.util.Date ; } } ) ; void ( org.springframework.integration.endpoint.SourcePollingChannelAdapter ) ; java.util.List<org.springframework.integration.endpoint.Advice> < Advice > java.util.List<org.springframework.integration.endpoint.Advice> = new java.util.ArrayList<org.springframework.integration.endpoint.Advice> < Advice > ( ) ; PollSkipAdvice org.springframework.integration.endpoint.PollSkipAdvice = new PollSkipAdvice ( ) ; java.util.List<org.springframework.integration.endpoint.Advice> . add ( org.springframework.integration.endpoint.PollSkipAdvice ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . setAdviceChain ( java.util.List<org.springframework.integration.endpoint.Advice> ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . afterPropertiesSet ( ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . start ( ) ; assertTrue ( java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . stop ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Date java.util.Date ( TriggerContext org.springframework.integration.endpoint.TriggerContext ) { java.util.Date java.util.Date = boolean ? null : new java.util.Date ( java.lang.System . long ( ) + NUMBER ) ; boolean = true ; return java.util.Date ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { SourcePollingChannelAdapter org.springframework.integration.endpoint.SourcePollingChannelAdapter = new SourcePollingChannelAdapter ( ) ; class LocalSource implements MessageSource < java.lang.Object > { private final java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch ; private void ( java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch ) { this . java.util.concurrent.CountDownLatch = java.util.concurrent.CountDownLatch ; } @ java.lang.Override public org.springframework.integration.endpoint.Message<java.lang.Object> < java.lang.Object > org.springframework.integration.endpoint.Message<java.lang.Object> ( ) { java.util.concurrent.CountDownLatch . void ( ) ; return null ; } } java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . setSource ( new LocalSource ( java.util.concurrent.CountDownLatch ) ) ; class OneAndDone10msTrigger implements Trigger { private boolean boolean ; @ java.lang.Override public java.util.Date java.util.Date ( TriggerContext org.springframework.integration.endpoint.TriggerContext ) { java.util.Date java.util.Date = boolean ? null : new java.util.Date ( java.lang.System . long ( ) + NUMBER ) ; boolean = true ; return java.util.Date ; } } org.springframework.integration.endpoint.SourcePollingChannelAdapter . setTrigger ( new OneAndDone10msTrigger ( ) ) ; void ( org.springframework.integration.endpoint.SourcePollingChannelAdapter ) ; java.util.List<org.springframework.integration.endpoint.Advice> < Advice > java.util.List<org.springframework.integration.endpoint.Advice> = new java.util.ArrayList<org.springframework.integration.endpoint.Advice> <> ( ) ; SimplePollSkipStrategy org.springframework.integration.endpoint.SimplePollSkipStrategy = new SimplePollSkipStrategy ( ) ; org.springframework.integration.endpoint.SimplePollSkipStrategy . skipPolls ( ) ; PollSkipAdvice org.springframework.integration.endpoint.PollSkipAdvice = new PollSkipAdvice ( org.springframework.integration.endpoint.SimplePollSkipStrategy ) ; java.util.List<org.springframework.integration.endpoint.Advice> . add ( org.springframework.integration.endpoint.PollSkipAdvice ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . setAdviceChain ( java.util.List<org.springframework.integration.endpoint.Advice> ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . afterPropertiesSet ( ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . start ( ) ; assertFalse ( java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . stop ( ) ; org.springframework.integration.endpoint.SimplePollSkipStrategy . reset ( ) ; java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . setSource ( new LocalSource ( java.util.concurrent.CountDownLatch ) ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . setTrigger ( new OneAndDone10msTrigger ( ) ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . start ( ) ; assertTrue ( java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . stop ( ) ; }  <METHOD_END>
<METHOD_START> private void ( java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch ) { this . java.util.concurrent.CountDownLatch = java.util.concurrent.CountDownLatch ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.endpoint.Message<java.lang.Object> < java.lang.Object > org.springframework.integration.endpoint.Message<java.lang.Object> ( ) { java.util.concurrent.CountDownLatch . void ( ) ; return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Date java.util.Date ( TriggerContext org.springframework.integration.endpoint.TriggerContext ) { java.util.Date java.util.Date = boolean ? null : new java.util.Date ( java.lang.System . long ( ) + NUMBER ) ; boolean = true ; return java.util.Date ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.integration.endpoint.MessageChannel . send ( new GenericMessage <> ( STRING ) ) ; assertTrue ( this . org.springframework.integration.endpoint.SimplePollSkipStrategy . skipPoll ( ) ) ; this . org.springframework.integration.endpoint.MessageChannel . send ( new GenericMessage <> ( STRING ) ) ; assertFalse ( this . org.springframework.integration.endpoint.SimplePollSkipStrategy . skipPoll ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { SourcePollingChannelAdapter org.springframework.integration.endpoint.SourcePollingChannelAdapter = new SourcePollingChannelAdapter ( ) ; final java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = new java.util.ArrayList<java.lang.String> <> ( ) ; final java.util.concurrent.atomic.AtomicReference<java.util.concurrent.CountDownLatch> < java.util.concurrent.CountDownLatch > java.util.concurrent.atomic.AtomicReference<java.util.concurrent.CountDownLatch> = new java.util.concurrent.atomic.AtomicReference<java.util.concurrent.CountDownLatch> <> ( new java.util.concurrent.CountDownLatch ( NUMBER ) ) ; MessageSource < java.lang.Object > org.springframework.integration.endpoint.MessageSource<java.lang.Object> = ( ) { callOrder . add ( STRING ) ; latch . get ( ) . countDown ( ) ; return null ; } ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . setSource ( org.springframework.integration.endpoint.MessageSource<java.lang.Object> ) ; OnlyOnceTrigger org.springframework.integration.endpoint.OnlyOnceTrigger = new OnlyOnceTrigger ( ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . setTrigger ( org.springframework.integration.endpoint.OnlyOnceTrigger ) ; void ( org.springframework.integration.endpoint.SourcePollingChannelAdapter ) ; java.util.List<org.springframework.integration.endpoint.Advice> < Advice > java.util.List<org.springframework.integration.endpoint.Advice> = new java.util.ArrayList<org.springframework.integration.endpoint.Advice> <> ( ) ; java.util.List<org.springframework.integration.endpoint.Advice> . add ( ( MethodInterceptor ) invocation -> { callOrder . add ( STRING ) ; latch . get ( ) . countDown ( ) ; return invocation . proceed ( ) ; } ) ; final java.util.concurrent.atomic.AtomicInteger java.util.concurrent.atomic.AtomicInteger = new java.util.concurrent.atomic.AtomicInteger ( ) ; class TestSourceAdvice extends AbstractMessageSourceAdvice { @ java.lang.Override public boolean boolean ( MessageSource < ? > org.springframework.integration.endpoint.MessageSource<?> ) { java.util.concurrent.atomic.AtomicInteger . int ( ) ; java.util.List<java.lang.String> . boolean ( STRING ) ; java.util.concurrent.atomic.AtomicReference<java.util.concurrent.CountDownLatch> . java.util.concurrent.CountDownLatch ( ) . void ( ) ; return true ; } @ java.lang.Override public org.springframework.integration.endpoint.Message<?> < ? > org.springframework.integration.endpoint.Message<?> ( Message < ? > org.springframework.integration.endpoint.Message<?> , MessageSource < ? > org.springframework.integration.endpoint.MessageSource<?> ) { java.util.List<java.lang.String> . boolean ( STRING ) ; java.util.concurrent.atomic.AtomicReference<java.util.concurrent.CountDownLatch> . java.util.concurrent.CountDownLatch ( ) . void ( ) ; return org.springframework.integration.endpoint.Message<> ; } } java.util.List<org.springframework.integration.endpoint.Advice> . add ( new TestSourceAdvice ( ) ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . setAdviceChain ( java.util.List<org.springframework.integration.endpoint.Advice> ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . afterPropertiesSet ( ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . start ( ) ; assertTrue ( java.util.concurrent.atomic.AtomicReference<java.util.concurrent.CountDownLatch> . java.util.concurrent.CountDownLatch ( ) . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; assertThat ( java.util.List<java.lang.String> , contains ( STRING , STRING , STRING , STRING ) ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . stop ( ) ; org.springframework.integration.endpoint.OnlyOnceTrigger . reset ( ) ; java.util.concurrent.atomic.AtomicReference<java.util.concurrent.CountDownLatch> . void ( new java.util.concurrent.CountDownLatch ( NUMBER ) ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . start ( ) ; assertTrue ( java.util.concurrent.atomic.AtomicReference<java.util.concurrent.CountDownLatch> . java.util.concurrent.CountDownLatch ( ) . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . stop ( ) ; assertEquals ( NUMBER , java.util.concurrent.atomic.AtomicInteger . int ( ) ) ; ProxyFactory org.springframework.integration.endpoint.ProxyFactory = new ProxyFactory ( org.springframework.integration.endpoint.MessageSource<java.lang.Object> ) ; org.springframework.integration.endpoint.ProxyFactory . addAdvice ( ( MethodInterceptor ) Joinpoint :: proceed ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . setSource ( ( MessageSource < ? > ) org.springframework.integration.endpoint.ProxyFactory . getProxy ( ) ) ; org.springframework.integration.endpoint.OnlyOnceTrigger . reset ( ) ; java.util.concurrent.atomic.AtomicReference<java.util.concurrent.CountDownLatch> . void ( new java.util.concurrent.CountDownLatch ( NUMBER ) ) ; java.util.concurrent.atomic.AtomicInteger . void ( NUMBER ) ; java.util.List<java.lang.String> . void ( ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . start ( ) ; assertTrue ( java.util.concurrent.atomic.AtomicReference<java.util.concurrent.CountDownLatch> . java.util.concurrent.CountDownLatch ( ) . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; assertThat ( java.util.List<java.lang.String> , contains ( STRING , STRING , STRING , STRING ) ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . stop ( ) ; org.springframework.integration.endpoint.OnlyOnceTrigger . reset ( ) ; java.util.concurrent.atomic.AtomicReference<java.util.concurrent.CountDownLatch> . void ( new java.util.concurrent.CountDownLatch ( NUMBER ) ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . start ( ) ; assertTrue ( java.util.concurrent.atomic.AtomicReference<java.util.concurrent.CountDownLatch> . java.util.concurrent.CountDownLatch ( ) . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . stop ( ) ; assertEquals ( NUMBER , java.util.concurrent.atomic.AtomicInteger . int ( ) ) ; Advisor [] org.springframework.integration.endpoint.Advisor[] = ( ( Advised ) org.springframework.integration.endpoint.SourcePollingChannelAdapter . getMessageSource ( ) ) . getAdvisors ( ) ; assertEquals ( NUMBER , advisors . length ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( MessageSource < ? > org.springframework.integration.endpoint.MessageSource<?> ) { java.util.concurrent.atomic.AtomicInteger . int ( ) ; java.util.List<java.lang.String> . boolean ( STRING ) ; java.util.concurrent.atomic.AtomicReference<java.util.concurrent.CountDownLatch> . java.util.concurrent.CountDownLatch ( ) . void ( ) ; return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.endpoint.Message<?> < ? > org.springframework.integration.endpoint.Message<?> ( Message < ? > org.springframework.integration.endpoint.Message<?> , MessageSource < ? > org.springframework.integration.endpoint.MessageSource<?> ) { java.util.List<java.lang.String> . boolean ( STRING ) ; java.util.concurrent.atomic.AtomicReference<java.util.concurrent.CountDownLatch> . java.util.concurrent.CountDownLatch ( ) . void ( ) ; return org.springframework.integration.endpoint.Message<> ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { SourcePollingChannelAdapter org.springframework.integration.endpoint.SourcePollingChannelAdapter = new SourcePollingChannelAdapter ( ) ; final java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; final java.util.LinkedList<java.lang.Long> < java.lang.Long > java.util.LinkedList<java.lang.Long> = new java.util.LinkedList<java.lang.Long> < java.lang.Long > ( ) ; final DynamicPeriodicTrigger org.springframework.integration.endpoint.DynamicPeriodicTrigger = new DynamicPeriodicTrigger ( NUMBER ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . setSource ( ( ) { triggerPeriods . add ( trigger . getPeriod ( ) ) ; Message < Object > m = null ; if ( latch . getCount ( ) % NUMBER == NUMBER ) { m = new GenericMessage <> ( STRING ) ; } latch . countDown ( ) ; return m ; } ) ; SimpleActiveIdleMessageSourceAdvice org.springframework.integration.endpoint.SimpleActiveIdleMessageSourceAdvice = new SimpleActiveIdleMessageSourceAdvice ( org.springframework.integration.endpoint.DynamicPeriodicTrigger ) ; org.springframework.integration.endpoint.SimpleActiveIdleMessageSourceAdvice . setActivePollPeriod ( NUMBER ) ; org.springframework.integration.endpoint.SimpleActiveIdleMessageSourceAdvice . setIdlePollPeriod ( NUMBER ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . setAdviceChain ( java.util.Collections . java.util.List ( org.springframework.integration.endpoint.SimpleActiveIdleMessageSourceAdvice ) ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . setTrigger ( org.springframework.integration.endpoint.DynamicPeriodicTrigger ) ; void ( org.springframework.integration.endpoint.SourcePollingChannelAdapter ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . afterPropertiesSet ( ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . start ( ) ; assertTrue ( java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . stop ( ) ; while ( java.util.LinkedList<java.lang.Long> . int ( ) > NUMBER ) { java.util.LinkedList<java.lang.Long> . java.lang.Long ( ) ; } assertThat ( java.util.LinkedList<java.lang.Long> , contains ( NUMBER , NUMBER , NUMBER , NUMBER , NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { SourcePollingChannelAdapter org.springframework.integration.endpoint.SourcePollingChannelAdapter = new SourcePollingChannelAdapter ( ) ; final java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; final java.util.LinkedList<java.lang.Object> < java.lang.Object > java.util.LinkedList<java.lang.Object> = new java.util.LinkedList<java.lang.Object> < java.lang.Object > ( ) ; final CompoundTrigger org.springframework.integration.endpoint.CompoundTrigger = new CompoundTrigger ( new PeriodicTrigger ( NUMBER ) ) ; Trigger org.springframework.integration.endpoint.Trigger = spy ( new PeriodicTrigger ( NUMBER ) ) ; final CompoundTriggerAdvice org.springframework.integration.endpoint.CompoundTriggerAdvice = new CompoundTriggerAdvice ( org.springframework.integration.endpoint.CompoundTrigger , org.springframework.integration.endpoint.Trigger ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . setSource ( ( ) { overridePresent . add ( TestUtils . getPropertyValue ( compoundTrigger , STRING ) ) ; Message < Object > m = null ; if ( latch . getCount ( ) % NUMBER == NUMBER ) { m = new GenericMessage <> ( STRING ) ; } latch . countDown ( ) ; return m ; } ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . setAdviceChain ( java.util.Collections . java.util.List ( org.springframework.integration.endpoint.CompoundTriggerAdvice ) ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . setTrigger ( org.springframework.integration.endpoint.CompoundTrigger ) ; void ( org.springframework.integration.endpoint.SourcePollingChannelAdapter ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . afterPropertiesSet ( ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . start ( ) ; assertTrue ( java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . stop ( ) ; while ( java.util.LinkedList<java.lang.Object> . int ( ) > NUMBER ) { java.util.LinkedList<java.lang.Object> . java.lang.Object ( ) ; } assertThat ( java.util.LinkedList<java.lang.Object> , contains ( null , org.springframework.integration.endpoint.Trigger , null , org.springframework.integration.endpoint.Trigger , null ) ) ; verify ( org.springframework.integration.endpoint.Trigger , atLeast ( NUMBER ) ) . nextExecutionTime ( any ( TriggerContext .class ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( SourcePollingChannelAdapter org.springframework.integration.endpoint.SourcePollingChannelAdapter ) { org.springframework.integration.endpoint.SourcePollingChannelAdapter . setOutputChannel ( new NullChannel ( ) ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . setBeanFactory ( mock ( BeanFactory .class ) ) ; ThreadPoolTaskScheduler org.springframework.integration.endpoint.ThreadPoolTaskScheduler = new ThreadPoolTaskScheduler ( ) ; org.springframework.integration.endpoint.ThreadPoolTaskScheduler . afterPropertiesSet ( ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . setTaskScheduler ( org.springframework.integration.endpoint.ThreadPoolTaskScheduler ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ConfigurableApplicationContext org.springframework.integration.endpoint.ConfigurableApplicationContext = new ClassPathXmlApplicationContext ( STRING , java.lang.Class<? extends org.springframework.integration.endpoint.PollerAdviceTests> ( ) ) ; SourcePollingChannelAdapter org.springframework.integration.endpoint.SourcePollingChannelAdapter = org.springframework.integration.endpoint.ConfigurableApplicationContext . getBean ( SourcePollingChannelAdapter .class ) ; org.springframework.integration.endpoint.PollerAdviceTests.Source org.springframework.integration.endpoint.PollerAdviceTests.Source = org.springframework.integration.endpoint.ConfigurableApplicationContext . getBean ( org.springframework.integration.endpoint.PollerAdviceTests.Source .class ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . start ( ) ; assertTrue ( org.springframework.integration.endpoint.PollerAdviceTests.Source . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; assertNotNull ( TestUtils . getPropertyValue ( org.springframework.integration.endpoint.SourcePollingChannelAdapter , STRING ) ) ; org.springframework.integration.endpoint.SourcePollingChannelAdapter . stop ( ) ; org.springframework.integration.endpoint.PollerAdviceTests.OtherAdvice org.springframework.integration.endpoint.PollerAdviceTests.OtherAdvice = org.springframework.integration.endpoint.ConfigurableApplicationContext . getBean ( org.springframework.integration.endpoint.PollerAdviceTests.OtherAdvice .class ) ; int int = org.springframework.integration.endpoint.PollerAdviceTests.OtherAdvice . int ; assertThat ( int , greaterThan ( NUMBER ) ) ; ( ( org.springframework.integration.endpoint.PollerAdviceTests.Foo ) org.springframework.integration.endpoint.SourcePollingChannelAdapter . getMessageSource ( ) ) . void ( ) ; assertEquals ( int , org.springframework.integration.endpoint.PollerAdviceTests.OtherAdvice . int ) ; org.springframework.integration.endpoint.ConfigurableApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> void void ( )  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.endpoint.Message<java.lang.Object> < java.lang.Object > org.springframework.integration.endpoint.Message<java.lang.Object> ( ) { java.util.concurrent.CountDownLatch . void ( ) ; return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( MessageSource < ? > org.springframework.integration.endpoint.MessageSource<?> ) { this . int ++ ; return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.endpoint.Message<?> < ? > org.springframework.integration.endpoint.Message<?> ( Message < ? > org.springframework.integration.endpoint.Message<?> , MessageSource < ? > org.springframework.integration.endpoint.MessageSource<?> ) { return org.springframework.integration.endpoint.Message<> ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.endpoint.SimplePollSkipStrategy org.springframework.integration.endpoint.SimplePollSkipStrategy ( ) { return new SimplePollSkipStrategy ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.endpoint.MessageChannel org.springframework.integration.endpoint.MessageChannel ( ) { return new DirectChannel ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ ServiceActivator ( inputChannel = STRING ) public org.springframework.integration.endpoint.ExpressionControlBusFactoryBean org.springframework.integration.endpoint.ExpressionControlBusFactoryBean ( ) { return new ExpressionControlBusFactoryBean ( ) ; }  <METHOD_END>