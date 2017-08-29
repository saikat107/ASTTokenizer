<METHOD_START> @ BeforeTransaction public void void ( ) { void ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test @ SqlGroup ( @ Sql ( scripts = STRING , config = @ SqlConfig ( transactionMode = TransactionMode . ISOLATED ) ) ) public void void ( ) { void ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ AfterTransaction public void void ( ) { void ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> protected void void ( int int ) { assertEquals ( STRING , int , countRowsInTable ( STRING ) ) ; }  <METHOD_END>
