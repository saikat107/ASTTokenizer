<METHOD_START> public void ( Pool org.springframework.data.gemfire.function.execution.Pool ) { super(); Assert . notNull ( org.springframework.data.gemfire.function.execution.Pool , STRING ) ; this . org.springframework.data.gemfire.function.execution.Pool = org.springframework.data.gemfire.function.execution.Pool ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.data.gemfire.function.execution.Execution org.springframework.data.gemfire.function.execution.Execution ( ) { return FunctionService . onServers ( this . org.springframework.data.gemfire.function.execution.Pool ) ; }  <METHOD_END>