<METHOD_START> @ Test public void void ( ) { this . org.springframework.orm.jpa.persistenceunit.DefaultPersistenceUnitManager . setPackagesToScan ( STRING ) ; this . org.springframework.orm.jpa.persistenceunit.DefaultPersistenceUnitManager . setResourceLoader ( new DefaultResourceLoader ( CandidateComponentsTestClassLoader . disableIndex ( java.lang.Class<? extends org.springframework.orm.jpa.persistenceunit.DefaultPersistenceUnitManagerTests> ( ) . java.lang.ClassLoader ( ) ) ) ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.orm.jpa.persistenceunit.DefaultPersistenceUnitManager . setPackagesToScan ( STRING ) ; this . org.springframework.orm.jpa.persistenceunit.DefaultPersistenceUnitManager . setResourceLoader ( new DefaultResourceLoader ( CandidateComponentsTestClassLoader . index ( java.lang.Class<? extends org.springframework.orm.jpa.persistenceunit.DefaultPersistenceUnitManagerTests> ( ) . java.lang.ClassLoader ( ) , new ClassPathResource ( STRING , Person .class ) ) ) ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( ) { SpringPersistenceUnitInfo org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo = org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo ( ) ; assertThat ( org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo . getManagedClassNames ( ) , containsInAnyOrder ( STRING , STRING ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo org.springframework.orm.jpa.persistenceunit.SpringPersistenceUnitInfo ( ) { this . org.springframework.orm.jpa.persistenceunit.DefaultPersistenceUnitManager . preparePersistenceUnitInfos ( ) ; return ( SpringPersistenceUnitInfo ) this . org.springframework.orm.jpa.persistenceunit.DefaultPersistenceUnitManager . obtainDefaultPersistenceUnitInfo ( ) ; }  <METHOD_END>