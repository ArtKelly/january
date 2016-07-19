/*
 * generated by Xtext 2.10.0
 */
grammar InternalIGES;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.january.geometry.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.january.geometry.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.january.geometry.xtext.services.IGESGrammarAccess;

}

@parser::members {

 	private IGESGrammarAccess grammarAccess;

    public InternalIGESParser(TokenStream input, IGESGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "IGES";
   	}

   	@Override
   	protected IGESGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleIGES
entryRuleIGES returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIGESRule()); }
	iv_ruleIGES=ruleIGES
	{ $current=$iv_ruleIGES.current; }
	EOF;

// Rule IGES
ruleIGES returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getIGESAccess().getStartStartParserRuleCall_0_0());
				}
				lv_start_0_0=ruleStart
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIGESRule());
					}
					set(
						$current,
						"start",
						lv_start_0_0,
						"org.eclipse.january.geometry.xtext.IGES.Start");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getIGESAccess().getGlobalGlobalParserRuleCall_1_0());
				}
				lv_global_1_0=ruleGlobal
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIGESRule());
					}
					set(
						$current,
						"global",
						lv_global_1_0,
						"org.eclipse.january.geometry.xtext.IGES.Global");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getIGESAccess().getDataDataParserRuleCall_2_0());
				}
				lv_data_2_0=ruleData
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIGESRule());
					}
					set(
						$current,
						"data",
						lv_data_2_0,
						"org.eclipse.january.geometry.xtext.IGES.Data");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getIGESAccess().getParametersParametersParserRuleCall_3_0());
				}
				lv_parameters_3_0=ruleParameters
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIGESRule());
					}
					set(
						$current,
						"parameters",
						lv_parameters_3_0,
						"org.eclipse.january.geometry.xtext.IGES.Parameters");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getIGESAccess().getEndEndParserRuleCall_4_0());
				}
				lv_end_4_0=ruleEnd
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIGESRule());
					}
					set(
						$current,
						"end",
						lv_end_4_0,
						"org.eclipse.january.geometry.xtext.IGES.End");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleStart
entryRuleStart returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStartRule()); }
	iv_ruleStart=ruleStart
	{ $current=$iv_ruleStart.current; }
	EOF;

// Rule Start
ruleStart returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getStartAccess().getLinesStartLineParserRuleCall_0());
			}
			lv_lines_0_0=rulestartLine
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getStartRule());
				}
				add(
					$current,
					"lines",
					lv_lines_0_0,
					"org.eclipse.january.geometry.xtext.IGES.startLine");
				afterParserOrEnumRuleCall();
			}
		)
	)+
;

// Entry rule entryRuleGlobal
entryRuleGlobal returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGlobalRule()); }
	iv_ruleGlobal=ruleGlobal
	{ $current=$iv_ruleGlobal.current; }
	EOF;

