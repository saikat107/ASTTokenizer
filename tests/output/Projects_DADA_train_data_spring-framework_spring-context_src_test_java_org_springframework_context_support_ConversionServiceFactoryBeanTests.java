<METHOD_START> @ Test public void void ( ) { ConversionServiceFactoryBean org.springframework.context.support.ConversionServiceFactoryBean = new ConversionServiceFactoryBean ( ) ; org.springframework.context.support.ConversionServiceFactoryBean . afterPropertiesSet ( ) ; ConversionService org.springframework.context.support.ConversionService = org.springframework.context.support.ConversionServiceFactoryBean . getObject ( ) ; assertTrue ( org.springframework.context.support.ConversionService . canConvert ( java.lang.String .class , java.lang.Integer .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ConversionServiceFactoryBean org.springframework.context.support.ConversionServiceFactoryBean = new ConversionServiceFactoryBean ( ) ; java.util.Set<java.lang.Object> < java.lang.Object > java.util.Set<java.lang.Object> = new java.util.HashSet<java.lang.Object> <> ( ) ; java.util.Set<java.lang.Object> . boolean ( new Converter < java.lang.String , org.springframework.context.support.ConversionServiceFactoryBeanTests.Foo > ( ) { @ java.lang.Override public org.springframework.context.support.ConversionServiceFactoryBeanTests.Foo org.springframework.context.support.ConversionServiceFactoryBeanTests.Foo ( java.lang.String java.lang.String ) { return new org.springframework.context.support.ConversionServiceFactoryBeanTests.Foo ( ) ; } } ) ; java.util.Set<java.lang.Object> . boolean ( new ConverterFactory < java.lang.String , org.springframework.context.support.ConversionServiceFactoryBeanTests.Bar > ( ) { @ java.lang.Override public < T extends org.springframework.context.support.ConversionServiceFactoryBeanTests.Bar > org.springframework.context.support.Converter<java.lang.String,T> < java.lang.String , T > org.springframework.context.support.Converter<java.lang.String,T> ( java.lang.Class<T> < T > java.lang.Class<T> ) { return new Converter < java.lang.String , T > ( ) { @ java.lang.SuppressWarnings ( STRING ) @ java.lang.Override public T T ( java.lang.String java.lang.String ) { return ( T ) new org.springframework.context.support.ConversionServiceFactoryBeanTests.Bar ( ) ; } } ; } } ) ; java.util.Set<java.lang.Object> . boolean ( new GenericConverter ( ) { @ java.lang.Override public java.util.Set<org.springframework.context.support.ConvertiblePair> < ConvertiblePair > java.util.Set<org.springframework.context.support.ConvertiblePair> ( ) { return java.util.Collections . java.util.Set ( new ConvertiblePair ( java.lang.String .class , org.springframework.context.support.ConversionServiceFactoryBeanTests.Baz .class ) ) ; } @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , TypeDescriptor org.springframework.context.support.TypeDescriptor , TypeDescriptor org.springframework.context.support.TypeDescriptor ) { return new org.springframework.context.support.ConversionServiceFactoryBeanTests.Baz ( ) ; } } ) ; org.springframework.context.support.ConversionServiceFactoryBean . setConverters ( java.util.Set<java.lang.Object> ) ; org.springframework.context.support.ConversionServiceFactoryBean . afterPropertiesSet ( ) ; ConversionService org.springframework.context.support.ConversionService = org.springframework.context.support.ConversionServiceFactoryBean . getObject ( ) ; assertTrue ( org.springframework.context.support.ConversionService . canConvert ( java.lang.String .class , java.lang.Integer .class ) ) ; assertTrue ( org.springframework.context.support.ConversionService . canConvert ( java.lang.String .class , org.springframework.context.support.ConversionServiceFactoryBeanTests.Foo .class ) ) ; assertTrue ( org.springframework.context.support.ConversionService . canConvert ( java.lang.String .class , org.springframework.context.support.ConversionServiceFactoryBeanTests.Bar .class ) ) ; assertTrue ( org.springframework.context.support.ConversionService . canConvert ( java.lang.String .class , org.springframework.context.support.ConversionServiceFactoryBeanTests.Baz .class ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.context.support.ConversionServiceFactoryBeanTests.Foo org.springframework.context.support.ConversionServiceFactoryBeanTests.Foo ( java.lang.String java.lang.String ) { return new org.springframework.context.support.ConversionServiceFactoryBeanTests.Foo ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T extends org.springframework.context.support.ConversionServiceFactoryBeanTests.Bar > org.springframework.context.support.Converter<java.lang.String,T> < java.lang.String , T > org.springframework.context.support.Converter<java.lang.String,T> ( java.lang.Class<T> < T > java.lang.Class<T> ) { return new Converter < java.lang.String , T > ( ) { @ java.lang.SuppressWarnings ( STRING ) @ java.lang.Override public T T ( java.lang.String java.lang.String ) { return ( T ) new org.springframework.context.support.ConversionServiceFactoryBeanTests.Bar ( ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) @ java.lang.Override public T T ( java.lang.String java.lang.String ) { return ( T ) new org.springframework.context.support.ConversionServiceFactoryBeanTests.Bar ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Set<org.springframework.context.support.ConvertiblePair> < ConvertiblePair > java.util.Set<org.springframework.context.support.ConvertiblePair> ( ) { return java.util.Collections . java.util.Set ( new ConvertiblePair ( java.lang.String .class , org.springframework.context.support.ConversionServiceFactoryBeanTests.Baz .class ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , TypeDescriptor org.springframework.context.support.TypeDescriptor , TypeDescriptor org.springframework.context.support.TypeDescriptor ) { return new org.springframework.context.support.ConversionServiceFactoryBeanTests.Baz ( ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { ConversionServiceFactoryBean org.springframework.context.support.ConversionServiceFactoryBean = new ConversionServiceFactoryBean ( ) ; java.util.Set<java.lang.Object> < java.lang.Object > java.util.Set<java.lang.Object> = new java.util.HashSet<java.lang.Object> <> ( ) ; java.util.Set<java.lang.Object> . boolean ( STRING ) ; org.springframework.context.support.ConversionServiceFactoryBean . setConverters ( java.util.Set<java.lang.Object> ) ; org.springframework.context.support.ConversionServiceFactoryBean . afterPropertiesSet ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( STRING , ClassPathResource .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( STRING , FileSystemResource .class ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String , java.lang.Class<?> < ? > java.lang.Class<?> ) { ApplicationContext org.springframework.context.support.ApplicationContext = new ClassPathXmlApplicationContext ( java.lang.String , java.lang.Class<? extends org.springframework.context.support.ConversionServiceFactoryBeanTests> ( ) ) ; ResourceTestBean org.springframework.context.support.ResourceTestBean = org.springframework.context.support.ApplicationContext . getBean ( STRING , ResourceTestBean .class ) ; assertTrue ( java.lang.Class<> . boolean ( org.springframework.context.support.ResourceTestBean . getResource ( ) ) ) ; assertTrue ( org.springframework.context.support.ResourceTestBean . getResourceArray ( ) . length > NUMBER ) ; assertTrue ( java.lang.Class<> . boolean ( org.springframework.context.support.ResourceTestBean . getResourceArray ( ) [ NUMBER ] ) ) ; assertTrue ( org.springframework.context.support.ResourceTestBean . getResourceMap ( ) . size ( ) == NUMBER ) ; assertTrue ( java.lang.Class<> . boolean ( org.springframework.context.support.ResourceTestBean . getResourceMap ( ) . get ( STRING ) ) ) ; assertTrue ( org.springframework.context.support.ResourceTestBean . getResourceArrayMap ( ) . size ( ) == NUMBER ) ; assertTrue ( org.springframework.context.support.ResourceTestBean . getResourceArrayMap ( ) . get ( STRING ) . length > NUMBER ) ; assertTrue ( java.lang.Class<> . boolean ( org.springframework.context.support.ResourceTestBean . getResourceArrayMap ( ) . get ( STRING ) [ NUMBER ] ) ) ; }  <METHOD_END>
<METHOD_START> public void ( java.util.Map<java.lang.String,java.lang.Class<?>> < java.lang.String , java.lang.Class<?> < ? > > java.util.Map<java.lang.String,java.lang.Class<?>> ) { assertTrue ( ! java.util.Map<java.lang.String,java.lang.Class<?>> . boolean ( ) ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Class<?>> . java.util.Set<java.lang.String> ( ) . java.util.Iterator<java.lang.String> ( ) . java.lang.String ( ) , instanceOf ( java.lang.String .class ) ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Class<?>> . java.util.Collection<java.lang.Class<?>> ( ) . java.util.Iterator<java.lang.Class<?>> ( ) . java.lang.Class<?> ( ) , instanceOf ( java.lang.Class .class ) ) ; }  <METHOD_END>