<METHOD_START> @ java.lang.Override protected org.springframework.statemachine.AnnotationConfigApplicationContext org.springframework.statemachine.AnnotationConfigApplicationContext ( ) { return new AnnotationConfigApplicationContext ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( { STRING } ) @ Test public void void ( ) { context . register ( org.springframework.statemachine.StateMachineFactoryTests.Config1 .class ) ; context . refresh ( ) ; ObjectStateMachineFactory < TestStates , TestEvents > org.springframework.statemachine.ObjectStateMachineFactory<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> = context . getBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINEFACTORY , ObjectStateMachineFactory .class ) ; StateMachine < TestStates , TestEvents > org.springframework.statemachine.StateMachine<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> = org.springframework.statemachine.ObjectStateMachineFactory<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> . getStateMachine ( ) ; org.springframework.statemachine.StateMachine<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> . start ( ) ; assertThat ( org.springframework.statemachine.StateMachine<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> . getState ( ) . getIds ( ) , contains ( TestStates . S1 ) ) ; org.springframework.statemachine.StateMachine<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> . sendEvent ( MessageBuilder . withPayload ( TestEvents . E1 ) . build ( ) ) ; assertThat ( org.springframework.statemachine.StateMachine<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> . getState ( ) . getIds ( ) , contains ( TestStates . S2 ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( { STRING } ) @ Test public void void ( ) java.lang.Exception { context . register ( org.springframework.statemachine.StateMachineFactoryTests.Config2 .class ) ; context . refresh ( ) ; StateMachineFactory < TestStates , TestEvents > org.springframework.statemachine.StateMachineFactory<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> = context . getBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINEFACTORY , StateMachineFactory .class ) ; StateMachine < TestStates , TestEvents > org.springframework.statemachine.StateMachine<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> = org.springframework.statemachine.StateMachineFactory<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> . getStateMachine ( ) ; assertThat ( ( ( SmartLifecycle ) org.springframework.statemachine.StateMachine<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> ) . isAutoStartup ( ) , is ( true ) ) ; assertThat ( ( ( SmartLifecycle ) org.springframework.statemachine.StateMachine<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> ) . isRunning ( ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( { STRING } ) @ Test public void void ( ) java.lang.Exception { context . register ( org.springframework.statemachine.StateMachineFactoryTests.Config3 .class ) ; context . refresh ( ) ; StateMachineFactory < TestStates , TestEvents > org.springframework.statemachine.StateMachineFactory<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> = context . getBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINEFACTORY , StateMachineFactory .class ) ; StateMachine < TestStates , TestEvents > org.springframework.statemachine.StateMachine<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> = org.springframework.statemachine.StateMachineFactory<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> . getStateMachine ( ) ; assertThat ( ( ( SmartLifecycle ) org.springframework.statemachine.StateMachine<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> ) . isAutoStartup ( ) , is ( false ) ) ; assertThat ( ( ( SmartLifecycle ) org.springframework.statemachine.StateMachine<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> ) . isRunning ( ) , is ( false ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( { STRING } ) @ Test public void void ( ) { context . register ( org.springframework.statemachine.StateMachineFactoryTests.Config4 .class ) ; context . refresh ( ) ; StateMachineFactory < TestStates , TestEvents > org.springframework.statemachine.StateMachineFactory<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> = context . getBean ( STRING , ObjectStateMachineFactory .class ) ; StateMachine < TestStates , TestEvents > org.springframework.statemachine.StateMachine<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> = org.springframework.statemachine.StateMachineFactory<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> . getStateMachine ( ) ; org.springframework.statemachine.StateMachine<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> . start ( ) ; assertThat ( org.springframework.statemachine.StateMachine<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> . getState ( ) . getIds ( ) , contains ( TestStates . S1 ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( { STRING } ) @ Test public void void ( ) { context . register ( org.springframework.statemachine.StateMachineFactoryTests.Config4 .class , org.springframework.statemachine.StateMachineFactoryTests.Config5 .class ) ; context . refresh ( ) ; StateMachineFactory < TestStates , TestEvents > org.springframework.statemachine.StateMachineFactory<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> = context . getBean ( STRING , ObjectStateMachineFactory .class ) ; StateMachineFactory < TestStates , TestEvents > org.springframework.statemachine.StateMachineFactory<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> = context . getBean ( STRING , ObjectStateMachineFactory .class ) ; StateMachine < TestStates , TestEvents > org.springframework.statemachine.StateMachine<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> = org.springframework.statemachine.StateMachineFactory<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> . getStateMachine ( ) ; StateMachine < TestStates , TestEvents > org.springframework.statemachine.StateMachine<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> = org.springframework.statemachine.StateMachineFactory<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> . getStateMachine ( ) ; org.springframework.statemachine.StateMachine<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> . start ( ) ; org.springframework.statemachine.StateMachine<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> . start ( ) ; assertThat ( org.springframework.statemachine.StateMachine<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> . getState ( ) . getIds ( ) , contains ( TestStates . S1 ) ) ; assertThat ( org.springframework.statemachine.StateMachine<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> . getState ( ) . getIds ( ) , contains ( TestStates . S1 ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( { STRING } ) @ Test public void void ( ) java.lang.Exception { context . register ( org.springframework.statemachine.StateMachineFactoryTests.Config6 .class ) ; context . refresh ( ) ; ObjectStateMachineFactory < TestStates , TestEvents > org.springframework.statemachine.ObjectStateMachineFactory<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> = context . getBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINEFACTORY , ObjectStateMachineFactory .class ) ; StateMachine < TestStates , TestEvents > org.springframework.statemachine.StateMachine<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> = org.springframework.statemachine.ObjectStateMachineFactory<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> . getStateMachine ( ) ; assertThat ( org.springframework.statemachine.StateMachine<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> . getState ( ) . getIds ( ) , contains ( TestStates . S1 ) ) ; org.springframework.statemachine.StateMachineFactoryTests.TestStateMachineListener org.springframework.statemachine.StateMachineFactoryTests.TestStateMachineListener = new org.springframework.statemachine.StateMachineFactoryTests.TestStateMachineListener ( ) ; org.springframework.statemachine.StateMachine<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> . addStateListener ( org.springframework.statemachine.StateMachineFactoryTests.TestStateMachineListener ) ; org.springframework.statemachine.StateMachine<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> . sendEvent ( MessageBuilder . withPayload ( TestEvents . E1 ) . build ( ) ) ; assertThat ( org.springframework.statemachine.StateMachineFactoryTests.TestStateMachineListener . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( org.springframework.statemachine.StateMachine<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> . getState ( ) . getIds ( ) , contains ( TestStates . S2 ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < TestStates , TestEvents > org.springframework.statemachine.StateMachineStateConfigurer<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.StateMachineStateConfigurer<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> . withStates ( ) . initial ( TestStates . S1 ) . state ( TestStates . S1 ) . state ( TestStates . S2 ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < TestStates , TestEvents > org.springframework.statemachine.StateMachineTransitionConfigurer<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.StateMachineTransitionConfigurer<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> . withExternal ( ) . source ( TestStates . S1 ) . target ( TestStates . S2 ) . event ( TestEvents . E1 ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.TaskExecutor org.springframework.statemachine.TaskExecutor ( ) { return new SyncTaskExecutor ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineConfigurationConfigurer < TestStates , TestEvents > org.springframework.statemachine.StateMachineConfigurationConfigurer<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.StateMachineConfigurationConfigurer<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> . withVerifier ( ) . enabled ( false ) . and ( ) . withConfiguration ( ) . autoStartup ( true ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < TestStates , TestEvents > org.springframework.statemachine.StateMachineStateConfigurer<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.StateMachineStateConfigurer<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> . withStates ( ) . initial ( TestStates . S1 ) . states ( java.util.EnumSet . java.util.EnumSet<E> ( TestStates .class ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineConfigurationConfigurer < TestStates , TestEvents > org.springframework.statemachine.StateMachineConfigurationConfigurer<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.StateMachineConfigurationConfigurer<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> . withVerifier ( ) . enabled ( false ) . and ( ) . withConfiguration ( ) . autoStartup ( false ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < TestStates , TestEvents > org.springframework.statemachine.StateMachineStateConfigurer<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.StateMachineStateConfigurer<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> . withStates ( ) . initial ( TestStates . S1 ) . states ( java.util.EnumSet . java.util.EnumSet<E> ( TestStates .class ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineConfigurationConfigurer < TestStates , TestEvents > org.springframework.statemachine.StateMachineConfigurationConfigurer<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.StateMachineConfigurationConfigurer<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> . withConfiguration ( ) . autoStartup ( false ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < TestStates , TestEvents > org.springframework.statemachine.StateMachineStateConfigurer<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.StateMachineStateConfigurer<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> . withStates ( ) . initial ( TestStates . S1 ) . states ( java.util.EnumSet . java.util.EnumSet<E> ( TestStates .class ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < TestStates , TestEvents > org.springframework.statemachine.StateMachineTransitionConfigurer<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.StateMachineTransitionConfigurer<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> . withExternal ( ) . source ( TestStates . S1 ) . target ( TestStates . S2 ) . event ( TestEvents . E1 ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineConfigurationConfigurer < TestStates , TestEvents > org.springframework.statemachine.StateMachineConfigurationConfigurer<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.StateMachineConfigurationConfigurer<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> . withConfiguration ( ) . autoStartup ( false ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < TestStates , TestEvents > org.springframework.statemachine.StateMachineStateConfigurer<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.StateMachineStateConfigurer<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> . withStates ( ) . initial ( TestStates . S1 ) . states ( java.util.EnumSet . java.util.EnumSet<E> ( TestStates .class ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < TestStates , TestEvents > org.springframework.statemachine.StateMachineTransitionConfigurer<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.StateMachineTransitionConfigurer<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> . withExternal ( ) . source ( TestStates . S1 ) . target ( TestStates . S2 ) . event ( TestEvents . E1 ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineConfigurationConfigurer < TestStates , TestEvents > org.springframework.statemachine.StateMachineConfigurationConfigurer<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.StateMachineConfigurationConfigurer<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> . withConfiguration ( ) . autoStartup ( true ) . taskExecutor ( new SimpleAsyncTaskExecutor ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < TestStates , TestEvents > org.springframework.statemachine.StateMachineStateConfigurer<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.StateMachineStateConfigurer<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> . withStates ( ) . initial ( TestStates . S1 ) . state ( TestStates . S1 ) . state ( TestStates . S2 ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < TestStates , TestEvents > org.springframework.statemachine.StateMachineTransitionConfigurer<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.StateMachineTransitionConfigurer<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> . withExternal ( ) . source ( TestStates . S1 ) . target ( TestStates . S2 ) . event ( TestEvents . E1 ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( State < TestStates , TestEvents > org.springframework.statemachine.State<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> , State < TestStates , TestEvents > org.springframework.statemachine.State<org.springframework.statemachine.TestStates,org.springframework.statemachine.TestEvents> ) { java.util.concurrent.CountDownLatch . void ( ) ; }  <METHOD_END>