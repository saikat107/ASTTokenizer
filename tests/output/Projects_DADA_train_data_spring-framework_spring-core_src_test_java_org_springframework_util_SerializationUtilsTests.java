<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertEquals ( STRING , SerializationUtils . deserialize ( SerializationUtils . serialize ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalStateException .class ) public void void ( ) java.lang.Exception { byte [] byte[] = java.math.BigInteger . byte[] ( ) ; java.lang.Object java.lang.Object = SerializationUtils . deserialize ( byte[] ) ; assertNotNull ( java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { SerializationUtils . serialize ( new java.lang.Object ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { SerializationUtils . deserialize ( STRING . byte[] ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertNull ( SerializationUtils . serialize ( null ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertNull ( SerializationUtils . deserialize ( null ) ) ; }  <METHOD_END>
