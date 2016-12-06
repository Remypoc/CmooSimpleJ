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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimpleJParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "'const'", "'hidden'", "'class'", "'('", "')'", "','", "':'", "'program'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalSimpleJParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSimpleJParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSimpleJParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSimpleJ.g"; }


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



    // $ANTLR start "entryRuleModel"
    // InternalSimpleJ.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalSimpleJ.g:54:1: ( ruleModel EOF )
            // InternalSimpleJ.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSimpleJ.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalSimpleJ.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalSimpleJ.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalSimpleJ.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalSimpleJ.g:69:3: ( rule__Model__Group__0 )
            // InternalSimpleJ.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleClasse"
    // InternalSimpleJ.g:78:1: entryRuleClasse : ruleClasse EOF ;
    public final void entryRuleClasse() throws RecognitionException {
        try {
            // InternalSimpleJ.g:79:1: ( ruleClasse EOF )
            // InternalSimpleJ.g:80:1: ruleClasse EOF
            {
             before(grammarAccess.getClasseRule()); 
            pushFollow(FOLLOW_1);
            ruleClasse();

            state._fsp--;

             after(grammarAccess.getClasseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClasse"


    // $ANTLR start "ruleClasse"
    // InternalSimpleJ.g:87:1: ruleClasse : ( ( rule__Classe__Group__0 ) ) ;
    public final void ruleClasse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:91:2: ( ( ( rule__Classe__Group__0 ) ) )
            // InternalSimpleJ.g:92:2: ( ( rule__Classe__Group__0 ) )
            {
            // InternalSimpleJ.g:92:2: ( ( rule__Classe__Group__0 ) )
            // InternalSimpleJ.g:93:3: ( rule__Classe__Group__0 )
            {
             before(grammarAccess.getClasseAccess().getGroup()); 
            // InternalSimpleJ.g:94:3: ( rule__Classe__Group__0 )
            // InternalSimpleJ.g:94:4: rule__Classe__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Classe__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClasseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClasse"


    // $ANTLR start "entryRuleAttribut"
    // InternalSimpleJ.g:103:1: entryRuleAttribut : ruleAttribut EOF ;
    public final void entryRuleAttribut() throws RecognitionException {
        try {
            // InternalSimpleJ.g:104:1: ( ruleAttribut EOF )
            // InternalSimpleJ.g:105:1: ruleAttribut EOF
            {
             before(grammarAccess.getAttributRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getAttributRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribut"


    // $ANTLR start "ruleAttribut"
    // InternalSimpleJ.g:112:1: ruleAttribut : ( ( rule__Attribut__Group__0 ) ) ;
    public final void ruleAttribut() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:116:2: ( ( ( rule__Attribut__Group__0 ) ) )
            // InternalSimpleJ.g:117:2: ( ( rule__Attribut__Group__0 ) )
            {
            // InternalSimpleJ.g:117:2: ( ( rule__Attribut__Group__0 ) )
            // InternalSimpleJ.g:118:3: ( rule__Attribut__Group__0 )
            {
             before(grammarAccess.getAttributAccess().getGroup()); 
            // InternalSimpleJ.g:119:3: ( rule__Attribut__Group__0 )
            // InternalSimpleJ.g:119:4: rule__Attribut__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribut__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribut"


    // $ANTLR start "entryRuleType"
    // InternalSimpleJ.g:128:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalSimpleJ.g:129:1: ( ruleType EOF )
            // InternalSimpleJ.g:130:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalSimpleJ.g:137:1: ruleType : ( ( rule__Type__NameAssignment ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:141:2: ( ( ( rule__Type__NameAssignment ) ) )
            // InternalSimpleJ.g:142:2: ( ( rule__Type__NameAssignment ) )
            {
            // InternalSimpleJ.g:142:2: ( ( rule__Type__NameAssignment ) )
            // InternalSimpleJ.g:143:3: ( rule__Type__NameAssignment )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment()); 
            // InternalSimpleJ.g:144:3: ( rule__Type__NameAssignment )
            // InternalSimpleJ.g:144:4: rule__Type__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Type__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleProgram"
    // InternalSimpleJ.g:153:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalSimpleJ.g:154:1: ( ruleProgram EOF )
            // InternalSimpleJ.g:155:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalSimpleJ.g:162:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:166:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalSimpleJ.g:167:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalSimpleJ.g:167:2: ( ( rule__Program__Group__0 ) )
            // InternalSimpleJ.g:168:3: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalSimpleJ.g:169:3: ( rule__Program__Group__0 )
            // InternalSimpleJ.g:169:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "ruleAcces"
    // InternalSimpleJ.g:178:1: ruleAcces : ( ( rule__Acces__Alternatives ) ) ;
    public final void ruleAcces() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:182:1: ( ( ( rule__Acces__Alternatives ) ) )
            // InternalSimpleJ.g:183:2: ( ( rule__Acces__Alternatives ) )
            {
            // InternalSimpleJ.g:183:2: ( ( rule__Acces__Alternatives ) )
            // InternalSimpleJ.g:184:3: ( rule__Acces__Alternatives )
            {
             before(grammarAccess.getAccesAccess().getAlternatives()); 
            // InternalSimpleJ.g:185:3: ( rule__Acces__Alternatives )
            // InternalSimpleJ.g:185:4: rule__Acces__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Acces__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAccesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAcces"


    // $ANTLR start "rule__Acces__Alternatives"
    // InternalSimpleJ.g:193:1: rule__Acces__Alternatives : ( ( ( 'var' ) ) | ( ( 'const' ) ) | ( ( 'hidden' ) ) );
    public final void rule__Acces__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:197:1: ( ( ( 'var' ) ) | ( ( 'const' ) ) | ( ( 'hidden' ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalSimpleJ.g:198:2: ( ( 'var' ) )
                    {
                    // InternalSimpleJ.g:198:2: ( ( 'var' ) )
                    // InternalSimpleJ.g:199:3: ( 'var' )
                    {
                     before(grammarAccess.getAccesAccess().getAccessVarEnumLiteralDeclaration_0()); 
                    // InternalSimpleJ.g:200:3: ( 'var' )
                    // InternalSimpleJ.g:200:4: 'var'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getAccesAccess().getAccessVarEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleJ.g:204:2: ( ( 'const' ) )
                    {
                    // InternalSimpleJ.g:204:2: ( ( 'const' ) )
                    // InternalSimpleJ.g:205:3: ( 'const' )
                    {
                     before(grammarAccess.getAccesAccess().getAccessConstEnumLiteralDeclaration_1()); 
                    // InternalSimpleJ.g:206:3: ( 'const' )
                    // InternalSimpleJ.g:206:4: 'const'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getAccesAccess().getAccessConstEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSimpleJ.g:210:2: ( ( 'hidden' ) )
                    {
                    // InternalSimpleJ.g:210:2: ( ( 'hidden' ) )
                    // InternalSimpleJ.g:211:3: ( 'hidden' )
                    {
                     before(grammarAccess.getAccesAccess().getAccessHiddenEnumLiteralDeclaration_2()); 
                    // InternalSimpleJ.g:212:3: ( 'hidden' )
                    // InternalSimpleJ.g:212:4: 'hidden'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getAccesAccess().getAccessHiddenEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Acces__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalSimpleJ.g:220:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:224:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalSimpleJ.g:225:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalSimpleJ.g:232:1: rule__Model__Group__0__Impl : ( ( rule__Model__ClassesAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:236:1: ( ( ( rule__Model__ClassesAssignment_0 )* ) )
            // InternalSimpleJ.g:237:1: ( ( rule__Model__ClassesAssignment_0 )* )
            {
            // InternalSimpleJ.g:237:1: ( ( rule__Model__ClassesAssignment_0 )* )
            // InternalSimpleJ.g:238:2: ( rule__Model__ClassesAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getClassesAssignment_0()); 
            // InternalSimpleJ.g:239:2: ( rule__Model__ClassesAssignment_0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSimpleJ.g:239:3: rule__Model__ClassesAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__ClassesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getClassesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalSimpleJ.g:247:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:251:1: ( rule__Model__Group__1__Impl )
            // InternalSimpleJ.g:252:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalSimpleJ.g:258:1: rule__Model__Group__1__Impl : ( ( rule__Model__ProgramAssignment_1 )? ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:262:1: ( ( ( rule__Model__ProgramAssignment_1 )? ) )
            // InternalSimpleJ.g:263:1: ( ( rule__Model__ProgramAssignment_1 )? )
            {
            // InternalSimpleJ.g:263:1: ( ( rule__Model__ProgramAssignment_1 )? )
            // InternalSimpleJ.g:264:2: ( rule__Model__ProgramAssignment_1 )?
            {
             before(grammarAccess.getModelAccess().getProgramAssignment_1()); 
            // InternalSimpleJ.g:265:2: ( rule__Model__ProgramAssignment_1 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSimpleJ.g:265:3: rule__Model__ProgramAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ProgramAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getProgramAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Classe__Group__0"
    // InternalSimpleJ.g:274:1: rule__Classe__Group__0 : rule__Classe__Group__0__Impl rule__Classe__Group__1 ;
    public final void rule__Classe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:278:1: ( rule__Classe__Group__0__Impl rule__Classe__Group__1 )
            // InternalSimpleJ.g:279:2: rule__Classe__Group__0__Impl rule__Classe__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Classe__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Classe__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group__0"


    // $ANTLR start "rule__Classe__Group__0__Impl"
    // InternalSimpleJ.g:286:1: rule__Classe__Group__0__Impl : ( 'class' ) ;
    public final void rule__Classe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:290:1: ( ( 'class' ) )
            // InternalSimpleJ.g:291:1: ( 'class' )
            {
            // InternalSimpleJ.g:291:1: ( 'class' )
            // InternalSimpleJ.g:292:2: 'class'
            {
             before(grammarAccess.getClasseAccess().getClassKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getClasseAccess().getClassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group__0__Impl"


    // $ANTLR start "rule__Classe__Group__1"
    // InternalSimpleJ.g:301:1: rule__Classe__Group__1 : rule__Classe__Group__1__Impl rule__Classe__Group__2 ;
    public final void rule__Classe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:305:1: ( rule__Classe__Group__1__Impl rule__Classe__Group__2 )
            // InternalSimpleJ.g:306:2: rule__Classe__Group__1__Impl rule__Classe__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Classe__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Classe__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group__1"


    // $ANTLR start "rule__Classe__Group__1__Impl"
    // InternalSimpleJ.g:313:1: rule__Classe__Group__1__Impl : ( ( rule__Classe__NameAssignment_1 ) ) ;
    public final void rule__Classe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:317:1: ( ( ( rule__Classe__NameAssignment_1 ) ) )
            // InternalSimpleJ.g:318:1: ( ( rule__Classe__NameAssignment_1 ) )
            {
            // InternalSimpleJ.g:318:1: ( ( rule__Classe__NameAssignment_1 ) )
            // InternalSimpleJ.g:319:2: ( rule__Classe__NameAssignment_1 )
            {
             before(grammarAccess.getClasseAccess().getNameAssignment_1()); 
            // InternalSimpleJ.g:320:2: ( rule__Classe__NameAssignment_1 )
            // InternalSimpleJ.g:320:3: rule__Classe__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Classe__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClasseAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group__1__Impl"


    // $ANTLR start "rule__Classe__Group__2"
    // InternalSimpleJ.g:328:1: rule__Classe__Group__2 : rule__Classe__Group__2__Impl rule__Classe__Group__3 ;
    public final void rule__Classe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:332:1: ( rule__Classe__Group__2__Impl rule__Classe__Group__3 )
            // InternalSimpleJ.g:333:2: rule__Classe__Group__2__Impl rule__Classe__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Classe__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Classe__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group__2"


    // $ANTLR start "rule__Classe__Group__2__Impl"
    // InternalSimpleJ.g:340:1: rule__Classe__Group__2__Impl : ( '(' ) ;
    public final void rule__Classe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:344:1: ( ( '(' ) )
            // InternalSimpleJ.g:345:1: ( '(' )
            {
            // InternalSimpleJ.g:345:1: ( '(' )
            // InternalSimpleJ.g:346:2: '('
            {
             before(grammarAccess.getClasseAccess().getLeftParenthesisKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getClasseAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group__2__Impl"


    // $ANTLR start "rule__Classe__Group__3"
    // InternalSimpleJ.g:355:1: rule__Classe__Group__3 : rule__Classe__Group__3__Impl rule__Classe__Group__4 ;
    public final void rule__Classe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:359:1: ( rule__Classe__Group__3__Impl rule__Classe__Group__4 )
            // InternalSimpleJ.g:360:2: rule__Classe__Group__3__Impl rule__Classe__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Classe__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Classe__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group__3"


    // $ANTLR start "rule__Classe__Group__3__Impl"
    // InternalSimpleJ.g:367:1: rule__Classe__Group__3__Impl : ( ( rule__Classe__Group_3__0 )? ) ;
    public final void rule__Classe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:371:1: ( ( ( rule__Classe__Group_3__0 )? ) )
            // InternalSimpleJ.g:372:1: ( ( rule__Classe__Group_3__0 )? )
            {
            // InternalSimpleJ.g:372:1: ( ( rule__Classe__Group_3__0 )? )
            // InternalSimpleJ.g:373:2: ( rule__Classe__Group_3__0 )?
            {
             before(grammarAccess.getClasseAccess().getGroup_3()); 
            // InternalSimpleJ.g:374:2: ( rule__Classe__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=11 && LA4_0<=13)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSimpleJ.g:374:3: rule__Classe__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Classe__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClasseAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group__3__Impl"


    // $ANTLR start "rule__Classe__Group__4"
    // InternalSimpleJ.g:382:1: rule__Classe__Group__4 : rule__Classe__Group__4__Impl rule__Classe__Group__5 ;
    public final void rule__Classe__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:386:1: ( rule__Classe__Group__4__Impl rule__Classe__Group__5 )
            // InternalSimpleJ.g:387:2: rule__Classe__Group__4__Impl rule__Classe__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Classe__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Classe__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group__4"


    // $ANTLR start "rule__Classe__Group__4__Impl"
    // InternalSimpleJ.g:394:1: rule__Classe__Group__4__Impl : ( ')' ) ;
    public final void rule__Classe__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:398:1: ( ( ')' ) )
            // InternalSimpleJ.g:399:1: ( ')' )
            {
            // InternalSimpleJ.g:399:1: ( ')' )
            // InternalSimpleJ.g:400:2: ')'
            {
             before(grammarAccess.getClasseAccess().getRightParenthesisKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getClasseAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group__4__Impl"


    // $ANTLR start "rule__Classe__Group__5"
    // InternalSimpleJ.g:409:1: rule__Classe__Group__5 : rule__Classe__Group__5__Impl ;
    public final void rule__Classe__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:413:1: ( rule__Classe__Group__5__Impl )
            // InternalSimpleJ.g:414:2: rule__Classe__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Classe__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group__5"


    // $ANTLR start "rule__Classe__Group__5__Impl"
    // InternalSimpleJ.g:420:1: rule__Classe__Group__5__Impl : ( ( rule__Classe__Group_5__0 )? ) ;
    public final void rule__Classe__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:424:1: ( ( ( rule__Classe__Group_5__0 )? ) )
            // InternalSimpleJ.g:425:1: ( ( rule__Classe__Group_5__0 )? )
            {
            // InternalSimpleJ.g:425:1: ( ( rule__Classe__Group_5__0 )? )
            // InternalSimpleJ.g:426:2: ( rule__Classe__Group_5__0 )?
            {
             before(grammarAccess.getClasseAccess().getGroup_5()); 
            // InternalSimpleJ.g:427:2: ( rule__Classe__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSimpleJ.g:427:3: rule__Classe__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Classe__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClasseAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group__5__Impl"


    // $ANTLR start "rule__Classe__Group_3__0"
    // InternalSimpleJ.g:436:1: rule__Classe__Group_3__0 : rule__Classe__Group_3__0__Impl rule__Classe__Group_3__1 ;
    public final void rule__Classe__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:440:1: ( rule__Classe__Group_3__0__Impl rule__Classe__Group_3__1 )
            // InternalSimpleJ.g:441:2: rule__Classe__Group_3__0__Impl rule__Classe__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Classe__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Classe__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group_3__0"


    // $ANTLR start "rule__Classe__Group_3__0__Impl"
    // InternalSimpleJ.g:448:1: rule__Classe__Group_3__0__Impl : ( ( rule__Classe__AttributsAssignment_3_0 ) ) ;
    public final void rule__Classe__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:452:1: ( ( ( rule__Classe__AttributsAssignment_3_0 ) ) )
            // InternalSimpleJ.g:453:1: ( ( rule__Classe__AttributsAssignment_3_0 ) )
            {
            // InternalSimpleJ.g:453:1: ( ( rule__Classe__AttributsAssignment_3_0 ) )
            // InternalSimpleJ.g:454:2: ( rule__Classe__AttributsAssignment_3_0 )
            {
             before(grammarAccess.getClasseAccess().getAttributsAssignment_3_0()); 
            // InternalSimpleJ.g:455:2: ( rule__Classe__AttributsAssignment_3_0 )
            // InternalSimpleJ.g:455:3: rule__Classe__AttributsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Classe__AttributsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getClasseAccess().getAttributsAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group_3__0__Impl"


    // $ANTLR start "rule__Classe__Group_3__1"
    // InternalSimpleJ.g:463:1: rule__Classe__Group_3__1 : rule__Classe__Group_3__1__Impl ;
    public final void rule__Classe__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:467:1: ( rule__Classe__Group_3__1__Impl )
            // InternalSimpleJ.g:468:2: rule__Classe__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Classe__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group_3__1"


    // $ANTLR start "rule__Classe__Group_3__1__Impl"
    // InternalSimpleJ.g:474:1: rule__Classe__Group_3__1__Impl : ( ( rule__Classe__Group_3_1__0 )* ) ;
    public final void rule__Classe__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:478:1: ( ( ( rule__Classe__Group_3_1__0 )* ) )
            // InternalSimpleJ.g:479:1: ( ( rule__Classe__Group_3_1__0 )* )
            {
            // InternalSimpleJ.g:479:1: ( ( rule__Classe__Group_3_1__0 )* )
            // InternalSimpleJ.g:480:2: ( rule__Classe__Group_3_1__0 )*
            {
             before(grammarAccess.getClasseAccess().getGroup_3_1()); 
            // InternalSimpleJ.g:481:2: ( rule__Classe__Group_3_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSimpleJ.g:481:3: rule__Classe__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Classe__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getClasseAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group_3__1__Impl"


    // $ANTLR start "rule__Classe__Group_3_1__0"
    // InternalSimpleJ.g:490:1: rule__Classe__Group_3_1__0 : rule__Classe__Group_3_1__0__Impl rule__Classe__Group_3_1__1 ;
    public final void rule__Classe__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:494:1: ( rule__Classe__Group_3_1__0__Impl rule__Classe__Group_3_1__1 )
            // InternalSimpleJ.g:495:2: rule__Classe__Group_3_1__0__Impl rule__Classe__Group_3_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Classe__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Classe__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group_3_1__0"


    // $ANTLR start "rule__Classe__Group_3_1__0__Impl"
    // InternalSimpleJ.g:502:1: rule__Classe__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Classe__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:506:1: ( ( ',' ) )
            // InternalSimpleJ.g:507:1: ( ',' )
            {
            // InternalSimpleJ.g:507:1: ( ',' )
            // InternalSimpleJ.g:508:2: ','
            {
             before(grammarAccess.getClasseAccess().getCommaKeyword_3_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getClasseAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group_3_1__0__Impl"


    // $ANTLR start "rule__Classe__Group_3_1__1"
    // InternalSimpleJ.g:517:1: rule__Classe__Group_3_1__1 : rule__Classe__Group_3_1__1__Impl ;
    public final void rule__Classe__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:521:1: ( rule__Classe__Group_3_1__1__Impl )
            // InternalSimpleJ.g:522:2: rule__Classe__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Classe__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group_3_1__1"


    // $ANTLR start "rule__Classe__Group_3_1__1__Impl"
    // InternalSimpleJ.g:528:1: rule__Classe__Group_3_1__1__Impl : ( ( rule__Classe__AttributsAssignment_3_1_1 ) ) ;
    public final void rule__Classe__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:532:1: ( ( ( rule__Classe__AttributsAssignment_3_1_1 ) ) )
            // InternalSimpleJ.g:533:1: ( ( rule__Classe__AttributsAssignment_3_1_1 ) )
            {
            // InternalSimpleJ.g:533:1: ( ( rule__Classe__AttributsAssignment_3_1_1 ) )
            // InternalSimpleJ.g:534:2: ( rule__Classe__AttributsAssignment_3_1_1 )
            {
             before(grammarAccess.getClasseAccess().getAttributsAssignment_3_1_1()); 
            // InternalSimpleJ.g:535:2: ( rule__Classe__AttributsAssignment_3_1_1 )
            // InternalSimpleJ.g:535:3: rule__Classe__AttributsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Classe__AttributsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getClasseAccess().getAttributsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group_3_1__1__Impl"


    // $ANTLR start "rule__Classe__Group_5__0"
    // InternalSimpleJ.g:544:1: rule__Classe__Group_5__0 : rule__Classe__Group_5__0__Impl rule__Classe__Group_5__1 ;
    public final void rule__Classe__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:548:1: ( rule__Classe__Group_5__0__Impl rule__Classe__Group_5__1 )
            // InternalSimpleJ.g:549:2: rule__Classe__Group_5__0__Impl rule__Classe__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Classe__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Classe__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group_5__0"


    // $ANTLR start "rule__Classe__Group_5__0__Impl"
    // InternalSimpleJ.g:556:1: rule__Classe__Group_5__0__Impl : ( ':' ) ;
    public final void rule__Classe__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:560:1: ( ( ':' ) )
            // InternalSimpleJ.g:561:1: ( ':' )
            {
            // InternalSimpleJ.g:561:1: ( ':' )
            // InternalSimpleJ.g:562:2: ':'
            {
             before(grammarAccess.getClasseAccess().getColonKeyword_5_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getClasseAccess().getColonKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group_5__0__Impl"


    // $ANTLR start "rule__Classe__Group_5__1"
    // InternalSimpleJ.g:571:1: rule__Classe__Group_5__1 : rule__Classe__Group_5__1__Impl ;
    public final void rule__Classe__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:575:1: ( rule__Classe__Group_5__1__Impl )
            // InternalSimpleJ.g:576:2: rule__Classe__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Classe__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group_5__1"


    // $ANTLR start "rule__Classe__Group_5__1__Impl"
    // InternalSimpleJ.g:582:1: rule__Classe__Group_5__1__Impl : ( ( rule__Classe__ParentAssignment_5_1 ) ) ;
    public final void rule__Classe__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:586:1: ( ( ( rule__Classe__ParentAssignment_5_1 ) ) )
            // InternalSimpleJ.g:587:1: ( ( rule__Classe__ParentAssignment_5_1 ) )
            {
            // InternalSimpleJ.g:587:1: ( ( rule__Classe__ParentAssignment_5_1 ) )
            // InternalSimpleJ.g:588:2: ( rule__Classe__ParentAssignment_5_1 )
            {
             before(grammarAccess.getClasseAccess().getParentAssignment_5_1()); 
            // InternalSimpleJ.g:589:2: ( rule__Classe__ParentAssignment_5_1 )
            // InternalSimpleJ.g:589:3: rule__Classe__ParentAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Classe__ParentAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getClasseAccess().getParentAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group_5__1__Impl"


    // $ANTLR start "rule__Attribut__Group__0"
    // InternalSimpleJ.g:598:1: rule__Attribut__Group__0 : rule__Attribut__Group__0__Impl rule__Attribut__Group__1 ;
    public final void rule__Attribut__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:602:1: ( rule__Attribut__Group__0__Impl rule__Attribut__Group__1 )
            // InternalSimpleJ.g:603:2: rule__Attribut__Group__0__Impl rule__Attribut__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Attribut__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribut__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group__0"


    // $ANTLR start "rule__Attribut__Group__0__Impl"
    // InternalSimpleJ.g:610:1: rule__Attribut__Group__0__Impl : ( ( rule__Attribut__AccesAssignment_0 ) ) ;
    public final void rule__Attribut__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:614:1: ( ( ( rule__Attribut__AccesAssignment_0 ) ) )
            // InternalSimpleJ.g:615:1: ( ( rule__Attribut__AccesAssignment_0 ) )
            {
            // InternalSimpleJ.g:615:1: ( ( rule__Attribut__AccesAssignment_0 ) )
            // InternalSimpleJ.g:616:2: ( rule__Attribut__AccesAssignment_0 )
            {
             before(grammarAccess.getAttributAccess().getAccesAssignment_0()); 
            // InternalSimpleJ.g:617:2: ( rule__Attribut__AccesAssignment_0 )
            // InternalSimpleJ.g:617:3: rule__Attribut__AccesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribut__AccesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributAccess().getAccesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group__0__Impl"


    // $ANTLR start "rule__Attribut__Group__1"
    // InternalSimpleJ.g:625:1: rule__Attribut__Group__1 : rule__Attribut__Group__1__Impl rule__Attribut__Group__2 ;
    public final void rule__Attribut__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:629:1: ( rule__Attribut__Group__1__Impl rule__Attribut__Group__2 )
            // InternalSimpleJ.g:630:2: rule__Attribut__Group__1__Impl rule__Attribut__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Attribut__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribut__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group__1"


    // $ANTLR start "rule__Attribut__Group__1__Impl"
    // InternalSimpleJ.g:637:1: rule__Attribut__Group__1__Impl : ( ( rule__Attribut__NameAssignment_1 ) ) ;
    public final void rule__Attribut__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:641:1: ( ( ( rule__Attribut__NameAssignment_1 ) ) )
            // InternalSimpleJ.g:642:1: ( ( rule__Attribut__NameAssignment_1 ) )
            {
            // InternalSimpleJ.g:642:1: ( ( rule__Attribut__NameAssignment_1 ) )
            // InternalSimpleJ.g:643:2: ( rule__Attribut__NameAssignment_1 )
            {
             before(grammarAccess.getAttributAccess().getNameAssignment_1()); 
            // InternalSimpleJ.g:644:2: ( rule__Attribut__NameAssignment_1 )
            // InternalSimpleJ.g:644:3: rule__Attribut__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribut__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group__1__Impl"


    // $ANTLR start "rule__Attribut__Group__2"
    // InternalSimpleJ.g:652:1: rule__Attribut__Group__2 : rule__Attribut__Group__2__Impl rule__Attribut__Group__3 ;
    public final void rule__Attribut__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:656:1: ( rule__Attribut__Group__2__Impl rule__Attribut__Group__3 )
            // InternalSimpleJ.g:657:2: rule__Attribut__Group__2__Impl rule__Attribut__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Attribut__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribut__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group__2"


    // $ANTLR start "rule__Attribut__Group__2__Impl"
    // InternalSimpleJ.g:664:1: rule__Attribut__Group__2__Impl : ( ':' ) ;
    public final void rule__Attribut__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:668:1: ( ( ':' ) )
            // InternalSimpleJ.g:669:1: ( ':' )
            {
            // InternalSimpleJ.g:669:1: ( ':' )
            // InternalSimpleJ.g:670:2: ':'
            {
             before(grammarAccess.getAttributAccess().getColonKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAttributAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group__2__Impl"


    // $ANTLR start "rule__Attribut__Group__3"
    // InternalSimpleJ.g:679:1: rule__Attribut__Group__3 : rule__Attribut__Group__3__Impl ;
    public final void rule__Attribut__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:683:1: ( rule__Attribut__Group__3__Impl )
            // InternalSimpleJ.g:684:2: rule__Attribut__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribut__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group__3"


    // $ANTLR start "rule__Attribut__Group__3__Impl"
    // InternalSimpleJ.g:690:1: rule__Attribut__Group__3__Impl : ( ( rule__Attribut__TypeAssignment_3 ) ) ;
    public final void rule__Attribut__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:694:1: ( ( ( rule__Attribut__TypeAssignment_3 ) ) )
            // InternalSimpleJ.g:695:1: ( ( rule__Attribut__TypeAssignment_3 ) )
            {
            // InternalSimpleJ.g:695:1: ( ( rule__Attribut__TypeAssignment_3 ) )
            // InternalSimpleJ.g:696:2: ( rule__Attribut__TypeAssignment_3 )
            {
             before(grammarAccess.getAttributAccess().getTypeAssignment_3()); 
            // InternalSimpleJ.g:697:2: ( rule__Attribut__TypeAssignment_3 )
            // InternalSimpleJ.g:697:3: rule__Attribut__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Attribut__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group__3__Impl"


    // $ANTLR start "rule__Program__Group__0"
    // InternalSimpleJ.g:706:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:710:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalSimpleJ.g:711:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalSimpleJ.g:718:1: rule__Program__Group__0__Impl : ( 'program' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:722:1: ( ( 'program' ) )
            // InternalSimpleJ.g:723:1: ( 'program' )
            {
            // InternalSimpleJ.g:723:1: ( 'program' )
            // InternalSimpleJ.g:724:2: 'program'
            {
             before(grammarAccess.getProgramAccess().getProgramKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getProgramKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalSimpleJ.g:733:1: rule__Program__Group__1 : rule__Program__Group__1__Impl ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:737:1: ( rule__Program__Group__1__Impl )
            // InternalSimpleJ.g:738:2: rule__Program__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalSimpleJ.g:744:1: rule__Program__Group__1__Impl : ( ( rule__Program__NameAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:748:1: ( ( ( rule__Program__NameAssignment_1 ) ) )
            // InternalSimpleJ.g:749:1: ( ( rule__Program__NameAssignment_1 ) )
            {
            // InternalSimpleJ.g:749:1: ( ( rule__Program__NameAssignment_1 ) )
            // InternalSimpleJ.g:750:2: ( rule__Program__NameAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getNameAssignment_1()); 
            // InternalSimpleJ.g:751:2: ( rule__Program__NameAssignment_1 )
            // InternalSimpleJ.g:751:3: rule__Program__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Program__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Model__ClassesAssignment_0"
    // InternalSimpleJ.g:760:1: rule__Model__ClassesAssignment_0 : ( ruleClasse ) ;
    public final void rule__Model__ClassesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:764:1: ( ( ruleClasse ) )
            // InternalSimpleJ.g:765:2: ( ruleClasse )
            {
            // InternalSimpleJ.g:765:2: ( ruleClasse )
            // InternalSimpleJ.g:766:3: ruleClasse
            {
             before(grammarAccess.getModelAccess().getClassesClasseParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleClasse();

            state._fsp--;

             after(grammarAccess.getModelAccess().getClassesClasseParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ClassesAssignment_0"


    // $ANTLR start "rule__Model__ProgramAssignment_1"
    // InternalSimpleJ.g:775:1: rule__Model__ProgramAssignment_1 : ( ruleProgram ) ;
    public final void rule__Model__ProgramAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:779:1: ( ( ruleProgram ) )
            // InternalSimpleJ.g:780:2: ( ruleProgram )
            {
            // InternalSimpleJ.g:780:2: ( ruleProgram )
            // InternalSimpleJ.g:781:3: ruleProgram
            {
             before(grammarAccess.getModelAccess().getProgramProgramParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getModelAccess().getProgramProgramParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ProgramAssignment_1"


    // $ANTLR start "rule__Classe__NameAssignment_1"
    // InternalSimpleJ.g:790:1: rule__Classe__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Classe__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:794:1: ( ( RULE_ID ) )
            // InternalSimpleJ.g:795:2: ( RULE_ID )
            {
            // InternalSimpleJ.g:795:2: ( RULE_ID )
            // InternalSimpleJ.g:796:3: RULE_ID
            {
             before(grammarAccess.getClasseAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClasseAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__NameAssignment_1"


    // $ANTLR start "rule__Classe__AttributsAssignment_3_0"
    // InternalSimpleJ.g:805:1: rule__Classe__AttributsAssignment_3_0 : ( ruleAttribut ) ;
    public final void rule__Classe__AttributsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:809:1: ( ( ruleAttribut ) )
            // InternalSimpleJ.g:810:2: ( ruleAttribut )
            {
            // InternalSimpleJ.g:810:2: ( ruleAttribut )
            // InternalSimpleJ.g:811:3: ruleAttribut
            {
             before(grammarAccess.getClasseAccess().getAttributsAttributParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getClasseAccess().getAttributsAttributParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__AttributsAssignment_3_0"


    // $ANTLR start "rule__Classe__AttributsAssignment_3_1_1"
    // InternalSimpleJ.g:820:1: rule__Classe__AttributsAssignment_3_1_1 : ( ruleAttribut ) ;
    public final void rule__Classe__AttributsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:824:1: ( ( ruleAttribut ) )
            // InternalSimpleJ.g:825:2: ( ruleAttribut )
            {
            // InternalSimpleJ.g:825:2: ( ruleAttribut )
            // InternalSimpleJ.g:826:3: ruleAttribut
            {
             before(grammarAccess.getClasseAccess().getAttributsAttributParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getClasseAccess().getAttributsAttributParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__AttributsAssignment_3_1_1"


    // $ANTLR start "rule__Classe__ParentAssignment_5_1"
    // InternalSimpleJ.g:835:1: rule__Classe__ParentAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Classe__ParentAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:839:1: ( ( ( RULE_ID ) ) )
            // InternalSimpleJ.g:840:2: ( ( RULE_ID ) )
            {
            // InternalSimpleJ.g:840:2: ( ( RULE_ID ) )
            // InternalSimpleJ.g:841:3: ( RULE_ID )
            {
             before(grammarAccess.getClasseAccess().getParentClasseCrossReference_5_1_0()); 
            // InternalSimpleJ.g:842:3: ( RULE_ID )
            // InternalSimpleJ.g:843:4: RULE_ID
            {
             before(grammarAccess.getClasseAccess().getParentClasseIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClasseAccess().getParentClasseIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getClasseAccess().getParentClasseCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__ParentAssignment_5_1"


    // $ANTLR start "rule__Attribut__AccesAssignment_0"
    // InternalSimpleJ.g:854:1: rule__Attribut__AccesAssignment_0 : ( ruleAcces ) ;
    public final void rule__Attribut__AccesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:858:1: ( ( ruleAcces ) )
            // InternalSimpleJ.g:859:2: ( ruleAcces )
            {
            // InternalSimpleJ.g:859:2: ( ruleAcces )
            // InternalSimpleJ.g:860:3: ruleAcces
            {
             before(grammarAccess.getAttributAccess().getAccesAccesEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAcces();

            state._fsp--;

             after(grammarAccess.getAttributAccess().getAccesAccesEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__AccesAssignment_0"


    // $ANTLR start "rule__Attribut__NameAssignment_1"
    // InternalSimpleJ.g:869:1: rule__Attribut__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribut__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:873:1: ( ( RULE_ID ) )
            // InternalSimpleJ.g:874:2: ( RULE_ID )
            {
            // InternalSimpleJ.g:874:2: ( RULE_ID )
            // InternalSimpleJ.g:875:3: RULE_ID
            {
             before(grammarAccess.getAttributAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__NameAssignment_1"


    // $ANTLR start "rule__Attribut__TypeAssignment_3"
    // InternalSimpleJ.g:884:1: rule__Attribut__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__Attribut__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:888:1: ( ( ruleType ) )
            // InternalSimpleJ.g:889:2: ( ruleType )
            {
            // InternalSimpleJ.g:889:2: ( ruleType )
            // InternalSimpleJ.g:890:3: ruleType
            {
             before(grammarAccess.getAttributAccess().getTypeTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getAttributAccess().getTypeTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__TypeAssignment_3"


    // $ANTLR start "rule__Type__NameAssignment"
    // InternalSimpleJ.g:899:1: rule__Type__NameAssignment : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:903:1: ( ( RULE_ID ) )
            // InternalSimpleJ.g:904:2: ( RULE_ID )
            {
            // InternalSimpleJ.g:904:2: ( RULE_ID )
            // InternalSimpleJ.g:905:3: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__NameAssignment"


    // $ANTLR start "rule__Program__NameAssignment_1"
    // InternalSimpleJ.g:914:1: rule__Program__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Program__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:918:1: ( ( RULE_ID ) )
            // InternalSimpleJ.g:919:2: ( RULE_ID )
            {
            // InternalSimpleJ.g:919:2: ( RULE_ID )
            // InternalSimpleJ.g:920:3: RULE_ID
            {
             before(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000013800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000003800L});

}