<METHOD_START> @ Before public void void ( ) { JpaEntityInformation < User , java.lang.Integer > org.springframework.data.jpa.repository.support.JpaEntityInformation<org.springframework.data.jpa.repository.support.User,java.lang.Integer> = new JpaMetamodelEntityInformation < User , java.lang.Integer > ( User .class , org.springframework.data.jpa.repository.support.EntityManager . getMetamodel ( ) ) ; org.springframework.data.jpa.repository.support.QuerydslJpaRepository<org.springframework.data.jpa.repository.support.User,java.lang.Integer> = new QuerydslJpaRepository < User , java.lang.Integer > ( org.springframework.data.jpa.repository.support.JpaEntityInformation<org.springframework.data.jpa.repository.support.User,java.lang.Integer> , org.springframework.data.jpa.repository.support.EntityManager ) ; org.springframework.data.jpa.repository.support.User = org.springframework.data.jpa.repository.support.QuerydslJpaRepository<org.springframework.data.jpa.repository.support.User,java.lang.Integer> . save ( new User ( STRING , STRING , STRING ) ) ; org.springframework.data.jpa.repository.support.User = org.springframework.data.jpa.repository.support.QuerydslJpaRepository<org.springframework.data.jpa.repository.support.User,java.lang.Integer> . save ( new User ( STRING , STRING , STRING ) ) ; org.springframework.data.jpa.repository.support.User = org.springframework.data.jpa.repository.support.QuerydslJpaRepository<org.springframework.data.jpa.repository.support.User,java.lang.Integer> . save ( new User ( STRING , STRING , STRING ) ) ; org.springframework.data.jpa.repository.support.Role = org.springframework.data.jpa.repository.support.EntityManager . merge ( new Role ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { BooleanExpression org.springframework.data.jpa.repository.support.BooleanExpression = org.springframework.data.jpa.repository.support.QUser . firstname . eq ( STRING ) ; BooleanExpression org.springframework.data.jpa.repository.support.BooleanExpression = org.springframework.data.jpa.repository.support.QUser . lastname . eq ( STRING ) ; java.util.List<org.springframework.data.jpa.repository.support.User> < User > java.util.List<org.springframework.data.jpa.repository.support.User> = org.springframework.data.jpa.repository.support.QuerydslJpaRepository<org.springframework.data.jpa.repository.support.User,java.lang.Integer> . findAll ( org.springframework.data.jpa.repository.support.BooleanExpression . or ( org.springframework.data.jpa.repository.support.BooleanExpression ) ) ; assertThat ( java.util.List<org.springframework.data.jpa.repository.support.User> . size ( ) , is ( NUMBER ) ) ; assertThat ( java.util.List<org.springframework.data.jpa.repository.support.User> , hasItems ( org.springframework.data.jpa.repository.support.User , org.springframework.data.jpa.repository.support.User ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { PathBuilder < User > org.springframework.data.jpa.repository.support.PathBuilder<org.springframework.data.jpa.repository.support.User> = new PathBuilderFactory ( ) . create ( User .class ) ; BooleanExpression org.springframework.data.jpa.repository.support.BooleanExpression = org.springframework.data.jpa.repository.support.PathBuilder<org.springframework.data.jpa.repository.support.User> . getString ( STRING ) . eq ( STRING ) ; BooleanExpression org.springframework.data.jpa.repository.support.BooleanExpression = org.springframework.data.jpa.repository.support.PathBuilder<org.springframework.data.jpa.repository.support.User> . getString ( STRING ) . eq ( STRING ) ; java.util.List<org.springframework.data.jpa.repository.support.User> < User > java.util.List<org.springframework.data.jpa.repository.support.User> = org.springframework.data.jpa.repository.support.QuerydslJpaRepository<org.springframework.data.jpa.repository.support.User,java.lang.Integer> . findAll ( org.springframework.data.jpa.repository.support.BooleanExpression . or ( org.springframework.data.jpa.repository.support.BooleanExpression ) ) ; assertThat ( java.util.List<org.springframework.data.jpa.repository.support.User> . size ( ) , is ( NUMBER ) ) ; assertThat ( java.util.List<org.springframework.data.jpa.repository.support.User> , hasItems ( org.springframework.data.jpa.repository.support.User , org.springframework.data.jpa.repository.support.User ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Predicate org.springframework.data.jpa.repository.support.Predicate = org.springframework.data.jpa.repository.support.QUser . lastname . contains ( STRING ) ; Page < User > org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> = org.springframework.data.jpa.repository.support.QuerydslJpaRepository<org.springframework.data.jpa.repository.support.User,java.lang.Integer> . findAll ( org.springframework.data.jpa.repository.support.Predicate , PageRequest . of ( NUMBER , NUMBER , Direction . ASC , STRING ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getContent ( ) , hasSize ( NUMBER ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getContent ( ) . get ( NUMBER ) , is ( org.springframework.data.jpa.repository.support.User ) ) ; org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> = org.springframework.data.jpa.repository.support.QuerydslJpaRepository<org.springframework.data.jpa.repository.support.User,java.lang.Integer> . findAll ( org.springframework.data.jpa.repository.support.Predicate , PageRequest . of ( NUMBER , NUMBER , Direction . DESC , STRING ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getContent ( ) , hasSize ( NUMBER ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getContent ( ) . get ( NUMBER ) , is ( org.springframework.data.jpa.repository.support.User ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getContent ( ) . get ( NUMBER ) , is ( org.springframework.data.jpa.repository.support.User ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Sort org.springframework.data.jpa.repository.support.Sort = Sort . by ( new Order ( Direction . DESC , STRING ) . ignoreCase ( ) , new Order ( Direction . ASC , STRING ) ) ; Page < User > org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> = org.springframework.data.jpa.repository.support.QuerydslJpaRepository<org.springframework.data.jpa.repository.support.User,java.lang.Integer> . findAll ( org.springframework.data.jpa.repository.support.QUser . lastname . contains ( STRING ) , PageRequest . of ( NUMBER , NUMBER , org.springframework.data.jpa.repository.support.Sort ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getContent ( ) , hasSize ( NUMBER ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getContent ( ) . get ( NUMBER ) , is ( org.springframework.data.jpa.repository.support.User ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getContent ( ) . get ( NUMBER ) , is ( org.springframework.data.jpa.repository.support.User ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.jpa.repository.support.User . getColleagues ( ) . add ( org.springframework.data.jpa.repository.support.User ) ; org.springframework.data.jpa.repository.support.User . getColleagues ( ) . add ( org.springframework.data.jpa.repository.support.User ) ; QUser org.springframework.data.jpa.repository.support.QUser = QUser . user ; Page < User > org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> = org.springframework.data.jpa.repository.support.QuerydslJpaRepository<org.springframework.data.jpa.repository.support.User,java.lang.Integer> . findAll ( user . firstname . isNotNull ( ) , PageRequest . of ( NUMBER , NUMBER , Sort . by ( Sort . Direction . ASC , STRING ) ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getContent ( ) , hasSize ( NUMBER ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getContent ( ) , hasItems ( org.springframework.data.jpa.repository.support.User , org.springframework.data.jpa.repository.support.User , org.springframework.data.jpa.repository.support.User ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.jpa.repository.support.User . setManager ( org.springframework.data.jpa.repository.support.User ) ; org.springframework.data.jpa.repository.support.User . setManager ( org.springframework.data.jpa.repository.support.User ) ; QUser org.springframework.data.jpa.repository.support.QUser = QUser . user ; Page < User > org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> = org.springframework.data.jpa.repository.support.QuerydslJpaRepository<org.springframework.data.jpa.repository.support.User,java.lang.Integer> . findAll ( user . firstname . isNotNull ( ) , PageRequest . of ( NUMBER , NUMBER , Sort . by ( Sort . Direction . ASC , STRING ) ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getContent ( ) , hasSize ( NUMBER ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getContent ( ) , hasItems ( org.springframework.data.jpa.repository.support.User , org.springframework.data.jpa.repository.support.User , org.springframework.data.jpa.repository.support.User ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { QUser org.springframework.data.jpa.repository.support.QUser = QUser . user ; Page < User > org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> = org.springframework.data.jpa.repository.support.QuerydslJpaRepository<org.springframework.data.jpa.repository.support.User,java.lang.Integer> . findAll ( user . firstname . isNotNull ( ) , PageRequest . of ( NUMBER , NUMBER , Sort . by ( Sort . Direction . ASC , STRING ) ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getContent ( ) , hasSize ( NUMBER ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getContent ( ) , hasItems ( org.springframework.data.jpa.repository.support.User , org.springframework.data.jpa.repository.support.User , org.springframework.data.jpa.repository.support.User ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { QUser org.springframework.data.jpa.repository.support.QUser = QUser . user ; Page < User > org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> = org.springframework.data.jpa.repository.support.QuerydslJpaRepository<org.springframework.data.jpa.repository.support.User,java.lang.Integer> . findAll ( user . firstname . isNotNull ( ) , PageRequest . of ( NUMBER , NUMBER , Sort . by ( new Order ( Sort . Direction . ASC , STRING ) . ignoreCase ( ) ) ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getContent ( ) , hasSize ( NUMBER ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getContent ( ) , hasItems ( org.springframework.data.jpa.repository.support.User , org.springframework.data.jpa.repository.support.User , org.springframework.data.jpa.repository.support.User ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.jpa.repository.support.User . setAddress ( new Address ( STRING , STRING , STRING , STRING ) ) ; QUser org.springframework.data.jpa.repository.support.QUser = QUser . user ; Page < User > org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> = org.springframework.data.jpa.repository.support.QuerydslJpaRepository<org.springframework.data.jpa.repository.support.User,java.lang.Integer> . findAll ( user . firstname . isNotNull ( ) , PageRequest . of ( NUMBER , NUMBER , Sort . by ( Sort . Direction . ASC , STRING ) ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getContent ( ) , hasSize ( NUMBER ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getContent ( ) , hasItems ( org.springframework.data.jpa.repository.support.User , org.springframework.data.jpa.repository.support.User , org.springframework.data.jpa.repository.support.User ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getContent ( ) . get ( NUMBER ) , is ( org.springframework.data.jpa.repository.support.User ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { QUser org.springframework.data.jpa.repository.support.QUser = QUser . user ; Page < User > org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> = org.springframework.data.jpa.repository.support.QuerydslJpaRepository<org.springframework.data.jpa.repository.support.User,java.lang.Integer> . findAll ( user . firstname . isNotNull ( ) , new QPageRequest ( NUMBER , NUMBER , new QSort ( user . firstname . asc ( ) ) ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getContent ( ) , hasSize ( NUMBER ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getContent ( ) , hasItems ( org.springframework.data.jpa.repository.support.User , org.springframework.data.jpa.repository.support.User , org.springframework.data.jpa.repository.support.User ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getContent ( ) . get ( NUMBER ) , is ( org.springframework.data.jpa.repository.support.User ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getContent ( ) . get ( NUMBER ) , is ( org.springframework.data.jpa.repository.support.User ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getContent ( ) . get ( NUMBER ) , is ( org.springframework.data.jpa.repository.support.User ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { QUser org.springframework.data.jpa.repository.support.QUser = QUser . user ; Page < User > org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> = org.springframework.data.jpa.repository.support.QuerydslJpaRepository<org.springframework.data.jpa.repository.support.User,java.lang.Integer> . findAll ( user . firstname . isNotNull ( ) , new QPageRequest ( NUMBER , NUMBER , user . firstname . asc ( ) ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getContent ( ) , hasSize ( NUMBER ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getContent ( ) , hasItems ( org.springframework.data.jpa.repository.support.User , org.springframework.data.jpa.repository.support.User , org.springframework.data.jpa.repository.support.User ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getContent ( ) . get ( NUMBER ) , is ( org.springframework.data.jpa.repository.support.User ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getContent ( ) . get ( NUMBER ) , is ( org.springframework.data.jpa.repository.support.User ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getContent ( ) . get ( NUMBER ) , is ( org.springframework.data.jpa.repository.support.User ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.jpa.repository.support.User . setManager ( org.springframework.data.jpa.repository.support.User ) ; org.springframework.data.jpa.repository.support.User . setManager ( org.springframework.data.jpa.repository.support.User ) ; QUser org.springframework.data.jpa.repository.support.QUser = QUser . user ; Page < User > org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> = org.springframework.data.jpa.repository.support.QuerydslJpaRepository<org.springframework.data.jpa.repository.support.User,java.lang.Integer> . findAll ( user . firstname . isNotNull ( ) , new QPageRequest ( NUMBER , NUMBER , user . manager . firstname . asc ( ) ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getContent ( ) , hasSize ( NUMBER ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getContent ( ) , hasItems ( org.springframework.data.jpa.repository.support.User , org.springframework.data.jpa.repository.support.User , org.springframework.data.jpa.repository.support.User ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getContent ( ) . get ( NUMBER ) , is ( org.springframework.data.jpa.repository.support.User ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getContent ( ) . get ( NUMBER ) , is ( org.springframework.data.jpa.repository.support.User ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getContent ( ) . get ( NUMBER ) , is ( org.springframework.data.jpa.repository.support.User ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.jpa.repository.support.User . setManager ( org.springframework.data.jpa.repository.support.User ) ; org.springframework.data.jpa.repository.support.User . getRoles ( ) . add ( org.springframework.data.jpa.repository.support.Role ) ; Page < User > org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> = org.springframework.data.jpa.repository.support.QuerydslJpaRepository<org.springframework.data.jpa.repository.support.User,java.lang.Integer> . findAll ( PageRequest . of ( NUMBER , NUMBER , Sort . by ( Direction . ASC , STRING ) ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getContent ( ) , hasSize ( NUMBER ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getContent ( ) . get ( NUMBER ) , is ( org.springframework.data.jpa.repository.support.User ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.jpa.repository.support.User . setAddress ( new Address ( STRING , STRING , STRING , STRING ) ) ; org.springframework.data.jpa.repository.support.User . setAddress ( new Address ( STRING , STRING , STRING , STRING ) ) ; org.springframework.data.jpa.repository.support.User . setAddress ( new Address ( STRING , STRING , STRING , STRING ) ) ; java.util.List<org.springframework.data.jpa.repository.support.User> < User > java.util.List<org.springframework.data.jpa.repository.support.User> = org.springframework.data.jpa.repository.support.QuerydslJpaRepository<org.springframework.data.jpa.repository.support.User,java.lang.Integer> . findAll ( QUser . user . address . streetName . asc ( ) ) ; assertThat ( java.util.List<org.springframework.data.jpa.repository.support.User> , hasSize ( NUMBER ) ) ; assertThat ( java.util.List<org.springframework.data.jpa.repository.support.User> , hasItems ( org.springframework.data.jpa.repository.support.User , org.springframework.data.jpa.repository.support.User , org.springframework.data.jpa.repository.support.User ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.jpa.repository.support.User . setDateOfBirth ( new LocalDate ( NUMBER , NUMBER , NUMBER ) . toDate ( ) ) ; org.springframework.data.jpa.repository.support.User . setDateOfBirth ( new LocalDate ( NUMBER , NUMBER , NUMBER ) . toDate ( ) ) ; org.springframework.data.jpa.repository.support.User . setDateOfBirth ( new LocalDate ( NUMBER , NUMBER , NUMBER ) . toDate ( ) ) ; java.util.List<org.springframework.data.jpa.repository.support.User> < User > java.util.List<org.springframework.data.jpa.repository.support.User> = org.springframework.data.jpa.repository.support.QuerydslJpaRepository<org.springframework.data.jpa.repository.support.User,java.lang.Integer> . findAll ( QUser . user . dateOfBirth . yearMonth ( ) . asc ( ) ) ; assertThat ( java.util.List<org.springframework.data.jpa.repository.support.User> , hasSize ( NUMBER ) ) ; assertThat ( java.util.List<org.springframework.data.jpa.repository.support.User> , hasItems ( org.springframework.data.jpa.repository.support.User , org.springframework.data.jpa.repository.support.User , org.springframework.data.jpa.repository.support.User ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertThat ( org.springframework.data.jpa.repository.support.QuerydslJpaRepository<org.springframework.data.jpa.repository.support.User,java.lang.Integer> . exists ( org.springframework.data.jpa.repository.support.QUser . firstname . eq ( STRING ) ) , is ( true ) ) ; assertThat ( org.springframework.data.jpa.repository.support.QuerydslJpaRepository<org.springframework.data.jpa.repository.support.User,java.lang.Integer> . exists ( org.springframework.data.jpa.repository.support.QUser . firstname . eq ( STRING ) ) , is ( false ) ) ; assertThat ( org.springframework.data.jpa.repository.support.QuerydslJpaRepository<org.springframework.data.jpa.repository.support.User,java.lang.Integer> . exists ( ( Predicate ) null ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.List<org.springframework.data.jpa.repository.support.User> < User > java.util.List<org.springframework.data.jpa.repository.support.User> = org.springframework.data.jpa.repository.support.QuerydslJpaRepository<org.springframework.data.jpa.repository.support.User,java.lang.Integer> . findAll ( org.springframework.data.jpa.repository.support.QUser . dateOfBirth . isNull ( ) , Sort . by ( Direction . ASC , STRING ) ) ; assertThat ( java.util.List<org.springframework.data.jpa.repository.support.User> , hasSize ( NUMBER ) ) ; assertThat ( java.util.List<org.springframework.data.jpa.repository.support.User> . get ( NUMBER ) . getFirstname ( ) , is ( org.springframework.data.jpa.repository.support.User . getFirstname ( ) ) ) ; assertThat ( java.util.List<org.springframework.data.jpa.repository.support.User> . get ( NUMBER ) . getFirstname ( ) , is ( org.springframework.data.jpa.repository.support.User . getFirstname ( ) ) ) ; assertThat ( java.util.List<org.springframework.data.jpa.repository.support.User> , hasItems ( org.springframework.data.jpa.repository.support.User , org.springframework.data.jpa.repository.support.User , org.springframework.data.jpa.repository.support.User ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.jpa.repository.support.QuerydslJpaRepository<org.springframework.data.jpa.repository.support.User,java.lang.Integer> . findAll ( org.springframework.data.jpa.repository.support.QUser . dateOfBirth . isNull ( ) , Pageable . unpaged ( ) ) . getContent ( ) , hasSize ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Page < User > org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> = org.springframework.data.jpa.repository.support.QuerydslJpaRepository<org.springframework.data.jpa.repository.support.User,java.lang.Integer> . findAll ( org.springframework.data.jpa.repository.support.QUser . dateOfBirth . isNull ( ) , PageRequest . of ( NUMBER , NUMBER ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getContent ( ) , hasSize ( NUMBER ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getTotalElements ( ) , is ( NUMBER ) ) ; Page < User > org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> = org.springframework.data.jpa.repository.support.QuerydslJpaRepository<org.springframework.data.jpa.repository.support.User,java.lang.Integer> . findAll ( org.springframework.data.jpa.repository.support.QUser . dateOfBirth . isNull ( ) , PageRequest . of ( NUMBER , NUMBER ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getContent ( ) , hasSize ( NUMBER ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getTotalElements ( ) , is ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Page < User > org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> = org.springframework.data.jpa.repository.support.QuerydslJpaRepository<org.springframework.data.jpa.repository.support.User,java.lang.Integer> . findAll ( org.springframework.data.jpa.repository.support.QUser . dateOfBirth . isNull ( ) , PageRequest . of ( NUMBER , NUMBER ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getContent ( ) , hasSize ( NUMBER ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getTotalElements ( ) , is ( NUMBER ) ) ; Page < User > org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> = org.springframework.data.jpa.repository.support.QuerydslJpaRepository<org.springframework.data.jpa.repository.support.User,java.lang.Integer> . findAll ( org.springframework.data.jpa.repository.support.QUser . dateOfBirth . isNull ( ) , PageRequest . of ( NUMBER , NUMBER ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getContent ( ) , hasSize ( NUMBER ) ) ; assertThat ( org.springframework.data.jpa.repository.support.Page<org.springframework.data.jpa.repository.support.User> . getTotalElements ( ) , is ( NUMBER ) ) ; }  <METHOD_END>