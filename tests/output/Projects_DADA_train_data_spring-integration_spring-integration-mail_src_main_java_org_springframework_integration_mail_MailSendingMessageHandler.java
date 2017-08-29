<METHOD_START> public void ( MailSender org.springframework.integration.mail.MailSender ) { Assert . notNull ( org.springframework.integration.mail.MailSender , STRING ) ; this . org.springframework.integration.mail.MailSender = org.springframework.integration.mail.MailSender ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected final void void ( Message < ? > org.springframework.integration.mail.Message<?> ) { MailMessage org.springframework.integration.mail.MailMessage = org.springframework.integration.mail.MailMessage ( org.springframework.integration.mail.Message<> ) ; if ( org.springframework.integration.mail.MailMessage instanceof SimpleMailMessage ) { this . org.springframework.integration.mail.MailSender . send ( ( SimpleMailMessage ) org.springframework.integration.mail.MailMessage ) ; } else if ( org.springframework.integration.mail.MailMessage instanceof MimeMailMessage ) { Assert . state ( this . org.springframework.integration.mail.MailSender instanceof JavaMailSender , STRING ) ; ( ( JavaMailSender ) this . org.springframework.integration.mail.MailSender ) . send ( ( ( MimeMailMessage ) org.springframework.integration.mail.MailMessage ) . getMimeMessage ( ) ) ; } else { throw new java.lang.IllegalArgumentException ( STRING + org.springframework.integration.mail.MailMessage . getClass ( ) . getName ( ) + STRING ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private org.springframework.integration.mail.MailMessage org.springframework.integration.mail.MailMessage ( Message < ? > org.springframework.integration.mail.Message<?> ) { MailMessage org.springframework.integration.mail.MailMessage = null ; java.lang.Object java.lang.Object = org.springframework.integration.mail.Message<> . getPayload ( ) ; if ( java.lang.Object instanceof MimeMessage ) { org.springframework.integration.mail.MailMessage = new MimeMailMessage ( ( MimeMessage ) java.lang.Object ) ; } else if ( java.lang.Object instanceof MailMessage ) { org.springframework.integration.mail.MailMessage = ( MailMessage ) java.lang.Object ; } else if ( java.lang.Object instanceof byte [] ) { org.springframework.integration.mail.MailMessage = this . org.springframework.integration.mail.MailMessage ( ( Message < byte [] > ) org.springframework.integration.mail.Message<> ) ; } else if ( java.lang.Object instanceof java.lang.String ) { java.lang.String java.lang.String = ( java.lang.String ) org.springframework.integration.mail.Message<> . getHeaders ( ) . get ( MailHeaders . CONTENT_TYPE ) ; if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.integration.mail.MailMessage = this . org.springframework.integration.mail.MailMessage ( ( Message < java.lang.String > ) org.springframework.integration.mail.Message<> , java.lang.String ) ; } else { org.springframework.integration.mail.MailMessage = new SimpleMailMessage ( ) ; org.springframework.integration.mail.MailMessage . setText ( ( java.lang.String ) java.lang.Object ) ; } } else { throw new MessageHandlingException ( org.springframework.integration.mail.Message<> , STRING + org.springframework.integration.mail.Message<> . getPayload ( ) . getClass ( ) . getName ( ) + STRING + STRING ) ; } this . void ( org.springframework.integration.mail.MailMessage , org.springframework.integration.mail.Message<> . getHeaders ( ) ) ; return org.springframework.integration.mail.MailMessage ; }  <METHOD_END>
<METHOD_START> private org.springframework.integration.mail.MailMessage org.springframework.integration.mail.MailMessage ( Message < java.lang.String > org.springframework.integration.mail.Message<java.lang.String> , java.lang.String java.lang.String ) { Assert . state ( this . org.springframework.integration.mail.MailSender instanceof JavaMailSender , STRING ) ; MimeMessage org.springframework.integration.mail.MimeMessage = ( ( JavaMailSender ) this . org.springframework.integration.mail.MailSender ) . createMimeMessage ( ) ; try { org.springframework.integration.mail.MimeMessage . setContent ( org.springframework.integration.mail.Message<java.lang.String> . getPayload ( ) , java.lang.String ) ; return new MimeMailMessage ( org.springframework.integration.mail.MimeMessage ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new org . springframework . org.springframework.messaging . org.springframework.messaging ( STRING + java.lang.String , java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> private org.springframework.integration.mail.MailMessage org.springframework.integration.mail.MailMessage ( Message < byte [] > org.springframework.integration.mail.Message<byte[]> ) { Assert . state ( this . org.springframework.integration.mail.MailSender instanceof JavaMailSender , STRING ) ; java.lang.String java.lang.String = org.springframework.integration.mail.Message<byte[]> . getHeaders ( ) . get ( MailHeaders . ATTACHMENT_FILENAME , java.lang.String .class ) ; if ( java.lang.String == null ) { throw new MessageMappingException ( org.springframework.integration.mail.Message<byte[]> , STRING + MailHeaders . ATTACHMENT_FILENAME + STRING ) ; } java.lang.Integer java.lang.Integer = org.springframework.integration.mail.Message<byte[]> . getHeaders ( ) . get ( MailHeaders . MULTIPART_MODE , java.lang.Integer .class ) ; if ( java.lang.Integer == null ) { java.lang.Integer = MimeMessageHelper . MULTIPART_MODE_MIXED ; } MimeMessage org.springframework.integration.mail.MimeMessage = ( ( JavaMailSender ) this . org.springframework.integration.mail.MailSender ) . createMimeMessage ( ) ; try { MimeMessageHelper org.springframework.integration.mail.MimeMessageHelper = new MimeMessageHelper ( org.springframework.integration.mail.MimeMessage , java.lang.Integer ) ; org.springframework.integration.mail.MimeMessageHelper . addAttachment ( java.lang.String , new ByteArrayResource ( org.springframework.integration.mail.Message<byte[]> . getPayload ( ) ) ) ; return new MimeMailMessage ( org.springframework.integration.mail.MimeMessageHelper ) ; } catch ( MessagingException org.springframework.integration.mail.MessagingException ) { throw new MessageMappingException ( org.springframework.integration.mail.Message<byte[]> , STRING , org.springframework.integration.mail.MessagingException ) ; } }  <METHOD_END>
<METHOD_START> private void void ( MailMessage org.springframework.integration.mail.MailMessage , MessageHeaders org.springframework.integration.mail.MessageHeaders ) { java.lang.String java.lang.String = org.springframework.integration.mail.MessageHeaders . get ( MailHeaders . SUBJECT , java.lang.String .class ) ; if ( java.lang.String != null ) { org.springframework.integration.mail.MailMessage . setSubject ( java.lang.String ) ; } java.lang.String [] java.lang.String[] = this . java.lang.String[] ( org.springframework.integration.mail.MessageHeaders , MailHeaders . TO ) ; if ( java.lang.String[] != null ) { org.springframework.integration.mail.MailMessage . setTo ( java.lang.String[] ) ; } if ( org.springframework.integration.mail.MailMessage instanceof SimpleMailMessage ) { Assert . state ( ! ObjectUtils . isEmpty ( ( ( SimpleMailMessage ) org.springframework.integration.mail.MailMessage ) . getTo ( ) ) , STRING ) ; } java.lang.String [] java.lang.String[] = this . java.lang.String[] ( org.springframework.integration.mail.MessageHeaders , MailHeaders . CC ) ; if ( java.lang.String[] != null ) { org.springframework.integration.mail.MailMessage . setCc ( java.lang.String[] ) ; } java.lang.String [] java.lang.String[] = this . java.lang.String[] ( org.springframework.integration.mail.MessageHeaders , MailHeaders . BCC ) ; if ( java.lang.String[] != null ) { org.springframework.integration.mail.MailMessage . setBcc ( java.lang.String[] ) ; } java.lang.String java.lang.String = org.springframework.integration.mail.MessageHeaders . get ( MailHeaders . FROM , java.lang.String .class ) ; if ( java.lang.String != null ) { org.springframework.integration.mail.MailMessage . setFrom ( java.lang.String ) ; } java.lang.String java.lang.String = org.springframework.integration.mail.MessageHeaders . get ( MailHeaders . REPLY_TO , java.lang.String .class ) ; if ( java.lang.String != null ) { org.springframework.integration.mail.MailMessage . setReplyTo ( java.lang.String ) ; } }  <METHOD_END>
<METHOD_START> private java.lang.String [] java.lang.String[] ( MessageHeaders org.springframework.integration.mail.MessageHeaders , java.lang.String java.lang.String ) { java.lang.Object java.lang.Object = org.springframework.integration.mail.MessageHeaders . get ( java.lang.String ) ; java.lang.String [] java.lang.String[] = null ; if ( java.lang.Object != null ) { if ( java.lang.Object instanceof java.lang.String [] ) { java.lang.String[] = ( java.lang.String [] ) java.lang.Object ; } else if ( java.lang.Object instanceof java.lang.String ) { java.lang.String[] = StringUtils . commaDelimitedListToStringArray ( ( java.lang.String ) java.lang.Object ) ; } } if ( java.lang.String[] == null || ObjectUtils . isEmpty ( java.lang.String[] ) ) { java.lang.String[] = null ; } return java.lang.String[] ; }  <METHOD_END>