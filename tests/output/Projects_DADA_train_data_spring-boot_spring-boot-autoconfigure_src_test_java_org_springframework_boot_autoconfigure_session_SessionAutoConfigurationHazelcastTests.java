<METHOD_START> @ Test public void void ( ) { load ( java.util.Collections .< java.lang.Class<?> < ? > > java.util.List<java.lang.Class<?>> ( org.springframework.boot.autoconfigure.session.SessionAutoConfigurationHazelcastTests.HazelcastConfiguration .class ) , STRING ) ; validateSessionRepository ( HazelcastSessionRepository .class ) ; HazelcastInstance org.springframework.boot.autoconfigure.session.HazelcastInstance = this . context . getBean ( HazelcastInstance .class ) ; verify ( org.springframework.boot.autoconfigure.session.HazelcastInstance , times ( NUMBER ) ) . getMap ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { load ( java.util.Collections .< java.lang.Class<?> < ? > > java.util.List<java.lang.Class<?>> ( org.springframework.boot.autoconfigure.session.SessionAutoConfigurationHazelcastTests.HazelcastConfiguration .class ) , STRING , STRING ) ; validateSessionRepository ( HazelcastSessionRepository .class ) ; HazelcastInstance org.springframework.boot.autoconfigure.session.HazelcastInstance = this . context . getBean ( HazelcastInstance .class ) ; verify ( org.springframework.boot.autoconfigure.session.HazelcastInstance , times ( NUMBER ) ) . getMap ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { load ( java.util.Collections .< java.lang.Class<?> < ? > > java.util.List<java.lang.Class<?>> ( org.springframework.boot.autoconfigure.session.SessionAutoConfigurationHazelcastTests.HazelcastConfiguration .class ) , STRING , STRING ) ; HazelcastSessionRepository org.springframework.boot.autoconfigure.session.HazelcastSessionRepository = validateSessionRepository ( HazelcastSessionRepository .class ) ; assertThat ( new DirectFieldAccessor ( org.springframework.boot.autoconfigure.session.HazelcastSessionRepository ) . getPropertyValue ( STRING ) ) . isEqualTo ( HazelcastFlushMode . IMMEDIATE ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ java.lang.SuppressWarnings ( STRING ) public org.springframework.boot.autoconfigure.session.HazelcastInstance org.springframework.boot.autoconfigure.session.HazelcastInstance ( ) { IMap < java.lang.Object , java.lang.Object > org.springframework.boot.autoconfigure.session.IMap<java.lang.Object,java.lang.Object> = mock ( IMap .class ) ; HazelcastInstance org.springframework.boot.autoconfigure.session.HazelcastInstance = mock ( HazelcastInstance .class ) ; given ( org.springframework.boot.autoconfigure.session.HazelcastInstance . getMap ( STRING ) ) . willReturn ( org.springframework.boot.autoconfigure.session.IMap<java.lang.Object,java.lang.Object> ) ; given ( org.springframework.boot.autoconfigure.session.HazelcastInstance . getMap ( STRING ) ) . willReturn ( org.springframework.boot.autoconfigure.session.IMap<java.lang.Object,java.lang.Object> ) ; return org.springframework.boot.autoconfigure.session.HazelcastInstance ; }  <METHOD_END>