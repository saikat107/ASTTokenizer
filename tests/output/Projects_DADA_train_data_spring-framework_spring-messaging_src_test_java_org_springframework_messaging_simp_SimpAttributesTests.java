<METHOD_START> @ Before public void void ( ) { this . java.util.Map<java.lang.String,java.lang.Object> = new java.util.concurrent.ConcurrentHashMap<java.lang.String,java.lang.Object> <> ( ) ; this . org.springframework.messaging.simp.SimpAttributes = new SimpAttributes ( STRING , this . java.util.Map<java.lang.String,java.lang.Object> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.messaging.simp.SimpAttributes . setAttribute ( STRING , STRING ) ; assertThat ( this . org.springframework.messaging.simp.SimpAttributes . getAttribute ( STRING ) , is ( STRING ) ) ; assertThat ( this . org.springframework.messaging.simp.SimpAttributes . getAttribute ( STRING ) , nullValue ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.messaging.simp.SimpAttributes . setAttribute ( STRING , STRING ) ; this . org.springframework.messaging.simp.SimpAttributes . setAttribute ( STRING , STRING ) ; this . org.springframework.messaging.simp.SimpAttributes . setAttribute ( STRING , STRING ) ; assertThat ( this . org.springframework.messaging.simp.SimpAttributes . getAttributeNames ( ) , arrayContainingInAnyOrder ( STRING , STRING , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.Runnable java.lang.Runnable = Mockito . mock ( java.lang.Runnable .class ) ; this . org.springframework.messaging.simp.SimpAttributes . registerDestructionCallback ( STRING , java.lang.Runnable ) ; assertThat ( this . org.springframework.messaging.simp.SimpAttributes . getAttribute ( SimpAttributes . DESTRUCTION_CALLBACK_NAME_PREFIX + STRING ) , sameInstance ( java.lang.Runnable ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.messaging.simp.SimpAttributes . sessionCompleted ( ) ; this . org.springframework.messaging.simp.ExpectedException . expect ( java.lang.IllegalStateException .class ) ; this . org.springframework.messaging.simp.ExpectedException . expectMessage ( containsString ( STRING ) ) ; this . org.springframework.messaging.simp.SimpAttributes . registerDestructionCallback ( STRING , Mockito . mock ( java.lang.Runnable .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.Runnable java.lang.Runnable = Mockito . mock ( java.lang.Runnable .class ) ; java.lang.Runnable java.lang.Runnable = Mockito . mock ( java.lang.Runnable .class ) ; this . org.springframework.messaging.simp.SimpAttributes . registerDestructionCallback ( STRING , java.lang.Runnable ) ; this . org.springframework.messaging.simp.SimpAttributes . registerDestructionCallback ( STRING , java.lang.Runnable ) ; assertThat ( this . org.springframework.messaging.simp.SimpAttributes . getAttributeNames ( ) . length , is ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( this . org.springframework.messaging.simp.SimpAttributes . getSessionMutex ( ) , sameInstance ( this . java.util.Map<java.lang.String,java.lang.Object> ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.Object java.lang.Object = new java.lang.Object ( ) ; this . org.springframework.messaging.simp.SimpAttributes . setAttribute ( SimpAttributes . SESSION_MUTEX_NAME , java.lang.Object ) ; assertThat ( this . org.springframework.messaging.simp.SimpAttributes . getSessionMutex ( ) , sameInstance ( java.lang.Object ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.Runnable java.lang.Runnable = Mockito . mock ( java.lang.Runnable .class ) ; java.lang.Runnable java.lang.Runnable = Mockito . mock ( java.lang.Runnable .class ) ; this . org.springframework.messaging.simp.SimpAttributes . registerDestructionCallback ( STRING , java.lang.Runnable ) ; this . org.springframework.messaging.simp.SimpAttributes . registerDestructionCallback ( STRING , java.lang.Runnable ) ; this . org.springframework.messaging.simp.SimpAttributes . sessionCompleted ( ) ; verify ( java.lang.Runnable , times ( NUMBER ) ) . run ( ) ; verify ( java.lang.Runnable , times ( NUMBER ) ) . run ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.Runnable java.lang.Runnable = Mockito . mock ( java.lang.Runnable .class ) ; this . org.springframework.messaging.simp.SimpAttributes . registerDestructionCallback ( STRING , java.lang.Runnable ) ; this . org.springframework.messaging.simp.SimpAttributes . sessionCompleted ( ) ; this . org.springframework.messaging.simp.SimpAttributes . sessionCompleted ( ) ; this . org.springframework.messaging.simp.SimpAttributes . sessionCompleted ( ) ; verify ( java.lang.Runnable , times ( NUMBER ) ) . run ( ) ; }  <METHOD_END>