<METHOD_START> @ After public void void ( ) { this . org.springframework.boot.autoconfigure.data.jpa.AnnotationConfigWebApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.autoconfigure.data.jpa.AnnotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext ( ) ; this . org.springframework.boot.autoconfigure.data.jpa.AnnotationConfigWebApplicationContext . setServletContext ( new MockServletContext ( ) ) ; this . org.springframework.boot.autoconfigure.data.jpa.AnnotationConfigWebApplicationContext . register ( org.springframework.boot.autoconfigure.data.jpa.JpaWebAutoConfigurationTests.TestConfiguration .class , EmbeddedDataSourceConfiguration .class , HibernateJpaAutoConfiguration .class , JpaRepositoriesAutoConfiguration .class , SpringDataWebAutoConfiguration .class , PropertyPlaceholderAutoConfiguration .class ) ; this . org.springframework.boot.autoconfigure.data.jpa.AnnotationConfigWebApplicationContext . refresh ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.data.jpa.AnnotationConfigWebApplicationContext . getBean ( CityRepository .class ) ) . isNotNull ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.data.jpa.AnnotationConfigWebApplicationContext . getBean ( PageableHandlerMethodArgumentResolver .class ) ) . isNotNull ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.data.jpa.AnnotationConfigWebApplicationContext . getBean ( FormattingConversionService .class ) . canConvert ( java.lang.Long .class , City .class ) ) . isTrue ( ) ; }  <METHOD_END>