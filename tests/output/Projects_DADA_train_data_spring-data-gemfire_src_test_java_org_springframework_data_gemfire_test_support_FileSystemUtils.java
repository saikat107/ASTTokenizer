<METHOD_START> public static boolean boolean ( java.io.File java.io.File ) { return boolean ( java.io.File , org.springframework.data.gemfire.test.support.FileSystemUtils.AllFilesFilter . org.springframework.data.gemfire.test.support.FileSystemUtils.AllFilesFilter ) ; }  <METHOD_END>
<METHOD_START> public static boolean boolean ( java.io.File java.io.File , java.io.FileFilter java.io.FileFilter ) { boolean boolean = true ; if ( isDirectory ( java.io.File ) ) { for ( java.io.File java.io.File : java.io.File[] ( java.io.File , java.io.FileFilter ) ) { boolean &= boolean ( java.io.File ) ; } } return ( ( java.io.File == null || java.io.File . boolean ( ) ) && boolean ) ; }  <METHOD_END>
<METHOD_START> public static java.io.File java.io.File ( java.io.File java.io.File ) { java.io.File java.io.File = java.io.File ; if ( isDirectory ( java.io.File ) ) { while ( java.io.File != null && ! java.io.File . boolean ( java.io.File . java.io.File ( ) ) ) { java.io.File = java.io.File . java.io.File ( ) ; } } return ( java.io.File != null ? java.io.File : java.io.File ) ; }  <METHOD_END>
<METHOD_START> public static java.io.File [] java.io.File[] ( java.io.File java.io.File , java.io.FileFilter java.io.FileFilter ) { Assert . isTrue ( isDirectory ( java.io.File ) , java.lang.String . java.lang.String ( STRING , java.io.File ) ) ; java.util.List<java.io.File> < java.io.File > java.util.List<java.io.File> = new java.util.ArrayList<java.io.File> < java.io.File > ( ) ; for ( java.io.File java.io.File : java.io.File[] ( java.io.File , java.io.FileFilter ) ) { if ( isDirectory ( java.io.File ) ) { java.util.List<java.io.File> . boolean ( java.util.Arrays . java.util.List<java.io.File> ( java.io.File[] ( java.io.File , java.io.FileFilter ) ) ) ; } else { java.util.List<java.io.File> . boolean ( java.io.File ) ; } } return java.util.List<java.io.File> . java.io.File[] ( new java.io.File [ java.util.List<java.io.File> . int ( ) ] ) ; }  <METHOD_END>
<METHOD_START> public static java.io.File [] java.io.File[] ( java.io.File java.io.File ) { return java.io.File[] ( java.io.File , org.springframework.data.gemfire.test.support.FileSystemUtils.AllFilesFilter . org.springframework.data.gemfire.test.support.FileSystemUtils.AllFilesFilter ) ; }  <METHOD_END>
<METHOD_START> public static java.io.File [] java.io.File[] ( java.io.File java.io.File , java.io.FileFilter java.io.FileFilter ) { java.io.FileFilter java.io.FileFilter = ( java.io.FileFilter != null ? java.io.FileFilter : org.springframework.data.gemfire.test.support.FileSystemUtils.AllFilesFilter . org.springframework.data.gemfire.test.support.FileSystemUtils.AllFilesFilter ) ; java.io.File [] java.io.File[] = ( isDirectory ( java.io.File ) ? java.io.File . java.io.File[] ( java.io.FileFilter ) : null ) ; return ( java.io.File[] != null ? java.io.File[] : java.io.File[] ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.io.File java.io.File ) { return true ; }  <METHOD_END>
<METHOD_START> private void ( java.io.FileFilter java.io.FileFilter , org.springframework.data.gemfire.test.support.FileSystemUtils.CompositeFileFilter.LogicalOperator org.springframework.data.gemfire.test.support.FileSystemUtils.CompositeFileFilter.LogicalOperator , java.io.FileFilter java.io.FileFilter ) { this . java.io.FileFilter = java.io.FileFilter ; this . org.springframework.data.gemfire.test.support.FileSystemUtils.CompositeFileFilter.LogicalOperator = org.springframework.data.gemfire.test.support.FileSystemUtils.CompositeFileFilter.LogicalOperator ; this . java.io.FileFilter = java.io.FileFilter ; }  <METHOD_END>
<METHOD_START> protected static java.io.FileFilter java.io.FileFilter ( java.io.FileFilter java.io.FileFilter , org.springframework.data.gemfire.test.support.FileSystemUtils.CompositeFileFilter.LogicalOperator org.springframework.data.gemfire.test.support.FileSystemUtils.CompositeFileFilter.LogicalOperator , java.io.FileFilter java.io.FileFilter ) { return ( java.io.FileFilter == null ? java.io.FileFilter : ( java.io.FileFilter == null ? java.io.FileFilter : new org.springframework.data.gemfire.test.support.FileSystemUtils.CompositeFileFilter ( java.io.FileFilter , org.springframework.data.gemfire.test.support.FileSystemUtils.CompositeFileFilter.LogicalOperator , java.io.FileFilter ) ) ) ; }  <METHOD_END>
<METHOD_START> public static java.io.FileFilter java.io.FileFilter ( java.io.FileFilter ... java.io.FileFilter[] ) { return java.io.FileFilter ( java.util.Arrays . java.util.List ( nullSafeArray ( java.io.FileFilter[] , java.io.FileFilter .class ) ) ) ; }  <METHOD_END>
<METHOD_START> public static java.io.FileFilter java.io.FileFilter ( java.lang.Iterable<java.io.FileFilter> < java.io.FileFilter > java.lang.Iterable<java.io.FileFilter> ) { java.io.FileFilter java.io.FileFilter = null ; for ( java.io.FileFilter java.io.FileFilter : nullSafeIterable ( java.lang.Iterable<java.io.FileFilter> ) ) { java.io.FileFilter = java.io.FileFilter ( java.io.FileFilter , org.springframework.data.gemfire.test.support.FileSystemUtils.CompositeFileFilter.LogicalOperator . org.springframework.data.gemfire.test.support.FileSystemUtils.CompositeFileFilter.LogicalOperator , java.io.FileFilter ) ; } return java.io.FileFilter ; }  <METHOD_END>
<METHOD_START> public static java.io.FileFilter java.io.FileFilter ( java.io.FileFilter ... java.io.FileFilter[] ) { return java.io.FileFilter ( java.util.Arrays . java.util.List ( nullSafeArray ( java.io.FileFilter[] , java.io.FileFilter .class ) ) ) ; }  <METHOD_END>
<METHOD_START> public static java.io.FileFilter java.io.FileFilter ( java.lang.Iterable<java.io.FileFilter> < java.io.FileFilter > java.lang.Iterable<java.io.FileFilter> ) { java.io.FileFilter java.io.FileFilter = null ; for ( java.io.FileFilter java.io.FileFilter : nullSafeIterable ( java.lang.Iterable<java.io.FileFilter> ) ) { java.io.FileFilter = java.io.FileFilter ( java.io.FileFilter , org.springframework.data.gemfire.test.support.FileSystemUtils.CompositeFileFilter.LogicalOperator . org.springframework.data.gemfire.test.support.FileSystemUtils.CompositeFileFilter.LogicalOperator , java.io.FileFilter ) ; } return java.io.FileFilter ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.io.File java.io.File ) { switch ( this . org.springframework.data.gemfire.test.support.FileSystemUtils.CompositeFileFilter.LogicalOperator ) { case org.springframework.data.gemfire.test.support.FileSystemUtils.CompositeFileFilter.LogicalOperator : return ( java.io.FileFilter . boolean ( java.io.File ) && java.io.FileFilter . boolean ( java.io.File ) ) ; case org.springframework.data.gemfire.test.support.FileSystemUtils.CompositeFileFilter.LogicalOperator : return ( java.io.FileFilter . boolean ( java.io.File ) || java.io.FileFilter . boolean ( java.io.File ) ) ; default: throw new java.lang.UnsupportedOperationException ( java.lang.String . java.lang.String ( STRING , this . org.springframework.data.gemfire.test.support.FileSystemUtils.CompositeFileFilter.LogicalOperator ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.io.File java.io.File ) { return isDirectory ( java.io.File ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.data.gemfire.test.support.FileSystemUtils.FileExtensionFilter org.springframework.data.gemfire.test.support.FileSystemUtils.FileExtensionFilter ( java.lang.String java.lang.String ) { return new org.springframework.data.gemfire.test.support.FileSystemUtils.FileExtensionFilter ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String ) { Assert . hasText ( java.lang.String , java.lang.String . java.lang.String ( STRING , java.lang.String ) ) ; this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.io.File java.io.File ) { return ( super. boolean ( java.io.File ) && java.io.File . java.lang.String ( ) . java.lang.String ( ) . boolean ( this . java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.io.File java.io.File ) { return isFile ( java.io.File ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.data.gemfire.test.support.FileSystemUtils.NegatingFileFilter org.springframework.data.gemfire.test.support.FileSystemUtils.NegatingFileFilter ( java.io.FileFilter java.io.FileFilter ) { return new org.springframework.data.gemfire.test.support.FileSystemUtils.NegatingFileFilter ( java.io.FileFilter ) ; }  <METHOD_END>
<METHOD_START> public void ( java.io.FileFilter java.io.FileFilter ) { Assert . notNull ( java.io.FileFilter , STRING ) ; this . java.io.FileFilter = java.io.FileFilter ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.io.File java.io.File ) { return ! this . java.io.FileFilter . boolean ( java.io.File ) ; }  <METHOD_END>