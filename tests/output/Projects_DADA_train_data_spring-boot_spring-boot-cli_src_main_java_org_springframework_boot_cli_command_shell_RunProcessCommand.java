<METHOD_START> void ( java.lang.String ... java.lang.String[] ) { super( null , null ); this . java.lang.String[] = java.lang.String[] ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.cli.command.shell.ExitStatus org.springframework.boot.cli.command.shell.ExitStatus ( java.lang.String ... java.lang.String[] ) throws java.lang.Exception { return org.springframework.boot.cli.command.shell.ExitStatus ( java.util.Arrays . java.util.List<java.lang.String> ( java.lang.String[] ) ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.boot.cli.command.shell.ExitStatus org.springframework.boot.cli.command.shell.ExitStatus ( java.util.Collection<java.lang.String> < java.lang.String > java.util.Collection<java.lang.String> ) throws java.io.IOException { this . org.springframework.boot.cli.command.shell.RunProcess = new RunProcess ( this . java.lang.String[] ) ; int int = this . org.springframework.boot.cli.command.shell.RunProcess . run ( true , java.util.Collection<java.lang.String> . java.lang.String[] ( new java.lang.String [ java.util.Collection<java.lang.String> . int ( ) ] ) ) ; if ( int == NUMBER ) { return ExitStatus . OK ; } else { return new ExitStatus ( int , STRING ) ; } }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return this . org.springframework.boot.cli.command.shell.RunProcess . handleSigInt ( ) ; }  <METHOD_END>