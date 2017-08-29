<METHOD_START> @ Test public void void ( ) java.lang.Exception { byte [] byte[] = byte[] ( STRING ) ; org.springframework.integration.config.xml.MessageChannel . send ( new GenericMessage < byte [] > ( byte[] ) ) ; Message < ? > org.springframework.integration.config.xml.Message<?> = org.springframework.integration.config.xml.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.config.xml.Message<> ) ; assertTrue ( org.springframework.integration.config.xml.Message<> . getPayload ( ) instanceof java.lang.String ) ; assertEquals ( STRING , org.springframework.integration.config.xml.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { byte [] byte[] = byte[] ( STRING ) ; org.springframework.integration.config.xml.MessageChannel . send ( new GenericMessage < byte [] > ( byte[] ) ) ; Message < ? > org.springframework.integration.config.xml.Message<?> = org.springframework.integration.config.xml.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.config.xml.Message<> ) ; assertTrue ( org.springframework.integration.config.xml.Message<> . getPayload ( ) instanceof java.lang.String ) ; assertEquals ( STRING , org.springframework.integration.config.xml.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { byte [] byte[] = byte[] ( new org.springframework.integration.config.xml.PayloadDeserializingTransformerParserTests.TestBean ( ) ) ; org.springframework.integration.config.xml.MessageChannel . send ( new GenericMessage < byte [] > ( byte[] ) ) ; Message < ? > org.springframework.integration.config.xml.Message<?> = org.springframework.integration.config.xml.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.config.xml.Message<> ) ; assertEquals ( org.springframework.integration.config.xml.PayloadDeserializingTransformerParserTests.TestBean .class , org.springframework.integration.config.xml.Message<> . getPayload ( ) . getClass ( ) ) ; assertEquals ( STRING , ( ( org.springframework.integration.config.xml.PayloadDeserializingTransformerParserTests.TestBean ) org.springframework.integration.config.xml.Message<> . getPayload ( ) ) . java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { byte [] byte[] = byte[] ( new org.springframework.integration.config.xml.PayloadDeserializingTransformerParserTests.TestBean ( ) ) ; org.springframework.integration.config.xml.MessageChannel . send ( new GenericMessage < byte [] > ( byte[] ) ) ; Message < ? > org.springframework.integration.config.xml.Message<?> = org.springframework.integration.config.xml.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.config.xml.Message<> ) ; assertEquals ( org.springframework.integration.config.xml.PayloadDeserializingTransformerParserTests.TestBean .class , org.springframework.integration.config.xml.Message<> . getPayload ( ) . getClass ( ) ) ; assertEquals ( STRING , ( ( org.springframework.integration.config.xml.PayloadDeserializingTransformerParserTests.TestBean ) org.springframework.integration.config.xml.Message<> . getPayload ( ) ) . java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = MessageTransformationException .class ) public void void ( ) { byte [] byte[] = new byte [] { NUMBER , NUMBER , NUMBER } ; org.springframework.integration.config.xml.MessageChannel . send ( new GenericMessage < byte [] > ( byte[] ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.integration.config.xml.MessageChannel . send ( new GenericMessage < byte [] > ( STRING . byte[] ( STRING ) ) ) ; Message < ? > org.springframework.integration.config.xml.Message<?> = org.springframework.integration.config.xml.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.config.xml.Message<> ) ; assertEquals ( java.lang.String .class , org.springframework.integration.config.xml.Message<> . getPayload ( ) . getClass ( ) ) ; assertEquals ( STRING , org.springframework.integration.config.xml.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> private static byte [] byte[] ( java.lang.Object java.lang.Object ) throws java.lang.Exception { java.io.ByteArrayOutputStream java.io.ByteArrayOutputStream = new java.io.ByteArrayOutputStream ( ) ; java.io.ObjectOutputStream java.io.ObjectOutputStream = new java.io.ObjectOutputStream ( java.io.ByteArrayOutputStream ) ; java.io.ObjectOutputStream . void ( java.lang.Object ) ; return java.io.ByteArrayOutputStream . byte[] ( ) ; }  <METHOD_END>
<METHOD_START> void ( ) { super(); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.io.InputStream java.io.InputStream ) throws java.io.IOException { return FileCopyUtils . copyToString ( new java.io.InputStreamReader ( java.io.InputStream , STRING ) ) . toUpperCase ( ) ; }  <METHOD_END>