// Rule Global
ruleGlobal returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			this_DELIMITER_0=RULE_DELIMITER
			{
				newLeafNode(this_DELIMITER_0, grammarAccess.getGlobalAccess().getDELIMITERTerminalRuleCall_0());
			}
		)?
		(
			{
				newCompositeNode(grammarAccess.getGlobalAccess().getHStringParserRuleCall_1());
			}
			this_HString_1=ruleHString
			{
				$current = $this_HString_1.current;
				afterParserOrEnumRuleCall();
			}
		)?
		(
			this_DELIMITER_2=RULE_DELIMITER
			{
				newLeafNode(this_DELIMITER_2, grammarAccess.getGlobalAccess().getDELIMITERTerminalRuleCall_2());
			}
		)?
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getGlobalAccess().getValuesValueParserRuleCall_3_0_0());
					}
					lv_values_3_0=ruleValue
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGlobalRule());
						}
						add(
							$current,
							"values",
							lv_values_3_0,
							"org.eclipse.january.geometry.xtext.IGES.Value");
						afterParserOrEnumRuleCall();
					}
				)
			)+
			(
				this_WS_4=RULE_WS
				{
					newLeafNode(this_WS_4, grammarAccess.getGlobalAccess().getWSTerminalRuleCall_3_1());
				}
			)?
			otherlv_5='G'
			{
				newLeafNode(otherlv_5, grammarAccess.getGlobalAccess().getGKeyword_3_2());
			}
			(
				this_WS_6=RULE_WS
				{
					newLeafNode(this_WS_6, grammarAccess.getGlobalAccess().getWSTerminalRuleCall_3_3());
				}
			)?
			this_INT_7=RULE_INT
			{
				newLeafNode(this_INT_7, grammarAccess.getGlobalAccess().getINTTerminalRuleCall_3_4());
			}
			this_ENDLINE_8=RULE_ENDLINE
			{
				newLeafNode(this_ENDLINE_8, grammarAccess.getGlobalAccess().getENDLINETerminalRuleCall_3_5());
			}
		)+
		(
			(
				{
					newCompositeNode(grammarAccess.getGlobalAccess().getValuesValueParserRuleCall_4_0());
				}
				lv_values_9_0=ruleValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGlobalRule());
					}
					add(
						$current,
						"values",
						lv_values_9_0,
						"org.eclipse.january.geometry.xtext.IGES.Value");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		this_SEPARATOR_10=RULE_SEPARATOR
		{
			newLeafNode(this_SEPARATOR_10, grammarAccess.getGlobalAccess().getSEPARATORTerminalRuleCall_5());
		}
		(
			this_WS_11=RULE_WS
			{
				newLeafNode(this_WS_11, grammarAccess.getGlobalAccess().getWSTerminalRuleCall_6());
			}
		)?
		otherlv_12='G'
		{
			newLeafNode(otherlv_12, grammarAccess.getGlobalAccess().getGKeyword_7());
		}
		(
			this_WS_13=RULE_WS
			{
				newLeafNode(this_WS_13, grammarAccess.getGlobalAccess().getWSTerminalRuleCall_8());
			}
		)?
		this_INT_14=RULE_INT
		{
			newLeafNode(this_INT_14, grammarAccess.getGlobalAccess().getINTTerminalRuleCall_9());
		}
		this_ENDLINE_15=RULE_ENDLINE
		{
			newLeafNode(this_ENDLINE_15, grammarAccess.getGlobalAccess().getENDLINETerminalRuleCall_10());
		}
	)
;

// Entry rule entryRuleData
entryRuleData returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDataRule()); }
	iv_ruleData=ruleData
	{ $current=$iv_ruleData.current; }
	EOF;

// Rule Data
ruleData returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getDataAccess().getEntriesEntryParserRuleCall_0());
			}
			lv_entries_0_0=ruleEntry
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getDataRule());
				}
				add(
					$current,
					"entries",
					lv_entries_0_0,
					"org.eclipse.january.geometry.xtext.IGES.Entry");
				afterParserOrEnumRuleCall();
			}
		)
	)+
;

// Entry rule entryRuleEntry
entryRuleEntry returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntryRule()); }
	iv_ruleEntry=ruleEntry
	{ $current=$iv_ruleEntry.current; }
	EOF;

