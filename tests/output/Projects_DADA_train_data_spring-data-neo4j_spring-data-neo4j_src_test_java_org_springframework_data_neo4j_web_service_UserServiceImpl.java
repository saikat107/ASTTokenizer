<METHOD_START> @ java.lang.Override public org.springframework.data.neo4j.web.service.User org.springframework.data.neo4j.web.service.User ( java.util.UUID java.util.UUID ) { return org.springframework.data.neo4j.web.service.UserRepository . findOne ( java.util.UUID ) . get ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Collection<org.springframework.data.neo4j.web.service.User> < User > java.util.Collection<org.springframework.data.neo4j.web.service.User> ( User org.springframework.data.neo4j.web.service.User ) { java.util.Set<org.springframework.data.neo4j.web.service.User> < User > java.util.Set<org.springframework.data.neo4j.web.service.User> = new java.util.TreeSet <> ( new java.util.Comparator<org.springframework.data.neo4j.web.service.User> < User > ( ) { @ java.lang.Override public int int ( User org.springframework.data.neo4j.web.service.User , User org.springframework.data.neo4j.web.service.User ) { return org.springframework.data.neo4j.web.service.User . getName ( ) . compareTo ( org.springframework.data.neo4j.web.service.User . getName ( ) ) ; } } ) ; void ( org.springframework.data.neo4j.web.service.User , java.util.Set<org.springframework.data.neo4j.web.service.User> ) ; java.util.Set<org.springframework.data.neo4j.web.service.User> . remove ( org.springframework.data.neo4j.web.service.User ) ; return java.util.Set<org.springframework.data.neo4j.web.service.User> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( User org.springframework.data.neo4j.web.service.User , User org.springframework.data.neo4j.web.service.User ) { return org.springframework.data.neo4j.web.service.User . getName ( ) . compareTo ( org.springframework.data.neo4j.web.service.User . getName ( ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( User org.springframework.data.neo4j.web.service.User , java.util.Set<org.springframework.data.neo4j.web.service.User> < User > java.util.Set<org.springframework.data.neo4j.web.service.User> ) { for ( User org.springframework.data.neo4j.web.service.User : org.springframework.data.neo4j.web.service.User . getFriends ( ) ) { if ( ! java.util.Set<org.springframework.data.neo4j.web.service.User> . contains ( org.springframework.data.neo4j.web.service.User ) ) { java.util.Set<org.springframework.data.neo4j.web.service.User> . add ( org.springframework.data.neo4j.web.service.User ) ; void ( org.springframework.data.neo4j.web.service.User , java.util.Set<org.springframework.data.neo4j.web.service.User> ) ; } } }  <METHOD_END>