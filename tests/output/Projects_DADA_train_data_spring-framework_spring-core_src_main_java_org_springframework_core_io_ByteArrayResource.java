<METHOD_START> public void ( byte [] byte[] ) { this( byte[] , STRING ); }  <METHOD_END>
<METHOD_START> public void ( byte [] byte[] , java.lang.String java.lang.String ) { if ( byte[] == null ) { throw new java.lang.IllegalArgumentException ( STRING ) ; } this . byte[] = byte[] ; this . java.lang.String = ( java.lang.String != null ? java.lang.String : STRING ) ; }  <METHOD_END>
<METHOD_START> public final byte [] byte[] ( ) { return this . byte[] ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public long long ( ) { return this . byte[] . int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.io.InputStream java.io.InputStream ( ) java.io.IOException { return new java.io.ByteArrayInputStream ( this . byte[] ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING + this . java.lang.String + STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Object java.lang.Object ) { return ( java.lang.Object == this || ( java.lang.Object instanceof org.springframework.core.io.ByteArrayResource && java.util.Arrays . boolean ( ( ( org.springframework.core.io.ByteArrayResource ) java.lang.Object ) . byte[] , this . byte[] ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return ( byte [] .class . int ( ) * NUMBER * this . byte[] . int ) ; }  <METHOD_END>
