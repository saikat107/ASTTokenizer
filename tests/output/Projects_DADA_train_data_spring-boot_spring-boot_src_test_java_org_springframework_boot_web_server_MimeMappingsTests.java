<METHOD_START> @ Test ( expected = java.lang.UnsupportedOperationException .class ) public void void ( ) java.lang.Exception { MimeMappings . DEFAULT . add ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MimeMappings org.springframework.boot.web.server.MimeMappings = new MimeMappings ( ) ; org.springframework.boot.web.server.MimeMappings . add ( STRING , STRING ) ; MimeMappings org.springframework.boot.web.server.MimeMappings = new MimeMappings ( org.springframework.boot.web.server.MimeMappings ) ; org.springframework.boot.web.server.MimeMappings . add ( STRING , STRING ) ; assertThat ( org.springframework.boot.web.server.MimeMappings . get ( STRING ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.boot.web.server.MimeMappings . get ( STRING ) ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = new java.util.HashMap<java.lang.String,java.lang.String> <> ( ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , STRING ) ; MimeMappings org.springframework.boot.web.server.MimeMappings = new MimeMappings ( java.util.Map<java.lang.String,java.lang.String> ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , STRING ) ; assertThat ( org.springframework.boot.web.server.MimeMappings . get ( STRING ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.boot.web.server.MimeMappings . get ( STRING ) ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MimeMappings org.springframework.boot.web.server.MimeMappings = new MimeMappings ( ) ; org.springframework.boot.web.server.MimeMappings . add ( STRING , STRING ) ; org.springframework.boot.web.server.MimeMappings . add ( STRING , STRING ) ; java.util.List<MimeMappings.Mapping> < MimeMappings . MimeMappings > java.util.List<MimeMappings.Mapping> = new java.util.ArrayList<MimeMappings.Mapping> <> ( ) ; for ( MimeMappings . MimeMappings MimeMappings.Mapping : org.springframework.boot.web.server.MimeMappings ) { java.util.List<MimeMappings.Mapping> . add ( MimeMappings.Mapping ) ; } assertThat ( java.util.List<MimeMappings.Mapping> . get ( NUMBER ) . getExtension ( ) ) . isEqualTo ( STRING ) ; assertThat ( java.util.List<MimeMappings.Mapping> . get ( NUMBER ) . getMimeType ( ) ) . isEqualTo ( STRING ) ; assertThat ( java.util.List<MimeMappings.Mapping> . get ( NUMBER ) . getExtension ( ) ) . isEqualTo ( STRING ) ; assertThat ( java.util.List<MimeMappings.Mapping> . get ( NUMBER ) . getMimeType ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MimeMappings org.springframework.boot.web.server.MimeMappings = new MimeMappings ( ) ; org.springframework.boot.web.server.MimeMappings . add ( STRING , STRING ) ; org.springframework.boot.web.server.MimeMappings . add ( STRING , STRING ) ; java.util.List<MimeMappings.Mapping> < MimeMappings . MimeMappings > java.util.List<MimeMappings.Mapping> = new java.util.ArrayList<MimeMappings.Mapping> <> ( ) ; java.util.List<MimeMappings.Mapping> . addAll ( org.springframework.boot.web.server.MimeMappings . getAll ( ) ) ; assertThat ( java.util.List<MimeMappings.Mapping> . get ( NUMBER ) . getExtension ( ) ) . isEqualTo ( STRING ) ; assertThat ( java.util.List<MimeMappings.Mapping> . get ( NUMBER ) . getMimeType ( ) ) . isEqualTo ( STRING ) ; assertThat ( java.util.List<MimeMappings.Mapping> . get ( NUMBER ) . getExtension ( ) ) . isEqualTo ( STRING ) ; assertThat ( java.util.List<MimeMappings.Mapping> . get ( NUMBER ) . getMimeType ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MimeMappings org.springframework.boot.web.server.MimeMappings = new MimeMappings ( ) ; assertThat ( org.springframework.boot.web.server.MimeMappings . add ( STRING , STRING ) ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MimeMappings org.springframework.boot.web.server.MimeMappings = new MimeMappings ( ) ; org.springframework.boot.web.server.MimeMappings . add ( STRING , STRING ) ; assertThat ( org.springframework.boot.web.server.MimeMappings . add ( STRING , STRING ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MimeMappings org.springframework.boot.web.server.MimeMappings = new MimeMappings ( ) ; org.springframework.boot.web.server.MimeMappings . add ( STRING , STRING ) ; assertThat ( org.springframework.boot.web.server.MimeMappings . remove ( STRING ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.boot.web.server.MimeMappings . remove ( STRING ) ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MimeMappings org.springframework.boot.web.server.MimeMappings = new MimeMappings ( ) ; org.springframework.boot.web.server.MimeMappings . add ( STRING , STRING ) ; assertThat ( org.springframework.boot.web.server.MimeMappings . get ( STRING ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MimeMappings org.springframework.boot.web.server.MimeMappings = new MimeMappings ( ) ; assertThat ( org.springframework.boot.web.server.MimeMappings . get ( STRING ) ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MimeMappings org.springframework.boot.web.server.MimeMappings = new MimeMappings ( ) ; org.springframework.boot.web.server.MimeMappings . add ( STRING , STRING ) ; MimeMappings org.springframework.boot.web.server.MimeMappings = MimeMappings . unmodifiableMappings ( org.springframework.boot.web.server.MimeMappings ) ; try { org.springframework.boot.web.server.MimeMappings . remove ( STRING ) ; } catch ( java.lang.UnsupportedOperationException java.lang.UnsupportedOperationException ) { } org.springframework.boot.web.server.MimeMappings . remove ( STRING ) ; assertThat ( org.springframework.boot.web.server.MimeMappings . get ( STRING ) ) . isNull ( ) ; }  <METHOD_END>