<METHOD_START> public void ( Parameters < ? , ? > org.springframework.data.repository.query.Parameters<?,?> , java.lang.Object [] java.lang.Object[] ) { Assert . notNull ( org.springframework.data.repository.query.Parameters<,> , STRING ) ; Assert . notNull ( java.lang.Object[] , STRING ) ; Assert . isTrue ( org.springframework.data.repository.query.Parameters<,> . getNumberOfParameters ( ) == java.lang.Object[] . int , STRING ) ; this . org.springframework.data.repository.query.Parameters<?,?> = org.springframework.data.repository.query.Parameters<,> ; this . java.util.List<java.lang.Object> = java.util.Arrays . java.util.stream.Stream<java.lang.Object> ( java.lang.Object[] ) . java.util.stream.Stream ( QueryExecutionConverters :: unwrap ) . collect ( java.util.stream.Collectors . java.util.stream.Collector<java.lang.Object,?,java.util.List<java.lang.Object>> ( ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.repository.query.Parameters<?,?> < ? , ? > org.springframework.data.repository.query.Parameters<?,?> ( ) { return org.springframework.data.repository.query.Parameters<,> ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.repository.query.Pageable org.springframework.data.repository.query.Pageable ( ) { if ( ! org.springframework.data.repository.query.Parameters<,> . hasPageableParameter ( ) ) { return Pageable . unpaged ( ) ; } Pageable org.springframework.data.repository.query.Pageable = ( Pageable ) java.util.List<java.lang.Object> . java.lang.Object ( org.springframework.data.repository.query.Parameters<,> . getPageableIndex ( ) ) ; return org.springframework.data.repository.query.Pageable == null ? Pageable . unpaged ( ) : org.springframework.data.repository.query.Pageable ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.repository.query.Sort org.springframework.data.repository.query.Sort ( ) { if ( org.springframework.data.repository.query.Parameters<,> . hasSortParameter ( ) ) { Sort org.springframework.data.repository.query.Sort = ( Sort ) java.util.List<java.lang.Object> . java.lang.Object ( org.springframework.data.repository.query.Parameters<,> . getSortIndex ( ) ) ; return org.springframework.data.repository.query.Sort == null ? Sort . unsorted ( ) : org.springframework.data.repository.query.Sort ; } if ( org.springframework.data.repository.query.Parameters<,> . hasPageableParameter ( ) ) { return org.springframework.data.repository.query.Pageable ( ) . getSort ( ) ; } return Sort . unsorted ( ) ; }  <METHOD_END>
<METHOD_START> public java.util.Optional<java.lang.Class<?>> < java.lang.Class<?> < ? > > java.util.Optional<java.lang.Class<?>> ( ) { return java.util.Optional . java.util.Optional<java.lang.Class<?>> ( org.springframework.data.repository.query.Parameters<,> . hasDynamicProjection ( ) ? ( java.lang.Class<?> < ? > ) java.util.List<java.lang.Object> . java.lang.Object ( org.springframework.data.repository.query.Parameters<,> . getDynamicProjectionIndex ( ) ) : null ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) protected < T > T T ( int int ) { return ( T ) java.util.List<java.lang.Object> . java.lang.Object ( int ) ; }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( int int ) { return java.util.List<java.lang.Object> . java.lang.Object ( org.springframework.data.repository.query.Parameters<,> . getBindableParameter ( int ) . getIndex ( ) ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return org.springframework.data.repository.query.Parameters<,> . getBindableParameters ( ) . stream ( ) . anyMatch ( it -> values . get ( it . getIndex ( ) ) == null ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.repository.query.ParametersParameterAccessor.BindableParameterIterator org.springframework.data.repository.query.ParametersParameterAccessor.BindableParameterIterator ( ) { return new org.springframework.data.repository.query.ParametersParameterAccessor.BindableParameterIterator ( this ) ; }  <METHOD_END>
<METHOD_START> public void ( org.springframework.data.repository.query.ParametersParameterAccessor org.springframework.data.repository.query.ParametersParameterAccessor ) { Assert . notNull ( org.springframework.data.repository.query.ParametersParameterAccessor , STRING ) ; this . org.springframework.data.repository.query.ParameterAccessor = org.springframework.data.repository.query.ParametersParameterAccessor ; this . int = org.springframework.data.repository.query.ParametersParameterAccessor . org.springframework.data.repository.query.Parameters<?,?> ( ) . getBindableParameters ( ) . getNumberOfParameters ( ) ; }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( ) { return org.springframework.data.repository.query.ParameterAccessor . getBindableValue ( int ++ ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return int > int ; }  <METHOD_END>
<METHOD_START> public void void ( ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>