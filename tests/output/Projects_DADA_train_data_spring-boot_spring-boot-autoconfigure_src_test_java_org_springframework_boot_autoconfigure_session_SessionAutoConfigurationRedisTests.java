<METHOD_START> @ Test public void void ( ) { load ( java.util.Collections .< java.lang.Class<?> < ? > > java.util.List<java.lang.Class<?>> ( RedisAutoConfiguration .class ) , STRING ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( ) { RedisOperationsSessionRepository org.springframework.boot.autoconfigure.session.RedisOperationsSessionRepository = validateSessionRepository ( RedisOperationsSessionRepository .class ) ; assertThat ( org.springframework.boot.autoconfigure.session.RedisOperationsSessionRepository . getSessionCreatedChannelPrefix ( ) ) . isEqualTo ( STRING ) ; assertThat ( new DirectFieldAccessor ( org.springframework.boot.autoconfigure.session.RedisOperationsSessionRepository ) . getPropertyValue ( STRING ) ) . isEqualTo ( RedisFlushMode . ON_SAVE ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { load ( java.util.Collections .< java.lang.Class<?> < ? > > java.util.List<java.lang.Class<?>> ( RedisAutoConfiguration .class ) , STRING , STRING , STRING ) ; RedisOperationsSessionRepository org.springframework.boot.autoconfigure.session.RedisOperationsSessionRepository = validateSessionRepository ( RedisOperationsSessionRepository .class ) ; assertThat ( org.springframework.boot.autoconfigure.session.RedisOperationsSessionRepository . getSessionCreatedChannelPrefix ( ) ) . isEqualTo ( STRING ) ; assertThat ( new DirectFieldAccessor ( org.springframework.boot.autoconfigure.session.RedisOperationsSessionRepository ) . getPropertyValue ( STRING ) ) . isEqualTo ( RedisFlushMode . IMMEDIATE ) ; }  <METHOD_END>