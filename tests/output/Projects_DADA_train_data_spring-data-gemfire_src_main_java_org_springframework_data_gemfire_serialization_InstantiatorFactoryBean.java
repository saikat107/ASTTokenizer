<METHOD_START> public void void ( ) java.lang.Exception { Assert . notEmpty ( java.util.Map<java.lang.Class<? extends org.springframework.data.gemfire.serialization.DataSerializable>,java.lang.Integer> , STRING ) ; if ( org.springframework.data.gemfire.serialization.InstantiatorGenerator == null ) { org.springframework.data.gemfire.serialization.InstantiatorGenerator = new AsmInstantiatorGenerator ( java.lang.ClassLoader ) ; } java.util.Collection<org.springframework.data.gemfire.serialization.Instantiator> = new java.util.ArrayList<org.springframework.data.gemfire.serialization.Instantiator> < Instantiator > ( java.util.Map<java.lang.Class<? extends org.springframework.data.gemfire.serialization.DataSerializable>,java.lang.Integer> . size ( ) ) ; for ( java.util.Map.Entry<java.lang.Class<? extends org.springframework.data.gemfire.serialization.DataSerializable>,java.lang.Integer> < java.lang.Class<? extends org.springframework.data.gemfire.serialization.DataSerializable> < ? extends DataSerializable > , java.lang.Integer > java.util.Map.Entry<java.lang.Class<? extends org.springframework.data.gemfire.serialization.DataSerializable>,java.lang.Integer> : java.util.Map<java.lang.Class<? extends org.springframework.data.gemfire.serialization.DataSerializable>,java.lang.Integer> . entrySet ( ) ) { Assert . notNull ( java.util.Map.Entry<java.lang.Class<? extends org.springframework.data.gemfire.serialization.DataSerializable>,java.lang.Integer> . getKey ( ) , STRING ) ; Assert . notNull ( java.util.Map.Entry<java.lang.Class<? extends org.springframework.data.gemfire.serialization.DataSerializable>,java.lang.Integer> . getValue ( ) , STRING ) ; java.util.Collection<org.springframework.data.gemfire.serialization.Instantiator> . add ( org.springframework.data.gemfire.serialization.InstantiatorGenerator . getInstantiator ( java.util.Map.Entry<java.lang.Class<? extends org.springframework.data.gemfire.serialization.DataSerializable>,java.lang.Integer> . getKey ( ) , java.util.Map.Entry<java.lang.Class<? extends org.springframework.data.gemfire.serialization.DataSerializable>,java.lang.Integer> . getValue ( ) ) ) ; } if ( boolean ) { for ( Instantiator org.springframework.data.gemfire.serialization.Instantiator : java.util.Collection<org.springframework.data.gemfire.serialization.Instantiator> ) { Instantiator . register ( org.springframework.data.gemfire.serialization.Instantiator , boolean ) ; } } }  <METHOD_END>
<METHOD_START> public java.util.Collection<org.springframework.data.gemfire.serialization.Instantiator> < Instantiator > java.util.Collection<org.springframework.data.gemfire.serialization.Instantiator> ( ) java.lang.Exception { return java.util.Collection<org.springframework.data.gemfire.serialization.Instantiator> ; }  <METHOD_END>
<METHOD_START> public java.lang.Class<?> < ? > java.lang.Class<?> ( ) { return ( java.util.Collection<org.springframework.data.gemfire.serialization.Instantiator> != null ? java.util.Collection<org.springframework.data.gemfire.serialization.Instantiator> . getClass ( ) : java.util.Collection .class ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.ClassLoader java.lang.ClassLoader ) { this . java.lang.ClassLoader = java.lang.ClassLoader ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.Map<java.lang.Class<? extends org.springframework.data.gemfire.serialization.DataSerializable>,java.lang.Integer> < java.lang.Class<? extends org.springframework.data.gemfire.serialization.DataSerializable> < ? extends DataSerializable > , java.lang.Integer > java.util.Map<java.lang.Class<? extends org.springframework.data.gemfire.serialization.DataSerializable>,java.lang.Integer> ) { this . java.util.Map<java.lang.Class<? extends org.springframework.data.gemfire.serialization.DataSerializable>,java.lang.Integer> = java.util.Map<java.lang.Class<? extends org.springframework.data.gemfire.serialization.DataSerializable>,java.lang.Integer> ; }  <METHOD_END>
<METHOD_START> public void void ( InstantiatorGenerator org.springframework.data.gemfire.serialization.InstantiatorGenerator ) { this . org.springframework.data.gemfire.serialization.InstantiatorGenerator = org.springframework.data.gemfire.serialization.InstantiatorGenerator ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>