// Rule Entry
ruleEntry returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_WS_0=RULE_WS
		{
			newLeafNode(this_WS_0, grammarAccess.getEntryAccess().getWSTerminalRuleCall_0());
		}
		(
			(
				lv_type_1_0=RULE_INT
				{
					newLeafNode(lv_type_1_0, grammarAccess.getEntryAccess().getTypeINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntryRule());
					}
					setWithLastConsumed(
						$current,
						"type",
						lv_type_1_0,
						"org.eclipse.january.geometry.xtext.IGES.INT");
				}
			)
		)
		(
			this_WS_2=RULE_WS
			{
				newLeafNode(this_WS_2, grammarAccess.getEntryAccess().getWSTerminalRuleCall_2());
			}
		)?
		(
			(
				lv_paramData_3_0=RULE_INT
				{
					newLeafNode(lv_paramData_3_0, grammarAccess.getEntryAccess().getParamDataINTTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntryRule());
					}
					setWithLastConsumed(
						$current,
						"paramData",
						lv_paramData_3_0,
						"org.eclipse.january.geometry.xtext.IGES.INT");
				}
			)
		)
		(
			this_WS_4=RULE_WS
			{
				newLeafNode(this_WS_4, grammarAccess.getEntryAccess().getWSTerminalRuleCall_4());
			}
		)?
		(
			(
				lv_structure_5_0=RULE_INT
				{
					newLeafNode(lv_structure_5_0, grammarAccess.getEntryAccess().getStructureINTTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntryRule());
					}
					setWithLastConsumed(
						$current,
						"structure",
						lv_structure_5_0,
						"org.eclipse.january.geometry.xtext.IGES.INT");
				}
			)
		)
		(
			this_WS_6=RULE_WS
			{
				newLeafNode(this_WS_6, grammarAccess.getEntryAccess().getWSTerminalRuleCall_6());
			}
		)?
		(
			(
				lv_lineFont_7_0=RULE_INT
				{
					newLeafNode(lv_lineFont_7_0, grammarAccess.getEntryAccess().getLineFontINTTerminalRuleCall_7_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntryRule());
					}
					setWithLastConsumed(
						$current,
						"lineFont",
						lv_lineFont_7_0,
						"org.eclipse.january.geometry.xtext.IGES.INT");
				}
			)
		)
		(
			this_WS_8=RULE_WS
			{
				newLeafNode(this_WS_8, grammarAccess.getEntryAccess().getWSTerminalRuleCall_8());
			}
		)?
		(
			(
				lv_level_9_0=RULE_INT
				{
					newLeafNode(lv_level_9_0, grammarAccess.getEntryAccess().getLevelINTTerminalRuleCall_9_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntryRule());
					}
					setWithLastConsumed(
						$current,
						"level",
						lv_level_9_0,
						"org.eclipse.january.geometry.xtext.IGES.INT");
				}
			)
		)
		(
			this_WS_10=RULE_WS
			{
				newLeafNode(this_WS_10, grammarAccess.getEntryAccess().getWSTerminalRuleCall_10());
			}
		)?
		(
			(
				lv_view_11_0=RULE_INT
				{
					newLeafNode(lv_view_11_0, grammarAccess.getEntryAccess().getViewINTTerminalRuleCall_11_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntryRule());
					}
					setWithLastConsumed(
						$current,
						"view",
						lv_view_11_0,
						"org.eclipse.january.geometry.xtext.IGES.INT");
				}
			)
		)
		(
			this_WS_12=RULE_WS
			{
				newLeafNode(this_WS_12, grammarAccess.getEntryAccess().getWSTerminalRuleCall_12());
			}
		)?
		(
			(
				lv_TransformMatrix_13_0=RULE_INT
				{
					newLeafNode(lv_TransformMatrix_13_0, grammarAccess.getEntryAccess().getTransformMatrixINTTerminalRuleCall_13_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntryRule());
					}
					setWithLastConsumed(
						$current,
						"TransformMatrix",
						lv_TransformMatrix_13_0,
						"org.eclipse.january.geometry.xtext.IGES.INT");
				}
			)
		)
		(
			this_WS_14=RULE_WS
			{
				newLeafNode(this_WS_14, grammarAccess.getEntryAccess().getWSTerminalRuleCall_14());
			}
		)?
		(
			this_INT_15=RULE_INT
			{
				newLeafNode(this_INT_15, grammarAccess.getEntryAccess().getINTTerminalRuleCall_15());
			}
		)?
		(
			this_WS_16=RULE_WS
			{
				newLeafNode(this_WS_16, grammarAccess.getEntryAccess().getWSTerminalRuleCall_16());
			}
		)?
		(
			(
				lv_status_17_0=RULE_INT
				{
					newLeafNode(lv_status_17_0, grammarAccess.getEntryAccess().getStatusINTTerminalRuleCall_17_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntryRule());
					}
					setWithLastConsumed(
						$current,
						"status",
						lv_status_17_0,
						"org.eclipse.january.geometry.xtext.IGES.INT");
				}
			)
		)
		otherlv_18='D'
		{
			newLeafNode(otherlv_18, grammarAccess.getEntryAccess().getDKeyword_18());
		}
		(
			this_WS_19=RULE_WS
			{
				newLeafNode(this_WS_19, grammarAccess.getEntryAccess().getWSTerminalRuleCall_19());
			}
		)?
		(
			(
				lv_index_20_0=RULE_INT
				{
					newLeafNode(lv_index_20_0, grammarAccess.getEntryAccess().getIndexINTTerminalRuleCall_20_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntryRule());
					}
					setWithLastConsumed(
						$current,
						"index",
						lv_index_20_0,
						"org.eclipse.january.geometry.xtext.IGES.INT");
				}
			)
		)
		this_ENDLINE_21=RULE_ENDLINE
		{
			newLeafNode(this_ENDLINE_21, grammarAccess.getEntryAccess().getENDLINETerminalRuleCall_21());
		}
		(
			this_WS_22=RULE_WS
			{
				newLeafNode(this_WS_22, grammarAccess.getEntryAccess().getWSTerminalRuleCall_22());
			}
		)?
		this_INT_23=RULE_INT
		{
			newLeafNode(this_INT_23, grammarAccess.getEntryAccess().getINTTerminalRuleCall_23());
		}
		(
			this_WS_24=RULE_WS
			{
				newLeafNode(this_WS_24, grammarAccess.getEntryAccess().getWSTerminalRuleCall_24());
			}
		)?
		(
			(
				lv_lineWeight_25_0=RULE_INT
				{
					newLeafNode(lv_lineWeight_25_0, grammarAccess.getEntryAccess().getLineWeightINTTerminalRuleCall_25_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntryRule());
					}
					setWithLastConsumed(
						$current,
						"lineWeight",
						lv_lineWeight_25_0,
						"org.eclipse.january.geometry.xtext.IGES.INT");
				}
			)
		)
		(
			this_WS_26=RULE_WS
			{
				newLeafNode(this_WS_26, grammarAccess.getEntryAccess().getWSTerminalRuleCall_26());
			}
		)?
		(
			(
				lv_color_27_0=RULE_INT
				{
					newLeafNode(lv_color_27_0, grammarAccess.getEntryAccess().getColorINTTerminalRuleCall_27_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntryRule());
					}
					setWithLastConsumed(
						$current,
						"color",
						lv_color_27_0,
						"org.eclipse.january.geometry.xtext.IGES.INT");
				}
			)
		)
		(
			this_WS_28=RULE_WS
			{
				newLeafNode(this_WS_28, grammarAccess.getEntryAccess().getWSTerminalRuleCall_28());
			}
		)?
		(
			(
				lv_paramLines_29_0=RULE_INT
				{
					newLeafNode(lv_paramLines_29_0, grammarAccess.getEntryAccess().getParamLinesINTTerminalRuleCall_29_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntryRule());
					}
					setWithLastConsumed(
						$current,
						"paramLines",
						lv_paramLines_29_0,
						"org.eclipse.january.geometry.xtext.IGES.INT");
				}
			)
		)
		(
			this_WS_30=RULE_WS
			{
				newLeafNode(this_WS_30, grammarAccess.getEntryAccess().getWSTerminalRuleCall_30());
			}
		)?
		(
			(
				lv_form_31_0=RULE_INT
				{
					newLeafNode(lv_form_31_0, grammarAccess.getEntryAccess().getFormINTTerminalRuleCall_31_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntryRule());
					}
					setWithLastConsumed(
						$current,
						"form",
						lv_form_31_0,
						"org.eclipse.january.geometry.xtext.IGES.INT");
				}
			)
		)
		(
			this_WS_32=RULE_WS
			{
				newLeafNode(this_WS_32, grammarAccess.getEntryAccess().getWSTerminalRuleCall_32());
			}
		)?
		(
			this_INT_33=RULE_INT
			{
				newLeafNode(this_INT_33, grammarAccess.getEntryAccess().getINTTerminalRuleCall_33_0());
			}
			(
				this_WS_34=RULE_WS
				{
					newLeafNode(this_WS_34, grammarAccess.getEntryAccess().getWSTerminalRuleCall_33_1());
				}
			)?
		)?
		(
			this_INT_35=RULE_INT
			{
				newLeafNode(this_INT_35, grammarAccess.getEntryAccess().getINTTerminalRuleCall_34_0());
			}
			(
				this_WS_36=RULE_WS
				{
					newLeafNode(this_WS_36, grammarAccess.getEntryAccess().getWSTerminalRuleCall_34_1());
				}
			)?
		)?
		(
			(
				(
					lv_entityLabel_37_0=RULE_STRING
					{
						newLeafNode(lv_entityLabel_37_0, grammarAccess.getEntryAccess().getEntityLabelSTRINGTerminalRuleCall_35_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEntryRule());
						}
						setWithLastConsumed(
							$current,
							"entityLabel",
							lv_entityLabel_37_0,
							"org.eclipse.january.geometry.xtext.IGES.STRING");
					}
				)
			)
			    |
			this_INT_38=RULE_INT
			{
				newLeafNode(this_INT_38, grammarAccess.getEntryAccess().getINTTerminalRuleCall_35_1());
			}
		)?
		(
			this_WS_39=RULE_WS
			{
				newLeafNode(this_WS_39, grammarAccess.getEntryAccess().getWSTerminalRuleCall_36());
			}
		)?
		(
			(
				lv_subNum_40_0=RULE_INT
				{
					newLeafNode(lv_subNum_40_0, grammarAccess.getEntryAccess().getSubNumINTTerminalRuleCall_37_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntryRule());
					}
					setWithLastConsumed(
						$current,
						"subNum",
						lv_subNum_40_0,
						"org.eclipse.january.geometry.xtext.IGES.INT");
				}
			)
		)?
		otherlv_41='D'
		{
			newLeafNode(otherlv_41, grammarAccess.getEntryAccess().getDKeyword_38());
		}
		(
			this_WS_42=RULE_WS
			{
				newLeafNode(this_WS_42, grammarAccess.getEntryAccess().getWSTerminalRuleCall_39());
			}
		)?
		this_INT_43=RULE_INT
		{
			newLeafNode(this_INT_43, grammarAccess.getEntryAccess().getINTTerminalRuleCall_40());
		}
		this_ENDLINE_44=RULE_ENDLINE
		{
			newLeafNode(this_ENDLINE_44, grammarAccess.getEntryAccess().getENDLINETerminalRuleCall_41());
		}
	)
