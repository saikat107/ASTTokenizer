<METHOD_START> @ Before public void void ( ) { when ( org.springframework.data.jpa.repository.JpaEntityInformation<org.springframework.data.jpa.repository.Role,java.lang.Integer> . getJavaType ( ) ) . thenReturn ( Role .class ) ; when ( org.springframework.data.jpa.repository.EntityManager . getMetamodel ( ) ) . thenReturn ( org.springframework.data.jpa.repository.Metamodel ) ; when ( org.springframework.data.jpa.repository.EntityManager . getDelegate ( ) ) . thenReturn ( org.springframework.data.jpa.repository.EntityManager ) ; when ( org.springframework.data.jpa.repository.EntityManager . getEntityManagerFactory ( ) ) . thenReturn ( org.springframework.data.jpa.repository.EntityManagerFactory ) ; when ( org.springframework.data.jpa.repository.EntityManagerFactory . createEntityManager ( ) ) . thenReturn ( org.springframework.data.jpa.repository.EntityManager ) ; JpaRepositoryFactory org.springframework.data.jpa.repository.JpaRepositoryFactory = new JpaRepositoryFactory ( org.springframework.data.jpa.repository.EntityManager ) { @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) public < T , ID extends java.io.Serializable > org.springframework.data.jpa.repository.JpaEntityInformation<T,ID> < T , ID > org.springframework.data.jpa.repository.JpaEntityInformation<T,ID> ( java.lang.Class<T> < T > java.lang.Class<T> ) { return ( JpaEntityInformation < T , ID > ) org.springframework.data.jpa.repository.JpaEntityInformation<org.springframework.data.jpa.repository.Role,java.lang.Integer> ; } } ; org.springframework.data.jpa.repository.RoleRepository = org.springframework.data.jpa.repository.JpaRepositoryFactory . getRepository ( RoleRepository .class ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) public < T , ID extends java.io.Serializable > org.springframework.data.jpa.repository.JpaEntityInformation<T,ID> < T , ID > org.springframework.data.jpa.repository.JpaEntityInformation<T,ID> ( java.lang.Class<T> < T > java.lang.Class<T> ) { return ( JpaEntityInformation < T , ID > ) org.springframework.data.jpa.repository.JpaEntityInformation<org.springframework.data.jpa.repository.Role,java.lang.Integer> ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { when ( org.springframework.data.jpa.repository.EntityManager . getCriteriaBuilder ( ) ) . thenReturn ( org.springframework.data.jpa.repository.CriteriaBuilder ) ; when ( org.springframework.data.jpa.repository.CriteriaBuilder . createQuery ( Role .class ) ) . thenReturn ( org.springframework.data.jpa.repository.CriteriaQuery<org.springframework.data.jpa.repository.Role> ) ; when ( org.springframework.data.jpa.repository.EntityManager . createQuery ( org.springframework.data.jpa.repository.CriteriaQuery<org.springframework.data.jpa.repository.Role> ) ) . thenReturn ( org.springframework.data.jpa.repository.TypedQuery<org.springframework.data.jpa.repository.Role> ) ; when ( org.springframework.data.jpa.repository.TypedQuery<org.springframework.data.jpa.repository.Role> . setLockMode ( any ( LockModeType .class ) ) ) . thenReturn ( org.springframework.data.jpa.repository.TypedQuery<org.springframework.data.jpa.repository.Role> ) ; org.springframework.data.jpa.repository.RoleRepository . findAll ( ) ; verify ( org.springframework.data.jpa.repository.TypedQuery<org.springframework.data.jpa.repository.Role> ) . setLockMode ( LockModeType . READ ) ; verify ( org.springframework.data.jpa.repository.TypedQuery<org.springframework.data.jpa.repository.Role> ) . setHint ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.jpa.repository.RoleRepository . findOne ( NUMBER ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = java.util.Collections . java.util.Map<java.lang.String,java.lang.Object> ( STRING , ( java.lang.Object ) STRING ) ; LockModeType org.springframework.data.jpa.repository.LockModeType = LockModeType . READ ; verify ( org.springframework.data.jpa.repository.EntityManager ) . find ( Role .class , NUMBER , org.springframework.data.jpa.repository.LockModeType , java.util.Map<java.lang.String,java.lang.Object> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { when ( org.springframework.data.jpa.repository.EntityManager . getDelegate ( ) ) . thenReturn ( mock ( EntityManager .class ) ) ; when ( org.springframework.data.jpa.repository.EntityManager . createQuery ( anyString ( ) ) ) . thenReturn ( javax.persistence.Query ) ; org.springframework.data.jpa.repository.RoleRepository . findOne ( QRole . role . name . eq ( STRING ) ) ; verify ( javax.persistence.Query ) . setLockMode ( LockModeType . READ ) ; verify ( javax.persistence.Query ) . setHint ( STRING , STRING ) ; }  <METHOD_END>