<METHOD_START> public void ( java.io.File java.io.File ) { Assert . notNull ( java.io.File , STRING ) ; this . java.io.File = java.io.File ; this . java.lang.String = StringUtils . cleanPath ( java.io.File . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String ) { Assert . notNull ( java.lang.String , STRING ) ; this . java.io.File = new java.io.File ( java.lang.String ) ; this . java.lang.String = StringUtils . cleanPath ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public final java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return this . java.io.File . boolean ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return ( this . java.io.File . boolean ( ) && ! this . java.io.File . boolean ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.io.InputStream java.io.InputStream ( ) java.io.IOException { return new java.io.FileInputStream ( this . java.io.File ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return ( this . java.io.File . boolean ( ) && ! this . java.io.File . boolean ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.io.OutputStream java.io.OutputStream ( ) java.io.IOException { return new java.io.FileOutputStream ( this . java.io.File ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.net.URL java.net.URL ( ) java.io.IOException { return this . java.io.File . java.net.URI ( ) . java.net.URL ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.net.URI java.net.URI ( ) java.io.IOException { return this . java.io.File . java.net.URI ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.io.File java.io.File ( ) { return this . java.io.File ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.nio.channels.ReadableByteChannel java.nio.channels.ReadableByteChannel ( ) java.io.IOException { return new java.io.FileInputStream ( this . java.io.File ) . java.nio.channels.FileChannel ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public long long ( ) java.io.IOException { return this . java.io.File . long ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.core.io.Resource org.springframework.core.io.Resource ( java.lang.String java.lang.String ) { java.lang.String java.lang.String = StringUtils . applyRelativePath ( this . java.lang.String , java.lang.String ) ; return new org.springframework.core.io.FileSystemResource ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return this . java.io.File . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING + this . java.io.File . java.lang.String ( ) + STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Object java.lang.Object ) { return ( java.lang.Object == this || ( java.lang.Object instanceof org.springframework.core.io.FileSystemResource && this . java.lang.String . boolean ( ( ( org.springframework.core.io.FileSystemResource ) java.lang.Object ) . java.lang.String ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return this . java.lang.String . int ( ) ; }  <METHOD_END>