;

// Entry rule entryRuleParameters
entryRuleParameters returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParametersRule()); }
	iv_ruleParameters=ruleParameters
	{ $current=$iv_ruleParameters.current; }
	EOF;

// Rule Parameters
ruleParameters returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getParametersAccess().getEntriesPMultiEntryParserRuleCall_0_0());
				}
				lv_entries_0_1=rulePMultiEntry
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParametersRule());
					}
					add(
						$current,
						"entries",
						lv_entries_0_1,
						"org.eclipse.january.geometry.xtext.IGES.PMultiEntry");
					afterParserOrEnumRuleCall();
				}
				    |
				{
					newCompositeNode(grammarAccess.getParametersAccess().getEntriesPEntryParserRuleCall_0_1());
				}
				lv_entries_0_2=rulePEntry
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParametersRule());
					}
					add(
						$current,
						"entries",
						lv_entries_0_2,
						"org.eclipse.january.geometry.xtext.IGES.PEntry");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)+
;

// Entry rule entryRulePEntry
entryRulePEntry returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPEntryRule()); }
	iv_rulePEntry=rulePEntry
	{ $current=$iv_rulePEntry.current; }
	EOF;

// Rule PEntry
rulePEntry returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_type_0_0=RULE_INT
				{
					newLeafNode(lv_type_0_0, grammarAccess.getPEntryAccess().getTypeINTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPEntryRule());
					}
					setWithLastConsumed(
						$current,
						"type",
						lv_type_0_0,
						"org.eclipse.january.geometry.xtext.IGES.INT");
				}
			)
		)
		(
			this_DELIMITER_1=RULE_DELIMITER
			{
				newLeafNode(this_DELIMITER_1, grammarAccess.getPEntryAccess().getDELIMITERTerminalRuleCall_1());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getPEntryAccess().getValuesValueParserRuleCall_2_0());
				}
				lv_values_2_0=ruleValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPEntryRule());
					}
					add(
						$current,
						"values",
						lv_values_2_0,
						"org.eclipse.january.geometry.xtext.IGES.Value");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		this_SEPARATOR_3=RULE_SEPARATOR
		{
			newLeafNode(this_SEPARATOR_3, grammarAccess.getPEntryAccess().getSEPARATORTerminalRuleCall_3());
		}
		(
			this_WS_4=RULE_WS
			{
				newLeafNode(this_WS_4, grammarAccess.getPEntryAccess().getWSTerminalRuleCall_4());
			}
		)?
		(
			(
				lv_dIndex_5_0=RULE_INT
				{
					newLeafNode(lv_dIndex_5_0, grammarAccess.getPEntryAccess().getDIndexINTTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPEntryRule());
					}
					setWithLastConsumed(
						$current,
						"dIndex",
						lv_dIndex_5_0,
						"org.eclipse.january.geometry.xtext.IGES.INT");
				}
			)
		)
		otherlv_6='P'
		{
			newLeafNode(otherlv_6, grammarAccess.getPEntryAccess().getPKeyword_6());
		}
		(
			this_WS_7=RULE_WS
			{
				newLeafNode(this_WS_7, grammarAccess.getPEntryAccess().getWSTerminalRuleCall_7());
			}
		)?
		(
			(
				lv_indicies_8_0=RULE_INT
				{
					newLeafNode(lv_indicies_8_0, grammarAccess.getPEntryAccess().getIndiciesINTTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPEntryRule());
					}
					addWithLastConsumed(
						$current,
						"indicies",
						lv_indicies_8_0,
						"org.eclipse.january.geometry.xtext.IGES.INT");
				}
			)
		)
		this_ENDLINE_9=RULE_ENDLINE
		{
			newLeafNode(this_ENDLINE_9, grammarAccess.getPEntryAccess().getENDLINETerminalRuleCall_9());
		}
	)
