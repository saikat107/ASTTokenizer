<METHOD_START> void ( java.lang.String ... java.lang.String[] ) { java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = new java.util.ArrayList<java.lang.String> <> ( ) ; for ( java.lang.String java.lang.String : java.lang.String[] ) { if ( StringUtils . hasText ( java.lang.String ) ) { java.util.List<java.lang.String> . boolean ( java.lang.String ) ; } } this . java.util.List<java.lang.String> = java.util.Collections . java.util.List<java.lang.String> ( java.util.List<java.lang.String> ) ; }  <METHOD_END>
<METHOD_START> public java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ( ) { return this . java.util.List<java.lang.String> ; }  <METHOD_END>
<METHOD_START> public static org.springframework.boot.autoconfigure.domain.EntityScanPackages org.springframework.boot.autoconfigure.domain.EntityScanPackages ( BeanFactory org.springframework.boot.autoconfigure.domain.BeanFactory ) { try { return org.springframework.boot.autoconfigure.domain.BeanFactory . getBean ( java.lang.String , org.springframework.boot.autoconfigure.domain.EntityScanPackages .class ) ; } catch ( NoSuchBeanDefinitionException org.springframework.boot.autoconfigure.domain.NoSuchBeanDefinitionException ) { return org.springframework.boot.autoconfigure.domain.EntityScanPackages ; } }  <METHOD_END>
<METHOD_START> public static void void ( BeanDefinitionRegistry org.springframework.boot.autoconfigure.domain.BeanDefinitionRegistry , java.lang.String ... java.lang.String[] ) { Assert . notNull ( org.springframework.boot.autoconfigure.domain.BeanDefinitionRegistry , STRING ) ; Assert . notNull ( java.lang.String[] , STRING ) ; void ( org.springframework.boot.autoconfigure.domain.BeanDefinitionRegistry , java.util.Arrays . java.util.List<java.lang.String> ( java.lang.String[] ) ) ; }  <METHOD_END>
<METHOD_START> public static void void ( BeanDefinitionRegistry org.springframework.boot.autoconfigure.domain.BeanDefinitionRegistry , java.util.Collection<java.lang.String> < java.lang.String > java.util.Collection<java.lang.String> ) { Assert . notNull ( org.springframework.boot.autoconfigure.domain.BeanDefinitionRegistry , STRING ) ; Assert . notNull ( java.util.Collection<java.lang.String> , STRING ) ; if ( org.springframework.boot.autoconfigure.domain.BeanDefinitionRegistry . containsBeanDefinition ( java.lang.String ) ) { BeanDefinition org.springframework.boot.autoconfigure.domain.BeanDefinition = org.springframework.boot.autoconfigure.domain.BeanDefinitionRegistry . getBeanDefinition ( java.lang.String ) ; ConstructorArgumentValues org.springframework.boot.autoconfigure.domain.ConstructorArgumentValues = org.springframework.boot.autoconfigure.domain.BeanDefinition . getConstructorArgumentValues ( ) ; org.springframework.boot.autoconfigure.domain.ConstructorArgumentValues . addIndexedArgumentValue ( NUMBER , java.lang.String[] ( org.springframework.boot.autoconfigure.domain.ConstructorArgumentValues , java.util.Collection<java.lang.String> ) ) ; } else { GenericBeanDefinition org.springframework.boot.autoconfigure.domain.GenericBeanDefinition = new GenericBeanDefinition ( ) ; org.springframework.boot.autoconfigure.domain.GenericBeanDefinition . setBeanClass ( org.springframework.boot.autoconfigure.domain.EntityScanPackages .class ) ; org.springframework.boot.autoconfigure.domain.GenericBeanDefinition . getConstructorArgumentValues ( ) . addIndexedArgumentValue ( NUMBER , java.util.Collection<java.lang.String> . java.lang.String[] ( new java.lang.String [ java.util.Collection<java.lang.String> . int ( ) ] ) ) ; org.springframework.boot.autoconfigure.domain.GenericBeanDefinition . setRole ( BeanDefinition . ROLE_INFRASTRUCTURE ) ; org.springframework.boot.autoconfigure.domain.BeanDefinitionRegistry . registerBeanDefinition ( java.lang.String , org.springframework.boot.autoconfigure.domain.GenericBeanDefinition ) ; } }  <METHOD_END>
<METHOD_START> private static java.lang.String [] java.lang.String[] ( ConstructorArgumentValues org.springframework.boot.autoconfigure.domain.ConstructorArgumentValues , java.util.Collection<java.lang.String> < java.lang.String > java.util.Collection<java.lang.String> ) { java.lang.String [] java.lang.String[] = ( java.lang.String [] ) org.springframework.boot.autoconfigure.domain.ConstructorArgumentValues . getIndexedArgumentValue ( NUMBER , java.lang.String [] .class ) . getValue ( ) ; java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = new java.util.LinkedHashSet<java.lang.String> <> ( ) ; java.util.Set<java.lang.String> . boolean ( java.util.Arrays . java.util.List<java.lang.String> ( java.lang.String[] ) ) ; java.util.Set<java.lang.String> . boolean ( java.util.Collection<java.lang.String> ) ; return java.util.Set<java.lang.String> . java.lang.String[] ( new java.lang.String [ java.util.Set<java.lang.String> . int ( ) ] ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( AnnotationMetadata org.springframework.boot.autoconfigure.domain.AnnotationMetadata , BeanDefinitionRegistry org.springframework.boot.autoconfigure.domain.BeanDefinitionRegistry ) { void ( org.springframework.boot.autoconfigure.domain.BeanDefinitionRegistry , java.util.Set<java.lang.String> ( org.springframework.boot.autoconfigure.domain.AnnotationMetadata ) ) ; }  <METHOD_END>
<METHOD_START> private java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> ( AnnotationMetadata org.springframework.boot.autoconfigure.domain.AnnotationMetadata ) { AnnotationAttributes org.springframework.boot.autoconfigure.domain.AnnotationAttributes = AnnotationAttributes . fromMap ( org.springframework.boot.autoconfigure.domain.AnnotationMetadata . getAnnotationAttributes ( EntityScan .class . java.lang.String ( ) ) ) ; java.lang.String [] java.lang.String[] = org.springframework.boot.autoconfigure.domain.AnnotationAttributes . getStringArray ( STRING ) ; java.lang.Class<?> < ? > [] java.lang.Class<?>[] = org.springframework.boot.autoconfigure.domain.AnnotationAttributes . getClassArray ( STRING ) ; java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = new java.util.LinkedHashSet<java.lang.String> <> ( ) ; java.util.Set<java.lang.String> . boolean ( java.util.Arrays . java.util.List<java.lang.String> ( java.lang.String[] ) ) ; for ( java.lang.Class<?> < ? > java.lang.Class<?> : java.lang.Class<?>[] ) { java.util.Set<java.lang.String> . boolean ( ClassUtils . getPackageName ( java.lang.Class<> ) ) ; } if ( java.util.Set<java.lang.String> . boolean ( ) ) { java.lang.String java.lang.String = ClassUtils . getPackageName ( org.springframework.boot.autoconfigure.domain.AnnotationMetadata . getClassName ( ) ) ; Assert . state ( ! StringUtils . isEmpty ( java.lang.String ) , STRING ) ; return java.util.Collections . java.util.Set<java.lang.String> ( java.lang.String ) ; } return java.util.Set<java.lang.String> ; }  <METHOD_END>