<METHOD_START> public void ( DistributedMember org.springframework.data.gemfire.function.execution.DistributedMember ) { super(); Assert . notNull ( org.springframework.data.gemfire.function.execution.DistributedMember ) ; this . org.springframework.data.gemfire.function.execution.DistributedMember = org.springframework.data.gemfire.function.execution.DistributedMember ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.data.gemfire.function.execution.Execution org.springframework.data.gemfire.function.execution.Execution ( ) { return FunctionService . onMember ( this . org.springframework.data.gemfire.function.execution.DistributedMember ) ; }  <METHOD_END>