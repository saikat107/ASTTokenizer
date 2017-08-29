<METHOD_START> @ Before public void void ( ) { VersionResourceResolver org.springframework.web.servlet.resource.VersionResourceResolver = new VersionResourceResolver ( ) ; org.springframework.web.servlet.resource.VersionResourceResolver . setStrategyMap ( java.util.Collections . java.util.Map ( STRING , this . org.springframework.web.servlet.resource.ContentVersionStrategy ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING + java.lang.String + STRING ; assertEquals ( java.lang.String , this . org.springframework.web.servlet.resource.ContentVersionStrategy . extractVersion ( java.lang.String ) ) ; assertNull ( this . org.springframework.web.servlet.resource.ContentVersionStrategy . extractVersion ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; assertEquals ( java.lang.String . java.lang.String ( java.lang.String , STRING , STRING ) , this . org.springframework.web.servlet.resource.ContentVersionStrategy . removeVersion ( java.lang.String . java.lang.String ( java.lang.String , STRING , java.lang.String ) , java.lang.String ) ) ; assertNull ( this . org.springframework.web.servlet.resource.ContentVersionStrategy . extractVersion ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Resource org.springframework.web.servlet.resource.Resource = new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.web.servlet.resource.ContentBasedVersionStrategyTests> ( ) ) ; java.lang.String java.lang.String = DigestUtils . md5DigestAsHex ( FileCopyUtils . copyToByteArray ( org.springframework.web.servlet.resource.Resource . getInputStream ( ) ) ) ; assertEquals ( java.lang.String , this . org.springframework.web.servlet.resource.ContentVersionStrategy . getResourceVersion ( org.springframework.web.servlet.resource.Resource ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; assertEquals ( STRING , this . org.springframework.web.servlet.resource.ContentVersionStrategy . addVersion ( java.lang.String , java.lang.String ) ) ; }  <METHOD_END>