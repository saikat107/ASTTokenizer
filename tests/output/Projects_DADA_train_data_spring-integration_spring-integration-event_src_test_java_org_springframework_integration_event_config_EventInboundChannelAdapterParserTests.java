<METHOD_START> @ Test public void void ( ) { java.lang.Object java.lang.Object = org.springframework.integration.event.config.ApplicationContext . getBean ( STRING ) ; Assert . assertNotNull ( java.lang.Object ) ; Assert . assertTrue ( java.lang.Object instanceof ApplicationEventListeningMessageProducer ) ; DirectFieldAccessor org.springframework.integration.event.config.DirectFieldAccessor = new DirectFieldAccessor ( java.lang.Object ) ; Assert . assertEquals ( org.springframework.integration.event.config.ApplicationContext . getBean ( STRING ) , org.springframework.integration.event.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; Assert . assertSame ( org.springframework.integration.event.config.MessageChannel , org.springframework.integration.event.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { java.lang.Object java.lang.Object = org.springframework.integration.event.config.ApplicationContext . getBean ( STRING ) ; Assert . assertNotNull ( java.lang.Object ) ; Assert . assertTrue ( java.lang.Object instanceof ApplicationEventListeningMessageProducer ) ; DirectFieldAccessor org.springframework.integration.event.config.DirectFieldAccessor = new DirectFieldAccessor ( java.lang.Object ) ; Assert . assertEquals ( org.springframework.integration.event.config.ApplicationContext . getBean ( STRING ) , org.springframework.integration.event.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; java.util.Set<org.springframework.integration.event.config.ResolvableType> < ResolvableType > java.util.Set<org.springframework.integration.event.config.ResolvableType> = ( java.util.Set<org.springframework.integration.event.config.ResolvableType> < ResolvableType > ) org.springframework.integration.event.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; assertNotNull ( java.util.Set<org.springframework.integration.event.config.ResolvableType> ) ; assertTrue ( java.util.Set<org.springframework.integration.event.config.ResolvableType> . size ( ) == NUMBER ) ; assertTrue ( java.util.Set<org.springframework.integration.event.config.ResolvableType> . contains ( ResolvableType . forClass ( org.springframework.integration.event.config.EventInboundChannelAdapterParserTests.SampleEvent .class ) ) ) ; assertTrue ( java.util.Set<org.springframework.integration.event.config.ResolvableType> . contains ( ResolvableType . forClass ( org.springframework.integration.event.config.EventInboundChannelAdapterParserTests.AnotherSampleEvent .class ) ) ) ; assertTrue ( java.util.Set<org.springframework.integration.event.config.ResolvableType> . contains ( ResolvableType . forClass ( java.util.Date .class ) ) ) ; assertNull ( org.springframework.integration.event.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { java.lang.Object java.lang.Object = org.springframework.integration.event.config.ApplicationContext . getBean ( STRING ) ; Assert . assertNotNull ( java.lang.Object ) ; Assert . assertTrue ( java.lang.Object instanceof ApplicationEventListeningMessageProducer ) ; DirectFieldAccessor org.springframework.integration.event.config.DirectFieldAccessor = new DirectFieldAccessor ( java.lang.Object ) ; Assert . assertEquals ( org.springframework.integration.event.config.ApplicationContext . getBean ( STRING ) , org.springframework.integration.event.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; java.util.Set<org.springframework.integration.event.config.ResolvableType> < ResolvableType > java.util.Set<org.springframework.integration.event.config.ResolvableType> = ( java.util.Set<org.springframework.integration.event.config.ResolvableType> < ResolvableType > ) org.springframework.integration.event.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; assertNotNull ( java.util.Set<org.springframework.integration.event.config.ResolvableType> ) ; assertTrue ( java.util.Set<org.springframework.integration.event.config.ResolvableType> . size ( ) == NUMBER ) ; assertTrue ( java.util.Set<org.springframework.integration.event.config.ResolvableType> . contains ( ResolvableType . forClass ( org.springframework.integration.event.config.EventInboundChannelAdapterParserTests.SampleEvent .class ) ) ) ; assertTrue ( java.util.Set<org.springframework.integration.event.config.ResolvableType> . contains ( ResolvableType . forClass ( org.springframework.integration.event.config.EventInboundChannelAdapterParserTests.AnotherSampleEvent .class ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { PollableChannel org.springframework.integration.event.config.PollableChannel = org.springframework.integration.event.config.ApplicationContext . getBean ( STRING , PollableChannel .class ) ; assertEquals ( ContextRefreshedEvent .class , org.springframework.integration.event.config.PollableChannel . receive ( NUMBER ) . getPayload ( ) . getClass ( ) ) ; org.springframework.integration.event.config.ApplicationContext . publishEvent ( new org.springframework.integration.event.config.EventInboundChannelAdapterParserTests.SampleEvent ( STRING ) ) ; Message < ? > org.springframework.integration.event.config.Message<?> = org.springframework.integration.event.config.PollableChannel . receive ( NUMBER ) ; MessageHistory org.springframework.integration.event.config.MessageHistory = MessageHistory . read ( org.springframework.integration.event.config.Message<> ) ; assertNotNull ( org.springframework.integration.event.config.MessageHistory ) ; java.util.Properties java.util.Properties = TestUtils . locateComponentInHistory ( org.springframework.integration.event.config.MessageHistory , STRING , NUMBER ) ; assertNotNull ( java.util.Properties ) ; assertEquals ( STRING , java.util.Properties . java.lang.Object ( STRING ) ) ; assertNotNull ( org.springframework.integration.event.config.Message<> ) ; assertEquals ( org.springframework.integration.event.config.EventInboundChannelAdapterParserTests.SampleEvent .class , org.springframework.integration.event.config.Message<> . getPayload ( ) . getClass ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.Object java.lang.Object = org.springframework.integration.event.config.ApplicationContext . getBean ( STRING ) ; Assert . assertNotNull ( java.lang.Object ) ; Assert . assertTrue ( java.lang.Object instanceof ApplicationEventListeningMessageProducer ) ; DirectFieldAccessor org.springframework.integration.event.config.DirectFieldAccessor = new DirectFieldAccessor ( java.lang.Object ) ; Expression org.springframework.integration.event.config.Expression = ( Expression ) org.springframework.integration.event.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; Assert . assertEquals ( STRING , org.springframework.integration.event.config.Expression . getExpressionString ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertSame ( org.springframework.integration.event.config.MessageChannel , TestUtils . getPropertyValue ( org.springframework.integration.event.config.ApplicationEventListeningMessageProducer , STRING ) ) ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.Object java.lang.Object ) { super( java.lang.Object ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.Object java.lang.Object ) { super( java.lang.Object ); }  <METHOD_END>