<METHOD_START> @ java.lang.SuppressWarnings ( { STRING } ) @ Test public void void ( ) { context . register ( org.springframework.statemachine.action.ActionTests.Config1 .class ) ; context . refresh ( ) ; assertTrue ( context . containsBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE ) ) ; StateMachine < TestStates , TestEvents > org.springframework.statemachine.action.StateMachine<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> = context . getBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE , StateMachine .class ) ; org.springframework.statemachine.action.StateMachine<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . start ( ) ; org.springframework.statemachine.action.ActionTests.TestCountAction org.springframework.statemachine.action.ActionTests.TestCountAction = context . getBean ( STRING , org.springframework.statemachine.action.ActionTests.TestCountAction .class ) ; org.springframework.statemachine.action.ActionTests.TestCountAction org.springframework.statemachine.action.ActionTests.TestCountAction = context . getBean ( STRING , org.springframework.statemachine.action.ActionTests.TestCountAction .class ) ; org.springframework.statemachine.action.ActionTests.TestCountAction org.springframework.statemachine.action.ActionTests.TestCountAction = context . getBean ( STRING , org.springframework.statemachine.action.ActionTests.TestCountAction .class ) ; org.springframework.statemachine.action.StateMachine<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . sendEvent ( MessageBuilder . withPayload ( TestEvents . E1 ) . build ( ) ) ; org.springframework.statemachine.action.StateMachine<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . sendEvent ( MessageBuilder . withPayload ( TestEvents . E2 ) . build ( ) ) ; org.springframework.statemachine.action.StateMachine<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . sendEvent ( MessageBuilder . withPayload ( TestEvents . E3 ) . build ( ) ) ; assertThat ( org.springframework.statemachine.action.ActionTests.TestCountAction . int , is ( NUMBER ) ) ; assertThat ( org.springframework.statemachine.action.ActionTests.TestCountAction . int , is ( NUMBER ) ) ; assertThat ( org.springframework.statemachine.action.ActionTests.TestCountAction . int , is ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( { STRING } ) @ Test public void void ( ) { context . register ( org.springframework.statemachine.action.ActionTests.Config2 .class ) ; context . refresh ( ) ; assertTrue ( context . containsBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE ) ) ; StateMachine < TestStates , TestEvents > org.springframework.statemachine.action.StateMachine<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> = context . getBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE , StateMachine .class ) ; org.springframework.statemachine.action.StateMachine<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . start ( ) ; org.springframework.statemachine.action.ActionTests.TestCountAction org.springframework.statemachine.action.ActionTests.TestCountAction = context . getBean ( STRING , org.springframework.statemachine.action.ActionTests.TestCountAction .class ) ; org.springframework.statemachine.action.ActionTests.TestCountAction org.springframework.statemachine.action.ActionTests.TestCountAction = context . getBean ( STRING , org.springframework.statemachine.action.ActionTests.TestCountAction .class ) ; org.springframework.statemachine.action.StateMachine<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . sendEvent ( MessageBuilder . withPayload ( TestEvents . E1 ) . build ( ) ) ; assertThat ( org.springframework.statemachine.action.ActionTests.TestCountAction . int , is ( NUMBER ) ) ; assertThat ( org.springframework.statemachine.action.ActionTests.TestCountAction . int , is ( NUMBER ) ) ; assertThat ( org.springframework.statemachine.action.ActionTests.TestCountAction . org.springframework.statemachine.action.StateContext<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> , notNullValue ( ) ) ; assertThat ( org.springframework.statemachine.action.ActionTests.TestCountAction . org.springframework.statemachine.action.StateContext<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . getException ( ) , notNullValue ( ) ) ; assertThat ( org.springframework.statemachine.action.ActionTests.TestCountAction . org.springframework.statemachine.action.StateContext<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . getException ( ) , instanceOf ( java.lang.RuntimeException .class ) ) ; assertThat ( org.springframework.statemachine.action.ActionTests.TestCountAction . org.springframework.statemachine.action.StateContext<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . getException ( ) . getMessage ( ) , is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( { STRING } ) @ Test public void void ( ) java.lang.Exception { context . register ( org.springframework.statemachine.action.ActionTests.Config3 .class ) ; context . refresh ( ) ; assertTrue ( context . containsBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE ) ) ; StateMachine < TestStates , TestEvents > org.springframework.statemachine.action.StateMachine<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> = context . getBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE , StateMachine .class ) ; org.springframework.statemachine.action.StateMachine<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . start ( ) ; org.springframework.statemachine.action.ActionTests.TestCountAction org.springframework.statemachine.action.ActionTests.TestCountAction = context . getBean ( STRING , org.springframework.statemachine.action.ActionTests.TestCountAction .class ) ; org.springframework.statemachine.action.ActionTests.TestCountAction org.springframework.statemachine.action.ActionTests.TestCountAction = context . getBean ( STRING , org.springframework.statemachine.action.ActionTests.TestCountAction .class ) ; org.springframework.statemachine.action.ActionTests.TestCountAction org.springframework.statemachine.action.ActionTests.TestCountAction = context . getBean ( STRING , org.springframework.statemachine.action.ActionTests.TestCountAction .class ) ; org.springframework.statemachine.action.ActionTests.TestCountAction org.springframework.statemachine.action.ActionTests.TestCountAction = context . getBean ( STRING , org.springframework.statemachine.action.ActionTests.TestCountAction .class ) ; org.springframework.statemachine.action.ActionTests.TestCountAction org.springframework.statemachine.action.ActionTests.TestCountAction = context . getBean ( STRING , org.springframework.statemachine.action.ActionTests.TestCountAction .class ) ; org.springframework.statemachine.action.ActionTests.TestCountAction org.springframework.statemachine.action.ActionTests.TestCountAction = context . getBean ( STRING , org.springframework.statemachine.action.ActionTests.TestCountAction .class ) ; org.springframework.statemachine.action.StateMachine<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . sendEvent ( MessageBuilder . withPayload ( TestEvents . E1 ) . build ( ) ) ; assertThat ( org.springframework.statemachine.action.StateMachine<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . getState ( ) . getId ( ) , is ( TestStates . S2 ) ) ; assertThat ( org.springframework.statemachine.action.ActionTests.TestCountAction . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( org.springframework.statemachine.action.ActionTests.TestCountAction . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; org.springframework.statemachine.action.StateMachine<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . sendEvent ( MessageBuilder . withPayload ( TestEvents . E2 ) . build ( ) ) ; assertThat ( org.springframework.statemachine.action.ActionTests.TestCountAction . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( org.springframework.statemachine.action.ActionTests.TestCountAction . int , is ( NUMBER ) ) ; assertThat ( org.springframework.statemachine.action.ActionTests.TestCountAction . int , is ( NUMBER ) ) ; assertThat ( org.springframework.statemachine.action.ActionTests.TestCountAction . org.springframework.statemachine.action.StateContext<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> , notNullValue ( ) ) ; assertThat ( org.springframework.statemachine.action.ActionTests.TestCountAction . org.springframework.statemachine.action.StateContext<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . getException ( ) , notNullValue ( ) ) ; assertThat ( org.springframework.statemachine.action.ActionTests.TestCountAction . org.springframework.statemachine.action.StateContext<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . getException ( ) , instanceOf ( java.lang.RuntimeException .class ) ) ; assertThat ( org.springframework.statemachine.action.ActionTests.TestCountAction . org.springframework.statemachine.action.StateContext<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . getException ( ) . getMessage ( ) , is ( STRING ) ) ; assertThat ( org.springframework.statemachine.action.ActionTests.TestCountAction . int , is ( NUMBER ) ) ; assertThat ( org.springframework.statemachine.action.ActionTests.TestCountAction . int , is ( NUMBER ) ) ; assertThat ( org.springframework.statemachine.action.ActionTests.TestCountAction . org.springframework.statemachine.action.StateContext<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> , notNullValue ( ) ) ; assertThat ( org.springframework.statemachine.action.ActionTests.TestCountAction . org.springframework.statemachine.action.StateContext<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . getException ( ) , notNullValue ( ) ) ; assertThat ( org.springframework.statemachine.action.ActionTests.TestCountAction . org.springframework.statemachine.action.StateContext<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . getException ( ) , instanceOf ( java.lang.RuntimeException .class ) ) ; assertThat ( org.springframework.statemachine.action.ActionTests.TestCountAction . org.springframework.statemachine.action.StateContext<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . getException ( ) . getMessage ( ) , is ( STRING ) ) ; assertThat ( org.springframework.statemachine.action.ActionTests.TestCountAction . int , is ( NUMBER ) ) ; assertThat ( org.springframework.statemachine.action.ActionTests.TestCountAction . int , is ( NUMBER ) ) ; assertThat ( org.springframework.statemachine.action.ActionTests.TestCountAction . org.springframework.statemachine.action.StateContext<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> , notNullValue ( ) ) ; assertThat ( org.springframework.statemachine.action.ActionTests.TestCountAction . org.springframework.statemachine.action.StateContext<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . getException ( ) , notNullValue ( ) ) ; assertThat ( org.springframework.statemachine.action.ActionTests.TestCountAction . org.springframework.statemachine.action.StateContext<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . getException ( ) , instanceOf ( java.lang.RuntimeException .class ) ) ; assertThat ( org.springframework.statemachine.action.ActionTests.TestCountAction . org.springframework.statemachine.action.StateContext<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . getException ( ) . getMessage ( ) , is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) {	}  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.statemachine.action.AnnotationConfigApplicationContext org.springframework.statemachine.action.AnnotationConfigApplicationContext ( ) { return new AnnotationConfigApplicationContext ( ) ; }  <METHOD_END>
<METHOD_START> public void ( ) { int = NUMBER ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateContext < TestStates , TestEvents > org.springframework.statemachine.action.StateContext<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> ) { this . org.springframework.statemachine.action.StateContext<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> = org.springframework.statemachine.action.StateContext<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> ; int ++ ; java.util.concurrent.CountDownLatch . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < TestStates , TestEvents > org.springframework.statemachine.action.StateMachineStateConfigurer<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.action.StateMachineStateConfigurer<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . withStates ( ) . initial ( TestStates . S1 ) . state ( TestStates . S1 ) . state ( TestStates . S2 ) . state ( TestStates . S3 ) . state ( TestStates . S4 ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < TestStates , TestEvents > org.springframework.statemachine.action.StateMachineTransitionConfigurer<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.action.StateMachineTransitionConfigurer<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . withExternal ( ) . source ( TestStates . S1 ) . target ( TestStates . S2 ) . event ( TestEvents . E1 ) . action ( org.springframework.statemachine.action.ActionTests.TestCountAction ( ) ) . and ( ) . withExternal ( ) . source ( TestStates . S2 ) . target ( TestStates . S3 ) . event ( TestEvents . E2 ) . action ( org.springframework.statemachine.action.ActionTests.TestCountAction ( ) ) . and ( ) . withExternal ( ) . source ( TestStates . S3 ) . target ( TestStates . S4 ) . event ( TestEvents . E3 ) . action ( org.springframework.statemachine.action.ActionTests.TestCountAction ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.action.ActionTests.TestCountAction org.springframework.statemachine.action.ActionTests.TestCountAction ( ) { return new org.springframework.statemachine.action.ActionTests.TestCountAction ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.action.ActionTests.TestCountAction org.springframework.statemachine.action.ActionTests.TestCountAction ( ) { return new org.springframework.statemachine.action.ActionTests.TestCountAction ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.action.ActionTests.TestCountAction org.springframework.statemachine.action.ActionTests.TestCountAction ( ) { return new org.springframework.statemachine.action.ActionTests.TestCountAction ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.action.TaskExecutor org.springframework.statemachine.action.TaskExecutor ( ) { return new SyncTaskExecutor ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < TestStates , TestEvents > org.springframework.statemachine.action.StateMachineStateConfigurer<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.action.StateMachineStateConfigurer<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . withStates ( ) . initial ( TestStates . S1 ) . state ( TestStates . S1 ) . state ( TestStates . S2 ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < TestStates , TestEvents > org.springframework.statemachine.action.StateMachineTransitionConfigurer<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.action.StateMachineTransitionConfigurer<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . withExternal ( ) . source ( TestStates . S1 ) . target ( TestStates . S2 ) . event ( TestEvents . E1 ) . action ( org.springframework.statemachine.action.ActionTests.TestCountAction ( ) , org.springframework.statemachine.action.ActionTests.TestCountAction ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.action.ActionTests.TestCountAction org.springframework.statemachine.action.ActionTests.TestCountAction ( ) { return new org.springframework.statemachine.action.ActionTests.TestCountAction ( ) { @ java.lang.Override public void void ( StateContext < TestStates , TestEvents > org.springframework.statemachine.action.StateContext<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> ) { super. void ( org.springframework.statemachine.action.StateContext<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> ) ; throw new java.lang.RuntimeException ( STRING ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateContext < TestStates , TestEvents > org.springframework.statemachine.action.StateContext<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> ) { super. void ( org.springframework.statemachine.action.StateContext<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> ) ; throw new java.lang.RuntimeException ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.action.ActionTests.TestCountAction org.springframework.statemachine.action.ActionTests.TestCountAction ( ) { return new org.springframework.statemachine.action.ActionTests.TestCountAction ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.action.TaskExecutor org.springframework.statemachine.action.TaskExecutor ( ) { return new SyncTaskExecutor ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < TestStates , TestEvents > org.springframework.statemachine.action.StateMachineStateConfigurer<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.action.StateMachineStateConfigurer<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . withStates ( ) . initial ( TestStates . S1 ) . state ( TestStates . S2 ) . stateDo ( TestStates . S2 , org.springframework.statemachine.action.ActionTests.TestCountAction ( ) , org.springframework.statemachine.action.ActionTests.TestCountAction ( ) ) . stateEntry ( TestStates . S2 , org.springframework.statemachine.action.ActionTests.TestCountAction ( ) , org.springframework.statemachine.action.ActionTests.TestCountAction ( ) ) . stateExit ( TestStates . S2 , org.springframework.statemachine.action.ActionTests.TestCountAction ( ) , org.springframework.statemachine.action.ActionTests.TestCountAction ( ) ) . state ( TestStates . S3 ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < TestStates , TestEvents > org.springframework.statemachine.action.StateMachineTransitionConfigurer<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.action.StateMachineTransitionConfigurer<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . withExternal ( ) . source ( TestStates . S1 ) . target ( TestStates . S2 ) . event ( TestEvents . E1 ) . and ( ) . withExternal ( ) . source ( TestStates . S2 ) . target ( TestStates . S3 ) . event ( TestEvents . E2 ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.action.ActionTests.TestCountAction org.springframework.statemachine.action.ActionTests.TestCountAction ( ) { return new org.springframework.statemachine.action.ActionTests.TestCountAction ( ) { @ java.lang.Override public void void ( StateContext < TestStates , TestEvents > org.springframework.statemachine.action.StateContext<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> ) { super. void ( org.springframework.statemachine.action.StateContext<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> ) ; throw new java.lang.RuntimeException ( STRING ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateContext < TestStates , TestEvents > org.springframework.statemachine.action.StateContext<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> ) { super. void ( org.springframework.statemachine.action.StateContext<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> ) ; throw new java.lang.RuntimeException ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.action.ActionTests.TestCountAction org.springframework.statemachine.action.ActionTests.TestCountAction ( ) { return new org.springframework.statemachine.action.ActionTests.TestCountAction ( ) { @ java.lang.Override public void void ( StateContext < TestStates , TestEvents > org.springframework.statemachine.action.StateContext<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> ) { super. void ( org.springframework.statemachine.action.StateContext<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> ) ; throw new java.lang.RuntimeException ( STRING ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateContext < TestStates , TestEvents > org.springframework.statemachine.action.StateContext<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> ) { super. void ( org.springframework.statemachine.action.StateContext<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> ) ; throw new java.lang.RuntimeException ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.action.ActionTests.TestCountAction org.springframework.statemachine.action.ActionTests.TestCountAction ( ) { return new org.springframework.statemachine.action.ActionTests.TestCountAction ( ) { @ java.lang.Override public void void ( StateContext < TestStates , TestEvents > org.springframework.statemachine.action.StateContext<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> ) { super. void ( org.springframework.statemachine.action.StateContext<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> ) ; throw new java.lang.RuntimeException ( STRING ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateContext < TestStates , TestEvents > org.springframework.statemachine.action.StateContext<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> ) { super. void ( org.springframework.statemachine.action.StateContext<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> ) ; throw new java.lang.RuntimeException ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.action.ActionTests.TestCountAction org.springframework.statemachine.action.ActionTests.TestCountAction ( ) { return new org.springframework.statemachine.action.ActionTests.TestCountAction ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.action.ActionTests.TestCountAction org.springframework.statemachine.action.ActionTests.TestCountAction ( ) { return new org.springframework.statemachine.action.ActionTests.TestCountAction ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.action.ActionTests.TestCountAction org.springframework.statemachine.action.ActionTests.TestCountAction ( ) { return new org.springframework.statemachine.action.ActionTests.TestCountAction ( ) ; }  <METHOD_END>