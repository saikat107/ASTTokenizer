<METHOD_START> public void ( ContinuousQueryListenerContainer org.springframework.integration.gemfire.inbound.ContinuousQueryListenerContainer , java.lang.String java.lang.String ) { Assert . notNull ( org.springframework.integration.gemfire.inbound.ContinuousQueryListenerContainer , STRING ) ; Assert . notNull ( java.lang.String , STRING ) ; this . org.springframework.integration.gemfire.inbound.ContinuousQueryListenerContainer = org.springframework.integration.gemfire.inbound.ContinuousQueryListenerContainer ; this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public void void ( CqEventType ... org.springframework.integration.gemfire.inbound.CqEventType[] ) { Assert . notEmpty ( org.springframework.integration.gemfire.inbound.CqEventType[] , STRING ) ; this . java.util.Set<org.springframework.integration.gemfire.inbound.CqEventType> = new java.util.HashSet<org.springframework.integration.gemfire.inbound.CqEventType> < CqEventType > ( java.util.Arrays . java.util.List ( org.springframework.integration.gemfire.inbound.CqEventType[] ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { super. onInit ( ) ; if ( this . java.lang.String == null ) { this . org.springframework.integration.gemfire.inbound.ContinuousQueryListenerContainer . addListener ( new ContinuousQueryDefinition ( this . java.lang.String , this , this . boolean ) ) ; } else { this . org.springframework.integration.gemfire.inbound.ContinuousQueryListenerContainer . addListener ( new ContinuousQueryDefinition ( this . java.lang.String , this . java.lang.String , this , this . boolean ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( CqEvent org.springframework.integration.gemfire.inbound.CqEvent ) { if ( boolean ( org.springframework.integration.gemfire.inbound.CqEvent ) ) { if ( org.springframework.integration.gemfire.inbound.Log . isDebugEnabled ( ) ) { org.springframework.integration.gemfire.inbound.Log . debug ( java.lang.String . java.lang.String ( STRING , org.springframework.integration.gemfire.inbound.CqEvent . getQueryOperation ( ) . toString ( ) , org.springframework.integration.gemfire.inbound.CqEvent . getKey ( ) ) ) ; } Message < ? > org.springframework.integration.gemfire.inbound.Message<?> = null ; java.lang.Object java.lang.Object = evaluatePayloadExpression ( org.springframework.integration.gemfire.inbound.CqEvent ) ; if ( java.lang.Object instanceof Message ) { org.springframework.integration.gemfire.inbound.Message<?> = ( Message < ? > ) java.lang.Object ; } else { org.springframework.integration.gemfire.inbound.Message<?> = getMessageBuilderFactory ( ) . withPayload ( java.lang.Object ) . build ( ) ; } sendMessage ( org.springframework.integration.gemfire.inbound.Message<> ) ; } }  <METHOD_END>
<METHOD_START> private boolean boolean ( CqEvent org.springframework.integration.gemfire.inbound.CqEvent ) { java.lang.String java.lang.String = org.springframework.integration.gemfire.inbound.CqEvent . getQueryOperation ( ) . toString ( ) + ( org.springframework.integration.gemfire.inbound.CqEvent . getQueryOperation ( ) . toString ( ) . endsWith ( STRING ) ? STRING : STRING ) ; CqEventType org.springframework.integration.gemfire.inbound.CqEventType = CqEventType . valueOf ( java.lang.String ) ; return this . java.util.Set<org.springframework.integration.gemfire.inbound.CqEventType> . contains ( org.springframework.integration.gemfire.inbound.CqEventType ) ; }  <METHOD_END>