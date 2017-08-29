<METHOD_START> public void ( java.lang.String java.lang.String ) { this( java.lang.String , new ExponentialBackoffRetry ( NUMBER , NUMBER ) ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , RetryPolicy org.springframework.integration.zookeeper.config.RetryPolicy ) { Assert . notNull ( java.lang.String , STRING ) ; Assert . notNull ( org.springframework.integration.zookeeper.config.RetryPolicy , STRING ) ; this . org.springframework.integration.zookeeper.config.CuratorFramework = CuratorFrameworkFactory . newClient ( java.lang.String , org.springframework.integration.zookeeper.config.RetryPolicy ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return this . int ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { this . int = int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { synchronized ( this . java.lang.Object ) { if ( ! this . boolean ) { if ( this . org.springframework.integration.zookeeper.config.CuratorFramework != null ) { this . org.springframework.integration.zookeeper.config.CuratorFramework . start ( ) ; } this . boolean = true ; } } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { synchronized ( this . java.lang.Object ) { if ( this . boolean ) { CloseableUtils . closeQuietly ( this . org.springframework.integration.zookeeper.config.CuratorFramework ) ; this . boolean = false ; } } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Runnable java.lang.Runnable ) { void ( ) ; java.lang.Runnable . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.zookeeper.config.CuratorFramework org.springframework.integration.zookeeper.config.CuratorFramework ( ) java.lang.Exception { return this . org.springframework.integration.zookeeper.config.CuratorFramework ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Class<?> < ? > java.lang.Class<?> ( ) { return CuratorFramework .class ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return true ; }  <METHOD_END>
