<METHOD_START> public void ( ) { try { this . org.springframework.boot.loader.Archive = createArchive ( ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.IllegalStateException ( java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> protected void ( Archive org.springframework.boot.loader.Archive ) { this . org.springframework.boot.loader.Archive = org.springframework.boot.loader.Archive ; }  <METHOD_END>
<METHOD_START> protected final org.springframework.boot.loader.Archive org.springframework.boot.loader.Archive ( ) { return this . org.springframework.boot.loader.Archive ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( ) java.lang.Exception { java.util.jar.Manifest java.util.jar.Manifest = this . org.springframework.boot.loader.Archive . getManifest ( ) ; java.lang.String java.lang.String = null ; if ( java.util.jar.Manifest != null ) { java.lang.String = java.util.jar.Manifest . java.util.jar.Attributes ( ) . java.lang.String ( STRING ) ; } if ( java.lang.String == null ) { throw new java.lang.IllegalStateException ( STRING + this ) ; } return java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.util.List<org.springframework.boot.loader.Archive> < Archive > java.util.List<org.springframework.boot.loader.Archive> ( ) java.lang.Exception { java.util.List<org.springframework.boot.loader.Archive> < Archive > java.util.List<org.springframework.boot.loader.Archive> = new java.util.ArrayList <> ( this . org.springframework.boot.loader.Archive . getNestedArchives ( new EntryFilter ( ) { @ java.lang.Override public boolean boolean ( Entry org.springframework.boot.loader.Entry ) { return boolean ( org.springframework.boot.loader.Entry ) ; } } ) ) ; void ( java.util.List<org.springframework.boot.loader.Archive> ) ; return java.util.List<org.springframework.boot.loader.Archive> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( Entry org.springframework.boot.loader.Entry ) { return boolean ( org.springframework.boot.loader.Entry ) ; }  <METHOD_END>
<METHOD_START> protected abstract boolean boolean ( Archive . Archive Archive.Entry );  <METHOD_END>
<METHOD_START> protected void void ( java.util.List<org.springframework.boot.loader.Archive> < Archive > java.util.List<org.springframework.boot.loader.Archive> ) throws java.lang.Exception {	}  <METHOD_END>