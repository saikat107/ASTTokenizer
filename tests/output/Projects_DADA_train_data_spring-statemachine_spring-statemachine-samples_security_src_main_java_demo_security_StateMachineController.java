<METHOD_START> @ RequestMapping ( STRING ) public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ RequestMapping ( STRING ) public java.lang.String java.lang.String ( @ RequestParam ( value = STRING , required = false ) Events demo.security.Events , Model demo.security.Model ) { if ( demo.security.Events != null ) { try { demo.security.StateMachine<demo.security.States,demo.security.Events> . sendEvent ( demo.security.Events ) ; } catch ( java.lang.Exception java.lang.Exception ) { demo.security.Log . error ( STRING , java.lang.Exception ) ; } } demo.security.Model . addAttribute ( STRING , demo.security.StateMachine<demo.security.States,demo.security.Events> . getState ( ) . getIds ( ) ) ; demo.security.Model . addAttribute ( STRING , java.lang.String ) ; return STRING ; }  <METHOD_END>