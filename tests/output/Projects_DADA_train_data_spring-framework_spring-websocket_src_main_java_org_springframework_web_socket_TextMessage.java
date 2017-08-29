<METHOD_START> public void ( java.lang.CharSequence java.lang.CharSequence ) { super( java.lang.CharSequence . java.lang.String ( ) , true ); this . byte[] = null ; }  <METHOD_END>
<METHOD_START> public void ( byte [] byte[] ) { super( new java.lang.String ( byte[] , java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ); this . byte[] = byte[] ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.CharSequence java.lang.CharSequence , boolean boolean ) { super( java.lang.CharSequence . java.lang.String ( ) , boolean ); this . byte[] = null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return byte[] ( ) . int ; }  <METHOD_END>
<METHOD_START> public byte [] byte[] ( ) { return ( this . byte[] != null ? this . byte[] : getPayload ( ) . getBytes ( java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( ) { java.lang.String java.lang.String = getPayload ( ) ; return ( java.lang.String . int ( ) > NUMBER ? java.lang.String . java.lang.String ( NUMBER , NUMBER ) + STRING : java.lang.String ) ; }  <METHOD_END>
