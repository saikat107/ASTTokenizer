<METHOD_START> @ Test public void void ( ) java.lang.InterruptedException { java.util.Map<java.lang.Object,java.lang.Object> < java.lang.Object , java.lang.Object > java.util.Map<java.lang.Object,java.lang.Object> = demo.tasks.StateMachine<demo.tasks.States,demo.tasks.Events> . getExtendedState ( ) . getVariables ( ) ; assertThat ( java.util.Map<java.lang.Object,java.lang.Object> . int ( ) , is ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.InterruptedException { demo.tasks.TasksTests.TestListener . void ( NUMBER , NUMBER , NUMBER ) ; demo.tasks.Tasks . run ( ) ; assertThat ( demo.tasks.TasksTests.TestListener . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( demo.tasks.StateMachine<demo.tasks.States,demo.tasks.Events> . getState ( ) . getIds ( ) , contains ( States . READY ) ) ; java.util.Map<java.lang.Object,java.lang.Object> < java.lang.Object , java.lang.Object > java.util.Map<java.lang.Object,java.lang.Object> = demo.tasks.StateMachine<demo.tasks.States,demo.tasks.Events> . getExtendedState ( ) . getVariables ( ) ; assertThat ( java.util.Map<java.lang.Object,java.lang.Object> . int ( ) , is ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.InterruptedException { demo.tasks.TasksTests.TestListener . void ( NUMBER , NUMBER , NUMBER ) ; demo.tasks.Tasks . run ( ) ; assertThat ( demo.tasks.TasksTests.TestListener . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( demo.tasks.StateMachine<demo.tasks.States,demo.tasks.Events> . getState ( ) . getIds ( ) , contains ( States . READY ) ) ; java.util.Map<java.lang.Object,java.lang.Object> < java.lang.Object , java.lang.Object > java.util.Map<java.lang.Object,java.lang.Object> = demo.tasks.StateMachine<demo.tasks.States,demo.tasks.Events> . getExtendedState ( ) . getVariables ( ) ; assertThat ( java.util.Map<java.lang.Object,java.lang.Object> . int ( ) , is ( NUMBER ) ) ; demo.tasks.TasksTests.TestListener . void ( NUMBER , NUMBER , NUMBER ) ; demo.tasks.Tasks . run ( ) ; assertThat ( demo.tasks.TasksTests.TestListener . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( demo.tasks.StateMachine<demo.tasks.States,demo.tasks.Events> . getState ( ) . getIds ( ) , contains ( States . READY ) ) ; java.util.Map<java.lang.Object,java.lang.Object> = demo.tasks.StateMachine<demo.tasks.States,demo.tasks.Events> . getExtendedState ( ) . getVariables ( ) ; assertThat ( java.util.Map<java.lang.Object,java.lang.Object> . int ( ) , is ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.InterruptedException { demo.tasks.TasksTests.TestListener . void ( NUMBER , NUMBER , NUMBER ) ; demo.tasks.Tasks . fail ( STRING ) ; demo.tasks.Tasks . run ( ) ; assertThat ( demo.tasks.TasksTests.TestListener . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( demo.tasks.TasksTests.TestListener . int , is ( NUMBER ) ) ; assertThat ( demo.tasks.StateMachine<demo.tasks.States,demo.tasks.Events> . getState ( ) . getIds ( ) , contains ( States . READY ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.InterruptedException { demo.tasks.TasksTests.TestListener . void ( NUMBER , NUMBER , NUMBER ) ; demo.tasks.Tasks . fail ( STRING ) ; demo.tasks.Tasks . run ( ) ; assertThat ( demo.tasks.TasksTests.TestListener . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; java.util.Map<java.lang.Object,java.lang.Object> < java.lang.Object , java.lang.Object > java.util.Map<java.lang.Object,java.lang.Object> = demo.tasks.StateMachine<demo.tasks.States,demo.tasks.Events> . getExtendedState ( ) . getVariables ( ) ; assertThat ( java.util.Map<java.lang.Object,java.lang.Object> . int ( ) , is ( NUMBER ) ) ; assertThat ( demo.tasks.StateMachine<demo.tasks.States,demo.tasks.Events> . getState ( ) . getIds ( ) , contains ( States . ERROR , States . MANUAL ) ) ; demo.tasks.TasksTests.TestListener . void ( NUMBER , NUMBER , NUMBER ) ; demo.tasks.Tasks . fix ( ) ; assertThat ( demo.tasks.TasksTests.TestListener . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( demo.tasks.StateMachine<demo.tasks.States,demo.tasks.Events> . getState ( ) . getIds ( ) , contains ( States . READY ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) @ Before public void void ( ) java.lang.Exception { demo.tasks.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; demo.tasks.AnnotationConfigApplicationContext . register ( CommonConfiguration .class , Application .class , demo.tasks.TasksTests.TestConfig .class ) ; demo.tasks.AnnotationConfigApplicationContext . refresh ( ) ; demo.tasks.StateMachine<demo.tasks.States,demo.tasks.Events> = demo.tasks.AnnotationConfigApplicationContext . getBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE , ObjectStateMachine .class ) ; demo.tasks.Tasks = demo.tasks.AnnotationConfigApplicationContext . getBean ( Tasks .class ) ; demo.tasks.TasksTests.TestListener = demo.tasks.AnnotationConfigApplicationContext . getBean ( demo.tasks.TasksTests.TestListener .class ) ; demo.tasks.StateMachine<demo.tasks.States,demo.tasks.Events> . start ( ) ; assertThat ( demo.tasks.TasksTests.TestListener . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( demo.tasks.TasksTests.TestListener . int , is ( NUMBER ) ) ; assertThat ( demo.tasks.StateMachine<demo.tasks.States,demo.tasks.Events> . getState ( ) . getIds ( ) , contains ( States . READY ) ) ; }  <METHOD_END>
<METHOD_START> @ After public void void ( ) { demo.tasks.StateMachine<demo.tasks.States,demo.tasks.Events> . stop ( ) ; demo.tasks.AnnotationConfigApplicationContext . close ( ) ; demo.tasks.AnnotationConfigApplicationContext = null ; demo.tasks.StateMachine<demo.tasks.States,demo.tasks.Events> = null ; demo.tasks.Tasks = null ; demo.tasks.TasksTests.TestListener = null ; }  <METHOD_END>
<METHOD_START> @ Bean public demo.tasks.StateMachineListener<demo.tasks.States,demo.tasks.Events> < States , Events > demo.tasks.StateMachineListener<demo.tasks.States,demo.tasks.Events> ( ) { demo.tasks.TasksTests.TestListener demo.tasks.TasksTests.TestListener = new demo.tasks.TasksTests.TestListener ( ) ; demo.tasks.StateMachine<demo.tasks.States,demo.tasks.Events> . addStateListener ( demo.tasks.TasksTests.TestListener ) ; return demo.tasks.TasksTests.TestListener ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( State < States , Events > demo.tasks.State<demo.tasks.States,demo.tasks.Events> , State < States , Events > demo.tasks.State<demo.tasks.States,demo.tasks.Events> ) { synchronized ( java.lang.Object ) { int ++ ; java.util.concurrent.CountDownLatch . void ( ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( State < States , Events > demo.tasks.State<demo.tasks.States,demo.tasks.Events> ) { synchronized ( java.lang.Object ) { java.util.List<demo.tasks.State<demo.tasks.States,demo.tasks.Events>> . add ( demo.tasks.State<demo.tasks.States,demo.tasks.Events> ) ; java.util.concurrent.CountDownLatch . void ( ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( State < States , Events > demo.tasks.State<demo.tasks.States,demo.tasks.Events> ) { synchronized ( java.lang.Object ) { java.util.List<demo.tasks.State<demo.tasks.States,demo.tasks.Events>> . add ( demo.tasks.State<demo.tasks.States,demo.tasks.Events> ) ; java.util.concurrent.CountDownLatch . void ( ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Transition < States , Events > demo.tasks.Transition<demo.tasks.States,demo.tasks.Events> ) { synchronized ( java.lang.Object ) { int ++ ; java.util.concurrent.CountDownLatch . void ( ) ; } }  <METHOD_END>
<METHOD_START> public void void ( int int , int int , int int ) { void ( int , int , int , NUMBER ) ; }  <METHOD_END>
<METHOD_START> public void void ( int int , int int , int int , int int ) { synchronized ( java.lang.Object ) { java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( int ) ; java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( int ) ; java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( int ) ; java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( int ) ; int = NUMBER ; int = NUMBER ; java.util.List<demo.tasks.State<demo.tasks.States,demo.tasks.Events>> . clear ( ) ; java.util.List<demo.tasks.State<demo.tasks.States,demo.tasks.Events>> . clear ( ) ; } }  <METHOD_END>