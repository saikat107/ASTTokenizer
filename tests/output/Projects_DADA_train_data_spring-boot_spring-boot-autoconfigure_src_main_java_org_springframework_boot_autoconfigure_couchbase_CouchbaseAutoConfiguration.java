<METHOD_START> public void ( CouchbaseProperties org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties ) { this . org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties = org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties ; }  <METHOD_END>
<METHOD_START> @ Bean @ Primary public org.springframework.boot.autoconfigure.couchbase.DefaultCouchbaseEnvironment org.springframework.boot.autoconfigure.couchbase.DefaultCouchbaseEnvironment ( ) java.lang.Exception { return DefaultCouchbaseEnvironment.Builder ( this . org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties ) . build ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ Primary public org.springframework.boot.autoconfigure.couchbase.Cluster org.springframework.boot.autoconfigure.couchbase.Cluster ( ) java.lang.Exception { return CouchbaseCluster . create ( org.springframework.boot.autoconfigure.couchbase.DefaultCouchbaseEnvironment ( ) , this . org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties . getBootstrapHosts ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ Primary @ DependsOn ( STRING ) public org.springframework.boot.autoconfigure.couchbase.ClusterInfo org.springframework.boot.autoconfigure.couchbase.ClusterInfo ( ) java.lang.Exception { return org.springframework.boot.autoconfigure.couchbase.Cluster ( ) . clusterManager ( this . org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties . getBucket ( ) . getName ( ) , this . org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties . getBucket ( ) . getPassword ( ) ) . info ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ Primary public org.springframework.boot.autoconfigure.couchbase.Bucket org.springframework.boot.autoconfigure.couchbase.Bucket ( ) java.lang.Exception { return org.springframework.boot.autoconfigure.couchbase.Cluster ( ) . openBucket ( this . org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties . getBucket ( ) . getName ( ) , this . org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties . getBucket ( ) . getPassword ( ) ) ; }  <METHOD_END>
<METHOD_START> protected DefaultCouchbaseEnvironment . DefaultCouchbaseEnvironment.Builder DefaultCouchbaseEnvironment.Builder ( CouchbaseProperties org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties ) { CouchbaseProperties . CouchbaseProperties CouchbaseProperties.Endpoints = org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties . getEnv ( ) . getEndpoints ( ) ; CouchbaseProperties . CouchbaseProperties CouchbaseProperties.Timeouts = org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties . getEnv ( ) . getTimeouts ( ) ; DefaultCouchbaseEnvironment . DefaultCouchbaseEnvironment DefaultCouchbaseEnvironment.Builder = DefaultCouchbaseEnvironment . builder ( ) . connectTimeout ( CouchbaseProperties.Timeouts . getConnect ( ) ) . kvEndpoints ( CouchbaseProperties.Endpoints . getKeyValue ( ) ) . kvTimeout ( CouchbaseProperties.Timeouts . getKeyValue ( ) ) . queryEndpoints ( CouchbaseProperties.Endpoints . getQuery ( ) ) . queryTimeout ( CouchbaseProperties.Timeouts . getQuery ( ) ) . viewEndpoints ( CouchbaseProperties.Endpoints . getView ( ) ) . socketConnectTimeout ( CouchbaseProperties.Timeouts . getSocketConnect ( ) ) . viewTimeout ( CouchbaseProperties.Timeouts . getView ( ) ) ; CouchbaseProperties . CouchbaseProperties CouchbaseProperties.Ssl = org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties . getEnv ( ) . getSsl ( ) ; if ( CouchbaseProperties.Ssl . getEnabled ( ) ) { DefaultCouchbaseEnvironment.Builder . sslEnabled ( true ) ; if ( CouchbaseProperties.Ssl . getKeyStore ( ) != null ) { DefaultCouchbaseEnvironment.Builder . sslKeystoreFile ( CouchbaseProperties.Ssl . getKeyStore ( ) ) ; } if ( CouchbaseProperties.Ssl . getKeyStorePassword ( ) != null ) { DefaultCouchbaseEnvironment.Builder . sslKeystorePassword ( CouchbaseProperties.Ssl . getKeyStorePassword ( ) ) ; } } return DefaultCouchbaseEnvironment.Builder ; }  <METHOD_END>
<METHOD_START> void ( ) { super( ConfigurationPhase . REGISTER_BEAN ); }  <METHOD_END>