<METHOD_START> @ Test public void void ( ) { MethodInvokingSelector org.springframework.integration.filter.MethodInvokingSelector = new MethodInvokingSelector ( new org.springframework.integration.filter.MethodInvokingSelectorTests.TestBean ( ) , STRING ) ; assertTrue ( org.springframework.integration.filter.MethodInvokingSelector . accept ( new GenericMessage < java.lang.String > ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.integration.filter.MethodInvokingSelectorTests.TestBean org.springframework.integration.filter.MethodInvokingSelectorTests.TestBean = new org.springframework.integration.filter.MethodInvokingSelectorTests.TestBean ( ) ; java.lang.reflect.Method java.lang.reflect.Method = org.springframework.integration.filter.MethodInvokingSelectorTests.TestBean . java.lang.Class<? extends org.springframework.integration.filter.MethodInvokingSelectorTests.TestBean> ( ) . java.lang.reflect.Method ( STRING , new java.lang.Class<?> < ? > [] { Message .class } ) ; MethodInvokingSelector org.springframework.integration.filter.MethodInvokingSelector = new MethodInvokingSelector ( org.springframework.integration.filter.MethodInvokingSelectorTests.TestBean , java.lang.reflect.Method ) ; assertTrue ( org.springframework.integration.filter.MethodInvokingSelector . accept ( new GenericMessage < java.lang.String > ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MethodInvokingSelector org.springframework.integration.filter.MethodInvokingSelector = new MethodInvokingSelector ( new org.springframework.integration.filter.MethodInvokingSelectorTests.TestBean ( ) , STRING ) ; assertFalse ( org.springframework.integration.filter.MethodInvokingSelector . accept ( new GenericMessage < java.lang.Integer > ( NUMBER ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.integration.filter.MethodInvokingSelectorTests.TestBean org.springframework.integration.filter.MethodInvokingSelectorTests.TestBean = new org.springframework.integration.filter.MethodInvokingSelectorTests.TestBean ( ) ; java.lang.reflect.Method java.lang.reflect.Method = org.springframework.integration.filter.MethodInvokingSelectorTests.TestBean . java.lang.Class<? extends org.springframework.integration.filter.MethodInvokingSelectorTests.TestBean> ( ) . java.lang.reflect.Method ( STRING , new java.lang.Class<?> < ? > [] { Message .class } ) ; MethodInvokingSelector org.springframework.integration.filter.MethodInvokingSelector = new MethodInvokingSelector ( org.springframework.integration.filter.MethodInvokingSelectorTests.TestBean , java.lang.reflect.Method ) ; assertFalse ( org.springframework.integration.filter.MethodInvokingSelector . accept ( new GenericMessage < java.lang.Integer > ( NUMBER ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MethodInvokingSelector org.springframework.integration.filter.MethodInvokingSelector = new MethodInvokingSelector ( new org.springframework.integration.filter.MethodInvokingSelectorTests.TestBean ( ) , STRING ) ; org.springframework.integration.filter.MethodInvokingSelector . accept ( new GenericMessage < java.lang.String > ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.integration.filter.MethodInvokingSelectorTests.TestBean org.springframework.integration.filter.MethodInvokingSelectorTests.TestBean = new org.springframework.integration.filter.MethodInvokingSelectorTests.TestBean ( ) ; java.lang.reflect.Method java.lang.reflect.Method = org.springframework.integration.filter.MethodInvokingSelectorTests.TestBean . java.lang.Class<? extends org.springframework.integration.filter.MethodInvokingSelectorTests.TestBean> ( ) . java.lang.reflect.Method ( STRING , new java.lang.Class<?> < ? > [] {} ) ; new MethodInvokingSelector ( org.springframework.integration.filter.MethodInvokingSelectorTests.TestBean , java.lang.reflect.Method ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { MethodInvokingSelector org.springframework.integration.filter.MethodInvokingSelector = new MethodInvokingSelector ( new org.springframework.integration.filter.MethodInvokingSelectorTests.TestBean ( ) , STRING ) ; org.springframework.integration.filter.MethodInvokingSelector . accept ( new GenericMessage < java.lang.String > ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { org.springframework.integration.filter.MethodInvokingSelectorTests.TestBean org.springframework.integration.filter.MethodInvokingSelectorTests.TestBean = new org.springframework.integration.filter.MethodInvokingSelectorTests.TestBean ( ) ; java.lang.reflect.Method java.lang.reflect.Method = org.springframework.integration.filter.MethodInvokingSelectorTests.TestBean . java.lang.Class<? extends org.springframework.integration.filter.MethodInvokingSelectorTests.TestBean> ( ) . java.lang.reflect.Method ( STRING , new java.lang.Class<?> < ? > [] { Message .class } ) ; MethodInvokingSelector org.springframework.integration.filter.MethodInvokingSelector = new MethodInvokingSelector ( org.springframework.integration.filter.MethodInvokingSelectorTests.TestBean , java.lang.reflect.Method ) ; org.springframework.integration.filter.MethodInvokingSelector . accept ( new GenericMessage < java.lang.String > ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> void ( ) { super(); }  <METHOD_END>
<METHOD_START> public boolean boolean ( Message < ? > org.springframework.integration.filter.Message<?> ) { return ( org.springframework.integration.filter.Message<> . getPayload ( ) instanceof java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public void void ( Message < ? > org.springframework.integration.filter.Message<?> ) {		}  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return true ; }  <METHOD_END>