<METHOD_START> @ Test public void void ( ) { QueueChannel org.springframework.integration.dsl.transformers.QueueChannel = new QueueChannel ( ) ; Message < ? > org.springframework.integration.dsl.transformers.Message<?> = MessageBuilder . withPayload ( new org.springframework.integration.dsl.transformers.TransformerTests.TestPojo ( STRING ) ) . setHeader ( MessageHeaders . REPLY_CHANNEL , org.springframework.integration.dsl.transformers.QueueChannel ) . build ( ) ; this . org.springframework.integration.dsl.transformers.FixedSubscriberChannel . send ( org.springframework.integration.dsl.transformers.Message<> ) ; Message < ? > org.springframework.integration.dsl.transformers.Message<?> = org.springframework.integration.dsl.transformers.QueueChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.dsl.transformers.Message<> ) ; assertEquals ( STRING , org.springframework.integration.dsl.transformers.Message<> . getHeaders ( ) . get ( STRING ) ) ; java.lang.Object java.lang.Object = org.springframework.integration.dsl.transformers.Message<> . getPayload ( ) ; assertThat ( java.lang.Object , instanceOf ( org.springframework.integration.dsl.transformers.TransformerTests.TestPojo .class ) ) ; org.springframework.integration.dsl.transformers.TransformerTests.TestPojo org.springframework.integration.dsl.transformers.TransformerTests.TestPojo = ( org.springframework.integration.dsl.transformers.TransformerTests.TestPojo ) java.lang.Object ; assertEquals ( STRING , org.springframework.integration.dsl.transformers.TransformerTests.TestPojo . java.lang.String ( ) ) ; assertNotNull ( org.springframework.integration.dsl.transformers.TransformerTests.TestPojo . java.util.Date ( ) ) ; assertThat ( new java.util.Date ( ) , Matchers . greaterThanOrEqualTo ( org.springframework.integration.dsl.transformers.TransformerTests.TestPojo . java.util.Date ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { QueueChannel org.springframework.integration.dsl.transformers.QueueChannel = new QueueChannel ( ) ; Message < ? > org.springframework.integration.dsl.transformers.Message<?> = MessageBuilder . withPayload ( new org.springframework.integration.dsl.transformers.TransformerTests.TestPojo ( STRING ) ) . setHeader ( MessageHeaders . REPLY_CHANNEL , org.springframework.integration.dsl.transformers.QueueChannel ) . build ( ) ; this . org.springframework.integration.dsl.transformers.FixedSubscriberChannel . send ( org.springframework.integration.dsl.transformers.Message<> ) ; Message < ? > org.springframework.integration.dsl.transformers.Message<?> = org.springframework.integration.dsl.transformers.QueueChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.dsl.transformers.Message<> ) ; assertNull ( org.springframework.integration.dsl.transformers.Message<> . getHeaders ( ) . get ( STRING ) ) ; java.lang.Object java.lang.Object = org.springframework.integration.dsl.transformers.Message<> . getPayload ( ) ; assertThat ( java.lang.Object , instanceOf ( org.springframework.integration.dsl.transformers.TransformerTests.TestPojo .class ) ) ; org.springframework.integration.dsl.transformers.TransformerTests.TestPojo org.springframework.integration.dsl.transformers.TransformerTests.TestPojo = ( org.springframework.integration.dsl.transformers.TransformerTests.TestPojo ) java.lang.Object ; assertEquals ( STRING , org.springframework.integration.dsl.transformers.TransformerTests.TestPojo . java.lang.String ( ) ) ; assertNotNull ( org.springframework.integration.dsl.transformers.TransformerTests.TestPojo . java.util.Date ( ) ) ; assertThat ( new java.util.Date ( ) , Matchers . greaterThanOrEqualTo ( org.springframework.integration.dsl.transformers.TransformerTests.TestPojo . java.util.Date ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { QueueChannel org.springframework.integration.dsl.transformers.QueueChannel = new QueueChannel ( ) ; Message < ? > org.springframework.integration.dsl.transformers.Message<?> = MessageBuilder . withPayload ( new org.springframework.integration.dsl.transformers.TransformerTests.TestPojo ( STRING ) ) . setHeader ( MessageHeaders . REPLY_CHANNEL , org.springframework.integration.dsl.transformers.QueueChannel ) . build ( ) ; this . org.springframework.integration.dsl.transformers.FixedSubscriberChannel . send ( org.springframework.integration.dsl.transformers.Message<> ) ; Message < ? > org.springframework.integration.dsl.transformers.Message<?> = org.springframework.integration.dsl.transformers.QueueChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.dsl.transformers.Message<> ) ; assertEquals ( STRING , org.springframework.integration.dsl.transformers.Message<> . getHeaders ( ) . get ( STRING ) ) ; java.lang.Object java.lang.Object = org.springframework.integration.dsl.transformers.Message<> . getPayload ( ) ; assertThat ( java.lang.Object , instanceOf ( org.springframework.integration.dsl.transformers.TransformerTests.TestPojo .class ) ) ; org.springframework.integration.dsl.transformers.TransformerTests.TestPojo org.springframework.integration.dsl.transformers.TransformerTests.TestPojo = ( org.springframework.integration.dsl.transformers.TransformerTests.TestPojo ) java.lang.Object ; assertEquals ( STRING , org.springframework.integration.dsl.transformers.TransformerTests.TestPojo . java.lang.String ( ) ) ; assertNull ( org.springframework.integration.dsl.transformers.TransformerTests.TestPojo . java.util.Date ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.integration.dsl.transformers.MessageChannel . send ( MessageBuilder . withPayload ( new org.springframework.integration.dsl.transformers.TransformerTests.TestPojo ( STRING ) ) . build ( ) ) ; Message < ? > org.springframework.integration.dsl.transformers.Message<?> = this . org.springframework.integration.dsl.transformers.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.dsl.transformers.Message<> ) ; assertEquals ( STRING , org.springframework.integration.dsl.transformers.Message<> . getHeaders ( ) . get ( STRING ) ) ; java.lang.Object java.lang.Object = org.springframework.integration.dsl.transformers.Message<> . getPayload ( ) ; assertThat ( java.lang.Object , instanceOf ( org.springframework.integration.dsl.transformers.TransformerTests.TestPojo .class ) ) ; org.springframework.integration.dsl.transformers.TransformerTests.TestPojo org.springframework.integration.dsl.transformers.TransformerTests.TestPojo = ( org.springframework.integration.dsl.transformers.TransformerTests.TestPojo ) java.lang.Object ; assertThat ( org.springframework.integration.dsl.transformers.TransformerTests.TestPojo . java.lang.String ( ) , is ( STRING ) ) ; this . org.springframework.integration.dsl.transformers.MessageChannel . send ( MessageBuilder . withPayload ( new org.springframework.integration.dsl.transformers.TransformerTests.TestPojo ( STRING ) ) . build ( ) ) ; org.springframework.integration.dsl.transformers.Message<?> = this . org.springframework.integration.dsl.transformers.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.dsl.transformers.Message<> ) ; assertEquals ( STRING , org.springframework.integration.dsl.transformers.Message<> . getHeaders ( ) . get ( STRING ) ) ; java.lang.Object = org.springframework.integration.dsl.transformers.Message<> . getPayload ( ) ; assertThat ( java.lang.Object , instanceOf ( org.springframework.integration.dsl.transformers.TransformerTests.TestPojo .class ) ) ; org.springframework.integration.dsl.transformers.TransformerTests.TestPojo = ( org.springframework.integration.dsl.transformers.TransformerTests.TestPojo ) java.lang.Object ; assertThat ( org.springframework.integration.dsl.transformers.TransformerTests.TestPojo . java.lang.String ( ) , is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.integration.dsl.transformers.MessageChannel . send ( new GenericMessage <> ( STRING ) ) ; Message < ? > org.springframework.integration.dsl.transformers.Message<?> = this . org.springframework.integration.dsl.transformers.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.dsl.transformers.Message<> ) ; assertThat ( org.springframework.integration.dsl.transformers.Message<> . getPayload ( ) , instanceOf ( byte [] .class ) ) ; byte [] byte[] = ( byte [] ) org.springframework.integration.dsl.transformers.Message<> . getPayload ( ) ; assertArrayEquals ( STRING . byte[] ( ) , byte[] ) ; this . org.springframework.integration.dsl.transformers.MessageChannel . send ( new GenericMessage <> ( byte[] ) ) ; org.springframework.integration.dsl.transformers.Message<?> = this . org.springframework.integration.dsl.transformers.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.dsl.transformers.Message<> ) ; assertEquals ( NUMBER , org.springframework.integration.dsl.transformers.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { QueueChannel org.springframework.integration.dsl.transformers.QueueChannel = new QueueChannel ( ) ; Message < ? > org.springframework.integration.dsl.transformers.Message<?> = MessageBuilder . withPayload ( STRING ) . setReplyChannel ( org.springframework.integration.dsl.transformers.QueueChannel ) . build ( ) ; this . org.springframework.integration.dsl.transformers.MessageChannel . send ( org.springframework.integration.dsl.transformers.Message<> ) ; Message < ? > org.springframework.integration.dsl.transformers.Message<?> = org.springframework.integration.dsl.transformers.QueueChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.dsl.transformers.Message<> ) ; assertEquals ( STRING , org.springframework.integration.dsl.transformers.Message<> . getPayload ( ) ) ; try { this . org.springframework.integration.dsl.transformers.MessageChannel . send ( org.springframework.integration.dsl.transformers.Message<> ) ; fail ( STRING ) ; } catch ( java.lang.Exception java.lang.Exception ) { assertThat ( java.lang.Exception , instanceOf ( MessageRejectedException .class ) ) ; assertThat ( java.lang.Exception . java.lang.String ( ) , containsString ( STRING ) ) ; assertThat ( java.lang.Exception . java.lang.String ( ) , containsString ( STRING ) ) ; } assertNotNull ( this . org.springframework.integration.dsl.transformers.PollableChannel . receive ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.dsl.transformers.IntegrationFlow org.springframework.integration.dsl.transformers.IntegrationFlow ( ) { return IntegrationFlows . from ( STRING , true ) . enrich ( e -> e . requestChannel ( STRING ) . requestPayloadExpression ( STRING ) . shouldClonePayload ( false ) . propertyExpression ( STRING , STRING ) . propertyFunction ( STRING , m -> new Date ( ) ) . headerExpression ( STRING , STRING ) ) . get ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.dsl.transformers.IntegrationFlow org.springframework.integration.dsl.transformers.IntegrationFlow ( ) { return IntegrationFlows . from ( STRING , true ) . enrich ( e -> e . requestChannel ( STRING ) . requestPayloadExpression ( STRING ) . shouldClonePayload ( false ) . propertyExpression ( STRING , STRING ) . propertyExpression ( STRING , STRING ) ) . get ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.dsl.transformers.IntegrationFlow org.springframework.integration.dsl.transformers.IntegrationFlow ( ) { return IntegrationFlows . from ( STRING , true ) . enrich ( e -> e . requestChannel ( STRING ) . requestPayload ( Message :: getPayload ) . shouldClonePayload ( false ) .< Map < String , String > > headerFunction ( STRING , m -> m . getPayload ( ) . get ( STRING ) ) ) . get ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.dsl.transformers.IntegrationFlow org.springframework.integration.dsl.transformers.IntegrationFlow ( ) { return IntegrationFlows . from ( STRING ) .< org.springframework.integration.dsl.transformers.TransformerTests.TestPojo , java.util.Map<?,?> < ? , ? > > transform ( p -> Collections . singletonMap ( STRING , p . getName ( ) + STRING ) ) . get ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.dsl.transformers.PollableChannel org.springframework.integration.dsl.transformers.PollableChannel ( ) { return new QueueChannel ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.dsl.transformers.PollableChannel org.springframework.integration.dsl.transformers.PollableChannel ( ) { return new QueueChannel ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.dsl.transformers.IntegrationFlow org.springframework.integration.dsl.transformers.IntegrationFlow ( ) { return f -> f . transform ( Transformers . encoding ( new MyCodec ( ) ) ) . channel ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.dsl.transformers.IntegrationFlow org.springframework.integration.dsl.transformers.IntegrationFlow ( ) { DecodingTransformer < java.lang.Integer > org.springframework.integration.dsl.transformers.DecodingTransformer<java.lang.Integer> = Transformers . decoding ( new org.springframework.integration.dsl.transformers.TransformerTests.MyCodec ( ) , m -> Integer .class ) ; return f -> f . transform ( transformer ) . channel ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.dsl.transformers.IntegrationFlow org.springframework.integration.dsl.transformers.IntegrationFlow ( ) { return f -> f . enrichHeaders ( h -> h . header ( STRING , STRING ) . advice ( idempotentReceiverInterceptor ( ) ) ) . transform ( new PojoTransformer ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.dsl.transformers.PollableChannel org.springframework.integration.dsl.transformers.PollableChannel ( ) { return new QueueChannel ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.dsl.transformers.IdempotentReceiverInterceptor org.springframework.integration.dsl.transformers.IdempotentReceiverInterceptor ( ) { IdempotentReceiverInterceptor org.springframework.integration.dsl.transformers.IdempotentReceiverInterceptor = new IdempotentReceiverInterceptor ( new MetadataStoreSelector ( m -> m . getPayload ( ) . toString ( ) ) ) ; org.springframework.integration.dsl.transformers.IdempotentReceiverInterceptor . setDiscardChannel ( org.springframework.integration.dsl.transformers.PollableChannel ( ) ) ; org.springframework.integration.dsl.transformers.IdempotentReceiverInterceptor . setThrowExceptionOnRejection ( true ) ; return org.springframework.integration.dsl.transformers.IdempotentReceiverInterceptor ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.dsl.transformers.PollableChannel org.springframework.integration.dsl.transformers.PollableChannel ( ) { return new QueueChannel ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.dsl.transformers.IntegrationFlow org.springframework.integration.dsl.transformers.IntegrationFlow ( org.springframework.integration.dsl.transformers.TransformerTests.SomeService org.springframework.integration.dsl.transformers.TransformerTests.SomeService ) { return f -> f . enrich ( e -> e .< TestPojo > requestPayload ( p -> p . getPayload ( ) . getName ( ) ) . requestSubFlow ( sf -> sf .< String > handle ( ( p , h ) -> someService . someServiceMethod ( p ) ) ) .< String > headerFunction ( STRING , Message :: getPayload ) . propertyFunction ( STRING , Message :: getPayload ) ) . channel ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.dsl.transformers.MessageChannel org.springframework.integration.dsl.transformers.MessageChannel ( ) { return MessageChannels . direct ( ) . get ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.dsl.transformers.IntegrationFlow org.springframework.integration.dsl.transformers.IntegrationFlow ( org.springframework.integration.dsl.transformers.TransformerTests.SomeService org.springframework.integration.dsl.transformers.TransformerTests.SomeService ) { return f -> f . enrich ( e -> e .< TestPojo > requestPayload ( p -> p . getPayload ( ) . getName ( ) ) . requestSubFlow ( sf -> sf . handle ( someService :: aTerminatingServiceMethod ) ) . replyChannel ( STRING ) .< String > headerFunction ( STRING , Message :: getPayload ) . propertyFunction ( STRING , Message :: getPayload ) ) . channel ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.dsl.transformers.TransformerTests.SomeService org.springframework.integration.dsl.transformers.TransformerTests.SomeService ( ) { return new org.springframework.integration.dsl.transformers.TransformerTests.SomeService ( ) ; }  <METHOD_END>
<METHOD_START> private void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.util.Date java.util.Date ( ) { return java.util.Date ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public void void ( java.util.Date java.util.Date ) { this . java.util.Date = java.util.Date ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , java.io.OutputStream java.io.OutputStream ) throws java.io.IOException {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override public byte [] byte[] ( java.lang.Object java.lang.Object ) throws java.io.IOException { return STRING . byte[] ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > T T ( java.io.InputStream java.io.InputStream , java.lang.Class<T> < T > java.lang.Class<T> ) throws java.io.IOException { return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) @ java.lang.Override public < T > T T ( byte [] byte[] , java.lang.Class<T> < T > java.lang.Class<T> ) throws java.io.IOException { return ( T ) ( java.lang.Class<T> . boolean ( java.lang.String .class ) ? new java.lang.String ( byte[] ) : java.lang.Class<T> . boolean ( java.lang.Integer .class ) ? java.lang.Integer . java.lang.Integer ( NUMBER ) : java.lang.Integer . java.lang.Integer ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Transformer public java.lang.String java.lang.String ( java.lang.String java.lang.String , @ Header ( STRING ) java.lang.String java.lang.String ) { return java.lang.String + java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return STRING . java.lang.String ( java.lang.String ) . java.lang.String ( STRING ) ; }  <METHOD_END>
<METHOD_START> public void void ( Message < ? > org.springframework.integration.dsl.transformers.Message<?> ) { java.lang.String java.lang.String = STRING . java.lang.String ( org.springframework.integration.dsl.transformers.Message<> . getPayload ( ) . toString ( ) ) . concat ( STRING ) ; org.springframework.integration.dsl.transformers.MessageChannel . send ( MessageBuilder . withPayload ( java.lang.String ) . copyHeaders ( org.springframework.integration.dsl.transformers.Message<> . getHeaders ( ) ) . build ( ) ) ; }  <METHOD_END>