<METHOD_START> public void ( SessionFactory < LsEntry > org.springframework.integration.sftp.inbound.SessionFactory<org.springframework.integration.sftp.inbound.LsEntry> ) { super( org.springframework.integration.sftp.inbound.SessionFactory<org.springframework.integration.sftp.inbound.LsEntry> ); doSetFilter ( new SftpPersistentAcceptOnceFileListFilter ( new SimpleMetadataStore ( ) , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( LsEntry org.springframework.integration.sftp.inbound.LsEntry ) { return ( org.springframework.integration.sftp.inbound.LsEntry != null && org.springframework.integration.sftp.inbound.LsEntry . getAttrs ( ) != null && ! org.springframework.integration.sftp.inbound.LsEntry . getAttrs ( ) . isDir ( ) && ! org.springframework.integration.sftp.inbound.LsEntry . getAttrs ( ) . isLink ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( LsEntry org.springframework.integration.sftp.inbound.LsEntry ) { return ( org.springframework.integration.sftp.inbound.LsEntry != null ? org.springframework.integration.sftp.inbound.LsEntry . getFilename ( ) : null ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected long long ( LsEntry org.springframework.integration.sftp.inbound.LsEntry ) { return ( long ) org.springframework.integration.sftp.inbound.LsEntry . getAttrs ( ) . getMTime ( ) * NUMBER ; }  <METHOD_END>