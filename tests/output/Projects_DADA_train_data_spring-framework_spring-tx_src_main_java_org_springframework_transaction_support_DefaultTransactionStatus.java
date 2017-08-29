<METHOD_START> public void ( java.lang.Object java.lang.Object , boolean boolean , boolean boolean , boolean boolean , boolean boolean , java.lang.Object java.lang.Object ) { this . java.lang.Object = java.lang.Object ; this . boolean = boolean ; this . boolean = boolean ; this . boolean = boolean ; this . boolean = boolean ; this . java.lang.Object = java.lang.Object ; }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( ) { return this . java.lang.Object ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return ( this . java.lang.Object != null ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return ( boolean ( ) && this . boolean ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( ) { return this . java.lang.Object ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return ( ( this . java.lang.Object instanceof SmartTransactionObject ) && ( ( SmartTransactionObject ) this . java.lang.Object ) . isRollbackOnly ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { if ( this . java.lang.Object instanceof SmartTransactionObject ) { ( ( SmartTransactionObject ) this . java.lang.Object ) . flush ( ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.transaction.support.SavepointManager org.springframework.transaction.support.SavepointManager ( ) { if ( ! boolean ( ) ) { throw new NestedTransactionNotSupportedException ( STRING + java.lang.Object ( ) + STRING ) ; } return ( SavepointManager ) java.lang.Object ( ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return ( java.lang.Object ( ) instanceof SavepointManager ) ; }  <METHOD_END>
