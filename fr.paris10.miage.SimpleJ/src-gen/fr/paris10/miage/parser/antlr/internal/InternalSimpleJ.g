/*
 * generated by Xtext 2.10.0
 */
grammar InternalSimpleJ;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package fr.paris10.miage.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package fr.paris10.miage.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.paris10.miage.services.SimpleJGrammarAccess;

}

@parser::members {

 	private SimpleJGrammarAccess grammarAccess;

    public InternalSimpleJParser(TokenStream input, SimpleJGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected SimpleJGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getModelAccess().getClassesClasseParserRuleCall_0_0());
				}
				lv_classes_0_0=ruleClasse
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"classes",
						lv_classes_0_0,
						"fr.paris10.miage.SimpleJ.Classe");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getProgramProgramParserRuleCall_1_0());
				}
				lv_program_1_0=ruleProgram
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"program",
						lv_program_1_0,
						"fr.paris10.miage.SimpleJ.Program");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleClasse
entryRuleClasse returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClasseRule()); }
	iv_ruleClasse=ruleClasse
	{ $current=$iv_ruleClasse.current; }
	EOF;

// Rule Classe
ruleClasse returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='class'
		{
			newLeafNode(otherlv_0, grammarAccess.getClasseAccess().getClassKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getClasseAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getClasseRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getClasseAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getClasseAccess().getAttributsAttributParserRuleCall_3_0_0());
					}
					lv_attributs_3_0=ruleAttribut
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getClasseRule());
						}
						add(
							$current,
							"attributs",
							lv_attributs_3_0,
							"fr.paris10.miage.SimpleJ.Attribut");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getClasseAccess().getCommaKeyword_3_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getClasseAccess().getAttributsAttributParserRuleCall_3_1_1_0());
						}
						lv_attributs_5_0=ruleAttribut
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getClasseRule());
							}
							add(
								$current,
								"attributs",
								lv_attributs_5_0,
								"fr.paris10.miage.SimpleJ.Attribut");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getClasseAccess().getRightParenthesisKeyword_4());
		}
		(
			otherlv_7=':'
			{
				newLeafNode(otherlv_7, grammarAccess.getClasseAccess().getColonKeyword_5_0());
			}
			(
				(
					lv_herite_8_0=RULE_ID
					{
						newLeafNode(lv_herite_8_0, grammarAccess.getClasseAccess().getHeriteIDTerminalRuleCall_5_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getClasseRule());
						}
						setWithLastConsumed(
							$current,
							"herite",
							lv_herite_8_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleAttribut
entryRuleAttribut returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributRule()); }
	iv_ruleAttribut=ruleAttribut
	{ $current=$iv_ruleAttribut.current; }
	EOF;

// Rule Attribut
ruleAttribut returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getAttributAccess().getAccesAccesEnumRuleCall_0_0());
				}
				lv_acces_0_0=ruleAcces
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributRule());
					}
					set(
						$current,
						"acces",
						lv_acces_0_0,
						"fr.paris10.miage.SimpleJ.Acces");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getAttributAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getAttributAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributAccess().getTypeTypeParserRuleCall_3_0());
				}
				lv_type_3_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributRule());
					}
					set(
						$current,
						"type",
						lv_type_3_0,
						"fr.paris10.miage.SimpleJ.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleType
entryRuleType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	iv_ruleType=ruleType
	{ $current=$iv_ruleType.current; }
	EOF;

// Rule Type
ruleType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getTypeRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleProgram
entryRuleProgram returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProgramRule()); }
	iv_ruleProgram=ruleProgram
	{ $current=$iv_ruleProgram.current; }
	EOF;

// Rule Program
ruleProgram returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='program'
		{
			newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getProgramKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProgramRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Rule Acces
ruleAcces returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='var'
			{
				$current = grammarAccess.getAccesAccess().getAccessVarEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getAccesAccess().getAccessVarEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='const'
			{
				$current = grammarAccess.getAccesAccess().getAccessConstEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getAccesAccess().getAccessConstEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='hidden'
			{
				$current = grammarAccess.getAccesAccess().getAccessHiddenEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getAccesAccess().getAccessHiddenEnumLiteralDeclaration_2());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
