<METHOD_START> @ java.lang.Override public org.springframework.boot.autoconfigure.couchbase.Statement org.springframework.boot.autoconfigure.couchbase.Statement ( Statement org.springframework.boot.autoconfigure.couchbase.Statement , Description org.springframework.boot.autoconfigure.couchbase.Description ) { try { this . org.springframework.boot.autoconfigure.couchbase.CouchbaseEnvironment = DefaultCouchbaseEnvironment . create ( ) ; this . org.springframework.boot.autoconfigure.couchbase.Cluster = CouchbaseCluster . create ( this . org.springframework.boot.autoconfigure.couchbase.CouchbaseEnvironment , STRING ) ; void ( this . org.springframework.boot.autoconfigure.couchbase.Cluster ) ; return new org.springframework.boot.autoconfigure.couchbase.CouchbaseTestServer.CouchbaseStatement ( org.springframework.boot.autoconfigure.couchbase.Statement , this . org.springframework.boot.autoconfigure.couchbase.CouchbaseEnvironment , this . org.springframework.boot.autoconfigure.couchbase.Cluster ) ; } catch ( java.lang.Exception java.lang.Exception ) { org.springframework.boot.autoconfigure.couchbase.Log . info ( STRING ) ; return new org.springframework.boot.autoconfigure.couchbase.CouchbaseTestServer.SkipStatement ( ) ; } }  <METHOD_END>
<METHOD_START> private static void void ( Cluster org.springframework.boot.autoconfigure.couchbase.Cluster ) { Bucket org.springframework.boot.autoconfigure.couchbase.Bucket = org.springframework.boot.autoconfigure.couchbase.Cluster . openBucket ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; org.springframework.boot.autoconfigure.couchbase.Bucket . close ( ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.autoconfigure.couchbase.CouchbaseEnvironment org.springframework.boot.autoconfigure.couchbase.CouchbaseEnvironment ( ) { return this . org.springframework.boot.autoconfigure.couchbase.CouchbaseEnvironment ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.autoconfigure.couchbase.Cluster org.springframework.boot.autoconfigure.couchbase.Cluster ( ) { return this . org.springframework.boot.autoconfigure.couchbase.Cluster ; }  <METHOD_END>
<METHOD_START> void ( Statement org.springframework.boot.autoconfigure.couchbase.Statement , CouchbaseEnvironment org.springframework.boot.autoconfigure.couchbase.CouchbaseEnvironment , Cluster org.springframework.boot.autoconfigure.couchbase.Cluster ) { this . org.springframework.boot.autoconfigure.couchbase.Statement = org.springframework.boot.autoconfigure.couchbase.Statement ; this . org.springframework.boot.autoconfigure.couchbase.CouchbaseEnvironment = org.springframework.boot.autoconfigure.couchbase.CouchbaseEnvironment ; this . org.springframework.boot.autoconfigure.couchbase.Cluster = org.springframework.boot.autoconfigure.couchbase.Cluster ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.lang.Throwable { try { this . org.springframework.boot.autoconfigure.couchbase.Statement . evaluate ( ) ; } catch ( BeanCreationException org.springframework.boot.autoconfigure.couchbase.BeanCreationException ) { if ( STRING . boolean ( org.springframework.boot.autoconfigure.couchbase.BeanCreationException . getBeanName ( ) ) ) { throw new AssumptionViolatedException ( STRING + org.springframework.boot.autoconfigure.couchbase.BeanCreationException . getMessage ( ) , org.springframework.boot.autoconfigure.couchbase.BeanCreationException ) ; } } finally { try { this . org.springframework.boot.autoconfigure.couchbase.Cluster . disconnect ( ) ; this . org.springframework.boot.autoconfigure.couchbase.CouchbaseEnvironment . shutdownAsync ( ) ; } catch ( java.lang.Exception java.lang.Exception ) { org.springframework.boot.autoconfigure.couchbase.Log . warn ( STRING , java.lang.Exception ) ; } } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.lang.Throwable { throw new AssumptionViolatedException ( STRING ) ; }  <METHOD_END>