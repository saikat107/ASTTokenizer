<METHOD_START> @ java.lang.Override public void void ( ServletContext org.springframework.boot.cli.app.ServletContext ) throws org.springframework.boot.cli.app.ServletException { try { this . java.lang.String[] = java.lang.String[] ( org.springframework.boot.cli.app.ServletContext ) ; } catch ( java.io.IOException java.io.IOException ) { throw new java.lang.IllegalStateException ( java.io.IOException ) ; } super. onStartup ( org.springframework.boot.cli.app.ServletContext ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String [] java.lang.String[] ( ServletContext org.springframework.boot.cli.app.ServletContext ) throws java.io.IOException { java.util.jar.Manifest java.util.jar.Manifest = java.util.jar.Manifest ( org.springframework.boot.cli.app.ServletContext ) ; if ( java.util.jar.Manifest == null ) { throw new java.lang.IllegalStateException ( STRING ) ; } java.lang.String java.lang.String = java.util.jar.Manifest . java.util.jar.Attributes ( ) . java.lang.String ( java.lang.String ) ; return java.lang.String . java.lang.String[] ( STRING ) ; }  <METHOD_END>
<METHOD_START> private java.util.jar.Manifest java.util.jar.Manifest ( ServletContext org.springframework.boot.cli.app.ServletContext ) throws java.io.IOException { java.io.InputStream java.io.InputStream = org.springframework.boot.cli.app.ServletContext . getResourceAsStream ( STRING ) ; java.util.jar.Manifest java.util.jar.Manifest = ( java.io.InputStream == null ? null : new java.util.jar.Manifest ( java.io.InputStream ) ) ; return java.util.jar.Manifest ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.boot.cli.app.SpringApplicationBuilder org.springframework.boot.cli.app.SpringApplicationBuilder ( SpringApplicationBuilder org.springframework.boot.cli.app.SpringApplicationBuilder ) { try { java.lang.ClassLoader java.lang.ClassLoader = java.lang.Thread . java.lang.Thread ( ) . java.lang.ClassLoader ( ) ; java.lang.Class<?> < ? > [] java.lang.Class<?>[] = new java.lang.Class<?> < ? > [ this . java.lang.String[] . int ] ; for ( int int = NUMBER ; int < this . java.lang.String[] . int ; int ++ ) { java.lang.Class<?>[] [ int ] = java.lang.ClassLoader . java.lang.Class<?> ( this . java.lang.String[] [ int ] ) ; } return org.springframework.boot.cli.app.SpringApplicationBuilder . sources ( java.lang.Class<?>[] ) . properties ( STRING ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.IllegalStateException ( java.lang.Exception ) ; } }  <METHOD_END>