<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> < Todo > java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> = new java.util.ArrayList<org.springframework.data.rest.webmvc.json.patch.Todo> < Todo > ( ) ; java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> . add ( new Todo ( NUMBER , STRING , false ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> . add ( new Todo ( NUMBER , STRING , false ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> . add ( new Todo ( NUMBER , STRING , false ) ) ; new RemoveOperation ( STRING ) . perform ( java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> , Todo .class ) ; assertNull ( java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> . get ( NUMBER ) . getDescription ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> < Todo > java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> = new java.util.ArrayList<org.springframework.data.rest.webmvc.json.patch.Todo> < Todo > ( ) ; java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> . add ( new Todo ( NUMBER , STRING , false ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> . add ( new Todo ( NUMBER , STRING , false ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> . add ( new Todo ( NUMBER , STRING , false ) ) ; new RemoveOperation ( STRING ) . perform ( java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> , Todo .class ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> . size ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> . get ( NUMBER ) . getDescription ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.data.rest.webmvc.json.patch.Todo> . get ( NUMBER ) . getDescription ( ) ) ; }  <METHOD_END>