;

// Entry rule entryRulePMultiEntry
entryRulePMultiEntry returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPMultiEntryRule()); }
	iv_rulePMultiEntry=rulePMultiEntry
	{ $current=$iv_rulePMultiEntry.current; }
	EOF;

// Rule PMultiEntry
rulePMultiEntry returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_type_0_0=RULE_INT
				{
					newLeafNode(lv_type_0_0, grammarAccess.getPMultiEntryAccess().getTypeINTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPMultiEntryRule());
					}
					setWithLastConsumed(
						$current,
						"type",
						lv_type_0_0,
						"org.eclipse.january.geometry.xtext.IGES.INT");
				}
			)
		)
		(
			this_DELIMITER_1=RULE_DELIMITER
			{
				newLeafNode(this_DELIMITER_1, grammarAccess.getPMultiEntryAccess().getDELIMITERTerminalRuleCall_1());
			}
		)?
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getPMultiEntryAccess().getValuesValueParserRuleCall_2_0_0());
					}
					lv_values_2_0=ruleValue
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPMultiEntryRule());
						}
						add(
							$current,
							"values",
							lv_values_2_0,
							"org.eclipse.january.geometry.xtext.IGES.Value");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			(
				this_WS_3=RULE_WS
				{
					newLeafNode(this_WS_3, grammarAccess.getPMultiEntryAccess().getWSTerminalRuleCall_2_1());
				}
			)?
			(
				(
					lv_dIndex_4_0=RULE_INT
					{
						newLeafNode(lv_dIndex_4_0, grammarAccess.getPMultiEntryAccess().getDIndexINTTerminalRuleCall_2_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPMultiEntryRule());
						}
						setWithLastConsumed(
							$current,
							"dIndex",
							lv_dIndex_4_0,
							"org.eclipse.january.geometry.xtext.IGES.INT");
					}
				)
			)
			otherlv_5='P'
			{
				newLeafNode(otherlv_5, grammarAccess.getPMultiEntryAccess().getPKeyword_2_3());
			}
			(
				this_WS_6=RULE_WS
				{
					newLeafNode(this_WS_6, grammarAccess.getPMultiEntryAccess().getWSTerminalRuleCall_2_4());
				}
			)?
			(
				(
					lv_indicies_7_0=RULE_INT
					{
						newLeafNode(lv_indicies_7_0, grammarAccess.getPMultiEntryAccess().getIndiciesINTTerminalRuleCall_2_5_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPMultiEntryRule());
						}
						addWithLastConsumed(
							$current,
							"indicies",
							lv_indicies_7_0,
							"org.eclipse.january.geometry.xtext.IGES.INT");
					}
				)
			)
			this_ENDLINE_8=RULE_ENDLINE
			{
				newLeafNode(this_ENDLINE_8, grammarAccess.getPMultiEntryAccess().getENDLINETerminalRuleCall_2_6());
			}
		)+
		(
			(
				{
					newCompositeNode(grammarAccess.getPMultiEntryAccess().getValuesValueParserRuleCall_3_0());
				}
				lv_values_9_0=ruleValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPMultiEntryRule());
					}
					add(
						$current,
						"values",
						lv_values_9_0,
						"org.eclipse.january.geometry.xtext.IGES.Value");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		this_SEPARATOR_10=RULE_SEPARATOR
		{
			newLeafNode(this_SEPARATOR_10, grammarAccess.getPMultiEntryAccess().getSEPARATORTerminalRuleCall_4());
		}
		(
			this_WS_11=RULE_WS
			{
				newLeafNode(this_WS_11, grammarAccess.getPMultiEntryAccess().getWSTerminalRuleCall_5());
			}
		)?
		this_INT_12=RULE_INT
		{
			newLeafNode(this_INT_12, grammarAccess.getPMultiEntryAccess().getINTTerminalRuleCall_6());
		}
		otherlv_13='P'
		{
			newLeafNode(otherlv_13, grammarAccess.getPMultiEntryAccess().getPKeyword_7());
		}
		(
			this_WS_14=RULE_WS
			{
				newLeafNode(this_WS_14, grammarAccess.getPMultiEntryAccess().getWSTerminalRuleCall_8());
			}
		)?
		this_INT_15=RULE_INT
		{
			newLeafNode(this_INT_15, grammarAccess.getPMultiEntryAccess().getINTTerminalRuleCall_9());
		}
		this_ENDLINE_16=RULE_ENDLINE
		{
			newLeafNode(this_ENDLINE_16, grammarAccess.getPMultiEntryAccess().getENDLINETerminalRuleCall_10());
		}
	)
