<METHOD_START> @ java.lang.Override public java.lang.Class<?> < ? > java.lang.Class<?> ( ) { return DefaultCouchbaseEnvironment .class ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.data.couchbase.config.CouchbaseEnvironment org.springframework.data.couchbase.config.CouchbaseEnvironment ( ) java.lang.Exception { return org.springframework.data.couchbase.config.Builder . build ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { if ( java.lang.String . boolean ( java.lang.String ) ) { this . org.springframework.data.couchbase.config.Builder . retryStrategy ( FailFastRetryStrategy . INSTANCE ) ; } else if ( java.lang.String . boolean ( java.lang.String ) ) { this . org.springframework.data.couchbase.config.Builder . retryStrategy ( BestEffortRetryStrategy . INSTANCE ) ; } }  <METHOD_END>
<METHOD_START> public void void ( long long ) { this . org.springframework.data.couchbase.config.Builder . managementTimeout ( long ) ; }  <METHOD_END>
<METHOD_START> public void void ( long long ) { this . org.springframework.data.couchbase.config.Builder . queryTimeout ( long ) ; }  <METHOD_END>
<METHOD_START> public void void ( long long ) { this . org.springframework.data.couchbase.config.Builder . viewTimeout ( long ) ; }  <METHOD_END>
<METHOD_START> public void void ( long long ) { this . org.springframework.data.couchbase.config.Builder . kvTimeout ( long ) ; }  <METHOD_END>
<METHOD_START> public void void ( long long ) { this . org.springframework.data.couchbase.config.Builder . connectTimeout ( long ) ; }  <METHOD_END>
<METHOD_START> public void void ( long long ) { this . org.springframework.data.couchbase.config.Builder . disconnectTimeout ( long ) ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . org.springframework.data.couchbase.config.Builder . dnsSrvEnabled ( boolean ) ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . org.springframework.data.couchbase.config.Builder . dcpEnabled ( boolean ) ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . org.springframework.data.couchbase.config.Builder . sslEnabled ( boolean ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . org.springframework.data.couchbase.config.Builder . sslKeystoreFile ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . org.springframework.data.couchbase.config.Builder . sslKeystorePassword ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . org.springframework.data.couchbase.config.Builder . bootstrapHttpEnabled ( boolean ) ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . org.springframework.data.couchbase.config.Builder . bootstrapCarrierEnabled ( boolean ) ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { this . org.springframework.data.couchbase.config.Builder . bootstrapHttpDirectPort ( int ) ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { this . org.springframework.data.couchbase.config.Builder . bootstrapHttpSslPort ( int ) ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { this . org.springframework.data.couchbase.config.Builder . bootstrapCarrierDirectPort ( int ) ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { this . org.springframework.data.couchbase.config.Builder . bootstrapCarrierSslPort ( int ) ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { this . org.springframework.data.couchbase.config.Builder . ioPoolSize ( int ) ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { this . org.springframework.data.couchbase.config.Builder . computationPoolSize ( int ) ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { this . org.springframework.data.couchbase.config.Builder . responseBufferSize ( int ) ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { this . org.springframework.data.couchbase.config.Builder . requestBufferSize ( int ) ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { this . org.springframework.data.couchbase.config.Builder . kvEndpoints ( int ) ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { this . org.springframework.data.couchbase.config.Builder . viewEndpoints ( int ) ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { this . org.springframework.data.couchbase.config.Builder . queryEndpoints ( int ) ; }  <METHOD_END>
<METHOD_START> public void void ( long long ) { this . org.springframework.data.couchbase.config.Builder . maxRequestLifetime ( long ) ; }  <METHOD_END>
<METHOD_START> public void void ( long long ) { this . org.springframework.data.couchbase.config.Builder . keepAliveInterval ( long ) ; }  <METHOD_END>
<METHOD_START> public void void ( long long ) { this . org.springframework.data.couchbase.config.Builder . autoreleaseAfter ( long ) ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . org.springframework.data.couchbase.config.Builder . bufferPoolingEnabled ( boolean ) ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . org.springframework.data.couchbase.config.Builder . tcpNodelayEnabled ( boolean ) ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . org.springframework.data.couchbase.config.Builder . mutationTokensEnabled ( boolean ) ; }  <METHOD_END>
