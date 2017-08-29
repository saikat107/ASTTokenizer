<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String ) {	}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String ) {	}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) org.springframework.scheduling.quartz.SchedulerConfigException { this . java.util.concurrent.Executor = SchedulerFactoryBean . getConfigTimeTaskExecutor ( ) ; if ( this . java.util.concurrent.Executor == null ) { throw new SchedulerConfigException ( STRING + STRING ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( boolean boolean ) {	}  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return - NUMBER ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Runnable java.lang.Runnable ) { if ( java.lang.Runnable == null ) { return false ; } try { this . java.util.concurrent.Executor . void ( java.lang.Runnable ) ; return true ; } catch ( java.util.concurrent.RejectedExecutionException java.util.concurrent.RejectedExecutionException ) { org.springframework.scheduling.quartz.Log . error ( STRING , java.util.concurrent.RejectedExecutionException ) ; return false ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return NUMBER ; }  <METHOD_END>