;

// Entry rule entryRuleValue
entryRuleValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getValueRule()); }
	iv_ruleValue=ruleValue
	{ $current=$iv_ruleValue.current; }
	EOF;

// Rule Value
ruleValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getValueAccess().getParamParserRuleCall_0());
		}
		this_Param_0=ruleParam
		{
			$current = $this_Param_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getValueAccess().getPointerParserRuleCall_1());
		}
		this_Pointer_1=rulePointer
		{
			$current = $this_Pointer_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getValueAccess().getHStringParserRuleCall_2());
		}
		this_HString_2=ruleHString
		{
			$current = $this_HString_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleHString
entryRuleHString returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHStringRule()); }
	iv_ruleHString=ruleHString
	{ $current=$iv_ruleHString.current; }
	EOF;

// Rule HString
ruleHString returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_val_0_0=RULE_HOLLERITH
				{
					newLeafNode(lv_val_0_0, grammarAccess.getHStringAccess().getValHOLLERITHTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getHStringRule());
					}
					setWithLastConsumed(
						$current,
						"val",
						lv_val_0_0,
						"org.eclipse.january.geometry.xtext.IGES.HOLLERITH");
				}
			)
		)
		(
			this_DELIMITER_1=RULE_DELIMITER
			{
				newLeafNode(this_DELIMITER_1, grammarAccess.getHStringAccess().getDELIMITERTerminalRuleCall_1());
			}
		)?
	)
