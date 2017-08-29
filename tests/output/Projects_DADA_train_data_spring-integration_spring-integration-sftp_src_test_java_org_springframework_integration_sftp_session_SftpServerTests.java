<METHOD_START> @ Test public void void ( ) java.lang.Exception { SshServer org.springframework.integration.sftp.session.SshServer = SshServer . setUpDefaultServer ( ) ; try { org.springframework.integration.sftp.session.SshServer . setPasswordAuthenticator ( ( arg0 , arg1 , arg2 ) -> true ) ; org.springframework.integration.sftp.session.SshServer . setPort ( NUMBER ) ; org.springframework.integration.sftp.session.SshServer . setKeyPairProvider ( new SimpleGeneratorHostKeyProvider ( new java.io.File ( STRING ) ) ) ; org.springframework.integration.sftp.session.SshServer . setSubsystemFactories ( java.util.Collections .< NamedFactory < Command > > java.util.List<org.springframework.integration.sftp.session.NamedFactory<org.springframework.integration.sftp.session.Command>> ( new SftpSubsystemFactory ( ) ) ) ; final java.lang.String java.lang.String = java.lang.System . java.lang.String ( STRING ) + java.io.File . java.lang.String + STRING + java.io.File . java.lang.String ; new java.io.File ( java.lang.String ) . boolean ( ) ; org.springframework.integration.sftp.session.SshServer . setFileSystemFactory ( new VirtualFileSystemFactory ( java.nio.file.Paths . java.nio.file.Path ( java.lang.String ) ) ) ; org.springframework.integration.sftp.session.SshServer . start ( ) ; DefaultSftpSessionFactory org.springframework.integration.sftp.session.DefaultSftpSessionFactory = new DefaultSftpSessionFactory ( ) ; org.springframework.integration.sftp.session.DefaultSftpSessionFactory . setHost ( STRING ) ; org.springframework.integration.sftp.session.DefaultSftpSessionFactory . setPort ( org.springframework.integration.sftp.session.SshServer . getPort ( ) ) ; org.springframework.integration.sftp.session.DefaultSftpSessionFactory . setUser ( STRING ) ; org.springframework.integration.sftp.session.DefaultSftpSessionFactory . setPassword ( STRING ) ; org.springframework.integration.sftp.session.DefaultSftpSessionFactory . setAllowUnknownKeys ( true ) ; Session < LsEntry > org.springframework.integration.sftp.session.Session<org.springframework.integration.sftp.session.LsEntry> = org.springframework.integration.sftp.session.DefaultSftpSessionFactory . getSession ( ) ; void ( org.springframework.integration.sftp.session.SshServer , org.springframework.integration.sftp.session.Session<org.springframework.integration.sftp.session.LsEntry> ) ; } finally { org.springframework.integration.sftp.session.SshServer . stop ( true ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING , STRING , null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING , STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String , java.lang.String java.lang.String , java.lang.String java.lang.String )			throws java.lang.Exception { SshServer org.springframework.integration.sftp.session.SshServer = SshServer . setUpDefaultServer ( ) ; final java.security.PublicKey java.security.PublicKey = java.security.PublicKey ( java.lang.String ) ; try { org.springframework.integration.sftp.session.SshServer . setPublickeyAuthenticator ( ( username , key , session ) -> key . equals ( allowedKey ) ) ; org.springframework.integration.sftp.session.SshServer . setPort ( NUMBER ) ; org.springframework.integration.sftp.session.SshServer . setKeyPairProvider ( new SimpleGeneratorHostKeyProvider ( new java.io.File ( STRING ) ) ) ; org.springframework.integration.sftp.session.SshServer . setSubsystemFactories ( java.util.Collections .< NamedFactory < Command > > java.util.List<org.springframework.integration.sftp.session.NamedFactory<org.springframework.integration.sftp.session.Command>> ( new SftpSubsystemFactory ( ) ) ) ; final java.lang.String java.lang.String = java.lang.System . java.lang.String ( STRING ) + java.io.File . java.lang.String + STRING + java.io.File . java.lang.String ; new java.io.File ( java.lang.String ) . boolean ( ) ; org.springframework.integration.sftp.session.SshServer . setFileSystemFactory ( new VirtualFileSystemFactory ( java.nio.file.Paths . java.nio.file.Path ( java.lang.String ) ) ) ; org.springframework.integration.sftp.session.SshServer . start ( ) ; DefaultSftpSessionFactory org.springframework.integration.sftp.session.DefaultSftpSessionFactory = new DefaultSftpSessionFactory ( ) ; org.springframework.integration.sftp.session.DefaultSftpSessionFactory . setHost ( STRING ) ; org.springframework.integration.sftp.session.DefaultSftpSessionFactory . setPort ( org.springframework.integration.sftp.session.SshServer . getPort ( ) ) ; org.springframework.integration.sftp.session.DefaultSftpSessionFactory . setUser ( STRING ) ; org.springframework.integration.sftp.session.DefaultSftpSessionFactory . setAllowUnknownKeys ( true ) ; java.io.InputStream java.io.InputStream = new ClassPathResource ( java.lang.String ) . getInputStream ( ) ; org.springframework.integration.sftp.session.DefaultSftpSessionFactory . setPrivateKey ( new ByteArrayResource ( StreamUtils . copyToByteArray ( java.io.InputStream ) ) ) ; org.springframework.integration.sftp.session.DefaultSftpSessionFactory . setPrivateKeyPassphrase ( java.lang.String ) ; Session < LsEntry > org.springframework.integration.sftp.session.Session<org.springframework.integration.sftp.session.LsEntry> = org.springframework.integration.sftp.session.DefaultSftpSessionFactory . getSession ( ) ; void ( org.springframework.integration.sftp.session.SshServer , org.springframework.integration.sftp.session.Session<org.springframework.integration.sftp.session.LsEntry> ) ; } finally { org.springframework.integration.sftp.session.SshServer . stop ( true ) ; } }  <METHOD_END>
<METHOD_START> private java.security.PublicKey java.security.PublicKey ( java.lang.String java.lang.String ) throws java.lang.Exception { java.io.InputStream java.io.InputStream = new ClassPathResource ( java.lang.String ) . getInputStream ( ) ; byte [] byte[] = StreamUtils . copyToByteArray ( java.io.InputStream ) ; while ( byte[] [ byte[] . int - NUMBER ] == NUMBER || byte[] [ byte[] . int - NUMBER ] == NUMBER ) { byte[] = java.util.Arrays . byte[] ( byte[] , byte[] . int - NUMBER ) ; } byte [] byte[] = Base64Utils . decode ( byte[] ) ; java.nio.ByteBuffer java.nio.ByteBuffer = java.nio.ByteBuffer . java.nio.ByteBuffer ( byte[] ) ; int int = java.nio.ByteBuffer . int ( ) ; byte [] byte[] = new byte [ int ] ; java.nio.ByteBuffer . java.nio.ByteBuffer ( byte[] ) ; if ( STRING . boolean ( new java.lang.String ( byte[] ) ) ) { java.math.BigInteger java.math.BigInteger = java.math.BigInteger ( java.nio.ByteBuffer ) ; java.math.BigInteger java.math.BigInteger = java.math.BigInteger ( java.nio.ByteBuffer ) ; java.security.spec.RSAPublicKeySpec java.security.spec.RSAPublicKeySpec = new java.security.spec.RSAPublicKeySpec ( java.math.BigInteger , java.math.BigInteger ) ; return java.security.KeyFactory . java.security.KeyFactory ( STRING ) . java.security.PublicKey ( java.security.spec.RSAPublicKeySpec ) ; } else { throw new java.lang.IllegalArgumentException ( STRING ) ; } }  <METHOD_END>
<METHOD_START> private java.math.BigInteger java.math.BigInteger ( java.nio.ByteBuffer java.nio.ByteBuffer ) { int int = java.nio.ByteBuffer . int ( ) ; byte [] byte[] = new byte [ int ] ; java.nio.ByteBuffer . java.nio.ByteBuffer ( byte[] ) ; return new java.math.BigInteger ( byte[] ) ; }  <METHOD_END>
<METHOD_START> protected void void ( SshServer org.springframework.integration.sftp.session.SshServer , Session < LsEntry > org.springframework.integration.sftp.session.Session<org.springframework.integration.sftp.session.LsEntry> ) throws java.io.IOException { assertEquals ( NUMBER , org.springframework.integration.sftp.session.SshServer . getActiveSessions ( ) . size ( ) ) ; LsEntry [] org.springframework.integration.sftp.session.LsEntry[] = org.springframework.integration.sftp.session.Session<org.springframework.integration.sftp.session.LsEntry> . list ( STRING ) ; if ( list . length > NUMBER ) { org.springframework.integration.sftp.session.Session<org.springframework.integration.sftp.session.LsEntry> . remove ( STRING ) ; } org.springframework.integration.sftp.session.Session<org.springframework.integration.sftp.session.LsEntry> . write ( new java.io.ByteArrayInputStream ( STRING . byte[] ( ) ) , STRING ) ; org.springframework.integration.sftp.session.LsEntry[] = org.springframework.integration.sftp.session.Session<org.springframework.integration.sftp.session.LsEntry> . list ( STRING ) ; assertEquals ( STRING , org.springframework.integration.sftp.session.LsEntry[] [ NUMBER ] . getFilename ( ) ) ; java.io.ByteArrayOutputStream java.io.ByteArrayOutputStream = new java.io.ByteArrayOutputStream ( ) ; org.springframework.integration.sftp.session.Session<org.springframework.integration.sftp.session.LsEntry> . read ( STRING , java.io.ByteArrayOutputStream ) ; assertEquals ( STRING , new java.lang.String ( java.io.ByteArrayOutputStream . byte[] ( ) ) ) ; org.springframework.integration.sftp.session.Session<org.springframework.integration.sftp.session.LsEntry> . remove ( STRING ) ; org.springframework.integration.sftp.session.Session<org.springframework.integration.sftp.session.LsEntry> . close ( ) ; }  <METHOD_END>