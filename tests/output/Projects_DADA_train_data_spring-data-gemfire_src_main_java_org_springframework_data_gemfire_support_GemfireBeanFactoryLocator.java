<METHOD_START> public static org.springframework.data.gemfire.support.GemfireBeanFactoryLocator org.springframework.data.gemfire.support.GemfireBeanFactoryLocator ( ) { org.springframework.data.gemfire.support.GemfireBeanFactoryLocator org.springframework.data.gemfire.support.GemfireBeanFactoryLocator = new org.springframework.data.gemfire.support.GemfireBeanFactoryLocator ( ) ; org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . void ( ) ; return org.springframework.data.gemfire.support.GemfireBeanFactoryLocator ; }  <METHOD_END>
<METHOD_START> public static org.springframework.data.gemfire.support.GemfireBeanFactoryLocator org.springframework.data.gemfire.support.GemfireBeanFactoryLocator ( BeanFactory org.springframework.data.gemfire.support.BeanFactory , java.lang.String java.lang.String ) { Assert . isTrue ( org.springframework.data.gemfire.support.BeanFactory == null || StringUtils . hasText ( java.lang.String ) , STRING ) ; org.springframework.data.gemfire.support.GemfireBeanFactoryLocator org.springframework.data.gemfire.support.GemfireBeanFactoryLocator = new org.springframework.data.gemfire.support.GemfireBeanFactoryLocator ( ) ; org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . void ( org.springframework.data.gemfire.support.BeanFactory ) ; org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . void ( java.lang.String ) ; org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . void ( ) ; return org.springframework.data.gemfire.support.GemfireBeanFactoryLocator ; }  <METHOD_END>
<METHOD_START> protected static org.springframework.data.gemfire.support.BeanFactory org.springframework.data.gemfire.support.BeanFactory ( java.lang.String java.lang.String ) { BeanFactory org.springframework.data.gemfire.support.BeanFactory = java.util.concurrent.ConcurrentMap<java.lang.String,org.springframework.data.gemfire.support.BeanFactory> . get ( java.lang.String ) ; Assert . isTrue ( java.util.concurrent.ConcurrentMap<java.lang.String,org.springframework.data.gemfire.support.BeanFactory> . isEmpty ( ) || org.springframework.data.gemfire.support.BeanFactory != null , java.lang.String . java.lang.String ( STRING , java.lang.String ) ) ; return org.springframework.data.gemfire.support.BeanFactory ; }  <METHOD_END>
<METHOD_START> protected static synchronized org.springframework.data.gemfire.support.BeanFactory org.springframework.data.gemfire.support.BeanFactory ( ) { if ( ! java.util.concurrent.ConcurrentMap<java.lang.String,org.springframework.data.gemfire.support.BeanFactory> . isEmpty ( ) ) { boolean boolean = true ; BeanFactory org.springframework.data.gemfire.support.BeanFactory = null ; for ( BeanFactory org.springframework.data.gemfire.support.BeanFactory : java.util.concurrent.ConcurrentMap<java.lang.String,org.springframework.data.gemfire.support.BeanFactory> . values ( ) ) { boolean &= nullOrEquals ( org.springframework.data.gemfire.support.BeanFactory , org.springframework.data.gemfire.support.BeanFactory ) ; org.springframework.data.gemfire.support.BeanFactory = org.springframework.data.gemfire.support.BeanFactory ; if ( ! boolean ) { break; } } Assert . state ( boolean , java.lang.String . java.lang.String ( STRING , new java.util.TreeSet ( java.util.concurrent.ConcurrentMap<java.lang.String,org.springframework.data.gemfire.support.BeanFactory> . keySet ( ) ) . java.lang.String ( ) ) ) ; return java.util.concurrent.ConcurrentMap<java.lang.String,org.springframework.data.gemfire.support.BeanFactory> . values ( ) . iterator ( ) . next ( ) ; } return null ; }  <METHOD_END>
<METHOD_START> protected static synchronized void void ( java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> , BeanFactory org.springframework.data.gemfire.support.BeanFactory ) { Assert . isTrue ( nullSafeSet ( java.util.Set<java.lang.String> ) . isEmpty ( ) || org.springframework.data.gemfire.support.BeanFactory != null , STRING ) ; for ( java.lang.String java.lang.String : nullSafeSet ( java.util.Set<java.lang.String> ) ) { BeanFactory org.springframework.data.gemfire.support.BeanFactory = java.util.concurrent.ConcurrentMap<java.lang.String,org.springframework.data.gemfire.support.BeanFactory> . putIfAbsent ( java.lang.String , org.springframework.data.gemfire.support.BeanFactory ) ; Assert . isTrue ( nullOrEquals ( org.springframework.data.gemfire.support.BeanFactory , org.springframework.data.gemfire.support.BeanFactory ) , java.lang.String . java.lang.String ( STRING , java.lang.String ) ) ; } }  <METHOD_END>
<METHOD_START> protected static synchronized boolean boolean ( java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> ) { return java.util.concurrent.ConcurrentMap<java.lang.String,org.springframework.data.gemfire.support.BeanFactory> . keySet ( ) . removeAll ( java.util.Set<java.lang.String> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { BeanFactory org.springframework.data.gemfire.support.BeanFactory = org.springframework.data.gemfire.support.BeanFactory ( ) ; void ( java.util.Set<java.lang.String> ( org.springframework.data.gemfire.support.BeanFactory ) , org.springframework.data.gemfire.support.BeanFactory ) ; }  <METHOD_END>
<METHOD_START> java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> ( BeanFactory org.springframework.data.gemfire.support.BeanFactory ) { java.lang.String java.lang.String = java.lang.String ( ) ; if ( org.springframework.data.gemfire.support.BeanFactory != null && StringUtils . hasText ( java.lang.String ) ) { java.lang.String [] java.lang.String[] = org.springframework.data.gemfire.support.BeanFactory . getAliases ( java.lang.String ) ; this . java.util.Set<java.lang.String> = new java.util.TreeSet<java.lang.String> <> ( ) ; this . java.util.Set<java.lang.String> . boolean ( java.lang.String ) ; java.util.Collections . boolean ( this . java.util.Set<java.lang.String> , java.lang.String[] ) ; } return this . java.util.Set<java.lang.String> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { boolean ( java.util.Set<java.lang.String> ( ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.gemfire.support.BeanFactory org.springframework.data.gemfire.support.BeanFactory ( ) { return org.springframework.data.gemfire.support.BeanFactory ( java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.gemfire.support.BeanFactory org.springframework.data.gemfire.support.BeanFactory ( java.lang.String java.lang.String ) { return org.springframework.data.gemfire.support.GemfireBeanFactoryLocator.BeanFactoryReference ( StringUtils . hasText ( java.lang.String ) ? org.springframework.data.gemfire.support.BeanFactory ( java.lang.String ) : org.springframework.data.gemfire.support.BeanFactory ( ) ) . get ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( BeanFactory org.springframework.data.gemfire.support.BeanFactory ) { this . org.springframework.data.gemfire.support.BeanFactory = org.springframework.data.gemfire.support.BeanFactory ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.gemfire.support.BeanFactory org.springframework.data.gemfire.support.BeanFactory ( ) { return this . org.springframework.data.gemfire.support.BeanFactory ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> protected java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> ( ) { return java.util.Collections . java.util.Set ( nullSafeSet ( this . java.util.Set<java.lang.String> ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.gemfire.support.GemfireBeanFactoryLocator org.springframework.data.gemfire.support.GemfireBeanFactoryLocator ( java.lang.String java.lang.String ) { void ( java.lang.String ) ; return this ; }  <METHOD_END>
<METHOD_START> protected static org.springframework.data.gemfire.support.GemfireBeanFactoryLocator.BeanFactoryReference org.springframework.data.gemfire.support.GemfireBeanFactoryLocator.BeanFactoryReference ( BeanFactory org.springframework.data.gemfire.support.BeanFactory ) { return new org.springframework.data.gemfire.support.GemfireBeanFactoryLocator.BeanFactoryReference ( org.springframework.data.gemfire.support.BeanFactory ) ; }  <METHOD_END>
<METHOD_START> protected void ( BeanFactory org.springframework.data.gemfire.support.BeanFactory ) { this . java.util.concurrent.atomic.AtomicReference<org.springframework.data.gemfire.support.BeanFactory> . set ( org.springframework.data.gemfire.support.BeanFactory ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.gemfire.support.BeanFactory org.springframework.data.gemfire.support.BeanFactory ( ) { BeanFactory org.springframework.data.gemfire.support.BeanFactory = this . java.util.concurrent.atomic.AtomicReference<org.springframework.data.gemfire.support.BeanFactory> . get ( ) ; Assert . state ( org.springframework.data.gemfire.support.BeanFactory != null , java.lang.String ) ; return org.springframework.data.gemfire.support.BeanFactory ; }  <METHOD_END>
<METHOD_START> public void void ( ) { this . java.util.concurrent.atomic.AtomicReference<org.springframework.data.gemfire.support.BeanFactory> . set ( null ) ; }  <METHOD_END>