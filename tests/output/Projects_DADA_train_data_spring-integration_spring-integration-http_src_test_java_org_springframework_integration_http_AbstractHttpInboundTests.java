<METHOD_START> @ Before public void void ( ) { RequestContextHolder . setRequestAttributes ( new ServletRequestAttributes ( new MockHttpServletRequest ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ After public void void ( ) { RequestContextHolder . resetRequestAttributes ( ) ; }  <METHOD_END>
