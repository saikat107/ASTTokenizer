<METHOD_START> public void ( ) { this( null ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.transformer.Message<?> ) throws java.lang.Exception { Assert . isTrue ( org.springframework.integration.transformer.Message<> . getPayload ( ) instanceof java.io.InputStream , STRING ) ; java.io.InputStream java.io.InputStream = ( java.io.InputStream ) org.springframework.integration.transformer.Message<> . getPayload ( ) ; java.io.ByteArrayOutputStream java.io.ByteArrayOutputStream = new java.io.ByteArrayOutputStream ( ) ; FileCopyUtils . copy ( java.io.InputStream , java.io.ByteArrayOutputStream ) ; java.io.Closeable java.io.Closeable = new IntegrationMessageHeaderAccessor ( org.springframework.integration.transformer.Message<> ) . getCloseableResource ( ) ; if ( java.io.Closeable != null ) { java.io.Closeable . void ( ) ; } return this . java.lang.String == null ? java.io.ByteArrayOutputStream . byte[] ( ) : java.io.ByteArrayOutputStream . java.lang.String ( this . java.lang.String ) ; }  <METHOD_END>