<METHOD_START> @ Parameters ( name = STRING ) public static java.lang.Object [] [] java.lang.Object[][] ( ) { return new java.lang.Object [] [] { { org.springframework.test.context.junit4.RepeatedSpringRunnerTests.NonAnnotatedRepeatedTestCase .class . java.lang.String ( ) , NUMBER , NUMBER , NUMBER , NUMBER } , { org.springframework.test.context.junit4.RepeatedSpringRunnerTests.DefaultRepeatValueRepeatedTestCase .class . java.lang.String ( ) , NUMBER , NUMBER , NUMBER , NUMBER } , { org.springframework.test.context.junit4.RepeatedSpringRunnerTests.NegativeRepeatValueRepeatedTestCase .class . java.lang.String ( ) , NUMBER , NUMBER , NUMBER , NUMBER } , { org.springframework.test.context.junit4.RepeatedSpringRunnerTests.RepeatedFiveTimesRepeatedTestCase .class . java.lang.String ( ) , NUMBER , NUMBER , NUMBER , NUMBER } , { org.springframework.test.context.junit4.RepeatedSpringRunnerTests.RepeatedFiveTimesViaMetaAnnotationRepeatedTestCase .class . java.lang.String ( ) , NUMBER , NUMBER , NUMBER , NUMBER } , { org.springframework.test.context.junit4.RepeatedSpringRunnerTests.TimedRepeatedTestCase .class . java.lang.String ( ) , NUMBER , NUMBER , NUMBER , ( NUMBER + NUMBER + NUMBER + NUMBER ) } } ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , int int , int int , int int , int int ) throws java.lang.Exception { this . java.lang.Class<?> = ClassUtils . forName ( java.lang.Class<? extends org.springframework.test.context.junit4.RepeatedSpringRunnerTests> ( ) . java.lang.String ( ) + STRING + java.lang.String , java.lang.Class<? extends org.springframework.test.context.junit4.RepeatedSpringRunnerTests> ( ) . java.lang.ClassLoader ( ) ) ; this . int = int ; this . int = int ; this . int = int ; this . int = int ; }  <METHOD_END>
<METHOD_START> protected java.lang.Class<? extends org.springframework.test.context.junit4.Runner> < ? extends Runner > java.lang.Class<? extends org.springframework.test.context.junit4.Runner> ( ) { return SpringRunner .class ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.concurrent.atomic.AtomicInteger . void ( NUMBER ) ; runTestsAndAssertCounters ( java.lang.Class<? extends org.springframework.test.context.junit4.Runner> ( ) , this . java.lang.Class<> , int , int , int , NUMBER , NUMBER ) ; assertEquals ( STRING + java.lang.Class<> + STRING , int , java.util.concurrent.atomic.AtomicInteger . int ( ) ) ; }  <METHOD_END>
<METHOD_START> protected void void ( ) java.io.IOException { java.util.concurrent.atomic.AtomicInteger . int ( ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Timed ( millis = NUMBER ) public void void ( ) java.lang.Exception { void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Repeat @ Timed ( millis = NUMBER ) public void void ( ) java.lang.Exception { void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Repeat ( - NUMBER ) @ Timed ( millis = NUMBER ) public void void ( ) java.lang.Exception { void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Repeat ( NUMBER ) public void void ( ) java.lang.Exception { void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test @ org.springframework.test.context.junit4.RepeatedSpringRunnerTests.RepeatedFiveTimes public void void ( ) java.lang.Exception { void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Timed ( millis = NUMBER ) @ Repeat ( NUMBER ) public void void ( ) java.lang.Exception { void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Timed ( millis = NUMBER ) @ Repeat ( NUMBER ) public void void ( ) java.lang.Exception { void ( ) ; java.lang.Thread . void ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Timed ( millis = NUMBER ) @ Repeat ( NUMBER ) public void void ( ) java.lang.Exception { void ( ) ; java.lang.Thread . void ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Timed ( millis = NUMBER ) @ Repeat ( NUMBER ) public void void ( ) java.lang.Exception { void ( ) ; java.lang.Thread . void ( NUMBER ) ; }  <METHOD_END>