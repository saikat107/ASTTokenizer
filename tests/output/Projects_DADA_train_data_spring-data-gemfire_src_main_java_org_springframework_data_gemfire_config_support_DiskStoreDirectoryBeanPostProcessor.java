<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , java.lang.String java.lang.String ) throws org.springframework.data.gemfire.config.support.BeansException { if ( org.springframework.data.gemfire.config.support.Log . isDebugEnabled ( ) ) { org.springframework.data.gemfire.config.support.Log . debug ( java.lang.String . java.lang.String ( STRING , java.lang.Object , ObjectUtils . nullSafeClassName ( java.lang.Object ) , java.lang.String ) ) ; } if ( java.lang.Object instanceof DiskDir ) { void ( ( DiskDir ) java.lang.Object ) ; } return java.lang.Object ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , java.lang.String java.lang.String ) throws org.springframework.data.gemfire.config.support.BeansException { return java.lang.Object ; }  <METHOD_END>
<METHOD_START> private void void ( DiskDir org.springframework.data.gemfire.config.support.DiskDir ) { java.lang.String java.lang.String = java.lang.String ( org.springframework.data.gemfire.config.support.DiskDir , STRING ) ; java.io.File java.io.File = new java.io.File ( java.lang.String ) ; Assert . isTrue ( java.io.File . boolean ( ) || java.io.File . boolean ( ) , java.lang.String . java.lang.String ( STRING , java.lang.String ) ) ; if ( org.springframework.data.gemfire.config.support.Log . isInfoEnabled ( ) ) { org.springframework.data.gemfire.config.support.Log . info ( java.lang.String . java.lang.String ( STRING , java.lang.String ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private < T > T T ( java.lang.Object java.lang.Object , java.lang.String java.lang.String ) { try { java.lang.Class java.lang.Class = java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ; java.lang.reflect.Field java.lang.reflect.Field ; do { java.lang.reflect.Field = java.lang.Class . java.lang.reflect.Field ( java.lang.String ) ; java.lang.Class = java.lang.Class . java.lang.Class ( ) ; } while ( java.lang.reflect.Field == null && ! java.lang.Object .class . boolean ( java.lang.Class ) ); if ( java.lang.reflect.Field == null ) { throw new java.lang.NoSuchFieldException ( java.lang.String . java.lang.String ( STRING , java.lang.String , ObjectUtils . nullSafeClassName ( java.lang.Object ) ) ) ; } java.lang.reflect.Field . void ( true ) ; return ( T ) java.lang.reflect.Field . java.lang.Object ( java.lang.Object ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.RuntimeException ( java.lang.String . java.lang.String ( STRING , java.lang.String , ObjectUtils . nullSafeClassName ( java.lang.Object ) ) , java.lang.Exception ) ; } }  <METHOD_END>