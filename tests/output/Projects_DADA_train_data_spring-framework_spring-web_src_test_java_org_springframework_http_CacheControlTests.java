<METHOD_START> @ Test public void void ( ) java.lang.Exception { CacheControl org.springframework.http.CacheControl = CacheControl . empty ( ) ; assertThat ( org.springframework.http.CacheControl . getHeaderValue ( ) , Matchers . nullValue ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { CacheControl org.springframework.http.CacheControl = CacheControl . maxAge ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; assertThat ( org.springframework.http.CacheControl . getHeaderValue ( ) , Matchers . equalTo ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { CacheControl org.springframework.http.CacheControl = CacheControl . maxAge ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) . cachePublic ( ) . noTransform ( ) ; assertThat ( org.springframework.http.CacheControl . getHeaderValue ( ) , Matchers . equalTo ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { CacheControl org.springframework.http.CacheControl = CacheControl . maxAge ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) . sMaxAge ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; assertThat ( org.springframework.http.CacheControl . getHeaderValue ( ) , Matchers . equalTo ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { CacheControl org.springframework.http.CacheControl = CacheControl . noCache ( ) . cachePrivate ( ) ; assertThat ( org.springframework.http.CacheControl . getHeaderValue ( ) , Matchers . equalTo ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { CacheControl org.springframework.http.CacheControl = CacheControl . noStore ( ) ; assertThat ( org.springframework.http.CacheControl . getHeaderValue ( ) , Matchers . equalTo ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { CacheControl org.springframework.http.CacheControl = CacheControl . maxAge ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) . staleIfError ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; assertThat ( org.springframework.http.CacheControl . getHeaderValue ( ) , Matchers . equalTo ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { CacheControl org.springframework.http.CacheControl = CacheControl . maxAge ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) . staleWhileRevalidate ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; assertThat ( org.springframework.http.CacheControl . getHeaderValue ( ) , Matchers . equalTo ( STRING ) ) ; }  <METHOD_END>