<METHOD_START> @ Test public void void ( ) java.lang.Exception { demo.washer.WasherTests.TestListener . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; demo.washer.WasherTests.TestListener . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; assertThat ( demo.washer.StateMachine<demo.washer.States,demo.washer.Events> . getState ( ) . getIds ( ) , contains ( States . RUNNING , States . WASHING ) ) ; assertThat ( demo.washer.WasherTests.TestListener . java.util.List<demo.washer.State<demo.washer.States,demo.washer.Events>> . size ( ) , is ( NUMBER ) ) ; assertThat ( demo.washer.WasherTests.TestListener . java.util.List<demo.washer.State<demo.washer.States,demo.washer.Events>> . get ( NUMBER ) . getId ( ) , is ( States . RUNNING ) ) ; assertThat ( demo.washer.WasherTests.TestListener . java.util.List<demo.washer.State<demo.washer.States,demo.washer.Events>> . get ( NUMBER ) . getId ( ) , is ( States . WASHING ) ) ; assertThat ( demo.washer.WasherTests.TestListener . java.util.List<demo.washer.State<demo.washer.States,demo.washer.Events>> . size ( ) , is ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { demo.washer.WasherTests.TestListener . void ( NUMBER , NUMBER , NUMBER ) ; demo.washer.StateMachine<demo.washer.States,demo.washer.Events> . sendEvent ( Events . RINSE ) ; demo.washer.WasherTests.TestListener . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; assertThat ( demo.washer.StateMachine<demo.washer.States,demo.washer.Events> . getState ( ) . getIds ( ) , contains ( States . RUNNING , States . RINSING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { demo.washer.WasherTests.TestListener . void ( NUMBER , NUMBER , NUMBER ) ; demo.washer.StateMachine<demo.washer.States,demo.washer.Events> . sendEvent ( Events . RINSE ) ; demo.washer.WasherTests.TestListener . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; demo.washer.WasherTests.TestListener . void ( NUMBER , NUMBER , NUMBER ) ; demo.washer.StateMachine<demo.washer.States,demo.washer.Events> . sendEvent ( Events . CUTPOWER ) ; demo.washer.WasherTests.TestListener . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; assertThat ( demo.washer.StateMachine<demo.washer.States,demo.washer.Events> . getState ( ) . getIds ( ) , contains ( States . POWEROFF ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { demo.washer.WasherTests.TestListener . void ( NUMBER , NUMBER , NUMBER ) ; demo.washer.StateMachine<demo.washer.States,demo.washer.Events> . sendEvent ( Events . RINSE ) ; demo.washer.WasherTests.TestListener . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; demo.washer.WasherTests.TestListener . void ( NUMBER , NUMBER , NUMBER ) ; demo.washer.StateMachine<demo.washer.States,demo.washer.Events> . sendEvent ( Events . CUTPOWER ) ; demo.washer.WasherTests.TestListener . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; demo.washer.WasherTests.TestListener . void ( NUMBER , NUMBER , NUMBER ) ; demo.washer.StateMachine<demo.washer.States,demo.washer.Events> . sendEvent ( Events . RESTOREPOWER ) ; demo.washer.WasherTests.TestListener . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; assertThat ( demo.washer.StateMachine<demo.washer.States,demo.washer.Events> . getState ( ) . getIds ( ) , contains ( States . RUNNING , States . RINSING ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public demo.washer.StateMachineListener<demo.washer.States,demo.washer.Events> < States , Events > demo.washer.StateMachineListener<demo.washer.States,demo.washer.Events> ( ) { demo.washer.WasherTests.TestListener demo.washer.WasherTests.TestListener = new demo.washer.WasherTests.TestListener ( ) ; demo.washer.StateMachine<demo.washer.States,demo.washer.Events> . addStateListener ( demo.washer.WasherTests.TestListener ) ; return demo.washer.WasherTests.TestListener ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( State < States , Events > demo.washer.State<demo.washer.States,demo.washer.Events> , State < States , Events > demo.washer.State<demo.washer.States,demo.washer.Events> ) { java.util.concurrent.CountDownLatch . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( State < States , Events > demo.washer.State<demo.washer.States,demo.washer.Events> ) { java.util.List<demo.washer.State<demo.washer.States,demo.washer.Events>> . add ( demo.washer.State<demo.washer.States,demo.washer.Events> ) ; java.util.concurrent.CountDownLatch . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( State < States , Events > demo.washer.State<demo.washer.States,demo.washer.Events> ) { java.util.List<demo.washer.State<demo.washer.States,demo.washer.Events>> . add ( demo.washer.State<demo.washer.States,demo.washer.Events> ) ; java.util.concurrent.CountDownLatch . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Transition < States , Events > demo.washer.Transition<demo.washer.States,demo.washer.Events> ) { java.util.List<demo.washer.Transition<demo.washer.States,demo.washer.Events>> . add ( demo.washer.Transition<demo.washer.States,demo.washer.Events> ) ; java.util.concurrent.CountDownLatch . void ( ) ; int ++ ; }  <METHOD_END>
<METHOD_START> public void void ( int int , int int , int int ) { void ( int , int , int , NUMBER ) ; }  <METHOD_END>
<METHOD_START> public void void ( int int , int int , int int , int int ) { java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( int ) ; java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( int ) ; java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( int ) ; java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( int ) ; java.util.List<demo.washer.State<demo.washer.States,demo.washer.Events>> . clear ( ) ; java.util.List<demo.washer.State<demo.washer.States,demo.washer.Events>> . clear ( ) ; int = NUMBER ; java.util.List<demo.washer.Transition<demo.washer.States,demo.washer.Events>> . clear ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) @ Before public void void ( ) { demo.washer.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; demo.washer.AnnotationConfigApplicationContext . register ( CommonConfiguration .class , Application .class , demo.washer.WasherTests.Config .class ) ; demo.washer.AnnotationConfigApplicationContext . refresh ( ) ; demo.washer.StateMachine<demo.washer.States,demo.washer.Events> = demo.washer.AnnotationConfigApplicationContext . getBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE , ObjectStateMachine .class ) ; demo.washer.WasherTests.TestListener = demo.washer.AnnotationConfigApplicationContext . getBean ( demo.washer.WasherTests.TestListener .class ) ; demo.washer.StateMachine<demo.washer.States,demo.washer.Events> . start ( ) ; }  <METHOD_END>
<METHOD_START> @ After public void void ( ) { demo.washer.StateMachine<demo.washer.States,demo.washer.Events> . stop ( ) ; demo.washer.AnnotationConfigApplicationContext . close ( ) ; demo.washer.AnnotationConfigApplicationContext = null ; demo.washer.StateMachine<demo.washer.States,demo.washer.Events> = null ; }  <METHOD_END>