<METHOD_START> @ BeforeClass public static void void ( ) { org.springframework.context.annotation.ImportSelectorTests . java.util.Map<java.lang.Class<?>,java.lang.String> . void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DefaultListableBeanFactory org.springframework.context.annotation.DefaultListableBeanFactory = spy ( new DefaultListableBeanFactory ( ) ) ; AnnotationConfigApplicationContext org.springframework.context.annotation.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( org.springframework.context.annotation.DefaultListableBeanFactory ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . register ( org.springframework.context.annotation.ImportSelectorTests.Config .class ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . refresh ( ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( org.springframework.context.annotation.ImportSelectorTests.Config .class ) ; InOrder org.springframework.context.annotation.InOrder = inOrder ( org.springframework.context.annotation.DefaultListableBeanFactory ) ; org.springframework.context.annotation.InOrder . verify ( org.springframework.context.annotation.DefaultListableBeanFactory ) . registerBeanDefinition ( eq ( STRING ) , any ( ) ) ; org.springframework.context.annotation.InOrder . verify ( org.springframework.context.annotation.DefaultListableBeanFactory ) . registerBeanDefinition ( eq ( STRING ) , any ( ) ) ; org.springframework.context.annotation.InOrder . verify ( org.springframework.context.annotation.DefaultListableBeanFactory ) . registerBeanDefinition ( eq ( STRING ) , any ( ) ) ; org.springframework.context.annotation.InOrder . verify ( org.springframework.context.annotation.DefaultListableBeanFactory ) . registerBeanDefinition ( eq ( STRING ) , any ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AnnotationConfigApplicationContext org.springframework.context.annotation.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( org.springframework.context.annotation.ImportSelectorTests.AwareConfig .class ) ; assertThat ( SampleRegistrar . beanFactory , is ( ( BeanFactory ) org.springframework.context.annotation.AnnotationConfigApplicationContext . getBeanFactory ( ) ) ) ; assertThat ( SampleRegistrar . classLoader , is ( org.springframework.context.annotation.AnnotationConfigApplicationContext . getBeanFactory ( ) . getBeanClassLoader ( ) ) ) ; assertThat ( SampleRegistrar . resourceLoader , is ( notNullValue ( ) ) ) ; assertThat ( SampleRegistrar . environment , is ( ( Environment ) org.springframework.context.annotation.AnnotationConfigApplicationContext . getEnvironment ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { new AnnotationConfigApplicationContext ( org.springframework.context.annotation.ImportSelectorTests.IndirectConfig .class ) ; Matcher < java.lang.String > org.springframework.context.annotation.Matcher<java.lang.String> = equalTo ( org.springframework.context.annotation.ImportSelectorTests.IndirectImport .class . java.lang.String ( ) ) ; assertThat ( java.util.Map<java.lang.Class<?>,java.lang.String> . java.lang.String ( org.springframework.context.annotation.ImportSelectorTests.ImportSelector1 .class ) , org.springframework.context.annotation.Matcher<java.lang.String> ) ; assertThat ( java.util.Map<java.lang.Class<?>,java.lang.String> . java.lang.String ( org.springframework.context.annotation.ImportSelectorTests.ImportSelector2 .class ) , org.springframework.context.annotation.Matcher<java.lang.String> ) ; assertThat ( java.util.Map<java.lang.Class<?>,java.lang.String> . java.lang.String ( org.springframework.context.annotation.ImportSelectorTests.DeferredImportSelector1 .class ) , org.springframework.context.annotation.Matcher<java.lang.String> ) ; assertThat ( java.util.Map<java.lang.Class<?>,java.lang.String> . java.lang.String ( org.springframework.context.annotation.ImportSelectorTests.DeferredImportSelector2 .class ) , org.springframework.context.annotation.Matcher<java.lang.String> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.ClassLoader java.lang.ClassLoader ) { SampleRegistrar . classLoader = java.lang.ClassLoader ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( BeanFactory org.springframework.context.annotation.BeanFactory ) throws org.springframework.context.annotation.BeansException { SampleRegistrar . beanFactory = org.springframework.context.annotation.BeanFactory ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ResourceLoader org.springframework.context.annotation.ResourceLoader ) { SampleRegistrar . resourceLoader = org.springframework.context.annotation.ResourceLoader ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Environment org.springframework.context.annotation.Environment ) { SampleRegistrar . environment = org.springframework.context.annotation.Environment ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String [] java.lang.String[] ( AnnotationMetadata org.springframework.context.annotation.AnnotationMetadata ) { return new java.lang.String [] {} ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String [] java.lang.String[] ( AnnotationMetadata org.springframework.context.annotation.AnnotationMetadata ) { org.springframework.context.annotation.ImportSelectorTests . java.util.Map<java.lang.Class<?>,java.lang.String> . java.lang.String ( java.lang.Class<? extends org.springframework.context.annotation.ImportSelectorTests.ImportSelector1> ( ) , org.springframework.context.annotation.AnnotationMetadata . getClassName ( ) ) ; return new java.lang.String [] { org.springframework.context.annotation.ImportSelectorTests.ImportedSelector1 .class . java.lang.String ( ) } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String [] java.lang.String[] ( AnnotationMetadata org.springframework.context.annotation.AnnotationMetadata ) { org.springframework.context.annotation.ImportSelectorTests . java.util.Map<java.lang.Class<?>,java.lang.String> . java.lang.String ( java.lang.Class<? extends org.springframework.context.annotation.ImportSelectorTests.ImportSelector2> ( ) , org.springframework.context.annotation.AnnotationMetadata . getClassName ( ) ) ; return new java.lang.String [] { org.springframework.context.annotation.ImportSelectorTests.ImportedSelector2 .class . java.lang.String ( ) } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String [] java.lang.String[] ( AnnotationMetadata org.springframework.context.annotation.AnnotationMetadata ) { org.springframework.context.annotation.ImportSelectorTests . java.util.Map<java.lang.Class<?>,java.lang.String> . java.lang.String ( java.lang.Class<? extends org.springframework.context.annotation.ImportSelectorTests.DeferredImportSelector1> ( ) , org.springframework.context.annotation.AnnotationMetadata . getClassName ( ) ) ; return new java.lang.String [] { org.springframework.context.annotation.ImportSelectorTests.DeferredImportedSelector1 .class . java.lang.String ( ) } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return Ordered . LOWEST_PRECEDENCE ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String [] java.lang.String[] ( AnnotationMetadata org.springframework.context.annotation.AnnotationMetadata ) { org.springframework.context.annotation.ImportSelectorTests . java.util.Map<java.lang.Class<?>,java.lang.String> . java.lang.String ( java.lang.Class<? extends org.springframework.context.annotation.ImportSelectorTests.DeferredImportSelector2> ( ) , org.springframework.context.annotation.AnnotationMetadata . getClassName ( ) ) ; return new java.lang.String [] { org.springframework.context.annotation.ImportSelectorTests.DeferredImportedSelector2 .class . java.lang.String ( ) } ; }  <METHOD_END>
<METHOD_START> @ Bean public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ Bean public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ Bean public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ Bean public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String [] java.lang.String[] ( AnnotationMetadata org.springframework.context.annotation.AnnotationMetadata ) { return new java.lang.String [] { org.springframework.context.annotation.ImportSelectorTests.IndirectImport .class . java.lang.String ( ) } ; }  <METHOD_END>