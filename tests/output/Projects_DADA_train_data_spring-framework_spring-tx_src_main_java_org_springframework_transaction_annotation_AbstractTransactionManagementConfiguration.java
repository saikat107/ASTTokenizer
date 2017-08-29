<METHOD_START> @ java.lang.Override public void void ( AnnotationMetadata org.springframework.transaction.annotation.AnnotationMetadata ) { this . org.springframework.transaction.annotation.AnnotationAttributes = AnnotationAttributes . fromMap ( org.springframework.transaction.annotation.AnnotationMetadata . getAnnotationAttributes ( EnableTransactionManagement .class . java.lang.String ( ) , false ) ) ; if ( this . org.springframework.transaction.annotation.AnnotationAttributes == null ) { throw new java.lang.IllegalArgumentException ( STRING + org.springframework.transaction.annotation.AnnotationMetadata . getClassName ( ) ) ; } }  <METHOD_END>
<METHOD_START> @ Autowired ( required = false ) void void ( java.util.Collection<org.springframework.transaction.annotation.TransactionManagementConfigurer> < TransactionManagementConfigurer > java.util.Collection<org.springframework.transaction.annotation.TransactionManagementConfigurer> ) { if ( CollectionUtils . isEmpty ( java.util.Collection<org.springframework.transaction.annotation.TransactionManagementConfigurer> ) ) { return; } if ( java.util.Collection<org.springframework.transaction.annotation.TransactionManagementConfigurer> . size ( ) > NUMBER ) { throw new java.lang.IllegalStateException ( STRING ) ; } TransactionManagementConfigurer org.springframework.transaction.annotation.TransactionManagementConfigurer = java.util.Collection<org.springframework.transaction.annotation.TransactionManagementConfigurer> . iterator ( ) . next ( ) ; this . org.springframework.transaction.annotation.PlatformTransactionManager = org.springframework.transaction.annotation.TransactionManagementConfigurer . annotationDrivenTransactionManager ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean ( name = TransactionManagementConfigUtils . TRANSACTIONAL_EVENT_LISTENER_FACTORY_BEAN_NAME ) @ Role ( BeanDefinition . ROLE_INFRASTRUCTURE ) public org.springframework.transaction.annotation.TransactionalEventListenerFactory org.springframework.transaction.annotation.TransactionalEventListenerFactory ( ) { return new TransactionalEventListenerFactory ( ) ; }  <METHOD_END>