<METHOD_START> @ Bean public org.springframework.data.couchbase.core.mapping.event.LocalValidatorFactoryBean org.springframework.data.couchbase.core.mapping.event.LocalValidatorFactoryBean ( ) { return new LocalValidatorFactoryBean ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.data.couchbase.core.mapping.event.ValidatingCouchbaseEventListener org.springframework.data.couchbase.core.mapping.event.ValidatingCouchbaseEventListener ( ) { return new ValidatingCouchbaseEventListener ( org.springframework.data.couchbase.core.mapping.event.LocalValidatorFactoryBean ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.data.couchbase.core.mapping.event.SimpleMappingEventListener org.springframework.data.couchbase.core.mapping.event.SimpleMappingEventListener ( ) { return new SimpleMappingEventListener ( ) ; }  <METHOD_END>