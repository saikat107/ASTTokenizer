<METHOD_START> @ Before public void void ( ) java.lang.Exception { void ( ) ; }  <METHOD_END>
<METHOD_START> @ After public void void ( ) { org.springframework.integration.mongodb.dsl.MongoOperations . dropCollection ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test @ MongoDbAvailable public void void ( ) { org.springframework.integration.mongodb.dsl.MessageChannel . send ( MessageBuilder . withPayload ( STRING ) . setHeader ( STRING , STRING ) . build ( ) ) ; Message < ? > org.springframework.integration.mongodb.dsl.Message<?> = this . org.springframework.integration.mongodb.dsl.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.mongodb.dsl.Message<> ) ; Person org.springframework.integration.mongodb.dsl.Person = ( Person ) org.springframework.integration.mongodb.dsl.Message<> . getPayload ( ) ; assertEquals ( STRING , org.springframework.integration.mongodb.dsl.Person . getName ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ MongoDbAvailable public void void ( ) { org.springframework.integration.mongodb.dsl.MessageChannel . send ( MessageBuilder . withPayload ( STRING ) . build ( ) ) ; Message < ? > org.springframework.integration.mongodb.dsl.Message<?> = this . org.springframework.integration.mongodb.dsl.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.mongodb.dsl.Message<> ) ; Person org.springframework.integration.mongodb.dsl.Person = ( Person ) org.springframework.integration.mongodb.dsl.Message<> . getPayload ( ) ; assertEquals ( STRING , org.springframework.integration.mongodb.dsl.Person . getName ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ MongoDbAvailable public void void ( ) { org.springframework.integration.mongodb.dsl.MessageChannel . send ( MessageBuilder . withPayload ( STRING ) . setHeader ( STRING , STRING ) . build ( ) ) ; Message < ? > org.springframework.integration.mongodb.dsl.Message<?> = this . org.springframework.integration.mongodb.dsl.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.mongodb.dsl.Message<> ) ; Person org.springframework.integration.mongodb.dsl.Person = ( Person ) org.springframework.integration.mongodb.dsl.Message<> . getPayload ( ) ; assertEquals ( STRING , org.springframework.integration.mongodb.dsl.Person . getName ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = ReplyRequiredException .class ) @ MongoDbAvailable public void void ( ) { org.springframework.integration.mongodb.dsl.MessageChannel . send ( MessageBuilder . withPayload ( STRING ) . setHeader ( STRING , STRING ) . build ( ) ) ; this . org.springframework.integration.mongodb.dsl.PollableChannel . receive ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test @ MongoDbAvailable public void void ( ) { org.springframework.integration.mongodb.dsl.MessageChannel . send ( MessageBuilder . withPayload ( STRING ) . setHeader ( STRING , STRING ) . build ( ) ) ; Message < ? > org.springframework.integration.mongodb.dsl.Message<?> = this . org.springframework.integration.mongodb.dsl.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.mongodb.dsl.Message<> ) ; java.util.List<org.springframework.integration.mongodb.dsl.Person> < Person > java.util.List<org.springframework.integration.mongodb.dsl.Person> = java.util.List<org.springframework.integration.mongodb.dsl.Person> ( org.springframework.integration.mongodb.dsl.Message<> ) ; assertEquals ( NUMBER , java.util.List<org.springframework.integration.mongodb.dsl.Person> . size ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ MongoDbAvailable public void void ( ) { org.springframework.integration.mongodb.dsl.MessageChannel . send ( MessageBuilder . withPayload ( STRING ) . setHeader ( STRING , STRING ) . build ( ) ) ; Message < ? > org.springframework.integration.mongodb.dsl.Message<?> = this . org.springframework.integration.mongodb.dsl.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.mongodb.dsl.Message<> ) ; java.util.List<org.springframework.integration.mongodb.dsl.Person> < Person > java.util.List<org.springframework.integration.mongodb.dsl.Person> = java.util.List<org.springframework.integration.mongodb.dsl.Person> ( org.springframework.integration.mongodb.dsl.Message<> ) ; assertEquals ( NUMBER , java.util.List<org.springframework.integration.mongodb.dsl.Person> . size ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ MongoDbAvailable public void void ( ) { org.springframework.integration.mongodb.dsl.MessageChannel . send ( MessageBuilder . withPayload ( STRING ) . setHeader ( STRING , STRING ) . build ( ) ) ; Message < ? > org.springframework.integration.mongodb.dsl.Message<?> = this . org.springframework.integration.mongodb.dsl.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.mongodb.dsl.Message<> ) ; Person org.springframework.integration.mongodb.dsl.Person = ( Person ) org.springframework.integration.mongodb.dsl.Message<> . getPayload ( ) ; assertEquals ( STRING , org.springframework.integration.mongodb.dsl.Person . getName ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ MongoDbAvailable public void void ( ) { org.springframework.integration.mongodb.dsl.MessageChannel . send ( MessageBuilder . withPayload ( STRING ) . setHeader ( STRING , STRING ) . build ( ) ) ; Message < ? > org.springframework.integration.mongodb.dsl.Message<?> = this . org.springframework.integration.mongodb.dsl.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.mongodb.dsl.Message<> ) ; Person org.springframework.integration.mongodb.dsl.Person = ( Person ) org.springframework.integration.mongodb.dsl.Message<> . getPayload ( ) ; assertEquals ( STRING , org.springframework.integration.mongodb.dsl.Person . getName ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ MongoDbAvailable public void void ( ) { org.springframework.integration.mongodb.dsl.MessageChannel . send ( MessageBuilder . withPayload ( STRING ) . build ( ) ) ; Message < ? > org.springframework.integration.mongodb.dsl.Message<?> = this . org.springframework.integration.mongodb.dsl.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.mongodb.dsl.Message<> ) ; long long = ( java.lang.Long ) org.springframework.integration.mongodb.dsl.Message<> . getPayload ( ) ; assertEquals ( NUMBER , long ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private java.util.List<org.springframework.integration.mongodb.dsl.Person> < Person > java.util.List<org.springframework.integration.mongodb.dsl.Person> ( Message < ? > org.springframework.integration.mongodb.dsl.Message<?> ) { return ( java.util.List<org.springframework.integration.mongodb.dsl.Person> < Person > ) org.springframework.integration.mongodb.dsl.Message<> . getPayload ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( ) { BulkOperations org.springframework.integration.mongodb.dsl.BulkOperations = this . org.springframework.integration.mongodb.dsl.MongoOperations . bulkOps ( BulkOperations . BulkMode . ORDERED , java.lang.String ) ; org.springframework.integration.mongodb.dsl.BulkOperations . insert ( java.util.Arrays . java.util.List ( this . createPerson ( STRING ) , this . createPerson ( STRING ) , this . createPerson ( STRING ) , this . createPerson ( STRING ) ) ) ; org.springframework.integration.mongodb.dsl.BulkOperations . execute ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.mongodb.dsl.IntegrationFlow org.springframework.integration.mongodb.dsl.IntegrationFlow ( ) { return f -> f . handle ( queryOutboundGateway ( STRING , true ) ) . channel ( getResultChannel ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.mongodb.dsl.IntegrationFlow org.springframework.integration.mongodb.dsl.IntegrationFlow ( ) { return f -> f . handle ( queryOutboundGatewayWithTemplate ( STRING , true ) ) . channel ( getResultChannel ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.mongodb.dsl.IntegrationFlow org.springframework.integration.mongodb.dsl.IntegrationFlow ( ) { return f -> f . handle ( queryExpressionOutboundGateway ( true ) ) . channel ( getResultChannel ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.mongodb.dsl.IntegrationFlow org.springframework.integration.mongodb.dsl.IntegrationFlow ( ) { return f -> f . handle ( queryExpressionOutboundGateway ( false ) ) . channel ( getResultChannel ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.mongodb.dsl.IntegrationFlow org.springframework.integration.mongodb.dsl.IntegrationFlow ( ) { return f -> f . handle ( queryExpressionOutboundGateway ( false , NUMBER ) ) . channel ( getResultChannel ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.mongodb.dsl.IntegrationFlow org.springframework.integration.mongodb.dsl.IntegrationFlow ( ) { return f -> f . handle ( queryFunctionOutboundGateway ( true ) ) . channel ( getResultChannel ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.mongodb.dsl.IntegrationFlow org.springframework.integration.mongodb.dsl.IntegrationFlow ( ) { return f -> f . handle ( collectionNameFunctionOutboundGateway ( true ) ) . channel ( getResultChannel ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.mongodb.dsl.IntegrationFlow org.springframework.integration.mongodb.dsl.IntegrationFlow ( ) { return f -> f . handle ( collectionCallbackOutboundGateway ( MongoCollection :: count ) ) . channel ( getResultChannel ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.mongodb.dsl.MessageChannel org.springframework.integration.mongodb.dsl.MessageChannel ( ) { return MessageChannels . queue ( ) . get ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.mongodb.dsl.MongoDbFactory org.springframework.integration.mongodb.dsl.MongoDbFactory ( ) { return new SimpleMongoDbFactory ( new MongoClient ( ) , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.mongodb.dsl.MongoConverter org.springframework.integration.mongodb.dsl.MongoConverter ( ) { return new TestMongoConverter ( org.springframework.integration.mongodb.dsl.MongoDbFactory ( ) , new MongoMappingContext ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.mongodb.dsl.MongoOperations org.springframework.integration.mongodb.dsl.MongoOperations ( ) { return new MongoTemplate ( org.springframework.integration.mongodb.dsl.MongoDbFactory ( ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.integration.mongodb.dsl.MongoDbOutboundGatewaySpec org.springframework.integration.mongodb.dsl.MongoDbOutboundGatewaySpec ( java.lang.String java.lang.String , boolean boolean ) { return MongoDb . outboundGateway ( org.springframework.integration.mongodb.dsl.MongoDbFactory ( ) , org.springframework.integration.mongodb.dsl.MongoConverter ( ) ) . query ( java.lang.String ) . collectionNameExpression ( STRING ) . expectSingleResult ( boolean ) . entityClass ( Person .class ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.integration.mongodb.dsl.MongoDbOutboundGatewaySpec org.springframework.integration.mongodb.dsl.MongoDbOutboundGatewaySpec ( java.lang.String java.lang.String , boolean boolean ) { return MongoDb . outboundGateway ( org.springframework.integration.mongodb.dsl.MongoOperations ( ) ) . query ( java.lang.String ) . collectionName ( java.lang.String ) . expectSingleResult ( boolean ) . entityClass ( Person .class ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.integration.mongodb.dsl.MongoDbOutboundGatewaySpec org.springframework.integration.mongodb.dsl.MongoDbOutboundGatewaySpec ( boolean boolean ) { return MongoDb . outboundGateway ( org.springframework.integration.mongodb.dsl.MongoDbFactory ( ) , org.springframework.integration.mongodb.dsl.MongoConverter ( ) ) . queryExpression ( STRING ) . collectionName ( java.lang.String ) . expectSingleResult ( boolean ) . entityClass ( Person .class ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.integration.mongodb.dsl.MongoDbOutboundGatewaySpec org.springframework.integration.mongodb.dsl.MongoDbOutboundGatewaySpec ( boolean boolean , int int ) { return MongoDb . outboundGateway ( org.springframework.integration.mongodb.dsl.MongoDbFactory ( ) , org.springframework.integration.mongodb.dsl.MongoConverter ( ) ) . queryExpression ( STRING + int + STRING ) . collectionName ( java.lang.String ) . expectSingleResult ( boolean ) . entityClass ( Person .class ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.integration.mongodb.dsl.MongoDbOutboundGatewaySpec org.springframework.integration.mongodb.dsl.MongoDbOutboundGatewaySpec ( boolean boolean ) { return MongoDb . outboundGateway ( org.springframework.integration.mongodb.dsl.MongoDbFactory ( ) , org.springframework.integration.mongodb.dsl.MongoConverter ( ) ) . queryFunction ( msg -> Query . query ( Criteria . where ( STRING ) . is ( msg . getPayload ( ) ) ) ) . collectionNameExpression ( STRING ) . expectSingleResult ( boolean ) . entityClass ( Person .class ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.integration.mongodb.dsl.MongoDbOutboundGatewaySpec org.springframework.integration.mongodb.dsl.MongoDbOutboundGatewaySpec ( boolean boolean ) { return MongoDb . outboundGateway ( org.springframework.integration.mongodb.dsl.MongoDbFactory ( ) , org.springframework.integration.mongodb.dsl.MongoConverter ( ) ) . queryExpression ( STRING ) .< java.lang.String > collectionNameFunction ( Message :: getPayload ) . expectSingleResult ( boolean ) . entityClass ( Person .class ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.integration.mongodb.dsl.MongoDbOutboundGatewaySpec org.springframework.integration.mongodb.dsl.MongoDbOutboundGatewaySpec ( CollectionCallback < ? > org.springframework.integration.mongodb.dsl.CollectionCallback<?> ) { return MongoDb . outboundGateway ( org.springframework.integration.mongodb.dsl.MongoDbFactory ( ) , org.springframework.integration.mongodb.dsl.MongoConverter ( ) ) . collectionCallback ( org.springframework.integration.mongodb.dsl.CollectionCallback<> ) . collectionName ( java.lang.String ) . entityClass ( Person .class ) ; }  <METHOD_END>