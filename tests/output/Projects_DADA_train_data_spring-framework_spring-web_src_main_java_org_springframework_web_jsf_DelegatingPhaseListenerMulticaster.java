<METHOD_START> @ java.lang.Override public org.springframework.web.jsf.PhaseId org.springframework.web.jsf.PhaseId ( ) { return PhaseId . ANY_PHASE ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( PhaseEvent org.springframework.web.jsf.PhaseEvent ) { for ( PhaseListener org.springframework.web.jsf.PhaseListener : java.util.Collection<org.springframework.web.jsf.PhaseListener> ( org.springframework.web.jsf.PhaseEvent . getFacesContext ( ) ) ) { org.springframework.web.jsf.PhaseListener . beforePhase ( org.springframework.web.jsf.PhaseEvent ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( PhaseEvent org.springframework.web.jsf.PhaseEvent ) { for ( PhaseListener org.springframework.web.jsf.PhaseListener : java.util.Collection<org.springframework.web.jsf.PhaseListener> ( org.springframework.web.jsf.PhaseEvent . getFacesContext ( ) ) ) { org.springframework.web.jsf.PhaseListener . afterPhase ( org.springframework.web.jsf.PhaseEvent ) ; } }  <METHOD_END>
<METHOD_START> protected java.util.Collection<org.springframework.web.jsf.PhaseListener> < PhaseListener > java.util.Collection<org.springframework.web.jsf.PhaseListener> ( FacesContext org.springframework.web.jsf.FacesContext ) { ListableBeanFactory org.springframework.web.jsf.ListableBeanFactory = org.springframework.web.jsf.ListableBeanFactory ( org.springframework.web.jsf.FacesContext ) ; return BeanFactoryUtils . beansOfTypeIncludingAncestors ( org.springframework.web.jsf.ListableBeanFactory , PhaseListener .class , true , false ) . values ( ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.web.jsf.ListableBeanFactory org.springframework.web.jsf.ListableBeanFactory ( FacesContext org.springframework.web.jsf.FacesContext ) { return org.springframework.web.jsf.WebApplicationContext ( org.springframework.web.jsf.FacesContext ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.web.jsf.WebApplicationContext org.springframework.web.jsf.WebApplicationContext ( FacesContext org.springframework.web.jsf.FacesContext ) { return FacesContextUtils . getRequiredWebApplicationContext ( org.springframework.web.jsf.FacesContext ) ; }  <METHOD_END>