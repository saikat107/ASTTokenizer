<METHOD_START> public void ( java.lang.String java.lang.String ) { super( java.lang.String ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , java.lang.Throwable java.lang.Throwable ) { super( java.lang.String , java.lang.Throwable ); if ( getCause ( ) == null && java.lang.Throwable != null ) { initCause ( java.lang.Throwable ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return NestedExceptionUtils . buildMessage ( super. getMessage ( ) , getCause ( ) ) ; }  <METHOD_END>
