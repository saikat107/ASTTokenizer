<METHOD_START> public void ( GemfireTemplate org.springframework.data.gemfire.repository.support.GemfireTemplate , EntityInformation < T , ID > org.springframework.data.gemfire.repository.support.EntityInformation<T,ID> ) { Assert . notNull ( org.springframework.data.gemfire.repository.support.GemfireTemplate , STRING ) ; Assert . notNull ( org.springframework.data.gemfire.repository.support.EntityInformation<T,ID> , STRING ) ; this . org.springframework.data.gemfire.repository.support.GemfireTemplate = org.springframework.data.gemfire.repository.support.GemfireTemplate ; this . org.springframework.data.gemfire.repository.support.EntityInformation<T,ID> = org.springframework.data.gemfire.repository.support.EntityInformation<T,ID> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < U extends T > U U ( U U ) { ID ID = org.springframework.data.gemfire.repository.support.EntityInformation<T,ID> . getId ( U ) . orElseThrow ( ( ) newIllegalArgumentException ( STRING , entity ) ) ; org.springframework.data.gemfire.repository.support.GemfireTemplate . put ( ID , U ) ; return U ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < U extends T > java.lang.Iterable<U> < U > java.lang.Iterable<U> ( java.lang.Iterable<U> < U > java.lang.Iterable<U> ) { java.util.Map<ID,U> < ID , U > java.util.Map<ID,U> = new java.util.HashMap<ID,U> <> ( ) ; for ( U U : java.lang.Iterable<U> ) { ID ID = org.springframework.data.gemfire.repository.support.EntityInformation<T,ID> . getId ( U ) . orElseThrow ( ( ) newIllegalArgumentException ( STRING , entity ) ) ; java.util.Map<ID,U> . U ( ID , U ) ; } org.springframework.data.gemfire.repository.support.GemfireTemplate . putAll ( java.util.Map<ID,U> ) ; return java.util.Map<ID,U> . java.util.Collection<U> ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public T T ( Wrapper < T , ID > org.springframework.data.gemfire.repository.support.Wrapper<T,ID> ) { T T = org.springframework.data.gemfire.repository.support.Wrapper<T,ID> . getEntity ( ) ; org.springframework.data.gemfire.repository.support.GemfireTemplate . put ( org.springframework.data.gemfire.repository.support.Wrapper<T,ID> . getKey ( ) , T ) ; return T ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public long long ( ) { SelectResults < java.lang.Integer > org.springframework.data.gemfire.repository.support.SelectResults<java.lang.Integer> = org.springframework.data.gemfire.repository.support.GemfireTemplate . find ( java.lang.String . java.lang.String ( STRING , org.springframework.data.gemfire.repository.support.GemfireTemplate . getRegion ( ) . getFullPath ( ) ) ) ; return java.lang.Long . java.lang.Long ( org.springframework.data.gemfire.repository.support.SelectResults<java.lang.Integer> . iterator ( ) . next ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ID ID ) { return java.util.Optional<T> ( ID ) . boolean ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) public java.util.Optional<T> < T > java.util.Optional<T> ( ID ID ) { return java.util.Optional . java.util.Optional ( org.springframework.data.gemfire.repository.support.GemfireTemplate . get ( ID ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Collection<T> < T > java.util.Collection<T> ( ) { SelectResults < T > org.springframework.data.gemfire.repository.support.SelectResults<T> = org.springframework.data.gemfire.repository.support.GemfireTemplate . find ( java.lang.String . java.lang.String ( STRING , org.springframework.data.gemfire.repository.support.GemfireTemplate . getRegion ( ) . getFullPath ( ) ) ) ; return org.springframework.data.gemfire.repository.support.SelectResults<T> . asList ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Iterable<T> < T > java.lang.Iterable<T> ( Sort org.springframework.data.gemfire.repository.support.Sort ) { QueryString org.springframework.data.gemfire.repository.support.QueryString = new QueryString ( STRING ) . forRegion ( org.springframework.data.gemfire.repository.support.EntityInformation<T,ID> . getJavaType ( ) , org.springframework.data.gemfire.repository.support.GemfireTemplate . getRegion ( ) ) . orderBy ( org.springframework.data.gemfire.repository.support.Sort ) ; SelectResults < T > org.springframework.data.gemfire.repository.support.SelectResults<T> = org.springframework.data.gemfire.repository.support.GemfireTemplate . find ( org.springframework.data.gemfire.repository.support.QueryString . toString ( ) ) ; return org.springframework.data.gemfire.repository.support.SelectResults<T> . asList ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) public java.util.Collection<T> < T > java.util.Collection<T> ( java.lang.Iterable<ID> < ID > java.lang.Iterable<ID> ) { java.util.List<ID> < ID > java.util.List<ID> = new java.util.ArrayList<ID> <> ( ) ; for ( ID ID : java.lang.Iterable<ID> ) { java.util.List<ID> . boolean ( ID ) ; } return CollectionUtils .< ID , T > nullSafeMap ( org.springframework.data.gemfire.repository.support.GemfireTemplate . getAll ( java.util.List<ID> ) ) . values ( ) . stream ( ) . filter ( java.util.Objects :: boolean ) . collect ( java.util.stream.Collectors . java.util.stream.Collector<java.lang.Object,?,java.util.List<java.lang.Object>> ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ID ID ) { org.springframework.data.gemfire.repository.support.GemfireTemplate . remove ( ID ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( T T ) { void ( org.springframework.data.gemfire.repository.support.EntityInformation<T,ID> . getId ( T ) . orElseThrow ( ( ) new IllegalArgumentException ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Iterable<? extends T> < ? extends T > java.lang.Iterable<? extends T> ) { for ( T T : java.lang.Iterable<> ) { void ( T ) ; } }  <METHOD_END>
<METHOD_START> boolean boolean ( Region org.springframework.data.gemfire.repository.support.Region ) { return ( org.springframework.data.gemfire.repository.support.Region != null && org.springframework.data.gemfire.repository.support.Region . getAttributes ( ) != null && boolean ( org.springframework.data.gemfire.repository.support.Region . getAttributes ( ) . getDataPolicy ( ) ) ) ; }  <METHOD_END>
<METHOD_START> boolean boolean ( DataPolicy org.springframework.data.gemfire.repository.support.DataPolicy ) { return ( org.springframework.data.gemfire.repository.support.DataPolicy != null && org.springframework.data.gemfire.repository.support.DataPolicy . withPartitioning ( ) ) ; }  <METHOD_END>
<METHOD_START> boolean boolean ( Region org.springframework.data.gemfire.repository.support.Region ) { return ( org.springframework.data.gemfire.repository.support.Region . getRegionService ( ) instanceof Cache && boolean ( ( ( Cache ) org.springframework.data.gemfire.repository.support.Region . getRegionService ( ) ) . getCacheTransactionManager ( ) ) ) ; }  <METHOD_END>
<METHOD_START> boolean boolean ( CacheTransactionManager org.springframework.data.gemfire.repository.support.CacheTransactionManager ) { return ( org.springframework.data.gemfire.repository.support.CacheTransactionManager != null && org.springframework.data.gemfire.repository.support.CacheTransactionManager . exists ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) void void ( Region org.springframework.data.gemfire.repository.support.Region ) { org.springframework.data.gemfire.repository.support.Region . removeAll ( org.springframework.data.gemfire.repository.support.Region . keySet ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { org.springframework.data.gemfire.repository.support.GemfireTemplate . execute ( ( GemfireCallback < java.lang.Void > ) region -> { if ( isPartitioned ( region ) || isTransactionPresent ( region ) ) { doRegionClear ( region ) ; } else { try { region . clear ( ) ; } catch ( UnsupportedOperationException ignore ) { doRegionClear ( region ) ; } } return null ; } ) ; }  <METHOD_END>