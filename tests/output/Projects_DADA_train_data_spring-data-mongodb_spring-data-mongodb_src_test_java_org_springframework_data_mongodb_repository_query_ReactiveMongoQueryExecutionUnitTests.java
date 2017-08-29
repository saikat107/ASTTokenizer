<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = ClassUtils . getMethod ( org.springframework.data.mongodb.repository.query.ReactiveMongoQueryExecutionUnitTests.GeoRepo .class , STRING ) ; Query org.springframework.data.mongodb.repository.query.Query = new Query ( ) ; when ( org.springframework.data.mongodb.repository.query.MongoParameterAccessor . getGeoNearLocation ( ) ) . thenReturn ( new Point ( NUMBER , NUMBER ) ) ; when ( org.springframework.data.mongodb.repository.query.MongoParameterAccessor . getDistanceRange ( ) ) . thenReturn ( new Range <> ( new Distance ( NUMBER ) , new Distance ( NUMBER ) ) ) ; when ( org.springframework.data.mongodb.repository.query.MongoParameterAccessor . getPageable ( ) ) . thenReturn ( new PageRequest ( NUMBER , NUMBER ) ) ; new GeoNearExecution ( org.springframework.data.mongodb.repository.query.ReactiveMongoOperations , org.springframework.data.mongodb.repository.query.MongoParameterAccessor , ClassTypeInformation . fromReturnTypeOf ( java.lang.reflect.Method ) ) . execute ( org.springframework.data.mongodb.repository.query.Query , Person .class , STRING ) ; ArgumentCaptor < NearQuery > org.springframework.data.mongodb.repository.query.ArgumentCaptor<org.springframework.data.mongodb.repository.query.NearQuery> = ArgumentCaptor . forClass ( NearQuery .class ) ; verify ( org.springframework.data.mongodb.repository.query.ReactiveMongoOperations ) . geoNear ( org.springframework.data.mongodb.repository.query.ArgumentCaptor<org.springframework.data.mongodb.repository.query.NearQuery> . capture ( ) , eq ( Person .class ) , eq ( STRING ) ) ; NearQuery org.springframework.data.mongodb.repository.query.NearQuery = org.springframework.data.mongodb.repository.query.ArgumentCaptor<org.springframework.data.mongodb.repository.query.NearQuery> . getValue ( ) ; assertThat ( org.springframework.data.mongodb.repository.query.NearQuery . toDocument ( ) . get ( STRING ) , is ( equalTo ( java.util.Arrays . java.util.List<java.lang.Double> ( NUMBER , NUMBER ) ) ) ) ; assertThat ( org.springframework.data.mongodb.repository.query.NearQuery . getSkip ( ) , is ( NUMBER ) ) ; assertThat ( org.springframework.data.mongodb.repository.query.NearQuery . getMinDistance ( ) , is ( equalTo ( new Distance ( NUMBER ) ) ) ) ; assertThat ( org.springframework.data.mongodb.repository.query.NearQuery . getMaxDistance ( ) , is ( equalTo ( new Distance ( NUMBER ) ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = ClassUtils . getMethod ( org.springframework.data.mongodb.repository.query.ReactiveMongoQueryExecutionUnitTests.GeoRepo .class , STRING ) ; Query org.springframework.data.mongodb.repository.query.Query = new Query ( ) ; when ( org.springframework.data.mongodb.repository.query.MongoParameterAccessor . getGeoNearLocation ( ) ) . thenReturn ( new Point ( NUMBER , NUMBER ) ) ; when ( org.springframework.data.mongodb.repository.query.MongoParameterAccessor . getDistanceRange ( ) ) . thenReturn ( new Range <> ( null , null ) ) ; new GeoNearExecution ( org.springframework.data.mongodb.repository.query.ReactiveMongoOperations , org.springframework.data.mongodb.repository.query.MongoParameterAccessor , ClassTypeInformation . fromReturnTypeOf ( java.lang.reflect.Method ) ) . execute ( org.springframework.data.mongodb.repository.query.Query , Person .class , STRING ) ; ArgumentCaptor < NearQuery > org.springframework.data.mongodb.repository.query.ArgumentCaptor<org.springframework.data.mongodb.repository.query.NearQuery> = ArgumentCaptor . forClass ( NearQuery .class ) ; verify ( org.springframework.data.mongodb.repository.query.ReactiveMongoOperations ) . geoNear ( org.springframework.data.mongodb.repository.query.ArgumentCaptor<org.springframework.data.mongodb.repository.query.NearQuery> . capture ( ) , eq ( Person .class ) , eq ( STRING ) ) ; NearQuery org.springframework.data.mongodb.repository.query.NearQuery = org.springframework.data.mongodb.repository.query.ArgumentCaptor<org.springframework.data.mongodb.repository.query.NearQuery> . getValue ( ) ; assertThat ( org.springframework.data.mongodb.repository.query.NearQuery . toDocument ( ) . get ( STRING ) , is ( equalTo ( java.util.Arrays . java.util.List<java.lang.Double> ( NUMBER , NUMBER ) ) ) ) ; assertThat ( org.springframework.data.mongodb.repository.query.NearQuery . getSkip ( ) , is ( NUMBER ) ) ; assertThat ( org.springframework.data.mongodb.repository.query.NearQuery . getMinDistance ( ) , is ( nullValue ( ) ) ) ; assertThat ( org.springframework.data.mongodb.repository.query.NearQuery . getMaxDistance ( ) , is ( nullValue ( ) ) ) ; }  <METHOD_END>
<METHOD_START> org.springframework.data.mongodb.repository.query.Flux<org.springframework.data.mongodb.repository.query.GeoResult<org.springframework.data.mongodb.repository.query.Person>> < GeoResult < Person > > org.springframework.data.mongodb.repository.query.Flux<org.springframework.data.mongodb.repository.query.GeoResult<org.springframework.data.mongodb.repository.query.Person>> ( )  <METHOD_END>