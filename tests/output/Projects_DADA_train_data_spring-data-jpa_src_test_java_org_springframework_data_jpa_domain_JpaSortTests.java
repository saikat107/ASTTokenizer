<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new JpaSort ( org.springframework.data.jpa.domain.Attribute<,> ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new JpaSort ( org.springframework.data.jpa.domain.Attribute<?,?>[] ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new JpaSort ( org.springframework.data.jpa.domain.PluralAttribute<,,> ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new JpaSort ( org.springframework.data.jpa.domain.PluralAttribute<?,?,?>[] ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( new JpaSort ( path ( User_ . firstname ) ) , hasItems ( new Sort . Sort ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( new JpaSort ( User_ . firstname , User_ . lastname ) , hasItems ( new Order ( STRING ) , new Order ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( new JpaSort ( DESC , User_ . firstname , User_ . lastname ) , hasItems ( new Order ( DESC , STRING ) , new Order ( Direction . DESC , STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( new JpaSort ( User_ . firstname ) . and ( new JpaSort ( User_ . lastname ) ) , hasItems ( new Order ( STRING ) , new Order ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( new JpaSort ( User_ . firstname ) . and ( new JpaSort ( DESC , User_ . lastname ) ) , hasItems ( new Order ( STRING ) , new Order ( DESC , STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( new JpaSort ( path ( User_ . address ) . dot ( Address_ . streetName ) ) , hasItems ( new Order ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( new JpaSort ( ASC , path ( User_ . firstname ) ) , hasItems ( new Order ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( new JpaSort ( ASC , path ( MailMessage_ . mailSender ) . dot ( MailSender_ . name ) ) , hasItems ( new Order ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( new JpaSort ( User_ . firstname ) . and ( DESC , User_ . lastname ) , contains ( new Order ( STRING ) , new Order ( DESC , STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( new JpaSort ( User_ . firstname ) . and ( DESC , path ( MailMessage_ . mailSender ) . dot ( MailSender_ . name ) ) , contains ( new Order ( STRING ) , new Order ( DESC , STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new JpaSort ( User_ . firstname ) . and ( DESC , ( org.springframework.data.jpa.domain.Attribute<?,?> < ? , ? > [] ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new JpaSort ( User_ . firstname ) . and ( DESC , ( org.springframework.data.jpa.domain.Path<?,?> < ? , ? > [] ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { JpaSort org.springframework.data.jpa.domain.JpaSort = JpaSort . unsafe ( DESC , STRING ) ; assertThat ( org.springframework.data.jpa.domain.JpaSort , hasItem ( new Order ( DESC , STRING ) ) ) ; assertThat ( org.springframework.data.jpa.domain.JpaSort . getOrderFor ( STRING ) , is ( instanceOf ( JpaOrder .class ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { JpaSort org.springframework.data.jpa.domain.JpaSort = JpaSort . unsafe ( DESC , STRING , STRING ) ; assertThat ( org.springframework.data.jpa.domain.JpaSort , hasItems ( new Order ( DESC , STRING ) , new Order ( DESC , STRING ) ) ) ; assertThat ( org.springframework.data.jpa.domain.JpaSort . getOrderFor ( STRING ) , is ( instanceOf ( JpaOrder .class ) ) ) ; assertThat ( org.springframework.data.jpa.domain.JpaSort . getOrderFor ( STRING ) , is ( instanceOf ( JpaOrder .class ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { }  <METHOD_END>