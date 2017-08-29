<METHOD_START> @ After public void void ( ) { this . org.springframework.boot.autoconfigure.orm.jpa.AnnotationConfigApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> protected abstract java.lang.Class<?> < ? > java.lang.Class<?> ( )  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.autoconfigure.orm.jpa.AnnotationConfigApplicationContext . register ( PropertyPlaceholderAutoConfiguration .class , java.lang.Class<?> ( ) ) ; this . org.springframework.boot.autoconfigure.orm.jpa.ExpectedException . expect ( BeanCreationException .class ) ; this . org.springframework.boot.autoconfigure.orm.jpa.ExpectedException . expectMessage ( STRING ) ; this . org.springframework.boot.autoconfigure.orm.jpa.ExpectedException . expectMessage ( STRING ) ; this . org.springframework.boot.autoconfigure.orm.jpa.AnnotationConfigApplicationContext . refresh ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( ) ; this . org.springframework.boot.autoconfigure.orm.jpa.AnnotationConfigApplicationContext . refresh ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.orm.jpa.AnnotationConfigApplicationContext . getBean ( javax.sql.DataSource .class ) ) . isNotNull ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.orm.jpa.AnnotationConfigApplicationContext . getBean ( JpaTransactionManager .class ) ) . isNotNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.autoconfigure.orm.jpa.AnnotationConfigApplicationContext . register ( DataSourceTransactionManagerAutoConfiguration .class ) ; void ( ) ; this . org.springframework.boot.autoconfigure.orm.jpa.AnnotationConfigApplicationContext . refresh ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.orm.jpa.AnnotationConfigApplicationContext . getBean ( javax.sql.DataSource .class ) ) . isNotNull ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.orm.jpa.AnnotationConfigApplicationContext . getBean ( STRING ) ) . isInstanceOf ( JpaTransactionManager .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { AnnotationConfigWebApplicationContext org.springframework.boot.autoconfigure.orm.jpa.AnnotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext ( ) ; org.springframework.boot.autoconfigure.orm.jpa.AnnotationConfigWebApplicationContext . register ( org.springframework.boot.autoconfigure.orm.jpa.AbstractJpaAutoConfigurationTests.TestConfiguration .class , EmbeddedDataSourceConfiguration .class , PropertyPlaceholderAutoConfiguration .class , java.lang.Class<?> ( ) ) ; org.springframework.boot.autoconfigure.orm.jpa.AnnotationConfigWebApplicationContext . refresh ( ) ; assertThat ( org.springframework.boot.autoconfigure.orm.jpa.AnnotationConfigWebApplicationContext . getBean ( OpenEntityManagerInViewInterceptor .class ) ) . isNotNull ( ) ; org.springframework.boot.autoconfigure.orm.jpa.AnnotationConfigWebApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { AnnotationConfigWebApplicationContext org.springframework.boot.autoconfigure.orm.jpa.AnnotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext ( ) ; org.springframework.boot.autoconfigure.orm.jpa.AnnotationConfigWebApplicationContext . register ( org.springframework.boot.autoconfigure.orm.jpa.AbstractJpaAutoConfigurationTests.TestFilterConfiguration .class , EmbeddedDataSourceConfiguration .class , PropertyPlaceholderAutoConfiguration .class , java.lang.Class<?> ( ) ) ; org.springframework.boot.autoconfigure.orm.jpa.AnnotationConfigWebApplicationContext . refresh ( ) ; assertThat ( java.lang.String[] ( org.springframework.boot.autoconfigure.orm.jpa.AnnotationConfigWebApplicationContext ) . length ) . isEqualTo ( NUMBER ) ; org.springframework.boot.autoconfigure.orm.jpa.AnnotationConfigWebApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { AnnotationConfigWebApplicationContext org.springframework.boot.autoconfigure.orm.jpa.AnnotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext ( ) ; EnvironmentTestUtils . addEnvironment ( org.springframework.boot.autoconfigure.orm.jpa.AnnotationConfigWebApplicationContext , STRING ) ; org.springframework.boot.autoconfigure.orm.jpa.AnnotationConfigWebApplicationContext . register ( org.springframework.boot.autoconfigure.orm.jpa.AbstractJpaAutoConfigurationTests.TestConfiguration .class , EmbeddedDataSourceConfiguration .class , PropertyPlaceholderAutoConfiguration .class , java.lang.Class<?> ( ) ) ; org.springframework.boot.autoconfigure.orm.jpa.AnnotationConfigWebApplicationContext . refresh ( ) ; assertThat ( java.lang.String[] ( org.springframework.boot.autoconfigure.orm.jpa.AnnotationConfigWebApplicationContext ) . length ) . isEqualTo ( NUMBER ) ; org.springframework.boot.autoconfigure.orm.jpa.AnnotationConfigWebApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { EnvironmentTestUtils . addEnvironment ( this . org.springframework.boot.autoconfigure.orm.jpa.AnnotationConfigApplicationContext , STRING , STRING , STRING ) ; void ( ) ; this . org.springframework.boot.autoconfigure.orm.jpa.AnnotationConfigApplicationContext . refresh ( ) ; LocalContainerEntityManagerFactoryBean org.springframework.boot.autoconfigure.orm.jpa.LocalContainerEntityManagerFactoryBean = this . org.springframework.boot.autoconfigure.orm.jpa.AnnotationConfigApplicationContext . getBean ( LocalContainerEntityManagerFactoryBean .class ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = org.springframework.boot.autoconfigure.orm.jpa.LocalContainerEntityManagerFactoryBean . getJpaPropertyMap ( ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . isEqualTo ( STRING ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . isEqualTo ( STRING ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { EnvironmentTestUtils . addEnvironment ( this . org.springframework.boot.autoconfigure.orm.jpa.AnnotationConfigApplicationContext , STRING ) ; void ( org.springframework.boot.autoconfigure.orm.jpa.AbstractJpaAutoConfigurationTests.TestConfigurationWithLocalContainerEntityManagerFactoryBean .class ) ; this . org.springframework.boot.autoconfigure.orm.jpa.AnnotationConfigApplicationContext . refresh ( ) ; LocalContainerEntityManagerFactoryBean org.springframework.boot.autoconfigure.orm.jpa.LocalContainerEntityManagerFactoryBean = this . org.springframework.boot.autoconfigure.orm.jpa.AnnotationConfigApplicationContext . getBean ( LocalContainerEntityManagerFactoryBean .class ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = org.springframework.boot.autoconfigure.orm.jpa.LocalContainerEntityManagerFactoryBean . getJpaPropertyMap ( ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { EnvironmentTestUtils . addEnvironment ( this . org.springframework.boot.autoconfigure.orm.jpa.AnnotationConfigApplicationContext , STRING ) ; void ( org.springframework.boot.autoconfigure.orm.jpa.AbstractJpaAutoConfigurationTests.TestConfigurationWithEntityManagerFactory .class ) ; this . org.springframework.boot.autoconfigure.orm.jpa.AnnotationConfigApplicationContext . refresh ( ) ; EntityManagerFactory org.springframework.boot.autoconfigure.orm.jpa.EntityManagerFactory = this . org.springframework.boot.autoconfigure.orm.jpa.AnnotationConfigApplicationContext . getBean ( EntityManagerFactory .class ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = org.springframework.boot.autoconfigure.orm.jpa.EntityManagerFactory . getProperties ( ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.boot.autoconfigure.orm.jpa.AbstractJpaAutoConfigurationTests.TestConfigurationWithTransactionManager .class ) ; this . org.springframework.boot.autoconfigure.orm.jpa.AnnotationConfigApplicationContext . refresh ( ) ; PlatformTransactionManager org.springframework.boot.autoconfigure.orm.jpa.PlatformTransactionManager = this . org.springframework.boot.autoconfigure.orm.jpa.AnnotationConfigApplicationContext . getBean ( PlatformTransactionManager .class ) ; assertThat ( org.springframework.boot.autoconfigure.orm.jpa.PlatformTransactionManager ) . isInstanceOf ( org.springframework.boot.autoconfigure.orm.jpa.AbstractJpaAutoConfigurationTests.CustomJpaTransactionManager .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( org.springframework.boot.autoconfigure.orm.jpa.AbstractJpaAutoConfigurationTests.TestConfigurationWithCustomPersistenceUnitManager .class ) ; this . org.springframework.boot.autoconfigure.orm.jpa.AnnotationConfigApplicationContext . refresh ( ) ; LocalContainerEntityManagerFactoryBean org.springframework.boot.autoconfigure.orm.jpa.LocalContainerEntityManagerFactoryBean = this . org.springframework.boot.autoconfigure.orm.jpa.AnnotationConfigApplicationContext . getBean ( LocalContainerEntityManagerFactoryBean .class ) ; java.lang.reflect.Field java.lang.reflect.Field = LocalContainerEntityManagerFactoryBean .class . java.lang.reflect.Field ( STRING ) ; java.lang.reflect.Field . void ( true ) ; assertThat ( java.lang.reflect.Field . java.lang.Object ( org.springframework.boot.autoconfigure.orm.jpa.LocalContainerEntityManagerFactoryBean ) ) . isEqualTo ( this . org.springframework.boot.autoconfigure.orm.jpa.AnnotationConfigApplicationContext . getBean ( PersistenceUnitManager .class ) ) ; }  <METHOD_END>
<METHOD_START> protected void void ( ) { void ( org.springframework.boot.autoconfigure.orm.jpa.AbstractJpaAutoConfigurationTests.TestConfiguration .class ) ; }  <METHOD_END>
<METHOD_START> protected void void ( java.lang.Class<?> < ? > java.lang.Class<?> ) { this . org.springframework.boot.autoconfigure.orm.jpa.AnnotationConfigApplicationContext . register ( java.lang.Class<> , EmbeddedDataSourceConfiguration .class , DataSourceAutoConfiguration .class , TransactionAutoConfiguration .class , PropertyPlaceholderAutoConfiguration .class , java.lang.Class<?> ( ) ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String [] java.lang.String[] ( ApplicationContext org.springframework.boot.autoconfigure.orm.jpa.ApplicationContext ) { return org.springframework.boot.autoconfigure.orm.jpa.ApplicationContext . getBeanNamesForType ( OpenEntityManagerInViewInterceptor .class ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.orm.jpa.OpenEntityManagerInViewFilter org.springframework.boot.autoconfigure.orm.jpa.OpenEntityManagerInViewFilter ( ) { return new OpenEntityManagerInViewFilter ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.orm.jpa.LocalContainerEntityManagerFactoryBean org.springframework.boot.autoconfigure.orm.jpa.LocalContainerEntityManagerFactoryBean ( javax.sql.DataSource javax.sql.DataSource , JpaVendorAdapter org.springframework.boot.autoconfigure.orm.jpa.JpaVendorAdapter ) { LocalContainerEntityManagerFactoryBean org.springframework.boot.autoconfigure.orm.jpa.LocalContainerEntityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean ( ) ; org.springframework.boot.autoconfigure.orm.jpa.LocalContainerEntityManagerFactoryBean . setJpaVendorAdapter ( org.springframework.boot.autoconfigure.orm.jpa.JpaVendorAdapter ) ; org.springframework.boot.autoconfigure.orm.jpa.LocalContainerEntityManagerFactoryBean . setDataSource ( javax.sql.DataSource ) ; org.springframework.boot.autoconfigure.orm.jpa.LocalContainerEntityManagerFactoryBean . setPersistenceUnitName ( STRING ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , NoJtaPlatform . INSTANCE ) ; org.springframework.boot.autoconfigure.orm.jpa.LocalContainerEntityManagerFactoryBean . setJpaPropertyMap ( java.util.Map<java.lang.String,java.lang.Object> ) ; return org.springframework.boot.autoconfigure.orm.jpa.LocalContainerEntityManagerFactoryBean ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.orm.jpa.EntityManagerFactory org.springframework.boot.autoconfigure.orm.jpa.EntityManagerFactory ( javax.sql.DataSource javax.sql.DataSource , JpaVendorAdapter org.springframework.boot.autoconfigure.orm.jpa.JpaVendorAdapter ) { LocalContainerEntityManagerFactoryBean org.springframework.boot.autoconfigure.orm.jpa.LocalContainerEntityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean ( ) ; org.springframework.boot.autoconfigure.orm.jpa.LocalContainerEntityManagerFactoryBean . setJpaVendorAdapter ( org.springframework.boot.autoconfigure.orm.jpa.JpaVendorAdapter ) ; org.springframework.boot.autoconfigure.orm.jpa.LocalContainerEntityManagerFactoryBean . setDataSource ( javax.sql.DataSource ) ; org.springframework.boot.autoconfigure.orm.jpa.LocalContainerEntityManagerFactoryBean . setPersistenceUnitName ( STRING ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , NoJtaPlatform . INSTANCE ) ; org.springframework.boot.autoconfigure.orm.jpa.LocalContainerEntityManagerFactoryBean . setJpaPropertyMap ( java.util.Map<java.lang.String,java.lang.Object> ) ; org.springframework.boot.autoconfigure.orm.jpa.LocalContainerEntityManagerFactoryBean . afterPropertiesSet ( ) ; return org.springframework.boot.autoconfigure.orm.jpa.LocalContainerEntityManagerFactoryBean . getObject ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.orm.jpa.PlatformTransactionManager org.springframework.boot.autoconfigure.orm.jpa.PlatformTransactionManager ( EntityManagerFactory org.springframework.boot.autoconfigure.orm.jpa.EntityManagerFactory ) { JpaTransactionManager org.springframework.boot.autoconfigure.orm.jpa.JpaTransactionManager = new JpaTransactionManager ( ) ; org.springframework.boot.autoconfigure.orm.jpa.JpaTransactionManager . setEntityManagerFactory ( org.springframework.boot.autoconfigure.orm.jpa.EntityManagerFactory ) ; return org.springframework.boot.autoconfigure.orm.jpa.JpaTransactionManager ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.orm.jpa.PlatformTransactionManager org.springframework.boot.autoconfigure.orm.jpa.PlatformTransactionManager ( ) { return new org.springframework.boot.autoconfigure.orm.jpa.AbstractJpaAutoConfigurationTests.CustomJpaTransactionManager ( ) ; }  <METHOD_END>
<METHOD_START> public void ( javax.sql.DataSource javax.sql.DataSource ) { this . javax.sql.DataSource = javax.sql.DataSource ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.orm.jpa.PersistenceUnitManager org.springframework.boot.autoconfigure.orm.jpa.PersistenceUnitManager ( ) { DefaultPersistenceUnitManager org.springframework.boot.autoconfigure.orm.jpa.DefaultPersistenceUnitManager = new DefaultPersistenceUnitManager ( ) ; org.springframework.boot.autoconfigure.orm.jpa.DefaultPersistenceUnitManager . setDefaultDataSource ( this . javax.sql.DataSource ) ; org.springframework.boot.autoconfigure.orm.jpa.DefaultPersistenceUnitManager . setPackagesToScan ( City .class . java.lang.Package ( ) . java.lang.String ( ) ) ; return org.springframework.boot.autoconfigure.orm.jpa.DefaultPersistenceUnitManager ; }  <METHOD_END>