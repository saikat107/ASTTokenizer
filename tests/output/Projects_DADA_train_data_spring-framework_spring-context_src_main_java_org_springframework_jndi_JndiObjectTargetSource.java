<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) javax.naming.NamingException { super. afterPropertiesSet ( ) ; if ( this . boolean ) { java.lang.Object java.lang.Object = lookup ( ) ; if ( this . boolean ) { this . java.lang.Object = java.lang.Object ; } else { this . java.lang.Class<?> = java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ; } } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Class<?> < ? > java.lang.Class<?> ( ) { if ( this . java.lang.Object != null ) { return this . java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ; } else if ( this . java.lang.Class<> != null ) { return this . java.lang.Class<> ; } else { return getExpectedType ( ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return ( this . java.lang.Object != null ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( ) { try { if ( this . boolean || ! this . boolean ) { return ( this . java.lang.Object != null ? this . java.lang.Object : lookup ( ) ) ; } else { synchronized ( this ) { if ( this . java.lang.Object == null ) { this . java.lang.Object = lookup ( ) ; } return this . java.lang.Object ; } } } catch ( javax.naming.NamingException javax.naming.NamingException ) { throw new JndiLookupFailureException ( STRING , javax.naming.NamingException ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object ) {	}  <METHOD_END>