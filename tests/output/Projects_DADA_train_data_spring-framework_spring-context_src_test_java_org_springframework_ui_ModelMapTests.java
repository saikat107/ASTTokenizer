<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertEquals ( NUMBER , new ModelMap ( ) . size ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ModelMap org.springframework.ui.ModelMap = new ModelMap ( ) ; org.springframework.ui.ModelMap . addAttribute ( STRING , null ) ; assertTrue ( org.springframework.ui.ModelMap . containsKey ( STRING ) ) ; assertNull ( org.springframework.ui.ModelMap . get ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ModelMap org.springframework.ui.ModelMap = new ModelMap ( STRING , null ) ; assertTrue ( org.springframework.ui.ModelMap . containsKey ( STRING ) ) ; assertNull ( org.springframework.ui.ModelMap . get ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ModelMap org.springframework.ui.ModelMap = new ModelMap ( STRING , STRING ) ; assertEquals ( NUMBER , org.springframework.ui.ModelMap . size ( ) ) ; java.lang.String java.lang.String = ( java.lang.String ) org.springframework.ui.ModelMap . get ( STRING ) ; assertNotNull ( java.lang.String ) ; assertEquals ( STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ModelMap org.springframework.ui.ModelMap = new ModelMap ( STRING , STRING ) ; assertEquals ( NUMBER , org.springframework.ui.ModelMap . size ( ) ) ; java.lang.String java.lang.String = ( java.lang.String ) org.springframework.ui.ModelMap . get ( STRING ) ; assertNotNull ( java.lang.String ) ; assertEquals ( STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ModelMap org.springframework.ui.ModelMap = new ModelMap ( STRING ) ; assertEquals ( NUMBER , org.springframework.ui.ModelMap . size ( ) ) ; java.lang.String java.lang.String = ( java.lang.String ) org.springframework.ui.ModelMap . get ( STRING ) ; assertNotNull ( java.lang.String ) ; assertEquals ( STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new ModelMap ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ModelMap org.springframework.ui.ModelMap = new ModelMap ( new java.lang.String [] { STRING , STRING } ) ; assertEquals ( NUMBER , org.springframework.ui.ModelMap . size ( ) ) ; java.lang.String [] java.lang.String[] = ( java.lang.String [] ) org.springframework.ui.ModelMap . get ( STRING ) ; assertNotNull ( java.lang.String[] ) ; assertEquals ( NUMBER , java.lang.String[] . int ) ; assertEquals ( STRING , java.lang.String[] [ NUMBER ] ) ; assertEquals ( STRING , java.lang.String[] [ NUMBER ] ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ModelMap org.springframework.ui.ModelMap = new ModelMap ( new java.util.HashSet <> ( ) ) ; assertEquals ( NUMBER , org.springframework.ui.ModelMap . size ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { ModelMap org.springframework.ui.ModelMap = new ModelMap ( ) ; org.springframework.ui.ModelMap . addAttribute ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ModelMap org.springframework.ui.ModelMap = new ModelMap ( new int [] {} ) ; assertEquals ( NUMBER , org.springframework.ui.ModelMap . size ( ) ) ; int [] int[] = ( int [] ) org.springframework.ui.ModelMap . get ( STRING ) ; assertNotNull ( int[] ) ; assertEquals ( NUMBER , int[] . int ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ModelMap org.springframework.ui.ModelMap = new ModelMap ( ) ; org.springframework.ui.ModelMap . addAllAttributes ( ( java.util.Map<java.lang.String,?> < java.lang.String , ? > ) null ) ; assertEquals ( NUMBER , org.springframework.ui.ModelMap . size ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ModelMap org.springframework.ui.ModelMap = new ModelMap ( ) ; org.springframework.ui.ModelMap . addAllAttributes ( ( java.util.Collection<java.lang.Object> < java.lang.Object > ) null ) ; assertEquals ( NUMBER , org.springframework.ui.ModelMap . size ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { ModelMap org.springframework.ui.ModelMap = new ModelMap ( ) ; java.util.ArrayList<java.lang.String> < java.lang.String > java.util.ArrayList<java.lang.String> = new java.util.ArrayList<java.lang.String> <> ( ) ; java.util.ArrayList<java.lang.String> . boolean ( STRING ) ; java.util.ArrayList<java.lang.String> . boolean ( null ) ; org.springframework.ui.ModelMap . addAllAttributes ( java.util.ArrayList<java.lang.String> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = new java.util.HashMap<java.lang.String,java.lang.String> <> ( ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , STRING ) ; ModelMap org.springframework.ui.ModelMap = new ModelMap ( ) ; org.springframework.ui.ModelMap . addAttribute ( java.util.Map<java.lang.String,java.lang.String> ) ; assertEquals ( NUMBER , org.springframework.ui.ModelMap . size ( ) ) ; java.lang.String java.lang.String = StringUtils . uncapitalize ( ClassUtils . getShortName ( java.util.Map<java.lang.String,java.lang.String> . java.lang.Class<? extends java.util.Map> ( ) ) ) ; assertTrue ( org.springframework.ui.ModelMap . containsKey ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ModelMap org.springframework.ui.ModelMap = new ModelMap ( ) ; org.springframework.ui.ModelMap . addAttribute ( STRING ) ; org.springframework.ui.ModelMap . addAttribute ( STRING ) ; assertEquals ( NUMBER , org.springframework.ui.ModelMap . size ( ) ) ; java.lang.String java.lang.String = ( java.lang.String ) org.springframework.ui.ModelMap . get ( STRING ) ; assertEquals ( STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.List<org.springframework.ui.TestBean> < TestBean > java.util.List<org.springframework.ui.TestBean> = new java.util.ArrayList<org.springframework.ui.TestBean> <> ( ) ; java.util.List<org.springframework.ui.TestBean> . add ( new TestBean ( STRING ) ) ; java.util.List<org.springframework.ui.TestBean> . add ( new TestBean ( STRING ) ) ; java.util.List<org.springframework.ui.TestBean> . add ( new TestBean ( STRING ) ) ; ModelMap org.springframework.ui.ModelMap = new ModelMap ( ) ; org.springframework.ui.ModelMap . addAllAttributes ( java.util.List<org.springframework.ui.TestBean> ) ; assertEquals ( NUMBER , org.springframework.ui.ModelMap . size ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.Map<java.lang.String,org.springframework.ui.TestBean> < java.lang.String , TestBean > java.util.Map<java.lang.String,org.springframework.ui.TestBean> = new java.util.HashMap<java.lang.String,org.springframework.ui.TestBean> <> ( ) ; java.util.Map<java.lang.String,org.springframework.ui.TestBean> . put ( STRING , new TestBean ( STRING ) ) ; java.util.Map<java.lang.String,org.springframework.ui.TestBean> . put ( STRING , new TestBean ( STRING ) ) ; java.util.Map<java.lang.String,org.springframework.ui.TestBean> . put ( STRING , new TestBean ( STRING ) ) ; ModelMap org.springframework.ui.ModelMap = new ModelMap ( ) ; org.springframework.ui.ModelMap . put ( STRING , new TestBean ( STRING ) ) ; org.springframework.ui.ModelMap . mergeAttributes ( java.util.Map<java.lang.String,org.springframework.ui.TestBean> ) ; assertEquals ( NUMBER , org.springframework.ui.ModelMap . size ( ) ) ; assertEquals ( STRING , ( ( TestBean ) org.springframework.ui.ModelMap . get ( STRING ) ) . getName ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ModelMap org.springframework.ui.ModelMap = new ModelMap ( ) ; org.springframework.ui.ModelMapTests.SomeInnerClass org.springframework.ui.ModelMapTests.SomeInnerClass = new org.springframework.ui.ModelMapTests.SomeInnerClass ( ) ; org.springframework.ui.ModelMap . addAttribute ( org.springframework.ui.ModelMapTests.SomeInnerClass ) ; assertSame ( org.springframework.ui.ModelMapTests.SomeInnerClass , org.springframework.ui.ModelMap . get ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ModelMap org.springframework.ui.ModelMap = new ModelMap ( ) ; org.springframework.ui.ModelMapTests.UKInnerClass org.springframework.ui.ModelMapTests.UKInnerClass = new org.springframework.ui.ModelMapTests.UKInnerClass ( ) ; org.springframework.ui.ModelMap . addAttribute ( org.springframework.ui.ModelMapTests.UKInnerClass ) ; assertSame ( org.springframework.ui.ModelMapTests.UKInnerClass , org.springframework.ui.ModelMap . get ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ModelMap org.springframework.ui.ModelMap = new ModelMap ( ) ; ProxyFactory org.springframework.ui.ProxyFactory = new ProxyFactory ( ) ; org.springframework.ui.ModelMapTests.SomeInnerClass org.springframework.ui.ModelMapTests.SomeInnerClass = new org.springframework.ui.ModelMapTests.SomeInnerClass ( ) ; org.springframework.ui.ProxyFactory . setTarget ( org.springframework.ui.ModelMapTests.SomeInnerClass ) ; org.springframework.ui.ProxyFactory . setProxyTargetClass ( true ) ; org.springframework.ui.ModelMap . addAttribute ( org.springframework.ui.ProxyFactory . getProxy ( ) ) ; assertTrue ( org.springframework.ui.ModelMap . containsKey ( STRING ) ) ; assertEquals ( org.springframework.ui.ModelMapTests.SomeInnerClass , org.springframework.ui.ModelMap . get ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ModelMap org.springframework.ui.ModelMap = new ModelMap ( ) ; ProxyFactory org.springframework.ui.ProxyFactory = new ProxyFactory ( ) ; java.util.Map<?,?> < ? , ? > java.util.Map<?,?> = new java.util.HashMap<java.lang.Object,java.lang.Object> <> ( ) ; org.springframework.ui.ProxyFactory . setTarget ( java.util.Map<,> ) ; org.springframework.ui.ProxyFactory . addInterface ( java.util.Map .class ) ; java.lang.Object java.lang.Object = org.springframework.ui.ProxyFactory . getProxy ( ) ; org.springframework.ui.ModelMap . addAttribute ( java.lang.Object ) ; assertSame ( java.lang.Object , org.springframework.ui.ModelMap . get ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ModelMap org.springframework.ui.ModelMap = new ModelMap ( ) ; java.util.Map<?,?> < ? , ? > java.util.Map<?,?> = new java.util.HashMap<java.lang.Object,java.lang.Object> <> ( ) ; ProxyFactory org.springframework.ui.ProxyFactory = new ProxyFactory ( ) ; org.springframework.ui.ProxyFactory . setTarget ( java.util.Map<,> ) ; org.springframework.ui.ProxyFactory . addInterface ( java.io.Serializable .class ) ; org.springframework.ui.ProxyFactory . addInterface ( java.lang.Cloneable .class ) ; org.springframework.ui.ProxyFactory . addInterface ( java.lang.Comparable .class ) ; org.springframework.ui.ProxyFactory . addInterface ( java.util.Map .class ) ; java.lang.Object java.lang.Object = org.springframework.ui.ProxyFactory . getProxy ( ) ; org.springframework.ui.ModelMap . addAttribute ( java.lang.Object ) ; assertSame ( java.lang.Object , org.springframework.ui.ModelMap . get ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ModelMap org.springframework.ui.ModelMap = new ModelMap ( ) ; java.util.Map<?,?> < ? , ? > java.util.Map<?,?> = new java.util.HashMap<java.lang.Object,java.lang.Object> <> ( ) ; ProxyFactory org.springframework.ui.ProxyFactory = new ProxyFactory ( java.util.Map<,> ) ; java.lang.Object java.lang.Object = org.springframework.ui.ProxyFactory . getProxy ( ) ; org.springframework.ui.ModelMap . addAttribute ( java.lang.Object ) ; assertSame ( java.lang.Object , org.springframework.ui.ModelMap . get ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ModelMap org.springframework.ui.ModelMap = new ModelMap ( ) ; java.lang.Object java.lang.Object = java.lang.reflect.Proxy . java.lang.Object ( java.lang.Class<? extends org.springframework.ui.ModelMapTests> ( ) . java.lang.ClassLoader ( ) , new java.lang.Class<?> < ? > [] { java.util.Map .class } , new java.lang.reflect.InvocationHandler ( ) { @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , java.lang.reflect.Method java.lang.reflect.Method , java.lang.Object [] java.lang.Object[] ) { return STRING ; } } ) ; org.springframework.ui.ModelMap . addAttribute ( java.lang.Object ) ; assertSame ( java.lang.Object , org.springframework.ui.ModelMap . get ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , java.lang.reflect.Method java.lang.reflect.Method , java.lang.Object [] java.lang.Object[] ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Object java.lang.Object ) { return ( java.lang.Object instanceof org.springframework.ui.ModelMapTests.SomeInnerClass ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return org.springframework.ui.ModelMapTests.SomeInnerClass .class . int ( ) ; }  <METHOD_END>