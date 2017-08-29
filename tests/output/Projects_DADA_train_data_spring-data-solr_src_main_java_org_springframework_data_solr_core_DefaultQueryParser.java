<METHOD_START> @ java.lang.Override public final org.springframework.data.solr.core.SolrQuery org.springframework.data.solr.core.SolrQuery ( SolrDataQuery org.springframework.data.solr.core.SolrDataQuery ) { Assert . notNull ( org.springframework.data.solr.core.SolrDataQuery , STRING ) ; Assert . notNull ( org.springframework.data.solr.core.SolrDataQuery . getCriteria ( ) , STRING ) ; SolrQuery org.springframework.data.solr.core.SolrQuery = new SolrQuery ( ) ; org.springframework.data.solr.core.SolrQuery . setParam ( CommonParams . Q , getQueryString ( org.springframework.data.solr.core.SolrDataQuery ) ) ; if ( org.springframework.data.solr.core.SolrDataQuery instanceof Query ) { void ( org.springframework.data.solr.core.SolrQuery , ( Query ) org.springframework.data.solr.core.SolrDataQuery ) ; } if ( org.springframework.data.solr.core.SolrDataQuery instanceof FacetQuery ) { void ( org.springframework.data.solr.core.SolrQuery , ( FacetQuery ) org.springframework.data.solr.core.SolrDataQuery ) ; } if ( org.springframework.data.solr.core.SolrDataQuery instanceof HighlightQuery ) { void ( org.springframework.data.solr.core.SolrQuery , ( HighlightQuery ) org.springframework.data.solr.core.SolrDataQuery ) ; } return org.springframework.data.solr.core.SolrQuery ; }  <METHOD_END>
<METHOD_START> private void void ( SolrQuery org.springframework.data.solr.core.SolrQuery , Query org.springframework.data.solr.core.Query ) { appendPagination ( org.springframework.data.solr.core.SolrQuery , org.springframework.data.solr.core.Query . getOffset ( ) , org.springframework.data.solr.core.Query . getRows ( ) ) ; appendProjectionOnFields ( org.springframework.data.solr.core.SolrQuery , org.springframework.data.solr.core.Query . getProjectionOnFields ( ) ) ; void ( org.springframework.data.solr.core.SolrQuery , org.springframework.data.solr.core.Query . getFilterQueries ( ) ) ; void ( org.springframework.data.solr.core.SolrQuery , org.springframework.data.solr.core.Query . getSort ( ) ) ; appendDefaultOperator ( org.springframework.data.solr.core.SolrQuery , org.springframework.data.solr.core.Query . getDefaultOperator ( ) ) ; appendTimeAllowed ( org.springframework.data.solr.core.SolrQuery , org.springframework.data.solr.core.Query . getTimeAllowed ( ) ) ; appendDefType ( org.springframework.data.solr.core.SolrQuery , org.springframework.data.solr.core.Query . getDefType ( ) ) ; appendRequestHandler ( org.springframework.data.solr.core.SolrQuery , org.springframework.data.solr.core.Query . getRequestHandler ( ) ) ; void ( org.springframework.data.solr.core.SolrQuery , org.springframework.data.solr.core.Query ) ; void ( org.springframework.data.solr.core.SolrQuery , org.springframework.data.solr.core.Query ) ; void ( org.springframework.data.solr.core.SolrQuery , org.springframework.data.solr.core.Query ) ; if ( org.springframework.data.solr.core.Logger . isDebugEnabled ( ) ) { org.springframework.data.solr.core.Logger . debug ( STRING , org.springframework.data.solr.core.SolrQuery ) ; } }  <METHOD_END>
<METHOD_START> private void void ( SolrQuery org.springframework.data.solr.core.SolrQuery , FacetQuery org.springframework.data.solr.core.FacetQuery ) { if ( boolean ( org.springframework.data.solr.core.SolrQuery , org.springframework.data.solr.core.FacetQuery ) ) { void ( org.springframework.data.solr.core.SolrQuery , ( FacetQuery ) org.springframework.data.solr.core.FacetQuery ) ; void ( org.springframework.data.solr.core.SolrQuery , ( FacetQuery ) org.springframework.data.solr.core.FacetQuery ) ; void ( org.springframework.data.solr.core.SolrQuery , ( FacetQuery ) org.springframework.data.solr.core.FacetQuery ) ; void ( org.springframework.data.solr.core.SolrQuery , ( FacetQuery ) org.springframework.data.solr.core.FacetQuery ) ; } }  <METHOD_END>
<METHOD_START> private void void ( Query org.springframework.data.solr.core.Query , java.lang.Object java.lang.Object , java.lang.String java.lang.String ) { if ( org.springframework.data.solr.core.Query instanceof NamedObjectsQuery ) { ( ( NamedObjectsQuery ) org.springframework.data.solr.core.Query ) . setName ( java.lang.Object , java.lang.String ) ; } }  <METHOD_END>
<METHOD_START> private void void ( SolrQuery org.springframework.data.solr.core.SolrQuery , Query org.springframework.data.solr.core.Query ) { StatsOptions org.springframework.data.solr.core.StatsOptions = org.springframework.data.solr.core.Query . getStatsOptions ( ) ; if ( org.springframework.data.solr.core.StatsOptions == null || ( CollectionUtils . isEmpty ( org.springframework.data.solr.core.StatsOptions . getFields ( ) ) && CollectionUtils . isEmpty ( org.springframework.data.solr.core.StatsOptions . getFacets ( ) ) && CollectionUtils . isEmpty ( org.springframework.data.solr.core.StatsOptions . getSelectiveFacets ( ) ) ) ) { return; } org.springframework.data.solr.core.SolrQuery . set ( StatsParams . STATS , true ) ; for ( Field org.springframework.data.solr.core.Field : org.springframework.data.solr.core.StatsOptions . getFields ( ) ) { org.springframework.data.solr.core.SolrQuery . add ( StatsParams . STATS_FIELD , org.springframework.data.solr.core.Field . getName ( ) ) ; java.lang.String java.lang.String = CommonParams . FIELD + STRING + org.springframework.data.solr.core.Field . getName ( ) + STRING + StatsParams . STATS_CALC_DISTINCT ; java.lang.Boolean java.lang.Boolean = org.springframework.data.solr.core.StatsOptions . isSelectiveCalcDistincts ( org.springframework.data.solr.core.Field ) ; if ( java.lang.Boolean != null ) { org.springframework.data.solr.core.SolrQuery . add ( java.lang.String , java.lang.String . java.lang.String ( java.lang.Boolean . boolean ( ) ) ) ; } } for ( Field org.springframework.data.solr.core.Field : org.springframework.data.solr.core.StatsOptions . getFacets ( ) ) { org.springframework.data.solr.core.SolrQuery . add ( StatsParams . STATS_FACET , org.springframework.data.solr.core.Field . getName ( ) ) ; } for ( java.util.Map.Entry<org.springframework.data.solr.core.Field,java.util.Collection<org.springframework.data.solr.core.Field>> < Field , java.util.Collection<org.springframework.data.solr.core.Field> < Field > > java.util.Map.Entry<org.springframework.data.solr.core.Field,java.util.Collection<org.springframework.data.solr.core.Field>> : org.springframework.data.solr.core.StatsOptions . getSelectiveFacets ( ) . entrySet ( ) ) { Field org.springframework.data.solr.core.Field = java.util.Map.Entry<org.springframework.data.solr.core.Field,java.util.Collection<org.springframework.data.solr.core.Field>> . getKey ( ) ; java.lang.String java.lang.String = CommonParams . FIELD + STRING + org.springframework.data.solr.core.Field . getName ( ) + STRING ; java.lang.String java.lang.String = java.lang.String + StatsParams . STATS_FACET ; for ( Field org.springframework.data.solr.core.Field : java.util.Map.Entry<org.springframework.data.solr.core.Field,java.util.Collection<org.springframework.data.solr.core.Field>> . getValue ( ) ) { org.springframework.data.solr.core.SolrQuery . add ( java.lang.String , org.springframework.data.solr.core.Field . getName ( ) ) ; } } }  <METHOD_END>
<METHOD_START> private void void ( SolrQuery org.springframework.data.solr.core.SolrQuery , Query org.springframework.data.solr.core.Query ) { GroupOptions org.springframework.data.solr.core.GroupOptions = org.springframework.data.solr.core.Query . getGroupOptions ( ) ; if ( org.springframework.data.solr.core.GroupOptions == null || ( CollectionUtils . isEmpty ( org.springframework.data.solr.core.GroupOptions . getGroupByFields ( ) ) && CollectionUtils . isEmpty ( org.springframework.data.solr.core.GroupOptions . getGroupByFunctions ( ) ) && CollectionUtils . isEmpty ( org.springframework.data.solr.core.GroupOptions . getGroupByQueries ( ) ) ) ) { return; } org.springframework.data.solr.core.SolrQuery . set ( GroupParams . GROUP , true ) ; org.springframework.data.solr.core.SolrQuery . set ( GroupParams . GROUP_MAIN , org.springframework.data.solr.core.GroupOptions . isGroupMain ( ) ) ; org.springframework.data.solr.core.SolrQuery . set ( GroupParams . GROUP_FORMAT , STRING ) ; if ( ! CollectionUtils . isEmpty ( org.springframework.data.solr.core.GroupOptions . getGroupByFields ( ) ) ) { for ( Field org.springframework.data.solr.core.Field : org.springframework.data.solr.core.GroupOptions . getGroupByFields ( ) ) { org.springframework.data.solr.core.SolrQuery . add ( GroupParams . GROUP_FIELD , org.springframework.data.solr.core.Field . getName ( ) ) ; } } if ( ! CollectionUtils . isEmpty ( org.springframework.data.solr.core.GroupOptions . getGroupByFunctions ( ) ) ) { for ( Function org.springframework.data.solr.core.Function : org.springframework.data.solr.core.GroupOptions . getGroupByFunctions ( ) ) { java.lang.String java.lang.String = createFunctionFragment ( org.springframework.data.solr.core.Function , NUMBER ) ; void ( org.springframework.data.solr.core.Query , org.springframework.data.solr.core.Function , java.lang.String ) ; org.springframework.data.solr.core.SolrQuery . add ( GroupParams . GROUP_FUNC , java.lang.String ) ; } } if ( ! CollectionUtils . isEmpty ( org.springframework.data.solr.core.GroupOptions . getGroupByQueries ( ) ) ) { for ( Query org.springframework.data.solr.core.Query : org.springframework.data.solr.core.GroupOptions . getGroupByQueries ( ) ) { java.lang.String java.lang.String = getQueryString ( org.springframework.data.solr.core.Query ) ; void ( org.springframework.data.solr.core.Query , org.springframework.data.solr.core.Query , java.lang.String ) ; org.springframework.data.solr.core.SolrQuery . add ( GroupParams . GROUP_QUERY , java.lang.String ) ; } } if ( org.springframework.data.solr.core.GroupOptions . getSort ( ) != null ) { for ( Order org.springframework.data.solr.core.Order : org.springframework.data.solr.core.GroupOptions . getSort ( ) ) { org.springframework.data.solr.core.SolrQuery . add ( GroupParams . GROUP_SORT , org.springframework.data.solr.core.Order . getProperty ( ) . trim ( ) + STRING + ( org.springframework.data.solr.core.Order . isAscending ( ) ? ORDER . asc : ORDER . desc ) ) ; } } if ( org.springframework.data.solr.core.GroupOptions . getCachePercent ( ) > NUMBER ) { org.springframework.data.solr.core.SolrQuery . add ( GroupParams . GROUP_CACHE_PERCENTAGE , java.lang.String . java.lang.String ( org.springframework.data.solr.core.GroupOptions . getCachePercent ( ) ) ) ; } if ( org.springframework.data.solr.core.GroupOptions . getLimit ( ) != null ) { org.springframework.data.solr.core.SolrQuery . set ( GroupParams . GROUP_LIMIT , org.springframework.data.solr.core.GroupOptions . getLimit ( ) ) ; } if ( org.springframework.data.solr.core.GroupOptions . getOffset ( ) != null && org.springframework.data.solr.core.GroupOptions . getOffset ( ) >= NUMBER ) { org.springframework.data.solr.core.SolrQuery . set ( GroupParams . GROUP_OFFSET , org.springframework.data.solr.core.GroupOptions . getOffset ( ) ) ; } org.springframework.data.solr.core.SolrQuery . set ( GroupParams . GROUP_TOTAL_COUNT , org.springframework.data.solr.core.GroupOptions . isTotalCount ( ) ) ; org.springframework.data.solr.core.SolrQuery . set ( GroupParams . GROUP_FACET , org.springframework.data.solr.core.GroupOptions . isGroupFacets ( ) ) ; org.springframework.data.solr.core.SolrQuery . set ( GroupParams . GROUP_TRUNCATE , org.springframework.data.solr.core.GroupOptions . isTruncateFacets ( ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( SolrQuery org.springframework.data.solr.core.SolrQuery , Query org.springframework.data.solr.core.Query ) { if ( org.springframework.data.solr.core.Query . getSpellcheckOptions ( ) == null ) { return; } SpellcheckOptions org.springframework.data.solr.core.SpellcheckOptions = org.springframework.data.solr.core.Query . getSpellcheckOptions ( ) ; if ( org.springframework.data.solr.core.SpellcheckOptions . getQuery ( ) != null ) { org.springframework.data.solr.core.SolrQuery . set ( SpellingParams . SPELLCHECK_Q , createQueryStringFromCriteria ( org.springframework.data.solr.core.SpellcheckOptions . getQuery ( ) . getCriteria ( ) ) ) ; } ModifiableSolrParams org.springframework.data.solr.core.ModifiableSolrParams = new ModifiableSolrParams ( ) ; org.springframework.data.solr.core.ModifiableSolrParams . add ( STRING , STRING ) ; for ( java.util.Map.Entry<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map.Entry<java.lang.String,java.lang.Object> : org.springframework.data.solr.core.SpellcheckOptions . getParams ( ) . entrySet ( ) ) { if ( java.util.Map.Entry<java.lang.String,java.lang.Object> . java.lang.Object ( ) instanceof java.lang.Iterable<?> < ? > ) { for ( java.lang.Object java.lang.Object : ( ( java.lang.Iterable<?> < ? > ) java.util.Map.Entry<java.lang.String,java.lang.Object> . java.lang.Object ( ) ) ) { org.springframework.data.solr.core.ModifiableSolrParams . add ( java.util.Map.Entry<java.lang.String,java.lang.Object> . java.lang.String ( ) , java.lang.Object . java.lang.String ( ) ) ; } } else if ( ObjectUtils . isArray ( java.util.Map.Entry<java.lang.String,java.lang.Object> . java.lang.Object ( ) ) ) { for ( java.lang.Object java.lang.Object : ObjectUtils . toObjectArray ( java.util.Map.Entry<java.lang.String,java.lang.Object> . java.lang.Object ( ) ) ) { org.springframework.data.solr.core.ModifiableSolrParams . add ( java.util.Map.Entry<java.lang.String,java.lang.Object> . java.lang.String ( ) , java.lang.Object . java.lang.String ( ) ) ; } } else { org.springframework.data.solr.core.ModifiableSolrParams . add ( java.util.Map.Entry<java.lang.String,java.lang.Object> . java.lang.String ( ) , java.util.Map.Entry<java.lang.String,java.lang.Object> . java.lang.Object ( ) . java.lang.String ( ) ) ; } } org.springframework.data.solr.core.SolrQuery . add ( org.springframework.data.solr.core.ModifiableSolrParams ) ; }  <METHOD_END>
<METHOD_START> protected void void ( SolrQuery org.springframework.data.solr.core.SolrQuery , HighlightQuery org.springframework.data.solr.core.HighlightQuery ) { if ( org.springframework.data.solr.core.HighlightQuery . hasHighlightOptions ( ) ) { HighlightOptions org.springframework.data.solr.core.HighlightOptions = org.springframework.data.solr.core.HighlightQuery . getHighlightOptions ( ) ; org.springframework.data.solr.core.SolrQuery . setHighlight ( true ) ; if ( ! org.springframework.data.solr.core.HighlightOptions . hasFields ( ) ) { org.springframework.data.solr.core.SolrQuery . addHighlightField ( HighlightOptions . ALL_FIELDS . getName ( ) ) ; } else { for ( Field org.springframework.data.solr.core.Field : org.springframework.data.solr.core.HighlightOptions . getFields ( ) ) { org.springframework.data.solr.core.SolrQuery . addHighlightField ( org.springframework.data.solr.core.Field . getName ( ) ) ; } for ( FieldWithHighlightParameters org.springframework.data.solr.core.FieldWithHighlightParameters : org.springframework.data.solr.core.HighlightOptions . getFieldsWithHighlightParameters ( ) ) { void ( org.springframework.data.solr.core.SolrQuery , org.springframework.data.solr.core.FieldWithHighlightParameters ) ; } } for ( HighlightParameter org.springframework.data.solr.core.HighlightParameter : org.springframework.data.solr.core.HighlightOptions . getHighlightParameters ( ) ) { void ( org.springframework.data.solr.core.SolrQuery , org.springframework.data.solr.core.HighlightParameter ) ; } if ( org.springframework.data.solr.core.HighlightOptions . hasQuery ( ) ) { org.springframework.data.solr.core.SolrQuery . add ( HighlightParams . Q , getQueryString ( org.springframework.data.solr.core.HighlightOptions . getQuery ( ) ) ) ; } } }  <METHOD_END>
<METHOD_START> private void void ( SolrQuery org.springframework.data.solr.core.SolrQuery , QueryParameter org.springframework.data.solr.core.QueryParameter ) { if ( org.springframework.data.solr.core.QueryParameter != null && StringUtils . isNotBlank ( org.springframework.data.solr.core.QueryParameter . getName ( ) ) ) { org.springframework.data.solr.core.SolrQuery . add ( org.springframework.data.solr.core.QueryParameter . getName ( ) , conversionService . convert ( org.springframework.data.solr.core.QueryParameter . getValue ( ) , java.lang.String .class ) ) ; } }  <METHOD_END>
<METHOD_START> private void void ( SolrQuery org.springframework.data.solr.core.SolrQuery , Field org.springframework.data.solr.core.Field , QueryParameter org.springframework.data.solr.core.QueryParameter ) { if ( org.springframework.data.solr.core.QueryParameter != null && org.springframework.data.solr.core.Field != null && StringUtils . isNotBlank ( org.springframework.data.solr.core.QueryParameter . getName ( ) ) ) { if ( org.springframework.data.solr.core.QueryParameter . getValue ( ) == null ) { org.springframework.data.solr.core.SolrQuery . add ( java.lang.String ( org.springframework.data.solr.core.Field , org.springframework.data.solr.core.QueryParameter . getName ( ) ) , ( java.lang.String ) null ) ; } else { java.lang.String java.lang.String = org.springframework.data.solr.core.QueryParameter . getValue ( ) . toString ( ) ; if ( conversionService . canConvert ( org.springframework.data.solr.core.QueryParameter . getValue ( ) . getClass ( ) , java.lang.String .class ) ) { java.lang.String = conversionService . convert ( org.springframework.data.solr.core.QueryParameter . getValue ( ) , java.lang.String .class ) ; } org.springframework.data.solr.core.SolrQuery . add ( java.lang.String ( org.springframework.data.solr.core.Field , org.springframework.data.solr.core.QueryParameter . getName ( ) ) , java.lang.String ) ; } } }  <METHOD_END>
<METHOD_START> private void void ( SolrQuery org.springframework.data.solr.core.SolrQuery , FieldWithHighlightParameters org.springframework.data.solr.core.FieldWithHighlightParameters ) { for ( HighlightParameter org.springframework.data.solr.core.HighlightParameter : org.springframework.data.solr.core.FieldWithHighlightParameters ) { void ( org.springframework.data.solr.core.SolrQuery , org.springframework.data.solr.core.FieldWithHighlightParameters , org.springframework.data.solr.core.HighlightParameter ) ; } }  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( Field org.springframework.data.solr.core.Field , java.lang.String java.lang.String ) { return STRING + org.springframework.data.solr.core.Field . getName ( ) + STRING + java.lang.String ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( SolrQuery org.springframework.data.solr.core.SolrQuery , FacetQuery org.springframework.data.solr.core.FacetQuery ) { FacetOptions org.springframework.data.solr.core.FacetOptions = org.springframework.data.solr.core.FacetQuery . getFacetOptions ( ) ; if ( org.springframework.data.solr.core.FacetOptions == null || ! org.springframework.data.solr.core.FacetOptions . hasFacets ( ) ) { return false ; } org.springframework.data.solr.core.SolrQuery . setFacet ( true ) ; org.springframework.data.solr.core.SolrQuery . setFacetMinCount ( org.springframework.data.solr.core.FacetOptions . getFacetMinCount ( ) ) ; org.springframework.data.solr.core.SolrQuery . setFacetLimit ( org.springframework.data.solr.core.FacetOptions . getPageable ( ) . getPageSize ( ) ) ; if ( org.springframework.data.solr.core.FacetOptions . getPageable ( ) . getPageNumber ( ) > NUMBER ) { long long = java.lang.Math . int ( NUMBER , org.springframework.data.solr.core.FacetOptions . getPageable ( ) . getOffset ( ) ) ; org.springframework.data.solr.core.SolrQuery . set ( FacetParams . FACET_OFFSET , STRING + long ) ; } if ( FacetOptions . FacetSort . INDEX . equals ( org.springframework.data.solr.core.FacetOptions . getFacetSort ( ) ) ) { org.springframework.data.solr.core.SolrQuery . setFacetSort ( FacetParams . FACET_SORT_INDEX ) ; } return true ; }  <METHOD_END>
<METHOD_START> private void void ( SolrQuery org.springframework.data.solr.core.SolrQuery , FacetQuery org.springframework.data.solr.core.FacetQuery ) { FacetOptions org.springframework.data.solr.core.FacetOptions = org.springframework.data.solr.core.FacetQuery . getFacetOptions ( ) ; org.springframework.data.solr.core.SolrQuery . addFacetField ( java.lang.String[] ( org.springframework.data.solr.core.FacetOptions . getFacetOnFields ( ) ) ) ; if ( org.springframework.data.solr.core.FacetOptions . hasFacetPrefix ( ) ) { org.springframework.data.solr.core.SolrQuery . setFacetPrefix ( org.springframework.data.solr.core.FacetOptions . getFacetPrefix ( ) ) ; } for ( FieldWithFacetParameters org.springframework.data.solr.core.FieldWithFacetParameters : org.springframework.data.solr.core.FacetOptions . getFieldsWithParameters ( ) ) { void ( org.springframework.data.solr.core.SolrQuery , org.springframework.data.solr.core.FieldWithFacetParameters ) ; if ( org.springframework.data.solr.core.FieldWithFacetParameters . getSort ( ) != null && FacetOptions . FacetSort . INDEX . equals ( org.springframework.data.solr.core.FieldWithFacetParameters . getSort ( ) ) ) { void ( org.springframework.data.solr.core.SolrQuery , org.springframework.data.solr.core.FieldWithFacetParameters , new FacetParameter ( FacetParams . FACET_SORT , FacetParams . FACET_SORT_INDEX ) ) ; } } }  <METHOD_END>
<METHOD_START> private void void ( SolrQuery org.springframework.data.solr.core.SolrQuery , FieldWithFacetParameters org.springframework.data.solr.core.FieldWithFacetParameters ) { for ( FacetParameter org.springframework.data.solr.core.FacetParameter : org.springframework.data.solr.core.FieldWithFacetParameters ) { void ( org.springframework.data.solr.core.SolrQuery , org.springframework.data.solr.core.FieldWithFacetParameters , org.springframework.data.solr.core.FacetParameter ) ; } }  <METHOD_END>
<METHOD_START> private void void ( SolrQuery org.springframework.data.solr.core.SolrQuery , FacetQuery org.springframework.data.solr.core.FacetQuery ) { FacetOptions org.springframework.data.solr.core.FacetOptions = org.springframework.data.solr.core.FacetQuery . getFacetOptions ( ) ; if ( org.springframework.data.solr.core.FacetOptions == null ) { return; } for ( FieldWithRangeParameters < ? , ? , ? > org.springframework.data.solr.core.FieldWithRangeParameters<?,?,?> : org.springframework.data.solr.core.FacetOptions . getFieldsWithRangeParameters ( ) ) { if ( org.springframework.data.solr.core.FieldWithRangeParameters<,,> instanceof FieldWithDateRangeParameters ) { void ( org.springframework.data.solr.core.SolrQuery , ( FieldWithDateRangeParameters ) org.springframework.data.solr.core.FieldWithRangeParameters<,,> ) ; } else if ( org.springframework.data.solr.core.FieldWithRangeParameters<,,> instanceof FieldWithNumericRangeParameters ) { void ( org.springframework.data.solr.core.SolrQuery , ( FieldWithNumericRangeParameters ) org.springframework.data.solr.core.FieldWithRangeParameters<,,> ) ; } if ( org.springframework.data.solr.core.FieldWithRangeParameters<,,> . getHardEnd ( ) != null && org.springframework.data.solr.core.FieldWithRangeParameters<,,> . getHardEnd ( ) ) { FacetParameter org.springframework.data.solr.core.FacetParameter = new FacetParameter ( FacetParams . FACET_RANGE_HARD_END , true ) ; void ( org.springframework.data.solr.core.SolrQuery , org.springframework.data.solr.core.FieldWithRangeParameters<,,> , org.springframework.data.solr.core.FacetParameter ) ; } if ( org.springframework.data.solr.core.FieldWithRangeParameters<,,> . getOther ( ) != null ) { FacetParameter org.springframework.data.solr.core.FacetParameter = new FacetParameter ( FacetParams . FACET_RANGE_OTHER , org.springframework.data.solr.core.FieldWithRangeParameters<,,> . getOther ( ) ) ; void ( org.springframework.data.solr.core.SolrQuery , org.springframework.data.solr.core.FieldWithRangeParameters<,,> , org.springframework.data.solr.core.FacetParameter ) ; } if ( org.springframework.data.solr.core.FieldWithRangeParameters<,,> . getInclude ( ) != null ) { FacetParameter org.springframework.data.solr.core.FacetParameter = new FacetParameter ( FacetParams . FACET_RANGE_INCLUDE , org.springframework.data.solr.core.FieldWithRangeParameters<,,> . getInclude ( ) ) ; void ( org.springframework.data.solr.core.SolrQuery , org.springframework.data.solr.core.FieldWithRangeParameters<,,> , org.springframework.data.solr.core.FacetParameter ) ; } } }  <METHOD_END>
<METHOD_START> private void void ( SolrQuery org.springframework.data.solr.core.SolrQuery , FieldWithNumericRangeParameters org.springframework.data.solr.core.FieldWithNumericRangeParameters ) { org.springframework.data.solr.core.SolrQuery . addNumericRangeFacet ( org.springframework.data.solr.core.FieldWithNumericRangeParameters . getName ( ) , org.springframework.data.solr.core.FieldWithNumericRangeParameters . getStart ( ) , org.springframework.data.solr.core.FieldWithNumericRangeParameters . getEnd ( ) , org.springframework.data.solr.core.FieldWithNumericRangeParameters . getGap ( ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( SolrQuery org.springframework.data.solr.core.SolrQuery , FieldWithDateRangeParameters org.springframework.data.solr.core.FieldWithDateRangeParameters ) { org.springframework.data.solr.core.SolrQuery . addDateRangeFacet ( org.springframework.data.solr.core.FieldWithDateRangeParameters . getName ( ) , org.springframework.data.solr.core.FieldWithDateRangeParameters . getStart ( ) , org.springframework.data.solr.core.FieldWithDateRangeParameters . getEnd ( ) , org.springframework.data.solr.core.FieldWithDateRangeParameters . getGap ( ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( SolrQuery org.springframework.data.solr.core.SolrQuery , FacetQuery org.springframework.data.solr.core.FacetQuery ) { FacetOptions org.springframework.data.solr.core.FacetOptions = org.springframework.data.solr.core.FacetQuery . getFacetOptions ( ) ; for ( SolrDataQuery org.springframework.data.solr.core.SolrDataQuery : org.springframework.data.solr.core.FacetOptions . getFacetQueries ( ) ) { java.lang.String java.lang.String = getQueryString ( org.springframework.data.solr.core.SolrDataQuery ) ; if ( StringUtils . isNotBlank ( java.lang.String ) ) { org.springframework.data.solr.core.SolrQuery . addFacetQuery ( java.lang.String ) ; } } }  <METHOD_END>
<METHOD_START> private void void ( SolrQuery org.springframework.data.solr.core.SolrQuery , FacetQuery org.springframework.data.solr.core.FacetQuery ) { FacetOptions org.springframework.data.solr.core.FacetOptions = org.springframework.data.solr.core.FacetQuery . getFacetOptions ( ) ; java.lang.String [] java.lang.String[] = java.lang.String[] ( org.springframework.data.solr.core.FacetOptions . getFacetOnPivots ( ) ) ; org.springframework.data.solr.core.SolrQuery . addFacetPivotField ( java.lang.String[] ) ; }  <METHOD_END>
<METHOD_START> protected void void ( SolrQuery org.springframework.data.solr.core.SolrQuery , java.util.List<org.springframework.data.solr.core.FilterQuery> < FilterQuery > java.util.List<org.springframework.data.solr.core.FilterQuery> ) { if ( CollectionUtils . isEmpty ( java.util.List<org.springframework.data.solr.core.FilterQuery> ) ) { return; } java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = java.util.List<java.lang.String> ( java.util.List<org.springframework.data.solr.core.FilterQuery> ) ; if ( ! java.util.List<java.lang.String> . boolean ( ) ) { org.springframework.data.solr.core.SolrQuery . setFilterQueries ( java.lang.String[] ( java.util.List<java.lang.String> ) ) ; } }  <METHOD_END>
<METHOD_START> protected void void ( SolrQuery org.springframework.data.solr.core.SolrQuery , Sort org.springframework.data.solr.core.Sort ) { if ( org.springframework.data.solr.core.Sort == null ) { return; } for ( Order org.springframework.data.solr.core.Order : org.springframework.data.solr.core.Sort ) { org.springframework.data.solr.core.SolrQuery . addSort ( org.springframework.data.solr.core.Order . getProperty ( ) , org.springframework.data.solr.core.Order . isAscending ( ) ? ORDER . asc : ORDER . desc ) ; } }  <METHOD_END>
<METHOD_START> private java.lang.String [] java.lang.String[] ( java.util.List<? extends org.springframework.data.solr.core.Field> < ? extends Field > java.util.List<? extends org.springframework.data.solr.core.Field> ) { java.lang.String [] java.lang.String[] = new java.lang.String [ java.util.List<> . int ( ) ] ; for ( int int = NUMBER ; int < java.util.List<> . int ( ) ; int ++ ) { java.lang.String[] [ int ] = java.util.List<> . get ( int ) . getName ( ) ; } return java.lang.String[] ; }  <METHOD_END>
<METHOD_START> private java.lang.String [] java.lang.String[] ( java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ) { java.lang.String [] java.lang.String[] = new java.lang.String [ java.util.List<java.lang.String> . int ( ) ] ; java.util.List<java.lang.String> . java.lang.String[] ( java.lang.String[] ) ; return java.lang.String[] ; }  <METHOD_END>
<METHOD_START> private java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ( java.util.List<org.springframework.data.solr.core.FilterQuery> < FilterQuery > java.util.List<org.springframework.data.solr.core.FilterQuery> ) { java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = new java.util.ArrayList <> ( java.util.List<org.springframework.data.solr.core.FilterQuery> . size ( ) ) ; for ( FilterQuery org.springframework.data.solr.core.FilterQuery : java.util.List<org.springframework.data.solr.core.FilterQuery> ) { java.lang.String java.lang.String = getQueryString ( org.springframework.data.solr.core.FilterQuery ) ; if ( StringUtils . isNotBlank ( java.lang.String ) ) { java.util.List<java.lang.String> . boolean ( java.lang.String ) ; } } return java.util.List<java.lang.String> ; }  <METHOD_END>