<METHOD_START> public void void ( ) { final JpaOperations org.springframework.integration.jpa.core.JpaOperations = org.springframework.integration.jpa.core.JpaOperations ( org.springframework.integration.jpa.core.EntityManager ) ; final java.util.List<?> < ? > java.util.List<?> = org.springframework.integration.jpa.core.JpaOperations . getResultListForClass ( StudentDomain .class , NUMBER , NUMBER ) ; Assert . assertTrue ( java.util.List<> . int ( ) == NUMBER ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { final JpaOperations org.springframework.integration.jpa.core.JpaOperations = org.springframework.integration.jpa.core.JpaOperations ( org.springframework.integration.jpa.core.EntityManager ) ; final java.util.List<?> < ? > java.util.List<?> = org.springframework.integration.jpa.core.JpaOperations . getResultListForClass ( StudentDomain .class , NUMBER , NUMBER ) ; Assert . assertTrue ( java.lang.String . java.lang.String ( STRING , java.util.List<> . int ( ) ) , java.util.List<> . int ( ) == NUMBER ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { final JpaOperations org.springframework.integration.jpa.core.JpaOperations = org.springframework.integration.jpa.core.JpaOperations ( org.springframework.integration.jpa.core.EntityManager ) ; final StudentDomain org.springframework.integration.jpa.core.StudentDomain = JpaTestUtils . getTestStudent ( ) ; java.util.List<?> < ? > java.util.List<?> = org.springframework.integration.jpa.core.JpaOperations . getResultListForClass ( StudentDomain .class , NUMBER , NUMBER ) ; Assert . assertTrue ( java.util.List<> . int ( ) == NUMBER ) ; ParameterSourceFactory org.springframework.integration.jpa.core.ParameterSourceFactory = new ExpressionEvaluatingParameterSourceFactory ( mock ( BeanFactory .class ) ) ; ParameterSource org.springframework.integration.jpa.core.ParameterSource = org.springframework.integration.jpa.core.ParameterSourceFactory . createParameterSource ( org.springframework.integration.jpa.core.StudentDomain ) ; int int = org.springframework.integration.jpa.core.JpaOperations . executeUpdate ( STRING + STRING + STRING , org.springframework.integration.jpa.core.ParameterSource ) ; org.springframework.integration.jpa.core.EntityManager . flush ( ) ; Assert . assertTrue ( NUMBER == int ) ; Assert . assertNull ( org.springframework.integration.jpa.core.StudentDomain . getRollNumber ( ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { final JpaOperations org.springframework.integration.jpa.core.JpaOperations = org.springframework.integration.jpa.core.JpaOperations ( org.springframework.integration.jpa.core.EntityManager ) ; final StudentDomain org.springframework.integration.jpa.core.StudentDomain = JpaTestUtils . getTestStudent ( ) ; ParameterSourceFactory org.springframework.integration.jpa.core.ParameterSourceFactory = new ExpressionEvaluatingParameterSourceFactory ( mock ( BeanFactory .class ) ) ; ParameterSource org.springframework.integration.jpa.core.ParameterSource = org.springframework.integration.jpa.core.ParameterSourceFactory . createParameterSource ( org.springframework.integration.jpa.core.StudentDomain ) ; int int = org.springframework.integration.jpa.core.JpaOperations . executeUpdateWithNamedQuery ( STRING , org.springframework.integration.jpa.core.ParameterSource ) ; org.springframework.integration.jpa.core.EntityManager . flush ( ) ; Assert . assertTrue ( NUMBER == int ) ; Assert . assertNull ( org.springframework.integration.jpa.core.StudentDomain . getRollNumber ( ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { final JpaOperations org.springframework.integration.jpa.core.JpaOperations = org.springframework.integration.jpa.core.JpaOperations ( org.springframework.integration.jpa.core.EntityManager ) ; final StudentDomain org.springframework.integration.jpa.core.StudentDomain = JpaTestUtils . getTestStudent ( ) ; ExpressionEvaluatingParameterSourceFactory org.springframework.integration.jpa.core.ExpressionEvaluatingParameterSourceFactory = new ExpressionEvaluatingParameterSourceFactory ( mock ( BeanFactory .class ) ) ; ParameterSource org.springframework.integration.jpa.core.ParameterSource = org.springframework.integration.jpa.core.ExpressionEvaluatingParameterSourceFactory . createParameterSource ( org.springframework.integration.jpa.core.StudentDomain ) ; int int = org.springframework.integration.jpa.core.JpaOperations . executeUpdateWithNativeQuery ( STRING + STRING + STRING , org.springframework.integration.jpa.core.ParameterSource ) ; org.springframework.integration.jpa.core.EntityManager . flush ( ) ; Assert . assertTrue ( NUMBER == int ) ; Assert . assertNull ( org.springframework.integration.jpa.core.StudentDomain . getRollNumber ( ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) java.text.ParseException { final JpaOperations org.springframework.integration.jpa.core.JpaOperations = org.springframework.integration.jpa.core.JpaOperations ( org.springframework.integration.jpa.core.EntityManager ) ; java.lang.String java.lang.String = STRING ; java.lang.Class<?> < ? > java.lang.Class<?> = StudentDomain .class ; java.util.List<?> < ? > java.util.List<?> = org.springframework.integration.jpa.core.JpaOperations . getResultListForNativeQuery ( java.lang.String , java.lang.Class<> , null , NUMBER , NUMBER ) ; Assert . assertTrue ( java.util.List<> . int ( ) == NUMBER ) ; StudentDomain org.springframework.integration.jpa.core.StudentDomain = ( StudentDomain ) java.util.List<> . java.util.Iterator<> ( ) . next ( ) ; java.text.SimpleDateFormat java.text.SimpleDateFormat = new java.text.SimpleDateFormat ( STRING ) ; assertEquals ( java.text.SimpleDateFormat . java.util.Date ( STRING ) , org.springframework.integration.jpa.core.StudentDomain . getDateOfBirth ( ) ) ; assertEquals ( STRING , org.springframework.integration.jpa.core.StudentDomain . getFirstName ( ) ) ; assertEquals ( Gender . MALE , org.springframework.integration.jpa.core.StudentDomain . getGender ( ) ) ; assertEquals ( STRING , org.springframework.integration.jpa.core.StudentDomain . getLastName ( ) ) ; assertNotNull ( org.springframework.integration.jpa.core.StudentDomain . getLastUpdated ( ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) java.text.ParseException { final JpaOperations org.springframework.integration.jpa.core.JpaOperations = org.springframework.integration.jpa.core.JpaOperations ( org.springframework.integration.jpa.core.EntityManager ) ; java.lang.String java.lang.String = STRING + STRING ; java.util.List<?> < ? > java.util.List<?> = org.springframework.integration.jpa.core.JpaOperations . getResultListForNativeQuery ( java.lang.String , null , null , NUMBER , NUMBER ) ; Assert . assertTrue ( java.util.List<> . int ( ) == NUMBER ) ; java.lang.Object [] java.lang.Object[] = ( java.lang.Object [] ) java.util.List<> . java.util.Iterator<> ( ) . next ( ) ; java.text.SimpleDateFormat java.text.SimpleDateFormat = new java.text.SimpleDateFormat ( STRING ) ; assertNotNull ( java.lang.Object[] [ NUMBER ] ) ; assertEquals ( STRING , java.lang.Object[] [ NUMBER ] ) ; assertEquals ( STRING , java.lang.Object[] [ NUMBER ] ) ; assertEquals ( STRING , java.lang.Object[] [ NUMBER ] ) ; assertEquals ( java.text.SimpleDateFormat . java.util.Date ( STRING ) , java.lang.Object[] [ NUMBER ] ) ; assertNotNull ( java.lang.Object[] [ NUMBER ] ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { final JpaOperations org.springframework.integration.jpa.core.JpaOperations = org.springframework.integration.jpa.core.JpaOperations ( org.springframework.integration.jpa.core.EntityManager ) ; final StudentDomain org.springframework.integration.jpa.core.StudentDomain = JpaTestUtils . getTestStudent ( ) ; ParameterSourceFactory org.springframework.integration.jpa.core.ParameterSourceFactory = new ExpressionEvaluatingParameterSourceFactory ( mock ( BeanFactory .class ) ) ; ParameterSource org.springframework.integration.jpa.core.ParameterSource = org.springframework.integration.jpa.core.ParameterSourceFactory . createParameterSource ( org.springframework.integration.jpa.core.StudentDomain ) ; int int = org.springframework.integration.jpa.core.JpaOperations . executeUpdateWithNamedQuery ( STRING , org.springframework.integration.jpa.core.ParameterSource ) ; org.springframework.integration.jpa.core.EntityManager . flush ( ) ; Assert . assertTrue ( NUMBER == int ) ; Assert . assertNull ( org.springframework.integration.jpa.core.StudentDomain . getRollNumber ( ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { final JpaOperations org.springframework.integration.jpa.core.JpaOperations = org.springframework.integration.jpa.core.JpaOperations ( org.springframework.integration.jpa.core.EntityManager ) ; final StudentDomain org.springframework.integration.jpa.core.StudentDomain = JpaTestUtils . getTestStudent ( ) ; Assert . assertNull ( org.springframework.integration.jpa.core.StudentDomain . getRollNumber ( ) ) ; final StudentDomain org.springframework.integration.jpa.core.StudentDomain = ( StudentDomain ) org.springframework.integration.jpa.core.JpaOperations . merge ( org.springframework.integration.jpa.core.StudentDomain ) ; org.springframework.integration.jpa.core.EntityManager . flush ( ) ; Assert . assertNull ( org.springframework.integration.jpa.core.StudentDomain . getRollNumber ( ) ) ; Assert . assertNotNull ( org.springframework.integration.jpa.core.StudentDomain ) ; Assert . assertNotNull ( org.springframework.integration.jpa.core.StudentDomain . getRollNumber ( ) ) ; Assert . assertTrue ( org.springframework.integration.jpa.core.StudentDomain != org.springframework.integration.jpa.core.StudentDomain ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { final JpaOperations org.springframework.integration.jpa.core.JpaOperations = org.springframework.integration.jpa.core.JpaOperations ( org.springframework.integration.jpa.core.EntityManager ) ; final StudentDomain org.springframework.integration.jpa.core.StudentDomain = JpaTestUtils . getTestStudent ( ) ; final StudentDomain org.springframework.integration.jpa.core.StudentDomain = JpaTestUtils . getTestStudent ( ) ; final StudentDomain org.springframework.integration.jpa.core.StudentDomain = JpaTestUtils . getTestStudent ( ) ; org.springframework.integration.jpa.core.StudentDomain . setFirstName ( STRING ) ; org.springframework.integration.jpa.core.StudentDomain . setFirstName ( STRING ) ; org.springframework.integration.jpa.core.StudentDomain . setFirstName ( STRING ) ; java.util.List<org.springframework.integration.jpa.core.StudentDomain> < StudentDomain > java.util.List<org.springframework.integration.jpa.core.StudentDomain> = new java.util.ArrayList<org.springframework.integration.jpa.core.StudentDomain> < StudentDomain > ( NUMBER ) ; java.util.List<org.springframework.integration.jpa.core.StudentDomain> . add ( org.springframework.integration.jpa.core.StudentDomain ) ; java.util.List<org.springframework.integration.jpa.core.StudentDomain> . add ( org.springframework.integration.jpa.core.StudentDomain ) ; java.util.List<org.springframework.integration.jpa.core.StudentDomain> . add ( org.springframework.integration.jpa.core.StudentDomain ) ; Assert . assertNull ( org.springframework.integration.jpa.core.StudentDomain . getRollNumber ( ) ) ; Assert . assertNull ( org.springframework.integration.jpa.core.StudentDomain . getRollNumber ( ) ) ; Assert . assertNull ( org.springframework.integration.jpa.core.StudentDomain . getRollNumber ( ) ) ; java.lang.Object java.lang.Object = org.springframework.integration.jpa.core.JpaOperations . merge ( java.util.List<org.springframework.integration.jpa.core.StudentDomain> , NUMBER , true ) ; Assert . assertTrue ( java.lang.Object instanceof java.util.List<?> < ? > ) ; @ java.lang.SuppressWarnings ( STRING ) java.util.List<org.springframework.integration.jpa.core.StudentDomain> < StudentDomain > java.util.List<org.springframework.integration.jpa.core.StudentDomain> = ( java.util.List<org.springframework.integration.jpa.core.StudentDomain> < StudentDomain > ) java.lang.Object ; Assert . assertNotNull ( java.util.List<org.springframework.integration.jpa.core.StudentDomain> . get ( NUMBER ) . getRollNumber ( ) ) ; Assert . assertNotNull ( java.util.List<org.springframework.integration.jpa.core.StudentDomain> . get ( NUMBER ) . getRollNumber ( ) ) ; Assert . assertNotNull ( java.util.List<org.springframework.integration.jpa.core.StudentDomain> . get ( NUMBER ) . getRollNumber ( ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { final JpaOperations org.springframework.integration.jpa.core.JpaOperations = org.springframework.integration.jpa.core.JpaOperations ( org.springframework.integration.jpa.core.EntityManager ) ; try { org.springframework.integration.jpa.core.JpaOperations . merge ( null ) ; } catch ( java.lang.IllegalArgumentException java.lang.IllegalArgumentException ) { Assert . assertEquals ( STRING , java.lang.IllegalArgumentException . java.lang.String ( ) ) ; return; } Assert . fail ( STRING ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { final JpaOperations org.springframework.integration.jpa.core.JpaOperations = org.springframework.integration.jpa.core.JpaOperations ( org.springframework.integration.jpa.core.EntityManager ) ; final java.util.List<?> < ? > java.util.List<?> = org.springframework.integration.jpa.core.JpaOperations . getResultListForClass ( StudentDomain .class , NUMBER , NUMBER ) ; Assert . assertEquals ( NUMBER , java.util.List<> . int ( ) ) ; final StudentDomain org.springframework.integration.jpa.core.StudentDomain = JpaTestUtils . getTestStudent ( ) ; final StudentDomain org.springframework.integration.jpa.core.StudentDomain = null ; final StudentDomain org.springframework.integration.jpa.core.StudentDomain = JpaTestUtils . getTestStudent ( ) ; org.springframework.integration.jpa.core.StudentDomain . setFirstName ( STRING ) ; org.springframework.integration.jpa.core.StudentDomain . setFirstName ( STRING ) ; java.util.List<org.springframework.integration.jpa.core.StudentDomain> < StudentDomain > java.util.List<org.springframework.integration.jpa.core.StudentDomain> = new java.util.ArrayList<org.springframework.integration.jpa.core.StudentDomain> < StudentDomain > ( NUMBER ) ; java.util.List<org.springframework.integration.jpa.core.StudentDomain> . add ( org.springframework.integration.jpa.core.StudentDomain ) ; java.util.List<org.springframework.integration.jpa.core.StudentDomain> . add ( org.springframework.integration.jpa.core.StudentDomain ) ; java.util.List<org.springframework.integration.jpa.core.StudentDomain> . add ( org.springframework.integration.jpa.core.StudentDomain ) ; Assert . assertNull ( org.springframework.integration.jpa.core.StudentDomain . getRollNumber ( ) ) ; Assert . assertNull ( org.springframework.integration.jpa.core.StudentDomain ) ; Assert . assertNull ( org.springframework.integration.jpa.core.StudentDomain . getRollNumber ( ) ) ; java.lang.Object java.lang.Object = org.springframework.integration.jpa.core.JpaOperations . merge ( java.util.List<org.springframework.integration.jpa.core.StudentDomain> ) ; org.springframework.integration.jpa.core.EntityManager . flush ( ) ; Assert . assertTrue ( java.lang.Object instanceof java.util.List<?> < ? > ) ; @ java.lang.SuppressWarnings ( STRING ) java.util.List<org.springframework.integration.jpa.core.StudentDomain> < StudentDomain > java.util.List<org.springframework.integration.jpa.core.StudentDomain> = ( java.util.List<org.springframework.integration.jpa.core.StudentDomain> < StudentDomain > ) java.lang.Object ; Assert . assertNotNull ( java.util.List<org.springframework.integration.jpa.core.StudentDomain> . get ( NUMBER ) . getRollNumber ( ) ) ; Assert . assertNotNull ( java.util.List<org.springframework.integration.jpa.core.StudentDomain> . get ( NUMBER ) . getRollNumber ( ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { final JpaOperations org.springframework.integration.jpa.core.JpaOperations = org.springframework.integration.jpa.core.JpaOperations ( org.springframework.integration.jpa.core.EntityManager ) ; final StudentDomain org.springframework.integration.jpa.core.StudentDomain = JpaTestUtils . getTestStudent ( ) ; Assert . assertNull ( org.springframework.integration.jpa.core.StudentDomain . getRollNumber ( ) ) ; org.springframework.integration.jpa.core.JpaOperations . persist ( org.springframework.integration.jpa.core.StudentDomain , NUMBER , false ) ; Assert . assertNotNull ( org.springframework.integration.jpa.core.StudentDomain . getRollNumber ( ) ) ; assertTrue ( org.springframework.integration.jpa.core.EntityManager . contains ( org.springframework.integration.jpa.core.StudentDomain ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { final JpaOperations org.springframework.integration.jpa.core.JpaOperations = org.springframework.integration.jpa.core.JpaOperations ( org.springframework.integration.jpa.core.EntityManager ) ; final StudentDomain org.springframework.integration.jpa.core.StudentDomain = JpaTestUtils . getTestStudent ( ) ; final StudentDomain org.springframework.integration.jpa.core.StudentDomain = JpaTestUtils . getTestStudent ( ) ; final StudentDomain org.springframework.integration.jpa.core.StudentDomain = JpaTestUtils . getTestStudent ( ) ; org.springframework.integration.jpa.core.StudentDomain . setFirstName ( STRING ) ; org.springframework.integration.jpa.core.StudentDomain . setFirstName ( STRING ) ; org.springframework.integration.jpa.core.StudentDomain . setFirstName ( STRING ) ; java.util.List<org.springframework.integration.jpa.core.StudentDomain> < StudentDomain > java.util.List<org.springframework.integration.jpa.core.StudentDomain> = new java.util.ArrayList<org.springframework.integration.jpa.core.StudentDomain> < StudentDomain > ( NUMBER ) ; java.util.List<org.springframework.integration.jpa.core.StudentDomain> . add ( org.springframework.integration.jpa.core.StudentDomain ) ; java.util.List<org.springframework.integration.jpa.core.StudentDomain> . add ( org.springframework.integration.jpa.core.StudentDomain ) ; java.util.List<org.springframework.integration.jpa.core.StudentDomain> . add ( org.springframework.integration.jpa.core.StudentDomain ) ; Assert . assertNull ( org.springframework.integration.jpa.core.StudentDomain . getRollNumber ( ) ) ; Assert . assertNull ( org.springframework.integration.jpa.core.StudentDomain . getRollNumber ( ) ) ; Assert . assertNull ( org.springframework.integration.jpa.core.StudentDomain . getRollNumber ( ) ) ; org.springframework.integration.jpa.core.JpaOperations . persist ( java.util.List<org.springframework.integration.jpa.core.StudentDomain> , NUMBER , true ) ; Assert . assertNotNull ( org.springframework.integration.jpa.core.StudentDomain . getRollNumber ( ) ) ; Assert . assertNotNull ( org.springframework.integration.jpa.core.StudentDomain . getRollNumber ( ) ) ; Assert . assertNotNull ( org.springframework.integration.jpa.core.StudentDomain . getRollNumber ( ) ) ; assertFalse ( org.springframework.integration.jpa.core.EntityManager . contains ( org.springframework.integration.jpa.core.StudentDomain ) ) ; assertFalse ( org.springframework.integration.jpa.core.EntityManager . contains ( org.springframework.integration.jpa.core.StudentDomain ) ) ; assertFalse ( org.springframework.integration.jpa.core.EntityManager . contains ( org.springframework.integration.jpa.core.StudentDomain ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { final JpaOperations org.springframework.integration.jpa.core.JpaOperations = org.springframework.integration.jpa.core.JpaOperations ( org.springframework.integration.jpa.core.EntityManager ) ; try { org.springframework.integration.jpa.core.JpaOperations . persist ( null ) ; } catch ( java.lang.IllegalArgumentException java.lang.IllegalArgumentException ) { Assert . assertEquals ( STRING , java.lang.IllegalArgumentException . java.lang.String ( ) ) ; return; } Assert . fail ( STRING ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { final JpaOperations org.springframework.integration.jpa.core.JpaOperations = org.springframework.integration.jpa.core.JpaOperations ( org.springframework.integration.jpa.core.EntityManager ) ; final java.util.List<?> < ? > java.util.List<?> = org.springframework.integration.jpa.core.JpaOperations . getResultListForClass ( StudentDomain .class , NUMBER , NUMBER ) ; Assert . assertEquals ( NUMBER , java.util.List<> . int ( ) ) ; final StudentDomain org.springframework.integration.jpa.core.StudentDomain = JpaTestUtils . getTestStudent ( ) ; final StudentDomain org.springframework.integration.jpa.core.StudentDomain = null ; final StudentDomain org.springframework.integration.jpa.core.StudentDomain = JpaTestUtils . getTestStudent ( ) ; org.springframework.integration.jpa.core.StudentDomain . setFirstName ( STRING ) ; org.springframework.integration.jpa.core.StudentDomain . setFirstName ( STRING ) ; java.util.List<org.springframework.integration.jpa.core.StudentDomain> < StudentDomain > java.util.List<org.springframework.integration.jpa.core.StudentDomain> = new java.util.ArrayList<org.springframework.integration.jpa.core.StudentDomain> < StudentDomain > ( NUMBER ) ; java.util.List<org.springframework.integration.jpa.core.StudentDomain> . add ( org.springframework.integration.jpa.core.StudentDomain ) ; java.util.List<org.springframework.integration.jpa.core.StudentDomain> . add ( org.springframework.integration.jpa.core.StudentDomain ) ; java.util.List<org.springframework.integration.jpa.core.StudentDomain> . add ( org.springframework.integration.jpa.core.StudentDomain ) ; Assert . assertNull ( org.springframework.integration.jpa.core.StudentDomain . getRollNumber ( ) ) ; Assert . assertNull ( org.springframework.integration.jpa.core.StudentDomain ) ; Assert . assertNull ( org.springframework.integration.jpa.core.StudentDomain . getRollNumber ( ) ) ; org.springframework.integration.jpa.core.JpaOperations . persist ( java.util.List<org.springframework.integration.jpa.core.StudentDomain> , NUMBER , false ) ; Assert . assertNotNull ( org.springframework.integration.jpa.core.StudentDomain . getRollNumber ( ) ) ; Assert . assertNotNull ( org.springframework.integration.jpa.core.StudentDomain . getRollNumber ( ) ) ; final java.util.List<?> < ? > java.util.List<?> = org.springframework.integration.jpa.core.JpaOperations . getResultListForClass ( StudentDomain .class , NUMBER , NUMBER ) ; Assert . assertNotNull ( java.util.List<> ) ; Assert . assertEquals ( NUMBER , java.util.List<> . int ( ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { final JpaOperations org.springframework.integration.jpa.core.JpaOperations = org.springframework.integration.jpa.core.JpaOperations ( org.springframework.integration.jpa.core.EntityManager ) ; final java.util.List<?> < ? > java.util.List<?> = org.springframework.integration.jpa.core.JpaOperations . getResultListForClass ( StudentDomain .class , NUMBER , NUMBER ) ; Assert . assertNotNull ( java.util.List<> ) ; DefaultTransactionDefinition org.springframework.integration.jpa.core.DefaultTransactionDefinition = new DefaultTransactionDefinition ( ) ; org.springframework.integration.jpa.core.DefaultTransactionDefinition . setName ( STRING ) ; org.springframework.integration.jpa.core.DefaultTransactionDefinition . setPropagationBehavior ( TransactionDefinition . PROPAGATION_REQUIRED ) ; TransactionStatus org.springframework.integration.jpa.core.TransactionStatus = org.springframework.integration.jpa.core.PlatformTransactionManager . getTransaction ( org.springframework.integration.jpa.core.DefaultTransactionDefinition ) ; org.springframework.integration.jpa.core.JpaOperations . deleteInBatch ( java.util.List<> ) ; org.springframework.integration.jpa.core.EntityManager . flush ( ) ; org.springframework.integration.jpa.core.PlatformTransactionManager . commit ( org.springframework.integration.jpa.core.TransactionStatus ) ; final java.util.List<?> < ? > java.util.List<?> = org.springframework.integration.jpa.core.JpaOperations . getResultListForClass ( StudentDomain .class , NUMBER , NUMBER ) ; Assert . assertNotNull ( java.util.List<> ) ; Assert . assertTrue ( java.util.List<> . int ( ) == NUMBER ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.integration.jpa.core.JpaOperations org.springframework.integration.jpa.core.JpaOperations ( EntityManager org.springframework.integration.jpa.core.EntityManager ) { final DefaultJpaOperations org.springframework.integration.jpa.core.DefaultJpaOperations = new DefaultJpaOperations ( ) ; org.springframework.integration.jpa.core.DefaultJpaOperations . setEntityManager ( org.springframework.integration.jpa.core.EntityManager ) ; org.springframework.integration.jpa.core.DefaultJpaOperations . afterPropertiesSet ( ) ; return org.springframework.integration.jpa.core.DefaultJpaOperations ; }  <METHOD_END>
<METHOD_START> public void void ( ) { final JpaOperations org.springframework.integration.jpa.core.JpaOperations = org.springframework.integration.jpa.core.JpaOperations ( org.springframework.integration.jpa.core.EntityManager ) ; final java.util.List<?> < ? > java.util.List<?> = org.springframework.integration.jpa.core.JpaOperations . getResultListForClass ( StudentDomain .class , NUMBER , NUMBER ) ; Assert . assertNotNull ( java.util.List<> ) ; Assert . assertTrue ( java.util.List<> . int ( ) == NUMBER ) ; final StudentDomain org.springframework.integration.jpa.core.StudentDomain = org.springframework.integration.jpa.core.JpaOperations . find ( StudentDomain .class , NUMBER ) ; Assert . assertNotNull ( org.springframework.integration.jpa.core.StudentDomain ) ; DefaultTransactionDefinition org.springframework.integration.jpa.core.DefaultTransactionDefinition = new DefaultTransactionDefinition ( ) ; org.springframework.integration.jpa.core.DefaultTransactionDefinition . setName ( STRING ) ; org.springframework.integration.jpa.core.DefaultTransactionDefinition . setPropagationBehavior ( TransactionDefinition . PROPAGATION_REQUIRED ) ; TransactionStatus org.springframework.integration.jpa.core.TransactionStatus = org.springframework.integration.jpa.core.PlatformTransactionManager . getTransaction ( org.springframework.integration.jpa.core.DefaultTransactionDefinition ) ; org.springframework.integration.jpa.core.JpaOperations . delete ( org.springframework.integration.jpa.core.StudentDomain ) ; org.springframework.integration.jpa.core.EntityManager . flush ( ) ; org.springframework.integration.jpa.core.PlatformTransactionManager . commit ( org.springframework.integration.jpa.core.TransactionStatus ) ; final java.util.List<?> < ? > java.util.List<?> = org.springframework.integration.jpa.core.JpaOperations . getResultListForClass ( StudentDomain .class , NUMBER , NUMBER ) ; Assert . assertNotNull ( java.util.List<> ) ; Assert . assertTrue ( java.util.List<> . int ( ) == NUMBER ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { final JpaOperations org.springframework.integration.jpa.core.JpaOperations = org.springframework.integration.jpa.core.JpaOperations ( org.springframework.integration.jpa.core.EntityManager ) ; final java.util.List<?> < ? > java.util.List<?> = org.springframework.integration.jpa.core.JpaOperations . getResultListForClass ( StudentDomain .class , NUMBER , NUMBER ) ; Assert . assertNotNull ( java.util.List<> ) ; Assert . assertTrue ( java.util.List<> . int ( ) == NUMBER ) ; DefaultTransactionDefinition org.springframework.integration.jpa.core.DefaultTransactionDefinition = new DefaultTransactionDefinition ( ) ; org.springframework.integration.jpa.core.DefaultTransactionDefinition . setName ( STRING ) ; org.springframework.integration.jpa.core.DefaultTransactionDefinition . setPropagationBehavior ( TransactionDefinition . PROPAGATION_REQUIRED ) ; TransactionStatus org.springframework.integration.jpa.core.TransactionStatus = org.springframework.integration.jpa.core.PlatformTransactionManager . getTransaction ( org.springframework.integration.jpa.core.DefaultTransactionDefinition ) ; org.springframework.integration.jpa.core.JpaOperations . deleteInBatch ( new java.util.ArrayList<org.springframework.integration.jpa.core.StudentDomain> < StudentDomain > ( NUMBER ) ) ; org.springframework.integration.jpa.core.EntityManager . flush ( ) ; org.springframework.integration.jpa.core.PlatformTransactionManager . commit ( org.springframework.integration.jpa.core.TransactionStatus ) ; final java.util.List<?> < ? > java.util.List<?> = org.springframework.integration.jpa.core.JpaOperations . getResultListForClass ( StudentDomain .class , NUMBER , NUMBER ) ; Assert . assertNotNull ( java.util.List<> ) ; Assert . assertTrue ( java.util.List<> . int ( ) == NUMBER ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { JpaOperations org.springframework.integration.jpa.core.JpaOperations = org.springframework.integration.jpa.core.JpaOperations ( org.springframework.integration.jpa.core.EntityManager ) ; java.util.List<?> < ? > java.util.List<?> = org.springframework.integration.jpa.core.JpaOperations . getResultListForClass ( StudentDomain .class , NUMBER , NUMBER ) ; assertEquals ( NUMBER , java.util.List<> . int ( ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { JpaOperations org.springframework.integration.jpa.core.JpaOperations = org.springframework.integration.jpa.core.JpaOperations ( org.springframework.integration.jpa.core.EntityManager ) ; java.lang.String java.lang.String = STRING ; java.util.List<?> < ? > java.util.List<?> = org.springframework.integration.jpa.core.JpaOperations . getResultListForNativeQuery ( java.lang.String , StudentDomain .class , null , NUMBER , NUMBER ) ; assertEquals ( NUMBER , java.util.List<> . int ( ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { JpaOperations org.springframework.integration.jpa.core.JpaOperations = org.springframework.integration.jpa.core.JpaOperations ( org.springframework.integration.jpa.core.EntityManager ) ; java.util.List<?> < ? > java.util.List<?> = org.springframework.integration.jpa.core.JpaOperations . getResultListForNamedQuery ( STRING , null , NUMBER , NUMBER ) ; assertEquals ( NUMBER , java.util.List<> . int ( ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { JpaOperations org.springframework.integration.jpa.core.JpaOperations = org.springframework.integration.jpa.core.JpaOperations ( org.springframework.integration.jpa.core.EntityManager ) ; java.lang.String java.lang.String = STRING ; java.util.List<?> < ? > java.util.List<?> = org.springframework.integration.jpa.core.JpaOperations . getResultListForQuery ( java.lang.String , null , NUMBER , NUMBER ) ; assertEquals ( NUMBER , java.util.List<> . int ( ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { JpaOperations org.springframework.integration.jpa.core.JpaOperations = org.springframework.integration.jpa.core.JpaOperations ( org.springframework.integration.jpa.core.EntityManager ) ; java.lang.String java.lang.String = STRING ; java.util.List<?> < ? > java.util.List<?> = org.springframework.integration.jpa.core.JpaOperations . getResultListForQuery ( java.lang.String , null , NUMBER , - NUMBER ) ; assertEquals ( NUMBER , java.util.List<> . int ( ) ) ; }  <METHOD_END>