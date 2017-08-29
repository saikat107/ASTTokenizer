<METHOD_START> java.lang.Object java.lang.Object ( Query org.springframework.data.mongodb.repository.query.Query , java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( Query org.springframework.data.mongodb.repository.query.Query , java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.String java.lang.String ) { return org.springframework.data.mongodb.repository.query.ReactiveMongoOperations . find ( org.springframework.data.mongodb.repository.query.Query . with ( org.springframework.data.mongodb.repository.query.Pageable ) , java.lang.Class<> , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( Query org.springframework.data.mongodb.repository.query.Query , java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.String java.lang.String ) { return org.springframework.data.mongodb.repository.query.ReactiveMongoOperations . tail ( org.springframework.data.mongodb.repository.query.Query . with ( org.springframework.data.mongodb.repository.query.Pageable ) , java.lang.Class<> , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( Query org.springframework.data.mongodb.repository.query.Query , java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.String java.lang.String ) { return boolean ? org.springframework.data.mongodb.repository.query.ReactiveMongoOperations . count ( org.springframework.data.mongodb.repository.query.Query , java.lang.Class<> , java.lang.String ) : org.springframework.data.mongodb.repository.query.ReactiveMongoOperations . findOne ( org.springframework.data.mongodb.repository.query.Query , java.lang.Class<> , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( Query org.springframework.data.mongodb.repository.query.Query , java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.String java.lang.String ) { Flux < GeoResult < java.lang.Object > > org.springframework.data.mongodb.repository.query.Flux<org.springframework.data.mongodb.repository.query.GeoResult<java.lang.Object>> = org.springframework.data.mongodb.repository.query.Flux<org.springframework.data.mongodb.repository.query.GeoResult<java.lang.Object>> ( org.springframework.data.mongodb.repository.query.Query , java.lang.Class<> , java.lang.String ) ; return boolean ( ) ? org.springframework.data.mongodb.repository.query.Flux<org.springframework.data.mongodb.repository.query.GeoResult<java.lang.Object>> : org.springframework.data.mongodb.repository.query.Flux<org.springframework.data.mongodb.repository.query.GeoResult<java.lang.Object>> . map ( GeoResult :: getContent ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) protected org.springframework.data.mongodb.repository.query.Flux<org.springframework.data.mongodb.repository.query.GeoResult<java.lang.Object>> < GeoResult < java.lang.Object > > org.springframework.data.mongodb.repository.query.Flux<org.springframework.data.mongodb.repository.query.GeoResult<java.lang.Object>> ( Query org.springframework.data.mongodb.repository.query.Query , java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.String java.lang.String ) { Point org.springframework.data.mongodb.repository.query.Point = org.springframework.data.mongodb.repository.query.MongoParameterAccessor . getGeoNearLocation ( ) ; NearQuery org.springframework.data.mongodb.repository.query.NearQuery = NearQuery . near ( org.springframework.data.mongodb.repository.query.Point ) ; if ( org.springframework.data.mongodb.repository.query.Query != null ) { org.springframework.data.mongodb.repository.query.NearQuery . query ( org.springframework.data.mongodb.repository.query.Query ) ; } Range < Distance > org.springframework.data.mongodb.repository.query.Range<org.springframework.data.mongodb.repository.query.Distance> = org.springframework.data.mongodb.repository.query.MongoParameterAccessor . getDistanceRange ( ) ; Distance org.springframework.data.mongodb.repository.query.Distance = org.springframework.data.mongodb.repository.query.Range<org.springframework.data.mongodb.repository.query.Distance> . getUpperBound ( ) ; if ( org.springframework.data.mongodb.repository.query.Distance != null ) { org.springframework.data.mongodb.repository.query.NearQuery . maxDistance ( org.springframework.data.mongodb.repository.query.Distance ) . in ( org.springframework.data.mongodb.repository.query.Distance . getMetric ( ) ) ; } Distance org.springframework.data.mongodb.repository.query.Distance = org.springframework.data.mongodb.repository.query.Range<org.springframework.data.mongodb.repository.query.Distance> . getLowerBound ( ) ; if ( org.springframework.data.mongodb.repository.query.Distance != null ) { org.springframework.data.mongodb.repository.query.NearQuery . minDistance ( org.springframework.data.mongodb.repository.query.Distance ) . in ( org.springframework.data.mongodb.repository.query.Distance . getMetric ( ) ) ; } Pageable org.springframework.data.mongodb.repository.query.Pageable = org.springframework.data.mongodb.repository.query.MongoParameterAccessor . getPageable ( ) ; if ( org.springframework.data.mongodb.repository.query.Pageable != null ) { org.springframework.data.mongodb.repository.query.NearQuery . with ( org.springframework.data.mongodb.repository.query.Pageable ) ; } return ( Flux ) org.springframework.data.mongodb.repository.query.ReactiveMongoOperations . geoNear ( org.springframework.data.mongodb.repository.query.NearQuery , java.lang.Class<> , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( ) { if ( ! ReactiveWrappers . supports ( org.springframework.data.mongodb.repository.query.TypeInformation<> . getType ( ) ) ) { return false ; } java.util.Optional<org.springframework.data.mongodb.repository.query.TypeInformation<?>> < TypeInformation < ? > > java.util.Optional<org.springframework.data.mongodb.repository.query.TypeInformation<?>> = org.springframework.data.mongodb.repository.query.TypeInformation<> . getComponentType ( ) ; return java.util.Optional<org.springframework.data.mongodb.repository.query.TypeInformation<?>> . isPresent ( ) && GeoResult .class . boolean ( java.util.Optional<org.springframework.data.mongodb.repository.query.TypeInformation<?>> . get ( ) . getType ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( Query org.springframework.data.mongodb.repository.query.Query , java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.String java.lang.String ) { if ( org.springframework.data.mongodb.repository.query.MongoQueryMethod . isCollectionQuery ( ) ) { return org.springframework.data.mongodb.repository.query.ReactiveMongoOperations . findAllAndRemove ( org.springframework.data.mongodb.repository.query.Query , java.lang.Class<> , java.lang.String ) ; } return org.springframework.data.mongodb.repository.query.ReactiveMongoOperations . remove ( org.springframework.data.mongodb.repository.query.Query , java.lang.Class<> , java.lang.String ) . map ( DeleteResult :: getDeletedCount ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( Query org.springframework.data.mongodb.repository.query.Query , java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.String java.lang.String ) { return org.springframework.data.mongodb.repository.query.Converter<java.lang.Object,java.lang.Object> . convert ( org.springframework.data.mongodb.repository.query.ReactiveMongoQueryExecution . java.lang.Object ( org.springframework.data.mongodb.repository.query.Query , java.lang.Class<> , java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object ) { ReturnedType org.springframework.data.mongodb.repository.query.ReturnedType = org.springframework.data.mongodb.repository.query.ResultProcessor . getReturnedType ( ) ; if ( ClassUtils . isPrimitiveOrWrapper ( org.springframework.data.mongodb.repository.query.ReturnedType . getReturnedType ( ) ) ) { return java.lang.Object ; } Converter < java.lang.Object , java.lang.Object > org.springframework.data.mongodb.repository.query.Converter<java.lang.Object,java.lang.Object> = new DtoInstantiatingConverter ( org.springframework.data.mongodb.repository.query.ReturnedType . getReturnedType ( ) , org.springframework.data.mongodb.repository.query.ReactiveMongoOperations . getConverter ( ) . getMappingContext ( ) , org.springframework.data.mongodb.repository.query.EntityInstantiators ) ; return org.springframework.data.mongodb.repository.query.ResultProcessor . processResult ( java.lang.Object , org.springframework.data.mongodb.repository.query.Converter<java.lang.Object,java.lang.Object> ) ; }  <METHOD_END>