<METHOD_START> public void void ( java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> ) { this . java.util.Map<java.lang.String,?> = java.util.Map<java.lang.String,> ; }  <METHOD_END>
<METHOD_START> public void void ( GroovyObjectCustomizer org.springframework.integration.groovy.GroovyObjectCustomizer ) { this . org.springframework.integration.groovy.GroovyObjectCustomizer = org.springframework.integration.groovy.GroovyObjectCustomizer ; }  <METHOD_END>
<METHOD_START> public void void ( GroovyObject org.springframework.integration.groovy.GroovyObject ) { Assert . state ( org.springframework.integration.groovy.GroovyObject instanceof Script , STRING ) ; if ( this . java.util.Map<java.lang.String,> != null ) { Binding org.springframework.integration.groovy.Binding = ( ( Script ) org.springframework.integration.groovy.GroovyObject ) . getBinding ( ) ; for ( java.util.Map . java.util.Map.Entry<java.lang.String,?> < java.lang.String , ? > java.util.Map.Entry<java.lang.String,?> : this . java.util.Map<java.lang.String,> . java.util.Set<java.util.Map.Entry<java.lang.String,>> ( ) ) { org.springframework.integration.groovy.Binding . setVariable ( java.util.Map.Entry<java.lang.String,> . java.lang.String ( ) , java.util.Map.Entry<java.lang.String,> . getValue ( ) ) ; } } if ( this . org.springframework.integration.groovy.GroovyObjectCustomizer != null ) { this . org.springframework.integration.groovy.GroovyObjectCustomizer . customize ( org.springframework.integration.groovy.GroovyObject ) ; } }  <METHOD_END>