<METHOD_START> @ Test public void void ( ) { FailureAnalysis org.springframework.boot.diagnostics.analyzer.FailureAnalysis = org.springframework.boot.diagnostics.analyzer.FailureAnalysis ( org.springframework.boot.diagnostics.analyzer.BeanNotOfRequiredTypeFailureAnalyzerTests.JdkProxyConfiguration .class ) ; assertThat ( org.springframework.boot.diagnostics.analyzer.FailureAnalysis . getDescription ( ) ) . startsWith ( STRING ) ; assertThat ( org.springframework.boot.diagnostics.analyzer.FailureAnalysis . getDescription ( ) ) . contains ( STRING + org.springframework.boot.diagnostics.analyzer.BeanNotOfRequiredTypeFailureAnalyzerTests.AsyncBean .class . java.lang.String ( ) + STRING ) ; assertThat ( org.springframework.boot.diagnostics.analyzer.FailureAnalysis . getDescription ( ) ) . endsWith ( java.lang.String . java.lang.String ( STRING , org.springframework.boot.diagnostics.analyzer.BeanNotOfRequiredTypeFailureAnalyzerTests.SomeInterface .class . java.lang.String ( ) ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.diagnostics.analyzer.FailureAnalysis org.springframework.boot.diagnostics.analyzer.FailureAnalysis ( java.lang.Class<?> < ? > java.lang.Class<?> ) { FailureAnalysis org.springframework.boot.diagnostics.analyzer.FailureAnalysis = this . org.springframework.boot.diagnostics.analyzer.FailureAnalyzer . analyze ( java.lang.Exception ( java.lang.Class<> ) ) ; assertThat ( org.springframework.boot.diagnostics.analyzer.FailureAnalysis ) . isNotNull ( ) ; return org.springframework.boot.diagnostics.analyzer.FailureAnalysis ; }  <METHOD_END>
<METHOD_START> private java.lang.Exception java.lang.Exception ( java.lang.Class<?> < ? > java.lang.Class<?> ) { ConfigurableApplicationContext org.springframework.boot.diagnostics.analyzer.ConfigurableApplicationContext = null ; try { org.springframework.boot.diagnostics.analyzer.ConfigurableApplicationContext = new AnnotationConfigApplicationContext ( java.lang.Class<> ) ; } catch ( java.lang.Exception java.lang.Exception ) { return java.lang.Exception ; } finally { if ( org.springframework.boot.diagnostics.analyzer.ConfigurableApplicationContext != null ) { org.springframework.boot.diagnostics.analyzer.ConfigurableApplicationContext . close ( ) ; } } fail ( STRING ) ; return null ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.diagnostics.analyzer.BeanNotOfRequiredTypeFailureAnalyzerTests.AsyncBean org.springframework.boot.diagnostics.analyzer.BeanNotOfRequiredTypeFailureAnalyzerTests.AsyncBean ( ) { return new org.springframework.boot.diagnostics.analyzer.BeanNotOfRequiredTypeFailureAnalyzerTests.AsyncBean ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.diagnostics.analyzer.BeanNotOfRequiredTypeFailureAnalyzerTests.AsyncBeanUser org.springframework.boot.diagnostics.analyzer.BeanNotOfRequiredTypeFailureAnalyzerTests.AsyncBeanUser ( org.springframework.boot.diagnostics.analyzer.BeanNotOfRequiredTypeFailureAnalyzerTests.AsyncBean org.springframework.boot.diagnostics.analyzer.BeanNotOfRequiredTypeFailureAnalyzerTests.AsyncBean ) { return new org.springframework.boot.diagnostics.analyzer.BeanNotOfRequiredTypeFailureAnalyzerTests.AsyncBeanUser ( org.springframework.boot.diagnostics.analyzer.BeanNotOfRequiredTypeFailureAnalyzerTests.AsyncBean ) ; }  <METHOD_END>
<METHOD_START> @ Async public void void ( ) {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) {		}  <METHOD_END>
<METHOD_START> void void ( )  <METHOD_END>
<METHOD_START> void ( org.springframework.boot.diagnostics.analyzer.BeanNotOfRequiredTypeFailureAnalyzerTests.AsyncBean org.springframework.boot.diagnostics.analyzer.BeanNotOfRequiredTypeFailureAnalyzerTests.AsyncBean ) {		}  <METHOD_END>