<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) public org.springframework.boot.autoconfigure.cache.support.CacheManager org.springframework.boot.autoconfigure.cache.support.CacheManager ( java.net.URI java.net.URI , java.lang.ClassLoader java.lang.ClassLoader , java.util.Properties java.util.Properties ) { CacheManager org.springframework.boot.autoconfigure.cache.support.CacheManager = mock ( CacheManager .class ) ; given ( org.springframework.boot.autoconfigure.cache.support.CacheManager . getURI ( ) ) . willReturn ( java.net.URI ) ; given ( org.springframework.boot.autoconfigure.cache.support.CacheManager . getClassLoader ( ) ) . willReturn ( java.lang.ClassLoader ) ; final java.util.Map<java.lang.String,org.springframework.boot.autoconfigure.cache.support.Cache> < java.lang.String , Cache > java.util.Map<java.lang.String,org.springframework.boot.autoconfigure.cache.support.Cache> = new java.util.HashMap<java.lang.String,org.springframework.boot.autoconfigure.cache.support.Cache> <> ( ) ; given ( org.springframework.boot.autoconfigure.cache.support.CacheManager . getCacheNames ( ) ) . willReturn ( java.util.Map<java.lang.String,org.springframework.boot.autoconfigure.cache.support.Cache> . keySet ( ) ) ; given ( org.springframework.boot.autoconfigure.cache.support.CacheManager . getCache ( anyString ( ) ) ) . willAnswer ( new Answer < Cache > ( ) { @ java.lang.Override public org.springframework.boot.autoconfigure.cache.support.Cache org.springframework.boot.autoconfigure.cache.support.Cache ( InvocationOnMock org.springframework.boot.autoconfigure.cache.support.InvocationOnMock ) throws java.lang.Throwable { java.lang.String java.lang.String = ( java.lang.String ) org.springframework.boot.autoconfigure.cache.support.InvocationOnMock . getArguments ( ) [ NUMBER ] ; return java.util.Map<java.lang.String,org.springframework.boot.autoconfigure.cache.support.Cache> . get ( java.lang.String ) ; } } ) ; given ( org.springframework.boot.autoconfigure.cache.support.CacheManager . createCache ( anyString ( ) , any ( Configuration .class ) ) ) . will ( new Answer < Cache > ( ) { @ java.lang.Override public org.springframework.boot.autoconfigure.cache.support.Cache org.springframework.boot.autoconfigure.cache.support.Cache ( InvocationOnMock org.springframework.boot.autoconfigure.cache.support.InvocationOnMock )							throws java.lang.Throwable { java.lang.String java.lang.String = ( java.lang.String ) org.springframework.boot.autoconfigure.cache.support.InvocationOnMock . getArguments ( ) [ NUMBER ] ; Cache org.springframework.boot.autoconfigure.cache.support.Cache = mock ( Cache .class ) ; given ( org.springframework.boot.autoconfigure.cache.support.Cache . getName ( ) ) . willReturn ( java.lang.String ) ; java.util.Map<java.lang.String,org.springframework.boot.autoconfigure.cache.support.Cache> . put ( java.lang.String , org.springframework.boot.autoconfigure.cache.support.Cache ) ; return org.springframework.boot.autoconfigure.cache.support.Cache ; } } ) ; return org.springframework.boot.autoconfigure.cache.support.CacheManager ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.autoconfigure.cache.support.Cache org.springframework.boot.autoconfigure.cache.support.Cache ( InvocationOnMock org.springframework.boot.autoconfigure.cache.support.InvocationOnMock ) throws java.lang.Throwable { java.lang.String java.lang.String = ( java.lang.String ) org.springframework.boot.autoconfigure.cache.support.InvocationOnMock . getArguments ( ) [ NUMBER ] ; return java.util.Map<java.lang.String,org.springframework.boot.autoconfigure.cache.support.Cache> . get ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.autoconfigure.cache.support.Cache org.springframework.boot.autoconfigure.cache.support.Cache ( InvocationOnMock org.springframework.boot.autoconfigure.cache.support.InvocationOnMock )							throws java.lang.Throwable { java.lang.String java.lang.String = ( java.lang.String ) org.springframework.boot.autoconfigure.cache.support.InvocationOnMock . getArguments ( ) [ NUMBER ] ; Cache org.springframework.boot.autoconfigure.cache.support.Cache = mock ( Cache .class ) ; given ( org.springframework.boot.autoconfigure.cache.support.Cache . getName ( ) ) . willReturn ( java.lang.String ) ; java.util.Map<java.lang.String,org.springframework.boot.autoconfigure.cache.support.Cache> . put ( java.lang.String , org.springframework.boot.autoconfigure.cache.support.Cache ) ; return org.springframework.boot.autoconfigure.cache.support.Cache ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.ClassLoader java.lang.ClassLoader ( ) { return mock ( java.lang.ClassLoader .class ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.net.URI java.net.URI ( ) { return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Properties java.util.Properties ( ) { return new java.util.Properties ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.autoconfigure.cache.support.CacheManager org.springframework.boot.autoconfigure.cache.support.CacheManager ( java.net.URI java.net.URI , java.lang.ClassLoader java.lang.ClassLoader ) { return org.springframework.boot.autoconfigure.cache.support.CacheManager ( java.net.URI , java.lang.ClassLoader , java.util.Properties ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.autoconfigure.cache.support.CacheManager org.springframework.boot.autoconfigure.cache.support.CacheManager ( ) { return org.springframework.boot.autoconfigure.cache.support.CacheManager ( java.net.URI ( ) , java.lang.ClassLoader ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) {	}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.ClassLoader java.lang.ClassLoader ) {	}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.net.URI java.net.URI , java.lang.ClassLoader java.lang.ClassLoader ) {	}  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( OptionalFeature org.springframework.boot.autoconfigure.cache.support.OptionalFeature ) { return false ; }  <METHOD_END>