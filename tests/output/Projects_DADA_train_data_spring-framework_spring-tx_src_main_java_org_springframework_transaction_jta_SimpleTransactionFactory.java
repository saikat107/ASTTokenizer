<METHOD_START> public void ( TransactionManager org.springframework.transaction.jta.TransactionManager ) { Assert . notNull ( org.springframework.transaction.jta.TransactionManager , STRING ) ; this . org.springframework.transaction.jta.TransactionManager = org.springframework.transaction.jta.TransactionManager ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.transaction.jta.Transaction org.springframework.transaction.jta.Transaction ( java.lang.String java.lang.String , int int ) throws org.springframework.transaction.jta.NotSupportedException , org.springframework.transaction.jta.SystemException { if ( int >= NUMBER ) { this . org.springframework.transaction.jta.TransactionManager . setTransactionTimeout ( int ) ; } this . org.springframework.transaction.jta.TransactionManager . begin ( ) ; return new ManagedTransactionAdapter ( this . org.springframework.transaction.jta.TransactionManager ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return false ; }  <METHOD_END>