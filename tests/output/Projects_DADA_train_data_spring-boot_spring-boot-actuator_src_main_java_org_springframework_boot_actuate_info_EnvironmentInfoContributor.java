<METHOD_START> public void ( ConfigurableEnvironment org.springframework.boot.actuate.info.ConfigurableEnvironment ) { this . org.springframework.boot.actuate.info.PropertySourcesBinder = new PropertySourcesBinder ( org.springframework.boot.actuate.info.ConfigurableEnvironment ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Info . Info Info.Builder ) { Info.Builder . withDetails ( this . org.springframework.boot.actuate.info.PropertySourcesBinder . extractAll ( STRING ) ) ; }  <METHOD_END>