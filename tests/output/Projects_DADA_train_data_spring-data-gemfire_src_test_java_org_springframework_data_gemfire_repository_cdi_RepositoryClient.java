<METHOD_START> protected org.springframework.data.gemfire.repository.cdi.SamplePersonRepository org.springframework.data.gemfire.repository.cdi.SamplePersonRepository ( ) { Assert . state ( org.springframework.data.gemfire.repository.cdi.SamplePersonRepository != null , STRING ) ; return org.springframework.data.gemfire.repository.cdi.SamplePersonRepository ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.gemfire.repository.cdi.Person org.springframework.data.gemfire.repository.cdi.Person ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { return new Person ( java.util.concurrent.atomic.AtomicLong . long ( ) , java.lang.String , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.gemfire.repository.cdi.Person org.springframework.data.gemfire.repository.cdi.Person ( java.lang.Long java.lang.Long ) { return org.springframework.data.gemfire.repository.cdi.SamplePersonRepository ( ) . findOne ( java.lang.Long ) . orElse ( null ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.gemfire.repository.cdi.Person org.springframework.data.gemfire.repository.cdi.Person ( Person org.springframework.data.gemfire.repository.cdi.Person ) { return org.springframework.data.gemfire.repository.cdi.SamplePersonRepository ( ) . save ( org.springframework.data.gemfire.repository.cdi.Person ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( Person org.springframework.data.gemfire.repository.cdi.Person ) { org.springframework.data.gemfire.repository.cdi.SamplePersonRepository ( ) . delete ( org.springframework.data.gemfire.repository.cdi.Person ) ; return ( org.springframework.data.gemfire.repository.cdi.Person ( org.springframework.data.gemfire.repository.cdi.Person . getId ( ) ) == null ) ; }  <METHOD_END>