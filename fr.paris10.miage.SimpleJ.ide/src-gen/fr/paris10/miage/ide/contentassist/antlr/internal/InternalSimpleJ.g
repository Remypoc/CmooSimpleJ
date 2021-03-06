/*
 * generated by Xtext 2.10.0
 */
grammar InternalSimpleJ;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package fr.paris10.miage.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package fr.paris10.miage.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.paris10.miage.services.SimpleJGrammarAccess;

}
@parser::members {
	private SimpleJGrammarAccess grammarAccess;

	public void setGrammarAccess(SimpleJGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getGroup()); }
		(rule__Model__Group__0)
		{ after(grammarAccess.getModelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleClasse
entryRuleClasse
:
{ before(grammarAccess.getClasseRule()); }
	 ruleClasse
{ after(grammarAccess.getClasseRule()); } 
	 EOF 
;

// Rule Classe
ruleClasse 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getClasseAccess().getGroup()); }
		(rule__Classe__Group__0)
		{ after(grammarAccess.getClasseAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAttribut
entryRuleAttribut
:
{ before(grammarAccess.getAttributRule()); }
	 ruleAttribut
{ after(grammarAccess.getAttributRule()); } 
	 EOF 
;

// Rule Attribut
ruleAttribut 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAttributAccess().getGroup()); }
		(rule__Attribut__Group__0)
		{ after(grammarAccess.getAttributAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleType
entryRuleType
:
{ before(grammarAccess.getTypeRule()); }
	 ruleType
{ after(grammarAccess.getTypeRule()); } 
	 EOF 
;

// Rule Type
ruleType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeAccess().getNameAssignment()); }
		(rule__Type__NameAssignment)
		{ after(grammarAccess.getTypeAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleProgram
entryRuleProgram
:
{ before(grammarAccess.getProgramRule()); }
	 ruleProgram
{ after(grammarAccess.getProgramRule()); } 
	 EOF 
;

// Rule Program
ruleProgram 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getProgramAccess().getGroup()); }
		(rule__Program__Group__0)
		{ after(grammarAccess.getProgramAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMethode
entryRuleMethode
:
{ before(grammarAccess.getMethodeRule()); }
	 ruleMethode
{ after(grammarAccess.getMethodeRule()); } 
	 EOF 
;

// Rule Methode
ruleMethode 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMethodeAccess().getGroup()); }
		(rule__Methode__Group__0)
		{ after(grammarAccess.getMethodeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDelegation
entryRuleDelegation
:
{ before(grammarAccess.getDelegationRule()); }
	 ruleDelegation
{ after(grammarAccess.getDelegationRule()); } 
	 EOF 
;

// Rule Delegation
ruleDelegation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDelegationAccess().getNameAssignment()); }
		(rule__Delegation__NameAssignment)
		{ after(grammarAccess.getDelegationAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule Acces
ruleAcces
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAccesAccess().getAlternatives()); }
		(rule__Acces__Alternatives)
		{ after(grammarAccess.getAccesAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Acces__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAccesAccess().getAccessVarEnumLiteralDeclaration_0()); }
		('var')
		{ after(grammarAccess.getAccesAccess().getAccessVarEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getAccesAccess().getAccessConstEnumLiteralDeclaration_1()); }
		('const')
		{ after(grammarAccess.getAccesAccess().getAccessConstEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getAccesAccess().getAccessHiddenEnumLiteralDeclaration_2()); }
		('hidden')
		{ after(grammarAccess.getAccesAccess().getAccessHiddenEnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__0__Impl
	rule__Model__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getClassesAssignment_0()); }
	(rule__Model__ClassesAssignment_0)*
	{ after(grammarAccess.getModelAccess().getClassesAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getProgramAssignment_1()); }
	(rule__Model__ProgramAssignment_1)?
	{ after(grammarAccess.getModelAccess().getProgramAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Classe__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Classe__Group__0__Impl
	rule__Classe__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClasseAccess().getClassKeyword_0()); }
	'class'
	{ after(grammarAccess.getClasseAccess().getClassKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Classe__Group__1__Impl
	rule__Classe__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClasseAccess().getNameAssignment_1()); }
	(rule__Classe__NameAssignment_1)
	{ after(grammarAccess.getClasseAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Classe__Group__2__Impl
	rule__Classe__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClasseAccess().getGroup_2()); }
	(rule__Classe__Group_2__0)
	{ after(grammarAccess.getClasseAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Classe__Group__3__Impl
	rule__Classe__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClasseAccess().getRightParenthesisKeyword_3()); }
	(')')?
	{ after(grammarAccess.getClasseAccess().getRightParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Classe__Group__4__Impl
	rule__Classe__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClasseAccess().getGroup_4()); }
	(rule__Classe__Group_4__0)?
	{ after(grammarAccess.getClasseAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Classe__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClasseAccess().getGroup_5()); }
	(rule__Classe__Group_5__0)?
	{ after(grammarAccess.getClasseAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Classe__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Classe__Group_2__0__Impl
	rule__Classe__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClasseAccess().getLeftParenthesisKeyword_2_0()); }
	'('
	{ after(grammarAccess.getClasseAccess().getLeftParenthesisKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Classe__Group_2__1__Impl
	rule__Classe__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClasseAccess().getAttributsAssignment_2_1()); }
	(rule__Classe__AttributsAssignment_2_1)
	{ after(grammarAccess.getClasseAccess().getAttributsAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Classe__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClasseAccess().getGroup_2_2()); }
	(rule__Classe__Group_2_2__0)*
	{ after(grammarAccess.getClasseAccess().getGroup_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Classe__Group_2_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Classe__Group_2_2__0__Impl
	rule__Classe__Group_2_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group_2_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClasseAccess().getCommaKeyword_2_2_0()); }
	','
	{ after(grammarAccess.getClasseAccess().getCommaKeyword_2_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group_2_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Classe__Group_2_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group_2_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClasseAccess().getAttributsAssignment_2_2_1()); }
	(rule__Classe__AttributsAssignment_2_2_1)
	{ after(grammarAccess.getClasseAccess().getAttributsAssignment_2_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Classe__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Classe__Group_4__0__Impl
	rule__Classe__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClasseAccess().getColonKeyword_4_0()); }
	':'
	{ after(grammarAccess.getClasseAccess().getColonKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Classe__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClasseAccess().getParentAssignment_4_1()); }
	(rule__Classe__ParentAssignment_4_1)
	{ after(grammarAccess.getClasseAccess().getParentAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Classe__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Classe__Group_5__0__Impl
	rule__Classe__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClasseAccess().getMethodesAssignment_5_0()); }
	(rule__Classe__MethodesAssignment_5_0)
	{ after(grammarAccess.getClasseAccess().getMethodesAssignment_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Classe__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClasseAccess().getMethodesAssignment_5_1()); }
	(rule__Classe__MethodesAssignment_5_1)*
	{ after(grammarAccess.getClasseAccess().getMethodesAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Attribut__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribut__Group__0__Impl
	rule__Attribut__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribut__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributAccess().getAccesAssignment_0()); }
	(rule__Attribut__AccesAssignment_0)?
	{ after(grammarAccess.getAttributAccess().getAccesAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribut__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribut__Group__1__Impl
	rule__Attribut__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribut__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributAccess().getDelegueAssignment_1()); }
	(rule__Attribut__DelegueAssignment_1)?
	{ after(grammarAccess.getAttributAccess().getDelegueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribut__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribut__Group__2__Impl
	rule__Attribut__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribut__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributAccess().getNameAssignment_2()); }
	(rule__Attribut__NameAssignment_2)
	{ after(grammarAccess.getAttributAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribut__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribut__Group__3__Impl
	rule__Attribut__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribut__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributAccess().getColonKeyword_3()); }
	':'
	{ after(grammarAccess.getAttributAccess().getColonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribut__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribut__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribut__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributAccess().getTypeAssignment_4()); }
	(rule__Attribut__TypeAssignment_4)
	{ after(grammarAccess.getAttributAccess().getTypeAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Program__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Program__Group__0__Impl
	rule__Program__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProgramAccess().getProgramKeyword_0()); }
	'program'
	{ after(grammarAccess.getProgramAccess().getProgramKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Program__Group__1__Impl
	rule__Program__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProgramAccess().getNameAssignment_1()); }
	(rule__Program__NameAssignment_1)
	{ after(grammarAccess.getProgramAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Program__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProgramAccess().getContenuAssignment_2()); }
	(rule__Program__ContenuAssignment_2)
	{ after(grammarAccess.getProgramAccess().getContenuAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Methode__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Methode__Group__0__Impl
	rule__Methode__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodeAccess().getDefKeyword_0()); }
	'def'
	{ after(grammarAccess.getMethodeAccess().getDefKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Methode__Group__1__Impl
	rule__Methode__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodeAccess().getNameAssignment_1()); }
	(rule__Methode__NameAssignment_1)
	{ after(grammarAccess.getMethodeAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Methode__Group__2__Impl
	rule__Methode__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodeAccess().getGroup_2()); }
	(rule__Methode__Group_2__0)?
	{ after(grammarAccess.getMethodeAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Methode__Group__3__Impl
	rule__Methode__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodeAccess().getGroup_3()); }
	(rule__Methode__Group_3__0)?
	{ after(grammarAccess.getMethodeAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Methode__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodeAccess().getContenuAssignment_4()); }
	(rule__Methode__ContenuAssignment_4)
	{ after(grammarAccess.getMethodeAccess().getContenuAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Methode__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Methode__Group_2__0__Impl
	rule__Methode__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodeAccess().getColonKeyword_2_0()); }
	':'
	{ after(grammarAccess.getMethodeAccess().getColonKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Methode__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodeAccess().getTypeAssignment_2_1()); }
	(rule__Methode__TypeAssignment_2_1)
	{ after(grammarAccess.getMethodeAccess().getTypeAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Methode__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Methode__Group_3__0__Impl
	rule__Methode__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodeAccess().getLeftParenthesisKeyword_3_0()); }
	'('
	{ after(grammarAccess.getMethodeAccess().getLeftParenthesisKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Methode__Group_3__1__Impl
	rule__Methode__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodeAccess().getAttributsAssignment_3_1()); }
	(rule__Methode__AttributsAssignment_3_1)
	{ after(grammarAccess.getMethodeAccess().getAttributsAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Methode__Group_3__2__Impl
	rule__Methode__Group_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodeAccess().getGroup_3_2()); }
	(rule__Methode__Group_3_2__0)*
	{ after(grammarAccess.getMethodeAccess().getGroup_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Methode__Group_3__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodeAccess().getRightParenthesisKeyword_3_3()); }
	')'
	{ after(grammarAccess.getMethodeAccess().getRightParenthesisKeyword_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Methode__Group_3_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Methode__Group_3_2__0__Impl
	rule__Methode__Group_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group_3_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodeAccess().getCommaKeyword_3_2_0()); }
	','
	{ after(grammarAccess.getMethodeAccess().getCommaKeyword_3_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group_3_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Methode__Group_3_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group_3_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodeAccess().getAttributsAssignment_3_2_1()); }
	(rule__Methode__AttributsAssignment_3_2_1)
	{ after(grammarAccess.getMethodeAccess().getAttributsAssignment_3_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__ClassesAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getClassesClasseParserRuleCall_0_0()); }
		ruleClasse
		{ after(grammarAccess.getModelAccess().getClassesClasseParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__ProgramAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getProgramProgramParserRuleCall_1_0()); }
		ruleProgram
		{ after(grammarAccess.getModelAccess().getProgramProgramParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClasseAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getClasseAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__AttributsAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClasseAccess().getAttributsAttributParserRuleCall_2_1_0()); }
		ruleAttribut
		{ after(grammarAccess.getClasseAccess().getAttributsAttributParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__AttributsAssignment_2_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClasseAccess().getAttributsAttributParserRuleCall_2_2_1_0()); }
		ruleAttribut
		{ after(grammarAccess.getClasseAccess().getAttributsAttributParserRuleCall_2_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__ParentAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClasseAccess().getParentClasseCrossReference_4_1_0()); }
		(
			{ before(grammarAccess.getClasseAccess().getParentClasseIDTerminalRuleCall_4_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getClasseAccess().getParentClasseIDTerminalRuleCall_4_1_0_1()); }
		)
		{ after(grammarAccess.getClasseAccess().getParentClasseCrossReference_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__MethodesAssignment_5_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClasseAccess().getMethodesMethodeParserRuleCall_5_0_0()); }
		ruleMethode
		{ after(grammarAccess.getClasseAccess().getMethodesMethodeParserRuleCall_5_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__MethodesAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClasseAccess().getMethodesMethodeParserRuleCall_5_1_0()); }
		ruleMethode
		{ after(grammarAccess.getClasseAccess().getMethodesMethodeParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribut__AccesAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributAccess().getAccesAccesEnumRuleCall_0_0()); }
		ruleAcces
		{ after(grammarAccess.getAttributAccess().getAccesAccesEnumRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribut__DelegueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributAccess().getDelegueDelegationParserRuleCall_1_0()); }
		ruleDelegation
		{ after(grammarAccess.getAttributAccess().getDelegueDelegationParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribut__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getAttributAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribut__TypeAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributAccess().getTypeTypeParserRuleCall_4_0()); }
		ruleType
		{ after(grammarAccess.getAttributAccess().getTypeTypeParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__ContenuAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProgramAccess().getContenuSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getProgramAccess().getContenuSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMethodeAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getMethodeAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__TypeAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMethodeAccess().getTypeTypeParserRuleCall_2_1_0()); }
		ruleType
		{ after(grammarAccess.getMethodeAccess().getTypeTypeParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__AttributsAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMethodeAccess().getAttributsAttributParserRuleCall_3_1_0()); }
		ruleAttribut
		{ after(grammarAccess.getMethodeAccess().getAttributsAttributParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__AttributsAssignment_3_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMethodeAccess().getAttributsAttributParserRuleCall_3_2_1_0()); }
		ruleAttribut
		{ after(grammarAccess.getMethodeAccess().getAttributsAttributParserRuleCall_3_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__ContenuAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMethodeAccess().getContenuSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getMethodeAccess().getContenuSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Delegation__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDelegationAccess().getNameIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getDelegationAccess().getNameIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
