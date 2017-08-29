<METHOD_START> public void void ( SessionFactory org.springframework.orm.hibernate5.support.SessionFactory ) { this . org.springframework.orm.hibernate5.support.SessionFactory = org.springframework.orm.hibernate5.support.SessionFactory ; }  <METHOD_END>
<METHOD_START> public org.springframework.orm.hibernate5.support.SessionFactory org.springframework.orm.hibernate5.support.SessionFactory ( ) { return this . org.springframework.orm.hibernate5.support.SessionFactory ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( WebRequest org.springframework.orm.hibernate5.support.WebRequest ) throws org.springframework.orm.hibernate5.support.DataAccessException { java.lang.String java.lang.String = java.lang.String ( ) ; WebAsyncManager org.springframework.orm.hibernate5.support.WebAsyncManager = WebAsyncUtils . getAsyncManager ( org.springframework.orm.hibernate5.support.WebRequest ) ; if ( org.springframework.orm.hibernate5.support.WebAsyncManager . hasConcurrentResult ( ) ) { if ( boolean ( org.springframework.orm.hibernate5.support.WebAsyncManager , java.lang.String ) ) { return; } } if ( TransactionSynchronizationManager . hasResource ( org.springframework.orm.hibernate5.support.SessionFactory ( ) ) ) { java.lang.Integer java.lang.Integer = ( java.lang.Integer ) org.springframework.orm.hibernate5.support.WebRequest . getAttribute ( java.lang.String , WebRequest . SCOPE_REQUEST ) ; int int = ( java.lang.Integer != null ? java.lang.Integer + NUMBER : NUMBER ) ; org.springframework.orm.hibernate5.support.WebRequest . setAttribute ( java.lang.String ( ) , int , WebRequest . SCOPE_REQUEST ) ; } else { org.springframework.orm.hibernate5.support.Log . debug ( STRING ) ; Session org.springframework.orm.hibernate5.support.Session = org.springframework.orm.hibernate5.support.Session ( ) ; SessionHolder org.springframework.orm.hibernate5.support.SessionHolder = new SessionHolder ( org.springframework.orm.hibernate5.support.Session ) ; TransactionSynchronizationManager . bindResource ( org.springframework.orm.hibernate5.support.SessionFactory ( ) , org.springframework.orm.hibernate5.support.SessionHolder ) ; AsyncRequestInterceptor org.springframework.orm.hibernate5.support.AsyncRequestInterceptor = new AsyncRequestInterceptor ( org.springframework.orm.hibernate5.support.SessionFactory ( ) , org.springframework.orm.hibernate5.support.SessionHolder ) ; org.springframework.orm.hibernate5.support.WebAsyncManager . registerCallableInterceptor ( java.lang.String , org.springframework.orm.hibernate5.support.AsyncRequestInterceptor ) ; org.springframework.orm.hibernate5.support.WebAsyncManager . registerDeferredResultInterceptor ( java.lang.String , org.springframework.orm.hibernate5.support.AsyncRequestInterceptor ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( WebRequest org.springframework.orm.hibernate5.support.WebRequest , ModelMap org.springframework.orm.hibernate5.support.ModelMap ) {	}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( WebRequest org.springframework.orm.hibernate5.support.WebRequest , java.lang.Exception java.lang.Exception ) throws org.springframework.orm.hibernate5.support.DataAccessException { if ( ! boolean ( org.springframework.orm.hibernate5.support.WebRequest ) ) { SessionHolder org.springframework.orm.hibernate5.support.SessionHolder = ( SessionHolder ) TransactionSynchronizationManager . unbindResource ( org.springframework.orm.hibernate5.support.SessionFactory ( ) ) ; org.springframework.orm.hibernate5.support.Log . debug ( STRING ) ; SessionFactoryUtils . closeSession ( org.springframework.orm.hibernate5.support.SessionHolder . getSession ( ) ) ; } }  <METHOD_END>
<METHOD_START> private boolean boolean ( WebRequest org.springframework.orm.hibernate5.support.WebRequest ) { java.lang.String java.lang.String = java.lang.String ( ) ; java.lang.Integer java.lang.Integer = ( java.lang.Integer ) org.springframework.orm.hibernate5.support.WebRequest . getAttribute ( java.lang.String , WebRequest . SCOPE_REQUEST ) ; if ( java.lang.Integer == null ) { return false ; } if ( java.lang.Integer > NUMBER ) { org.springframework.orm.hibernate5.support.WebRequest . setAttribute ( java.lang.String , java.lang.Integer - NUMBER , WebRequest . SCOPE_REQUEST ) ; } else { org.springframework.orm.hibernate5.support.WebRequest . removeAttribute ( java.lang.String , WebRequest . SCOPE_REQUEST ) ; } return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( WebRequest org.springframework.orm.hibernate5.support.WebRequest ) { if ( ! boolean ( org.springframework.orm.hibernate5.support.WebRequest ) ) { TransactionSynchronizationManager . unbindResource ( org.springframework.orm.hibernate5.support.SessionFactory ( ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) protected org.springframework.orm.hibernate5.support.Session org.springframework.orm.hibernate5.support.Session ( ) org.springframework.orm.hibernate5.support.DataAccessResourceFailureException { try { Session org.springframework.orm.hibernate5.support.Session = org.springframework.orm.hibernate5.support.SessionFactory ( ) . openSession ( ) ; org.springframework.orm.hibernate5.support.Session . setFlushMode ( FlushMode . MANUAL ) ; return org.springframework.orm.hibernate5.support.Session ; } catch ( HibernateException org.springframework.orm.hibernate5.support.HibernateException ) { throw new DataAccessResourceFailureException ( STRING , org.springframework.orm.hibernate5.support.HibernateException ) ; } }  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( ) { return org.springframework.orm.hibernate5.support.SessionFactory ( ) . toString ( ) + java.lang.String ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( WebAsyncManager org.springframework.orm.hibernate5.support.WebAsyncManager , java.lang.String java.lang.String ) { if ( org.springframework.orm.hibernate5.support.WebAsyncManager . getCallableInterceptor ( java.lang.String ) == null ) { return false ; } ( ( AsyncRequestInterceptor ) org.springframework.orm.hibernate5.support.WebAsyncManager . getCallableInterceptor ( java.lang.String ) ) . bindSession ( ) ; return true ; }  <METHOD_END>