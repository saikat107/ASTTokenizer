<METHOD_START> @ java.lang.Override public void void ( JobExecutionEvent org.springframework.boot.autoconfigure.batch.JobExecutionEvent ) { this . java.util.List<org.springframework.boot.autoconfigure.batch.JobExecution> . add ( org.springframework.boot.autoconfigure.batch.JobExecutionEvent . getJobExecution ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { for ( JobExecution org.springframework.boot.autoconfigure.batch.JobExecution : this . java.util.List<org.springframework.boot.autoconfigure.batch.JobExecution> ) { if ( org.springframework.boot.autoconfigure.batch.JobExecution . getStatus ( ) . ordinal ( ) > NUMBER ) { return org.springframework.boot.autoconfigure.batch.JobExecution . getStatus ( ) . ordinal ( ) ; } } return NUMBER ; }  <METHOD_END>