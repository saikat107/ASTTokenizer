<METHOD_START> public void ( ListableBeanFactory org.springframework.data.repository.core.support.ListableBeanFactory ) { Assert . notNull ( org.springframework.data.repository.core.support.ListableBeanFactory , STRING ) ; this . org.springframework.data.repository.core.support.PersistenceExceptionTranslationInterceptor = new PersistenceExceptionTranslationInterceptor ( ) ; this . org.springframework.data.repository.core.support.PersistenceExceptionTranslationInterceptor . setBeanFactory ( org.springframework.data.repository.core.support.ListableBeanFactory ) ; this . org.springframework.data.repository.core.support.PersistenceExceptionTranslationInterceptor . afterPropertiesSet ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( ProxyFactory org.springframework.data.repository.core.support.ProxyFactory , RepositoryInformation org.springframework.data.repository.core.support.RepositoryInformation ) { org.springframework.data.repository.core.support.ProxyFactory . addAdvice ( org.springframework.data.repository.core.support.PersistenceExceptionTranslationInterceptor ) ; }  <METHOD_END>