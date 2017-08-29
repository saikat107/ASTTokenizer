<METHOD_START> @ Before public void void ( ) java.lang.Exception { java.lang.reflect.Method = org.springframework.data.jpa.repository.query.JpaQueryMethodUnitTests.InvalidRepository .class . java.lang.reflect.Method ( java.lang.String , java.lang.String .class , Pageable .class ) ; java.lang.reflect.Method = org.springframework.data.jpa.repository.query.JpaQueryMethodUnitTests.InvalidRepository .class . java.lang.reflect.Method ( java.lang.String , java.lang.String .class , Pageable .class , Sort .class ) ; java.lang.reflect.Method = org.springframework.data.jpa.repository.query.JpaQueryMethodUnitTests.InvalidRepository .class . java.lang.reflect.Method ( java.lang.String , java.lang.String .class , Pageable .class , Pageable .class ) ; java.lang.reflect.Method = org.springframework.data.jpa.repository.query.JpaQueryMethodUnitTests.InvalidRepository .class . java.lang.reflect.Method ( java.lang.String , java.lang.String .class , Sort .class , Sort .class ) ; java.lang.reflect.Method = org.springframework.data.jpa.repository.query.JpaQueryMethodUnitTests.ValidRepository .class . java.lang.reflect.Method ( STRING , java.lang.Integer .class ) ; java.lang.reflect.Method = org.springframework.data.jpa.repository.query.JpaQueryMethodUnitTests.ValidRepository .class . java.lang.reflect.Method ( STRING ) ; java.lang.reflect.Method = org.springframework.data.jpa.repository.query.JpaQueryMethodUnitTests.ValidRepository .class . java.lang.reflect.Method ( STRING ) ; java.lang.reflect.Method = org.springframework.data.jpa.repository.query.JpaQueryMethodUnitTests.ValidRepository .class . java.lang.reflect.Method ( STRING , java.lang.Integer .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { JpaQueryMethod org.springframework.data.jpa.repository.query.JpaQueryMethod = org.springframework.data.jpa.repository.query.JpaQueryMethod ( UserRepository .class , STRING , java.lang.String .class ) ; assertEquals ( STRING , org.springframework.data.jpa.repository.query.JpaQueryMethod . getNamedQueryName ( ) ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . isCollectionQuery ( ) , is ( true ) ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . getAnnotatedQuery ( ) , is ( nullValue ( ) ) ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . isNativeQuery ( ) , is ( false ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new JpaQueryMethod ( null , org.springframework.data.jpa.repository.query.RepositoryMetadata , org.springframework.data.jpa.repository.query.ProjectionFactory , org.springframework.data.jpa.repository.query.QueryExtractor ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = UserRepository .class . java.lang.reflect.Method ( STRING , java.lang.String .class ) ; new JpaQueryMethod ( java.lang.reflect.Method , org.springframework.data.jpa.repository.query.RepositoryMetadata , org.springframework.data.jpa.repository.query.ProjectionFactory , null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { JpaQueryMethod org.springframework.data.jpa.repository.query.JpaQueryMethod = org.springframework.data.jpa.repository.query.JpaQueryMethod ( UserRepository .class , STRING , java.lang.String .class ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . getName ( ) , is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { JpaQueryMethod org.springframework.data.jpa.repository.query.JpaQueryMethod = org.springframework.data.jpa.repository.query.JpaQueryMethod ( UserRepository .class , STRING , java.lang.String .class ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . getAnnotatedQuery ( ) , is ( nullValue ( ) ) ) ; org.springframework.data.jpa.repository.query.JpaQueryMethod = org.springframework.data.jpa.repository.query.JpaQueryMethod ( UserRepository .class , STRING , java.lang.String .class ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . getAnnotatedQuery ( ) , is ( notNullValue ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalStateException .class ) public void void ( ) { new JpaQueryMethod ( java.lang.reflect.Method , org.springframework.data.jpa.repository.query.RepositoryMetadata , org.springframework.data.jpa.repository.query.ProjectionFactory , org.springframework.data.jpa.repository.query.QueryExtractor ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalStateException .class ) public void void ( ) { new JpaQueryMethod ( java.lang.reflect.Method , org.springframework.data.jpa.repository.query.RepositoryMetadata , org.springframework.data.jpa.repository.query.ProjectionFactory , org.springframework.data.jpa.repository.query.QueryExtractor ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalStateException .class ) public void void ( ) { new JpaQueryMethod ( java.lang.reflect.Method , org.springframework.data.jpa.repository.query.RepositoryMetadata , org.springframework.data.jpa.repository.query.ProjectionFactory , org.springframework.data.jpa.repository.query.QueryExtractor ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalStateException .class ) public void void ( ) { new JpaQueryMethod ( java.lang.reflect.Method , org.springframework.data.jpa.repository.query.RepositoryMetadata , org.springframework.data.jpa.repository.query.ProjectionFactory , org.springframework.data.jpa.repository.query.QueryExtractor ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { JpaQueryMethod org.springframework.data.jpa.repository.query.JpaQueryMethod = org.springframework.data.jpa.repository.query.JpaQueryMethod ( UserRepository .class , STRING , java.lang.String .class ) ; assertTrue ( org.springframework.data.jpa.repository.query.JpaQueryMethod . isModifyingQuery ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.data.jpa.repository.query.JpaQueryMethodUnitTests.InvalidRepository .class . java.lang.reflect.Method ( STRING , java.lang.String .class , Pageable .class ) ; new JpaQueryMethod ( java.lang.reflect.Method , org.springframework.data.jpa.repository.query.RepositoryMetadata , org.springframework.data.jpa.repository.query.ProjectionFactory , org.springframework.data.jpa.repository.query.QueryExtractor ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.data.jpa.repository.query.JpaQueryMethodUnitTests.InvalidRepository .class . java.lang.reflect.Method ( STRING , java.lang.String .class , Sort .class ) ; new JpaQueryMethod ( java.lang.reflect.Method , org.springframework.data.jpa.repository.query.RepositoryMetadata , org.springframework.data.jpa.repository.query.ProjectionFactory , org.springframework.data.jpa.repository.query.QueryExtractor ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { JpaQueryMethod org.springframework.data.jpa.repository.query.JpaQueryMethod = org.springframework.data.jpa.repository.query.JpaQueryMethod ( UserRepository .class , STRING , java.lang.String .class ) ; java.util.List<org.springframework.data.jpa.repository.query.QueryHint> < QueryHint > java.util.List<org.springframework.data.jpa.repository.query.QueryHint> = org.springframework.data.jpa.repository.query.JpaQueryMethod . getHints ( ) ; assertNotNull ( java.util.List<org.springframework.data.jpa.repository.query.QueryHint> ) ; assertThat ( java.util.List<org.springframework.data.jpa.repository.query.QueryHint> . get ( NUMBER ) . name ( ) , is ( STRING ) ) ; assertThat ( java.util.List<org.springframework.data.jpa.repository.query.QueryHint> . get ( NUMBER ) . value ( ) , is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.data.jpa.repository.query.JpaQueryMethod org.springframework.data.jpa.repository.query.JpaQueryMethod ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.String java.lang.String , java.lang.Class<?> < ? > ... java.lang.Class<?>[] )			throws java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = java.lang.Class<> . java.lang.reflect.Method ( java.lang.String , java.lang.Class<?>[] ) ; DefaultRepositoryMetadata org.springframework.data.jpa.repository.query.DefaultRepositoryMetadata = new DefaultRepositoryMetadata ( java.lang.Class<> ) ; return new JpaQueryMethod ( java.lang.reflect.Method , org.springframework.data.jpa.repository.query.DefaultRepositoryMetadata , org.springframework.data.jpa.repository.query.ProjectionFactory , org.springframework.data.jpa.repository.query.QueryExtractor ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RepositoryMetadata org.springframework.data.jpa.repository.query.RepositoryMetadata = new DefaultRepositoryMetadata ( UserRepository .class ) ; JpaQueryMethod org.springframework.data.jpa.repository.query.JpaQueryMethod = org.springframework.data.jpa.repository.query.JpaQueryMethod ( UserRepository .class , STRING , java.lang.String .class ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . getNamedQueryName ( ) , is ( STRING ) ) ; java.lang.reflect.Method java.lang.reflect.Method = UserRepository .class . java.lang.reflect.Method ( STRING , java.lang.String .class ) ; org.springframework.data.jpa.repository.query.JpaQueryMethod = new JpaQueryMethod ( java.lang.reflect.Method , org.springframework.data.jpa.repository.query.RepositoryMetadata , org.springframework.data.jpa.repository.query.ProjectionFactory , org.springframework.data.jpa.repository.query.QueryExtractor ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . getNamedQueryName ( ) , is ( STRING ) ) ; java.lang.reflect.Method = UserRepository .class . java.lang.reflect.Method ( STRING , java.lang.String .class ) ; org.springframework.data.jpa.repository.query.JpaQueryMethod = new JpaQueryMethod ( java.lang.reflect.Method , org.springframework.data.jpa.repository.query.RepositoryMetadata , org.springframework.data.jpa.repository.query.ProjectionFactory , org.springframework.data.jpa.repository.query.QueryExtractor ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . getNamedQueryName ( ) , is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { JpaQueryMethod org.springframework.data.jpa.repository.query.JpaQueryMethod = org.springframework.data.jpa.repository.query.JpaQueryMethod ( org.springframework.data.jpa.repository.query.JpaQueryMethodUnitTests.ValidRepository .class , STRING , java.lang.String .class ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . isNativeQuery ( ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { JpaQueryMethod org.springframework.data.jpa.repository.query.JpaQueryMethod = org.springframework.data.jpa.repository.query.JpaQueryMethod ( org.springframework.data.jpa.repository.query.JpaQueryMethodUnitTests.ValidRepository .class , STRING ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . getNamedQueryName ( ) , is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { JpaQueryMethod org.springframework.data.jpa.repository.query.JpaQueryMethod = org.springframework.data.jpa.repository.query.JpaQueryMethod ( org.springframework.data.jpa.repository.query.JpaQueryMethodUnitTests.ValidRepository .class , STRING , java.lang.Integer .class ) ; LockModeType org.springframework.data.jpa.repository.query.LockModeType = org.springframework.data.jpa.repository.query.JpaQueryMethod . getLockModeType ( ) ; assertEquals ( LockModeType . PESSIMISTIC_WRITE , org.springframework.data.jpa.repository.query.LockModeType ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { JpaQueryMethod org.springframework.data.jpa.repository.query.JpaQueryMethod = org.springframework.data.jpa.repository.query.JpaQueryMethod ( UserRepository .class , STRING , java.lang.String .class ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . getNamedCountQueryName ( ) , is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { JpaQueryMethod org.springframework.data.jpa.repository.query.JpaQueryMethod = org.springframework.data.jpa.repository.query.JpaQueryMethod ( org.springframework.data.jpa.repository.query.JpaQueryMethodUnitTests.ValidRepository .class , STRING ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . getNamedCountQueryName ( ) , is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { try { org.springframework.data.jpa.repository.query.JpaQueryMethod ( org.springframework.data.jpa.repository.query.JpaQueryMethodUnitTests.InvalidRepository .class , STRING , java.lang.String .class ) ; fail ( ) ; } catch ( java.lang.IllegalStateException java.lang.IllegalStateException ) { assertThat ( java.lang.IllegalStateException . java.lang.String ( ) , containsString ( STRING ) ) ; assertThat ( java.lang.IllegalStateException . java.lang.String ( ) , containsString ( STRING ) ) ; assertThat ( java.lang.IllegalStateException . java.lang.String ( ) , containsString ( STRING ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( { STRING , STRING } ) public void void ( ) { when ( org.springframework.data.jpa.repository.query.RepositoryMetadata . getDomainType ( ) ) . thenReturn ( ( java.lang.Class ) User .class ) ; when ( org.springframework.data.jpa.repository.query.RepositoryMetadata . getReturnedDomainClass ( java.lang.reflect.Method ) ) . thenReturn ( ( java.lang.Class ) java.lang.Integer .class ) ; when ( org.springframework.data.jpa.repository.query.RepositoryMetadata . getReturnedDomainClass ( java.lang.reflect.Method ) ) . thenReturn ( ( java.lang.Class ) java.lang.Integer .class ) ; assertThat ( new JpaQueryMethod ( java.lang.reflect.Method , org.springframework.data.jpa.repository.query.RepositoryMetadata , org.springframework.data.jpa.repository.query.ProjectionFactory , org.springframework.data.jpa.repository.query.QueryExtractor ) . isQueryForEntity ( ) , is ( false ) ) ; assertThat ( new JpaQueryMethod ( java.lang.reflect.Method , org.springframework.data.jpa.repository.query.RepositoryMetadata , org.springframework.data.jpa.repository.query.ProjectionFactory , org.springframework.data.jpa.repository.query.QueryExtractor ) . isQueryForEntity ( ) , is ( false ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { JpaQueryMethod org.springframework.data.jpa.repository.query.JpaQueryMethod = org.springframework.data.jpa.repository.query.JpaQueryMethod ( org.springframework.data.jpa.repository.query.JpaQueryMethodUnitTests.ValidRepository .class , STRING ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . getLockModeType ( ) , is ( LockModeType . OPTIMISTIC_FORCE_INCREMENT ) ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . getHints ( ) , hasSize ( NUMBER ) ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . getHints ( ) . get ( NUMBER ) . name ( ) , is ( STRING ) ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . getHints ( ) . get ( NUMBER ) . value ( ) , is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { doReturn ( User .class ) . when ( org.springframework.data.jpa.repository.query.RepositoryMetadata ) . getDomainType ( ) ; doReturn ( User .class ) . when ( org.springframework.data.jpa.repository.query.RepositoryMetadata ) . getReturnedDomainClass ( java.lang.reflect.Method ) ; JpaQueryMethod org.springframework.data.jpa.repository.query.JpaQueryMethod = new JpaQueryMethod ( java.lang.reflect.Method , org.springframework.data.jpa.repository.query.RepositoryMetadata , org.springframework.data.jpa.repository.query.ProjectionFactory , org.springframework.data.jpa.repository.query.QueryExtractor ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . getEntityGraph ( ) , is ( notNullValue ( ) ) ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . getEntityGraph ( ) . getName ( ) , is ( STRING ) ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . getEntityGraph ( ) . getType ( ) , is ( EntityGraphType . LOAD ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { doReturn ( User .class ) . when ( org.springframework.data.jpa.repository.query.RepositoryMetadata ) . getDomainType ( ) ; doReturn ( User .class ) . when ( org.springframework.data.jpa.repository.query.RepositoryMetadata ) . getReturnedDomainClass ( ( java.lang.reflect.Method ) any ( ) ) ; JpaQueryMethod org.springframework.data.jpa.repository.query.JpaQueryMethod = new JpaQueryMethod ( org.springframework.data.jpa.repository.query.JpaQueryMethodUnitTests.JpaRepositoryOverride .class . java.lang.reflect.Method ( STRING ) , org.springframework.data.jpa.repository.query.RepositoryMetadata , org.springframework.data.jpa.repository.query.ProjectionFactory , org.springframework.data.jpa.repository.query.QueryExtractor ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . getEntityGraph ( ) , is ( notNullValue ( ) ) ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . getEntityGraph ( ) . getName ( ) , is ( STRING ) ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . getEntityGraph ( ) . getType ( ) , is ( EntityGraphType . FETCH ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { doReturn ( User .class ) . when ( org.springframework.data.jpa.repository.query.RepositoryMetadata ) . getDomainType ( ) ; doReturn ( User .class ) . when ( org.springframework.data.jpa.repository.query.RepositoryMetadata ) . getReturnedDomainClass ( ( java.lang.reflect.Method ) any ( ) ) ; JpaQueryMethod org.springframework.data.jpa.repository.query.JpaQueryMethod = new JpaQueryMethod ( org.springframework.data.jpa.repository.query.JpaQueryMethodUnitTests.JpaRepositoryOverride .class . java.lang.reflect.Method ( STRING , java.lang.Long .class ) , org.springframework.data.jpa.repository.query.RepositoryMetadata , org.springframework.data.jpa.repository.query.ProjectionFactory , org.springframework.data.jpa.repository.query.QueryExtractor ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . getEntityGraph ( ) , is ( notNullValue ( ) ) ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . getEntityGraph ( ) . getName ( ) , is ( STRING ) ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . getEntityGraph ( ) . getType ( ) , is ( EntityGraphType . FETCH ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { doReturn ( User .class ) . when ( org.springframework.data.jpa.repository.query.RepositoryMetadata ) . getDomainType ( ) ; doReturn ( User .class ) . when ( org.springframework.data.jpa.repository.query.RepositoryMetadata ) . getReturnedDomainClass ( ( java.lang.reflect.Method ) any ( ) ) ; JpaQueryMethod org.springframework.data.jpa.repository.query.JpaQueryMethod = new JpaQueryMethod ( org.springframework.data.jpa.repository.query.JpaQueryMethodUnitTests.JpaRepositoryOverride .class . java.lang.reflect.Method ( STRING , java.lang.Long .class ) , org.springframework.data.jpa.repository.query.RepositoryMetadata , org.springframework.data.jpa.repository.query.ProjectionFactory , org.springframework.data.jpa.repository.query.QueryExtractor ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . getEntityGraph ( ) , is ( notNullValue ( ) ) ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . getEntityGraph ( ) . getName ( ) , is ( STRING ) ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . getEntityGraph ( ) . getType ( ) , is ( EntityGraphType . FETCH ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.data.jpa.repository.query.JpaQueryMethod ( org.springframework.data.jpa.repository.query.JpaQueryMethodUnitTests.ValidRepository .class , STRING , java.lang.String .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { JpaQueryMethod org.springframework.data.jpa.repository.query.JpaQueryMethod = org.springframework.data.jpa.repository.query.JpaQueryMethod ( org.springframework.data.jpa.repository.query.JpaQueryMethodUnitTests.ValidRepository .class , STRING ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . getLockModeType ( ) , is ( LockModeType . PESSIMISTIC_FORCE_INCREMENT ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { JpaQueryMethod org.springframework.data.jpa.repository.query.JpaQueryMethod = org.springframework.data.jpa.repository.query.JpaQueryMethod ( org.springframework.data.jpa.repository.query.JpaQueryMethodUnitTests.ValidRepository .class , STRING ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . getHints ( ) , hasSize ( NUMBER ) ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . getHints ( ) . get ( NUMBER ) . name ( ) , is ( STRING ) ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . getHints ( ) . get ( NUMBER ) . value ( ) , is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { JpaQueryMethod org.springframework.data.jpa.repository.query.JpaQueryMethod = org.springframework.data.jpa.repository.query.JpaQueryMethod ( org.springframework.data.jpa.repository.query.JpaQueryMethodUnitTests.ValidRepository .class , STRING ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . applyHintsToCountQuery ( ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { JpaQueryMethod org.springframework.data.jpa.repository.query.JpaQueryMethod = org.springframework.data.jpa.repository.query.JpaQueryMethod ( org.springframework.data.jpa.repository.query.JpaQueryMethodUnitTests.ValidRepository .class , STRING ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . isModifyingQuery ( ) , is ( true ) ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . getClearAutomatically ( ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { JpaQueryMethod org.springframework.data.jpa.repository.query.JpaQueryMethod = org.springframework.data.jpa.repository.query.JpaQueryMethod ( org.springframework.data.jpa.repository.query.JpaQueryMethodUnitTests.ValidRepository .class , STRING ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . applyHintsToCountQuery ( ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { JpaQueryMethod org.springframework.data.jpa.repository.query.JpaQueryMethod = org.springframework.data.jpa.repository.query.JpaQueryMethod ( org.springframework.data.jpa.repository.query.JpaQueryMethodUnitTests.ValidRepository .class , STRING ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . getAnnotatedQuery ( ) , is ( equalTo ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { JpaQueryMethod org.springframework.data.jpa.repository.query.JpaQueryMethod = org.springframework.data.jpa.repository.query.JpaQueryMethod ( org.springframework.data.jpa.repository.query.JpaQueryMethodUnitTests.ValidRepository .class , STRING ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . getCountQuery ( ) , is ( equalTo ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { JpaQueryMethod org.springframework.data.jpa.repository.query.JpaQueryMethod = org.springframework.data.jpa.repository.query.JpaQueryMethod ( org.springframework.data.jpa.repository.query.JpaQueryMethodUnitTests.ValidRepository .class , STRING ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . getCountQueryProjection ( ) , is ( equalTo ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { JpaQueryMethod org.springframework.data.jpa.repository.query.JpaQueryMethod = org.springframework.data.jpa.repository.query.JpaQueryMethod ( org.springframework.data.jpa.repository.query.JpaQueryMethodUnitTests.ValidRepository .class , STRING ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . getNamedQueryName ( ) , is ( equalTo ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { JpaQueryMethod org.springframework.data.jpa.repository.query.JpaQueryMethod = org.springframework.data.jpa.repository.query.JpaQueryMethod ( org.springframework.data.jpa.repository.query.JpaQueryMethodUnitTests.ValidRepository .class , STRING ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . getNamedCountQueryName ( ) , is ( equalTo ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { JpaQueryMethod org.springframework.data.jpa.repository.query.JpaQueryMethod = org.springframework.data.jpa.repository.query.JpaQueryMethod ( org.springframework.data.jpa.repository.query.JpaQueryMethodUnitTests.ValidRepository .class , STRING ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . isNativeQuery ( ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { doReturn ( User .class ) . when ( org.springframework.data.jpa.repository.query.RepositoryMetadata ) . getDomainType ( ) ; doReturn ( User .class ) . when ( org.springframework.data.jpa.repository.query.RepositoryMetadata ) . getReturnedDomainClass ( ( java.lang.reflect.Method ) any ( ) ) ; JpaQueryMethod org.springframework.data.jpa.repository.query.JpaQueryMethod = new JpaQueryMethod ( org.springframework.data.jpa.repository.query.JpaQueryMethodUnitTests.JpaRepositoryOverride .class . java.lang.reflect.Method ( STRING ) , org.springframework.data.jpa.repository.query.RepositoryMetadata , org.springframework.data.jpa.repository.query.ProjectionFactory , org.springframework.data.jpa.repository.query.QueryExtractor ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . getEntityGraph ( ) , is ( notNullValue ( ) ) ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . getEntityGraph ( ) . getName ( ) , is ( STRING ) ) ; assertThat ( org.springframework.data.jpa.repository.query.JpaQueryMethod . getEntityGraph ( ) . getType ( ) , is ( EntityGraphType . LOAD ) ) ; }  <METHOD_END>
<METHOD_START> org.springframework.data.jpa.repository.query.User org.springframework.data.jpa.repository.query.User ( java.lang.String java.lang.String , Pageable org.springframework.data.jpa.repository.query.Pageable );  <METHOD_END>
<METHOD_START> org.springframework.data.jpa.repository.query.Page<org.springframework.data.jpa.repository.query.User> < User > org.springframework.data.jpa.repository.query.Page<org.springframework.data.jpa.repository.query.User> ( java.lang.String java.lang.String , Pageable org.springframework.data.jpa.repository.query.Pageable , Sort org.springframework.data.jpa.repository.query.Sort );  <METHOD_END>
<METHOD_START> org.springframework.data.jpa.repository.query.Page<org.springframework.data.jpa.repository.query.User> < User > org.springframework.data.jpa.repository.query.Page<org.springframework.data.jpa.repository.query.User> ( java.lang.String java.lang.String , Pageable org.springframework.data.jpa.repository.query.Pageable , Pageable org.springframework.data.jpa.repository.query.Pageable );  <METHOD_END>
<METHOD_START> org.springframework.data.jpa.repository.query.Page<org.springframework.data.jpa.repository.query.User> < User > org.springframework.data.jpa.repository.query.Page<org.springframework.data.jpa.repository.query.User> ( java.lang.String java.lang.String , Sort org.springframework.data.jpa.repository.query.Sort , Sort org.springframework.data.jpa.repository.query.Sort );  <METHOD_END>
<METHOD_START> @ Modifying void void ( java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> @ Modifying org.springframework.data.jpa.repository.query.Page<java.lang.String> < java.lang.String > org.springframework.data.jpa.repository.query.Page<java.lang.String> ( java.lang.String java.lang.String , Pageable org.springframework.data.jpa.repository.query.Pageable );  <METHOD_END>
<METHOD_START> @ Modifying void void ( java.lang.String java.lang.String , Sort org.springframework.data.jpa.repository.query.Sort );  <METHOD_END>
<METHOD_START> @ Query ( STRING ) java.util.List<org.springframework.data.jpa.repository.query.User> < User > java.util.List<org.springframework.data.jpa.repository.query.User> ( @ Param ( STRING ) java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> @ Query ( value = STRING , nativeQuery = true ) java.util.List<org.springframework.data.jpa.repository.query.User> < User > java.util.List<org.springframework.data.jpa.repository.query.User> ( java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> @ Query ( name = STRING ) java.util.List<org.springframework.data.jpa.repository.query.User> < User > java.util.List<org.springframework.data.jpa.repository.query.User> ( )  <METHOD_END>
<METHOD_START> @ Lock ( LockModeType . PESSIMISTIC_WRITE ) @ Query ( STRING ) java.util.List<org.springframework.data.jpa.repository.query.User> < User > java.util.List<org.springframework.data.jpa.repository.query.User> ( java.lang.Integer java.lang.Integer );  <METHOD_END>
<METHOD_START> java.util.List<java.lang.Integer> < java.lang.Integer > java.util.List<java.lang.Integer> ( )  <METHOD_END>
<METHOD_START> java.lang.Integer java.lang.Integer ( )  <METHOD_END>
<METHOD_START> @ org.springframework.data.jpa.repository.query.JpaQueryMethodUnitTests.CustomAnnotation void void ( )  <METHOD_END>
<METHOD_START> @ EntityGraph ( value = STRING , type = EntityGraphType . LOAD ) org.springframework.data.jpa.repository.query.User org.springframework.data.jpa.repository.query.User ( java.lang.Integer java.lang.Integer );  <METHOD_END>
<METHOD_START> @ Query ( STRING ) org.springframework.data.jpa.repository.query.User org.springframework.data.jpa.repository.query.User ( @ Param ( STRING ) java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> @ org.springframework.data.jpa.repository.query.JpaQueryMethodUnitTests.CustomComposedAnnotationWithAliasFor void void ( )  <METHOD_END>
<METHOD_START> @ java.lang.Override @ EntityGraph ( STRING ) java.util.List<org.springframework.data.jpa.repository.query.User> < User > java.util.List<org.springframework.data.jpa.repository.query.User> ( )  <METHOD_END>
<METHOD_START> @ EntityGraph ( STRING ) java.util.Optional<org.springframework.data.jpa.repository.query.User> < User > java.util.Optional<org.springframework.data.jpa.repository.query.User> ( java.lang.Long java.lang.Long );  <METHOD_END>
<METHOD_START> @ EntityGraph org.springframework.data.jpa.repository.query.User org.springframework.data.jpa.repository.query.User ( java.lang.Long java.lang.Long );  <METHOD_END>
<METHOD_START> @ org.springframework.data.jpa.repository.query.JpaQueryMethodUnitTests.CustomComposedEntityGraphAnnotationWithAliasFor org.springframework.data.jpa.repository.query.User org.springframework.data.jpa.repository.query.User ( )  <METHOD_END>