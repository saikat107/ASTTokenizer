<METHOD_START> @ java.lang.Override public void void ( BeanFactory org.springframework.boot.jackson.BeanFactory ) throws org.springframework.boot.jackson.BeansException { this . org.springframework.boot.jackson.BeanFactory = org.springframework.boot.jackson.BeanFactory ; }  <METHOD_END>
<METHOD_START> @ javax.annotation.PostConstruct public void void ( ) { BeanFactory org.springframework.boot.jackson.BeanFactory = this . org.springframework.boot.jackson.BeanFactory ; while ( org.springframework.boot.jackson.BeanFactory != null ) { if ( org.springframework.boot.jackson.BeanFactory instanceof ListableBeanFactory ) { void ( ( ListableBeanFactory ) org.springframework.boot.jackson.BeanFactory ) ; } org.springframework.boot.jackson.BeanFactory = ( org.springframework.boot.jackson.BeanFactory instanceof HierarchicalBeanFactory ? ( ( HierarchicalBeanFactory ) org.springframework.boot.jackson.BeanFactory ) . getParentBeanFactory ( ) : null ) ; } }  <METHOD_END>
<METHOD_START> private void void ( ListableBeanFactory org.springframework.boot.jackson.ListableBeanFactory ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = org.springframework.boot.jackson.ListableBeanFactory . getBeansWithAnnotation ( JsonComponent .class ) ; for ( java.lang.Object java.lang.Object : java.util.Map<java.lang.String,java.lang.Object> . java.util.Collection<java.lang.Object> ( ) ) { void ( java.lang.Object ) ; } }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Object java.lang.Object ) { if ( java.lang.Object instanceof JsonSerializer ) { void ( ( JsonSerializer < ? > ) java.lang.Object ) ; } if ( java.lang.Object instanceof JsonDeserializer ) { void ( ( JsonDeserializer < ? > ) java.lang.Object ) ; } for ( java.lang.Class<?> < ? > java.lang.Class<?> : java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . java.lang.Class<?>[] ( ) ) { if ( JsonSerializer .class . boolean ( java.lang.Class<> ) || JsonDeserializer .class . boolean ( java.lang.Class<> ) ) { try { void ( java.lang.Class<> . newInstance ( ) ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.IllegalStateException ( java.lang.Exception ) ; } } } }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( { STRING } ) private < T > void void ( JsonSerializer < T > org.springframework.boot.jackson.JsonSerializer<T> ) { ResolvableType org.springframework.boot.jackson.ResolvableType = ResolvableType . forClass ( JsonSerializer .class , org.springframework.boot.jackson.JsonSerializer<T> . getClass ( ) ) ; addSerializer ( ( java.lang.Class<T> < T > ) org.springframework.boot.jackson.ResolvableType . resolveGeneric ( ) , org.springframework.boot.jackson.JsonSerializer<T> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( { STRING } ) private < T > void void ( JsonDeserializer < T > org.springframework.boot.jackson.JsonDeserializer<T> ) { ResolvableType org.springframework.boot.jackson.ResolvableType = ResolvableType . forClass ( JsonDeserializer .class , org.springframework.boot.jackson.JsonDeserializer<T> . getClass ( ) ) ; addDeserializer ( ( java.lang.Class<T> < T > ) org.springframework.boot.jackson.ResolvableType . resolveGeneric ( ) , org.springframework.boot.jackson.JsonDeserializer<T> ) ; }  <METHOD_END>