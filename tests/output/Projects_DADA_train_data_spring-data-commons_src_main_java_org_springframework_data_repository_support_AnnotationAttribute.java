<METHOD_START> public void ( java.lang.Class<? extends java.lang.annotation.Annotation> < ? extends java.lang.annotation.Annotation > java.lang.Class<? extends java.lang.annotation.Annotation> ) { this( java.lang.Class<> , java.util.Optional . java.util.Optional<java.lang.Object> ( ) ); }  <METHOD_END>
<METHOD_START> public java.lang.Class<? extends java.lang.annotation.Annotation> < ? extends java.lang.annotation.Annotation > java.lang.Class<? extends java.lang.annotation.Annotation> ( ) { return java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> public java.util.Optional<java.lang.Object> < java.lang.Object > java.util.Optional<java.lang.Object> ( MethodParameter org.springframework.data.repository.support.MethodParameter ) { Assert . notNull ( org.springframework.data.repository.support.MethodParameter , STRING ) ; java.lang.annotation.Annotation java.lang.annotation.Annotation = org.springframework.data.repository.support.MethodParameter . getParameterAnnotation ( java.lang.Class<> ) ; return java.util.Optional . java.util.Optional<java.lang.annotation.Annotation> ( java.lang.annotation.Annotation ) . java.util.Optional<java.lang.Object> ( this :: java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> public java.util.Optional<java.lang.Object> < java.lang.Object > java.util.Optional<java.lang.Object> ( java.lang.reflect.AnnotatedElement java.lang.reflect.AnnotatedElement ) { Assert . notNull ( java.lang.reflect.AnnotatedElement , STRING ) ; java.lang.annotation.Annotation java.lang.annotation.Annotation = java.lang.reflect.AnnotatedElement . getAnnotation ( java.lang.Class<> ) ; return java.util.Optional . java.util.Optional<java.lang.annotation.Annotation> ( java.lang.annotation.Annotation ) . java.util.Optional<java.lang.Object> ( java.lang.annotation.Annotation -> java.lang.Object ( java.lang.annotation.Annotation ) ) ; }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( java.lang.annotation.Annotation java.lang.annotation.Annotation ) { Assert . notNull ( java.lang.annotation.Annotation , STRING ) ; return java.util.Optional<java.lang.String> . java.util.Optional<java.lang.Object> ( java.lang.String -> AnnotationUtils . getValue ( java.lang.annotation.Annotation , java.lang.String ) ) . orElseGet ( ( ) AnnotationUtils . getValue ( annotation ) ) ; }  <METHOD_END>