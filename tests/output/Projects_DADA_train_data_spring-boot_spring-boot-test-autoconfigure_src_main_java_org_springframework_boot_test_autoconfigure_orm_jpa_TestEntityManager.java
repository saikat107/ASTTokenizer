<METHOD_START> public void ( EntityManagerFactory org.springframework.boot.test.autoconfigure.orm.jpa.EntityManagerFactory ) { Assert . notNull ( org.springframework.boot.test.autoconfigure.orm.jpa.EntityManagerFactory , STRING ) ; this . org.springframework.boot.test.autoconfigure.orm.jpa.EntityManagerFactory = org.springframework.boot.test.autoconfigure.orm.jpa.EntityManagerFactory ; }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object ) { java.lang.Object ( java.lang.Object ) ; return java.lang.Object ( java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> public < T > T T ( java.lang.Object java.lang.Object , java.lang.Class<T> < T > java.lang.Class<T> ) { java.lang.Object ( java.lang.Object ) ; return T ( java.lang.Object , java.lang.Class<T> ) ; }  <METHOD_END>
<METHOD_START> public < E > E E ( E E ) { org.springframework.boot.test.autoconfigure.orm.jpa.EntityManager ( ) . persist ( E ) ; return E ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public < E > E E ( E E ) { EntityManager org.springframework.boot.test.autoconfigure.orm.jpa.EntityManager = org.springframework.boot.test.autoconfigure.orm.jpa.EntityManager ( ) ; E ( E ) ; java.lang.Object java.lang.Object = java.lang.Object ( E ) ; org.springframework.boot.test.autoconfigure.orm.jpa.EntityManager . detach ( E ) ; return ( E ) org.springframework.boot.test.autoconfigure.orm.jpa.EntityManager . find ( E . java.lang.Class<? extends java.lang.Object> ( ) , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> public < E > E E ( E E ) { E ( E ) ; void ( ) ; return E ; }  <METHOD_END>
<METHOD_START> public < E > E E ( E E ) { return org.springframework.boot.test.autoconfigure.orm.jpa.EntityManager ( ) . merge ( E ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Object java.lang.Object ) { org.springframework.boot.test.autoconfigure.orm.jpa.EntityManager ( ) . remove ( java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> public < E > E E ( java.lang.Class<E> < E > java.lang.Class<E> , java.lang.Object java.lang.Object ) { return org.springframework.boot.test.autoconfigure.orm.jpa.EntityManager ( ) . find ( java.lang.Class<E> , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { org.springframework.boot.test.autoconfigure.orm.jpa.EntityManager ( ) . flush ( ) ; }  <METHOD_END>
<METHOD_START> public < E > E E ( E E ) { org.springframework.boot.test.autoconfigure.orm.jpa.EntityManager ( ) . refresh ( E ) ; return E ; }  <METHOD_END>
<METHOD_START> public void void ( ) { org.springframework.boot.test.autoconfigure.orm.jpa.EntityManager ( ) . clear ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Object java.lang.Object ) { org.springframework.boot.test.autoconfigure.orm.jpa.EntityManager ( ) . detach ( java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object ) { return this . org.springframework.boot.test.autoconfigure.orm.jpa.EntityManagerFactory . getPersistenceUnitUtil ( ) . getIdentifier ( java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public < T > T T ( java.lang.Object java.lang.Object , java.lang.Class<T> < T > java.lang.Class<T> ) { java.lang.Object java.lang.Object = java.lang.Object ( java.lang.Object ) ; Assert . isInstanceOf ( java.lang.Class<T> , java.lang.Object , STRING ) ; return ( T ) java.lang.Object ; }  <METHOD_END>
<METHOD_START> public final org.springframework.boot.test.autoconfigure.orm.jpa.EntityManager org.springframework.boot.test.autoconfigure.orm.jpa.EntityManager ( ) { EntityManager org.springframework.boot.test.autoconfigure.orm.jpa.EntityManager = EntityManagerFactoryUtils . getTransactionalEntityManager ( this . org.springframework.boot.test.autoconfigure.orm.jpa.EntityManagerFactory ) ; Assert . state ( org.springframework.boot.test.autoconfigure.orm.jpa.EntityManager != null , STRING ) ; return org.springframework.boot.test.autoconfigure.orm.jpa.EntityManager ; }  <METHOD_END>