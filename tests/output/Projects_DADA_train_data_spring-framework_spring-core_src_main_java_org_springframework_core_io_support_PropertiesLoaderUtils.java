<METHOD_START> public static java.util.Properties java.util.Properties ( EncodedResource org.springframework.core.io.support.EncodedResource ) throws java.io.IOException { java.util.Properties java.util.Properties = new java.util.Properties ( ) ; void ( java.util.Properties , org.springframework.core.io.support.EncodedResource ) ; return java.util.Properties ; }  <METHOD_END>
<METHOD_START> public static void void ( java.util.Properties java.util.Properties , EncodedResource org.springframework.core.io.support.EncodedResource )			throws java.io.IOException { void ( java.util.Properties , org.springframework.core.io.support.EncodedResource , new DefaultPropertiesPersister ( ) ) ; }  <METHOD_END>
<METHOD_START> static void void ( java.util.Properties java.util.Properties , EncodedResource org.springframework.core.io.support.EncodedResource , PropertiesPersister org.springframework.core.io.support.PropertiesPersister )			throws java.io.IOException { java.io.InputStream java.io.InputStream = null ; java.io.Reader java.io.Reader = null ; try { java.lang.String java.lang.String = org.springframework.core.io.support.EncodedResource . getResource ( ) . getFilename ( ) ; if ( java.lang.String != null && java.lang.String . boolean ( java.lang.String ) ) { java.io.InputStream = org.springframework.core.io.support.EncodedResource . getInputStream ( ) ; org.springframework.core.io.support.PropertiesPersister . loadFromXml ( java.util.Properties , java.io.InputStream ) ; } else if ( org.springframework.core.io.support.EncodedResource . requiresReader ( ) ) { java.io.Reader = org.springframework.core.io.support.EncodedResource . getReader ( ) ; org.springframework.core.io.support.PropertiesPersister . load ( java.util.Properties , java.io.Reader ) ; } else { java.io.InputStream = org.springframework.core.io.support.EncodedResource . getInputStream ( ) ; org.springframework.core.io.support.PropertiesPersister . load ( java.util.Properties , java.io.InputStream ) ; } } finally { if ( java.io.InputStream != null ) { java.io.InputStream . void ( ) ; } if ( java.io.Reader != null ) { java.io.Reader . void ( ) ; } } }  <METHOD_END>
<METHOD_START> public static java.util.Properties java.util.Properties ( Resource org.springframework.core.io.support.Resource ) throws java.io.IOException { java.util.Properties java.util.Properties = new java.util.Properties ( ) ; void ( java.util.Properties , org.springframework.core.io.support.Resource ) ; return java.util.Properties ; }  <METHOD_END>
<METHOD_START> public static void void ( java.util.Properties java.util.Properties , Resource org.springframework.core.io.support.Resource ) throws java.io.IOException { java.io.InputStream java.io.InputStream = org.springframework.core.io.support.Resource . getInputStream ( ) ; try { java.lang.String java.lang.String = org.springframework.core.io.support.Resource . getFilename ( ) ; if ( java.lang.String != null && java.lang.String . boolean ( java.lang.String ) ) { java.util.Properties . void ( java.io.InputStream ) ; } else { java.util.Properties . void ( java.io.InputStream ) ; } } finally { java.io.InputStream . void ( ) ; } }  <METHOD_END>
<METHOD_START> public static java.util.Properties java.util.Properties ( java.lang.String java.lang.String ) throws java.io.IOException { return java.util.Properties ( java.lang.String , null ) ; }  <METHOD_END>
<METHOD_START> public static java.util.Properties java.util.Properties ( java.lang.String java.lang.String , java.lang.ClassLoader java.lang.ClassLoader ) throws java.io.IOException { Assert . notNull ( java.lang.String , STRING ) ; java.lang.ClassLoader java.lang.ClassLoader = java.lang.ClassLoader ; if ( java.lang.ClassLoader == null ) { java.lang.ClassLoader = ClassUtils . getDefaultClassLoader ( ) ; } java.util.Enumeration<java.net.URL> < java.net.URL > java.util.Enumeration<java.net.URL> = ( java.lang.ClassLoader != null ? java.lang.ClassLoader . java.util.Enumeration<java.net.URL> ( java.lang.String ) : java.lang.ClassLoader . java.util.Enumeration<java.net.URL> ( java.lang.String ) ) ; java.util.Properties java.util.Properties = new java.util.Properties ( ) ; while ( java.util.Enumeration<java.net.URL> . boolean ( ) ) { java.net.URL java.net.URL = java.util.Enumeration<java.net.URL> . java.net.URL ( ) ; java.net.URLConnection java.net.URLConnection = java.net.URL . java.net.URLConnection ( ) ; ResourceUtils . useCachesIfNecessary ( java.net.URLConnection ) ; java.io.InputStream java.io.InputStream = java.net.URLConnection . java.io.InputStream ( ) ; try { if ( java.lang.String . boolean ( java.lang.String ) ) { java.util.Properties . void ( java.io.InputStream ) ; } else { java.util.Properties . void ( java.io.InputStream ) ; } } finally { java.io.InputStream . void ( ) ; } } return java.util.Properties ; }  <METHOD_END>