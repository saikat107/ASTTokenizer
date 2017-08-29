<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.integration.gateway.GatewayMethodInboundMessageMapperToMessageTests.TestService .class . java.lang.reflect.Method ( STRING , java.lang.String .class ) ; GatewayMethodInboundMessageMapper org.springframework.integration.gateway.GatewayMethodInboundMessageMapper = new GatewayMethodInboundMessageMapper ( java.lang.reflect.Method ) ; org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . setBeanFactory ( mock ( BeanFactory .class ) ) ; Message < ? > org.springframework.integration.gateway.Message<?> = org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . toMessage ( new java.lang.Object [] { STRING } ) ; assertEquals ( STRING , org.springframework.integration.gateway.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.integration.gateway.GatewayMethodInboundMessageMapperToMessageTests.TestService .class . java.lang.reflect.Method ( STRING , java.lang.String .class ) ; GatewayMethodInboundMessageMapper org.springframework.integration.gateway.GatewayMethodInboundMessageMapper = new GatewayMethodInboundMessageMapper ( java.lang.reflect.Method ) ; org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . toMessage ( new java.lang.Object [] { STRING , STRING } ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.integration.gateway.GatewayMethodInboundMessageMapperToMessageTests.TestService .class . java.lang.reflect.Method ( STRING , java.lang.String .class ) ; GatewayMethodInboundMessageMapper org.springframework.integration.gateway.GatewayMethodInboundMessageMapper = new GatewayMethodInboundMessageMapper ( java.lang.reflect.Method ) ; org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . toMessage ( new java.lang.Object [] {} ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.integration.gateway.GatewayMethodInboundMessageMapperToMessageTests.TestService .class . java.lang.reflect.Method ( STRING , java.lang.String .class , java.lang.String .class ) ; GatewayMethodInboundMessageMapper org.springframework.integration.gateway.GatewayMethodInboundMessageMapper = new GatewayMethodInboundMessageMapper ( java.lang.reflect.Method ) ; org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . setBeanFactory ( mock ( BeanFactory .class ) ) ; Message < ? > org.springframework.integration.gateway.Message<?> = org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . toMessage ( new java.lang.Object [] { STRING , STRING } ) ; assertEquals ( STRING , org.springframework.integration.gateway.Message<> . getPayload ( ) ) ; assertEquals ( STRING , org.springframework.integration.gateway.Message<> . getHeaders ( ) . get ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = MessageMappingException .class ) public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.integration.gateway.GatewayMethodInboundMessageMapperToMessageTests.TestService .class . java.lang.reflect.Method ( STRING , java.lang.String .class , java.lang.String .class ) ; GatewayMethodInboundMessageMapper org.springframework.integration.gateway.GatewayMethodInboundMessageMapper = new GatewayMethodInboundMessageMapper ( java.lang.reflect.Method ) ; org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . toMessage ( new java.lang.Object [] { STRING , null } ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.integration.gateway.GatewayMethodInboundMessageMapperToMessageTests.TestService .class . java.lang.reflect.Method ( STRING , java.lang.String .class , java.lang.String .class ) ; GatewayMethodInboundMessageMapper org.springframework.integration.gateway.GatewayMethodInboundMessageMapper = new GatewayMethodInboundMessageMapper ( java.lang.reflect.Method ) ; org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . setBeanFactory ( mock ( BeanFactory .class ) ) ; Message < ? > org.springframework.integration.gateway.Message<?> = org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . toMessage ( new java.lang.Object [] { STRING , STRING } ) ; assertEquals ( STRING , org.springframework.integration.gateway.Message<> . getPayload ( ) ) ; assertEquals ( STRING , org.springframework.integration.gateway.Message<> . getHeaders ( ) . get ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.integration.gateway.GatewayMethodInboundMessageMapperToMessageTests.TestService .class . java.lang.reflect.Method ( STRING , java.lang.String .class , java.lang.String .class ) ; GatewayMethodInboundMessageMapper org.springframework.integration.gateway.GatewayMethodInboundMessageMapper = new GatewayMethodInboundMessageMapper ( java.lang.reflect.Method ) ; org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . setBeanFactory ( mock ( BeanFactory .class ) ) ; Message < ? > org.springframework.integration.gateway.Message<?> = org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . toMessage ( new java.lang.Object [] { STRING , null } ) ; assertEquals ( STRING , org.springframework.integration.gateway.Message<> . getPayload ( ) ) ; assertNull ( org.springframework.integration.gateway.Message<> . getHeaders ( ) . get ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.integration.gateway.GatewayMethodInboundMessageMapperToMessageTests.TestService .class . java.lang.reflect.Method ( STRING , java.lang.String .class , java.util.Map .class ) ; GatewayMethodInboundMessageMapper org.springframework.integration.gateway.GatewayMethodInboundMessageMapper = new GatewayMethodInboundMessageMapper ( java.lang.reflect.Method ) ; org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . setBeanFactory ( mock ( BeanFactory .class ) ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ( ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , NUMBER ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , NUMBER ) ; Message < ? > org.springframework.integration.gateway.Message<?> = org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . toMessage ( new java.lang.Object [] { STRING , java.util.Map<java.lang.String,java.lang.Object> } ) ; assertEquals ( STRING , org.springframework.integration.gateway.Message<> . getPayload ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.gateway.Message<> . getHeaders ( ) . get ( STRING ) ) ; assertEquals ( NUMBER , org.springframework.integration.gateway.Message<> . getHeaders ( ) . get ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.integration.gateway.GatewayMethodInboundMessageMapperToMessageTests.TestService .class . java.lang.reflect.Method ( STRING , java.lang.String .class , java.util.Map .class ) ; GatewayMethodInboundMessageMapper org.springframework.integration.gateway.GatewayMethodInboundMessageMapper = new GatewayMethodInboundMessageMapper ( java.lang.reflect.Method ) ; org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . setBeanFactory ( mock ( BeanFactory .class ) ) ; Message < ? > org.springframework.integration.gateway.Message<?> = org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . toMessage ( new java.lang.Object [] { STRING , null } ) ; assertEquals ( STRING , org.springframework.integration.gateway.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = MessageMappingException .class ) public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.integration.gateway.GatewayMethodInboundMessageMapperToMessageTests.TestService .class . java.lang.reflect.Method ( STRING , java.lang.String .class , java.util.Map .class ) ; GatewayMethodInboundMessageMapper org.springframework.integration.gateway.GatewayMethodInboundMessageMapper = new GatewayMethodInboundMessageMapper ( java.lang.reflect.Method ) ; org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . setBeanFactory ( mock ( BeanFactory .class ) ) ; java.util.Map<java.lang.Integer,java.lang.String> < java.lang.Integer , java.lang.String > java.util.Map<java.lang.Integer,java.lang.String> = new java.util.HashMap<java.lang.Integer,java.lang.String> < java.lang.Integer , java.lang.String > ( ) ; java.util.Map<java.lang.Integer,java.lang.String> . java.lang.String ( NUMBER , STRING ) ; org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . toMessage ( new java.lang.Object [] { STRING , java.util.Map<java.lang.Integer,java.lang.String> } ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.integration.gateway.GatewayMethodInboundMessageMapperToMessageTests.TestService .class . java.lang.reflect.Method ( STRING , Message .class ) ; GatewayMethodInboundMessageMapper org.springframework.integration.gateway.GatewayMethodInboundMessageMapper = new GatewayMethodInboundMessageMapper ( java.lang.reflect.Method ) ; org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . setBeanFactory ( mock ( BeanFactory .class ) ) ; Message < ? > org.springframework.integration.gateway.Message<?> = MessageBuilder . withPayload ( STRING ) . build ( ) ; Message < ? > org.springframework.integration.gateway.Message<?> = org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . toMessage ( new java.lang.Object [] { org.springframework.integration.gateway.Message<> } ) ; assertEquals ( STRING , org.springframework.integration.gateway.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.integration.gateway.GatewayMethodInboundMessageMapperToMessageTests.TestService .class . java.lang.reflect.Method ( STRING , Message .class , java.lang.String .class ) ; GatewayMethodInboundMessageMapper org.springframework.integration.gateway.GatewayMethodInboundMessageMapper = new GatewayMethodInboundMessageMapper ( java.lang.reflect.Method ) ; org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . setBeanFactory ( mock ( BeanFactory .class ) ) ; Message < ? > org.springframework.integration.gateway.Message<?> = MessageBuilder . withPayload ( STRING ) . build ( ) ; Message < ? > org.springframework.integration.gateway.Message<?> = org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . toMessage ( new java.lang.Object [] { org.springframework.integration.gateway.Message<> , STRING } ) ; assertEquals ( STRING , org.springframework.integration.gateway.Message<> . getPayload ( ) ) ; assertEquals ( STRING , org.springframework.integration.gateway.Message<> . getHeaders ( ) . get ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = MessageMappingException .class ) public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.integration.gateway.GatewayMethodInboundMessageMapperToMessageTests.TestService .class . java.lang.reflect.Method ( STRING , Message .class , java.lang.String .class ) ; GatewayMethodInboundMessageMapper org.springframework.integration.gateway.GatewayMethodInboundMessageMapper = new GatewayMethodInboundMessageMapper ( java.lang.reflect.Method ) ; org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . setBeanFactory ( mock ( BeanFactory .class ) ) ; Message < ? > org.springframework.integration.gateway.Message<?> = MessageBuilder . withPayload ( STRING ) . build ( ) ; org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . toMessage ( new java.lang.Object [] { org.springframework.integration.gateway.Message<> , null } ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.integration.gateway.GatewayMethodInboundMessageMapperToMessageTests.TestService .class . java.lang.reflect.Method ( STRING , Message .class , java.lang.String .class ) ; GatewayMethodInboundMessageMapper org.springframework.integration.gateway.GatewayMethodInboundMessageMapper = new GatewayMethodInboundMessageMapper ( java.lang.reflect.Method ) ; org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . setBeanFactory ( mock ( BeanFactory .class ) ) ; Message < ? > org.springframework.integration.gateway.Message<?> = MessageBuilder . withPayload ( STRING ) . build ( ) ; Message < ? > org.springframework.integration.gateway.Message<?> = org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . toMessage ( new java.lang.Object [] { org.springframework.integration.gateway.Message<> , STRING } ) ; assertEquals ( STRING , org.springframework.integration.gateway.Message<> . getPayload ( ) ) ; assertEquals ( STRING , org.springframework.integration.gateway.Message<> . getHeaders ( ) . get ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.integration.gateway.GatewayMethodInboundMessageMapperToMessageTests.TestService .class . java.lang.reflect.Method ( STRING , Message .class , java.lang.String .class ) ; GatewayMethodInboundMessageMapper org.springframework.integration.gateway.GatewayMethodInboundMessageMapper = new GatewayMethodInboundMessageMapper ( java.lang.reflect.Method ) ; org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . setBeanFactory ( mock ( BeanFactory .class ) ) ; Message < ? > org.springframework.integration.gateway.Message<?> = MessageBuilder . withPayload ( STRING ) . build ( ) ; Message < ? > org.springframework.integration.gateway.Message<?> = org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . toMessage ( new java.lang.Object [] { org.springframework.integration.gateway.Message<> , null } ) ; assertEquals ( STRING , org.springframework.integration.gateway.Message<> . getPayload ( ) ) ; assertNull ( org.springframework.integration.gateway.Message<> . getHeaders ( ) . get ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = MessageMappingException .class ) public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.integration.gateway.GatewayMethodInboundMessageMapperToMessageTests.TestService .class . java.lang.reflect.Method ( STRING , new java.lang.Class<?> < ? > [] {} ) ; GatewayMethodInboundMessageMapper org.springframework.integration.gateway.GatewayMethodInboundMessageMapper = new GatewayMethodInboundMessageMapper ( java.lang.reflect.Method ) ; org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . toMessage ( new java.lang.Object [] {} ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = MessageMappingException .class ) public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.integration.gateway.GatewayMethodInboundMessageMapperToMessageTests.TestService .class . java.lang.reflect.Method ( STRING , java.lang.String .class , java.lang.String .class ) ; GatewayMethodInboundMessageMapper org.springframework.integration.gateway.GatewayMethodInboundMessageMapper = new GatewayMethodInboundMessageMapper ( java.lang.reflect.Method ) ; org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . toMessage ( new java.lang.Object [] { STRING , STRING } ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.integration.gateway.GatewayMethodInboundMessageMapperToMessageTests.TestService .class . java.lang.reflect.Method ( STRING , java.lang.String .class ) ; java.util.Map<java.lang.String,org.springframework.integration.gateway.Expression> < java.lang.String , Expression > java.util.Map<java.lang.String,org.springframework.integration.gateway.Expression> = new java.util.HashMap<java.lang.String,org.springframework.integration.gateway.Expression> < java.lang.String , Expression > ( ) ; java.util.Map<java.lang.String,org.springframework.integration.gateway.Expression> . put ( STRING , new LiteralExpression ( STRING ) ) ; java.util.Map<java.lang.String,org.springframework.integration.gateway.Expression> . put ( STRING , new SpelExpressionParser ( ) . parseExpression ( STRING ) ) ; java.util.Map<java.lang.String,org.springframework.integration.gateway.Expression> . put ( STRING , new LiteralExpression ( STRING ) ) ; GatewayMethodInboundMessageMapper org.springframework.integration.gateway.GatewayMethodInboundMessageMapper = new GatewayMethodInboundMessageMapper ( java.lang.reflect.Method , java.util.Map<java.lang.String,org.springframework.integration.gateway.Expression> ) ; org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . setBeanFactory ( mock ( BeanFactory .class ) ) ; Message < ? > org.springframework.integration.gateway.Message<?> = org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . toMessage ( new java.lang.Object [] { STRING } ) ; assertEquals ( STRING , org.springframework.integration.gateway.Message<> . getPayload ( ) ) ; assertEquals ( STRING , org.springframework.integration.gateway.Message<> . getHeaders ( ) . get ( STRING ) ) ; assertEquals ( NUMBER , org.springframework.integration.gateway.Message<> . getHeaders ( ) . get ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.integration.gateway.GatewayMethodInboundMessageMapperToMessageTests.TestService .class . java.lang.reflect.Method ( STRING , java.util.Map .class ) ; java.util.Map<java.lang.Integer,java.lang.Object> < java.lang.Integer , java.lang.Object > java.util.Map<java.lang.Integer,java.lang.Object> = new java.util.HashMap<java.lang.Integer,java.lang.Object> < java.lang.Integer , java.lang.Object > ( ) ; java.util.Map<java.lang.Integer,java.lang.Object> . java.lang.Object ( NUMBER , STRING ) ; java.util.Map<java.lang.Integer,java.lang.Object> . java.lang.Object ( NUMBER , STRING ) ; GatewayMethodInboundMessageMapper org.springframework.integration.gateway.GatewayMethodInboundMessageMapper = new GatewayMethodInboundMessageMapper ( java.lang.reflect.Method ) ; org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . setPayloadExpression ( STRING ) ; Message < ? > org.springframework.integration.gateway.Message<?> = org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . toMessage ( new java.lang.Object [] { java.util.Map<java.lang.Integer,java.lang.Object> } ) ; assertEquals ( STRING , org.springframework.integration.gateway.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.integration.gateway.GatewayMethodInboundMessageMapperToMessageTests.TestService .class . java.lang.reflect.Method ( STRING , java.util.Map .class ) ; java.util.Map<java.lang.Integer,java.lang.Object> < java.lang.Integer , java.lang.Object > java.util.Map<java.lang.Integer,java.lang.Object> = new java.util.HashMap<java.lang.Integer,java.lang.Object> < java.lang.Integer , java.lang.Object > ( ) ; java.util.Map<java.lang.Integer,java.lang.Object> . java.lang.Object ( NUMBER , STRING ) ; java.util.Map<java.lang.Integer,java.lang.Object> . java.lang.Object ( NUMBER , STRING ) ; GatewayMethodInboundMessageMapper org.springframework.integration.gateway.GatewayMethodInboundMessageMapper = new GatewayMethodInboundMessageMapper ( java.lang.reflect.Method ) ; org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . setPayloadExpression ( STRING ) ; Message < ? > org.springframework.integration.gateway.Message<?> = org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . toMessage ( new java.lang.Object [] { java.util.Map<java.lang.Integer,java.lang.Object> } ) ; assertEquals ( java.util.Map<java.lang.Integer,java.lang.Object> , org.springframework.integration.gateway.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.integration.gateway.GatewayMethodInboundMessageMapperToMessageTests.TestService .class . java.lang.reflect.Method ( STRING , java.util.Map .class ) ; java.util.Map<java.lang.Integer,java.lang.Object> < java.lang.Integer , java.lang.Object > java.util.Map<java.lang.Integer,java.lang.Object> = new java.util.HashMap<java.lang.Integer,java.lang.Object> < java.lang.Integer , java.lang.Object > ( ) ; java.util.Map<java.lang.Integer,java.lang.Object> . java.lang.Object ( NUMBER , STRING ) ; java.util.Map<java.lang.Integer,java.lang.Object> . java.lang.Object ( NUMBER , STRING ) ; GatewayMethodInboundMessageMapper org.springframework.integration.gateway.GatewayMethodInboundMessageMapper = new GatewayMethodInboundMessageMapper ( java.lang.reflect.Method ) ; org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . setBeanFactory ( mock ( BeanFactory .class ) ) ; Message < ? > org.springframework.integration.gateway.Message<?> = org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . toMessage ( new java.lang.Object [] { java.util.Map<java.lang.Integer,java.lang.Object> } ) ; assertEquals ( java.util.Map<java.lang.Integer,java.lang.Object> , org.springframework.integration.gateway.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.integration.gateway.GatewayMethodInboundMessageMapperToMessageTests.TestService .class . java.lang.reflect.Method ( STRING , java.util.Map .class , java.util.Map .class ) ; java.util.Map<java.lang.Integer,java.lang.Object> < java.lang.Integer , java.lang.Object > java.util.Map<java.lang.Integer,java.lang.Object> = new java.util.HashMap<java.lang.Integer,java.lang.Object> < java.lang.Integer , java.lang.Object > ( ) ; java.util.Map<java.lang.Integer,java.lang.Object> . java.lang.Object ( NUMBER , STRING ) ; java.util.Map<java.lang.Integer,java.lang.Object> . java.lang.Object ( NUMBER , STRING ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ( ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; GatewayMethodInboundMessageMapper org.springframework.integration.gateway.GatewayMethodInboundMessageMapper = new GatewayMethodInboundMessageMapper ( java.lang.reflect.Method ) ; org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . setPayloadExpression ( STRING ) ; Message < ? > org.springframework.integration.gateway.Message<?> = org.springframework.integration.gateway.GatewayMethodInboundMessageMapper . toMessage ( new java.lang.Object [] { java.util.Map<java.lang.Integer,java.lang.Object> , java.util.Map<java.lang.String,java.lang.Object> } ) ; assertEquals ( java.util.Map<java.lang.Integer,java.lang.Object> , org.springframework.integration.gateway.Message<> . getPayload ( ) ) ; assertEquals ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) , org.springframework.integration.gateway.Message<> . getHeaders ( ) . get ( STRING ) ) ; assertEquals ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) , org.springframework.integration.gateway.Message<> . getHeaders ( ) . get ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> void void ( java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> void void ( java.lang.String java.lang.String , @ Header ( STRING ) java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> void void ( java.lang.String java.lang.String , @ Header ( value = STRING , required = false ) java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> void void ( java.lang.String java.lang.String , @ Headers java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> );  <METHOD_END>
<METHOD_START> void void ( Message < ? > org.springframework.integration.gateway.Message<?> );  <METHOD_END>
<METHOD_START> void void ( Message < ? > org.springframework.integration.gateway.Message<?> , @ Header ( STRING ) java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> void void ( Message < ? > org.springframework.integration.gateway.Message<?> , @ Header ( value = STRING , required = false ) java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> void void ( )  <METHOD_END>
<METHOD_START> void void ( @ Header ( STRING ) java.lang.String java.lang.String , @ Header ( STRING ) java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> void void ( java.util.Map<java.lang.Integer,java.lang.Object> < java.lang.Integer , java.lang.Object > java.util.Map<java.lang.Integer,java.lang.Object> );  <METHOD_END>
<METHOD_START> @ Payload ( STRING ) void void ( java.util.Map<java.lang.Integer,java.lang.Object> < java.lang.Integer , java.lang.Object > java.util.Map<java.lang.Integer,java.lang.Object> );  <METHOD_END>
<METHOD_START> void void ( java.util.Map<java.lang.Integer,java.lang.Object> < java.lang.Integer , java.lang.Object > java.util.Map<java.lang.Integer,java.lang.Object> , java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> );  <METHOD_END>