<METHOD_START> protected void ( ) {	}  <METHOD_END>
<METHOD_START> public < T > org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( final java.lang.String java.lang.String , final Matcher < T > org.springframework.test.web.servlet.result.Matcher<T> ) { return new ResultMatcher ( ) { @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { ModelAndView org.springframework.test.web.servlet.result.ModelAndView = org.springframework.test.web.servlet.result.ModelAndView ( org.springframework.test.web.servlet.result.MvcResult ) ; assertThat ( STRING + java.lang.String + STRING , ( T ) org.springframework.test.web.servlet.result.ModelAndView . getModel ( ) . get ( java.lang.String ) , org.springframework.test.web.servlet.result.Matcher<T> ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { ModelAndView org.springframework.test.web.servlet.result.ModelAndView = org.springframework.test.web.servlet.result.ModelAndView ( org.springframework.test.web.servlet.result.MvcResult ) ; assertThat ( STRING + java.lang.String + STRING , ( T ) org.springframework.test.web.servlet.result.ModelAndView . getModel ( ) . get ( java.lang.String ) , org.springframework.test.web.servlet.result.Matcher<T> ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( final java.lang.String java.lang.String , final java.lang.Object java.lang.Object ) { return new ResultMatcher ( ) { @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { ModelAndView org.springframework.test.web.servlet.result.ModelAndView = org.springframework.test.web.servlet.result.ModelAndView ( org.springframework.test.web.servlet.result.MvcResult ) ; assertEquals ( STRING + java.lang.String + STRING , java.lang.Object , org.springframework.test.web.servlet.result.ModelAndView . getModel ( ) . get ( java.lang.String ) ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { ModelAndView org.springframework.test.web.servlet.result.ModelAndView = org.springframework.test.web.servlet.result.ModelAndView ( org.springframework.test.web.servlet.result.MvcResult ) ; assertEquals ( STRING + java.lang.String + STRING , java.lang.Object , org.springframework.test.web.servlet.result.ModelAndView . getModel ( ) . get ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( final java.lang.String ... java.lang.String[] ) { return new ResultMatcher ( ) { @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { ModelAndView org.springframework.test.web.servlet.result.ModelAndView = org.springframework.test.web.servlet.result.ModelAndView ( org.springframework.test.web.servlet.result.MvcResult ) ; for ( java.lang.String java.lang.String : java.lang.String[] ) { assertTrue ( STRING + java.lang.String + STRING , org.springframework.test.web.servlet.result.ModelAndView . getModel ( ) . get ( java.lang.String ) != null ) ; } } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { ModelAndView org.springframework.test.web.servlet.result.ModelAndView = org.springframework.test.web.servlet.result.ModelAndView ( org.springframework.test.web.servlet.result.MvcResult ) ; for ( java.lang.String java.lang.String : java.lang.String[] ) { assertTrue ( STRING + java.lang.String + STRING , org.springframework.test.web.servlet.result.ModelAndView . getModel ( ) . get ( java.lang.String ) != null ) ; } }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( final java.lang.String ... java.lang.String[] ) { return new ResultMatcher ( ) { @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { ModelAndView org.springframework.test.web.servlet.result.ModelAndView = org.springframework.test.web.servlet.result.ModelAndView ( org.springframework.test.web.servlet.result.MvcResult ) ; for ( java.lang.String java.lang.String : java.lang.String[] ) { assertTrue ( STRING + java.lang.String + STRING , org.springframework.test.web.servlet.result.ModelAndView . getModel ( ) . get ( java.lang.String ) == null ) ; } } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { ModelAndView org.springframework.test.web.servlet.result.ModelAndView = org.springframework.test.web.servlet.result.ModelAndView ( org.springframework.test.web.servlet.result.MvcResult ) ; for ( java.lang.String java.lang.String : java.lang.String[] ) { assertTrue ( STRING + java.lang.String + STRING , org.springframework.test.web.servlet.result.ModelAndView . getModel ( ) . get ( java.lang.String ) == null ) ; } }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( final java.lang.String java.lang.String , final int int ) { return new ResultMatcher ( ) { @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { ModelAndView org.springframework.test.web.servlet.result.ModelAndView = org.springframework.test.web.servlet.result.ModelAndView ( org.springframework.test.web.servlet.result.MvcResult ) ; Errors org.springframework.test.web.servlet.result.Errors = org.springframework.test.web.servlet.result.BindingResult ( org.springframework.test.web.servlet.result.ModelAndView , java.lang.String ) ; assertEquals ( STRING + java.lang.String + STRING , int , org.springframework.test.web.servlet.result.Errors . getErrorCount ( ) ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { ModelAndView org.springframework.test.web.servlet.result.ModelAndView = org.springframework.test.web.servlet.result.ModelAndView ( org.springframework.test.web.servlet.result.MvcResult ) ; Errors org.springframework.test.web.servlet.result.Errors = org.springframework.test.web.servlet.result.BindingResult ( org.springframework.test.web.servlet.result.ModelAndView , java.lang.String ) ; assertEquals ( STRING + java.lang.String + STRING , int , org.springframework.test.web.servlet.result.Errors . getErrorCount ( ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( final java.lang.String ... java.lang.String[] ) { return new ResultMatcher ( ) { @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { ModelAndView org.springframework.test.web.servlet.result.ModelAndView = org.springframework.test.web.servlet.result.ModelAndView ( org.springframework.test.web.servlet.result.MvcResult ) ; for ( java.lang.String java.lang.String : java.lang.String[] ) { BindingResult org.springframework.test.web.servlet.result.BindingResult = org.springframework.test.web.servlet.result.BindingResult ( org.springframework.test.web.servlet.result.ModelAndView , java.lang.String ) ; assertTrue ( STRING + java.lang.String + STRING , org.springframework.test.web.servlet.result.BindingResult . hasErrors ( ) ) ; } } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { ModelAndView org.springframework.test.web.servlet.result.ModelAndView = org.springframework.test.web.servlet.result.ModelAndView ( org.springframework.test.web.servlet.result.MvcResult ) ; for ( java.lang.String java.lang.String : java.lang.String[] ) { BindingResult org.springframework.test.web.servlet.result.BindingResult = org.springframework.test.web.servlet.result.BindingResult ( org.springframework.test.web.servlet.result.ModelAndView , java.lang.String ) ; assertTrue ( STRING + java.lang.String + STRING , org.springframework.test.web.servlet.result.BindingResult . hasErrors ( ) ) ; } }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( final java.lang.String ... java.lang.String[] ) { return new ResultMatcher ( ) { @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { ModelAndView org.springframework.test.web.servlet.result.ModelAndView = org.springframework.test.web.servlet.result.ModelAndView ( org.springframework.test.web.servlet.result.MvcResult ) ; for ( java.lang.String java.lang.String : java.lang.String[] ) { BindingResult org.springframework.test.web.servlet.result.BindingResult = org.springframework.test.web.servlet.result.BindingResult ( org.springframework.test.web.servlet.result.ModelAndView , java.lang.String ) ; assertTrue ( STRING + java.lang.String + STRING , ! org.springframework.test.web.servlet.result.BindingResult . hasErrors ( ) ) ; } } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { ModelAndView org.springframework.test.web.servlet.result.ModelAndView = org.springframework.test.web.servlet.result.ModelAndView ( org.springframework.test.web.servlet.result.MvcResult ) ; for ( java.lang.String java.lang.String : java.lang.String[] ) { BindingResult org.springframework.test.web.servlet.result.BindingResult = org.springframework.test.web.servlet.result.BindingResult ( org.springframework.test.web.servlet.result.ModelAndView , java.lang.String ) ; assertTrue ( STRING + java.lang.String + STRING , ! org.springframework.test.web.servlet.result.BindingResult . hasErrors ( ) ) ; } }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( final java.lang.String java.lang.String , final java.lang.String ... java.lang.String[] ) { return new ResultMatcher ( ) { @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { ModelAndView org.springframework.test.web.servlet.result.ModelAndView = org.springframework.test.web.servlet.result.ModelAndView ( org.springframework.test.web.servlet.result.MvcResult ) ; BindingResult org.springframework.test.web.servlet.result.BindingResult = org.springframework.test.web.servlet.result.BindingResult ( org.springframework.test.web.servlet.result.ModelAndView , java.lang.String ) ; assertTrue ( STRING + java.lang.String + STRING , org.springframework.test.web.servlet.result.BindingResult . hasErrors ( ) ) ; for ( final java.lang.String java.lang.String : java.lang.String[] ) { boolean boolean = org.springframework.test.web.servlet.result.BindingResult . hasFieldErrors ( java.lang.String ) ; assertTrue ( STRING + java.lang.String + STRING + java.lang.String + STRING , boolean ) ; } } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { ModelAndView org.springframework.test.web.servlet.result.ModelAndView = org.springframework.test.web.servlet.result.ModelAndView ( org.springframework.test.web.servlet.result.MvcResult ) ; BindingResult org.springframework.test.web.servlet.result.BindingResult = org.springframework.test.web.servlet.result.BindingResult ( org.springframework.test.web.servlet.result.ModelAndView , java.lang.String ) ; assertTrue ( STRING + java.lang.String + STRING , org.springframework.test.web.servlet.result.BindingResult . hasErrors ( ) ) ; for ( final java.lang.String java.lang.String : java.lang.String[] ) { boolean boolean = org.springframework.test.web.servlet.result.BindingResult . hasFieldErrors ( java.lang.String ) ; assertTrue ( STRING + java.lang.String + STRING + java.lang.String + STRING , boolean ) ; } }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( final java.lang.String java.lang.String , final java.lang.String java.lang.String , final java.lang.String java.lang.String ) { return new ResultMatcher ( ) { public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { ModelAndView org.springframework.test.web.servlet.result.ModelAndView = org.springframework.test.web.servlet.result.ModelAndView ( org.springframework.test.web.servlet.result.MvcResult ) ; BindingResult org.springframework.test.web.servlet.result.BindingResult = org.springframework.test.web.servlet.result.BindingResult ( org.springframework.test.web.servlet.result.ModelAndView , java.lang.String ) ; assertTrue ( STRING + java.lang.String + STRING , org.springframework.test.web.servlet.result.BindingResult . hasErrors ( ) ) ; boolean boolean = org.springframework.test.web.servlet.result.BindingResult . hasFieldErrors ( java.lang.String ) ; assertTrue ( STRING + java.lang.String + STRING + java.lang.String + STRING , boolean ) ; java.lang.String java.lang.String = org.springframework.test.web.servlet.result.BindingResult . getFieldError ( java.lang.String ) . getCode ( ) ; assertTrue ( STRING + java.lang.String + STRING + java.lang.String + STRING , java.lang.String . boolean ( java.lang.String ) ) ; } } ; }  <METHOD_END>
<METHOD_START> public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { ModelAndView org.springframework.test.web.servlet.result.ModelAndView = org.springframework.test.web.servlet.result.ModelAndView ( org.springframework.test.web.servlet.result.MvcResult ) ; BindingResult org.springframework.test.web.servlet.result.BindingResult = org.springframework.test.web.servlet.result.BindingResult ( org.springframework.test.web.servlet.result.ModelAndView , java.lang.String ) ; assertTrue ( STRING + java.lang.String + STRING , org.springframework.test.web.servlet.result.BindingResult . hasErrors ( ) ) ; boolean boolean = org.springframework.test.web.servlet.result.BindingResult . hasFieldErrors ( java.lang.String ) ; assertTrue ( STRING + java.lang.String + STRING + java.lang.String + STRING , boolean ) ; java.lang.String java.lang.String = org.springframework.test.web.servlet.result.BindingResult . getFieldError ( java.lang.String ) . getCode ( ) ; assertTrue ( STRING + java.lang.String + STRING + java.lang.String + STRING , java.lang.String . boolean ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> public < T > org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( final java.lang.String java.lang.String , final java.lang.String java.lang.String , final Matcher < ? super java.lang.String > org.springframework.test.web.servlet.result.Matcher<? super java.lang.String> ) { return new ResultMatcher ( ) { @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { ModelAndView org.springframework.test.web.servlet.result.ModelAndView = org.springframework.test.web.servlet.result.ModelAndView ( org.springframework.test.web.servlet.result.MvcResult ) ; BindingResult org.springframework.test.web.servlet.result.BindingResult = org.springframework.test.web.servlet.result.BindingResult ( org.springframework.test.web.servlet.result.ModelAndView , java.lang.String ) ; assertTrue ( STRING + java.lang.String + STRING , org.springframework.test.web.servlet.result.BindingResult . hasErrors ( ) ) ; boolean boolean = org.springframework.test.web.servlet.result.BindingResult . hasFieldErrors ( java.lang.String ) ; assertTrue ( STRING + java.lang.String + STRING + java.lang.String + STRING , boolean ) ; java.lang.String java.lang.String = org.springframework.test.web.servlet.result.BindingResult . getFieldError ( java.lang.String ) . getCode ( ) ; assertThat ( STRING + java.lang.String + STRING + java.lang.String + STRING , java.lang.String , org.springframework.test.web.servlet.result.Matcher<> ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { ModelAndView org.springframework.test.web.servlet.result.ModelAndView = org.springframework.test.web.servlet.result.ModelAndView ( org.springframework.test.web.servlet.result.MvcResult ) ; BindingResult org.springframework.test.web.servlet.result.BindingResult = org.springframework.test.web.servlet.result.BindingResult ( org.springframework.test.web.servlet.result.ModelAndView , java.lang.String ) ; assertTrue ( STRING + java.lang.String + STRING , org.springframework.test.web.servlet.result.BindingResult . hasErrors ( ) ) ; boolean boolean = org.springframework.test.web.servlet.result.BindingResult . hasFieldErrors ( java.lang.String ) ; assertTrue ( STRING + java.lang.String + STRING + java.lang.String + STRING , boolean ) ; java.lang.String java.lang.String = org.springframework.test.web.servlet.result.BindingResult . getFieldError ( java.lang.String ) . getCode ( ) ; assertThat ( STRING + java.lang.String + STRING + java.lang.String + STRING , java.lang.String , org.springframework.test.web.servlet.result.Matcher<> ) ; }  <METHOD_END>
<METHOD_START> public < T > org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( final int int ) { return new ResultMatcher ( ) { @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { int int = int ( org.springframework.test.web.servlet.result.ModelAndView ( org.springframework.test.web.servlet.result.MvcResult ) . getModelMap ( ) ) ; assertEquals ( STRING , int , int ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { int int = int ( org.springframework.test.web.servlet.result.ModelAndView ( org.springframework.test.web.servlet.result.MvcResult ) . getModelMap ( ) ) ; assertEquals ( STRING , int , int ) ; }  <METHOD_END>
<METHOD_START> public < T > org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return new ResultMatcher ( ) { @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { int int = int ( org.springframework.test.web.servlet.result.ModelAndView ( org.springframework.test.web.servlet.result.MvcResult ) . getModelMap ( ) ) ; assertTrue ( STRING , int != NUMBER ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { int int = int ( org.springframework.test.web.servlet.result.ModelAndView ( org.springframework.test.web.servlet.result.MvcResult ) . getModelMap ( ) ) ; assertTrue ( STRING , int != NUMBER ) ; }  <METHOD_END>
<METHOD_START> public < T > org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( ) { return new ResultMatcher ( ) { @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { ModelAndView org.springframework.test.web.servlet.result.ModelAndView = org.springframework.test.web.servlet.result.ModelAndView ( org.springframework.test.web.servlet.result.MvcResult ) ; for ( java.lang.Object java.lang.Object : org.springframework.test.web.servlet.result.ModelAndView . getModel ( ) . values ( ) ) { if ( java.lang.Object instanceof Errors ) { assertTrue ( STRING + java.lang.Object + STRING , ! ( ( Errors ) java.lang.Object ) . hasErrors ( ) ) ; } } } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { ModelAndView org.springframework.test.web.servlet.result.ModelAndView = org.springframework.test.web.servlet.result.ModelAndView ( org.springframework.test.web.servlet.result.MvcResult ) ; for ( java.lang.Object java.lang.Object : org.springframework.test.web.servlet.result.ModelAndView . getModel ( ) . values ( ) ) { if ( java.lang.Object instanceof Errors ) { assertTrue ( STRING + java.lang.Object + STRING , ! ( ( Errors ) java.lang.Object ) . hasErrors ( ) ) ; } } }  <METHOD_END>
<METHOD_START> public < T > org.springframework.test.web.servlet.result.ResultMatcher org.springframework.test.web.servlet.result.ResultMatcher ( final int int ) { return new ResultMatcher ( ) { @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { ModelAndView org.springframework.test.web.servlet.result.ModelAndView = org.springframework.test.web.servlet.result.ModelAndView ( org.springframework.test.web.servlet.result.MvcResult ) ; int int = NUMBER ; for ( java.lang.String java.lang.String : org.springframework.test.web.servlet.result.ModelAndView . getModel ( ) . keySet ( ) ) { if ( ! java.lang.String . boolean ( BindingResult . MODEL_KEY_PREFIX ) ) { int ++ ; } } assertEquals ( STRING , int , int ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) throws java.lang.Exception { ModelAndView org.springframework.test.web.servlet.result.ModelAndView = org.springframework.test.web.servlet.result.ModelAndView ( org.springframework.test.web.servlet.result.MvcResult ) ; int int = NUMBER ; for ( java.lang.String java.lang.String : org.springframework.test.web.servlet.result.ModelAndView . getModel ( ) . keySet ( ) ) { if ( ! java.lang.String . boolean ( BindingResult . MODEL_KEY_PREFIX ) ) { int ++ ; } } assertEquals ( STRING , int , int ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.test.web.servlet.result.ModelAndView org.springframework.test.web.servlet.result.ModelAndView ( MvcResult org.springframework.test.web.servlet.result.MvcResult ) { ModelAndView org.springframework.test.web.servlet.result.ModelAndView = org.springframework.test.web.servlet.result.MvcResult . getModelAndView ( ) ; assertTrue ( STRING , org.springframework.test.web.servlet.result.ModelAndView != null ) ; return org.springframework.test.web.servlet.result.ModelAndView ; }  <METHOD_END>
<METHOD_START> private org.springframework.test.web.servlet.result.BindingResult org.springframework.test.web.servlet.result.BindingResult ( ModelAndView org.springframework.test.web.servlet.result.ModelAndView , java.lang.String java.lang.String ) { BindingResult org.springframework.test.web.servlet.result.BindingResult = ( BindingResult ) org.springframework.test.web.servlet.result.ModelAndView . getModel ( ) . get ( BindingResult . MODEL_KEY_PREFIX + java.lang.String ) ; assertTrue ( STRING + java.lang.String , org.springframework.test.web.servlet.result.BindingResult != null ) ; return org.springframework.test.web.servlet.result.BindingResult ; }  <METHOD_END>
<METHOD_START> private int int ( ModelMap org.springframework.test.web.servlet.result.ModelMap ) { int int = NUMBER ; for ( java.lang.Object java.lang.Object : org.springframework.test.web.servlet.result.ModelMap . values ( ) ) { if ( java.lang.Object instanceof Errors ) { int += ( ( Errors ) java.lang.Object ) . getErrorCount ( ) ; } } return int ; }  <METHOD_END>