<METHOD_START> @ Test public void void ( ) { DirectChannel org.springframework.integration.gateway.DirectChannel = new DirectChannel ( ) ; DirectChannel org.springframework.integration.gateway.DirectChannel = new DirectChannel ( ) ; org.springframework.integration.gateway.DirectChannel . subscribe ( new AbstractReplyProducingMessageHandler ( ) { @ java.lang.Override protected java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.gateway.Message<?> ) { return org.springframework.integration.gateway.Message<> . getPayload ( ) + STRING ; } } ) ; final MessagingGatewaySupport org.springframework.integration.gateway.MessagingGatewaySupport = new MessagingGatewaySupport ( ) { } ; org.springframework.integration.gateway.MessagingGatewaySupport . setRequestChannel ( org.springframework.integration.gateway.DirectChannel ) ; org.springframework.integration.gateway.MessagingGatewaySupport . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.gateway.MessagingGatewaySupport . afterPropertiesSet ( ) ; org.springframework.integration.gateway.DirectChannel . subscribe ( new AbstractReplyProducingMessageHandler ( ) { @ java.lang.Override protected java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.gateway.Message<?> ) { return org.springframework.integration.gateway.MessagingGatewaySupport . sendAndReceiveMessage ( STRING + org.springframework.integration.gateway.Message<> . getPayload ( ) ) . getPayload ( ) + STRING ; } } ) ; MessagingGatewaySupport org.springframework.integration.gateway.MessagingGatewaySupport = new MessagingGatewaySupport ( ) { } ; org.springframework.integration.gateway.MessagingGatewaySupport . setRequestChannel ( org.springframework.integration.gateway.DirectChannel ) ; org.springframework.integration.gateway.MessagingGatewaySupport . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.gateway.MessagingGatewaySupport . afterPropertiesSet ( ) ; Message < ? > org.springframework.integration.gateway.Message<?> = org.springframework.integration.gateway.MessagingGatewaySupport . sendAndReceiveMessage ( STRING ) ; assertEquals ( STRING , org.springframework.integration.gateway.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.gateway.Message<?> ) { return org.springframework.integration.gateway.Message<> . getPayload ( ) + STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.gateway.Message<?> ) { return org.springframework.integration.gateway.MessagingGatewaySupport . sendAndReceiveMessage ( STRING + org.springframework.integration.gateway.Message<> . getPayload ( ) ) . getPayload ( ) + STRING ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DirectChannel org.springframework.integration.gateway.DirectChannel = new DirectChannel ( ) ; DirectChannel org.springframework.integration.gateway.DirectChannel = new DirectChannel ( ) ; org.springframework.integration.gateway.DirectChannel . subscribe ( new AbstractReplyProducingMessageHandler ( ) { @ java.lang.Override protected java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.gateway.Message<?> ) { return org.springframework.integration.gateway.Message<> . getPayload ( ) + STRING ; } } ) ; MessagingGatewaySupport org.springframework.integration.gateway.MessagingGatewaySupport = new MessagingGatewaySupport ( ) { } ; org.springframework.integration.gateway.MessagingGatewaySupport . setRequestChannel ( org.springframework.integration.gateway.DirectChannel ) ; org.springframework.integration.gateway.MessagingGatewaySupport . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.gateway.MessagingGatewaySupport . afterPropertiesSet ( ) ; Message < ? > org.springframework.integration.gateway.Message<?> = MessageBuilder . withPayload ( STRING ) . setReplyChannel ( org.springframework.integration.gateway.DirectChannel ) . build ( ) ; Message < ? > org.springframework.integration.gateway.Message<?> = org.springframework.integration.gateway.MessagingGatewaySupport . sendAndReceiveMessage ( org.springframework.integration.gateway.Message<> ) ; assertEquals ( STRING , org.springframework.integration.gateway.Message<> . getPayload ( ) ) ; assertEquals ( org.springframework.integration.gateway.DirectChannel , org.springframework.integration.gateway.Message<> . getHeaders ( ) . getReplyChannel ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.gateway.Message<?> ) { return org.springframework.integration.gateway.Message<> . getPayload ( ) + STRING ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DirectChannel org.springframework.integration.gateway.DirectChannel = new DirectChannel ( ) ; DirectChannel org.springframework.integration.gateway.DirectChannel = new DirectChannel ( ) ; org.springframework.integration.gateway.DirectChannel . subscribe ( new AbstractReplyProducingMessageHandler ( ) { @ java.lang.Override protected java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.gateway.Message<?> ) { return org.springframework.integration.gateway.Message<> . getPayload ( ) + STRING ; } } ) ; MessagingGatewaySupport org.springframework.integration.gateway.MessagingGatewaySupport = new MessagingGatewaySupport ( ) { } ; org.springframework.integration.gateway.MessagingGatewaySupport . setRequestChannel ( org.springframework.integration.gateway.DirectChannel ) ; org.springframework.integration.gateway.MessagingGatewaySupport . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.gateway.MessagingGatewaySupport . afterPropertiesSet ( ) ; Message < ? > org.springframework.integration.gateway.Message<?> = MessageBuilder . withPayload ( STRING ) . setErrorChannel ( org.springframework.integration.gateway.DirectChannel ) . build ( ) ; Message < ? > org.springframework.integration.gateway.Message<?> = org.springframework.integration.gateway.MessagingGatewaySupport . sendAndReceiveMessage ( org.springframework.integration.gateway.Message<> ) ; assertEquals ( STRING , org.springframework.integration.gateway.Message<> . getPayload ( ) ) ; assertEquals ( org.springframework.integration.gateway.DirectChannel , org.springframework.integration.gateway.Message<> . getHeaders ( ) . getErrorChannel ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.gateway.Message<?> ) { return org.springframework.integration.gateway.Message<> . getPayload ( ) + STRING ; }  <METHOD_END>