<METHOD_START> protected org.springframework.integration.file.Message<java.util.List<java.io.File>> < java.util.List<java.io.File> < java.io.File > > org.springframework.integration.file.Message<java.util.List<java.io.File>> ( ) java.lang.Exception { byte [] byte[] = new byte [ NUMBER ] ; for ( int int = NUMBER ; int < int ; int ++ ) { java.io.File java.io.File = new java.io.File ( STRING + int ) ; java.io.File . boolean ( ) ; java.io.FileOutputStream java.io.FileOutputStream = new java.io.FileOutputStream ( java.io.File ) ; java.io.FileOutputStream . void ( byte[] ) ; java.io.FileOutputStream . void ( ) ; } org.springframework.integration.file.MessageChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; for ( int int = NUMBER ; int < int ; int ++ ) { new java.io.File ( STRING + int ) . boolean ( ) ; new java.io.File ( STRING + int ) . boolean ( ) ; } @ java.lang.SuppressWarnings ( STRING ) Message < java.util.List<java.io.File> < java.io.File > > org.springframework.integration.file.Message<java.util.List<java.io.File>> = ( Message < java.util.List<java.io.File> < java.io.File > > ) org.springframework.integration.file.PollableChannel . receive ( NUMBER ) ; return org.springframework.integration.file.Message<java.util.List<java.io.File>> ; }  <METHOD_END>