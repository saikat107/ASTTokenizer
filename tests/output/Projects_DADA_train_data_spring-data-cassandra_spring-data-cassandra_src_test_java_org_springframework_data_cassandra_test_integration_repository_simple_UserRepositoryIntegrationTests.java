<METHOD_START> public void ( UserRepository org.springframework.data.cassandra.test.integration.repository.simple.UserRepository , CassandraOperations org.springframework.data.cassandra.test.integration.repository.simple.CassandraOperations ) { this . org.springframework.data.cassandra.test.integration.repository.simple.UserRepository = org.springframework.data.cassandra.test.integration.repository.simple.UserRepository ; this . org.springframework.data.cassandra.test.integration.repository.simple.CassandraOperations = org.springframework.data.cassandra.test.integration.repository.simple.CassandraOperations ; }  <METHOD_END>
<METHOD_START> public void void ( ) { org.springframework.data.cassandra.test.integration.repository.simple.CassandraOperations . getCqlOperations ( ) . execute ( STRING ) ; org.springframework.data.cassandra.test.integration.repository.simple.UserRepository . deleteAll ( ) ; org.springframework.data.cassandra.test.integration.repository.simple.User = new User ( ) ; org.springframework.data.cassandra.test.integration.repository.simple.User . setUsername ( STRING ) ; org.springframework.data.cassandra.test.integration.repository.simple.User . setFirstName ( STRING ) ; org.springframework.data.cassandra.test.integration.repository.simple.User . setLastName ( STRING ) ; org.springframework.data.cassandra.test.integration.repository.simple.User . setPassword ( STRING ) ; org.springframework.data.cassandra.test.integration.repository.simple.User . setPlace ( STRING ) ; AddressType org.springframework.data.cassandra.test.integration.repository.simple.AddressType = new AddressType ( ) ; org.springframework.data.cassandra.test.integration.repository.simple.AddressType . setCity ( STRING ) ; org.springframework.data.cassandra.test.integration.repository.simple.AddressType . setStreet ( STRING ) ; org.springframework.data.cassandra.test.integration.repository.simple.User . setAddress ( org.springframework.data.cassandra.test.integration.repository.simple.AddressType ) ; org.springframework.data.cassandra.test.integration.repository.simple.User = new User ( ) ; org.springframework.data.cassandra.test.integration.repository.simple.User . setUsername ( STRING ) ; org.springframework.data.cassandra.test.integration.repository.simple.User . setFirstName ( STRING ) ; org.springframework.data.cassandra.test.integration.repository.simple.User . setLastName ( STRING ) ; org.springframework.data.cassandra.test.integration.repository.simple.User . setPassword ( STRING ) ; org.springframework.data.cassandra.test.integration.repository.simple.User . setPlace ( STRING ) ; org.springframework.data.cassandra.test.integration.repository.simple.User = new User ( ) ; org.springframework.data.cassandra.test.integration.repository.simple.User . setUsername ( STRING ) ; org.springframework.data.cassandra.test.integration.repository.simple.User . setFirstName ( STRING ) ; org.springframework.data.cassandra.test.integration.repository.simple.User . setLastName ( STRING ) ; org.springframework.data.cassandra.test.integration.repository.simple.User . setPassword ( STRING ) ; org.springframework.data.cassandra.test.integration.repository.simple.User . setPlace ( STRING ) ; org.springframework.data.cassandra.test.integration.repository.simple.User = new User ( ) ; org.springframework.data.cassandra.test.integration.repository.simple.User . setUsername ( STRING ) ; org.springframework.data.cassandra.test.integration.repository.simple.User . setFirstName ( STRING ) ; org.springframework.data.cassandra.test.integration.repository.simple.User . setLastName ( STRING ) ; org.springframework.data.cassandra.test.integration.repository.simple.User . setPassword ( STRING ) ; org.springframework.data.cassandra.test.integration.repository.simple.User . setPlace ( STRING ) ; java.util.List<org.springframework.data.cassandra.test.integration.repository.simple.User> = java.util.Arrays . java.util.List ( org.springframework.data.cassandra.test.integration.repository.simple.User , org.springframework.data.cassandra.test.integration.repository.simple.User , org.springframework.data.cassandra.test.integration.repository.simple.User , org.springframework.data.cassandra.test.integration.repository.simple.User ) ; org.springframework.data.cassandra.test.integration.repository.simple.CassandraOperations . batchOps ( ) . insert ( java.util.List<org.springframework.data.cassandra.test.integration.repository.simple.User> ) . execute ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { org.springframework.data.cassandra.test.integration.repository.simple.UserRepository . deleteAll ( ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { java.lang.String java.lang.String = org.springframework.data.cassandra.test.integration.repository.simple.UserRepository . findByNamedQuery ( STRING ) ; assertThat ( java.lang.String ) . isNotNull ( ) ; assertThat ( java.lang.String ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { User org.springframework.data.cassandra.test.integration.repository.simple.User = org.springframework.data.cassandra.test.integration.repository.simple.UserRepository . findByAddress ( org.springframework.data.cassandra.test.integration.repository.simple.User . getAddress ( ) ) ; assertThat ( org.springframework.data.cassandra.test.integration.repository.simple.User ) . isNotNull ( ) . isEqualTo ( org.springframework.data.cassandra.test.integration.repository.simple.User ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) java.lang.Exception { java.util.Optional<org.springframework.data.cassandra.test.integration.repository.simple.User> < User > java.util.Optional<org.springframework.data.cassandra.test.integration.repository.simple.User> = org.springframework.data.cassandra.test.integration.repository.simple.UserRepository . findOne ( org.springframework.data.cassandra.test.integration.repository.simple.User . getUsername ( ) ) ; assertThat ( java.util.Optional<org.springframework.data.cassandra.test.integration.repository.simple.User> ) . isNotNull ( ) . contains ( org.springframework.data.cassandra.test.integration.repository.simple.User ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) java.lang.Exception { java.util.List<org.springframework.data.cassandra.test.integration.repository.simple.User> < User > java.util.List<org.springframework.data.cassandra.test.integration.repository.simple.User> = Lists . newArrayList ( org.springframework.data.cassandra.test.integration.repository.simple.UserRepository . findAll ( ) ) ; assertThat ( java.util.List<org.springframework.data.cassandra.test.integration.repository.simple.User> ) . hasSize ( java.util.List<org.springframework.data.cassandra.test.integration.repository.simple.User> . size ( ) ) ; assertThat ( java.util.List<org.springframework.data.cassandra.test.integration.repository.simple.User> . containsAll ( java.util.List<org.springframework.data.cassandra.test.integration.repository.simple.User> ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { java.lang.Iterable<org.springframework.data.cassandra.test.integration.repository.simple.User> < User > java.lang.Iterable<org.springframework.data.cassandra.test.integration.repository.simple.User> = org.springframework.data.cassandra.test.integration.repository.simple.UserRepository . findAll ( java.util.Arrays . java.util.List ( org.springframework.data.cassandra.test.integration.repository.simple.User . getUsername ( ) , org.springframework.data.cassandra.test.integration.repository.simple.User . getUsername ( ) ) ) ; assertThat ( java.lang.Iterable<org.springframework.data.cassandra.test.integration.repository.simple.User> ) . contains ( org.springframework.data.cassandra.test.integration.repository.simple.User , org.springframework.data.cassandra.test.integration.repository.simple.User ) ; assertThat ( java.lang.Iterable<org.springframework.data.cassandra.test.integration.repository.simple.User> ) . doesNotContain ( org.springframework.data.cassandra.test.integration.repository.simple.User , org.springframework.data.cassandra.test.integration.repository.simple.User ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) java.lang.Exception { org.springframework.data.cassandra.test.integration.repository.simple.UserRepository . delete ( org.springframework.data.cassandra.test.integration.repository.simple.User ) ; java.util.List<org.springframework.data.cassandra.test.integration.repository.simple.User> < User > java.util.List<org.springframework.data.cassandra.test.integration.repository.simple.User> = Lists . newArrayList ( org.springframework.data.cassandra.test.integration.repository.simple.UserRepository . findAll ( ) ) ; assertThat ( java.util.List<org.springframework.data.cassandra.test.integration.repository.simple.User> ) . hasSize ( java.util.List<org.springframework.data.cassandra.test.integration.repository.simple.User> . size ( ) - NUMBER ) ; assertThat ( java.util.List<org.springframework.data.cassandra.test.integration.repository.simple.User> ) . doesNotContain ( org.springframework.data.cassandra.test.integration.repository.simple.User ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { org.springframework.data.cassandra.test.integration.repository.simple.UserRepository . delete ( org.springframework.data.cassandra.test.integration.repository.simple.User . getUsername ( ) ) ; java.util.List<org.springframework.data.cassandra.test.integration.repository.simple.User> < User > java.util.List<org.springframework.data.cassandra.test.integration.repository.simple.User> = Lists . newArrayList ( org.springframework.data.cassandra.test.integration.repository.simple.UserRepository . findAll ( ) ) ; assertThat ( java.util.List<org.springframework.data.cassandra.test.integration.repository.simple.User> ) . hasSize ( java.util.List<org.springframework.data.cassandra.test.integration.repository.simple.User> . size ( ) - NUMBER ) ; assertThat ( java.util.List<org.springframework.data.cassandra.test.integration.repository.simple.User> ) . doesNotContain ( org.springframework.data.cassandra.test.integration.repository.simple.User ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { java.lang.String java.lang.String = STRING ; assertThat ( org.springframework.data.cassandra.test.integration.repository.simple.UserRepository . exists ( java.lang.String ) ) . isTrue ( ) ; org.springframework.data.cassandra.test.integration.repository.simple.UserRepository . delete ( java.lang.String ) ; assertThat ( org.springframework.data.cassandra.test.integration.repository.simple.UserRepository . exists ( java.lang.String ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { org.springframework.data.cassandra.test.integration.repository.simple.User . setPassword ( null ) ; org.springframework.data.cassandra.test.integration.repository.simple.User . setFriends ( java.util.Collections . java.util.Set<java.lang.Object> ( ) ) ; org.springframework.data.cassandra.test.integration.repository.simple.UserRepository . save ( org.springframework.data.cassandra.test.integration.repository.simple.User ) ; java.util.Optional<org.springframework.data.cassandra.test.integration.repository.simple.User> < User > java.util.Optional<org.springframework.data.cassandra.test.integration.repository.simple.User> = org.springframework.data.cassandra.test.integration.repository.simple.UserRepository . findOne ( org.springframework.data.cassandra.test.integration.repository.simple.User . getUsername ( ) ) ; assertThat ( java.util.Optional<org.springframework.data.cassandra.test.integration.repository.simple.User> ) . hasValueSatisfying ( actual -> { assertThat ( actual . getPassword ( ) ) . isNull ( ) ; assertThat ( actual . getFriends ( ) ) . isNull ( ) ; } ) ; }  <METHOD_END>