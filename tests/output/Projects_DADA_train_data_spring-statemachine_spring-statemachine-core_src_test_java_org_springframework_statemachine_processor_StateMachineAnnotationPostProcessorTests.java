<METHOD_START> @ java.lang.Override protected org.springframework.statemachine.processor.AnnotationConfigApplicationContext org.springframework.statemachine.processor.AnnotationConfigApplicationContext ( ) { return new AnnotationConfigApplicationContext ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { context . register ( org.springframework.statemachine.processor.StateMachineAnnotationPostProcessorTests.Config1 .class , org.springframework.statemachine.processor.StateMachineAnnotationPostProcessorTests.BeanConfig1 .class ) ; context . refresh ( ) ; }  <METHOD_END>
<METHOD_START> @ OnTransition ( source = STRING , target = STRING ) public void void ( ) { java.util.concurrent.CountDownLatch . void ( ) ; }  <METHOD_END>
<METHOD_START> @ OnTransition public void void ( ) { java.util.concurrent.CountDownLatch . void ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.processor.StateMachineAnnotationPostProcessorTests.Bean1 org.springframework.statemachine.processor.StateMachineAnnotationPostProcessorTests.Bean1 ( ) { return new org.springframework.statemachine.processor.StateMachineAnnotationPostProcessorTests.Bean1 ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < TestStates , TestEvents > org.springframework.statemachine.processor.StateMachineStateConfigurer<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.processor.StateMachineStateConfigurer<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . withStates ( ) . initial ( TestStates . S1 ) . states ( java.util.EnumSet . java.util.EnumSet<E> ( TestStates .class ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < TestStates , TestEvents > org.springframework.statemachine.processor.StateMachineTransitionConfigurer<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.processor.StateMachineTransitionConfigurer<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . withExternal ( ) . source ( TestStates . S1 ) . target ( TestStates . S2 ) . event ( TestEvents . E1 ) ; }  <METHOD_END>