;

// Entry rule entryRuleParam
entryRuleParam returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParamRule()); }
	iv_ruleParam=ruleParam
	{ $current=$iv_ruleParam.current; }
	EOF;

// Rule Param
ruleParam returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_val_0_0=RULE_DOUBLE
				{
					newLeafNode(lv_val_0_0, grammarAccess.getParamAccess().getValDOUBLETerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParamRule());
					}
					setWithLastConsumed(
						$current,
						"val",
						lv_val_0_0,
						"org.eclipse.january.geometry.xtext.IGES.DOUBLE");
				}
			)
		)
		(
			this_DELIMITER_1=RULE_DELIMITER
			{
				newLeafNode(this_DELIMITER_1, grammarAccess.getParamAccess().getDELIMITERTerminalRuleCall_1());
			}
		)?
	)
;

// Entry rule entryRulePointer
entryRulePointer returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPointerRule()); }
	iv_rulePointer=rulePointer
	{ $current=$iv_rulePointer.current; }
	EOF;

// Rule Pointer
rulePointer returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_val_0_0=RULE_INT
				{
					newLeafNode(lv_val_0_0, grammarAccess.getPointerAccess().getValINTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPointerRule());
					}
					setWithLastConsumed(
						$current,
						"val",
						lv_val_0_0,
						"org.eclipse.january.geometry.xtext.IGES.INT");
				}
			)
		)
		(
			this_DELIMITER_1=RULE_DELIMITER
			{
				newLeafNode(this_DELIMITER_1, grammarAccess.getPointerAccess().getDELIMITERTerminalRuleCall_1());
			}
		)?
	)
;

// Entry rule entryRuleEnd
entryRuleEnd returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEndRule()); }
	iv_ruleEnd=ruleEnd
	{ $current=$iv_ruleEnd.current; }
	EOF;

