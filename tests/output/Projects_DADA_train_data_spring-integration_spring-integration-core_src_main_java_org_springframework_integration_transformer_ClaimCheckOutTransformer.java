<METHOD_START> public void ( MessageStore org.springframework.integration.transformer.MessageStore ) { Assert . notNull ( org.springframework.integration.transformer.MessageStore , STRING ) ; this . org.springframework.integration.transformer.MessageStore = org.springframework.integration.transformer.MessageStore ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.transformer.Message<?> ) throws java.lang.Exception { Assert . notNull ( org.springframework.integration.transformer.Message<> , STRING ) ; Assert . isTrue ( org.springframework.integration.transformer.Message<> . getPayload ( ) instanceof java.util.UUID , STRING ) ; java.util.UUID java.util.UUID = ( java.util.UUID ) org.springframework.integration.transformer.Message<> . getPayload ( ) ; Message < ? > org.springframework.integration.transformer.Message<?> ; if ( this . boolean ) { org.springframework.integration.transformer.Message<?> = this . org.springframework.integration.transformer.MessageStore . removeMessage ( java.util.UUID ) ; if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING + java.util.UUID + STRING ) ; } } else { org.springframework.integration.transformer.Message<?> = this . org.springframework.integration.transformer.MessageStore . getMessage ( java.util.UUID ) ; } Assert . notNull ( org.springframework.integration.transformer.Message<> , STRING + java.util.UUID + STRING + this . org.springframework.integration.transformer.MessageStore + STRING ) ; AbstractIntegrationMessageBuilder < ? > org.springframework.integration.transformer.AbstractIntegrationMessageBuilder<?> = this . getMessageBuilderFactory ( ) . fromMessage ( org.springframework.integration.transformer.Message<> ) ; org.springframework.integration.transformer.AbstractIntegrationMessageBuilder<> . copyHeaders ( org.springframework.integration.transformer.Message<> . getHeaders ( ) ) ; return org.springframework.integration.transformer.AbstractIntegrationMessageBuilder<> . build ( ) ; }  <METHOD_END>