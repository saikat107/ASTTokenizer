<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) protected java.util.List<org.springframework.web.servlet.support.FlashMap> < FlashMap > java.util.List<org.springframework.web.servlet.support.FlashMap> ( HttpServletRequest org.springframework.web.servlet.support.HttpServletRequest ) { HttpSession org.springframework.web.servlet.support.HttpSession = org.springframework.web.servlet.support.HttpServletRequest . getSession ( false ) ; return ( org.springframework.web.servlet.support.HttpSession != null ? ( java.util.List<org.springframework.web.servlet.support.FlashMap> < FlashMap > ) org.springframework.web.servlet.support.HttpSession . getAttribute ( java.lang.String ) : null ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( java.util.List<org.springframework.web.servlet.support.FlashMap> < FlashMap > java.util.List<org.springframework.web.servlet.support.FlashMap> , HttpServletRequest org.springframework.web.servlet.support.HttpServletRequest , HttpServletResponse org.springframework.web.servlet.support.HttpServletResponse ) { WebUtils . setSessionAttribute ( org.springframework.web.servlet.support.HttpServletRequest , java.lang.String , ( ! java.util.List<org.springframework.web.servlet.support.FlashMap> . isEmpty ( ) ? java.util.List<org.springframework.web.servlet.support.FlashMap> : null ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( HttpServletRequest org.springframework.web.servlet.support.HttpServletRequest ) { return WebUtils . getSessionMutex ( org.springframework.web.servlet.support.HttpServletRequest . getSession ( ) ) ; }  <METHOD_END>