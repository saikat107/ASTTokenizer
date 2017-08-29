<METHOD_START> protected java.util.Properties java.util.Properties ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { java.util.Properties java.util.Properties = new java.util.Properties ( ) ; java.util.Properties . java.lang.Object ( java.lang.String , java.lang.String ) ; return java.util.Properties ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { PropertiesBuilder org.springframework.data.gemfire.util.PropertiesBuilder = new PropertiesBuilder ( ) ; java.util.Properties java.util.Properties = org.springframework.data.gemfire.util.PropertiesBuilder . build ( ) ; assertThat ( java.util.Properties , is ( notNullValue ( java.util.Properties .class ) ) ) ; assertThat ( org.springframework.data.gemfire.util.PropertiesBuilder . getObject ( ) , is ( sameInstance ( java.util.Properties ) ) ) ; assertThat ( ( java.lang.Class<java.util.Properties> < java.util.Properties > ) org.springframework.data.gemfire.util.PropertiesBuilder . getObjectType ( ) , is ( equalTo ( java.util.Properties .class ) ) ) ; assertThat ( java.util.Properties . boolean ( ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Properties java.util.Properties = java.util.Properties ( STRING , STRING ) ; PropertiesBuilder org.springframework.data.gemfire.util.PropertiesBuilder = new PropertiesBuilder ( java.util.Properties ) ; java.util.Properties java.util.Properties = org.springframework.data.gemfire.util.PropertiesBuilder . build ( ) ; assertThat ( java.util.Properties , is ( notNullValue ( java.util.Properties .class ) ) ) ; assertThat ( java.util.Properties , is ( not ( sameInstance ( java.util.Properties ) ) ) ) ; assertThat ( java.util.Properties , is ( equalTo ( java.util.Properties ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { PropertiesBuilder org.springframework.data.gemfire.util.PropertiesBuilder = new PropertiesBuilder ( ) . setProperty ( STRING , STRING ) ; PropertiesBuilder org.springframework.data.gemfire.util.PropertiesBuilder = new PropertiesBuilder ( org.springframework.data.gemfire.util.PropertiesBuilder ) ; java.util.Properties java.util.Properties = org.springframework.data.gemfire.util.PropertiesBuilder . build ( ) ; assertThat ( java.util.Properties , is ( notNullValue ( java.util.Properties .class ) ) ) ; assertThat ( java.util.Properties . int ( ) , is ( equalTo ( NUMBER ) ) ) ; assertThat ( java.util.Properties . boolean ( STRING ) , is ( true ) ) ; assertThat ( java.util.Properties . java.lang.String ( STRING ) , is ( equalTo ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { java.io.ByteArrayOutputStream java.io.ByteArrayOutputStream = new java.io.ByteArrayOutputStream ( ) ; java.util.Properties java.util.Properties = java.util.Properties ( STRING , STRING ) ; java.util.Properties . void ( java.io.ByteArrayOutputStream , STRING ) ; java.util.Properties java.util.Properties = PropertiesBuilder . from ( new java.io.ByteArrayInputStream ( java.io.ByteArrayOutputStream . byte[] ( ) ) ) . build ( ) ; assertThat ( java.util.Properties , is ( notNullValue ( java.util.Properties .class ) ) ) ; assertThat ( java.util.Properties , is ( not ( sameInstance ( java.util.Properties ) ) ) ) ; assertThat ( java.util.Properties , is ( equalTo ( java.util.Properties ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { java.io.StringWriter java.io.StringWriter = new java.io.StringWriter ( ) ; java.util.Properties java.util.Properties = java.util.Properties ( STRING , STRING ) ; java.util.Properties . void ( java.io.StringWriter , STRING ) ; java.util.Properties java.util.Properties = PropertiesBuilder . from ( new java.io.StringReader ( java.io.StringWriter . java.lang.String ( ) ) ) . build ( ) ; assertThat ( java.util.Properties , is ( notNullValue ( java.util.Properties .class ) ) ) ; assertThat ( java.util.Properties , is ( not ( sameInstance ( java.util.Properties ) ) ) ) ; assertThat ( java.util.Properties , is ( equalTo ( java.util.Properties ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { java.io.ByteArrayOutputStream java.io.ByteArrayOutputStream = new java.io.ByteArrayOutputStream ( ) ; java.util.Properties java.util.Properties = java.util.Properties ( STRING , STRING ) ; java.util.Properties . void ( java.io.ByteArrayOutputStream , STRING ) ; java.util.Properties java.util.Properties = PropertiesBuilder . fromXml ( new java.io.ByteArrayInputStream ( java.io.ByteArrayOutputStream . byte[] ( ) ) ) . build ( ) ; assertThat ( java.util.Properties , is ( notNullValue ( java.util.Properties .class ) ) ) ; assertThat ( java.util.Properties , is ( not ( sameInstance ( java.util.Properties ) ) ) ) ; assertThat ( java.util.Properties , is ( equalTo ( java.util.Properties ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { assertThat ( ( java.lang.Class<java.util.Properties> < java.util.Properties > ) PropertiesBuilder . create ( ) . getObjectType ( ) , is ( equalTo ( java.util.Properties .class ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( new PropertiesBuilder ( ) . isSingleton ( ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { PropertiesBuilder org.springframework.data.gemfire.util.PropertiesBuilder = PropertiesBuilder . create ( ) . setProperty ( STRING , STRING ) . setProperty ( STRING , STRING ) ; java.util.Properties java.util.Properties = org.springframework.data.gemfire.util.PropertiesBuilder . build ( ) ; assertThat ( java.util.Properties , is ( notNullValue ( java.util.Properties .class ) ) ) ; assertThat ( java.util.Properties . int ( ) , is ( NUMBER ) ) ; assertThat ( java.util.Properties . boolean ( STRING ) , is ( true ) ) ; assertThat ( java.util.Properties . boolean ( STRING ) , is ( true ) ) ; assertThat ( java.util.Properties . boolean ( STRING ) , is ( false ) ) ; assertThat ( java.util.Properties . java.lang.String ( STRING ) , is ( equalTo ( STRING ) ) ) ; assertThat ( java.util.Properties . java.lang.String ( STRING ) , is ( equalTo ( STRING ) ) ) ; java.util.Properties java.util.Properties = new java.util.Properties ( ) ; java.util.Properties . java.lang.Object ( STRING , STRING ) ; java.util.Properties . java.lang.Object ( STRING , STRING ) ; org.springframework.data.gemfire.util.PropertiesBuilder . add ( java.util.Properties ) ; java.util.Properties = org.springframework.data.gemfire.util.PropertiesBuilder . build ( ) ; assertThat ( java.util.Properties , is ( notNullValue ( java.util.Properties .class ) ) ) ; assertThat ( java.util.Properties . int ( ) , is ( equalTo ( NUMBER ) ) ) ; assertThat ( java.util.Properties , is ( not ( sameInstance ( java.util.Properties ) ) ) ) ; assertThat ( java.util.Properties . boolean ( STRING ) , is ( true ) ) ; assertThat ( java.util.Properties . boolean ( STRING ) , is ( true ) ) ; assertThat ( java.util.Properties . boolean ( STRING ) , is ( true ) ) ; assertThat ( java.util.Properties . java.lang.String ( STRING ) , is ( equalTo ( STRING ) ) ) ; assertThat ( java.util.Properties . java.lang.String ( STRING ) , is ( equalTo ( STRING ) ) ) ; assertThat ( java.util.Properties . java.lang.String ( STRING ) , is ( equalTo ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { PropertiesBuilder org.springframework.data.gemfire.util.PropertiesBuilder = PropertiesBuilder . create ( ) . setProperty ( STRING , STRING ) . setProperty ( STRING , STRING ) ; java.util.Properties java.util.Properties = PropertiesBuilder . create ( ) . add ( org.springframework.data.gemfire.util.PropertiesBuilder ) . build ( ) ; assertThat ( java.util.Properties , is ( notNullValue ( java.util.Properties .class ) ) ) ; assertThat ( java.util.Properties . int ( ) , is ( equalTo ( NUMBER ) ) ) ; assertThat ( java.util.Properties . boolean ( STRING ) , is ( true ) ) ; assertThat ( java.util.Properties . boolean ( STRING ) , is ( true ) ) ; assertThat ( java.util.Properties . java.lang.String ( STRING ) , is ( equalTo ( STRING ) ) ) ; assertThat ( java.util.Properties . java.lang.String ( STRING ) , is ( equalTo ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Properties java.util.Properties = PropertiesBuilder . create ( ) . setProperty ( STRING , java.lang.Boolean . java.lang.Boolean ) . setProperty ( STRING , 'A' ) . setProperty ( STRING , NUMBER ) . setProperty ( STRING , java.lang.Math . double ) . setProperty ( STRING , ( java.lang.Object ) STRING ) . build ( ) ; assertThat ( java.util.Properties , is ( notNullValue ( java.util.Properties .class ) ) ) ; assertThat ( java.util.Properties . int ( ) , is ( equalTo ( NUMBER ) ) ) ; assertThat ( java.util.Properties . java.lang.String ( STRING ) , is ( equalTo ( java.lang.Boolean . java.lang.Boolean . java.lang.String ( ) ) ) ) ; assertThat ( java.util.Properties . java.lang.String ( STRING ) , is ( equalTo ( STRING ) ) ) ; assertThat ( java.util.Properties . java.lang.String ( STRING ) , is ( equalTo ( STRING ) ) ) ; assertThat ( java.util.Properties . java.lang.String ( STRING ) , is ( equalTo ( java.lang.String . java.lang.String ( java.lang.Math . double ) ) ) ) ; assertThat ( java.util.Properties . java.lang.String ( STRING ) , is ( equalTo ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Properties java.util.Properties = PropertiesBuilder . create ( ) . setProperty ( STRING , new java.lang.Object [] { STRING , STRING , STRING } ) . build ( ) ; assertThat ( java.util.Properties , is ( notNullValue ( java.util.Properties .class ) ) ) ; assertThat ( java.util.Properties . int ( ) , is ( equalTo ( NUMBER ) ) ) ; assertThat ( java.util.Properties . boolean ( STRING ) , is ( true ) ) ; assertThat ( java.util.Properties . java.lang.String ( STRING ) , is ( equalTo ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Properties java.util.Properties = PropertiesBuilder . create ( ) . setProperty ( STRING , ( java.lang.Object ) null ) . build ( ) ; assertThat ( java.util.Properties , is ( notNullValue ( java.util.Properties .class ) ) ) ; assertThat ( java.util.Properties . boolean ( ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Properties java.util.Properties = PropertiesBuilder . create ( ) . setProperty ( STRING , STRING ) . setProperty ( STRING , STRING ) . setProperty ( STRING , STRING ) . setProperty ( STRING , STRING ) . build ( ) ; assertThat ( java.util.Properties , is ( notNullValue ( java.util.Properties .class ) ) ) ; assertThat ( java.util.Properties . boolean ( ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Properties java.util.Properties = PropertiesBuilder . create ( ) . setProperty ( STRING , new java.lang.Object [ NUMBER ] ) . build ( ) ; assertThat ( java.util.Properties , is ( notNullValue ( java.util.Properties .class ) ) ) ; assertThat ( java.util.Properties . boolean ( ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Properties java.util.Properties = PropertiesBuilder . create ( ) . setProperty ( STRING , ( java.lang.Object [] ) null ) . build ( ) ; assertThat ( java.util.Properties , is ( notNullValue ( java.util.Properties .class ) ) ) ; assertThat ( java.util.Properties . boolean ( ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Properties java.util.Properties = PropertiesBuilder . create ( ) . setProperty ( STRING , STRING ) . setProperty ( STRING , STRING ) . build ( ) ; assertThat ( java.util.Properties , is ( notNullValue ( java.util.Properties .class ) ) ) ; assertThat ( java.util.Properties . int ( ) , is ( equalTo ( NUMBER ) ) ) ; assertThat ( java.util.Properties . boolean ( STRING ) , is ( true ) ) ; assertThat ( java.util.Properties . boolean ( STRING ) , is ( true ) ) ; assertThat ( java.util.Properties . java.lang.String ( STRING ) , is ( equalTo ( STRING ) ) ) ; assertThat ( java.util.Properties . java.lang.String ( STRING ) , is ( equalTo ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Properties java.util.Properties = PropertiesBuilder . create ( ) . unsetProperty ( STRING ) . build ( ) ; assertThat ( java.util.Properties , is ( notNullValue ( java.util.Properties .class ) ) ) ; assertThat ( java.util.Properties . int ( ) , is ( equalTo ( NUMBER ) ) ) ; assertThat ( java.util.Properties . boolean ( STRING ) , is ( true ) ) ; assertThat ( java.util.Properties . java.lang.String ( STRING ) , is ( equalTo ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( PropertiesBuilder . create ( ) . isValuable ( STRING ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( PropertiesBuilder . create ( ) . isValuable ( STRING ) , is ( false ) ) ; assertThat ( PropertiesBuilder . create ( ) . isValuable ( STRING ) , is ( false ) ) ; assertThat ( PropertiesBuilder . create ( ) . isValuable ( STRING ) , is ( false ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( PropertiesBuilder . create ( ) . isValuable ( STRING ) , is ( false ) ) ; assertThat ( PropertiesBuilder . create ( ) . isValuable ( STRING ) , is ( false ) ) ; }  <METHOD_END>