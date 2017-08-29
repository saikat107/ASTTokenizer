<METHOD_START> @ java.lang.Override public org.springframework.data.domain.jaxb.PageRequestDto org.springframework.data.domain.jaxb.PageRequestDto ( Pageable org.springframework.data.domain.jaxb.Pageable ) { SortDto org.springframework.data.domain.jaxb.SortDto = SortAdapter . INSTANCE . marshal ( org.springframework.data.domain.jaxb.Pageable . getSort ( ) ) ; PageRequestDto org.springframework.data.domain.jaxb.PageRequestDto = new PageRequestDto ( ) ; dto . orders = org.springframework.data.domain.jaxb.SortDto == null ? java.util.Collections . java.util.List<java.lang.Object> ( ) : sortDto . orders ; dto . page = org.springframework.data.domain.jaxb.Pageable . getPageNumber ( ) ; dto . size = org.springframework.data.domain.jaxb.Pageable . getPageSize ( ) ; return org.springframework.data.domain.jaxb.PageRequestDto ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.domain.jaxb.Pageable org.springframework.data.domain.jaxb.Pageable ( PageRequestDto org.springframework.data.domain.jaxb.PageRequestDto ) { if ( v . orders . isEmpty ( ) ) { return PageRequest . of ( v . page , v . size ) ; } SortDto org.springframework.data.domain.jaxb.SortDto = new SortDto ( ) ; sortDto . orders = v . orders ; return PageRequest . of ( v . page , v . size , SortAdapter . INSTANCE . unmarshal ( org.springframework.data.domain.jaxb.SortDto ) ) ; }  <METHOD_END>