<METHOD_START> @ Produces @ PersonDB public org.springframework.data.jpa.repository.cdi.EntityManager org.springframework.data.jpa.repository.cdi.EntityManager ( EntityManagerFactory org.springframework.data.jpa.repository.cdi.EntityManagerFactory ) { return org.springframework.data.jpa.repository.cdi.EntityManagerFactory . createEntityManager ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( @ Disposes @ PersonDB EntityManager org.springframework.data.jpa.repository.cdi.EntityManager ) { org.springframework.data.jpa.repository.cdi.EntityManager . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Produces @ UserDB public org.springframework.data.jpa.repository.cdi.EntityManager org.springframework.data.jpa.repository.cdi.EntityManager ( EntityManagerFactory org.springframework.data.jpa.repository.cdi.EntityManagerFactory ) { return org.springframework.data.jpa.repository.cdi.EntityManagerFactory . createEntityManager ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( @ Disposes @ UserDB EntityManager org.springframework.data.jpa.repository.cdi.EntityManager ) { org.springframework.data.jpa.repository.cdi.EntityManager . close ( ) ; }  <METHOD_END>