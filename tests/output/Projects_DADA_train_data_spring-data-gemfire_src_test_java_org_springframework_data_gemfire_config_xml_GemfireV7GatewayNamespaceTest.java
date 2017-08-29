<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { ctx . getBeanFactory ( ) . addBeanPostProcessor ( new GemfireTestBeanPostProcessor ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Before @ java.lang.Override public void void ( ) { if ( GemfireUtils . isGemfireVersion7OrAbove ( ) ) { super. createCtx ( ) ; } }  <METHOD_END>
<METHOD_START> @ AfterClass public static void void ( ) { for ( java.lang.String java.lang.String : new java.io.File ( STRING ) . java.lang.String[] ( new java.io.FilenameFilter ( ) { @ java.lang.Override public boolean boolean ( java.io.File java.io.File , java.lang.String java.lang.String ) { return java.lang.String . boolean ( STRING ) ; } } ) ) { new java.io.File ( java.lang.String ) . boolean ( ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.io.File java.io.File , java.lang.String java.lang.String ) { return java.lang.String . boolean ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AsyncEventQueue org.springframework.data.gemfire.config.xml.AsyncEventQueue = ctx . getBean ( STRING , AsyncEventQueue .class ) ; assertNotNull ( org.springframework.data.gemfire.config.xml.AsyncEventQueue ) ; assertTrue ( org.springframework.data.gemfire.config.xml.AsyncEventQueue . isBatchConflationEnabled ( ) ) ; assertEquals ( NUMBER , org.springframework.data.gemfire.config.xml.AsyncEventQueue . getBatchSize ( ) ) ; assertEquals ( NUMBER , org.springframework.data.gemfire.config.xml.AsyncEventQueue . getBatchTimeInterval ( ) ) ; assertEquals ( STRING , org.springframework.data.gemfire.config.xml.AsyncEventQueue . getDiskStoreName ( ) ) ; assertTrue ( org.springframework.data.gemfire.config.xml.AsyncEventQueue . isDiskSynchronous ( ) ) ; assertEquals ( NUMBER , org.springframework.data.gemfire.config.xml.AsyncEventQueue . getMaximumQueueMemory ( ) ) ; assertEquals ( OrderPolicy . KEY , org.springframework.data.gemfire.config.xml.AsyncEventQueue . getOrderPolicy ( ) ) ; assertFalse ( org.springframework.data.gemfire.config.xml.AsyncEventQueue . isParallel ( ) ) ; assertTrue ( org.springframework.data.gemfire.config.xml.AsyncEventQueue . isPersistent ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { GatewaySenderFactoryBean org.springframework.data.gemfire.config.xml.GatewaySenderFactoryBean = ctx . getBean ( STRING , GatewaySenderFactoryBean .class ) ; assertNotNull ( org.springframework.data.gemfire.config.xml.GatewaySenderFactoryBean ) ; assertNotNull ( TestUtils . readField ( STRING , org.springframework.data.gemfire.config.xml.GatewaySenderFactoryBean ) ) ; assertEquals ( NUMBER , TestUtils .< java.lang.Integer > readField ( STRING , org.springframework.data.gemfire.config.xml.GatewaySenderFactoryBean ) . longValue ( ) ) ; assertEquals ( NUMBER , TestUtils .< java.lang.Integer > readField ( STRING , org.springframework.data.gemfire.config.xml.GatewaySenderFactoryBean ) . longValue ( ) ) ; assertTrue ( java.lang.Boolean . java.lang.Boolean . boolean ( TestUtils . readField ( STRING , org.springframework.data.gemfire.config.xml.GatewaySenderFactoryBean ) ) ) ; assertEquals ( NUMBER , TestUtils .< java.lang.Integer > readField ( STRING , org.springframework.data.gemfire.config.xml.GatewaySenderFactoryBean ) . intValue ( ) ) ; assertEquals ( NUMBER , TestUtils .< java.lang.Integer > readField ( STRING , org.springframework.data.gemfire.config.xml.GatewaySenderFactoryBean ) . intValue ( ) ) ; assertEquals ( false , TestUtils . readField ( STRING , org.springframework.data.gemfire.config.xml.GatewaySenderFactoryBean ) ) ; assertEquals ( true , TestUtils . readField ( STRING , org.springframework.data.gemfire.config.xml.GatewaySenderFactoryBean ) ) ; java.util.List<org.springframework.data.gemfire.config.xml.GatewayEventFilter> < GatewayEventFilter > java.util.List<org.springframework.data.gemfire.config.xml.GatewayEventFilter> = TestUtils . readField ( STRING , org.springframework.data.gemfire.config.xml.GatewaySenderFactoryBean ) ; assertNotNull ( java.util.List<org.springframework.data.gemfire.config.xml.GatewayEventFilter> ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.gemfire.config.xml.GatewayEventFilter> . size ( ) ) ; assertTrue ( java.util.List<org.springframework.data.gemfire.config.xml.GatewayEventFilter> . get ( NUMBER ) instanceof org.springframework.data.gemfire.config.xml.GemfireV7GatewayNamespaceTest.TestEventFilter ) ; java.util.List<org.springframework.data.gemfire.config.xml.GatewayTransportFilter> < GatewayTransportFilter > java.util.List<org.springframework.data.gemfire.config.xml.GatewayTransportFilter> = TestUtils . readField ( STRING , org.springframework.data.gemfire.config.xml.GatewaySenderFactoryBean ) ; assertNotNull ( java.util.List<org.springframework.data.gemfire.config.xml.GatewayTransportFilter> ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.gemfire.config.xml.GatewayTransportFilter> . size ( ) ) ; assertTrue ( java.util.List<org.springframework.data.gemfire.config.xml.GatewayTransportFilter> . get ( NUMBER ) instanceof org.springframework.data.gemfire.config.xml.GemfireV7GatewayNamespaceTest.TestTransportFilter ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { Region < ? , ? > org.springframework.data.gemfire.config.xml.Region<?,?> = ctx . getBean ( STRING , Region .class ) ; assertNotNull ( org.springframework.data.gemfire.config.xml.Region<,> . getAttributes ( ) . getGatewaySenderIds ( ) ) ; assertEquals ( NUMBER , org.springframework.data.gemfire.config.xml.Region<,> . getAttributes ( ) . getGatewaySenderIds ( ) . size ( ) ) ; RegionFactoryBean org.springframework.data.gemfire.config.xml.RegionFactoryBean = ctx . getBean ( STRING , RegionFactoryBean .class ) ; java.lang.Object [] java.lang.Object[] = TestUtils . readField ( STRING , org.springframework.data.gemfire.config.xml.RegionFactoryBean ) ; assertNotNull ( java.lang.Object[] ) ; assertEquals ( NUMBER , java.lang.Object[] . int ) ; GatewaySender org.springframework.data.gemfire.config.xml.GatewaySender = ( GatewaySender ) java.lang.Object[] [ NUMBER ] ; assertNotNull ( org.springframework.data.gemfire.config.xml.GatewaySender ) ; assertEquals ( NUMBER , org.springframework.data.gemfire.config.xml.GatewaySender . getRemoteDSId ( ) ) ; assertEquals ( false , org.springframework.data.gemfire.config.xml.GatewaySender . isManualStart ( ) ) ; assertEquals ( true , org.springframework.data.gemfire.config.xml.GatewaySender . isRunning ( ) ) ; assertEquals ( NUMBER , org.springframework.data.gemfire.config.xml.GatewaySender . getAlertThreshold ( ) ) ; assertEquals ( NUMBER , org.springframework.data.gemfire.config.xml.GatewaySender . getBatchSize ( ) ) ; assertEquals ( NUMBER , org.springframework.data.gemfire.config.xml.GatewaySender . getBatchTimeInterval ( ) ) ; assertEquals ( NUMBER , org.springframework.data.gemfire.config.xml.GatewaySender . getDispatcherThreads ( ) ) ; assertEquals ( STRING , org.springframework.data.gemfire.config.xml.GatewaySender . getDiskStoreName ( ) ) ; assertEquals ( true , org.springframework.data.gemfire.config.xml.GatewaySender . isDiskSynchronous ( ) ) ; assertTrue ( org.springframework.data.gemfire.config.xml.GatewaySender . isBatchConflationEnabled ( ) ) ; assertEquals ( NUMBER , org.springframework.data.gemfire.config.xml.GatewaySender . getMaximumQueueMemory ( ) ) ; assertEquals ( OrderPolicy . THREAD , org.springframework.data.gemfire.config.xml.GatewaySender . getOrderPolicy ( ) ) ; assertTrue ( org.springframework.data.gemfire.config.xml.GatewaySender . isPersistenceEnabled ( ) ) ; assertFalse ( org.springframework.data.gemfire.config.xml.GatewaySender . isParallel ( ) ) ; assertEquals ( NUMBER , org.springframework.data.gemfire.config.xml.GatewaySender . getSocketBufferSize ( ) ) ; assertEquals ( NUMBER , org.springframework.data.gemfire.config.xml.GatewaySender . getSocketReadTimeout ( ) ) ; java.util.List<org.springframework.data.gemfire.config.xml.GatewayEventFilter> < GatewayEventFilter > java.util.List<org.springframework.data.gemfire.config.xml.GatewayEventFilter> = org.springframework.data.gemfire.config.xml.GatewaySender . getGatewayEventFilters ( ) ; assertNotNull ( java.util.List<org.springframework.data.gemfire.config.xml.GatewayEventFilter> ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.gemfire.config.xml.GatewayEventFilter> . size ( ) ) ; assertTrue ( java.util.List<org.springframework.data.gemfire.config.xml.GatewayEventFilter> . get ( NUMBER ) instanceof org.springframework.data.gemfire.config.xml.GemfireV7GatewayNamespaceTest.TestEventFilter ) ; java.util.List<org.springframework.data.gemfire.config.xml.GatewayTransportFilter> < GatewayTransportFilter > java.util.List<org.springframework.data.gemfire.config.xml.GatewayTransportFilter> = org.springframework.data.gemfire.config.xml.GatewaySender . getGatewayTransportFilters ( ) ; assertNotNull ( java.util.List<org.springframework.data.gemfire.config.xml.GatewayTransportFilter> ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.gemfire.config.xml.GatewayTransportFilter> . size ( ) ) ; assertTrue ( java.util.List<org.springframework.data.gemfire.config.xml.GatewayTransportFilter> . get ( NUMBER ) instanceof org.springframework.data.gemfire.config.xml.GemfireV7GatewayNamespaceTest.TestTransportFilter ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { GatewaySenderFactoryBean org.springframework.data.gemfire.config.xml.GatewaySenderFactoryBean = ctx . getBean ( STRING , GatewaySenderFactoryBean .class ) ; assertNotNull ( org.springframework.data.gemfire.config.xml.GatewaySenderFactoryBean ) ; assertNotNull ( TestUtils . readField ( STRING , org.springframework.data.gemfire.config.xml.GatewaySenderFactoryBean ) ) ; assertEquals ( NUMBER , TestUtils .< java.lang.Integer > readField ( STRING , org.springframework.data.gemfire.config.xml.GatewaySenderFactoryBean ) . intValue ( ) ) ; assertTrue ( java.lang.Boolean . java.lang.Boolean . boolean ( TestUtils . readField ( STRING , org.springframework.data.gemfire.config.xml.GatewaySenderFactoryBean ) ) ) ; assertEquals ( NUMBER , TestUtils .< java.lang.Integer > readField ( STRING , org.springframework.data.gemfire.config.xml.GatewaySenderFactoryBean ) . intValue ( ) ) ; assertEquals ( NUMBER , TestUtils .< java.lang.Integer > readField ( STRING , org.springframework.data.gemfire.config.xml.GatewaySenderFactoryBean ) . intValue ( ) ) ; assertEquals ( true , TestUtils . readField ( STRING , org.springframework.data.gemfire.config.xml.GatewaySenderFactoryBean ) ) ; java.util.List<org.springframework.data.gemfire.config.xml.GatewayEventFilter> < GatewayEventFilter > java.util.List<org.springframework.data.gemfire.config.xml.GatewayEventFilter> = TestUtils . readField ( STRING , org.springframework.data.gemfire.config.xml.GatewaySenderFactoryBean ) ; assertNotNull ( java.util.List<org.springframework.data.gemfire.config.xml.GatewayEventFilter> ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.gemfire.config.xml.GatewayEventFilter> . size ( ) ) ; assertTrue ( java.util.List<org.springframework.data.gemfire.config.xml.GatewayEventFilter> . get ( NUMBER ) instanceof org.springframework.data.gemfire.config.xml.GemfireV7GatewayNamespaceTest.TestEventFilter ) ; assertSame ( ctx . getBean ( STRING ) , java.util.List<org.springframework.data.gemfire.config.xml.GatewayEventFilter> . get ( NUMBER ) ) ; java.util.List<org.springframework.data.gemfire.config.xml.GatewayTransportFilter> < GatewayTransportFilter > java.util.List<org.springframework.data.gemfire.config.xml.GatewayTransportFilter> = TestUtils . readField ( STRING , org.springframework.data.gemfire.config.xml.GatewaySenderFactoryBean ) ; assertNotNull ( java.util.List<org.springframework.data.gemfire.config.xml.GatewayTransportFilter> ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.gemfire.config.xml.GatewayTransportFilter> . size ( ) ) ; assertTrue ( java.util.List<org.springframework.data.gemfire.config.xml.GatewayTransportFilter> . get ( NUMBER ) instanceof org.springframework.data.gemfire.config.xml.GemfireV7GatewayNamespaceTest.TestTransportFilter ) ; assertSame ( ctx . getBean ( STRING ) , java.util.List<org.springframework.data.gemfire.config.xml.GatewayTransportFilter> . get ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { GatewayReceiver org.springframework.data.gemfire.config.xml.GatewayReceiver = ctx . getBean ( STRING , GatewayReceiver .class ) ; assertNotNull ( org.springframework.data.gemfire.config.xml.GatewayReceiver ) ; assertEquals ( STRING , org.springframework.data.gemfire.config.xml.GatewayReceiver . getBindAddress ( ) ) ; assertEquals ( NUMBER , org.springframework.data.gemfire.config.xml.GatewayReceiver . getStartPort ( ) ) ; assertEquals ( NUMBER , org.springframework.data.gemfire.config.xml.GatewayReceiver . getEndPort ( ) ) ; assertEquals ( NUMBER , org.springframework.data.gemfire.config.xml.GatewayReceiver . getMaximumTimeBetweenPings ( ) ) ; assertEquals ( NUMBER , org.springframework.data.gemfire.config.xml.GatewayReceiver . getSocketBufferSize ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( GatewayQueueEvent org.springframework.data.gemfire.config.xml.GatewayQueueEvent ) {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( GatewayQueueEvent org.springframework.data.gemfire.config.xml.GatewayQueueEvent ) { return false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( GatewayQueueEvent org.springframework.data.gemfire.config.xml.GatewayQueueEvent ) { return false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.io.InputStream java.io.InputStream ( java.io.InputStream java.io.InputStream ) { return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.io.OutputStream java.io.OutputStream ( java.io.OutputStream java.io.OutputStream ) { return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.util.List<org.springframework.data.gemfire.config.xml.AsyncEvent> < AsyncEvent > java.util.List<org.springframework.data.gemfire.config.xml.AsyncEvent> ) { return false ; }  <METHOD_END>