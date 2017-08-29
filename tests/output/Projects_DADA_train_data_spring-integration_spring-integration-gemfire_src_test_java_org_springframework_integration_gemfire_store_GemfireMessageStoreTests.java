<METHOD_START> @ Test public void void ( ) java.lang.Exception { GemfireMessageStore org.springframework.integration.gemfire.store.GemfireMessageStore = new GemfireMessageStore ( org.springframework.integration.gemfire.store.Region<java.lang.Object,java.lang.Object> ) ; org.springframework.integration.gemfire.store.GemfireMessageStore . afterPropertiesSet ( ) ; Message < ? > org.springframework.integration.gemfire.store.Message<?> = MessageBuilder . withPayload ( STRING ) . build ( ) ; org.springframework.integration.gemfire.store.GemfireMessageStore . addMessage ( org.springframework.integration.gemfire.store.Message<> ) ; Message < ? > org.springframework.integration.gemfire.store.Message<?> = org.springframework.integration.gemfire.store.GemfireMessageStore . getMessage ( org.springframework.integration.gemfire.store.Message<> . getHeaders ( ) . getId ( ) ) ; assertEquals ( org.springframework.integration.gemfire.store.Message<> , org.springframework.integration.gemfire.store.Message<> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RegionFactoryBean < java.lang.Object , java.lang.Object > org.springframework.integration.gemfire.store.RegionFactoryBean<java.lang.Object,java.lang.Object> = new RegionFactoryBean < java.lang.Object , java.lang.Object > ( ) {		} ; org.springframework.integration.gemfire.store.RegionFactoryBean<java.lang.Object,java.lang.Object> . setName ( STRING ) ; org.springframework.integration.gemfire.store.RegionFactoryBean<java.lang.Object,java.lang.Object> . setCache ( org.springframework.integration.gemfire.store.CacheFactoryBean . getObject ( ) ) ; org.springframework.integration.gemfire.store.RegionFactoryBean<java.lang.Object,java.lang.Object> . afterPropertiesSet ( ) ; GemfireMessageStore org.springframework.integration.gemfire.store.GemfireMessageStore = new GemfireMessageStore ( org.springframework.integration.gemfire.store.RegionFactoryBean<java.lang.Object,java.lang.Object> . getObject ( ) ) ; org.springframework.integration.gemfire.store.GemfireMessageStore . afterPropertiesSet ( ) ; assertSame ( org.springframework.integration.gemfire.store.RegionFactoryBean<java.lang.Object,java.lang.Object> . getObject ( ) , TestUtils . getPropertyValue ( org.springframework.integration.gemfire.store.GemfireMessageStore , STRING ) ) ; org.springframework.integration.gemfire.store.RegionFactoryBean<java.lang.Object,java.lang.Object> . destroy ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { GemfireMessageStore org.springframework.integration.gemfire.store.GemfireMessageStore = new GemfireMessageStore ( org.springframework.integration.gemfire.store.Region<java.lang.Object,java.lang.Object> ) ; org.springframework.integration.gemfire.store.GemfireMessageStore . afterPropertiesSet ( ) ; Message < ? > org.springframework.integration.gemfire.store.Message<?> = new GenericMessage < java.lang.String > ( STRING ) ; DirectChannel org.springframework.integration.gemfire.store.DirectChannel = new DirectChannel ( ) ; org.springframework.integration.gemfire.store.DirectChannel . setBeanName ( STRING ) ; DirectChannel org.springframework.integration.gemfire.store.DirectChannel = new DirectChannel ( ) ; org.springframework.integration.gemfire.store.DirectChannel . setBeanName ( STRING ) ; org.springframework.integration.gemfire.store.Message<?> = MessageHistory . write ( org.springframework.integration.gemfire.store.Message<> , org.springframework.integration.gemfire.store.DirectChannel ) ; org.springframework.integration.gemfire.store.Message<?> = MessageHistory . write ( org.springframework.integration.gemfire.store.Message<> , org.springframework.integration.gemfire.store.DirectChannel ) ; org.springframework.integration.gemfire.store.GemfireMessageStore . addMessage ( org.springframework.integration.gemfire.store.Message<> ) ; org.springframework.integration.gemfire.store.Message<?> = org.springframework.integration.gemfire.store.GemfireMessageStore . getMessage ( org.springframework.integration.gemfire.store.Message<> . getHeaders ( ) . getId ( ) ) ; MessageHistory org.springframework.integration.gemfire.store.MessageHistory = MessageHistory . read ( org.springframework.integration.gemfire.store.Message<> ) ; assertNotNull ( org.springframework.integration.gemfire.store.MessageHistory ) ; assertEquals ( NUMBER , org.springframework.integration.gemfire.store.MessageHistory . size ( ) ) ; java.util.Properties java.util.Properties = org.springframework.integration.gemfire.store.MessageHistory . get ( NUMBER ) ; assertEquals ( STRING , java.util.Properties . java.lang.Object ( STRING ) ) ; assertEquals ( STRING , java.util.Properties . java.lang.Object ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { GemfireMessageStore org.springframework.integration.gemfire.store.GemfireMessageStore = new GemfireMessageStore ( org.springframework.integration.gemfire.store.Region<java.lang.Object,java.lang.Object> ) ; org.springframework.integration.gemfire.store.GemfireMessageStore . afterPropertiesSet ( ) ; java.lang.String java.lang.String = STRING ; java.util.List<org.springframework.integration.gemfire.store.Message<?>> < Message < ? > > java.util.List<org.springframework.integration.gemfire.store.Message<?>> = new java.util.ArrayList<org.springframework.integration.gemfire.store.Message<?>> < Message < ? > > ( ) ; for ( int int = NUMBER ; int < NUMBER ; int ++ ) { Message < java.lang.String > org.springframework.integration.gemfire.store.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . setCorrelationId ( java.lang.String ) . build ( ) ; org.springframework.integration.gemfire.store.GemfireMessageStore . addMessagesToGroup ( java.lang.String , org.springframework.integration.gemfire.store.Message<java.lang.String> ) ; java.util.List<org.springframework.integration.gemfire.store.Message<?>> . add ( org.springframework.integration.gemfire.store.Message<java.lang.String> ) ; } MessageGroup org.springframework.integration.gemfire.store.MessageGroup = org.springframework.integration.gemfire.store.GemfireMessageStore . getMessageGroup ( java.lang.String ) ; assertEquals ( NUMBER , org.springframework.integration.gemfire.store.MessageGroup . size ( ) ) ; org.springframework.integration.gemfire.store.GemfireMessageStore . removeMessagesFromGroup ( java.lang.String , java.util.List<org.springframework.integration.gemfire.store.Message<?>> ) ; org.springframework.integration.gemfire.store.MessageGroup = org.springframework.integration.gemfire.store.GemfireMessageStore . getMessageGroup ( java.lang.String ) ; assertEquals ( NUMBER , org.springframework.integration.gemfire.store.MessageGroup . size ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Before public void void ( ) { if ( org.springframework.integration.gemfire.store.Region<java.lang.Object,java.lang.Object> != null ) { org.springframework.integration.gemfire.store.Region<java.lang.Object,java.lang.Object> . clear ( ) ; } }  <METHOD_END>
<METHOD_START> @ BeforeClass public static void void ( ) java.lang.Exception { org.springframework.integration.gemfire.store.CacheFactoryBean = new CacheFactoryBean ( ) ; Cache org.springframework.integration.gemfire.store.Cache = org.springframework.integration.gemfire.store.CacheFactoryBean . getObject ( ) ; org.springframework.integration.gemfire.store.Region<java.lang.Object,java.lang.Object> = org.springframework.integration.gemfire.store.Cache . createRegionFactory ( ) . setScope ( Scope . LOCAL ) . create ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ AfterClass public static void void ( ) java.lang.Exception { if ( org.springframework.integration.gemfire.store.Region<java.lang.Object,java.lang.Object> != null ) { org.springframework.integration.gemfire.store.Region<java.lang.Object,java.lang.Object> . close ( ) ; } if ( org.springframework.integration.gemfire.store.CacheFactoryBean != null ) { org.springframework.integration.gemfire.store.CacheFactoryBean . destroy ( ) ; } }  <METHOD_END>