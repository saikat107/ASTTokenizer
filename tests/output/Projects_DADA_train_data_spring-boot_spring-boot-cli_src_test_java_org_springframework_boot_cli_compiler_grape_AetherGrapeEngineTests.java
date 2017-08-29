<METHOD_START> private org.springframework.boot.cli.compiler.grape.AetherGrapeEngine org.springframework.boot.cli.compiler.grape.AetherGrapeEngine ( RepositoryConfiguration ... org.springframework.boot.cli.compiler.grape.RepositoryConfiguration[] ) { java.util.List<org.springframework.boot.cli.compiler.grape.RepositoryConfiguration> < RepositoryConfiguration > java.util.List<org.springframework.boot.cli.compiler.grape.RepositoryConfiguration> = new java.util.ArrayList<org.springframework.boot.cli.compiler.grape.RepositoryConfiguration> <> ( ) ; java.util.List<org.springframework.boot.cli.compiler.grape.RepositoryConfiguration> . add ( new RepositoryConfiguration ( STRING , java.net.URI . java.net.URI ( STRING ) , false ) ) ; java.util.List<org.springframework.boot.cli.compiler.grape.RepositoryConfiguration> . addAll ( java.util.Arrays . java.util.List ( org.springframework.boot.cli.compiler.grape.RepositoryConfiguration[] ) ) ; DependencyResolutionContext org.springframework.boot.cli.compiler.grape.DependencyResolutionContext = new DependencyResolutionContext ( ) ; org.springframework.boot.cli.compiler.grape.DependencyResolutionContext . addDependencyManagement ( new SpringBootDependenciesDependencyManagement ( ) ) ; return AetherGrapeEngineFactory . create ( this . org.springframework.boot.cli.compiler.grape.GroovyClassLoader , java.util.List<org.springframework.boot.cli.compiler.grape.RepositoryConfiguration> , org.springframework.boot.cli.compiler.grape.DependencyResolutionContext ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; org.springframework.boot.cli.compiler.grape.AetherGrapeEngine ( this . org.springframework.boot.cli.compiler.grape.RepositoryConfiguration ) . grab ( java.util.Map<java.lang.String,java.lang.Object> , java.util.Map<java.lang.String,java.lang.Object> ( STRING , STRING , null ) ) ; assertThat ( this . org.springframework.boot.cli.compiler.grape.GroovyClassLoader . getURLs ( ) ) . hasSize ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( new java.lang.Runnable ( ) { @ java.lang.Override public void void ( ) { AetherGrapeEngine org.springframework.boot.cli.compiler.grape.AetherGrapeEngine = org.springframework.boot.cli.compiler.grape.AetherGrapeEngine ( ) ; DefaultRepositorySystemSession org.springframework.boot.cli.compiler.grape.DefaultRepositorySystemSession = ( DefaultRepositorySystemSession ) ReflectionTestUtils . getField ( org.springframework.boot.cli.compiler.grape.AetherGrapeEngine , STRING ) ; assertThat ( org.springframework.boot.cli.compiler.grape.DefaultRepositorySystemSession . getProxySelector ( ) instanceof CompositeProxySelector ) . isTrue ( ) ; } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { AetherGrapeEngine org.springframework.boot.cli.compiler.grape.AetherGrapeEngine = org.springframework.boot.cli.compiler.grape.AetherGrapeEngine ( ) ; DefaultRepositorySystemSession org.springframework.boot.cli.compiler.grape.DefaultRepositorySystemSession = ( DefaultRepositorySystemSession ) ReflectionTestUtils . getField ( org.springframework.boot.cli.compiler.grape.AetherGrapeEngine , STRING ) ; assertThat ( org.springframework.boot.cli.compiler.grape.DefaultRepositorySystemSession . getProxySelector ( ) instanceof CompositeProxySelector ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( new java.lang.Runnable ( ) { @ java.lang.SuppressWarnings ( STRING ) @ java.lang.Override public void void ( ) { AetherGrapeEngine org.springframework.boot.cli.compiler.grape.AetherGrapeEngine = org.springframework.boot.cli.compiler.grape.AetherGrapeEngine ( ) ; java.util.List<org.springframework.boot.cli.compiler.grape.RemoteRepository> < RemoteRepository > java.util.List<org.springframework.boot.cli.compiler.grape.RemoteRepository> = ( java.util.List<org.springframework.boot.cli.compiler.grape.RemoteRepository> < RemoteRepository > ) ReflectionTestUtils . getField ( org.springframework.boot.cli.compiler.grape.AetherGrapeEngine , STRING ) ; assertThat ( java.util.List<org.springframework.boot.cli.compiler.grape.RemoteRepository> ) . hasSize ( NUMBER ) ; assertThat ( java.util.List<org.springframework.boot.cli.compiler.grape.RemoteRepository> . get ( NUMBER ) . getId ( ) ) . isEqualTo ( STRING ) ; } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) @ java.lang.Override public void void ( ) { AetherGrapeEngine org.springframework.boot.cli.compiler.grape.AetherGrapeEngine = org.springframework.boot.cli.compiler.grape.AetherGrapeEngine ( ) ; java.util.List<org.springframework.boot.cli.compiler.grape.RemoteRepository> < RemoteRepository > java.util.List<org.springframework.boot.cli.compiler.grape.RemoteRepository> = ( java.util.List<org.springframework.boot.cli.compiler.grape.RemoteRepository> < RemoteRepository > ) ReflectionTestUtils . getField ( org.springframework.boot.cli.compiler.grape.AetherGrapeEngine , STRING ) ; assertThat ( java.util.List<org.springframework.boot.cli.compiler.grape.RemoteRepository> ) . hasSize ( NUMBER ) ; assertThat ( java.util.List<org.springframework.boot.cli.compiler.grape.RemoteRepository> . get ( NUMBER ) . getId ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( new java.lang.Runnable ( ) { @ java.lang.SuppressWarnings ( STRING ) @ java.lang.Override public void void ( ) { AetherGrapeEngine org.springframework.boot.cli.compiler.grape.AetherGrapeEngine = org.springframework.boot.cli.compiler.grape.AetherGrapeEngine ( ) ; java.util.List<org.springframework.boot.cli.compiler.grape.RemoteRepository> < RemoteRepository > java.util.List<org.springframework.boot.cli.compiler.grape.RemoteRepository> = ( java.util.List<org.springframework.boot.cli.compiler.grape.RemoteRepository> < RemoteRepository > ) ReflectionTestUtils . getField ( org.springframework.boot.cli.compiler.grape.AetherGrapeEngine , STRING ) ; assertThat ( java.util.List<org.springframework.boot.cli.compiler.grape.RemoteRepository> ) . hasSize ( NUMBER ) ; Authentication org.springframework.boot.cli.compiler.grape.Authentication = java.util.List<org.springframework.boot.cli.compiler.grape.RemoteRepository> . get ( NUMBER ) . getAuthentication ( ) ; assertThat ( org.springframework.boot.cli.compiler.grape.Authentication ) . isNotNull ( ) ; } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) @ java.lang.Override public void void ( ) { AetherGrapeEngine org.springframework.boot.cli.compiler.grape.AetherGrapeEngine = org.springframework.boot.cli.compiler.grape.AetherGrapeEngine ( ) ; java.util.List<org.springframework.boot.cli.compiler.grape.RemoteRepository> < RemoteRepository > java.util.List<org.springframework.boot.cli.compiler.grape.RemoteRepository> = ( java.util.List<org.springframework.boot.cli.compiler.grape.RemoteRepository> < RemoteRepository > ) ReflectionTestUtils . getField ( org.springframework.boot.cli.compiler.grape.AetherGrapeEngine , STRING ) ; assertThat ( java.util.List<org.springframework.boot.cli.compiler.grape.RemoteRepository> ) . hasSize ( NUMBER ) ; Authentication org.springframework.boot.cli.compiler.grape.Authentication = java.util.List<org.springframework.boot.cli.compiler.grape.RemoteRepository> . get ( NUMBER ) . getAuthentication ( ) ; assertThat ( org.springframework.boot.cli.compiler.grape.Authentication ) . isNotNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , java.util.Arrays . java.util.List<java.util.Map<java.lang.String,java.lang.Object>> ( java.util.Map<java.lang.String,java.lang.Object> ( STRING , STRING ) ) ) ; org.springframework.boot.cli.compiler.grape.AetherGrapeEngine ( this . org.springframework.boot.cli.compiler.grape.RepositoryConfiguration ) . grab ( java.util.Map<java.lang.String,java.lang.Object> , java.util.Map<java.lang.String,java.lang.Object> ( STRING , STRING , STRING ) , java.util.Map<java.lang.String,java.lang.Object> ( STRING , STRING , STRING ) ) ; assertThat ( this . org.springframework.boot.cli.compiler.grape.GroovyClassLoader . getURLs ( ) . length ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; org.springframework.boot.cli.compiler.grape.AetherGrapeEngine ( ) . grab ( java.util.Map<java.lang.String,java.lang.Object> , java.util.Map<java.lang.String,java.lang.Object> ( STRING , STRING , STRING , false ) ) ; assertThat ( this . org.springframework.boot.cli.compiler.grape.GroovyClassLoader . getURLs ( ) . length ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; GroovyClassLoader org.springframework.boot.cli.compiler.grape.GroovyClassLoader = new GroovyClassLoader ( ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , org.springframework.boot.cli.compiler.grape.GroovyClassLoader ) ; org.springframework.boot.cli.compiler.grape.AetherGrapeEngine ( this . org.springframework.boot.cli.compiler.grape.RepositoryConfiguration ) . grab ( java.util.Map<java.lang.String,java.lang.Object> , java.util.Map<java.lang.String,java.lang.Object> ( STRING , STRING , null ) ) ; assertThat ( this . org.springframework.boot.cli.compiler.grape.GroovyClassLoader . getURLs ( ) . length ) . isEqualTo ( NUMBER ) ; assertThat ( org.springframework.boot.cli.compiler.grape.GroovyClassLoader . getURLs ( ) . length ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; AetherGrapeEngine org.springframework.boot.cli.compiler.grape.AetherGrapeEngine = this . org.springframework.boot.cli.compiler.grape.AetherGrapeEngine ( ) ; org.springframework.boot.cli.compiler.grape.AetherGrapeEngine . addResolver ( java.util.Map<java.lang.String,java.lang.Object> ( STRING , STRING ) ) ; org.springframework.boot.cli.compiler.grape.AetherGrapeEngine . grab ( java.util.Map<java.lang.String,java.lang.Object> , java.util.Map<java.lang.String,java.lang.Object> ( STRING , STRING , STRING ) ) ; assertThat ( this . org.springframework.boot.cli.compiler.grape.GroovyClassLoader . getURLs ( ) . length ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = java.util.Map<java.lang.String,java.lang.Object> ( STRING , STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; org.springframework.boot.cli.compiler.grape.AetherGrapeEngine ( ) . grab ( java.util.Collections . java.util.Map<java.lang.Object,java.lang.Object> ( ) , java.util.Map<java.lang.String,java.lang.Object> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = java.util.Map<java.lang.String,java.lang.Object> ( STRING , STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; org.springframework.boot.cli.compiler.grape.AetherGrapeEngine ( ) . grab ( java.util.Map<java.lang.String,java.lang.Object> , java.util.Map<java.lang.String,java.lang.Object> ) ; java.net.URL [] java.net.URL[] = this . org.springframework.boot.cli.compiler.grape.GroovyClassLoader . getURLs ( ) ; assertThat ( java.net.URL[] . int ) . isEqualTo ( NUMBER ) ; assertThat ( java.net.URL[] [ NUMBER ] . java.lang.String ( ) . boolean ( STRING ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = java.util.Map<java.lang.String,java.lang.Object> ( STRING , STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; org.springframework.boot.cli.compiler.grape.AetherGrapeEngine ( ) . grab ( java.util.Map<java.lang.String,java.lang.Object> , java.util.Map<java.lang.String,java.lang.Object> ) ; java.net.URL [] java.net.URL[] = this . org.springframework.boot.cli.compiler.grape.GroovyClassLoader . getURLs ( ) ; assertThat ( java.net.URL[] . int ) . isEqualTo ( NUMBER ) ; assertThat ( java.net.URL[] [ NUMBER ] . java.lang.String ( ) . boolean ( STRING ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = java.util.Map<java.lang.String,java.lang.Object> ( STRING , STRING , STRING , false ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; org.springframework.boot.cli.compiler.grape.AetherGrapeEngine ( ) . grab ( java.util.Map<java.lang.String,java.lang.Object> , java.util.Map<java.lang.String,java.lang.Object> ) ; java.net.URL [] java.net.URL[] = this . org.springframework.boot.cli.compiler.grape.GroovyClassLoader . getURLs ( ) ; assertThat ( java.net.URL[] . int ) . isEqualTo ( NUMBER ) ; assertThat ( java.net.URL[] [ NUMBER ] . java.lang.String ( ) . boolean ( STRING ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> private java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( java.lang.String java.lang.String , java.lang.String java.lang.String , java.lang.String java.lang.String ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , java.lang.String ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , java.lang.String ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , java.lang.String ) ; return java.util.Map<java.lang.String,java.lang.Object> ; }  <METHOD_END>
<METHOD_START> private java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( java.lang.String java.lang.String , java.lang.String java.lang.String , java.lang.String java.lang.String , boolean boolean ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = java.util.Map<java.lang.String,java.lang.Object> ( java.lang.String , java.lang.String , java.lang.String ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , boolean ) ; return java.util.Map<java.lang.String,java.lang.Object> ; }  <METHOD_END>
<METHOD_START> private java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , java.lang.String ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , java.lang.String ) ; return java.util.Map<java.lang.String,java.lang.Object> ; }  <METHOD_END>
<METHOD_START> private java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , java.lang.String ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , java.lang.String ) ; return java.util.Map<java.lang.String,java.lang.Object> ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Runnable java.lang.Runnable ) { void ( STRING , new java.io.File ( STRING ) . java.lang.String ( ) , java.lang.Runnable ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String , java.lang.String java.lang.String , java.lang.Runnable java.lang.Runnable ) { java.lang.String java.lang.String = java.lang.String ( java.lang.String , java.lang.String ) ; try { java.lang.Runnable . void ( ) ; } finally { java.lang.String ( java.lang.String , java.lang.String ) ; } }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { if ( java.lang.String != null ) { return java.lang.System . java.lang.String ( java.lang.String , java.lang.String ) ; } return java.lang.System . java.lang.String ( java.lang.String ) ; }  <METHOD_END>