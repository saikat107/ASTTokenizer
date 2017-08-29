<METHOD_START> public void ( HttpEncodingProperties org.springframework.boot.autoconfigure.web.servlet.HttpEncodingProperties ) { this . org.springframework.boot.autoconfigure.web.servlet.HttpEncodingProperties = org.springframework.boot.autoconfigure.web.servlet.HttpEncodingProperties ; }  <METHOD_END>
<METHOD_START> @ Bean @ ConditionalOnMissingBean ( CharacterEncodingFilter .class ) public org.springframework.boot.autoconfigure.web.servlet.CharacterEncodingFilter org.springframework.boot.autoconfigure.web.servlet.CharacterEncodingFilter ( ) { CharacterEncodingFilter org.springframework.boot.autoconfigure.web.servlet.CharacterEncodingFilter = new OrderedCharacterEncodingFilter ( ) ; org.springframework.boot.autoconfigure.web.servlet.CharacterEncodingFilter . setEncoding ( this . org.springframework.boot.autoconfigure.web.servlet.HttpEncodingProperties . getCharset ( ) . name ( ) ) ; org.springframework.boot.autoconfigure.web.servlet.CharacterEncodingFilter . setForceRequestEncoding ( this . org.springframework.boot.autoconfigure.web.servlet.HttpEncodingProperties . shouldForce ( Type . REQUEST ) ) ; org.springframework.boot.autoconfigure.web.servlet.CharacterEncodingFilter . setForceResponseEncoding ( this . org.springframework.boot.autoconfigure.web.servlet.HttpEncodingProperties . shouldForce ( Type . RESPONSE ) ) ; return org.springframework.boot.autoconfigure.web.servlet.CharacterEncodingFilter ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.web.servlet.HttpEncodingAutoConfiguration.LocaleCharsetMappingsCustomizer org.springframework.boot.autoconfigure.web.servlet.HttpEncodingAutoConfiguration.LocaleCharsetMappingsCustomizer ( ) { return new org.springframework.boot.autoconfigure.web.servlet.HttpEncodingAutoConfiguration.LocaleCharsetMappingsCustomizer ( this . org.springframework.boot.autoconfigure.web.servlet.HttpEncodingProperties ) ; }  <METHOD_END>
<METHOD_START> void ( HttpEncodingProperties org.springframework.boot.autoconfigure.web.servlet.HttpEncodingProperties ) { this . org.springframework.boot.autoconfigure.web.servlet.HttpEncodingProperties = org.springframework.boot.autoconfigure.web.servlet.HttpEncodingProperties ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ConfigurableServletWebServerFactory org.springframework.boot.autoconfigure.web.servlet.ConfigurableServletWebServerFactory ) { if ( this . org.springframework.boot.autoconfigure.web.servlet.HttpEncodingProperties . getMapping ( ) != null ) { org.springframework.boot.autoconfigure.web.servlet.ConfigurableServletWebServerFactory . setLocaleCharsetMappings ( this . org.springframework.boot.autoconfigure.web.servlet.HttpEncodingProperties . getMapping ( ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return NUMBER ; }  <METHOD_END>