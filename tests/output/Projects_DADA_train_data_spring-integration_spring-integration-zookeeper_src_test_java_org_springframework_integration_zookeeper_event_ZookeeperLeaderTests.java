<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertFalse ( this . org.springframework.integration.zookeeper.event.SourcePollingChannelAdapter . isRunning ( ) ) ; LeaderEventPublisher org.springframework.integration.zookeeper.event.LeaderEventPublisher = org.springframework.integration.zookeeper.event.LeaderEventPublisher ( ) ; DefaultCandidate org.springframework.integration.zookeeper.event.DefaultCandidate = new DefaultCandidate ( STRING , STRING ) ; LeaderInitiator org.springframework.integration.zookeeper.event.LeaderInitiator = new LeaderInitiator ( this . client , org.springframework.integration.zookeeper.event.DefaultCandidate , STRING ) ; org.springframework.integration.zookeeper.event.LeaderInitiator . setLeaderEventPublisher ( org.springframework.integration.zookeeper.event.LeaderEventPublisher ) ; org.springframework.integration.zookeeper.event.LeaderInitiator . start ( ) ; DefaultCandidate org.springframework.integration.zookeeper.event.DefaultCandidate = new DefaultCandidate ( STRING , STRING ) ; LeaderInitiator org.springframework.integration.zookeeper.event.LeaderInitiator = new LeaderInitiator ( this . client , org.springframework.integration.zookeeper.event.DefaultCandidate , STRING ) ; org.springframework.integration.zookeeper.event.LeaderInitiator . setLeaderEventPublisher ( org.springframework.integration.zookeeper.event.LeaderEventPublisher ) ; org.springframework.integration.zookeeper.event.LeaderInitiator . start ( ) ; AbstractLeaderEvent org.springframework.integration.zookeeper.event.AbstractLeaderEvent = this . java.util.concurrent.BlockingQueue<org.springframework.integration.zookeeper.event.AbstractLeaderEvent> . poll ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; assertNotNull ( org.springframework.integration.zookeeper.event.AbstractLeaderEvent ) ; assertThat ( org.springframework.integration.zookeeper.event.AbstractLeaderEvent , instanceOf ( OnGrantedEvent .class ) ) ; assertTrue ( this . org.springframework.integration.zookeeper.event.SourcePollingChannelAdapter . isRunning ( ) ) ; org.springframework.integration.zookeeper.event.AbstractLeaderEvent . getContext ( ) . yield ( ) ; org.springframework.integration.zookeeper.event.AbstractLeaderEvent = this . java.util.concurrent.BlockingQueue<org.springframework.integration.zookeeper.event.AbstractLeaderEvent> . poll ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; assertNotNull ( org.springframework.integration.zookeeper.event.AbstractLeaderEvent ) ; assertThat ( org.springframework.integration.zookeeper.event.AbstractLeaderEvent , instanceOf ( OnRevokedEvent .class ) ) ; assertFalse ( this . org.springframework.integration.zookeeper.event.SourcePollingChannelAdapter . isRunning ( ) ) ; this . java.util.concurrent.CountDownLatch . void ( ) ; org.springframework.integration.zookeeper.event.AbstractLeaderEvent = this . java.util.concurrent.BlockingQueue<org.springframework.integration.zookeeper.event.AbstractLeaderEvent> . poll ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; assertNotNull ( org.springframework.integration.zookeeper.event.AbstractLeaderEvent ) ; assertThat ( org.springframework.integration.zookeeper.event.AbstractLeaderEvent , instanceOf ( OnGrantedEvent .class ) ) ; assertTrue ( this . org.springframework.integration.zookeeper.event.SourcePollingChannelAdapter . isRunning ( ) ) ; org.springframework.integration.zookeeper.event.LeaderInitiator . stop ( ) ; org.springframework.integration.zookeeper.event.LeaderInitiator . stop ( ) ; org.springframework.integration.zookeeper.event.AbstractLeaderEvent = this . java.util.concurrent.BlockingQueue<org.springframework.integration.zookeeper.event.AbstractLeaderEvent> . poll ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; assertNotNull ( org.springframework.integration.zookeeper.event.AbstractLeaderEvent ) ; assertThat ( org.springframework.integration.zookeeper.event.AbstractLeaderEvent , instanceOf ( OnRevokedEvent .class ) ) ; assertFalse ( this . org.springframework.integration.zookeeper.event.SourcePollingChannelAdapter . isRunning ( ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.integration.zookeeper.event.LeaderEventPublisher org.springframework.integration.zookeeper.event.LeaderEventPublisher ( ) { return new DefaultLeaderEventPublisher ( new ApplicationEventPublisher ( ) { volatile boolean boolean ; @ java.lang.Override public void void ( java.lang.Object java.lang.Object ) {			} @ java.lang.Override public void void ( ApplicationEvent org.springframework.integration.zookeeper.event.ApplicationEvent ) { AbstractLeaderEvent org.springframework.integration.zookeeper.event.AbstractLeaderEvent = ( AbstractLeaderEvent ) org.springframework.integration.zookeeper.event.ApplicationEvent ; if ( this . boolean ) { try { java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; } catch ( java.lang.InterruptedException java.lang.InterruptedException ) { java.lang.Thread . java.lang.Thread ( ) . void ( ) ; throw new java.lang.RuntimeException ( java.lang.InterruptedException ) ; } } boolean = org.springframework.integration.zookeeper.event.ApplicationEvent instanceof OnRevokedEvent ; org.springframework.integration.zookeeper.event.SmartLifecycleRoleController . onApplicationEvent ( ( AbstractLeaderEvent ) org.springframework.integration.zookeeper.event.ApplicationEvent ) ; java.util.concurrent.BlockingQueue<org.springframework.integration.zookeeper.event.AbstractLeaderEvent> . add ( org.springframework.integration.zookeeper.event.AbstractLeaderEvent ) ; } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object ) {			}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ApplicationEvent org.springframework.integration.zookeeper.event.ApplicationEvent ) { AbstractLeaderEvent org.springframework.integration.zookeeper.event.AbstractLeaderEvent = ( AbstractLeaderEvent ) org.springframework.integration.zookeeper.event.ApplicationEvent ; if ( this . boolean ) { try { java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; } catch ( java.lang.InterruptedException java.lang.InterruptedException ) { java.lang.Thread . java.lang.Thread ( ) . void ( ) ; throw new java.lang.RuntimeException ( java.lang.InterruptedException ) ; } } boolean = org.springframework.integration.zookeeper.event.ApplicationEvent instanceof OnRevokedEvent ; org.springframework.integration.zookeeper.event.SmartLifecycleRoleController . onApplicationEvent ( ( AbstractLeaderEvent ) org.springframework.integration.zookeeper.event.ApplicationEvent ) ; java.util.concurrent.BlockingQueue<org.springframework.integration.zookeeper.event.AbstractLeaderEvent> . add ( org.springframework.integration.zookeeper.event.AbstractLeaderEvent ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.integration.zookeeper.event.SourcePollingChannelAdapter org.springframework.integration.zookeeper.event.SourcePollingChannelAdapter ( ) { SourcePollingChannelAdapter org.springframework.integration.zookeeper.event.SourcePollingChannelAdapter = new SourcePollingChannelAdapter ( ) ; org.springframework.integration.zookeeper.event.SourcePollingChannelAdapter . setSource ( mock ( MessageSource .class ) ) ; org.springframework.integration.zookeeper.event.SourcePollingChannelAdapter . setOutputChannel ( new QueueChannel ( ) ) ; org.springframework.integration.zookeeper.event.SourcePollingChannelAdapter . setTrigger ( mock ( Trigger .class ) ) ; org.springframework.integration.zookeeper.event.SourcePollingChannelAdapter . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.zookeeper.event.SourcePollingChannelAdapter . setTaskScheduler ( mock ( TaskScheduler .class ) ) ; org.springframework.integration.zookeeper.event.SourcePollingChannelAdapter . afterPropertiesSet ( ) ; return org.springframework.integration.zookeeper.event.SourcePollingChannelAdapter ; }  <METHOD_END>