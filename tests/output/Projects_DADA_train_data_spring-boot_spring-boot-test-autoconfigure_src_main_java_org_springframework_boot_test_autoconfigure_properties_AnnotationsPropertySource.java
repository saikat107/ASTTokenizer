<METHOD_START> public void ( java.lang.Class<?> < ? > java.lang.Class<?> ) { this( STRING , java.lang.Class<> ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , java.lang.Class<?> < ? > java.lang.Class<?> ) { super( java.lang.String , java.lang.Class<> ); this . java.util.Map<java.lang.String,java.lang.Object> = java.util.Map<java.lang.String,java.lang.Object> ( java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> private java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( java.lang.Class<?> < ? > java.lang.Class<?> ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.LinkedHashMap<java.lang.String,java.lang.Object> <> ( ) ; void ( java.lang.Class<> , java.lang.Class<> , java.util.Map<java.lang.String,java.lang.Object> , new java.util.HashSet<java.lang.Class<?>> < java.lang.Class<?> < ? > > ( ) ) ; return java.util.Collections . java.util.Map<java.lang.String,java.lang.Object> ( java.util.Map<java.lang.String,java.lang.Object> ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.Class<?> < ? > java.lang.Class<?> , java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> , java.util.Set<java.lang.Class<?>> < java.lang.Class<?> < ? > > java.util.Set<java.lang.Class<?>> ) { if ( java.lang.Class<> != null && java.util.Set<java.lang.Class<?>> . boolean ( java.lang.Class<> ) ) { for ( java.lang.annotation.Annotation java.lang.annotation.Annotation : java.util.List<java.lang.annotation.Annotation> ( java.lang.Class<> , java.lang.Class<> ) ) { if ( ! AnnotationUtils . isInJavaLangAnnotationPackage ( java.lang.annotation.Annotation ) ) { PropertyMapping org.springframework.boot.test.autoconfigure.properties.PropertyMapping = java.lang.annotation.Annotation . java.lang.Class<? extends java.lang.annotation.Annotation> ( ) . A ( PropertyMapping .class ) ; for ( java.lang.reflect.Method java.lang.reflect.Method : java.lang.annotation.Annotation . java.lang.Class<? extends java.lang.annotation.Annotation> ( ) . java.lang.reflect.Method[] ( ) ) { void ( java.lang.annotation.Annotation , java.lang.reflect.Method , org.springframework.boot.test.autoconfigure.properties.PropertyMapping , java.util.Map<java.lang.String,java.lang.Object> ) ; } void ( java.lang.Class<> , java.lang.annotation.Annotation . java.lang.Class<? extends java.lang.annotation.Annotation> ( ) , java.util.Map<java.lang.String,java.lang.Object> , java.util.Set<java.lang.Class<?>> ) ; } } void ( java.lang.Class<> , java.lang.Class<> . java.lang.Class<? super > ( ) , java.util.Map<java.lang.String,java.lang.Object> , java.util.Set<java.lang.Class<?>> ) ; } }  <METHOD_END>
<METHOD_START> private java.util.List<java.lang.annotation.Annotation> < java.lang.annotation.Annotation > java.util.List<java.lang.annotation.Annotation> ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.Class<?> < ? > java.lang.Class<?> ) { java.util.List<java.lang.annotation.Annotation> < java.lang.annotation.Annotation > java.util.List<java.lang.annotation.Annotation> = new java.util.ArrayList<java.lang.annotation.Annotation> <> ( ) ; for ( java.lang.annotation.Annotation java.lang.annotation.Annotation : AnnotationUtils . getAnnotations ( java.lang.Class<> ) ) { if ( ! AnnotationUtils . isInJavaLangAnnotationPackage ( java.lang.annotation.Annotation ) ) { java.util.List<java.lang.annotation.Annotation> . boolean ( java.lang.annotation.Annotation ( java.lang.Class<> , java.lang.annotation.Annotation . java.lang.Class<? extends java.lang.annotation.Annotation> ( ) ) ) ; } } return java.util.List<java.lang.annotation.Annotation> ; }  <METHOD_END>
<METHOD_START> private java.lang.annotation.Annotation java.lang.annotation.Annotation ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.Class<? extends java.lang.annotation.Annotation> < ? extends java.lang.annotation.Annotation > java.lang.Class<? extends java.lang.annotation.Annotation> ) { if ( java.lang.Class<> == null ) { return null ; } java.lang.annotation.Annotation java.lang.annotation.Annotation = AnnotatedElementUtils . getMergedAnnotation ( java.lang.Class<> , java.lang.Class<> ) ; return java.lang.annotation.Annotation != null ? java.lang.annotation.Annotation : java.lang.annotation.Annotation ( java.lang.Class<> . java.lang.Class<? super > ( ) , java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.annotation.Annotation java.lang.annotation.Annotation , java.lang.reflect.Method java.lang.reflect.Method , PropertyMapping org.springframework.boot.test.autoconfigure.properties.PropertyMapping , java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { PropertyMapping org.springframework.boot.test.autoconfigure.properties.PropertyMapping = AnnotationUtils . getAnnotation ( java.lang.reflect.Method , PropertyMapping .class ) ; SkipPropertyMapping org.springframework.boot.test.autoconfigure.properties.SkipPropertyMapping = org.springframework.boot.test.autoconfigure.properties.SkipPropertyMapping ( org.springframework.boot.test.autoconfigure.properties.PropertyMapping , org.springframework.boot.test.autoconfigure.properties.PropertyMapping ) ; if ( org.springframework.boot.test.autoconfigure.properties.SkipPropertyMapping == SkipPropertyMapping . YES ) { return; } java.lang.String java.lang.String = java.lang.String ( org.springframework.boot.test.autoconfigure.properties.PropertyMapping , org.springframework.boot.test.autoconfigure.properties.PropertyMapping , java.lang.reflect.Method ) ; ReflectionUtils . makeAccessible ( java.lang.reflect.Method ) ; java.lang.Object java.lang.Object = ReflectionUtils . invokeMethod ( java.lang.reflect.Method , java.lang.annotation.Annotation ) ; if ( org.springframework.boot.test.autoconfigure.properties.SkipPropertyMapping == SkipPropertyMapping . ON_DEFAULT_VALUE ) { java.lang.Object java.lang.Object = AnnotationUtils . getDefaultValue ( java.lang.annotation.Annotation , java.lang.reflect.Method . java.lang.String ( ) ) ; if ( ObjectUtils . nullSafeEquals ( java.lang.Object , java.lang.Object ) ) { return; } } void ( java.lang.String , java.lang.Object , java.util.Map<java.lang.String,java.lang.Object> ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.test.autoconfigure.properties.SkipPropertyMapping org.springframework.boot.test.autoconfigure.properties.SkipPropertyMapping ( PropertyMapping org.springframework.boot.test.autoconfigure.properties.PropertyMapping , PropertyMapping org.springframework.boot.test.autoconfigure.properties.PropertyMapping ) { if ( org.springframework.boot.test.autoconfigure.properties.PropertyMapping != null ) { return org.springframework.boot.test.autoconfigure.properties.PropertyMapping . skip ( ) ; } if ( org.springframework.boot.test.autoconfigure.properties.PropertyMapping != null ) { return org.springframework.boot.test.autoconfigure.properties.PropertyMapping . skip ( ) ; } return SkipPropertyMapping . YES ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( PropertyMapping org.springframework.boot.test.autoconfigure.properties.PropertyMapping , PropertyMapping org.springframework.boot.test.autoconfigure.properties.PropertyMapping , java.lang.reflect.Method java.lang.reflect.Method ) { java.lang.String java.lang.String = ( org.springframework.boot.test.autoconfigure.properties.PropertyMapping == null ? STRING : org.springframework.boot.test.autoconfigure.properties.PropertyMapping . value ( ) ) ; java.lang.String java.lang.String = ( org.springframework.boot.test.autoconfigure.properties.PropertyMapping == null ? STRING : org.springframework.boot.test.autoconfigure.properties.PropertyMapping . value ( ) ) ; if ( ! StringUtils . hasText ( java.lang.String ) ) { java.lang.String = java.lang.String ( java.lang.reflect.Method . java.lang.String ( ) ) ; } return java.lang.String ( java.lang.String , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( java.lang.String java.lang.String ) { java.util.regex.Matcher java.util.regex.Matcher = java.util.regex.Pattern . java.util.regex.Matcher ( java.lang.String ) ; java.lang.StringBuffer java.lang.StringBuffer = new java.lang.StringBuffer ( ) ; while ( java.util.regex.Matcher . boolean ( ) ) { java.util.regex.Matcher . java.util.regex.Matcher ( java.lang.StringBuffer , java.util.regex.Matcher . java.lang.String ( NUMBER ) + '-' + StringUtils . uncapitalize ( java.util.regex.Matcher . java.lang.String ( NUMBER ) ) ) ; } java.util.regex.Matcher . java.lang.StringBuffer ( java.lang.StringBuffer ) ; return java.lang.StringBuffer . java.lang.String ( ) . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { if ( StringUtils . hasText ( java.lang.String ) ) { return ( java.lang.String . boolean ( STRING ) ? java.lang.String + java.lang.String : java.lang.String + STRING + java.lang.String ) ; } return java.lang.String ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String , java.lang.Object java.lang.Object , java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { if ( ObjectUtils . isArray ( java.lang.Object ) ) { java.lang.Object [] java.lang.Object[] = ObjectUtils . toObjectArray ( java.lang.Object ) ; for ( int int = NUMBER ; int < java.lang.Object[] . int ; int ++ ) { java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String + STRING + int + STRING , java.lang.Object[] [ int ] ) ; } } else { java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String , java.lang.Object ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.String java.lang.String ) { return this . java.util.Map<java.lang.String,java.lang.Object> . boolean ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.String java.lang.String ) { return this . java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String [] java.lang.String[] ( ) { return StringUtils . toStringArray ( this . java.util.Map<java.lang.String,java.lang.Object> . java.util.Set<java.lang.String> ( ) ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return this . java.util.Map<java.lang.String,java.lang.Object> . boolean ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return this . java.util.Map<java.lang.String,java.lang.Object> . int ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Object java.lang.Object ) { if ( java.lang.Object == this ) { return true ; } if ( java.lang.Object == null || java.lang.Class<? extends org.springframework.boot.test.autoconfigure.properties.AnnotationsPropertySource> ( ) != java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) { return false ; } return this . java.util.Map<java.lang.String,java.lang.Object> . boolean ( ( ( org.springframework.boot.test.autoconfigure.properties.AnnotationsPropertySource ) java.lang.Object ) . java.util.Map<java.lang.String,java.lang.Object> ) ; }  <METHOD_END>