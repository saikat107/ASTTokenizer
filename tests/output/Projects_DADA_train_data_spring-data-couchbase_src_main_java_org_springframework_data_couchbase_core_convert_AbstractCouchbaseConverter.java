<METHOD_START> protected void ( final GenericConversionService org.springframework.data.couchbase.core.convert.GenericConversionService ) { this . org.springframework.data.couchbase.core.convert.GenericConversionService = org.springframework.data.couchbase.core.convert.GenericConversionService ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.couchbase.core.convert.ConversionService org.springframework.data.couchbase.core.convert.ConversionService ( ) { return org.springframework.data.couchbase.core.convert.GenericConversionService ; }  <METHOD_END>
<METHOD_START> public void void ( final CustomConversions org.springframework.data.couchbase.core.convert.CustomConversions ) { this . org.springframework.data.couchbase.core.convert.CustomConversions = org.springframework.data.couchbase.core.convert.CustomConversions ; }  <METHOD_END>
<METHOD_START> public void void ( final EntityInstantiators org.springframework.data.couchbase.core.convert.EntityInstantiators ) { this . org.springframework.data.couchbase.core.convert.EntityInstantiators = org.springframework.data.couchbase.core.convert.EntityInstantiators ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { org.springframework.data.couchbase.core.convert.CustomConversions . registerConvertersIn ( org.springframework.data.couchbase.core.convert.GenericConversionService ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object ) { if ( java.lang.Object == null ) { return null ; } java.lang.Class<?> < ? > java.lang.Class<?> = this . org.springframework.data.couchbase.core.convert.CustomConversions . getCustomWriteTarget ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ; if ( java.lang.Class<> != null ) { return this . org.springframework.data.couchbase.core.convert.GenericConversionService . convert ( java.lang.Object , java.lang.Class<> ) ; } return java.lang.Object ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Class<?> < ? > java.lang.Class<?> ( java.lang.Class<?> < ? > java.lang.Class<?> ) { java.lang.Class<?> < ? > java.lang.Class<?> = this . org.springframework.data.couchbase.core.convert.CustomConversions . getCustomWriteTarget ( java.lang.Class<> ) ; return java.lang.Class<> != null ? java.lang.Class<> : java.lang.Class<> ; }  <METHOD_END>