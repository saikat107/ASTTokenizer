<METHOD_START> public void ( GridFSFile org.springframework.data.mongodb.gridfs.GridFSFile ) { this( org.springframework.data.mongodb.gridfs.GridFSFile , new java.io.ByteArrayInputStream ( new byte [] {} ) ); }  <METHOD_END>
<METHOD_START> public void ( GridFSFile org.springframework.data.mongodb.gridfs.GridFSFile , java.io.InputStream java.io.InputStream ) { super( java.io.InputStream ); this . org.springframework.data.mongodb.gridfs.GridFSFile = org.springframework.data.mongodb.gridfs.GridFSFile ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public long long ( ) java.io.IOException { return org.springframework.data.mongodb.gridfs.GridFSFile . getLength ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) java.lang.IllegalStateException { return org.springframework.data.mongodb.gridfs.GridFSFile . getFilename ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public long long ( ) java.io.IOException { return org.springframework.data.mongodb.gridfs.GridFSFile . getUploadDate ( ) . getTime ( ) ; }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( ) { return org.springframework.data.mongodb.gridfs.GridFSFile . getId ( ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return org.springframework.data.mongodb.gridfs.GridFSFile . getContentType ( ) ; }  <METHOD_END>
