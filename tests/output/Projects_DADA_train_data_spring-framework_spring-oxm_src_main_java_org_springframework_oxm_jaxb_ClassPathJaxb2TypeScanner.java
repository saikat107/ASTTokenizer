<METHOD_START> public void ( java.lang.ClassLoader java.lang.ClassLoader , java.lang.String ... java.lang.String[] ) { Assert . notEmpty ( java.lang.String[] , STRING ) ; this . org.springframework.oxm.jaxb.ResourcePatternResolver = new PathMatchingResourcePatternResolver ( java.lang.ClassLoader ) ; this . java.lang.String[] = java.lang.String[] ; }  <METHOD_END>
<METHOD_START> public java.lang.Class<?> < ? > [] java.lang.Class<?>[] ( ) org.springframework.oxm.jaxb.UncategorizedMappingException { try { java.util.List<java.lang.Class<?>> < java.lang.Class<?> < ? > > java.util.List<java.lang.Class<?>> = new java.util.ArrayList<java.lang.Class<?>> <> ( ) ; for ( java.lang.String java.lang.String : this . java.lang.String[] ) { java.lang.String java.lang.String = ResourcePatternResolver . CLASSPATH_ALL_URL_PREFIX + ClassUtils . convertClassNameToResourcePath ( java.lang.String ) + java.lang.String ; Resource [] org.springframework.oxm.jaxb.Resource[] = this . org.springframework.oxm.jaxb.ResourcePatternResolver . getResources ( java.lang.String ) ; MetadataReaderFactory org.springframework.oxm.jaxb.MetadataReaderFactory = new CachingMetadataReaderFactory ( this . org.springframework.oxm.jaxb.ResourcePatternResolver ) ; for ( Resource org.springframework.oxm.jaxb.Resource : org.springframework.oxm.jaxb.Resource[] ) { MetadataReader org.springframework.oxm.jaxb.MetadataReader = org.springframework.oxm.jaxb.MetadataReaderFactory . getMetadataReader ( org.springframework.oxm.jaxb.Resource ) ; if ( boolean ( org.springframework.oxm.jaxb.MetadataReader , org.springframework.oxm.jaxb.MetadataReaderFactory ) ) { java.lang.String java.lang.String = org.springframework.oxm.jaxb.MetadataReader . getClassMetadata ( ) . getClassName ( ) ; java.lang.Class<?> < ? > java.lang.Class<?> = this . org.springframework.oxm.jaxb.ResourcePatternResolver . getClassLoader ( ) . loadClass ( java.lang.String ) ; java.util.List<java.lang.Class<?>> . boolean ( java.lang.Class<> ) ; } } } return java.util.List<java.lang.Class<?>> . java.lang.Class<?>[] ( new java.lang.Class<?> < ? > [ java.util.List<java.lang.Class<?>> . int ( ) ] ) ; } catch ( java.io.IOException java.io.IOException ) { throw new UncategorizedMappingException ( STRING , java.io.IOException ) ; } catch ( java.lang.ClassNotFoundException java.lang.ClassNotFoundException ) { throw new UncategorizedMappingException ( STRING , java.lang.ClassNotFoundException ) ; } }  <METHOD_END>
<METHOD_START> protected boolean boolean ( MetadataReader org.springframework.oxm.jaxb.MetadataReader , MetadataReaderFactory org.springframework.oxm.jaxb.MetadataReaderFactory ) throws java.io.IOException { for ( TypeFilter org.springframework.oxm.jaxb.TypeFilter : org.springframework.oxm.jaxb.TypeFilter[] ) { if ( org.springframework.oxm.jaxb.TypeFilter . match ( org.springframework.oxm.jaxb.MetadataReader , org.springframework.oxm.jaxb.MetadataReaderFactory ) && ! org.springframework.oxm.jaxb.MetadataReader . getClassMetadata ( ) . isInterface ( ) ) { return true ; } } return false ; }  <METHOD_END>