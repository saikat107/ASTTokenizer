<METHOD_START> public void ( CriteriaBuilder org.springframework.data.jpa.repository.query.CriteriaBuilder , ParametersParameterAccessor org.springframework.data.jpa.repository.query.ParametersParameterAccessor , PersistenceProvider org.springframework.data.jpa.repository.query.PersistenceProvider ) { this( org.springframework.data.jpa.repository.query.CriteriaBuilder , org.springframework.data.jpa.repository.query.ParametersParameterAccessor . iterator ( ) , org.springframework.data.jpa.repository.query.ParametersParameterAccessor . getParameters ( ) , org.springframework.data.jpa.repository.query.PersistenceProvider ); }  <METHOD_END>
<METHOD_START> public void ( CriteriaBuilder org.springframework.data.jpa.repository.query.CriteriaBuilder , Parameters < ? , ? > org.springframework.data.jpa.repository.query.Parameters<?,?> , PersistenceProvider org.springframework.data.jpa.repository.query.PersistenceProvider ) { this( org.springframework.data.jpa.repository.query.CriteriaBuilder , null , org.springframework.data.jpa.repository.query.Parameters<,> , org.springframework.data.jpa.repository.query.PersistenceProvider ); }  <METHOD_END>
<METHOD_START> private void ( CriteriaBuilder org.springframework.data.jpa.repository.query.CriteriaBuilder , java.util.Iterator<java.lang.Object> < java.lang.Object > java.util.Iterator<java.lang.Object> , Parameters < ? , ? > org.springframework.data.jpa.repository.query.Parameters<?,?> , PersistenceProvider org.springframework.data.jpa.repository.query.PersistenceProvider ) { Assert . notNull ( org.springframework.data.jpa.repository.query.CriteriaBuilder , STRING ) ; Assert . notNull ( org.springframework.data.jpa.repository.query.Parameters<,> , STRING ) ; Assert . notNull ( org.springframework.data.jpa.repository.query.PersistenceProvider , STRING ) ; this . org.springframework.data.jpa.repository.query.CriteriaBuilder = org.springframework.data.jpa.repository.query.CriteriaBuilder ; this . java.util.Iterator<? extends org.springframework.data.jpa.repository.query.Parameter> = org.springframework.data.jpa.repository.query.Parameters<,> . getBindableParameters ( ) . iterator ( ) ; this . java.util.List<org.springframework.data.jpa.repository.query.ParameterMetadataProvider.ParameterMetadata<?>> = new java.util.ArrayList<org.springframework.data.jpa.repository.query.ParameterMetadataProvider.ParameterMetadata<?>> < org.springframework.data.jpa.repository.query.ParameterMetadataProvider.ParameterMetadata<?> < ? > > ( ) ; this . java.util.Iterator<java.lang.Object> = java.util.Iterator<java.lang.Object> ; this . org.springframework.data.jpa.repository.query.PersistenceProvider = org.springframework.data.jpa.repository.query.PersistenceProvider ; }  <METHOD_END>
<METHOD_START> public java.util.List<org.springframework.data.jpa.repository.query.ParameterMetadataProvider.ParameterMetadata<?>> < org.springframework.data.jpa.repository.query.ParameterMetadataProvider.ParameterMetadata<?> < ? > > java.util.List<org.springframework.data.jpa.repository.query.ParameterMetadataProvider.ParameterMetadata<?>> ( ) { return java.util.Collections . java.util.List<org.springframework.data.jpa.repository.query.ParameterMetadataProvider.ParameterMetadata<?>> ( java.util.List<org.springframework.data.jpa.repository.query.ParameterMetadataProvider.ParameterMetadata<?>> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public < T > org.springframework.data.jpa.repository.query.ParameterMetadataProvider.ParameterMetadata<T> < T > org.springframework.data.jpa.repository.query.ParameterMetadataProvider.ParameterMetadata<T> ( Part org.springframework.data.jpa.repository.query.Part ) { Parameter org.springframework.data.jpa.repository.query.Parameter = java.util.Iterator<> . next ( ) ; return ( org.springframework.data.jpa.repository.query.ParameterMetadataProvider.ParameterMetadata<T> < T > ) org.springframework.data.jpa.repository.query.ParameterMetadataProvider.ParameterMetadata ( org.springframework.data.jpa.repository.query.Part , org.springframework.data.jpa.repository.query.Parameter . getType ( ) , org.springframework.data.jpa.repository.query.Parameter ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public < T > org.springframework.data.jpa.repository.query.ParameterMetadataProvider.ParameterMetadata<? extends T> < ? extends T > org.springframework.data.jpa.repository.query.ParameterMetadataProvider.ParameterMetadata<? extends T> ( Part org.springframework.data.jpa.repository.query.Part , java.lang.Class<T> < T > java.lang.Class<T> ) { Parameter org.springframework.data.jpa.repository.query.Parameter = java.util.Iterator<> . next ( ) ; java.lang.Class<?> < ? > java.lang.Class<?> = ClassUtils . isAssignable ( java.lang.Class<T> , org.springframework.data.jpa.repository.query.Parameter . getType ( ) ) ? org.springframework.data.jpa.repository.query.Parameter . getType ( ) : java.lang.Class<T> ; return ( org.springframework.data.jpa.repository.query.ParameterMetadataProvider.ParameterMetadata<? extends T> < ? extends T > ) org.springframework.data.jpa.repository.query.ParameterMetadataProvider.ParameterMetadata ( org.springframework.data.jpa.repository.query.Part , java.lang.Class<> , org.springframework.data.jpa.repository.query.Parameter ) ; }  <METHOD_END>
<METHOD_START> private < T > org.springframework.data.jpa.repository.query.ParameterMetadataProvider.ParameterMetadata<T> < T > org.springframework.data.jpa.repository.query.ParameterMetadataProvider.ParameterMetadata<T> ( Part org.springframework.data.jpa.repository.query.Part , java.lang.Class<T> < T > java.lang.Class<T> , Parameter org.springframework.data.jpa.repository.query.Parameter ) { Assert . notNull ( java.lang.Class<T> , STRING ) ; @ java.lang.SuppressWarnings ( STRING ) java.lang.Class<T> < T > java.lang.Class<T> = Expression .class . boolean ( java.lang.Class<T> ) ? ( java.lang.Class<T> < T > ) java.lang.Object .class : java.lang.Class<T> ; ParameterExpression < T > org.springframework.data.jpa.repository.query.ParameterExpression<T> = org.springframework.data.jpa.repository.query.Parameter . isExplicitlyNamed ( ) ? org.springframework.data.jpa.repository.query.CriteriaBuilder . parameter ( java.lang.Class<T> , org.springframework.data.jpa.repository.query.Parameter . getName ( ) . orElseThrow ( ( ) new IllegalArgumentException ( STRING ) ) ) : org.springframework.data.jpa.repository.query.CriteriaBuilder . parameter ( java.lang.Class<T> ) ; org.springframework.data.jpa.repository.query.ParameterMetadataProvider.ParameterMetadata<T> < T > org.springframework.data.jpa.repository.query.ParameterMetadataProvider.ParameterMetadata<T> = new org.springframework.data.jpa.repository.query.ParameterMetadataProvider.ParameterMetadata<T> < T > ( org.springframework.data.jpa.repository.query.ParameterExpression<T> , org.springframework.data.jpa.repository.query.Part . getType ( ) , java.util.Iterator<java.lang.Object> == null ? org.springframework.data.jpa.repository.query.ParameterMetadataProvider.ParameterMetadata . java.lang.Object : java.util.Iterator<java.lang.Object> . java.lang.Object ( ) , this . org.springframework.data.jpa.repository.query.PersistenceProvider ) ; java.util.List<org.springframework.data.jpa.repository.query.ParameterMetadataProvider.ParameterMetadata<?>> . boolean ( org.springframework.data.jpa.repository.query.ParameterMetadataProvider.ParameterMetadata<T> ) ; return org.springframework.data.jpa.repository.query.ParameterMetadataProvider.ParameterMetadata<T> ; }  <METHOD_END>
<METHOD_START> public void ( ParameterExpression < T > org.springframework.data.jpa.repository.query.ParameterExpression<T> , Type org.springframework.data.jpa.repository.query.Type , java.lang.Object java.lang.Object , PersistenceProvider org.springframework.data.jpa.repository.query.PersistenceProvider ) { this . org.springframework.data.jpa.repository.query.ParameterExpression<T> = org.springframework.data.jpa.repository.query.ParameterExpression<T> ; this . org.springframework.data.jpa.repository.query.PersistenceProvider = org.springframework.data.jpa.repository.query.PersistenceProvider ; this . org.springframework.data.jpa.repository.query.Type = java.lang.Object == null && Type . SIMPLE_PROPERTY . equals ( org.springframework.data.jpa.repository.query.Type ) ? Type . IS_NULL : org.springframework.data.jpa.repository.query.Type ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.jpa.repository.query.ParameterExpression<T> < T > org.springframework.data.jpa.repository.query.ParameterExpression<T> ( ) { return org.springframework.data.jpa.repository.query.ParameterExpression<T> ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return Type . IS_NULL . equals ( org.springframework.data.jpa.repository.query.Type ) ; }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object ) { Assert . notNull ( java.lang.Object , STRING ) ; java.lang.Class<? extends T> < ? extends T > java.lang.Class<? extends T> = org.springframework.data.jpa.repository.query.ParameterExpression<T> . getJavaType ( ) ; if ( java.lang.String .class . boolean ( java.lang.Class<> ) ) { switch ( org.springframework.data.jpa.repository.query.Type ) { case STARTING_WITH : return java.lang.String . java.lang.String ( STRING , java.lang.Object . java.lang.String ( ) ) ; case ENDING_WITH : return java.lang.String . java.lang.String ( STRING , java.lang.Object . java.lang.String ( ) ) ; case CONTAINING : case NOT_CONTAINING : return java.lang.String . java.lang.String ( STRING , java.lang.Object . java.lang.String ( ) ) ; default: return java.lang.Object ; } } return java.util.Collection .class . boolean ( java.lang.Class<> ) ? org.springframework.data.jpa.repository.query.PersistenceProvider . potentiallyConvertEmptyCollection ( java.util.Collection<?> ( java.lang.Object ) ) : java.lang.Object ; }  <METHOD_END>
<METHOD_START> private static java.util.Collection<?> < ? > java.util.Collection<?> ( java.lang.Object java.lang.Object ) { if ( java.lang.Object == null ) { return null ; } if ( java.lang.Object instanceof java.util.Collection ) { return ( java.util.Collection<?> < ? > ) java.lang.Object ; } if ( ObjectUtils . isArray ( java.lang.Object ) ) { return java.util.Arrays . java.util.List ( ObjectUtils . toObjectArray ( java.lang.Object ) ) ; } return java.util.Collections . java.util.Set<java.lang.Object> ( java.lang.Object ) ; }  <METHOD_END>