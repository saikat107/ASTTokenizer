<METHOD_START> @ Test public void void ( ) java.lang.Exception { ZookeeperLockRegistry org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry = new ZookeeperLockRegistry ( this . client ) ; for ( int int = NUMBER ; int < NUMBER ; int ++ ) { java.util.concurrent.locks.Lock java.util.concurrent.locks.Lock = org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry . obtain ( STRING ) ; java.util.concurrent.locks.Lock . void ( ) ; try { assertEquals ( NUMBER , TestUtils . getPropertyValue ( org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry , STRING , java.util.Map .class ) . size ( ) ) ; } finally { java.util.concurrent.locks.Lock . void ( ) ; } } java.lang.Thread . void ( NUMBER ) ; org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry . expireUnusedOlderThan ( NUMBER ) ; assertEquals ( NUMBER , TestUtils . getPropertyValue ( org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry , STRING , java.util.Map .class ) . size ( ) ) ; org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry . destroy ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ZookeeperLockRegistry org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry = new ZookeeperLockRegistry ( this . client ) ; for ( int int = NUMBER ; int < NUMBER ; int ++ ) { java.util.concurrent.locks.Lock java.util.concurrent.locks.Lock = org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry . obtain ( STRING ) ; java.util.concurrent.locks.Lock . void ( ) ; try { assertEquals ( NUMBER , TestUtils . getPropertyValue ( org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry , STRING , java.util.Map .class ) . size ( ) ) ; } finally { java.util.concurrent.locks.Lock . void ( ) ; } } org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry . destroy ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ZookeeperLockRegistry org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry = new ZookeeperLockRegistry ( this . client ) ; for ( int int = NUMBER ; int < NUMBER ; int ++ ) { java.util.concurrent.locks.Lock java.util.concurrent.locks.Lock = org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry . obtain ( STRING ) ; java.util.concurrent.locks.Lock . void ( ) ; try { java.util.concurrent.locks.Lock java.util.concurrent.locks.Lock = org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry . obtain ( STRING ) ; assertSame ( java.util.concurrent.locks.Lock , java.util.concurrent.locks.Lock ) ; java.util.concurrent.locks.Lock . void ( ) ; java.util.concurrent.locks.Lock . void ( ) ; } finally { java.util.concurrent.locks.Lock . void ( ) ; } } org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry . destroy ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ZookeeperLockRegistry org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry = new ZookeeperLockRegistry ( this . client ) ; for ( int int = NUMBER ; int < NUMBER ; int ++ ) { java.util.concurrent.locks.Lock java.util.concurrent.locks.Lock = org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry . obtain ( STRING ) ; java.util.concurrent.locks.Lock . void ( ) ; try { java.util.concurrent.locks.Lock java.util.concurrent.locks.Lock = org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry . obtain ( STRING ) ; assertSame ( java.util.concurrent.locks.Lock , java.util.concurrent.locks.Lock ) ; java.util.concurrent.locks.Lock . void ( ) ; java.util.concurrent.locks.Lock . void ( ) ; } finally { java.util.concurrent.locks.Lock . void ( ) ; } } org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry . destroy ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ZookeeperLockRegistry org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry = new ZookeeperLockRegistry ( this . client ) ; for ( int int = NUMBER ; int < NUMBER ; int ++ ) { java.util.concurrent.locks.Lock java.util.concurrent.locks.Lock = org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry . obtain ( STRING ) ; java.util.concurrent.locks.Lock . void ( ) ; try { java.util.concurrent.locks.Lock java.util.concurrent.locks.Lock = org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry . obtain ( STRING ) ; assertNotSame ( java.util.concurrent.locks.Lock , java.util.concurrent.locks.Lock ) ; java.util.concurrent.locks.Lock . void ( ) ; java.util.concurrent.locks.Lock . void ( ) ; } finally { java.util.concurrent.locks.Lock . void ( ) ; } } org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry . destroy ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { final ZookeeperLockRegistry org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry = new ZookeeperLockRegistry ( this . client ) ; final java.util.concurrent.locks.Lock java.util.concurrent.locks.Lock = org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry . obtain ( STRING ) ; java.util.concurrent.locks.Lock . void ( ) ; final java.util.concurrent.atomic.AtomicBoolean java.util.concurrent.atomic.AtomicBoolean = new java.util.concurrent.atomic.AtomicBoolean ( ) ; final java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; java.util.concurrent.Future<java.lang.Object> < java.lang.Object > java.util.concurrent.Future<java.lang.Object> = java.util.concurrent.Executors . java.util.concurrent.ExecutorService ( ) . java.util.concurrent.Future<T> ( ( ) { java.util.concurrent.locks.Lock java.util.concurrent.locks.Lock = org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry . obtain ( STRING ) ; java.util.concurrent.atomic.AtomicBoolean . void ( java.util.concurrent.locks.Lock . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; java.util.concurrent.CountDownLatch . void ( ) ; try { java.util.concurrent.locks.Lock . void ( ) ; } catch ( MessagingException org.springframework.integration.zookeeper.lock.MessagingException ) { return org.springframework.integration.zookeeper.lock.MessagingException . getCause ( ) ; } return null ; } ) ; assertTrue ( java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; assertFalse ( java.util.concurrent.atomic.AtomicBoolean . boolean ( ) ) ; java.util.concurrent.locks.Lock . void ( ) ; java.lang.Object java.lang.Object = java.util.concurrent.Future<java.lang.Object> . java.lang.Object ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; assertThat ( java.lang.Object , instanceOf ( java.lang.IllegalMonitorStateException .class ) ) ; assertThat ( ( ( java.lang.Exception ) java.lang.Object ) . java.lang.String ( ) , containsString ( STRING ) ) ; org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry . destroy ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { final ZookeeperLockRegistry org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry = new ZookeeperLockRegistry ( this . client ) ; final java.util.concurrent.locks.Lock java.util.concurrent.locks.Lock = org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry . obtain ( STRING ) ; final java.util.concurrent.atomic.AtomicBoolean java.util.concurrent.atomic.AtomicBoolean = new java.util.concurrent.atomic.AtomicBoolean ( ) ; final java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; final java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; final java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; java.util.concurrent.locks.Lock . void ( ) ; java.util.concurrent.Executors . java.util.concurrent.ExecutorService ( ) . void ( ( ) { java.util.concurrent.locks.Lock java.util.concurrent.locks.Lock = org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry . obtain ( STRING ) ; try { java.util.concurrent.CountDownLatch . void ( ) ; java.util.concurrent.locks.Lock . void ( ) ; java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; java.util.concurrent.atomic.AtomicBoolean . void ( true ) ; } catch ( java.lang.InterruptedException java.lang.InterruptedException ) { java.lang.Thread . java.lang.Thread ( ) . void ( ) ; } finally { java.util.concurrent.locks.Lock . void ( ) ; java.util.concurrent.CountDownLatch . void ( ) ; } } ) ; assertTrue ( java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; assertFalse ( java.util.concurrent.atomic.AtomicBoolean . boolean ( ) ) ; java.util.concurrent.locks.Lock . void ( ) ; java.util.concurrent.CountDownLatch . void ( ) ; assertTrue ( java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; assertTrue ( java.util.concurrent.atomic.AtomicBoolean . boolean ( ) ) ; org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry . destroy ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { final ZookeeperLockRegistry org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry = new ZookeeperLockRegistry ( this . client ) ; final ZookeeperLockRegistry org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry = new ZookeeperLockRegistry ( this . client ) ; final java.util.concurrent.locks.Lock java.util.concurrent.locks.Lock = org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry . obtain ( STRING ) ; final java.util.concurrent.atomic.AtomicBoolean java.util.concurrent.atomic.AtomicBoolean = new java.util.concurrent.atomic.AtomicBoolean ( ) ; final java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; final java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; final java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; java.util.concurrent.locks.Lock . void ( ) ; java.util.concurrent.Executors . java.util.concurrent.ExecutorService ( ) . void ( ( ) { java.util.concurrent.locks.Lock java.util.concurrent.locks.Lock = org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry . obtain ( STRING ) ; try { java.util.concurrent.CountDownLatch . void ( ) ; java.util.concurrent.locks.Lock . void ( ) ; java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; java.util.concurrent.atomic.AtomicBoolean . void ( true ) ; } catch ( java.lang.InterruptedException java.lang.InterruptedException ) { java.lang.Thread . java.lang.Thread ( ) . void ( ) ; } finally { java.util.concurrent.locks.Lock . void ( ) ; java.util.concurrent.CountDownLatch . void ( ) ; } } ) ; assertTrue ( java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; assertFalse ( java.util.concurrent.atomic.AtomicBoolean . boolean ( ) ) ; java.util.concurrent.locks.Lock . void ( ) ; java.util.concurrent.CountDownLatch . void ( ) ; assertTrue ( java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; assertTrue ( java.util.concurrent.atomic.AtomicBoolean . boolean ( ) ) ; org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry . destroy ( ) ; org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry . destroy ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { final ZookeeperLockRegistry org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry = new ZookeeperLockRegistry ( this . client ) ; final java.util.concurrent.locks.Lock java.util.concurrent.locks.Lock = org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry . obtain ( STRING ) ; java.util.concurrent.locks.Lock . void ( ) ; final java.util.concurrent.atomic.AtomicBoolean java.util.concurrent.atomic.AtomicBoolean = new java.util.concurrent.atomic.AtomicBoolean ( ) ; final java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; java.util.concurrent.Future<java.lang.Object> < java.lang.Object > java.util.concurrent.Future<java.lang.Object> = java.util.concurrent.Executors . java.util.concurrent.ExecutorService ( ) . java.util.concurrent.Future<java.lang.Object> ( ( ) { try { java.util.concurrent.locks.Lock . void ( ) ; } catch ( java.lang.Exception java.lang.Exception ) { java.util.concurrent.CountDownLatch . void ( ) ; return java.lang.Exception . java.lang.Throwable ( ) ; } return null ; } ) ; assertTrue ( java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; assertFalse ( java.util.concurrent.atomic.AtomicBoolean . boolean ( ) ) ; java.util.concurrent.locks.Lock . void ( ) ; java.lang.Object java.lang.Object = java.util.concurrent.Future<java.lang.Object> . java.lang.Object ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; assertThat ( java.lang.Object , instanceOf ( java.lang.IllegalMonitorStateException .class ) ) ; assertThat ( ( ( java.lang.Exception ) java.lang.Object ) . java.lang.String ( ) , containsString ( STRING ) ) ; org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry . destroy ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ZookeeperLockRegistry org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry = new ZookeeperLockRegistry ( this . client , key -> STRING ) ; for ( int int = NUMBER ; int < NUMBER ; int ++ ) { java.util.concurrent.locks.Lock java.util.concurrent.locks.Lock = org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry . obtain ( STRING ) ; java.util.concurrent.locks.Lock . void ( ) ; try { assertEquals ( NUMBER , TestUtils . getPropertyValue ( org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry , STRING , java.util.Map .class ) . size ( ) ) ; } finally { java.util.concurrent.locks.Lock . void ( ) ; } } java.lang.Thread . void ( NUMBER ) ; try { org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry . expireUnusedOlderThan ( NUMBER ) ; fail ( STRING ) ; } catch ( java.lang.IllegalStateException java.lang.IllegalStateException ) { assertThat ( java.lang.IllegalStateException . java.lang.String ( ) , containsString ( STRING ) ) ; } assertEquals ( NUMBER , TestUtils . getPropertyValue ( org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry , STRING , java.util.Map .class ) . size ( ) ) ; org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry . destroy ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ZookeeperLockRegistry org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry = new ZookeeperLockRegistry ( this . client ) ; java.util.concurrent.locks.Lock java.util.concurrent.locks.Lock = org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry . obtain ( STRING ) ; java.util.concurrent.locks.Lock . void ( ) ; testingServer . stop ( ) ; java.util.concurrent.locks.Lock java.util.concurrent.locks.Lock = org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry . obtain ( STRING ) ; assertFalse ( STRING , java.util.concurrent.locks.Lock . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; testingServer . restart ( ) ; assertTrue ( STRING , java.util.concurrent.locks.Lock . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; assertTrue ( STRING , java.util.concurrent.locks.Lock . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; java.util.concurrent.locks.Lock java.util.concurrent.locks.Lock = org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry . obtain ( STRING ) ; assertTrue ( STRING , java.util.concurrent.locks.Lock . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; java.util.concurrent.locks.Lock . void ( ) ; java.util.concurrent.locks.Lock . void ( ) ; java.util.concurrent.locks.Lock . void ( ) ; java.util.concurrent.locks.Lock . void ( ) ; org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry . destroy ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ZookeeperLockRegistry org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry = new ZookeeperLockRegistry ( this . client ) ; for ( int int = NUMBER ; int < NUMBER ; int ++ ) { java.util.concurrent.locks.Lock java.util.concurrent.locks.Lock = org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry . obtain ( STRING ) ; int int = NUMBER ; while ( ! java.util.concurrent.locks.Lock . boolean ( ) && int ++ < NUMBER ) { java.lang.Thread . void ( NUMBER ) ; } assertThat ( int , lessThan ( NUMBER ) ) ; java.util.concurrent.locks.Lock . void ( ) ; } org.springframework.integration.zookeeper.lock.ZookeeperLockRegistry . destroy ( ) ; }  <METHOD_END>