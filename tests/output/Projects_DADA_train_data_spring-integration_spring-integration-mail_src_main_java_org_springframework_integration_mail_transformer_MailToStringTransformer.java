<METHOD_START> public void void ( java.lang.String java.lang.String ) { Assert . notNull ( java.lang.String , STRING ) ; Assert . isTrue ( java.nio.charset.Charset . boolean ( java.lang.String ) , STRING + java.lang.String + STRING ) ; this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.integration.mail.transformer.AbstractIntegrationMessageBuilder<java.lang.String> < java.lang.String > org.springframework.integration.mail.transformer.AbstractIntegrationMessageBuilder<java.lang.String> ( javax . javax.mail . javax.mail javax.mail.Message ) throws java.lang.Exception { java.lang.Object java.lang.Object = javax.mail.Message . getContent ( ) ; if ( java.lang.Object instanceof java.lang.String ) { return this . getMessageBuilderFactory ( ) . withPayload ( ( java.lang.String ) java.lang.Object ) ; } if ( java.lang.Object instanceof Multipart ) { java.io.ByteArrayOutputStream java.io.ByteArrayOutputStream = new java.io.ByteArrayOutputStream ( ) ; ( ( Multipart ) java.lang.Object ) . writeTo ( java.io.ByteArrayOutputStream ) ; return this . getMessageBuilderFactory ( ) . withPayload ( new java.lang.String ( java.io.ByteArrayOutputStream . byte[] ( ) , this . java.lang.String ) ) ; } else if ( java.lang.Object instanceof Part ) { java.io.ByteArrayOutputStream java.io.ByteArrayOutputStream = new java.io.ByteArrayOutputStream ( ) ; ( ( Part ) java.lang.Object ) . writeTo ( java.io.ByteArrayOutputStream ) ; return this . getMessageBuilderFactory ( ) . withPayload ( new java.lang.String ( java.io.ByteArrayOutputStream . byte[] ( ) , this . java.lang.String ) ) ; } throw new java.lang.IllegalArgumentException ( STRING + javax.mail.Message . getContentType ( ) + STRING ) ; }  <METHOD_END>