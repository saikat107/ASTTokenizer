<METHOD_START> public void ( ) {	}  <METHOD_END>
<METHOD_START> public void ( javax.sql.DataSource javax.sql.DataSource , java.lang.String java.lang.String ) { super( javax.sql.DataSource , java.lang.String ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.jdbc.object.RowMapper<T> < T > org.springframework.jdbc.object.RowMapper<T> ( java.lang.Object [] java.lang.Object[] , java.util.Map<?,?> < ? , ? > java.util.Map<?,?> ) { return new org.springframework.jdbc.object.MappingSqlQueryWithParameters<T>.RowMapperImpl ( java.lang.Object[] , java.util.Map<,> ) ; }  <METHOD_END>
<METHOD_START> protected abstract T T ( java.sql.ResultSet java.sql.ResultSet , int int , java.lang.Object [] java.lang.Object[] , java.util.Map<?,?> < ? , ? > java.util.Map<?,?> )			throws java.sql.SQLException ;  <METHOD_END>
<METHOD_START> public void ( java.lang.Object [] java.lang.Object[] , java.util.Map<?,?> < ? , ? > java.util.Map<?,?> ) { this . java.lang.Object[] = java.lang.Object[] ; this . java.util.Map<?,?> = java.util.Map<,> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public T T ( java.sql.ResultSet java.sql.ResultSet , int int ) throws java.sql.SQLException { return org.springframework.jdbc.object.MappingSqlQueryWithParameters .this . T ( java.sql.ResultSet , int , this . java.lang.Object[] , this . java.util.Map<,> ) ; }  <METHOD_END>