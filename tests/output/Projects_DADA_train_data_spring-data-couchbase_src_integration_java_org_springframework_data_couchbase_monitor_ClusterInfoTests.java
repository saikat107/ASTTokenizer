<METHOD_START> @ Before public void void ( ) java.lang.Exception { org.springframework.data.couchbase.monitor.ClusterInfo = new ClusterInfo ( org.springframework.data.couchbase.monitor.Bucket ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.couchbase.monitor.ClusterInfo . getTotalDiskAssigned ( ) , greaterThan ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.couchbase.monitor.ClusterInfo . getTotalRAMUsed ( ) , greaterThan ( NUMBER ) ) ; }  <METHOD_END>
