<METHOD_START> @ Test public void void ( ) { FileListFilter < ? > org.springframework.integration.file.config.FileListFilter<?> = this . org.springframework.integration.file.config.FileListFilter<java.io.File> ( STRING ) ; assertFalse ( org.springframework.integration.file.config.FileListFilter<> instanceof CompositeFileListFilter ) ; assertSame ( org.springframework.integration.file.config.TestFileListFilter , org.springframework.integration.file.config.FileListFilter<> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { FileListFilter < ? > org.springframework.integration.file.config.FileListFilter<?> = this . org.springframework.integration.file.config.FileListFilter<java.io.File> ( STRING ) ; assertTrue ( org.springframework.integration.file.config.FileListFilter<> instanceof CompositeFileListFilter ) ; java.util.Collection<?> < ? > java.util.Collection<?> = ( java.util.Collection<?> < ? > ) new DirectFieldAccessor ( org.springframework.integration.file.config.FileListFilter<> ) . getPropertyValue ( STRING ) ; assertTrue ( java.util.Collection<> . java.util.Iterator<> ( ) . next ( ) instanceof AcceptOnceFileListFilter ) ; assertTrue ( java.util.Collection<> . boolean ( org.springframework.integration.file.config.TestFileListFilter ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { FileListFilter < ? > org.springframework.integration.file.config.FileListFilter<?> = this . org.springframework.integration.file.config.FileListFilter<java.io.File> ( STRING ) ; assertFalse ( org.springframework.integration.file.config.FileListFilter<> instanceof CompositeFileListFilter ) ; assertSame ( org.springframework.integration.file.config.TestFileListFilter , org.springframework.integration.file.config.FileListFilter<> ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { FileListFilter < ? > org.springframework.integration.file.config.FileListFilter<?> = this . org.springframework.integration.file.config.FileListFilter<java.io.File> ( STRING ) ; assertTrue ( org.springframework.integration.file.config.FileListFilter<> instanceof CompositeFileListFilter ) ; java.util.Collection<org.springframework.integration.file.config.FileListFilter<java.io.File>> < FileListFilter < java.io.File > > java.util.Collection<org.springframework.integration.file.config.FileListFilter<java.io.File>> = ( java.util.Collection<org.springframework.integration.file.config.FileListFilter<java.io.File>> < FileListFilter < java.io.File > > ) new DirectFieldAccessor ( org.springframework.integration.file.config.FileListFilter<> ) . getPropertyValue ( STRING ) ; java.util.Iterator<org.springframework.integration.file.config.FileListFilter<java.io.File>> < FileListFilter < java.io.File > > java.util.Iterator<org.springframework.integration.file.config.FileListFilter<java.io.File>> = java.util.Collection<org.springframework.integration.file.config.FileListFilter<java.io.File>> . iterator ( ) ; assertTrue ( java.util.Iterator<org.springframework.integration.file.config.FileListFilter<java.io.File>> . next ( ) instanceof AcceptOnceFileListFilter ) ; assertThat ( java.util.Iterator<org.springframework.integration.file.config.FileListFilter<java.io.File>> . next ( ) , is ( instanceOf ( SimplePatternFileListFilter .class ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { FileListFilter < ? > org.springframework.integration.file.config.FileListFilter<?> = this . org.springframework.integration.file.config.FileListFilter<java.io.File> ( STRING ) ; assertTrue ( org.springframework.integration.file.config.FileListFilter<> instanceof CompositeFileListFilter ) ; java.util.Collection<org.springframework.integration.file.config.FileListFilter<java.io.File>> < FileListFilter < java.io.File > > java.util.Collection<org.springframework.integration.file.config.FileListFilter<java.io.File>> = ( java.util.Collection<org.springframework.integration.file.config.FileListFilter<java.io.File>> < FileListFilter < java.io.File > > ) new DirectFieldAccessor ( org.springframework.integration.file.config.FileListFilter<> ) . getPropertyValue ( STRING ) ; java.util.Iterator<org.springframework.integration.file.config.FileListFilter<java.io.File>> < FileListFilter < java.io.File > > java.util.Iterator<org.springframework.integration.file.config.FileListFilter<java.io.File>> = java.util.Collection<org.springframework.integration.file.config.FileListFilter<java.io.File>> . iterator ( ) ; assertTrue ( java.util.Iterator<org.springframework.integration.file.config.FileListFilter<java.io.File>> . next ( ) instanceof AcceptOnceFileListFilter ) ; assertThat ( java.util.Iterator<org.springframework.integration.file.config.FileListFilter<java.io.File>> . next ( ) , is ( instanceOf ( SimplePatternFileListFilter .class ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { FileListFilter < java.io.File > org.springframework.integration.file.config.FileListFilter<java.io.File> = this . org.springframework.integration.file.config.FileListFilter<java.io.File> ( STRING ) ; assertFalse ( org.springframework.integration.file.config.FileListFilter<java.io.File> instanceof CompositeFileListFilter ) ; assertThat ( org.springframework.integration.file.config.FileListFilter<java.io.File> , is ( instanceOf ( SimplePatternFileListFilter .class ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { FileListFilter < java.io.File > org.springframework.integration.file.config.FileListFilter<java.io.File> = this . org.springframework.integration.file.config.FileListFilter<java.io.File> ( STRING ) ; assertNotNull ( org.springframework.integration.file.config.FileListFilter<java.io.File> ) ; assertFalse ( org.springframework.integration.file.config.FileListFilter<java.io.File> instanceof CompositeFileListFilter ) ; assertTrue ( org.springframework.integration.file.config.FileListFilter<java.io.File> instanceof AcceptOnceFileListFilter ) ; java.io.File java.io.File = new java.io.File ( STRING ) ; java.io.File [] java.io.File[] = new java.io.File [] { java.io.File , java.io.File , java.io.File } ; java.util.List<java.io.File> < java.io.File > java.util.List<java.io.File> = org.springframework.integration.file.config.FileListFilter<java.io.File> . filterFiles ( java.io.File[] ) ; assertEquals ( NUMBER , java.util.List<java.io.File> . int ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { FileListFilter < java.io.File > org.springframework.integration.file.config.FileListFilter<java.io.File> = this . org.springframework.integration.file.config.FileListFilter<java.io.File> ( STRING ) ; assertFalse ( org.springframework.integration.file.config.FileListFilter<java.io.File> instanceof CompositeFileListFilter ) ; assertTrue ( org.springframework.integration.file.config.FileListFilter<java.io.File> instanceof AcceptOnceFileListFilter ) ; java.io.File java.io.File = new java.io.File ( STRING ) ; java.io.File [] java.io.File[] = new java.io.File [] { java.io.File , java.io.File , java.io.File } ; java.util.List<java.io.File> < java.io.File > java.util.List<java.io.File> = org.springframework.integration.file.config.FileListFilter<java.io.File> . filterFiles ( java.io.File[] ) ; assertEquals ( NUMBER , java.util.List<java.io.File> . int ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { FileListFilter < java.io.File > org.springframework.integration.file.config.FileListFilter<java.io.File> = this . org.springframework.integration.file.config.FileListFilter<java.io.File> ( STRING ) ; assertNotNull ( org.springframework.integration.file.config.FileListFilter<java.io.File> ) ; assertFalse ( org.springframework.integration.file.config.FileListFilter<java.io.File> instanceof CompositeFileListFilter ) ; assertFalse ( org.springframework.integration.file.config.FileListFilter<java.io.File> instanceof AcceptOnceFileListFilter ) ; java.io.File java.io.File = new java.io.File ( STRING ) ; java.io.File [] java.io.File[] = new java.io.File [] { java.io.File , java.io.File , java.io.File } ; java.util.List<java.io.File> < java.io.File > java.util.List<java.io.File> = org.springframework.integration.file.config.FileListFilter<java.io.File> . filterFiles ( java.io.File[] ) ; assertEquals ( NUMBER , java.util.List<java.io.File> . int ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private org.springframework.integration.file.config.FileListFilter<java.io.File> < java.io.File > org.springframework.integration.file.config.FileListFilter<java.io.File> ( java.lang.String java.lang.String ) { return ( FileListFilter < java.io.File > ) new DirectFieldAccessor ( new DirectFieldAccessor ( new DirectFieldAccessor ( org.springframework.integration.file.config.ApplicationContext . getBean ( java.lang.String ) ) . getPropertyValue ( STRING ) ) . getPropertyValue ( STRING ) ) . getPropertyValue ( STRING ) ; }  <METHOD_END>