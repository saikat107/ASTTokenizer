<METHOD_START> @ java.lang.Override public < T extends java.lang.Enum > org.springframework.core.convert.support.Converter<java.lang.String,T> < java.lang.String , T > org.springframework.core.convert.support.Converter<java.lang.String,T> ( java.lang.Class<T> < T > java.lang.Class<T> ) { return new org.springframework.core.convert.support.StringToEnumConverterFactory.StringToEnum ( ConversionUtils . getEnumType ( java.lang.Class<T> ) ) ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.Class<T> < T > java.lang.Class<T> ) { this . java.lang.Class<T> = java.lang.Class<T> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public T T ( java.lang.String java.lang.String ) { if ( java.lang.String . boolean ( ) ) { return null ; } return ( T ) java.lang.Enum . T ( this . java.lang.Class<T> , java.lang.String . java.lang.String ( ) ) ; }  <METHOD_END>