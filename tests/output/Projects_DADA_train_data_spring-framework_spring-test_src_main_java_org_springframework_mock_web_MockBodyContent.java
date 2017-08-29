<METHOD_START> public void ( java.lang.String java.lang.String , HttpServletResponse org.springframework.mock.web.HttpServletResponse ) { this( java.lang.String , org.springframework.mock.web.HttpServletResponse , null ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , java.io.Writer java.io.Writer ) { this( java.lang.String , null , java.io.Writer ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , HttpServletResponse org.springframework.mock.web.HttpServletResponse , java.io.Writer java.io.Writer ) { super( org.springframework.mock.web.JspWriter ( java.io.Writer , org.springframework.mock.web.HttpServletResponse ) ); this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> private static org.springframework.mock.web.JspWriter org.springframework.mock.web.JspWriter ( java.io.Writer java.io.Writer , HttpServletResponse org.springframework.mock.web.HttpServletResponse ) { if ( java.io.Writer instanceof JspWriter ) { return ( JspWriter ) java.io.Writer ; } else { return new MockJspWriter ( org.springframework.mock.web.HttpServletResponse , java.io.Writer ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.io.Reader java.io.Reader ( ) { return new java.io.StringReader ( this . java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.io.Writer java.io.Writer ) throws java.io.IOException { java.io.Writer . void ( this . java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.io.IOException { getEnclosingWriter ( ) . clear ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.io.IOException { getEnclosingWriter ( ) . clearBuffer ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.io.IOException { getEnclosingWriter ( ) . close ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return getEnclosingWriter ( ) . getRemaining ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.io.IOException { getEnclosingWriter ( ) . println ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( char char[] [] , int int , int int ) throws java.io.IOException { getEnclosingWriter ( ) . write ( char[] , int , int ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( boolean boolean ) throws java.io.IOException { getEnclosingWriter ( ) . print ( boolean ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( char char ) throws java.io.IOException { getEnclosingWriter ( ) . print ( char ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( char [] char[] ) throws java.io.IOException { getEnclosingWriter ( ) . print ( char[] ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( double double ) throws java.io.IOException { getEnclosingWriter ( ) . print ( double ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( float float ) throws java.io.IOException { getEnclosingWriter ( ) . print ( float ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( int int ) throws java.io.IOException { getEnclosingWriter ( ) . print ( int ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( long long ) throws java.io.IOException { getEnclosingWriter ( ) . print ( long ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object ) throws java.io.IOException { getEnclosingWriter ( ) . print ( java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String ) throws java.io.IOException { getEnclosingWriter ( ) . print ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.io.IOException { getEnclosingWriter ( ) . println ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( boolean boolean ) throws java.io.IOException { getEnclosingWriter ( ) . println ( boolean ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( char char ) throws java.io.IOException { getEnclosingWriter ( ) . println ( char ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( char [] char[] ) throws java.io.IOException { getEnclosingWriter ( ) . println ( char[] ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( double double ) throws java.io.IOException { getEnclosingWriter ( ) . println ( double ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( float float ) throws java.io.IOException { getEnclosingWriter ( ) . println ( float ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( int int ) throws java.io.IOException { getEnclosingWriter ( ) . println ( int ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( long long ) throws java.io.IOException { getEnclosingWriter ( ) . println ( long ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object ) throws java.io.IOException { getEnclosingWriter ( ) . println ( java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String ) throws java.io.IOException { getEnclosingWriter ( ) . println ( java.lang.String ) ; }  <METHOD_END>
