<METHOD_START> @ Test public void void ( ) { java.lang.String java.lang.String = STRING ; StringQuery org.springframework.data.jpa.repository.query.StringQuery = new StringQuery ( java.lang.String ) ; assertThat ( org.springframework.data.jpa.repository.query.StringQuery . hasParameterBindings ( ) , is ( true ) ) ; assertThat ( org.springframework.data.jpa.repository.query.StringQuery . getQueryString ( ) , is ( java.lang.String ) ) ; java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> < ParameterBinding > java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> = org.springframework.data.jpa.repository.query.StringQuery . getParameterBindings ( ) ; assertThat ( java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> , hasSize ( NUMBER ) ) ; LikeParameterBinding org.springframework.data.jpa.repository.query.LikeParameterBinding = ( LikeParameterBinding ) java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> . get ( NUMBER ) ; assertThat ( org.springframework.data.jpa.repository.query.LikeParameterBinding . getType ( ) , is ( Type . LIKE ) ) ; assertThat ( org.springframework.data.jpa.repository.query.LikeParameterBinding . hasName ( STRING ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { StringQuery org.springframework.data.jpa.repository.query.StringQuery = new StringQuery ( STRING ) ; assertThat ( org.springframework.data.jpa.repository.query.StringQuery . hasParameterBindings ( ) , is ( true ) ) ; assertThat ( org.springframework.data.jpa.repository.query.StringQuery . getQueryString ( ) , is ( STRING ) ) ; java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> < ParameterBinding > java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> = org.springframework.data.jpa.repository.query.StringQuery . getParameterBindings ( ) ; assertThat ( java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> , hasSize ( NUMBER ) ) ; LikeParameterBinding org.springframework.data.jpa.repository.query.LikeParameterBinding = ( LikeParameterBinding ) java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> . get ( NUMBER ) ; assertThat ( org.springframework.data.jpa.repository.query.LikeParameterBinding , is ( notNullValue ( ) ) ) ; assertThat ( org.springframework.data.jpa.repository.query.LikeParameterBinding . hasPosition ( NUMBER ) , is ( true ) ) ; assertThat ( org.springframework.data.jpa.repository.query.LikeParameterBinding . getType ( ) , is ( Type . CONTAINING ) ) ; org.springframework.data.jpa.repository.query.LikeParameterBinding = ( LikeParameterBinding ) java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> . get ( NUMBER ) ; assertThat ( org.springframework.data.jpa.repository.query.LikeParameterBinding , is ( notNullValue ( ) ) ) ; assertThat ( org.springframework.data.jpa.repository.query.LikeParameterBinding . hasPosition ( NUMBER ) , is ( true ) ) ; assertThat ( org.springframework.data.jpa.repository.query.LikeParameterBinding . getType ( ) , is ( Type . ENDING_WITH ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { StringQuery org.springframework.data.jpa.repository.query.StringQuery = new StringQuery ( STRING ) ; assertThat ( org.springframework.data.jpa.repository.query.StringQuery . hasParameterBindings ( ) , is ( true ) ) ; assertThat ( org.springframework.data.jpa.repository.query.StringQuery . getQueryString ( ) , is ( STRING ) ) ; java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> < ParameterBinding > java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> = org.springframework.data.jpa.repository.query.StringQuery . getParameterBindings ( ) ; assertThat ( java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> , hasSize ( NUMBER ) ) ; LikeParameterBinding org.springframework.data.jpa.repository.query.LikeParameterBinding = ( LikeParameterBinding ) java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> . get ( NUMBER ) ; assertThat ( org.springframework.data.jpa.repository.query.LikeParameterBinding , is ( notNullValue ( ) ) ) ; assertThat ( org.springframework.data.jpa.repository.query.LikeParameterBinding . hasName ( STRING ) , is ( true ) ) ; assertThat ( org.springframework.data.jpa.repository.query.LikeParameterBinding . getType ( ) , is ( Type . ENDING_WITH ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.String java.lang.String = STRING ; StringQuery org.springframework.data.jpa.repository.query.StringQuery = new StringQuery ( java.lang.String ) ; assertThat ( org.springframework.data.jpa.repository.query.StringQuery . hasParameterBindings ( ) , is ( true ) ) ; assertThat ( org.springframework.data.jpa.repository.query.StringQuery . getQueryString ( ) , is ( java.lang.String ) ) ; java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> < ParameterBinding > java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> = org.springframework.data.jpa.repository.query.StringQuery . getParameterBindings ( ) ; assertThat ( java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> , hasSize ( NUMBER ) ) ; assertNamedBinding ( InParameterBinding .class , STRING , java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> . get ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.String java.lang.String = STRING ; StringQuery org.springframework.data.jpa.repository.query.StringQuery = new StringQuery ( java.lang.String ) ; assertThat ( org.springframework.data.jpa.repository.query.StringQuery . hasParameterBindings ( ) , is ( true ) ) ; assertThat ( org.springframework.data.jpa.repository.query.StringQuery . getQueryString ( ) , is ( java.lang.String ) ) ; java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> < ParameterBinding > java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> = org.springframework.data.jpa.repository.query.StringQuery . getParameterBindings ( ) ; assertThat ( java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> , hasSize ( NUMBER ) ) ; assertNamedBinding ( InParameterBinding .class , STRING , java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> . get ( NUMBER ) ) ; assertNamedBinding ( InParameterBinding .class , STRING , java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> . get ( NUMBER ) ) ; assertNamedBinding ( ParameterBinding .class , STRING , java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> . get ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.String java.lang.String = STRING ; StringQuery org.springframework.data.jpa.repository.query.StringQuery = new StringQuery ( java.lang.String ) ; assertThat ( org.springframework.data.jpa.repository.query.StringQuery . hasParameterBindings ( ) , is ( true ) ) ; assertThat ( org.springframework.data.jpa.repository.query.StringQuery . getQueryString ( ) , is ( java.lang.String ) ) ; java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> < ParameterBinding > java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> = org.springframework.data.jpa.repository.query.StringQuery . getParameterBindings ( ) ; assertThat ( java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> , hasSize ( NUMBER ) ) ; assertPositionalBinding ( InParameterBinding .class , NUMBER , java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> . get ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.String java.lang.String = STRING ; StringQuery org.springframework.data.jpa.repository.query.StringQuery = new StringQuery ( java.lang.String ) ; assertThat ( org.springframework.data.jpa.repository.query.StringQuery . hasParameterBindings ( ) , is ( true ) ) ; assertThat ( org.springframework.data.jpa.repository.query.StringQuery . getQueryString ( ) , is ( java.lang.String ) ) ; java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> < ParameterBinding > java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> = org.springframework.data.jpa.repository.query.StringQuery . getParameterBindings ( ) ; assertThat ( java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> , hasSize ( NUMBER ) ) ; assertPositionalBinding ( InParameterBinding .class , NUMBER , java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> . get ( NUMBER ) ) ; assertPositionalBinding ( InParameterBinding .class , NUMBER , java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> . get ( NUMBER ) ) ; assertPositionalBinding ( ParameterBinding .class , NUMBER , java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> . get ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { new StringQuery ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new StringQuery ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { StringQuery org.springframework.data.jpa.repository.query.StringQuery = new StringQuery ( STRING ) ; java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> < ParameterBinding > java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> = org.springframework.data.jpa.repository.query.StringQuery . getParameterBindings ( ) ; assertThat ( java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> , hasSize ( NUMBER ) ) ; assertPositionalBinding ( ParameterBinding .class , NUMBER , java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> . get ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { StringQuery org.springframework.data.jpa.repository.query.StringQuery = new StringQuery ( STRING + STRING ) ; java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> < ParameterBinding > java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> = org.springframework.data.jpa.repository.query.StringQuery . getParameterBindings ( ) ; assertThat ( java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> , hasSize ( NUMBER ) ) ; assertNamedBinding ( LikeParameterBinding .class , STRING , java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> . get ( NUMBER ) ) ; assertNamedBinding ( ParameterBinding .class , STRING , java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> . get ( NUMBER ) ) ; assertThat ( org.springframework.data.jpa.repository.query.StringQuery . getQueryString ( ) , is ( STRING + STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { StringQuery org.springframework.data.jpa.repository.query.StringQuery = new StringQuery ( STRING ) ; java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> < ParameterBinding > java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> = org.springframework.data.jpa.repository.query.StringQuery . getParameterBindings ( ) ; assertThat ( java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> , hasSize ( NUMBER ) ) ; assertNamedBinding ( InParameterBinding .class , STRING , java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> . get ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { StringQuery org.springframework.data.jpa.repository.query.StringQuery = new StringQuery ( STRING ) ; org.springframework.data.jpa.repository.query.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; org.springframework.data.jpa.repository.query.ExpectedException . expectMessage ( Param .class . java.lang.String ( ) ) ; org.springframework.data.jpa.repository.query.StringQuery . getBindingFor ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { StringQuery org.springframework.data.jpa.repository.query.StringQuery = new StringQuery ( STRING ) ; java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> < ParameterBinding > java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> = org.springframework.data.jpa.repository.query.StringQuery . getParameterBindings ( ) ; assertThat ( java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> , hasSize ( NUMBER ) ) ; assertNamedBinding ( InParameterBinding .class , STRING , java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> . get ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { StringQuery org.springframework.data.jpa.repository.query.StringQuery = new StringQuery ( STRING ) ; java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> < ParameterBinding > java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> = org.springframework.data.jpa.repository.query.StringQuery . getParameterBindings ( ) ; assertThat ( java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> , hasSize ( NUMBER ) ) ; assertNamedBinding ( InParameterBinding .class , STRING , java.util.List<org.springframework.data.jpa.repository.query.ParameterBinding> . get ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) {		StringQuery query = new StringQuery("select * fr  <METHOD_END>