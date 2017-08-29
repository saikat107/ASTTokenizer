<METHOD_START> void ( BeanDefinitionRegistry org.springframework.boot.BeanDefinitionRegistry , java.lang.Object ... java.lang.Object[] ) { Assert . notNull ( org.springframework.boot.BeanDefinitionRegistry , STRING ) ; Assert . notEmpty ( java.lang.Object[] , STRING ) ; this . java.lang.Object[] = java.lang.Object[] ; this . org.springframework.boot.AnnotatedBeanDefinitionReader = new AnnotatedBeanDefinitionReader ( org.springframework.boot.BeanDefinitionRegistry ) ; this . org.springframework.boot.XmlBeanDefinitionReader = new XmlBeanDefinitionReader ( org.springframework.boot.BeanDefinitionRegistry ) ; if ( boolean ( ) ) { this . org.springframework.boot.BeanDefinitionReader = new GroovyBeanDefinitionReader ( org.springframework.boot.BeanDefinitionRegistry ) ; } this . org.springframework.boot.ClassPathBeanDefinitionScanner = new ClassPathBeanDefinitionScanner ( org.springframework.boot.BeanDefinitionRegistry ) ; this . org.springframework.boot.ClassPathBeanDefinitionScanner . addExcludeFilter ( new org.springframework.boot.BeanDefinitionLoader.ClassExcludeFilter ( java.lang.Object[] ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( BeanNameGenerator org.springframework.boot.BeanNameGenerator ) { this . org.springframework.boot.AnnotatedBeanDefinitionReader . setBeanNameGenerator ( org.springframework.boot.BeanNameGenerator ) ; this . org.springframework.boot.XmlBeanDefinitionReader . setBeanNameGenerator ( org.springframework.boot.BeanNameGenerator ) ; this . org.springframework.boot.ClassPathBeanDefinitionScanner . setBeanNameGenerator ( org.springframework.boot.BeanNameGenerator ) ; }  <METHOD_END>
<METHOD_START> public void void ( ResourceLoader org.springframework.boot.ResourceLoader ) { this . org.springframework.boot.ResourceLoader = org.springframework.boot.ResourceLoader ; this . org.springframework.boot.XmlBeanDefinitionReader . setResourceLoader ( org.springframework.boot.ResourceLoader ) ; this . org.springframework.boot.ClassPathBeanDefinitionScanner . setResourceLoader ( org.springframework.boot.ResourceLoader ) ; }  <METHOD_END>
<METHOD_START> public void void ( ConfigurableEnvironment org.springframework.boot.ConfigurableEnvironment ) { this . org.springframework.boot.AnnotatedBeanDefinitionReader . setEnvironment ( org.springframework.boot.ConfigurableEnvironment ) ; this . org.springframework.boot.XmlBeanDefinitionReader . setEnvironment ( org.springframework.boot.ConfigurableEnvironment ) ; this . org.springframework.boot.ClassPathBeanDefinitionScanner . setEnvironment ( org.springframework.boot.ConfigurableEnvironment ) ; }  <METHOD_END>
<METHOD_START> public int int ( ) { int int = NUMBER ; for ( java.lang.Object java.lang.Object : this . java.lang.Object[] ) { int += int ( java.lang.Object ) ; } return int ; }  <METHOD_END>
<METHOD_START> private int int ( java.lang.Object java.lang.Object ) { Assert . notNull ( java.lang.Object , STRING ) ; if ( java.lang.Object instanceof java.lang.Class<?> < ? > ) { return int ( ( java.lang.Class<?> < ? > ) java.lang.Object ) ; } if ( java.lang.Object instanceof Resource ) { return int ( ( Resource ) java.lang.Object ) ; } if ( java.lang.Object instanceof java.lang.Package ) { return int ( ( java.lang.Package ) java.lang.Object ) ; } if ( java.lang.Object instanceof java.lang.CharSequence ) { return int ( ( java.lang.CharSequence ) java.lang.Object ) ; } throw new java.lang.IllegalArgumentException ( STRING + java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ; }  <METHOD_END>
<METHOD_START> private int int ( java.lang.Class<?> < ? > java.lang.Class<?> ) { if ( boolean ( ) ) { if ( org.springframework.boot.BeanDefinitionLoader.GroovyBeanDefinitionSource .class . boolean ( java.lang.Class<> ) ) { org.springframework.boot.BeanDefinitionLoader.GroovyBeanDefinitionSource org.springframework.boot.BeanDefinitionLoader.GroovyBeanDefinitionSource = BeanUtils . instantiateClass ( java.lang.Class<> , org.springframework.boot.BeanDefinitionLoader.GroovyBeanDefinitionSource .class ) ; int ( org.springframework.boot.BeanDefinitionLoader.GroovyBeanDefinitionSource ) ; } } if ( boolean ( java.lang.Class<> ) ) { this . org.springframework.boot.AnnotatedBeanDefinitionReader . register ( java.lang.Class<> ) ; return NUMBER ; } return NUMBER ; }  <METHOD_END>
<METHOD_START> private int int ( org.springframework.boot.BeanDefinitionLoader.GroovyBeanDefinitionSource org.springframework.boot.BeanDefinitionLoader.GroovyBeanDefinitionSource ) { int int = this . org.springframework.boot.XmlBeanDefinitionReader . getRegistry ( ) . getBeanDefinitionCount ( ) ; ( ( GroovyBeanDefinitionReader ) this . org.springframework.boot.BeanDefinitionReader ) . beans ( org.springframework.boot.BeanDefinitionLoader.GroovyBeanDefinitionSource . org.springframework.boot.Closure<?> ( ) ) ; int int = this . org.springframework.boot.XmlBeanDefinitionReader . getRegistry ( ) . getBeanDefinitionCount ( ) ; return int - int ; }  <METHOD_END>
<METHOD_START> private int int ( Resource org.springframework.boot.Resource ) { if ( org.springframework.boot.Resource . getFilename ( ) . endsWith ( STRING ) ) { if ( this . org.springframework.boot.BeanDefinitionReader == null ) { throw new BeanDefinitionStoreException ( STRING ) ; } return this . org.springframework.boot.BeanDefinitionReader . loadBeanDefinitions ( org.springframework.boot.Resource ) ; } return this . org.springframework.boot.XmlBeanDefinitionReader . loadBeanDefinitions ( org.springframework.boot.Resource ) ; }  <METHOD_END>
<METHOD_START> private int int ( java.lang.Package java.lang.Package ) { return this . org.springframework.boot.ClassPathBeanDefinitionScanner . scan ( java.lang.Package . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> private int int ( java.lang.CharSequence java.lang.CharSequence ) { java.lang.String java.lang.String = this . org.springframework.boot.XmlBeanDefinitionReader . getEnvironment ( ) . resolvePlaceholders ( java.lang.CharSequence . java.lang.String ( ) ) ; try { return int ( ClassUtils . forName ( java.lang.String , null ) ) ; } catch ( java.lang.IllegalArgumentException java.lang.IllegalArgumentException ) { } catch ( java.lang.ClassNotFoundException java.lang.ClassNotFoundException ) { } Resource [] org.springframework.boot.Resource[] = org.springframework.boot.Resource[] ( java.lang.String ) ; int int = NUMBER ; boolean boolean = false ; for ( Resource org.springframework.boot.Resource : org.springframework.boot.Resource[] ) { if ( boolean ( org.springframework.boot.Resource ) ) { boolean = true ; int += int ( org.springframework.boot.Resource ) ; } } if ( boolean ) { return int ; } java.lang.Package java.lang.Package = java.lang.Package ( java.lang.String ) ; if ( java.lang.Package != null ) { return int ( java.lang.Package ) ; } throw new java.lang.IllegalArgumentException ( STRING + java.lang.String + STRING ) ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( ) { return ClassUtils . isPresent ( STRING , null ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.Resource [] org.springframework.boot.Resource[] ( java.lang.String java.lang.String ) { ResourceLoader org.springframework.boot.ResourceLoader = ( this . org.springframework.boot.ResourceLoader != null ? this . org.springframework.boot.ResourceLoader : new PathMatchingResourcePatternResolver ( ) ) ; try { if ( org.springframework.boot.ResourceLoader instanceof ResourcePatternResolver ) { return ( ( ResourcePatternResolver ) org.springframework.boot.ResourceLoader ) . getResources ( java.lang.String ) ; } return new Resource [] { org.springframework.boot.ResourceLoader . getResource ( java.lang.String ) } ; } catch ( java.io.IOException java.io.IOException ) { throw new java.lang.IllegalStateException ( STRING + java.lang.String + STRING ) ; } }  <METHOD_END>
<METHOD_START> private boolean boolean ( Resource org.springframework.boot.Resource ) { if ( org.springframework.boot.Resource == null || ! org.springframework.boot.Resource . exists ( ) ) { return false ; } if ( org.springframework.boot.Resource instanceof ClassPathResource ) { java.lang.String java.lang.String = ( ( ClassPathResource ) org.springframework.boot.Resource ) . getPath ( ) ; if ( java.lang.String . int ( STRING ) == - NUMBER ) { try { return java.lang.Package . java.lang.Package ( java.lang.String ) == null ; } catch ( java.lang.Exception java.lang.Exception ) { } } } return true ; }  <METHOD_END>
<METHOD_START> private java.lang.Package java.lang.Package ( java.lang.CharSequence java.lang.CharSequence ) { java.lang.Package java.lang.Package = java.lang.Package . java.lang.Package ( java.lang.CharSequence . java.lang.String ( ) ) ; if ( java.lang.Package != null ) { return java.lang.Package ; } try { ResourcePatternResolver org.springframework.boot.ResourcePatternResolver = new PathMatchingResourcePatternResolver ( java.lang.Class<? extends org.springframework.boot.BeanDefinitionLoader> ( ) . java.lang.ClassLoader ( ) ) ; Resource [] org.springframework.boot.Resource[] = org.springframework.boot.ResourcePatternResolver . getResources ( ClassUtils . convertClassNameToResourcePath ( java.lang.CharSequence . java.lang.String ( ) ) + STRING ) ; for ( Resource org.springframework.boot.Resource : org.springframework.boot.Resource[] ) { java.lang.String java.lang.String = StringUtils . stripFilenameExtension ( org.springframework.boot.Resource . getFilename ( ) ) ; int ( java.lang.Class . java.lang.Class<?> ( java.lang.CharSequence . java.lang.String ( ) + STRING + java.lang.String ) ) ; break; } } catch ( java.lang.Exception java.lang.Exception ) { } return java.lang.Package . java.lang.Package ( java.lang.CharSequence . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( java.lang.Class<?> < ? > java.lang.Class<?> ) { if ( AnnotationUtils . findAnnotation ( java.lang.Class<> , Component .class ) != null ) { return true ; } if ( java.lang.Class<> . java.lang.String ( ) . boolean ( STRING ) || java.lang.Class<> . boolean ( ) || java.lang.Class<> . java.lang.reflect.Constructor<?>[] ( ) == null || java.lang.Class<> . java.lang.reflect.Constructor<?>[] ( ) . int == NUMBER ) { return false ; } return true ; }  <METHOD_END>
<METHOD_START> void ( java.lang.Object ... java.lang.Object[] ) { super( false , false ); for ( java.lang.Object java.lang.Object : java.lang.Object[] ) { if ( java.lang.Object instanceof java.lang.Class<?> < ? > ) { this . java.util.Set<java.lang.String> . boolean ( ( ( java.lang.Class<?> < ? > ) java.lang.Object ) . java.lang.String ( ) ) ; } } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( java.lang.String java.lang.String ) { return this . java.util.Set<java.lang.String> . boolean ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> org.springframework.boot.Closure<?> < ? > org.springframework.boot.Closure<?> ( )  <METHOD_END>