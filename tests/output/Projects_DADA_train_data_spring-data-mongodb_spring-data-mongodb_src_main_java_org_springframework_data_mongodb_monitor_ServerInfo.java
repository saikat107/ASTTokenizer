<METHOD_START> public void ( MongoClient org.springframework.data.mongodb.monitor.MongoClient ) { super( org.springframework.data.mongodb.monitor.MongoClient ); }  <METHOD_END>
<METHOD_START> @ ManagedOperation ( description = STRING ) public java.lang.String java.lang.String ( ) java.net.UnknownHostException { return getMongoClient ( ) . getAddress ( ) . getHost ( ) ; }  <METHOD_END>
<METHOD_START> @ ManagedMetric ( displayName = STRING ) public double double ( ) { return ( java.lang.Double ) getServerStatus ( ) . get ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ ManagedOperation ( description = STRING ) public java.lang.String java.lang.String ( ) { return ( java.lang.String ) getServerStatus ( ) . get ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ ManagedOperation ( description = STRING ) public java.lang.String java.lang.String ( ) { return ( java.lang.String ) getServerStatus ( ) . get ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ ManagedMetric ( metricType = MetricType . COUNTER , displayName = STRING , unit = STRING ) public double double ( ) { return ( java.lang.Double ) getServerStatus ( ) . get ( STRING ) ; }  <METHOD_END>
