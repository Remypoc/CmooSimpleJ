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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimpleJParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'class'", "'('", "','", "')'", "':'", "'var'", "'const'", "'hidden'"
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




    // $ANTLR start "entryRuleModel"
    // InternalSimpleJ.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalSimpleJ.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalSimpleJ.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSimpleJ.g:72:1: ruleModel returns [EObject current=null] : ( (lv_classes_0_0= ruleClasse ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_classes_0_0 = null;



        	enterRule();

        try {
            // InternalSimpleJ.g:78:2: ( ( (lv_classes_0_0= ruleClasse ) )* )
            // InternalSimpleJ.g:79:2: ( (lv_classes_0_0= ruleClasse ) )*
            {
            // InternalSimpleJ.g:79:2: ( (lv_classes_0_0= ruleClasse ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSimpleJ.g:80:3: (lv_classes_0_0= ruleClasse )
            	    {
            	    // InternalSimpleJ.g:80:3: (lv_classes_0_0= ruleClasse )
            	    // InternalSimpleJ.g:81:4: lv_classes_0_0= ruleClasse
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getClassesClasseParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_classes_0_0=ruleClasse();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"classes",
            	    					lv_classes_0_0,
            	    					"fr.paris10.miage.SimpleJ.Classe");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleClasse"
    // InternalSimpleJ.g:101:1: entryRuleClasse returns [EObject current=null] : iv_ruleClasse= ruleClasse EOF ;
    public final EObject entryRuleClasse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClasse = null;


        try {
            // InternalSimpleJ.g:101:47: (iv_ruleClasse= ruleClasse EOF )
            // InternalSimpleJ.g:102:2: iv_ruleClasse= ruleClasse EOF
            {
             newCompositeNode(grammarAccess.getClasseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClasse=ruleClasse();

            state._fsp--;

             current =iv_ruleClasse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClasse"


    // $ANTLR start "ruleClasse"
    // InternalSimpleJ.g:108:1: ruleClasse returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_attributs_3_0= ruleAttribut ) ) (otherlv_4= ',' ( (lv_attributs_5_0= ruleAttribut ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleClasse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attributs_3_0 = null;

        EObject lv_attributs_5_0 = null;



        	enterRule();

        try {
            // InternalSimpleJ.g:114:2: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_attributs_3_0= ruleAttribut ) ) (otherlv_4= ',' ( (lv_attributs_5_0= ruleAttribut ) ) )* )? otherlv_6= ')' ) )
            // InternalSimpleJ.g:115:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_attributs_3_0= ruleAttribut ) ) (otherlv_4= ',' ( (lv_attributs_5_0= ruleAttribut ) ) )* )? otherlv_6= ')' )
            {
            // InternalSimpleJ.g:115:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_attributs_3_0= ruleAttribut ) ) (otherlv_4= ',' ( (lv_attributs_5_0= ruleAttribut ) ) )* )? otherlv_6= ')' )
            // InternalSimpleJ.g:116:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_attributs_3_0= ruleAttribut ) ) (otherlv_4= ',' ( (lv_attributs_5_0= ruleAttribut ) ) )* )? otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getClasseAccess().getClassKeyword_0());
            		
            // InternalSimpleJ.g:120:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSimpleJ.g:121:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSimpleJ.g:121:4: (lv_name_1_0= RULE_ID )
            // InternalSimpleJ.g:122:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getClasseAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClasseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getClasseAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSimpleJ.g:142:3: ( ( (lv_attributs_3_0= ruleAttribut ) ) (otherlv_4= ',' ( (lv_attributs_5_0= ruleAttribut ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=16 && LA3_0<=18)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSimpleJ.g:143:4: ( (lv_attributs_3_0= ruleAttribut ) ) (otherlv_4= ',' ( (lv_attributs_5_0= ruleAttribut ) ) )*
                    {
                    // InternalSimpleJ.g:143:4: ( (lv_attributs_3_0= ruleAttribut ) )
                    // InternalSimpleJ.g:144:5: (lv_attributs_3_0= ruleAttribut )
                    {
                    // InternalSimpleJ.g:144:5: (lv_attributs_3_0= ruleAttribut )
                    // InternalSimpleJ.g:145:6: lv_attributs_3_0= ruleAttribut
                    {

                    						newCompositeNode(grammarAccess.getClasseAccess().getAttributsAttributParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_attributs_3_0=ruleAttribut();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClasseRule());
                    						}
                    						add(
                    							current,
                    							"attributs",
                    							lv_attributs_3_0,
                    							"fr.paris10.miage.SimpleJ.Attribut");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSimpleJ.g:162:4: (otherlv_4= ',' ( (lv_attributs_5_0= ruleAttribut ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==13) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalSimpleJ.g:163:5: otherlv_4= ',' ( (lv_attributs_5_0= ruleAttribut ) )
                    	    {
                    	    otherlv_4=(Token)match(input,13,FOLLOW_8); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getClasseAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalSimpleJ.g:167:5: ( (lv_attributs_5_0= ruleAttribut ) )
                    	    // InternalSimpleJ.g:168:6: (lv_attributs_5_0= ruleAttribut )
                    	    {
                    	    // InternalSimpleJ.g:168:6: (lv_attributs_5_0= ruleAttribut )
                    	    // InternalSimpleJ.g:169:7: lv_attributs_5_0= ruleAttribut
                    	    {

                    	    							newCompositeNode(grammarAccess.getClasseAccess().getAttributsAttributParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_attributs_5_0=ruleAttribut();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClasseRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributs",
                    	    								lv_attributs_5_0,
                    	    								"fr.paris10.miage.SimpleJ.Attribut");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getClasseAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClasse"


    // $ANTLR start "entryRuleAttribut"
    // InternalSimpleJ.g:196:1: entryRuleAttribut returns [EObject current=null] : iv_ruleAttribut= ruleAttribut EOF ;
    public final EObject entryRuleAttribut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribut = null;


        try {
            // InternalSimpleJ.g:196:49: (iv_ruleAttribut= ruleAttribut EOF )
            // InternalSimpleJ.g:197:2: iv_ruleAttribut= ruleAttribut EOF
            {
             newCompositeNode(grammarAccess.getAttributRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribut=ruleAttribut();

            state._fsp--;

             current =iv_ruleAttribut; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribut"


    // $ANTLR start "ruleAttribut"
    // InternalSimpleJ.g:203:1: ruleAttribut returns [EObject current=null] : ( ( (lv_acces_0_0= ruleAcces ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) ;
    public final EObject ruleAttribut() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_acces_0_0 = null;

        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalSimpleJ.g:209:2: ( ( ( (lv_acces_0_0= ruleAcces ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) )
            // InternalSimpleJ.g:210:2: ( ( (lv_acces_0_0= ruleAcces ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            {
            // InternalSimpleJ.g:210:2: ( ( (lv_acces_0_0= ruleAcces ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            // InternalSimpleJ.g:211:3: ( (lv_acces_0_0= ruleAcces ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) )
            {
            // InternalSimpleJ.g:211:3: ( (lv_acces_0_0= ruleAcces ) )
            // InternalSimpleJ.g:212:4: (lv_acces_0_0= ruleAcces )
            {
            // InternalSimpleJ.g:212:4: (lv_acces_0_0= ruleAcces )
            // InternalSimpleJ.g:213:5: lv_acces_0_0= ruleAcces
            {

            					newCompositeNode(grammarAccess.getAttributAccess().getAccesAccesEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_acces_0_0=ruleAcces();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributRule());
            					}
            					set(
            						current,
            						"acces",
            						lv_acces_0_0,
            						"fr.paris10.miage.SimpleJ.Acces");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSimpleJ.g:230:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSimpleJ.g:231:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSimpleJ.g:231:4: (lv_name_1_0= RULE_ID )
            // InternalSimpleJ.g:232:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributAccess().getColonKeyword_2());
            		
            // InternalSimpleJ.g:252:3: ( (lv_type_3_0= ruleType ) )
            // InternalSimpleJ.g:253:4: (lv_type_3_0= ruleType )
            {
            // InternalSimpleJ.g:253:4: (lv_type_3_0= ruleType )
            // InternalSimpleJ.g:254:5: lv_type_3_0= ruleType
            {

            					newCompositeNode(grammarAccess.getAttributAccess().getTypeTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"fr.paris10.miage.SimpleJ.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribut"


    // $ANTLR start "entryRuleType"
    // InternalSimpleJ.g:275:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalSimpleJ.g:275:45: (iv_ruleType= ruleType EOF )
            // InternalSimpleJ.g:276:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalSimpleJ.g:282:1: ruleType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSimpleJ.g:288:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSimpleJ.g:289:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSimpleJ.g:289:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSimpleJ.g:290:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSimpleJ.g:290:3: (lv_name_0_0= RULE_ID )
            // InternalSimpleJ.g:291:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTypeRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "ruleAcces"
    // InternalSimpleJ.g:310:1: ruleAcces returns [Enumerator current=null] : ( (enumLiteral_0= 'var' ) | (enumLiteral_1= 'const' ) | (enumLiteral_2= 'hidden' ) ) ;
    public final Enumerator ruleAcces() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSimpleJ.g:316:2: ( ( (enumLiteral_0= 'var' ) | (enumLiteral_1= 'const' ) | (enumLiteral_2= 'hidden' ) ) )
            // InternalSimpleJ.g:317:2: ( (enumLiteral_0= 'var' ) | (enumLiteral_1= 'const' ) | (enumLiteral_2= 'hidden' ) )
            {
            // InternalSimpleJ.g:317:2: ( (enumLiteral_0= 'var' ) | (enumLiteral_1= 'const' ) | (enumLiteral_2= 'hidden' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 18:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSimpleJ.g:318:3: (enumLiteral_0= 'var' )
                    {
                    // InternalSimpleJ.g:318:3: (enumLiteral_0= 'var' )
                    // InternalSimpleJ.g:319:4: enumLiteral_0= 'var'
                    {
                    enumLiteral_0=(Token)match(input,16,FOLLOW_2); 

                    				current = grammarAccess.getAccesAccess().getAccessVarEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAccesAccess().getAccessVarEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleJ.g:326:3: (enumLiteral_1= 'const' )
                    {
                    // InternalSimpleJ.g:326:3: (enumLiteral_1= 'const' )
                    // InternalSimpleJ.g:327:4: enumLiteral_1= 'const'
                    {
                    enumLiteral_1=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getAccesAccess().getAccessConstEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAccesAccess().getAccessConstEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSimpleJ.g:334:3: (enumLiteral_2= 'hidden' )
                    {
                    // InternalSimpleJ.g:334:3: (enumLiteral_2= 'hidden' )
                    // InternalSimpleJ.g:335:4: enumLiteral_2= 'hidden'
                    {
                    enumLiteral_2=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getAccesAccess().getAccessHiddenEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAccesAccess().getAccessHiddenEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAcces"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000074000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});

}