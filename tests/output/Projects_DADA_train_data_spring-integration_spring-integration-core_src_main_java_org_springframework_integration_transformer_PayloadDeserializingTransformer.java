<METHOD_START> public void void ( Deserializer < java.lang.Object > org.springframework.integration.transformer.Deserializer<java.lang.Object> ) { this . setConverter ( new DeserializingConverter ( org.springframework.integration.transformer.Deserializer<java.lang.Object> ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( byte [] byte[] ) throws java.lang.Exception { if ( this . converter == null ) { this . setConverter ( new DeserializingConverter ( ) ) ; } return this . converter . convert ( byte[] ) ; }  <METHOD_END>