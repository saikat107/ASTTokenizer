<METHOD_START> @ Test public void void ( ) java.lang.SecurityException , java.lang.NoSuchMethodException { CustomAnnotationTransactionAttributeSource org.springframework.data.repository.core.support.CustomAnnotationTransactionAttributeSource = new TransactionalRepositoryProxyPostProcessor . TransactionalRepositoryProxyPostProcessor ( ) ; TransactionAttribute org.springframework.data.repository.core.support.TransactionAttribute = org.springframework.data.repository.core.support.CustomAnnotationTransactionAttributeSource . getTransactionAttribute ( org.springframework.data.repository.core.support.CustomAnnotationTransactionAttributeSourceUnitTests.Bar .class . java.lang.reflect.Method ( STRING , java.lang.Object .class ) , org.springframework.data.repository.core.support.CustomAnnotationTransactionAttributeSourceUnitTests.FooImpl .class ) ; assertThat ( org.springframework.data.repository.core.support.TransactionAttribute . isReadOnly ( ) ) . isFalse ( ) ; org.springframework.data.repository.core.support.TransactionAttribute = org.springframework.data.repository.core.support.CustomAnnotationTransactionAttributeSource . getTransactionAttribute ( org.springframework.data.repository.core.support.CustomAnnotationTransactionAttributeSourceUnitTests.Bar .class . java.lang.reflect.Method ( STRING ) , org.springframework.data.repository.core.support.CustomAnnotationTransactionAttributeSourceUnitTests.FooImpl .class ) ; assertThat ( org.springframework.data.repository.core.support.TransactionAttribute . isReadOnly ( ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> void void ( )  <METHOD_END>
<METHOD_START> void void ( T T );  <METHOD_END>
<METHOD_START> @ Transactional public void void ( ) {		}  <METHOD_END>
<METHOD_START> public void void ( java.lang.Object java.lang.Object ) {		}  <METHOD_END>
<METHOD_START> @ Transactional void void ( java.lang.Object java.lang.Object );  <METHOD_END>