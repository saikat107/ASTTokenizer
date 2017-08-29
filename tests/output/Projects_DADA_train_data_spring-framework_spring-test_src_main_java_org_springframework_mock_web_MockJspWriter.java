<METHOD_START> public void ( HttpServletResponse org.springframework.mock.web.HttpServletResponse ) { this( org.springframework.mock.web.HttpServletResponse , null ); }  <METHOD_END>
<METHOD_START> public void ( java.io.Writer java.io.Writer ) { this( null , java.io.Writer ); }  <METHOD_END>
<METHOD_START> public void ( HttpServletResponse org.springframework.mock.web.HttpServletResponse , java.io.Writer java.io.Writer ) { super( DEFAULT_BUFFER , true ); this . org.springframework.mock.web.HttpServletResponse = ( org.springframework.mock.web.HttpServletResponse != null ? org.springframework.mock.web.HttpServletResponse : new MockHttpServletResponse ( ) ) ; if ( java.io.Writer instanceof java.io.PrintWriter ) { this . java.io.PrintWriter = ( java.io.PrintWriter ) java.io.Writer ; } else if ( java.io.Writer != null ) { this . java.io.PrintWriter = new java.io.PrintWriter ( java.io.Writer ) ; } }  <METHOD_END>
<METHOD_START> protected java.io.PrintWriter java.io.PrintWriter ( ) java.io.IOException { if ( this . java.io.PrintWriter == null ) { this . java.io.PrintWriter = this . org.springframework.mock.web.HttpServletResponse . getWriter ( ) ; } return this . java.io.PrintWriter ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.io.IOException { if ( this . org.springframework.mock.web.HttpServletResponse . isCommitted ( ) ) { throw new java.io.IOException ( STRING ) ; } this . org.springframework.mock.web.HttpServletResponse . resetBuffer ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.io.IOException {	}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.io.IOException { this . org.springframework.mock.web.HttpServletResponse . flushBuffer ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.io.IOException { void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return java.lang.Integer . int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.io.IOException { java.io.PrintWriter ( ) . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( char char[] [] , int int , int int ) throws java.io.IOException { java.io.PrintWriter ( ) . void ( char[] , int , int ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( boolean boolean ) throws java.io.IOException { java.io.PrintWriter ( ) . void ( boolean ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( char char ) throws java.io.IOException { java.io.PrintWriter ( ) . void ( char ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( char [] char[] ) throws java.io.IOException { java.io.PrintWriter ( ) . void ( char[] ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( double double ) throws java.io.IOException { java.io.PrintWriter ( ) . void ( double ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( float float ) throws java.io.IOException { java.io.PrintWriter ( ) . void ( float ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( int int ) throws java.io.IOException { java.io.PrintWriter ( ) . void ( int ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( long long ) throws java.io.IOException { java.io.PrintWriter ( ) . void ( long ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object ) throws java.io.IOException { java.io.PrintWriter ( ) . void ( java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String ) throws java.io.IOException { java.io.PrintWriter ( ) . void ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.io.IOException { java.io.PrintWriter ( ) . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( boolean boolean ) throws java.io.IOException { java.io.PrintWriter ( ) . void ( boolean ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( char char ) throws java.io.IOException { java.io.PrintWriter ( ) . void ( char ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( char [] char[] ) throws java.io.IOException { java.io.PrintWriter ( ) . void ( char[] ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( double double ) throws java.io.IOException { java.io.PrintWriter ( ) . void ( double ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( float float ) throws java.io.IOException { java.io.PrintWriter ( ) . void ( float ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( int int ) throws java.io.IOException { java.io.PrintWriter ( ) . void ( int ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( long long ) throws java.io.IOException { java.io.PrintWriter ( ) . void ( long ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object ) throws java.io.IOException { java.io.PrintWriter ( ) . void ( java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String ) throws java.io.IOException { java.io.PrintWriter ( ) . void ( java.lang.String ) ; }  <METHOD_END>
