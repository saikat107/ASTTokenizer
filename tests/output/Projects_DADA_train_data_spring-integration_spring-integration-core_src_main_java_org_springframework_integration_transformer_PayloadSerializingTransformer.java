<METHOD_START> public void void ( Serializer < java.lang.Object > org.springframework.integration.transformer.Serializer<java.lang.Object> ) { this . setConverter ( new SerializingConverter ( org.springframework.integration.transformer.Serializer<java.lang.Object> ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected byte [] byte[] ( java.lang.Object java.lang.Object ) throws java.lang.Exception { if ( this . converter == null ) { this . setConverter ( new SerializingConverter ( ) ) ; } return this . converter . convert ( java.lang.Object ) ; }  <METHOD_END>