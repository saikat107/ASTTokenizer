<METHOD_START> @ Before public void void ( ) { MockitoAnnotations . initMocks ( this ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ContextCustomizer org.springframework.boot.test.mock.mockito.ContextCustomizer = this . org.springframework.boot.test.mock.mockito.MockitoContextCustomizerFactory . createContextCustomizer ( org.springframework.boot.test.mock.mockito.MockitoContextCustomizerFactoryTests.NoMockBeanAnnotation .class , null ) ; assertThat ( org.springframework.boot.test.mock.mockito.ContextCustomizer ) . isNotNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ContextCustomizer org.springframework.boot.test.mock.mockito.ContextCustomizer = this . org.springframework.boot.test.mock.mockito.MockitoContextCustomizerFactory . createContextCustomizer ( org.springframework.boot.test.mock.mockito.MockitoContextCustomizerFactoryTests.WithMockBeanAnnotation .class , null ) ; assertThat ( org.springframework.boot.test.mock.mockito.ContextCustomizer ) . isNotNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ContextCustomizer org.springframework.boot.test.mock.mockito.ContextCustomizer = this . org.springframework.boot.test.mock.mockito.MockitoContextCustomizerFactory . createContextCustomizer ( org.springframework.boot.test.mock.mockito.MockitoContextCustomizerFactoryTests.WithMockBeanAnnotation .class , null ) ; assertThat ( org.springframework.boot.test.mock.mockito.ContextCustomizer ) . isNotNull ( ) ; ContextCustomizer org.springframework.boot.test.mock.mockito.ContextCustomizer = this . org.springframework.boot.test.mock.mockito.MockitoContextCustomizerFactory . createContextCustomizer ( org.springframework.boot.test.mock.mockito.MockitoContextCustomizerFactoryTests.WithSameMockBeanAnnotation .class , null ) ; assertThat ( org.springframework.boot.test.mock.mockito.ContextCustomizer ) . isNotNull ( ) ; ContextCustomizer org.springframework.boot.test.mock.mockito.ContextCustomizer = this . org.springframework.boot.test.mock.mockito.MockitoContextCustomizerFactory . createContextCustomizer ( org.springframework.boot.test.mock.mockito.MockitoContextCustomizerFactoryTests.WithDifferentMockBeanAnnotation .class , null ) ; assertThat ( org.springframework.boot.test.mock.mockito.ContextCustomizer ) . isNotNull ( ) ; assertThat ( org.springframework.boot.test.mock.mockito.ContextCustomizer . hashCode ( ) ) . isEqualTo ( org.springframework.boot.test.mock.mockito.ContextCustomizer . hashCode ( ) ) ; assertThat ( org.springframework.boot.test.mock.mockito.ContextCustomizer . hashCode ( ) ) . isNotEqualTo ( org.springframework.boot.test.mock.mockito.ContextCustomizer . hashCode ( ) ) ; assertThat ( org.springframework.boot.test.mock.mockito.ContextCustomizer ) . isEqualTo ( org.springframework.boot.test.mock.mockito.ContextCustomizer ) ; assertThat ( org.springframework.boot.test.mock.mockito.ContextCustomizer ) . isEqualTo ( org.springframework.boot.test.mock.mockito.ContextCustomizer ) ; assertThat ( org.springframework.boot.test.mock.mockito.ContextCustomizer ) . isNotEqualTo ( org.springframework.boot.test.mock.mockito.ContextCustomizer ) ; }  <METHOD_END>