// Rule End
ruleEnd returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='S'
		{
			newLeafNode(otherlv_0, grammarAccess.getEndAccess().getSKeyword_0());
		}
		(
			this_WS_1=RULE_WS
			{
				newLeafNode(this_WS_1, grammarAccess.getEndAccess().getWSTerminalRuleCall_1());
			}
		)?
		(
			(
				lv_sval_2_0=RULE_INT
				{
					newLeafNode(lv_sval_2_0, grammarAccess.getEndAccess().getSvalINTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEndRule());
					}
					setWithLastConsumed(
						$current,
						"sval",
						lv_sval_2_0,
						"org.eclipse.january.geometry.xtext.IGES.INT");
				}
			)
		)
		otherlv_3='G'
		{
			newLeafNode(otherlv_3, grammarAccess.getEndAccess().getGKeyword_3());
		}
		(
			this_WS_4=RULE_WS
			{
				newLeafNode(this_WS_4, grammarAccess.getEndAccess().getWSTerminalRuleCall_4());
			}
		)?
		(
			(
				lv_gval_5_0=RULE_INT
				{
					newLeafNode(lv_gval_5_0, grammarAccess.getEndAccess().getGvalINTTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEndRule());
					}
					setWithLastConsumed(
						$current,
						"gval",
						lv_gval_5_0,
						"org.eclipse.january.geometry.xtext.IGES.INT");
				}
			)
		)
		otherlv_6='D'
		{
			newLeafNode(otherlv_6, grammarAccess.getEndAccess().getDKeyword_6());
		}
		(
			this_WS_7=RULE_WS
			{
				newLeafNode(this_WS_7, grammarAccess.getEndAccess().getWSTerminalRuleCall_7());
			}
		)?
		(
			(
				lv_dval_8_0=RULE_INT
				{
					newLeafNode(lv_dval_8_0, grammarAccess.getEndAccess().getDvalINTTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEndRule());
					}
					setWithLastConsumed(
						$current,
						"dval",
						lv_dval_8_0,
						"org.eclipse.january.geometry.xtext.IGES.INT");
				}
			)
		)
		otherlv_9='P'
		{
			newLeafNode(otherlv_9, grammarAccess.getEndAccess().getPKeyword_9());
		}
		(
			this_WS_10=RULE_WS
			{
				newLeafNode(this_WS_10, grammarAccess.getEndAccess().getWSTerminalRuleCall_10());
			}
		)?
		(
			(
				lv_pval_11_0=RULE_INT
				{
					newLeafNode(lv_pval_11_0, grammarAccess.getEndAccess().getPvalINTTerminalRuleCall_11_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEndRule());
					}
					setWithLastConsumed(
						$current,
						"pval",
						lv_pval_11_0,
						"org.eclipse.january.geometry.xtext.IGES.INT");
				}
			)
		)
		this_WS_12=RULE_WS
		{
			newLeafNode(this_WS_12, grammarAccess.getEndAccess().getWSTerminalRuleCall_12());
		}
		otherlv_13='T'
		{
			newLeafNode(otherlv_13, grammarAccess.getEndAccess().getTKeyword_13());
		}
		(
			this_WS_14=RULE_WS
			{
				newLeafNode(this_WS_14, grammarAccess.getEndAccess().getWSTerminalRuleCall_14());
			}
		)?
		(
			(
				lv_tval_15_0=RULE_INT
				{
					newLeafNode(lv_tval_15_0, grammarAccess.getEndAccess().getTvalINTTerminalRuleCall_15_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEndRule());
					}
					setWithLastConsumed(
						$current,
						"tval",
						lv_tval_15_0,
						"org.eclipse.january.geometry.xtext.IGES.INT");
				}
			)
		)
	)
;

// Entry rule entryRulestartLine
entryRulestartLine returns [String current=null]:
	{ newCompositeNode(grammarAccess.getStartLineRule()); }
	iv_rulestartLine=rulestartLine
	{ $current=$iv_rulestartLine.current.getText(); }
	EOF;

// Rule startLine
rulestartLine returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			this_STRING_0=RULE_STRING
			{
				$current.merge(this_STRING_0);
			}
			{
				newLeafNode(this_STRING_0, grammarAccess.getStartLineAccess().getSTRINGTerminalRuleCall_0_0());
			}
			    |
			this_WS_1=RULE_WS
			{
				$current.merge(this_WS_1);
			}
			{
				newLeafNode(this_WS_1, grammarAccess.getStartLineAccess().getWSTerminalRuleCall_0_1());
			}
		)*
		kw='S'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getStartLineAccess().getSKeyword_1());
		}
		(
			this_WS_3=RULE_WS
			{
				$current.merge(this_WS_3);
			}
			{
				newLeafNode(this_WS_3, grammarAccess.getStartLineAccess().getWSTerminalRuleCall_2());
			}
		)?
		this_INT_4=RULE_INT
		{
			$current.merge(this_INT_4);
		}
		{
			newLeafNode(this_INT_4, grammarAccess.getStartLineAccess().getINTTerminalRuleCall_3());
		}
		this_ENDLINE_5=RULE_ENDLINE
		{
			$current.merge(this_ENDLINE_5);
		}
		{
			newLeafNode(this_ENDLINE_5, grammarAccess.getStartLineAccess().getENDLINETerminalRuleCall_4());
		}
	)
;

RULE_INT : ('0'..'9')+;

RULE_DOUBLE : ('+'|'-')? RULE_INT '.' RULE_INT? (('e'|'E') ('+'|'-')? RULE_INT)?;

RULE_HOLLERITH : RULE_INT 'H' .;

RULE_STRING : ('A..Z'|'a'..'z'|'0'..'9'|'"')+;

RULE_WS : (' '|'\t'|'\r')+;

RULE_ENDLINE : '\r'? '\n';

RULE_DELIMITER : .;

RULE_SEPARATOR : .;
