<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.integration.transformer.CodecTransformerTests.MyCodec org.springframework.integration.transformer.CodecTransformerTests.MyCodec = new org.springframework.integration.transformer.CodecTransformerTests.MyCodec ( ) ; EncodingPayloadTransformer < java.lang.String > org.springframework.integration.transformer.EncodingPayloadTransformer<java.lang.String> = new EncodingPayloadTransformer < java.lang.String > ( org.springframework.integration.transformer.CodecTransformerTests.MyCodec ) ; Message < ? > org.springframework.integration.transformer.Message<?> = new GenericMessage < java.lang.String > ( STRING ) ; byte [] byte[] = org.springframework.integration.transformer.EncodingPayloadTransformer<java.lang.String> . doTransform ( org.springframework.integration.transformer.Message<> ) ; assertArrayEquals ( STRING . byte[] ( ) , byte[] ) ; DecodingTransformer < ? > org.springframework.integration.transformer.DecodingTransformer<?> = new DecodingTransformer < java.lang.String > ( org.springframework.integration.transformer.CodecTransformerTests.MyCodec , java.lang.String .class ) ; assertEquals ( STRING , org.springframework.integration.transformer.DecodingTransformer<> . doTransform ( new GenericMessage < byte [] > ( byte[] ) ) ) ; org.springframework.integration.transformer.DecodingTransformer<?> = new DecodingTransformer < java.lang.Integer > ( org.springframework.integration.transformer.CodecTransformerTests.MyCodec , new SpelExpressionParser ( ) . parseExpression ( STRING ) ) ; org.springframework.integration.transformer.DecodingTransformer<> . setEvaluationContext ( new StandardEvaluationContext ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.transformer.DecodingTransformer<> . doTransform ( new GenericMessage < byte [] > ( byte[] ) ) ) ; org.springframework.integration.transformer.DecodingTransformer<?> = new DecodingTransformer < java.lang.Integer > ( org.springframework.integration.transformer.CodecTransformerTests.MyCodec , new SpelExpressionParser ( ) . parseExpression ( STRING ) ) ; org.springframework.integration.transformer.DecodingTransformer<> . setEvaluationContext ( new StandardEvaluationContext ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.transformer.DecodingTransformer<> . doTransform ( new GenericMessage < byte [] > ( byte[] , java.util.Collections . java.util.Map<java.lang.String,java.lang.Class<java.lang.Integer>> ( STRING , java.lang.Integer .class ) ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , java.io.OutputStream java.io.OutputStream ) throws java.io.IOException {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override public byte [] byte[] ( java.lang.Object java.lang.Object ) throws java.io.IOException { return STRING . byte[] ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > T T ( java.io.InputStream java.io.InputStream , java.lang.Class<T> < T > java.lang.Class<T> ) throws java.io.IOException { return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) @ java.lang.Override public < T > T T ( byte [] byte[] , java.lang.Class<T> < T > java.lang.Class<T> ) throws java.io.IOException { return ( T ) ( java.lang.Class<T> . boolean ( java.lang.String .class ) ? new java.lang.String ( byte[] ) : java.lang.Class<T> . boolean ( java.lang.Integer .class ) ? java.lang.Integer . java.lang.Integer ( NUMBER ) : java.lang.Integer . java.lang.Integer ( NUMBER ) ) ; }  <METHOD_END>