<METHOD_START> @ java.lang.Override public void void ( Kryo org.springframework.integration.codec.kryo.Kryo , Output org.springframework.integration.codec.kryo.Output , java.io.File java.io.File ) { org.springframework.integration.codec.kryo.Output . writeString ( java.io.File . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.io.File java.io.File ( Kryo org.springframework.integration.codec.kryo.Kryo , Input org.springframework.integration.codec.kryo.Input , java.lang.Class<java.io.File> < java.io.File > java.lang.Class<java.io.File> ) { java.lang.String java.lang.String = org.springframework.integration.codec.kryo.Input . readString ( ) ; return new java.io.File ( java.lang.String ) ; }  <METHOD_END>