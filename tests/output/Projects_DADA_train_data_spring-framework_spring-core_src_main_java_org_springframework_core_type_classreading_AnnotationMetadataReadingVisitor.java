<METHOD_START> public void ( java.lang.ClassLoader java.lang.ClassLoader ) { this . java.lang.ClassLoader = java.lang.ClassLoader ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.core.type.classreading.MethodVisitor org.springframework.core.type.classreading.MethodVisitor ( int int , java.lang.String java.lang.String , java.lang.String java.lang.String , java.lang.String java.lang.String , java.lang.String [] java.lang.String[] ) { if ( ( int & Opcodes . ACC_BRIDGE ) != NUMBER ) { return super. visitMethod ( int , java.lang.String , java.lang.String , java.lang.String , java.lang.String[] ) ; } return new MethodMetadataReadingVisitor ( java.lang.String , int , getClassName ( ) , Type . getReturnType ( java.lang.String ) . getClassName ( ) , this . java.lang.ClassLoader , this . java.util.Set<org.springframework.core.type.classreading.MethodMetadata> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.core.type.classreading.AnnotationVisitor org.springframework.core.type.classreading.AnnotationVisitor ( final java.lang.String java.lang.String , boolean boolean ) { java.lang.String java.lang.String = Type . getType ( java.lang.String ) . getClassName ( ) ; this . java.util.Set<java.lang.String> . boolean ( java.lang.String ) ; return new AnnotationAttributesReadingVisitor ( java.lang.String , this . org.springframework.core.type.classreading.LinkedMultiValueMap<java.lang.String,org.springframework.core.type.classreading.AnnotationAttributes> , this . java.util.Map<java.lang.String,java.util.Set<java.lang.String>> , this . java.lang.ClassLoader ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> ( ) { return this . java.util.Set<java.lang.String> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> ( java.lang.String java.lang.String ) { return this . java.util.Map<java.lang.String,java.util.Set<java.lang.String>> . java.util.Set<java.lang.String> ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.String java.lang.String ) { return this . java.util.Set<java.lang.String> . boolean ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.String java.lang.String ) { java.util.Collection<java.util.Set<java.lang.String>> < java.util.Set<java.lang.String> < java.lang.String > > java.util.Collection<java.util.Set<java.lang.String>> = this . java.util.Map<java.lang.String,java.util.Set<java.lang.String>> . java.util.Collection<java.util.Set<java.lang.String>> ( ) ; for ( java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> : java.util.Collection<java.util.Set<java.lang.String>> ) { if ( java.util.Set<java.lang.String> . boolean ( java.lang.String ) ) { return true ; } } return false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.String java.lang.String ) { return ( ! AnnotationUtils . isInJavaLangAnnotationPackage ( java.lang.String ) && this . org.springframework.core.type.classreading.LinkedMultiValueMap<java.lang.String,org.springframework.core.type.classreading.AnnotationAttributes> . containsKey ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.core.type.classreading.AnnotationAttributes org.springframework.core.type.classreading.AnnotationAttributes ( java.lang.String java.lang.String ) { return org.springframework.core.type.classreading.AnnotationAttributes ( java.lang.String , false ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.core.type.classreading.AnnotationAttributes org.springframework.core.type.classreading.AnnotationAttributes ( java.lang.String java.lang.String , boolean boolean ) { AnnotationAttributes org.springframework.core.type.classreading.AnnotationAttributes = AnnotationReadingVisitorUtils . getMergedAnnotationAttributes ( this . org.springframework.core.type.classreading.LinkedMultiValueMap<java.lang.String,org.springframework.core.type.classreading.AnnotationAttributes> , this . java.util.Map<java.lang.String,java.util.Set<java.lang.String>> , java.lang.String ) ; return AnnotationReadingVisitorUtils . convertClassValues ( STRING + getClassName ( ) + STRING , this . java.lang.ClassLoader , org.springframework.core.type.classreading.AnnotationAttributes , boolean ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.core.type.classreading.MultiValueMap<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > org.springframework.core.type.classreading.MultiValueMap<java.lang.String,java.lang.Object> ( java.lang.String java.lang.String ) { return org.springframework.core.type.classreading.MultiValueMap<java.lang.String,java.lang.Object> ( java.lang.String , false ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.core.type.classreading.MultiValueMap<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > org.springframework.core.type.classreading.MultiValueMap<java.lang.String,java.lang.Object> ( java.lang.String java.lang.String , boolean boolean ) { MultiValueMap < java.lang.String , java.lang.Object > org.springframework.core.type.classreading.MultiValueMap<java.lang.String,java.lang.Object> = new LinkedMultiValueMap <> ( ) ; java.util.List<org.springframework.core.type.classreading.AnnotationAttributes> < AnnotationAttributes > java.util.List<org.springframework.core.type.classreading.AnnotationAttributes> = this . org.springframework.core.type.classreading.LinkedMultiValueMap<java.lang.String,org.springframework.core.type.classreading.AnnotationAttributes> . get ( java.lang.String ) ; if ( java.util.List<org.springframework.core.type.classreading.AnnotationAttributes> == null ) { return null ; } for ( AnnotationAttributes org.springframework.core.type.classreading.AnnotationAttributes : java.util.List<org.springframework.core.type.classreading.AnnotationAttributes> ) { for ( java.util.Map . java.util.Map.Entry<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map.Entry<java.lang.String,java.lang.Object> : AnnotationReadingVisitorUtils . convertClassValues ( STRING + getClassName ( ) + STRING , this . java.lang.ClassLoader , org.springframework.core.type.classreading.AnnotationAttributes , boolean ) . entrySet ( ) ) { org.springframework.core.type.classreading.MultiValueMap<java.lang.String,java.lang.Object> . add ( java.util.Map.Entry<java.lang.String,java.lang.Object> . java.lang.String ( ) , java.util.Map.Entry<java.lang.String,java.lang.Object> . java.lang.Object ( ) ) ; } } return org.springframework.core.type.classreading.MultiValueMap<java.lang.String,java.lang.Object> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.String java.lang.String ) { for ( MethodMetadata org.springframework.core.type.classreading.MethodMetadata : this . java.util.Set<org.springframework.core.type.classreading.MethodMetadata> ) { if ( org.springframework.core.type.classreading.MethodMetadata . isAnnotated ( java.lang.String ) ) { return true ; } } return false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Set<org.springframework.core.type.classreading.MethodMetadata> < MethodMetadata > java.util.Set<org.springframework.core.type.classreading.MethodMetadata> ( java.lang.String java.lang.String ) { java.util.Set<org.springframework.core.type.classreading.MethodMetadata> < MethodMetadata > java.util.Set<org.springframework.core.type.classreading.MethodMetadata> = new java.util.LinkedHashSet<org.springframework.core.type.classreading.MethodMetadata> <> ( NUMBER ) ; for ( MethodMetadata org.springframework.core.type.classreading.MethodMetadata : this . java.util.Set<org.springframework.core.type.classreading.MethodMetadata> ) { if ( org.springframework.core.type.classreading.MethodMetadata . isAnnotated ( java.lang.String ) ) { java.util.Set<org.springframework.core.type.classreading.MethodMetadata> . add ( org.springframework.core.type.classreading.MethodMetadata ) ; } } return java.util.Set<org.springframework.core.type.classreading.MethodMetadata> ; }  <METHOD_END>