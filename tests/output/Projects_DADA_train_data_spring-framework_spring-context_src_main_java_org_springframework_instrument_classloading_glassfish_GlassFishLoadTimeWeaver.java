<METHOD_START> public void ( ) { this( ClassUtils . getDefaultClassLoader ( ) ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.ClassLoader java.lang.ClassLoader ) { Assert . notNull ( java.lang.ClassLoader , STRING ) ; java.lang.Class<?> < ? > java.lang.Class<?> ; try { java.lang.Class<?> = java.lang.ClassLoader . java.lang.Class<?> ( java.lang.String ) ; this . java.lang.reflect.Method = java.lang.Class<> . java.lang.reflect.Method ( STRING , java.lang.instrument.ClassFileTransformer .class ) ; this . java.lang.reflect.Method = java.lang.Class<> . java.lang.reflect.Method ( STRING ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { throw new java.lang.IllegalStateException ( STRING , java.lang.Throwable ) ; } java.lang.ClassLoader java.lang.ClassLoader = null ; for ( java.lang.ClassLoader java.lang.ClassLoader = java.lang.ClassLoader ; java.lang.ClassLoader != null && java.lang.ClassLoader == null ; java.lang.ClassLoader = java.lang.ClassLoader . java.lang.ClassLoader ( ) ) { if ( java.lang.Class<> . boolean ( java.lang.ClassLoader ) ) { java.lang.ClassLoader = java.lang.ClassLoader ; } } if ( java.lang.ClassLoader == null ) { throw new java.lang.IllegalArgumentException ( java.lang.ClassLoader + STRING + java.lang.Class<> . java.lang.String ( ) + STRING ) ; } this . java.lang.ClassLoader = java.lang.ClassLoader ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.instrument.ClassFileTransformer java.lang.instrument.ClassFileTransformer ) { try { this . java.lang.reflect.Method . java.lang.Object ( this . java.lang.ClassLoader , java.lang.instrument.ClassFileTransformer ) ; } catch ( java.lang.reflect.InvocationTargetException java.lang.reflect.InvocationTargetException ) { throw new java.lang.IllegalStateException ( STRING , java.lang.reflect.InvocationTargetException . java.lang.Throwable ( ) ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { throw new java.lang.IllegalStateException ( STRING , java.lang.Throwable ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.ClassLoader java.lang.ClassLoader ( ) { return this . java.lang.ClassLoader ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.ClassLoader java.lang.ClassLoader ( ) { try { return new OverridingClassLoader ( this . java.lang.ClassLoader , ( java.lang.ClassLoader ) this . java.lang.reflect.Method . java.lang.Object ( this . java.lang.ClassLoader ) ) ; } catch ( java.lang.reflect.InvocationTargetException java.lang.reflect.InvocationTargetException ) { throw new java.lang.IllegalStateException ( STRING , java.lang.reflect.InvocationTargetException . java.lang.Throwable ( ) ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { throw new java.lang.IllegalStateException ( STRING , java.lang.Throwable ) ; } }  <METHOD_END>