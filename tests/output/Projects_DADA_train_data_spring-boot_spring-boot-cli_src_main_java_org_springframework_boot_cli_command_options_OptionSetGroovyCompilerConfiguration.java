<METHOD_START> protected void ( OptionSet org.springframework.boot.cli.command.options.OptionSet , CompilerOptionHandler org.springframework.boot.cli.command.options.CompilerOptionHandler ) { this( org.springframework.boot.cli.command.options.OptionSet , org.springframework.boot.cli.command.options.CompilerOptionHandler , RepositoryConfigurationFactory . createDefaultRepositoryConfiguration ( ) ); }  <METHOD_END>
<METHOD_START> public void ( OptionSet org.springframework.boot.cli.command.options.OptionSet , CompilerOptionHandler org.springframework.boot.cli.command.options.CompilerOptionHandler , java.util.List<org.springframework.boot.cli.command.options.RepositoryConfiguration> < RepositoryConfiguration > java.util.List<org.springframework.boot.cli.command.options.RepositoryConfiguration> ) { this . org.springframework.boot.cli.command.options.OptionSet = org.springframework.boot.cli.command.options.OptionSet ; this . org.springframework.boot.cli.command.options.CompilerOptionHandler = org.springframework.boot.cli.command.options.CompilerOptionHandler ; this . java.util.List<org.springframework.boot.cli.command.options.RepositoryConfiguration> = java.util.List<org.springframework.boot.cli.command.options.RepositoryConfiguration> ; }  <METHOD_END>
<METHOD_START> protected org.springframework.boot.cli.command.options.OptionSet org.springframework.boot.cli.command.options.OptionSet ( ) { return this . org.springframework.boot.cli.command.options.OptionSet ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.cli.command.options.GroovyCompilerScope org.springframework.boot.cli.command.options.GroovyCompilerScope ( ) { return GroovyCompilerScope . DEFAULT ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return ! this . org.springframework.boot.cli.command.options.OptionSet . has ( this . org.springframework.boot.cli.command.options.CompilerOptionHandler . getNoGuessImportsOption ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return ! this . org.springframework.boot.cli.command.options.OptionSet . has ( this . org.springframework.boot.cli.command.options.CompilerOptionHandler . getNoGuessDependenciesOption ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return this . org.springframework.boot.cli.command.options.CompilerOptionHandler . getAutoconfigureOption ( ) . value ( this . org.springframework.boot.cli.command.options.OptionSet ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String [] java.lang.String[] ( ) { OptionSpec < java.lang.String > org.springframework.boot.cli.command.options.OptionSpec<java.lang.String> = this . org.springframework.boot.cli.command.options.CompilerOptionHandler . getClasspathOption ( ) ; if ( this . org.springframework.boot.cli.command.options.OptionSet . has ( org.springframework.boot.cli.command.options.OptionSpec<java.lang.String> ) ) { return this . org.springframework.boot.cli.command.options.OptionSet . valueOf ( org.springframework.boot.cli.command.options.OptionSpec<java.lang.String> ) . split ( STRING ) ; } return DEFAULT_CLASSPATH ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.List<org.springframework.boot.cli.command.options.RepositoryConfiguration> < RepositoryConfiguration > java.util.List<org.springframework.boot.cli.command.options.RepositoryConfiguration> ( ) { return this . java.util.List<org.springframework.boot.cli.command.options.RepositoryConfiguration> ; }  <METHOD_END>