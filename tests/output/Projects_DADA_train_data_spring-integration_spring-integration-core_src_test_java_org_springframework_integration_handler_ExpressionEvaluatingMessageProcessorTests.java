<METHOD_START> @ java.lang.SuppressWarnings ( { STRING , STRING } ) @ Test public void void ( ) { Expression org.springframework.integration.handler.Expression = org.springframework.integration.handler.ExpressionParser . parseExpression ( STRING ) ; ExpressionEvaluatingMessageProcessor org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor = new ExpressionEvaluatingMessageProcessor ( org.springframework.integration.handler.Expression ) ; org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor . setBeanFactory ( mock ( BeanFactory .class ) ) ; assertEquals ( STRING , org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor . processMessage ( new GenericMessage < java.lang.String > ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( { STRING , STRING } ) @ Test public void void ( ) java.lang.Exception { @ java.lang.SuppressWarnings ( STRING ) class TestTarget { public java.lang.String java.lang.String ( int int ) { return int + STRING ; } } Expression org.springframework.integration.handler.Expression = org.springframework.integration.handler.ExpressionParser . parseExpression ( STRING ) ; ExpressionEvaluatingMessageProcessor org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor = new ExpressionEvaluatingMessageProcessor ( org.springframework.integration.handler.Expression ) ; org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor . afterPropertiesSet ( ) ; EvaluationContext org.springframework.integration.handler.EvaluationContext = TestUtils . getPropertyValue ( org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor , STRING , EvaluationContext .class ) ; org.springframework.integration.handler.EvaluationContext . setVariable ( STRING , new TestTarget ( ) ) ; assertEquals ( STRING , org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor . processMessage ( new GenericMessage < java.lang.String > ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( int int ) { return int + STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( { STRING , STRING } ) @ Test public void void ( ) java.lang.Exception { @ java.lang.SuppressWarnings ( STRING ) class TestTarget { public void void ( java.lang.String java.lang.String ) {			} } Expression org.springframework.integration.handler.Expression = org.springframework.integration.handler.ExpressionParser . parseExpression ( STRING ) ; ExpressionEvaluatingMessageProcessor org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor = new ExpressionEvaluatingMessageProcessor ( org.springframework.integration.handler.Expression ) ; org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor . afterPropertiesSet ( ) ; EvaluationContext org.springframework.integration.handler.EvaluationContext = TestUtils . getPropertyValue ( org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor , STRING , EvaluationContext .class ) ; org.springframework.integration.handler.EvaluationContext . setVariable ( STRING , new TestTarget ( ) ) ; assertEquals ( null , org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor . processMessage ( new GenericMessage < java.lang.String > ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) {			}  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( { STRING , STRING } ) @ Test public void void ( ) java.lang.Exception { class TestTarget { @ java.lang.SuppressWarnings ( STRING ) public java.lang.String java.lang.String ( Resource [] org.springframework.integration.handler.Resource[] ) { return java.util.Arrays . java.util.List ( org.springframework.integration.handler.Resource[] ) . toString ( ) ; } } Expression org.springframework.integration.handler.Expression = org.springframework.integration.handler.ExpressionParser . parseExpression ( STRING ) ; ExpressionEvaluatingMessageProcessor org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor = new ExpressionEvaluatingMessageProcessor ( org.springframework.integration.handler.Expression ) ; AbstractApplicationContext org.springframework.integration.handler.AbstractApplicationContext = new GenericApplicationContext ( ) ; org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor . setBeanFactory ( org.springframework.integration.handler.AbstractApplicationContext ) ; IntegrationEvaluationContextFactoryBean org.springframework.integration.handler.IntegrationEvaluationContextFactoryBean = new IntegrationEvaluationContextFactoryBean ( ) ; org.springframework.integration.handler.IntegrationEvaluationContextFactoryBean . setApplicationContext ( org.springframework.integration.handler.AbstractApplicationContext ) ; org.springframework.integration.handler.AbstractApplicationContext . getBeanFactory ( ) . registerSingleton ( IntegrationContextUtils . INTEGRATION_EVALUATION_CONTEXT_BEAN_NAME , org.springframework.integration.handler.IntegrationEvaluationContextFactoryBean . getObject ( ) ) ; org.springframework.integration.handler.AbstractApplicationContext . refresh ( ) ; org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor . afterPropertiesSet ( ) ; EvaluationContext org.springframework.integration.handler.EvaluationContext = TestUtils . getPropertyValue ( org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor , STRING , EvaluationContext .class ) ; org.springframework.integration.handler.EvaluationContext . setVariable ( STRING , new TestTarget ( ) ) ; java.lang.String java.lang.String = ( java.lang.String ) org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor . processMessage ( new GenericMessage < java.lang.String > ( STRING ) ) ; assertTrue ( STRING + java.lang.String , java.lang.String . boolean ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public java.lang.String java.lang.String ( Resource [] org.springframework.integration.handler.Resource[] ) { return java.util.Arrays . java.util.List ( org.springframework.integration.handler.Resource[] ) . toString ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( { STRING , STRING } ) @ Test public void void ( ) { Expression org.springframework.integration.handler.Expression = org.springframework.integration.handler.ExpressionParser . parseExpression ( STRING ) ; ExpressionEvaluatingMessageProcessor org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor = new ExpressionEvaluatingMessageProcessor ( org.springframework.integration.handler.Expression ) ; org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor . setBeanFactory ( mock ( BeanFactory .class ) ) ; Message < java.lang.String > org.springframework.integration.handler.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . setHeader ( STRING , STRING ) . build ( ) ; assertEquals ( STRING , org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor . processMessage ( org.springframework.integration.handler.Message<java.lang.String> ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( { STRING , STRING } ) @ Test public void void ( ) { Expression org.springframework.integration.handler.Expression = org.springframework.integration.handler.ExpressionParser . parseExpression ( STRING ) ; ExpressionEvaluatingMessageProcessor org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor = new ExpressionEvaluatingMessageProcessor ( org.springframework.integration.handler.Expression ) ; org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor . setBeanFactory ( mock ( BeanFactory .class ) ) ; Message < java.lang.String > org.springframework.integration.handler.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . setHeader ( STRING , STRING ) . build ( ) ; assertEquals ( STRING , org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor . processMessage ( org.springframework.integration.handler.Message<java.lang.String> ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( { STRING , STRING } ) @ Test public void void ( ) { Expression org.springframework.integration.handler.Expression = org.springframework.integration.handler.ExpressionParser . parseExpression ( STRING ) ; ExpressionEvaluatingMessageProcessor org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor = new ExpressionEvaluatingMessageProcessor ( org.springframework.integration.handler.Expression ) ; org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor . setBeanFactory ( mock ( BeanFactory .class ) ) ; GenericMessage < java.lang.String > org.springframework.integration.handler.GenericMessage<java.lang.String> = new GenericMessage < java.lang.String > ( STRING ) ; assertEquals ( org.springframework.integration.handler.GenericMessage<java.lang.String> . getHeaders ( ) . getId ( ) , org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor . processMessage ( org.springframework.integration.handler.GenericMessage<java.lang.String> ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( { STRING , STRING } ) @ Test public void void ( ) java.lang.Exception { StaticApplicationContext org.springframework.integration.handler.StaticApplicationContext = new StaticApplicationContext ( ) ; BeanDefinition org.springframework.integration.handler.BeanDefinition = new RootBeanDefinition ( java.lang.String .class ) ; org.springframework.integration.handler.BeanDefinition . getConstructorArgumentValues ( ) . addGenericArgumentValue ( STRING ) ; org.springframework.integration.handler.StaticApplicationContext . registerBeanDefinition ( STRING , org.springframework.integration.handler.BeanDefinition ) ; org.springframework.integration.handler.StaticApplicationContext . registerBeanDefinition ( IntegrationContextUtils . INTEGRATION_EVALUATION_CONTEXT_BEAN_NAME , new RootBeanDefinition ( IntegrationEvaluationContextFactoryBean .class ) ) ; org.springframework.integration.handler.StaticApplicationContext . refresh ( ) ; Expression org.springframework.integration.handler.Expression = org.springframework.integration.handler.ExpressionParser . parseExpression ( STRING ) ; ExpressionEvaluatingMessageProcessor org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor = new ExpressionEvaluatingMessageProcessor ( org.springframework.integration.handler.Expression ) ; org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor . setBeanFactory ( org.springframework.integration.handler.StaticApplicationContext ) ; org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor . afterPropertiesSet ( ) ; GenericMessage < java.lang.String > org.springframework.integration.handler.GenericMessage<java.lang.String> = new GenericMessage < java.lang.String > ( STRING ) ; assertEquals ( STRING , org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor . processMessage ( org.springframework.integration.handler.GenericMessage<java.lang.String> ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( { STRING , STRING } ) @ Test public void void ( ) java.lang.Exception { StaticApplicationContext org.springframework.integration.handler.StaticApplicationContext = new StaticApplicationContext ( ) ; BeanDefinition org.springframework.integration.handler.BeanDefinition = new RootBeanDefinition ( java.lang.String .class ) ; org.springframework.integration.handler.BeanDefinition . getConstructorArgumentValues ( ) . addGenericArgumentValue ( STRING ) ; org.springframework.integration.handler.StaticApplicationContext . registerBeanDefinition ( IntegrationContextUtils . INTEGRATION_EVALUATION_CONTEXT_BEAN_NAME , new RootBeanDefinition ( IntegrationEvaluationContextFactoryBean .class ) ) ; org.springframework.integration.handler.StaticApplicationContext . registerBeanDefinition ( STRING , org.springframework.integration.handler.BeanDefinition ) ; org.springframework.integration.handler.StaticApplicationContext . refresh ( ) ; Expression org.springframework.integration.handler.Expression = org.springframework.integration.handler.ExpressionParser . parseExpression ( STRING ) ; ExpressionEvaluatingMessageProcessor org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor = new ExpressionEvaluatingMessageProcessor ( org.springframework.integration.handler.Expression ) ; org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor . setBeanFactory ( org.springframework.integration.handler.StaticApplicationContext ) ; org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor . afterPropertiesSet ( ) ; GenericMessage < java.lang.String > org.springframework.integration.handler.GenericMessage<java.lang.String> = new GenericMessage < java.lang.String > ( STRING ) ; assertEquals ( STRING , org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor . processMessage ( org.springframework.integration.handler.GenericMessage<java.lang.String> ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( { STRING , STRING } ) @ Test public void void ( ) { org.springframework.integration.handler.ExpectedException . expect ( new TypeSafeMatcher < java.lang.Exception > ( java.lang.Exception .class ) { private java.lang.Throwable java.lang.Throwable ; @ java.lang.Override public boolean boolean ( java.lang.Exception java.lang.Exception ) { org.springframework.integration.handler.Log . debug ( java.lang.Exception ) ; java.lang.Throwable = java.lang.Exception . java.lang.Throwable ( ) ; return java.lang.Throwable instanceof EvaluationException ; } @ java.lang.Override public void void ( Description org.springframework.integration.handler.Description ) { org.springframework.integration.handler.Description . appendText ( STRING ) . appendValue ( java.lang.Throwable ) ; } } ) ; Expression org.springframework.integration.handler.Expression = org.springframework.integration.handler.ExpressionParser . parseExpression ( STRING ) ; ExpressionEvaluatingMessageProcessor org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor = new ExpressionEvaluatingMessageProcessor ( org.springframework.integration.handler.Expression ) ; org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor . setBeanFactory ( mock ( BeanFactory .class ) ) ; assertEquals ( STRING , org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor . processMessage ( new GenericMessage < java.lang.String > ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Exception java.lang.Exception ) { org.springframework.integration.handler.Log . debug ( java.lang.Exception ) ; java.lang.Throwable = java.lang.Exception . java.lang.Throwable ( ) ; return java.lang.Throwable instanceof EvaluationException ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Description org.springframework.integration.handler.Description ) { org.springframework.integration.handler.Description . appendText ( STRING ) . appendValue ( java.lang.Throwable ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( { STRING , STRING } ) @ Test public void void ( ) { org.springframework.integration.handler.ExpectedException . expect ( new TypeSafeMatcher < java.lang.Exception > ( java.lang.Exception .class ) { private java.lang.Throwable java.lang.Throwable ; @ java.lang.Override public boolean boolean ( java.lang.Exception java.lang.Exception ) { org.springframework.integration.handler.Log . debug ( java.lang.Exception ) ; java.lang.Throwable = java.lang.Exception . java.lang.Throwable ( ) ; return java.lang.Throwable instanceof java.lang.UnsupportedOperationException ; } @ java.lang.Override public void void ( Description org.springframework.integration.handler.Description ) { org.springframework.integration.handler.Description . appendText ( STRING ) . appendValue ( java.lang.Throwable ) ; } } ) ; Expression org.springframework.integration.handler.Expression = org.springframework.integration.handler.ExpressionParser . parseExpression ( STRING ) ; ExpressionEvaluatingMessageProcessor org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor = new ExpressionEvaluatingMessageProcessor ( org.springframework.integration.handler.Expression ) ; org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor . setBeanFactory ( mock ( BeanFactory .class ) ) ; assertEquals ( STRING , org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor . processMessage ( new GenericMessage < org.springframework.integration.handler.ExpressionEvaluatingMessageProcessorTests.TestPayload > ( new org.springframework.integration.handler.ExpressionEvaluatingMessageProcessorTests.TestPayload ( ) ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Exception java.lang.Exception ) { org.springframework.integration.handler.Log . debug ( java.lang.Exception ) ; java.lang.Throwable = java.lang.Exception . java.lang.Throwable ( ) ; return java.lang.Throwable instanceof java.lang.UnsupportedOperationException ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Description org.springframework.integration.handler.Description ) { org.springframework.integration.handler.Description . appendText ( STRING ) . appendValue ( java.lang.Throwable ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( { STRING , STRING } ) @ Test public void void ( ) { org.springframework.integration.handler.ExpectedException . expect ( new TypeSafeMatcher < java.lang.Exception > ( java.lang.Exception .class ) { private java.lang.Throwable java.lang.Throwable ; @ java.lang.Override public boolean boolean ( java.lang.Exception java.lang.Exception ) { org.springframework.integration.handler.Log . debug ( java.lang.Exception ) ; java.lang.Throwable = java.lang.Exception . java.lang.Throwable ( ) ; return java.lang.Throwable instanceof org.springframework.integration.handler.ExpressionEvaluatingMessageProcessorTests.CheckedException ; } @ java.lang.Override public void void ( Description org.springframework.integration.handler.Description ) { org.springframework.integration.handler.Description . appendText ( STRING ) . appendValue ( java.lang.Throwable ) ; } } ) ; Expression org.springframework.integration.handler.Expression = org.springframework.integration.handler.ExpressionParser . parseExpression ( STRING ) ; ExpressionEvaluatingMessageProcessor org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor = new ExpressionEvaluatingMessageProcessor ( org.springframework.integration.handler.Expression ) ; org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor . setBeanFactory ( mock ( BeanFactory .class ) ) ; assertEquals ( STRING , org.springframework.integration.handler.ExpressionEvaluatingMessageProcessor . processMessage ( new GenericMessage < org.springframework.integration.handler.ExpressionEvaluatingMessageProcessorTests.TestPayload > ( new org.springframework.integration.handler.ExpressionEvaluatingMessageProcessorTests.TestPayload ( ) ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Exception java.lang.Exception ) { org.springframework.integration.handler.Log . debug ( java.lang.Exception ) ; java.lang.Throwable = java.lang.Exception . java.lang.Throwable ( ) ; return java.lang.Throwable instanceof org.springframework.integration.handler.ExpressionEvaluatingMessageProcessorTests.CheckedException ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Description org.springframework.integration.handler.Description ) { org.springframework.integration.handler.Description . appendText ( STRING ) . appendValue ( java.lang.Throwable ) ; }  <METHOD_END>
<METHOD_START> void ( ) { super(); }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { throw new java.lang.UnsupportedOperationException ( STRING ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) java.lang.Exception { throw new org.springframework.integration.handler.ExpressionEvaluatingMessageProcessorTests.CheckedException ( STRING ) ; }  <METHOD_END>
<METHOD_START> void ( java.lang.String java.lang.String ) { super( java.lang.String ); }  <METHOD_END>