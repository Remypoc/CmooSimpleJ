/*
 * generated by Xtext 2.10.0
 */
package fr.paris10.miage.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class SimpleJGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.paris10.miage.SimpleJ.Model");
		private final Assignment cClassesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cClassesClasseParserRuleCall_0 = (RuleCall)cClassesAssignment.eContents().get(0);
		
		//Model:
		//	classes+=Classe*;
		@Override public ParserRule getRule() { return rule; }
		
		//classes+=Classe*
		public Assignment getClassesAssignment() { return cClassesAssignment; }
		
		//Classe
		public RuleCall getClassesClasseParserRuleCall_0() { return cClassesClasseParserRuleCall_0; }
	}
	public class ClasseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.paris10.miage.SimpleJ.Classe");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cClassKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cAttributsAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cAttributsAttributParserRuleCall_3_0_0 = (RuleCall)cAttributsAssignment_3_0.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cCommaKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cAttributsAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cAttributsAttributParserRuleCall_3_1_1_0 = (RuleCall)cAttributsAssignment_3_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Classe:
		//	"class" name=ID "(" (attributs+=Attribut (',' attributs+=Attribut)*)? ")";
		@Override public ParserRule getRule() { return rule; }
		
		//"class" name=ID "(" (attributs+=Attribut (',' attributs+=Attribut)*)? ")"
		public Group getGroup() { return cGroup; }
		
		//"class"
		public Keyword getClassKeyword_0() { return cClassKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//(attributs+=Attribut (',' attributs+=Attribut)*)?
		public Group getGroup_3() { return cGroup_3; }
		
		//attributs+=Attribut
		public Assignment getAttributsAssignment_3_0() { return cAttributsAssignment_3_0; }
		
		//Attribut
		public RuleCall getAttributsAttributParserRuleCall_3_0_0() { return cAttributsAttributParserRuleCall_3_0_0; }
		
		//(',' attributs+=Attribut)*
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//','
		public Keyword getCommaKeyword_3_1_0() { return cCommaKeyword_3_1_0; }
		
		//attributs+=Attribut
		public Assignment getAttributsAssignment_3_1_1() { return cAttributsAssignment_3_1_1; }
		
		//Attribut
		public RuleCall getAttributsAttributParserRuleCall_3_1_1_0() { return cAttributsAttributParserRuleCall_3_1_1_0; }
		
		//")"
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}
	public class AttributElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.paris10.miage.SimpleJ.Attribut");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAccesAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAccesAccesEnumRuleCall_0_0 = (RuleCall)cAccesAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTypeTypeParserRuleCall_3_0 = (RuleCall)cTypeAssignment_3.eContents().get(0);
		
		//Attribut:
		//	acces=Acces name=ID ":" type=Type;
		@Override public ParserRule getRule() { return rule; }
		
		//acces=Acces name=ID ":" type=Type
		public Group getGroup() { return cGroup; }
		
		//acces=Acces
		public Assignment getAccesAssignment_0() { return cAccesAssignment_0; }
		
		//Acces
		public RuleCall getAccesAccesEnumRuleCall_0_0() { return cAccesAccesEnumRuleCall_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//type=Type
		public Assignment getTypeAssignment_3() { return cTypeAssignment_3; }
		
		//Type
		public RuleCall getTypeTypeParserRuleCall_3_0() { return cTypeTypeParserRuleCall_3_0; }
	}
	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.paris10.miage.SimpleJ.Type");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Type:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	
	public class AccesElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "fr.paris10.miage.SimpleJ.Acces");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cAccessVarEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cAccessVarVarKeyword_0_0 = (Keyword)cAccessVarEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cAccessConstEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cAccessConstConstKeyword_1_0 = (Keyword)cAccessConstEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cAccessHiddenEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cAccessHiddenHiddenKeyword_2_0 = (Keyword)cAccessHiddenEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum Acces:
		//	accessVar="var" | accessConst="const" | accessHidden="hidden";
		public EnumRule getRule() { return rule; }
		
		//accessVar="var" | accessConst="const" | accessHidden="hidden"
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//accessVar="var"
		public EnumLiteralDeclaration getAccessVarEnumLiteralDeclaration_0() { return cAccessVarEnumLiteralDeclaration_0; }
		
		//"var"
		public Keyword getAccessVarVarKeyword_0_0() { return cAccessVarVarKeyword_0_0; }
		
		//accessConst="const"
		public EnumLiteralDeclaration getAccessConstEnumLiteralDeclaration_1() { return cAccessConstEnumLiteralDeclaration_1; }
		
		//"const"
		public Keyword getAccessConstConstKeyword_1_0() { return cAccessConstConstKeyword_1_0; }
		
		//accessHidden="hidden"
		public EnumLiteralDeclaration getAccessHiddenEnumLiteralDeclaration_2() { return cAccessHiddenEnumLiteralDeclaration_2; }
		
		//"hidden"
		public Keyword getAccessHiddenHiddenKeyword_2_0() { return cAccessHiddenHiddenKeyword_2_0; }
	}
	
	private final ModelElements pModel;
	private final ClasseElements pClasse;
	private final AttributElements pAttribut;
	private final AccesElements eAcces;
	private final TypeElements pType;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SimpleJGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pClasse = new ClasseElements();
		this.pAttribut = new AttributElements();
		this.eAcces = new AccesElements();
		this.pType = new TypeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.paris10.miage.SimpleJ".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	classes+=Classe*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Classe:
	//	"class" name=ID "(" (attributs+=Attribut (',' attributs+=Attribut)*)? ")";
	public ClasseElements getClasseAccess() {
		return pClasse;
	}
	
	public ParserRule getClasseRule() {
		return getClasseAccess().getRule();
	}
	
	//Attribut:
	//	acces=Acces name=ID ":" type=Type;
	public AttributElements getAttributAccess() {
		return pAttribut;
	}
	
	public ParserRule getAttributRule() {
		return getAttributAccess().getRule();
	}
	
	//enum Acces:
	//	accessVar="var" | accessConst="const" | accessHidden="hidden";
	public AccesElements getAccesAccess() {
		return eAcces;
	}
	
	public EnumRule getAccesRule() {
		return getAccesAccess().getRule();
	}
	
	//Type:
	//	name=ID;
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
