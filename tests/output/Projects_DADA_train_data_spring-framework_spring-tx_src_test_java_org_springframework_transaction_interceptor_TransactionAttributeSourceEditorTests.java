<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.transaction.interceptor.TransactionAttributeSourceEditor . setAsText ( null ) ; TransactionAttributeSource org.springframework.transaction.interceptor.TransactionAttributeSource = ( TransactionAttributeSource ) org.springframework.transaction.interceptor.TransactionAttributeSourceEditor . getValue ( ) ; java.lang.reflect.Method java.lang.reflect.Method = java.lang.Object .class . java.lang.reflect.Method ( STRING , ( java.lang.Class [] ) null ) ; assertNull ( org.springframework.transaction.interceptor.TransactionAttributeSource . getTransactionAttribute ( java.lang.reflect.Method , null ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { org.springframework.transaction.interceptor.TransactionAttributeSourceEditor . setAsText ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.transaction.interceptor.TransactionAttributeSourceEditor . setAsText ( STRING + STRING + STRING + STRING + STRING ) ; TransactionAttributeSource org.springframework.transaction.interceptor.TransactionAttributeSource = ( TransactionAttributeSource ) org.springframework.transaction.interceptor.TransactionAttributeSourceEditor . getValue ( ) ; void ( org.springframework.transaction.interceptor.TransactionAttributeSource , java.lang.Object .class . java.lang.reflect.Method ( STRING , ( java.lang.Class [] ) null ) , TransactionDefinition . PROPAGATION_REQUIRED ) ; void ( org.springframework.transaction.interceptor.TransactionAttributeSource , java.lang.Object .class . java.lang.reflect.Method ( STRING , new java.lang.Class [] { java.lang.Object .class } ) , TransactionDefinition . PROPAGATION_MANDATORY ) ; void ( org.springframework.transaction.interceptor.TransactionAttributeSource , java.lang.Object .class . java.lang.reflect.Method ( STRING , ( java.lang.Class [] ) null ) , TransactionDefinition . PROPAGATION_SUPPORTS ) ; void ( org.springframework.transaction.interceptor.TransactionAttributeSource , java.lang.Object .class . java.lang.reflect.Method ( STRING , new java.lang.Class [] { long .class } ) , TransactionDefinition . PROPAGATION_SUPPORTS ) ; void ( org.springframework.transaction.interceptor.TransactionAttributeSource , java.lang.Object .class . java.lang.reflect.Method ( STRING , new java.lang.Class [] { long .class , int .class } ) , TransactionDefinition . PROPAGATION_SUPPORTS ) ; void ( org.springframework.transaction.interceptor.TransactionAttributeSource , java.lang.Object .class . java.lang.reflect.Method ( STRING , ( java.lang.Class [] ) null ) , TransactionDefinition . PROPAGATION_SUPPORTS ) ; void ( org.springframework.transaction.interceptor.TransactionAttributeSource , java.lang.Object .class . java.lang.reflect.Method ( STRING , ( java.lang.Class [] ) null ) , TransactionDefinition . PROPAGATION_REQUIRED ) ; void ( org.springframework.transaction.interceptor.TransactionAttributeSource , java.lang.Object .class . java.lang.reflect.Method ( STRING , ( java.lang.Class [] ) null ) , - NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.transaction.interceptor.TransactionAttributeSourceEditor . setAsText ( STRING ) ; TransactionAttributeSource org.springframework.transaction.interceptor.TransactionAttributeSource = ( TransactionAttributeSource ) org.springframework.transaction.interceptor.TransactionAttributeSourceEditor . getValue ( ) ; void ( org.springframework.transaction.interceptor.TransactionAttributeSource , java.lang.Object .class . java.lang.reflect.Method ( STRING , ( java.lang.Class [] ) null ) , TransactionDefinition . PROPAGATION_REQUIRED ) ; void ( org.springframework.transaction.interceptor.TransactionAttributeSource , java.lang.Object .class . java.lang.reflect.Method ( STRING , new java.lang.Class [] { java.lang.Object .class } ) , TransactionDefinition . PROPAGATION_REQUIRED ) ; void ( org.springframework.transaction.interceptor.TransactionAttributeSource , java.lang.Object .class . java.lang.reflect.Method ( STRING , ( java.lang.Class [] ) null ) , TransactionDefinition . PROPAGATION_REQUIRED ) ; void ( org.springframework.transaction.interceptor.TransactionAttributeSource , java.lang.Object .class . java.lang.reflect.Method ( STRING , new java.lang.Class [] { long .class } ) , TransactionDefinition . PROPAGATION_REQUIRED ) ; void ( org.springframework.transaction.interceptor.TransactionAttributeSource , java.lang.Object .class . java.lang.reflect.Method ( STRING , new java.lang.Class [] { long .class , int .class } ) , TransactionDefinition . PROPAGATION_REQUIRED ) ; void ( org.springframework.transaction.interceptor.TransactionAttributeSource , java.lang.Object .class . java.lang.reflect.Method ( STRING , ( java.lang.Class [] ) null ) , TransactionDefinition . PROPAGATION_REQUIRED ) ; void ( org.springframework.transaction.interceptor.TransactionAttributeSource , java.lang.Object .class . java.lang.reflect.Method ( STRING , ( java.lang.Class [] ) null ) , TransactionDefinition . PROPAGATION_REQUIRED ) ; void ( org.springframework.transaction.interceptor.TransactionAttributeSource , java.lang.Object .class . java.lang.reflect.Method ( STRING , ( java.lang.Class [] ) null ) , TransactionDefinition . PROPAGATION_REQUIRED ) ; }  <METHOD_END>
<METHOD_START> private void void ( TransactionAttributeSource org.springframework.transaction.interceptor.TransactionAttributeSource , java.lang.reflect.Method java.lang.reflect.Method , int int ) { TransactionAttribute org.springframework.transaction.interceptor.TransactionAttribute = org.springframework.transaction.interceptor.TransactionAttributeSource . getTransactionAttribute ( java.lang.reflect.Method , null ) ; if ( int >= NUMBER ) { assertNotNull ( org.springframework.transaction.interceptor.TransactionAttribute ) ; assertEquals ( TransactionDefinition . ISOLATION_DEFAULT , org.springframework.transaction.interceptor.TransactionAttribute . getIsolationLevel ( ) ) ; assertEquals ( int , org.springframework.transaction.interceptor.TransactionAttribute . getPropagationBehavior ( ) ) ; } else { assertNull ( org.springframework.transaction.interceptor.TransactionAttribute ) ; } }  <METHOD_END>