<METHOD_START> public void ( ConversionService org.springframework.core.convert.support.ConversionService ) { this . org.springframework.core.convert.support.ConversionService = org.springframework.core.convert.support.ConversionService ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Set<org.springframework.core.convert.support.ConvertiblePair> < ConvertiblePair > java.util.Set<org.springframework.core.convert.support.ConvertiblePair> ( ) { return java.util.Collections . java.util.Set ( new ConvertiblePair ( java.lang.Object [] .class , java.lang.Object .class ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( TypeDescriptor org.springframework.core.convert.support.TypeDescriptor , TypeDescriptor org.springframework.core.convert.support.TypeDescriptor ) { return ConversionUtils . canConvertElements ( org.springframework.core.convert.support.TypeDescriptor . getElementTypeDescriptor ( ) , org.springframework.core.convert.support.TypeDescriptor , this . org.springframework.core.convert.support.ConversionService ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , TypeDescriptor org.springframework.core.convert.support.TypeDescriptor , TypeDescriptor org.springframework.core.convert.support.TypeDescriptor ) { if ( java.lang.Object == null ) { return null ; } if ( org.springframework.core.convert.support.TypeDescriptor . isAssignableTo ( org.springframework.core.convert.support.TypeDescriptor ) ) { return java.lang.Object ; } if ( java.lang.reflect.Array . int ( java.lang.Object ) == NUMBER ) { return null ; } java.lang.Object java.lang.Object = java.lang.reflect.Array . java.lang.Object ( java.lang.Object , NUMBER ) ; return this . org.springframework.core.convert.support.ConversionService . convert ( java.lang.Object , org.springframework.core.convert.support.TypeDescriptor . elementTypeDescriptor ( java.lang.Object ) , org.springframework.core.convert.support.TypeDescriptor ) ; }  <METHOD_END>