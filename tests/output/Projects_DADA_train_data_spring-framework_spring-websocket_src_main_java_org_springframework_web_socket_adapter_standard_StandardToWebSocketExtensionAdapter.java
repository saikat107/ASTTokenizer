<METHOD_START> public void ( Extension org.springframework.web.socket.adapter.standard.Extension ) { super( org.springframework.web.socket.adapter.standard.Extension . getName ( ) , java.util.Map<java.lang.String,java.lang.String> ( org.springframework.web.socket.adapter.standard.Extension ) ); }  <METHOD_END>
<METHOD_START> private static java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> ( Extension org.springframework.web.socket.adapter.standard.Extension ) { java.util.List<Extension.Parameter> < Extension . Extension > java.util.List<Extension.Parameter> = org.springframework.web.socket.adapter.standard.Extension . getParameters ( ) ; java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = new LinkedCaseInsensitiveMap <> ( java.util.List<Extension.Parameter> . size ( ) , java.util.Locale . java.util.Locale ) ; for ( Extension . Extension Extension.Parameter : java.util.List<Extension.Parameter> ) { java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( Extension.Parameter . getName ( ) , Extension.Parameter . getValue ( ) ) ; } return java.util.Map<java.lang.String,java.lang.String> ; }  <METHOD_END>