<METHOD_START> public void ( java.lang.String java.lang.String ) { this . org.springframework.scheduling.support.CronSequenceGenerator = new CronSequenceGenerator ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , java.util.TimeZone java.util.TimeZone ) { this . org.springframework.scheduling.support.CronSequenceGenerator = new CronSequenceGenerator ( java.lang.String , java.util.TimeZone ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . org.springframework.scheduling.support.CronSequenceGenerator . getExpression ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Date java.util.Date ( TriggerContext org.springframework.scheduling.support.TriggerContext ) { java.util.Date java.util.Date = org.springframework.scheduling.support.TriggerContext . lastCompletionTime ( ) ; if ( java.util.Date != null ) { java.util.Date java.util.Date = org.springframework.scheduling.support.TriggerContext . lastScheduledExecutionTime ( ) ; if ( java.util.Date != null && java.util.Date . boolean ( java.util.Date ) ) { java.util.Date = java.util.Date ; } } else { java.util.Date = new java.util.Date ( ) ; } return this . org.springframework.scheduling.support.CronSequenceGenerator . next ( java.util.Date ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Object java.lang.Object ) { return ( this == java.lang.Object || ( java.lang.Object instanceof org.springframework.scheduling.support.CronTrigger && this . org.springframework.scheduling.support.CronSequenceGenerator . equals ( ( ( org.springframework.scheduling.support.CronTrigger ) java.lang.Object ) . org.springframework.scheduling.support.CronSequenceGenerator ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return this . org.springframework.scheduling.support.CronSequenceGenerator . hashCode ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return this . org.springframework.scheduling.support.CronSequenceGenerator . toString ( ) ; }  <METHOD_END>