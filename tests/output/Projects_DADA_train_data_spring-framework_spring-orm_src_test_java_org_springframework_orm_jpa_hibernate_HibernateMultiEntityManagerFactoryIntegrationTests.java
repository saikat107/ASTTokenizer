<METHOD_START> @ java.lang.Override protected java.lang.String [] java.lang.String[] ( ) { return new java.lang.String [] { STRING , STRING } ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { EntityManager org.springframework.orm.jpa.hibernate.EntityManager = this . org.springframework.orm.jpa.hibernate.EntityManagerFactory . createEntityManager ( ) ; try { org.springframework.orm.jpa.hibernate.EntityManager . createQuery ( STRING ) ; fail ( STRING ) ; } catch ( java.lang.IllegalArgumentException java.lang.IllegalArgumentException ) { } finally { org.springframework.orm.jpa.hibernate.EntityManager . close ( ) ; } }  <METHOD_END>