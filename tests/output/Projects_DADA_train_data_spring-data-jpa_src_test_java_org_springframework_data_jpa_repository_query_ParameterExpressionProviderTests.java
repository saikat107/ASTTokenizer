<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.data.jpa.repository.query.ParameterExpressionProviderTests.SampleRepository .class . java.lang.reflect.Method ( STRING , int .class ) ; Parameters < ? , ? > org.springframework.data.jpa.repository.query.Parameters<?,?> = new DefaultParameters ( java.lang.reflect.Method ) ; ParametersParameterAccessor org.springframework.data.jpa.repository.query.ParametersParameterAccessor = new ParametersParameterAccessor ( org.springframework.data.jpa.repository.query.Parameters<,> , new java.lang.Object [] { NUMBER } ) ; Part org.springframework.data.jpa.repository.query.Part = new Part ( STRING , User .class ) ; CriteriaBuilder org.springframework.data.jpa.repository.query.CriteriaBuilder = org.springframework.data.jpa.repository.query.EntityManager . getCriteriaBuilder ( ) ; PersistenceProvider org.springframework.data.jpa.repository.query.PersistenceProvider = PersistenceProvider . fromEntityManager ( org.springframework.data.jpa.repository.query.EntityManager ) ; ParameterMetadataProvider org.springframework.data.jpa.repository.query.ParameterMetadataProvider = new ParameterMetadataProvider ( org.springframework.data.jpa.repository.query.CriteriaBuilder , org.springframework.data.jpa.repository.query.ParametersParameterAccessor , org.springframework.data.jpa.repository.query.PersistenceProvider ) ; ParameterExpression < ? extends java.lang.Comparable > org.springframework.data.jpa.repository.query.ParameterExpression<? extends java.lang.Comparable> = org.springframework.data.jpa.repository.query.ParameterMetadataProvider . next ( org.springframework.data.jpa.repository.query.Part , java.lang.Comparable .class ) . getExpression ( ) ; assertThat ( org.springframework.data.jpa.repository.query.ParameterExpression<> . getParameterType ( ) , is ( typeCompatibleWith ( int .class ) ) ) ; }  <METHOD_END>
<METHOD_START> org.springframework.data.jpa.repository.query.User org.springframework.data.jpa.repository.query.User ( int int );  <METHOD_END>