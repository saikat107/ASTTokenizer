<METHOD_START> @ java.lang.Override public void void ( java.lang.ClassLoader java.lang.ClassLoader ) { this . java.lang.ClassLoader = java.lang.ClassLoader ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > T T ( java.lang.Object java.lang.Object , java.lang.Class<T> < T > java.lang.Class<T> ) throws java.lang.Exception { return this . T ( java.lang.Object , this . J ( java.lang.Class<T> ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > T T ( java.lang.Object java.lang.Object , java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) throws java.lang.Exception { J J = this . J ( java.util.Map<java.lang.String,java.lang.Object> ) ; return this . T ( java.lang.Object , J ) ; }  <METHOD_END>
<METHOD_START> protected J J ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> , java.lang.String java.lang.String ) throws java.lang.Exception { java.lang.Object java.lang.Object = java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String ) ; if ( java.lang.Object == null ) { throw new java.lang.IllegalArgumentException ( STRING + java.lang.String + STRING ) ; } else { java.lang.Class<?> < ? > java.lang.Class<?> = null ; if ( java.lang.Object instanceof java.lang.Class<?> < ? > ) { java.lang.Class<?> = ( java.lang.Class<?> < ? > ) java.lang.Object ; } else { java.lang.Class<?> = ClassUtils . forName ( java.lang.Object . java.lang.String ( ) , this . java.lang.ClassLoader ) ; } return this . J ( java.lang.Class<> ) ; } }  <METHOD_END>
<METHOD_START> protected abstract < T > T T ( java.lang.Object java.lang.Object , J J ) throws java.lang.Exception ;  <METHOD_END>
<METHOD_START> protected abstract J J ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) throws java.lang.Exception ;  <METHOD_END>
<METHOD_START> protected abstract J J ( java.lang.reflect.Type java.lang.reflect.Type );  <METHOD_END>