<METHOD_START> @ Before public void void ( ) java.io.IOException { this . java.io.File = this . org.springframework.boot.devtools.env.TemporaryFolder . newFolder ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.Properties java.util.Properties = new java.util.Properties ( ) ; java.util.Properties . java.lang.Object ( STRING , STRING ) ; java.io.OutputStream java.io.OutputStream = new java.io.FileOutputStream ( new java.io.File ( this . java.io.File , STRING ) ) ; java.util.Properties . void ( java.io.OutputStream , null ) ; java.io.OutputStream . void ( ) ; ConfigurableEnvironment org.springframework.boot.devtools.env.ConfigurableEnvironment = new MockEnvironment ( ) ; org.springframework.boot.devtools.env.DevToolsHomePropertiesPostProcessorTests.MockDevToolHomePropertiesPostProcessor org.springframework.boot.devtools.env.DevToolsHomePropertiesPostProcessorTests.MockDevToolHomePropertiesPostProcessor = new org.springframework.boot.devtools.env.DevToolsHomePropertiesPostProcessorTests.MockDevToolHomePropertiesPostProcessor ( ) ; org.springframework.boot.devtools.env.DevToolsHomePropertiesPostProcessorTests.MockDevToolHomePropertiesPostProcessor . postProcessEnvironment ( org.springframework.boot.devtools.env.ConfigurableEnvironment , null ) ; assertThat ( org.springframework.boot.devtools.env.ConfigurableEnvironment . getProperty ( STRING ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ConfigurableEnvironment org.springframework.boot.devtools.env.ConfigurableEnvironment = new MockEnvironment ( ) ; org.springframework.boot.devtools.env.DevToolsHomePropertiesPostProcessorTests.MockDevToolHomePropertiesPostProcessor org.springframework.boot.devtools.env.DevToolsHomePropertiesPostProcessorTests.MockDevToolHomePropertiesPostProcessor = new org.springframework.boot.devtools.env.DevToolsHomePropertiesPostProcessorTests.MockDevToolHomePropertiesPostProcessor ( ) ; org.springframework.boot.devtools.env.DevToolsHomePropertiesPostProcessorTests.MockDevToolHomePropertiesPostProcessor . postProcessEnvironment ( org.springframework.boot.devtools.env.ConfigurableEnvironment , null ) ; assertThat ( org.springframework.boot.devtools.env.ConfigurableEnvironment . getProperty ( STRING ) ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.io.File java.io.File ( ) { return org.springframework.boot.devtools.env.DevToolsHomePropertiesPostProcessorTests .this . java.io.File ; }  <METHOD_END>