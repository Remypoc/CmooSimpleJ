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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "'const'", "'hidden'", "'class'", "'('", "')'", "','", "':'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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
    // InternalSimpleJ.g:62:1: ruleModel : ( ( rule__Model__ClassesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:66:2: ( ( ( rule__Model__ClassesAssignment )* ) )
            // InternalSimpleJ.g:67:2: ( ( rule__Model__ClassesAssignment )* )
            {
            // InternalSimpleJ.g:67:2: ( ( rule__Model__ClassesAssignment )* )
            // InternalSimpleJ.g:68:3: ( rule__Model__ClassesAssignment )*
            {
             before(grammarAccess.getModelAccess().getClassesAssignment()); 
            // InternalSimpleJ.g:69:3: ( rule__Model__ClassesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSimpleJ.g:69:4: rule__Model__ClassesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ClassesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getClassesAssignment()); 

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


    // $ANTLR start "ruleAcces"
    // InternalSimpleJ.g:153:1: ruleAcces : ( ( rule__Acces__Alternatives ) ) ;
    public final void ruleAcces() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:157:1: ( ( ( rule__Acces__Alternatives ) ) )
            // InternalSimpleJ.g:158:2: ( ( rule__Acces__Alternatives ) )
            {
            // InternalSimpleJ.g:158:2: ( ( rule__Acces__Alternatives ) )
            // InternalSimpleJ.g:159:3: ( rule__Acces__Alternatives )
            {
             before(grammarAccess.getAccesAccess().getAlternatives()); 
            // InternalSimpleJ.g:160:3: ( rule__Acces__Alternatives )
            // InternalSimpleJ.g:160:4: rule__Acces__Alternatives
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
    // InternalSimpleJ.g:168:1: rule__Acces__Alternatives : ( ( ( 'var' ) ) | ( ( 'const' ) ) | ( ( 'hidden' ) ) );
    public final void rule__Acces__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:172:1: ( ( ( 'var' ) ) | ( ( 'const' ) ) | ( ( 'hidden' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSimpleJ.g:173:2: ( ( 'var' ) )
                    {
                    // InternalSimpleJ.g:173:2: ( ( 'var' ) )
                    // InternalSimpleJ.g:174:3: ( 'var' )
                    {
                     before(grammarAccess.getAccesAccess().getAccessVarEnumLiteralDeclaration_0()); 
                    // InternalSimpleJ.g:175:3: ( 'var' )
                    // InternalSimpleJ.g:175:4: 'var'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getAccesAccess().getAccessVarEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleJ.g:179:2: ( ( 'const' ) )
                    {
                    // InternalSimpleJ.g:179:2: ( ( 'const' ) )
                    // InternalSimpleJ.g:180:3: ( 'const' )
                    {
                     before(grammarAccess.getAccesAccess().getAccessConstEnumLiteralDeclaration_1()); 
                    // InternalSimpleJ.g:181:3: ( 'const' )
                    // InternalSimpleJ.g:181:4: 'const'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getAccesAccess().getAccessConstEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSimpleJ.g:185:2: ( ( 'hidden' ) )
                    {
                    // InternalSimpleJ.g:185:2: ( ( 'hidden' ) )
                    // InternalSimpleJ.g:186:3: ( 'hidden' )
                    {
                     before(grammarAccess.getAccesAccess().getAccessHiddenEnumLiteralDeclaration_2()); 
                    // InternalSimpleJ.g:187:3: ( 'hidden' )
                    // InternalSimpleJ.g:187:4: 'hidden'
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


    // $ANTLR start "rule__Classe__Group__0"
    // InternalSimpleJ.g:195:1: rule__Classe__Group__0 : rule__Classe__Group__0__Impl rule__Classe__Group__1 ;
    public final void rule__Classe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:199:1: ( rule__Classe__Group__0__Impl rule__Classe__Group__1 )
            // InternalSimpleJ.g:200:2: rule__Classe__Group__0__Impl rule__Classe__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSimpleJ.g:207:1: rule__Classe__Group__0__Impl : ( 'class' ) ;
    public final void rule__Classe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:211:1: ( ( 'class' ) )
            // InternalSimpleJ.g:212:1: ( 'class' )
            {
            // InternalSimpleJ.g:212:1: ( 'class' )
            // InternalSimpleJ.g:213:2: 'class'
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
    // InternalSimpleJ.g:222:1: rule__Classe__Group__1 : rule__Classe__Group__1__Impl rule__Classe__Group__2 ;
    public final void rule__Classe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:226:1: ( rule__Classe__Group__1__Impl rule__Classe__Group__2 )
            // InternalSimpleJ.g:227:2: rule__Classe__Group__1__Impl rule__Classe__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalSimpleJ.g:234:1: rule__Classe__Group__1__Impl : ( ( rule__Classe__NameAssignment_1 ) ) ;
    public final void rule__Classe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:238:1: ( ( ( rule__Classe__NameAssignment_1 ) ) )
            // InternalSimpleJ.g:239:1: ( ( rule__Classe__NameAssignment_1 ) )
            {
            // InternalSimpleJ.g:239:1: ( ( rule__Classe__NameAssignment_1 ) )
            // InternalSimpleJ.g:240:2: ( rule__Classe__NameAssignment_1 )
            {
             before(grammarAccess.getClasseAccess().getNameAssignment_1()); 
            // InternalSimpleJ.g:241:2: ( rule__Classe__NameAssignment_1 )
            // InternalSimpleJ.g:241:3: rule__Classe__NameAssignment_1
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
    // InternalSimpleJ.g:249:1: rule__Classe__Group__2 : rule__Classe__Group__2__Impl rule__Classe__Group__3 ;
    public final void rule__Classe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:253:1: ( rule__Classe__Group__2__Impl rule__Classe__Group__3 )
            // InternalSimpleJ.g:254:2: rule__Classe__Group__2__Impl rule__Classe__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalSimpleJ.g:261:1: rule__Classe__Group__2__Impl : ( '(' ) ;
    public final void rule__Classe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:265:1: ( ( '(' ) )
            // InternalSimpleJ.g:266:1: ( '(' )
            {
            // InternalSimpleJ.g:266:1: ( '(' )
            // InternalSimpleJ.g:267:2: '('
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
    // InternalSimpleJ.g:276:1: rule__Classe__Group__3 : rule__Classe__Group__3__Impl rule__Classe__Group__4 ;
    public final void rule__Classe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:280:1: ( rule__Classe__Group__3__Impl rule__Classe__Group__4 )
            // InternalSimpleJ.g:281:2: rule__Classe__Group__3__Impl rule__Classe__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalSimpleJ.g:288:1: rule__Classe__Group__3__Impl : ( ( rule__Classe__Group_3__0 )? ) ;
    public final void rule__Classe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:292:1: ( ( ( rule__Classe__Group_3__0 )? ) )
            // InternalSimpleJ.g:293:1: ( ( rule__Classe__Group_3__0 )? )
            {
            // InternalSimpleJ.g:293:1: ( ( rule__Classe__Group_3__0 )? )
            // InternalSimpleJ.g:294:2: ( rule__Classe__Group_3__0 )?
            {
             before(grammarAccess.getClasseAccess().getGroup_3()); 
            // InternalSimpleJ.g:295:2: ( rule__Classe__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=11 && LA3_0<=13)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSimpleJ.g:295:3: rule__Classe__Group_3__0
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
    // InternalSimpleJ.g:303:1: rule__Classe__Group__4 : rule__Classe__Group__4__Impl ;
    public final void rule__Classe__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:307:1: ( rule__Classe__Group__4__Impl )
            // InternalSimpleJ.g:308:2: rule__Classe__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Classe__Group__4__Impl();

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
    // InternalSimpleJ.g:314:1: rule__Classe__Group__4__Impl : ( ')' ) ;
    public final void rule__Classe__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:318:1: ( ( ')' ) )
            // InternalSimpleJ.g:319:1: ( ')' )
            {
            // InternalSimpleJ.g:319:1: ( ')' )
            // InternalSimpleJ.g:320:2: ')'
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


    // $ANTLR start "rule__Classe__Group_3__0"
    // InternalSimpleJ.g:330:1: rule__Classe__Group_3__0 : rule__Classe__Group_3__0__Impl rule__Classe__Group_3__1 ;
    public final void rule__Classe__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:334:1: ( rule__Classe__Group_3__0__Impl rule__Classe__Group_3__1 )
            // InternalSimpleJ.g:335:2: rule__Classe__Group_3__0__Impl rule__Classe__Group_3__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalSimpleJ.g:342:1: rule__Classe__Group_3__0__Impl : ( ( rule__Classe__AttributsAssignment_3_0 ) ) ;
    public final void rule__Classe__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:346:1: ( ( ( rule__Classe__AttributsAssignment_3_0 ) ) )
            // InternalSimpleJ.g:347:1: ( ( rule__Classe__AttributsAssignment_3_0 ) )
            {
            // InternalSimpleJ.g:347:1: ( ( rule__Classe__AttributsAssignment_3_0 ) )
            // InternalSimpleJ.g:348:2: ( rule__Classe__AttributsAssignment_3_0 )
            {
             before(grammarAccess.getClasseAccess().getAttributsAssignment_3_0()); 
            // InternalSimpleJ.g:349:2: ( rule__Classe__AttributsAssignment_3_0 )
            // InternalSimpleJ.g:349:3: rule__Classe__AttributsAssignment_3_0
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
    // InternalSimpleJ.g:357:1: rule__Classe__Group_3__1 : rule__Classe__Group_3__1__Impl ;
    public final void rule__Classe__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:361:1: ( rule__Classe__Group_3__1__Impl )
            // InternalSimpleJ.g:362:2: rule__Classe__Group_3__1__Impl
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
    // InternalSimpleJ.g:368:1: rule__Classe__Group_3__1__Impl : ( ( rule__Classe__Group_3_1__0 )* ) ;
    public final void rule__Classe__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:372:1: ( ( ( rule__Classe__Group_3_1__0 )* ) )
            // InternalSimpleJ.g:373:1: ( ( rule__Classe__Group_3_1__0 )* )
            {
            // InternalSimpleJ.g:373:1: ( ( rule__Classe__Group_3_1__0 )* )
            // InternalSimpleJ.g:374:2: ( rule__Classe__Group_3_1__0 )*
            {
             before(grammarAccess.getClasseAccess().getGroup_3_1()); 
            // InternalSimpleJ.g:375:2: ( rule__Classe__Group_3_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSimpleJ.g:375:3: rule__Classe__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Classe__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalSimpleJ.g:384:1: rule__Classe__Group_3_1__0 : rule__Classe__Group_3_1__0__Impl rule__Classe__Group_3_1__1 ;
    public final void rule__Classe__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:388:1: ( rule__Classe__Group_3_1__0__Impl rule__Classe__Group_3_1__1 )
            // InternalSimpleJ.g:389:2: rule__Classe__Group_3_1__0__Impl rule__Classe__Group_3_1__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalSimpleJ.g:396:1: rule__Classe__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Classe__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:400:1: ( ( ',' ) )
            // InternalSimpleJ.g:401:1: ( ',' )
            {
            // InternalSimpleJ.g:401:1: ( ',' )
            // InternalSimpleJ.g:402:2: ','
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
    // InternalSimpleJ.g:411:1: rule__Classe__Group_3_1__1 : rule__Classe__Group_3_1__1__Impl ;
    public final void rule__Classe__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:415:1: ( rule__Classe__Group_3_1__1__Impl )
            // InternalSimpleJ.g:416:2: rule__Classe__Group_3_1__1__Impl
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
    // InternalSimpleJ.g:422:1: rule__Classe__Group_3_1__1__Impl : ( ( rule__Classe__AttributsAssignment_3_1_1 ) ) ;
    public final void rule__Classe__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:426:1: ( ( ( rule__Classe__AttributsAssignment_3_1_1 ) ) )
            // InternalSimpleJ.g:427:1: ( ( rule__Classe__AttributsAssignment_3_1_1 ) )
            {
            // InternalSimpleJ.g:427:1: ( ( rule__Classe__AttributsAssignment_3_1_1 ) )
            // InternalSimpleJ.g:428:2: ( rule__Classe__AttributsAssignment_3_1_1 )
            {
             before(grammarAccess.getClasseAccess().getAttributsAssignment_3_1_1()); 
            // InternalSimpleJ.g:429:2: ( rule__Classe__AttributsAssignment_3_1_1 )
            // InternalSimpleJ.g:429:3: rule__Classe__AttributsAssignment_3_1_1
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


    // $ANTLR start "rule__Attribut__Group__0"
    // InternalSimpleJ.g:438:1: rule__Attribut__Group__0 : rule__Attribut__Group__0__Impl rule__Attribut__Group__1 ;
    public final void rule__Attribut__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:442:1: ( rule__Attribut__Group__0__Impl rule__Attribut__Group__1 )
            // InternalSimpleJ.g:443:2: rule__Attribut__Group__0__Impl rule__Attribut__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSimpleJ.g:450:1: rule__Attribut__Group__0__Impl : ( ( rule__Attribut__AccesAssignment_0 ) ) ;
    public final void rule__Attribut__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:454:1: ( ( ( rule__Attribut__AccesAssignment_0 ) ) )
            // InternalSimpleJ.g:455:1: ( ( rule__Attribut__AccesAssignment_0 ) )
            {
            // InternalSimpleJ.g:455:1: ( ( rule__Attribut__AccesAssignment_0 ) )
            // InternalSimpleJ.g:456:2: ( rule__Attribut__AccesAssignment_0 )
            {
             before(grammarAccess.getAttributAccess().getAccesAssignment_0()); 
            // InternalSimpleJ.g:457:2: ( rule__Attribut__AccesAssignment_0 )
            // InternalSimpleJ.g:457:3: rule__Attribut__AccesAssignment_0
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
    // InternalSimpleJ.g:465:1: rule__Attribut__Group__1 : rule__Attribut__Group__1__Impl rule__Attribut__Group__2 ;
    public final void rule__Attribut__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:469:1: ( rule__Attribut__Group__1__Impl rule__Attribut__Group__2 )
            // InternalSimpleJ.g:470:2: rule__Attribut__Group__1__Impl rule__Attribut__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalSimpleJ.g:477:1: rule__Attribut__Group__1__Impl : ( ( rule__Attribut__NameAssignment_1 ) ) ;
    public final void rule__Attribut__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:481:1: ( ( ( rule__Attribut__NameAssignment_1 ) ) )
            // InternalSimpleJ.g:482:1: ( ( rule__Attribut__NameAssignment_1 ) )
            {
            // InternalSimpleJ.g:482:1: ( ( rule__Attribut__NameAssignment_1 ) )
            // InternalSimpleJ.g:483:2: ( rule__Attribut__NameAssignment_1 )
            {
             before(grammarAccess.getAttributAccess().getNameAssignment_1()); 
            // InternalSimpleJ.g:484:2: ( rule__Attribut__NameAssignment_1 )
            // InternalSimpleJ.g:484:3: rule__Attribut__NameAssignment_1
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
    // InternalSimpleJ.g:492:1: rule__Attribut__Group__2 : rule__Attribut__Group__2__Impl rule__Attribut__Group__3 ;
    public final void rule__Attribut__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:496:1: ( rule__Attribut__Group__2__Impl rule__Attribut__Group__3 )
            // InternalSimpleJ.g:497:2: rule__Attribut__Group__2__Impl rule__Attribut__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalSimpleJ.g:504:1: rule__Attribut__Group__2__Impl : ( ':' ) ;
    public final void rule__Attribut__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:508:1: ( ( ':' ) )
            // InternalSimpleJ.g:509:1: ( ':' )
            {
            // InternalSimpleJ.g:509:1: ( ':' )
            // InternalSimpleJ.g:510:2: ':'
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
    // InternalSimpleJ.g:519:1: rule__Attribut__Group__3 : rule__Attribut__Group__3__Impl ;
    public final void rule__Attribut__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:523:1: ( rule__Attribut__Group__3__Impl )
            // InternalSimpleJ.g:524:2: rule__Attribut__Group__3__Impl
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
    // InternalSimpleJ.g:530:1: rule__Attribut__Group__3__Impl : ( ( rule__Attribut__TypeAssignment_3 ) ) ;
    public final void rule__Attribut__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:534:1: ( ( ( rule__Attribut__TypeAssignment_3 ) ) )
            // InternalSimpleJ.g:535:1: ( ( rule__Attribut__TypeAssignment_3 ) )
            {
            // InternalSimpleJ.g:535:1: ( ( rule__Attribut__TypeAssignment_3 ) )
            // InternalSimpleJ.g:536:2: ( rule__Attribut__TypeAssignment_3 )
            {
             before(grammarAccess.getAttributAccess().getTypeAssignment_3()); 
            // InternalSimpleJ.g:537:2: ( rule__Attribut__TypeAssignment_3 )
            // InternalSimpleJ.g:537:3: rule__Attribut__TypeAssignment_3
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


    // $ANTLR start "rule__Model__ClassesAssignment"
    // InternalSimpleJ.g:546:1: rule__Model__ClassesAssignment : ( ruleClasse ) ;
    public final void rule__Model__ClassesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:550:1: ( ( ruleClasse ) )
            // InternalSimpleJ.g:551:2: ( ruleClasse )
            {
            // InternalSimpleJ.g:551:2: ( ruleClasse )
            // InternalSimpleJ.g:552:3: ruleClasse
            {
             before(grammarAccess.getModelAccess().getClassesClasseParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleClasse();

            state._fsp--;

             after(grammarAccess.getModelAccess().getClassesClasseParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__ClassesAssignment"


    // $ANTLR start "rule__Classe__NameAssignment_1"
    // InternalSimpleJ.g:561:1: rule__Classe__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Classe__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:565:1: ( ( RULE_ID ) )
            // InternalSimpleJ.g:566:2: ( RULE_ID )
            {
            // InternalSimpleJ.g:566:2: ( RULE_ID )
            // InternalSimpleJ.g:567:3: RULE_ID
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
    // InternalSimpleJ.g:576:1: rule__Classe__AttributsAssignment_3_0 : ( ruleAttribut ) ;
    public final void rule__Classe__AttributsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:580:1: ( ( ruleAttribut ) )
            // InternalSimpleJ.g:581:2: ( ruleAttribut )
            {
            // InternalSimpleJ.g:581:2: ( ruleAttribut )
            // InternalSimpleJ.g:582:3: ruleAttribut
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
    // InternalSimpleJ.g:591:1: rule__Classe__AttributsAssignment_3_1_1 : ( ruleAttribut ) ;
    public final void rule__Classe__AttributsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:595:1: ( ( ruleAttribut ) )
            // InternalSimpleJ.g:596:2: ( ruleAttribut )
            {
            // InternalSimpleJ.g:596:2: ( ruleAttribut )
            // InternalSimpleJ.g:597:3: ruleAttribut
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


    // $ANTLR start "rule__Attribut__AccesAssignment_0"
    // InternalSimpleJ.g:606:1: rule__Attribut__AccesAssignment_0 : ( ruleAcces ) ;
    public final void rule__Attribut__AccesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:610:1: ( ( ruleAcces ) )
            // InternalSimpleJ.g:611:2: ( ruleAcces )
            {
            // InternalSimpleJ.g:611:2: ( ruleAcces )
            // InternalSimpleJ.g:612:3: ruleAcces
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
    // InternalSimpleJ.g:621:1: rule__Attribut__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribut__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:625:1: ( ( RULE_ID ) )
            // InternalSimpleJ.g:626:2: ( RULE_ID )
            {
            // InternalSimpleJ.g:626:2: ( RULE_ID )
            // InternalSimpleJ.g:627:3: RULE_ID
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
    // InternalSimpleJ.g:636:1: rule__Attribut__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__Attribut__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:640:1: ( ( ruleType ) )
            // InternalSimpleJ.g:641:2: ( ruleType )
            {
            // InternalSimpleJ.g:641:2: ( ruleType )
            // InternalSimpleJ.g:642:3: ruleType
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
    // InternalSimpleJ.g:651:1: rule__Type__NameAssignment : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleJ.g:655:1: ( ( RULE_ID ) )
            // InternalSimpleJ.g:656:2: ( RULE_ID )
            {
            // InternalSimpleJ.g:656:2: ( RULE_ID )
            // InternalSimpleJ.g:657:3: RULE_ID
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000013800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});

}