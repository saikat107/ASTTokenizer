<METHOD_START> @ Test public void void ( ) java.lang.Exception { TestRunnerConfiguration org.springframework.boot.cli.command.test.TestRunnerConfiguration = mock ( TestRunnerConfiguration .class ) ; given ( org.springframework.boot.cli.command.test.TestRunnerConfiguration . getClasspath ( ) ) . willReturn ( new java.lang.String [ NUMBER ] ) ; this . org.springframework.boot.cli.command.test.ExpectedException . expect ( java.lang.RuntimeException .class ) ; this . org.springframework.boot.cli.command.test.ExpectedException . expectMessage ( equalTo ( STRING ) ) ; new TestRunner ( org.springframework.boot.cli.command.test.TestRunnerConfiguration , new java.lang.String [] { STRING , STRING } , new java.lang.String [ NUMBER ] ) . compileAndRunTests ( ) ; }  <METHOD_END>