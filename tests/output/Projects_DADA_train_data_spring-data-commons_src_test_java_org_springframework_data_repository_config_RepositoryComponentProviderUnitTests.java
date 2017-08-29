<METHOD_START> @ Test public void void ( ) { RepositoryComponentProvider org.springframework.data.repository.config.RepositoryComponentProvider = new RepositoryComponentProvider ( java.util.Collections . java.util.List<java.lang.Object> ( ) ) ; java.util.Set<org.springframework.data.repository.config.BeanDefinition> < BeanDefinition > java.util.Set<org.springframework.data.repository.config.BeanDefinition> = org.springframework.data.repository.config.RepositoryComponentProvider . findCandidateComponents ( STRING ) ; assertThat ( java.util.Set<org.springframework.data.repository.config.BeanDefinition> ) . hasSize ( NUMBER ) ; assertThat ( java.util.Set<org.springframework.data.repository.config.BeanDefinition> ) . extracting ( BeanDefinition :: getBeanClassName ) . contains ( SampleAnnotatedRepository .class . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.List<? extends org.springframework.data.repository.config.TypeFilter> < ? extends TypeFilter > java.util.List<? extends org.springframework.data.repository.config.TypeFilter> = java.util.Collections . java.util.List ( new AssignableTypeFilter ( MyOtherRepository .class ) ) ; RepositoryComponentProvider org.springframework.data.repository.config.RepositoryComponentProvider = new RepositoryComponentProvider ( java.util.List<> ) ; java.util.Set<org.springframework.data.repository.config.BeanDefinition> < BeanDefinition > java.util.Set<org.springframework.data.repository.config.BeanDefinition> = org.springframework.data.repository.config.RepositoryComponentProvider . findCandidateComponents ( STRING ) ; assertThat ( java.util.Set<org.springframework.data.repository.config.BeanDefinition> ) . hasSize ( NUMBER ) ; assertThat ( java.util.Set<org.springframework.data.repository.config.BeanDefinition> ) . extracting ( BeanDefinition :: getBeanClassName ) . contains ( MyOtherRepository .class . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { RepositoryComponentProvider org.springframework.data.repository.config.RepositoryComponentProvider = new RepositoryComponentProvider ( java.util.Collections . java.util.List<java.lang.Object> ( ) ) ; org.springframework.data.repository.config.RepositoryComponentProvider . setConsiderNestedRepositoryInterfaces ( true ) ; java.util.Set<org.springframework.data.repository.config.BeanDefinition> < BeanDefinition > java.util.Set<org.springframework.data.repository.config.BeanDefinition> = org.springframework.data.repository.config.RepositoryComponentProvider . findCandidateComponents ( STRING ) ; java.lang.String java.lang.String = STRING ; assertThat ( java.util.Set<org.springframework.data.repository.config.BeanDefinition> . size ( ) ) . isGreaterThanOrEqualTo ( NUMBER ) ; assertThat ( java.util.Set<org.springframework.data.repository.config.BeanDefinition> ) . extracting ( BeanDefinition :: getBeanClassName ) . contains ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> private void ( java.lang.Class<?> < ? > java.lang.Class<?> ) { this . java.lang.Class<?> = java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> public static org.springframework.data.repository.config.RepositoryComponentProviderUnitTests.BeanDefinitionOfTypeMatcher org.springframework.data.repository.config.RepositoryComponentProviderUnitTests.BeanDefinitionOfTypeMatcher ( java.lang.Class<?> < ? > java.lang.Class<?> ) { return new org.springframework.data.repository.config.RepositoryComponentProviderUnitTests.BeanDefinitionOfTypeMatcher ( java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Object java.lang.Object ) { if ( ! ( java.lang.Object instanceof BeanDefinition ) ) { return false ; } BeanDefinition org.springframework.data.repository.config.BeanDefinition = ( BeanDefinition ) java.lang.Object ; return org.springframework.data.repository.config.BeanDefinition . getBeanClassName ( ) . equals ( java.lang.Class<> . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Description org.springframework.data.repository.config.Description ) {}  <METHOD_END>