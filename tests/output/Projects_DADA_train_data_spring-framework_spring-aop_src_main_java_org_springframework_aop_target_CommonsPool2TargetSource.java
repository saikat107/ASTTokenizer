<METHOD_START> public void ( ) { setMaxSize ( GenericObjectPoolConfig . DEFAULT_MAX_TOTAL ) ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { this . int = int ; }  <METHOD_END>
<METHOD_START> public int int ( ) { return this . int ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { this . int = int ; }  <METHOD_END>
<METHOD_START> public int int ( ) { return this . int ; }  <METHOD_END>
<METHOD_START> public void void ( long long ) { this . long = long ; }  <METHOD_END>
<METHOD_START> public long long ( ) { return this . long ; }  <METHOD_END>
<METHOD_START> public void void ( long long ) { this . long = long ; }  <METHOD_END>
<METHOD_START> public long long ( ) { return this . long ; }  <METHOD_END>
<METHOD_START> public void void ( long long ) { this . long = long ; }  <METHOD_END>
<METHOD_START> public long long ( ) { return this . long ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected final void void ( ) { logger . debug ( STRING ) ; this . org.springframework.aop.target.ObjectPool = org.springframework.aop.target.ObjectPool ( ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.aop.target.ObjectPool org.springframework.aop.target.ObjectPool ( ) { GenericObjectPoolConfig org.springframework.aop.target.GenericObjectPoolConfig = new GenericObjectPoolConfig ( ) ; org.springframework.aop.target.GenericObjectPoolConfig . setMaxTotal ( getMaxSize ( ) ) ; org.springframework.aop.target.GenericObjectPoolConfig . setMaxIdle ( int ( ) ) ; org.springframework.aop.target.GenericObjectPoolConfig . setMinIdle ( int ( ) ) ; org.springframework.aop.target.GenericObjectPoolConfig . setMaxWaitMillis ( long ( ) ) ; org.springframework.aop.target.GenericObjectPoolConfig . setTimeBetweenEvictionRunsMillis ( long ( ) ) ; org.springframework.aop.target.GenericObjectPoolConfig . setMinEvictableIdleTimeMillis ( long ( ) ) ; org.springframework.aop.target.GenericObjectPoolConfig . setBlockWhenExhausted ( boolean ( ) ) ; return new GenericObjectPool ( this , org.springframework.aop.target.GenericObjectPoolConfig ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( ) java.lang.Exception { return this . org.springframework.aop.target.ObjectPool . borrowObject ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object ) throws java.lang.Exception { this . org.springframework.aop.target.ObjectPool . returnObject ( java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) java.lang.UnsupportedOperationException { return this . org.springframework.aop.target.ObjectPool . getNumActive ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) java.lang.UnsupportedOperationException { return this . org.springframework.aop.target.ObjectPool . getNumIdle ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.lang.Exception { logger . debug ( STRING ) ; this . org.springframework.aop.target.ObjectPool . close ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.aop.target.PooledObject<java.lang.Object> < java.lang.Object > org.springframework.aop.target.PooledObject<java.lang.Object> ( ) java.lang.Exception { return new DefaultPooledObject <> ( newPrototypeInstance ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( PooledObject < java.lang.Object > org.springframework.aop.target.PooledObject<java.lang.Object> ) throws java.lang.Exception { destroyPrototypeInstance ( org.springframework.aop.target.PooledObject<java.lang.Object> . getObject ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( PooledObject < java.lang.Object > org.springframework.aop.target.PooledObject<java.lang.Object> ) { return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( PooledObject < java.lang.Object > org.springframework.aop.target.PooledObject<java.lang.Object> ) throws java.lang.Exception {	}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( PooledObject < java.lang.Object > org.springframework.aop.target.PooledObject<java.lang.Object> ) throws java.lang.Exception {	}  <METHOD_END>
