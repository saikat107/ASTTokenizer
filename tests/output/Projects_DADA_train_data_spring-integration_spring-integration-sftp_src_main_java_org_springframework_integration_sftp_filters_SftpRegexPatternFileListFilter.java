<METHOD_START> public void ( java.lang.String java.lang.String ) { super( java.lang.String ); }  <METHOD_END>
<METHOD_START> public void ( java.util.regex.Pattern java.util.regex.Pattern ) { super( java.util.regex.Pattern ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( LsEntry org.springframework.integration.sftp.filters.LsEntry ) { return ( org.springframework.integration.sftp.filters.LsEntry != null ) ? org.springframework.integration.sftp.filters.LsEntry . getFilename ( ) : null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( LsEntry org.springframework.integration.sftp.filters.LsEntry ) { return org.springframework.integration.sftp.filters.LsEntry . getAttrs ( ) . isDir ( ) ; }  <METHOD_END>
