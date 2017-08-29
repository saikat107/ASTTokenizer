<METHOD_START> @ Before public void void ( ) { ClassPathResource org.springframework.web.servlet.resource.ClassPathResource = new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.web.servlet.resource.AppCacheManifestTransformerTests> ( ) ) ; ResourceHttpRequestHandler org.springframework.web.servlet.resource.ResourceHttpRequestHandler = new ResourceHttpRequestHandler ( ) ; ResourceUrlProvider org.springframework.web.servlet.resource.ResourceUrlProvider = new ResourceUrlProvider ( ) ; org.springframework.web.servlet.resource.ResourceUrlProvider . setHandlerMap ( java.util.Collections . java.util.Map ( STRING , org.springframework.web.servlet.resource.ResourceHttpRequestHandler ) ) ; VersionResourceResolver org.springframework.web.servlet.resource.VersionResourceResolver = new VersionResourceResolver ( ) ; org.springframework.web.servlet.resource.VersionResourceResolver . setStrategyMap ( java.util.Collections . java.util.Map ( STRING , new ContentVersionStrategy ( ) ) ) ; PathResourceResolver org.springframework.web.servlet.resource.PathResourceResolver = new PathResourceResolver ( ) ; org.springframework.web.servlet.resource.PathResourceResolver . setAllowedLocations ( org.springframework.web.servlet.resource.ClassPathResource ) ; java.util.List<org.springframework.web.servlet.resource.ResourceResolver> < ResourceResolver > java.util.List<org.springframework.web.servlet.resource.ResourceResolver> = java.util.Arrays . java.util.List ( org.springframework.web.servlet.resource.VersionResourceResolver , org.springframework.web.servlet.resource.PathResourceResolver ) ; ResourceResolverChain org.springframework.web.servlet.resource.ResourceResolverChain = new DefaultResourceResolverChain ( java.util.List<org.springframework.web.servlet.resource.ResourceResolver> ) ; CssLinkResourceTransformer org.springframework.web.servlet.resource.CssLinkResourceTransformer = new CssLinkResourceTransformer ( ) ; org.springframework.web.servlet.resource.CssLinkResourceTransformer . setResourceUrlProvider ( org.springframework.web.servlet.resource.ResourceUrlProvider ) ; java.util.List<org.springframework.web.servlet.resource.ResourceTransformer> < ResourceTransformer > java.util.List<org.springframework.web.servlet.resource.ResourceTransformer> = java.util.Arrays . java.util.List ( org.springframework.web.servlet.resource.CssLinkResourceTransformer ) ; this . org.springframework.web.servlet.resource.ResourceTransformerChain = new DefaultResourceTransformerChain ( org.springframework.web.servlet.resource.ResourceResolverChain , java.util.List<org.springframework.web.servlet.resource.ResourceTransformer> ) ; this . org.springframework.web.servlet.resource.AppCacheManifestTransformer = new AppCacheManifestTransformer ( ) ; this . org.springframework.web.servlet.resource.AppCacheManifestTransformer . setResourceUrlProvider ( org.springframework.web.servlet.resource.ResourceUrlProvider ) ; org.springframework.web.servlet.resource.ResourceHttpRequestHandler . setResourceResolvers ( java.util.List<org.springframework.web.servlet.resource.ResourceResolver> ) ; org.springframework.web.servlet.resource.ResourceHttpRequestHandler . setResourceTransformers ( java.util.List<org.springframework.web.servlet.resource.ResourceTransformer> ) ; org.springframework.web.servlet.resource.ResourceHttpRequestHandler . setLocations ( java.util.Collections . java.util.List ( org.springframework.web.servlet.resource.ClassPathResource ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.servlet.resource.ResourceTransformerChain = mock ( ResourceTransformerChain .class ) ; this . org.springframework.web.servlet.resource.HttpServletRequest = mock ( HttpServletRequest .class ) ; Resource org.springframework.web.servlet.resource.Resource = mock ( Resource .class ) ; given ( org.springframework.web.servlet.resource.Resource . getFilename ( ) ) . willReturn ( STRING ) ; given ( this . org.springframework.web.servlet.resource.ResourceTransformerChain . transform ( this . org.springframework.web.servlet.resource.HttpServletRequest , org.springframework.web.servlet.resource.Resource ) ) . willReturn ( org.springframework.web.servlet.resource.Resource ) ; Resource org.springframework.web.servlet.resource.Resource = this . org.springframework.web.servlet.resource.AppCacheManifestTransformer . transform ( this . org.springframework.web.servlet.resource.HttpServletRequest , org.springframework.web.servlet.resource.Resource , this . org.springframework.web.servlet.resource.ResourceTransformerChain ) ; assertEquals ( org.springframework.web.servlet.resource.Resource , org.springframework.web.servlet.resource.Resource ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.servlet.resource.ResourceTransformerChain = mock ( ResourceTransformerChain .class ) ; this . org.springframework.web.servlet.resource.HttpServletRequest = mock ( HttpServletRequest .class ) ; Resource org.springframework.web.servlet.resource.Resource = new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.web.servlet.resource.AppCacheManifestTransformerTests> ( ) ) ; given ( this . org.springframework.web.servlet.resource.ResourceTransformerChain . transform ( this . org.springframework.web.servlet.resource.HttpServletRequest , org.springframework.web.servlet.resource.Resource ) ) . willReturn ( org.springframework.web.servlet.resource.Resource ) ; Resource org.springframework.web.servlet.resource.Resource = this . org.springframework.web.servlet.resource.AppCacheManifestTransformer . transform ( this . org.springframework.web.servlet.resource.HttpServletRequest , org.springframework.web.servlet.resource.Resource , this . org.springframework.web.servlet.resource.ResourceTransformerChain ) ; assertEquals ( org.springframework.web.servlet.resource.Resource , org.springframework.web.servlet.resource.Resource ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.servlet.resource.HttpServletRequest = new MockHttpServletRequest ( STRING , STRING ) ; Resource org.springframework.web.servlet.resource.Resource = new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.web.servlet.resource.AppCacheManifestTransformerTests> ( ) ) ; Resource org.springframework.web.servlet.resource.Resource = this . org.springframework.web.servlet.resource.AppCacheManifestTransformer . transform ( this . org.springframework.web.servlet.resource.HttpServletRequest , org.springframework.web.servlet.resource.Resource , this . org.springframework.web.servlet.resource.ResourceTransformerChain ) ; byte [] byte[] = FileCopyUtils . copyToByteArray ( org.springframework.web.servlet.resource.Resource . getInputStream ( ) ) ; java.lang.String java.lang.String = new java.lang.String ( byte[] , STRING ) ; assertThat ( STRING , java.lang.String , Matchers . containsString ( STRING ) ) ; assertThat ( STRING , java.lang.String , Matchers . containsString ( STRING ) ) ; assertThat ( STRING , java.lang.String , Matchers . containsString ( STRING ) ) ; assertThat ( STRING , java.lang.String , Matchers . containsString ( STRING ) ) ; assertThat ( STRING , java.lang.String , Matchers . containsString ( STRING ) ) ; assertThat ( STRING , java.lang.String , Matchers . containsString ( STRING ) ) ; }  <METHOD_END>