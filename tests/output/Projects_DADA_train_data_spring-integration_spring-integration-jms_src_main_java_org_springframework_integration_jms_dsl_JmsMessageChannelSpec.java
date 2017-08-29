<METHOD_START> void ( ConnectionFactory org.springframework.integration.jms.dsl.ConnectionFactory ) { super( new JmsChannelFactoryBean ( true ) , org.springframework.integration.jms.dsl.ConnectionFactory ); }  <METHOD_END>
<METHOD_START> public S S ( java.lang.Class<? extends org.springframework.integration.jms.dsl.AbstractMessageListenerContainer> < ? extends AbstractMessageListenerContainer > java.lang.Class<? extends org.springframework.integration.jms.dsl.AbstractMessageListenerContainer> ) { this . jmsChannelFactoryBean . setContainerType ( java.lang.Class<> ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( int int ) { this . jmsChannelFactoryBean . setConcurrentConsumers ( int ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( int int ) { this . jmsChannelFactoryBean . setMaxSubscribers ( int ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( boolean boolean ) { this . jmsChannelFactoryBean . setAutoStartup ( boolean ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( int int ) { this . jmsChannelFactoryBean . setPhase ( int ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( ErrorHandler org.springframework.integration.jms.dsl.ErrorHandler ) { this . jmsChannelFactoryBean . setErrorHandler ( org.springframework.integration.jms.dsl.ErrorHandler ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( boolean boolean ) { this . jmsChannelFactoryBean . setExposeListenerSession ( boolean ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( boolean boolean ) { this . jmsChannelFactoryBean . setAcceptMessagesWhileStopping ( boolean ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( int int ) { this . jmsChannelFactoryBean . setIdleTaskExecutionLimit ( int ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( int int ) { this . jmsChannelFactoryBean . setMaxMessagesPerTask ( int ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( long long ) { this . jmsChannelFactoryBean . setRecoveryInterval ( long ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( java.util.concurrent.Executor java.util.concurrent.Executor ) { this . jmsChannelFactoryBean . setTaskExecutor ( java.util.concurrent.Executor ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( PlatformTransactionManager org.springframework.integration.jms.dsl.PlatformTransactionManager ) { this . jmsChannelFactoryBean . setTransactionManager ( org.springframework.integration.jms.dsl.PlatformTransactionManager ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( java.lang.String java.lang.String ) { this . jmsChannelFactoryBean . setTransactionName ( java.lang.String ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( int int ) { this . jmsChannelFactoryBean . setTransactionTimeout ( int ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( java.lang.Integer java.lang.Integer ) { this . jmsChannelFactoryBean . setCacheLevel ( java.lang.Integer ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( boolean boolean ) { this . jmsChannelFactoryBean . setSubscriptionShared ( boolean ) ; return _this ( ) ; }  <METHOD_END>
