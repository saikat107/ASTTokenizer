<METHOD_START> @ Test @ RedisAvailable public void void ( ) { EventDrivenConsumer org.springframework.integration.redis.config.EventDrivenConsumer = org.springframework.integration.redis.config.ApplicationContext . getBean ( STRING , EventDrivenConsumer .class ) ; java.lang.Object java.lang.Object = org.springframework.integration.redis.config.ApplicationContext . getBean ( STRING ) ; assertEquals ( STRING , org.springframework.integration.redis.config.EventDrivenConsumer . getComponentName ( ) ) ; DirectFieldAccessor org.springframework.integration.redis.config.DirectFieldAccessor = new DirectFieldAccessor ( java.lang.Object ) ; java.lang.Object java.lang.Object = org.springframework.integration.redis.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; assertNotNull ( java.lang.Object ) ; assertEquals ( STRING , ( ( Expression ) java.lang.Object ) . getExpressionString ( ) ) ; java.lang.Object java.lang.Object = org.springframework.integration.redis.config.ApplicationContext . getBean ( STRING ) ; assertEquals ( java.lang.Object , org.springframework.integration.redis.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; assertEquals ( org.springframework.integration.redis.config.ApplicationContext . getBean ( STRING ) , org.springframework.integration.redis.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; java.lang.Object java.lang.Object = TestUtils . getPropertyValue ( org.springframework.integration.redis.config.EventDrivenConsumer , STRING ) ; assertTrue ( AopUtils . isAopProxy ( java.lang.Object ) ) ; assertThat ( TestUtils . getPropertyValue ( java.lang.Object , STRING ) , Matchers . instanceOf ( RequestHandlerRetryAdvice .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ RedisAvailable public void void ( ) java.lang.Exception { MessageChannel org.springframework.integration.redis.config.MessageChannel = org.springframework.integration.redis.config.ApplicationContext . getBean ( STRING , MessageChannel .class ) ; this . awaitContainerSubscribed ( TestUtils . getPropertyValue ( org.springframework.integration.redis.config.RedisInboundChannelAdapter , STRING , RedisMessageListenerContainer .class ) ) ; org.springframework.integration.redis.config.MessageChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; QueueChannel org.springframework.integration.redis.config.QueueChannel = org.springframework.integration.redis.config.ApplicationContext . getBean ( STRING , QueueChannel .class ) ; Message < ? > org.springframework.integration.redis.config.Message<?> = org.springframework.integration.redis.config.QueueChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.redis.config.Message<> ) ; assertEquals ( STRING , org.springframework.integration.redis.config.Message<> . getPayload ( ) ) ; org.springframework.integration.redis.config.MessageChannel = org.springframework.integration.redis.config.ApplicationContext . getBean ( STRING , MessageChannel .class ) ; org.springframework.integration.redis.config.MessageChannel . send ( MessageBuilder . withPayload ( STRING ) . setHeader ( STRING , STRING ) . build ( ) ) ; org.springframework.integration.redis.config.QueueChannel = org.springframework.integration.redis.config.ApplicationContext . getBean ( STRING , QueueChannel .class ) ; org.springframework.integration.redis.config.Message<?> = org.springframework.integration.redis.config.QueueChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.redis.config.Message<> ) ; assertEquals ( STRING , org.springframework.integration.redis.config.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ RedisAvailable public void void ( ) java.lang.Exception { MessageChannel org.springframework.integration.redis.config.MessageChannel = org.springframework.integration.redis.config.ApplicationContext . getBean ( STRING , MessageChannel .class ) ; this . awaitContainerSubscribed ( TestUtils . getPropertyValue ( org.springframework.integration.redis.config.RedisInboundChannelAdapter , STRING , RedisMessageListenerContainer .class ) ) ; org.springframework.integration.redis.config.MessageChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; QueueChannel org.springframework.integration.redis.config.QueueChannel = org.springframework.integration.redis.config.ApplicationContext . getBean ( STRING , QueueChannel .class ) ; Message < ? > org.springframework.integration.redis.config.Message<?> = org.springframework.integration.redis.config.QueueChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.redis.config.Message<> ) ; assertEquals ( STRING , org.springframework.integration.redis.config.Message<> . getPayload ( ) ) ; }  <METHOD_END>