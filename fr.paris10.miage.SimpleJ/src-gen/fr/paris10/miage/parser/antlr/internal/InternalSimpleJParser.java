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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'class'", "'('", "','", "')'", "':'", "'program'", "'def'", "'var'", "'const'", "'hidden'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

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
    // InternalSimpleJ.g:72:1: ruleModel returns [EObject current=null] : ( ( (lv_classes_0_0= ruleClasse ) )* ( (lv_program_1_0= ruleProgram ) )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_classes_0_0 = null;

        EObject lv_program_1_0 = null;



        	enterRule();

        try {
            // InternalSimpleJ.g:78:2: ( ( ( (lv_classes_0_0= ruleClasse ) )* ( (lv_program_1_0= ruleProgram ) )? ) )
            // InternalSimpleJ.g:79:2: ( ( (lv_classes_0_0= ruleClasse ) )* ( (lv_program_1_0= ruleProgram ) )? )
            {
            // InternalSimpleJ.g:79:2: ( ( (lv_classes_0_0= ruleClasse ) )* ( (lv_program_1_0= ruleProgram ) )? )
            // InternalSimpleJ.g:80:3: ( (lv_classes_0_0= ruleClasse ) )* ( (lv_program_1_0= ruleProgram ) )?
            {
            // InternalSimpleJ.g:80:3: ( (lv_classes_0_0= ruleClasse ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSimpleJ.g:81:4: (lv_classes_0_0= ruleClasse )
            	    {
            	    // InternalSimpleJ.g:81:4: (lv_classes_0_0= ruleClasse )
            	    // InternalSimpleJ.g:82:5: lv_classes_0_0= ruleClasse
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getClassesClasseParserRuleCall_0_0());
            	    				
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

            // InternalSimpleJ.g:99:3: ( (lv_program_1_0= ruleProgram ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSimpleJ.g:100:4: (lv_program_1_0= ruleProgram )
                    {
                    // InternalSimpleJ.g:100:4: (lv_program_1_0= ruleProgram )
                    // InternalSimpleJ.g:101:5: lv_program_1_0= ruleProgram
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getProgramProgramParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_program_1_0=ruleProgram();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"program",
                    						lv_program_1_0,
                    						"fr.paris10.miage.SimpleJ.Program");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleClasse"
    // InternalSimpleJ.g:122:1: entryRuleClasse returns [EObject current=null] : iv_ruleClasse= ruleClasse EOF ;
    public final EObject entryRuleClasse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClasse = null;


        try {
            // InternalSimpleJ.g:122:47: (iv_ruleClasse= ruleClasse EOF )
            // InternalSimpleJ.g:123:2: iv_ruleClasse= ruleClasse EOF
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
    // InternalSimpleJ.g:129:1: ruleClasse returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_attributs_3_0= ruleAttribut ) ) (otherlv_4= ',' ( (lv_attributs_5_0= ruleAttribut ) ) )* ) (otherlv_6= ')' )? (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? ( ( (lv_methodes_9_0= ruleMethode ) ) ( (lv_methodes_10_0= ruleMethode ) )* )? ) ;
    public final EObject ruleClasse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_attributs_3_0 = null;

        EObject lv_attributs_5_0 = null;

        EObject lv_methodes_9_0 = null;

        EObject lv_methodes_10_0 = null;



        	enterRule();

        try {
            // InternalSimpleJ.g:135:2: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_attributs_3_0= ruleAttribut ) ) (otherlv_4= ',' ( (lv_attributs_5_0= ruleAttribut ) ) )* ) (otherlv_6= ')' )? (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? ( ( (lv_methodes_9_0= ruleMethode ) ) ( (lv_methodes_10_0= ruleMethode ) )* )? ) )
            // InternalSimpleJ.g:136:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_attributs_3_0= ruleAttribut ) ) (otherlv_4= ',' ( (lv_attributs_5_0= ruleAttribut ) ) )* ) (otherlv_6= ')' )? (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? ( ( (lv_methodes_9_0= ruleMethode ) ) ( (lv_methodes_10_0= ruleMethode ) )* )? )
            {
            // InternalSimpleJ.g:136:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_attributs_3_0= ruleAttribut ) ) (otherlv_4= ',' ( (lv_attributs_5_0= ruleAttribut ) ) )* ) (otherlv_6= ')' )? (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? ( ( (lv_methodes_9_0= ruleMethode ) ) ( (lv_methodes_10_0= ruleMethode ) )* )? )
            // InternalSimpleJ.g:137:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_attributs_3_0= ruleAttribut ) ) (otherlv_4= ',' ( (lv_attributs_5_0= ruleAttribut ) ) )* ) (otherlv_6= ')' )? (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? ( ( (lv_methodes_9_0= ruleMethode ) ) ( (lv_methodes_10_0= ruleMethode ) )* )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getClasseAccess().getClassKeyword_0());
            		
            // InternalSimpleJ.g:141:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSimpleJ.g:142:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSimpleJ.g:142:4: (lv_name_1_0= RULE_ID )
            // InternalSimpleJ.g:143:5: lv_name_1_0= RULE_ID
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

            // InternalSimpleJ.g:159:3: (otherlv_2= '(' ( (lv_attributs_3_0= ruleAttribut ) ) (otherlv_4= ',' ( (lv_attributs_5_0= ruleAttribut ) ) )* )
            // InternalSimpleJ.g:160:4: otherlv_2= '(' ( (lv_attributs_3_0= ruleAttribut ) ) (otherlv_4= ',' ( (lv_attributs_5_0= ruleAttribut ) ) )*
            {
            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            				newLeafNode(otherlv_2, grammarAccess.getClasseAccess().getLeftParenthesisKeyword_2_0());
            			
            // InternalSimpleJ.g:164:4: ( (lv_attributs_3_0= ruleAttribut ) )
            // InternalSimpleJ.g:165:5: (lv_attributs_3_0= ruleAttribut )
            {
            // InternalSimpleJ.g:165:5: (lv_attributs_3_0= ruleAttribut )
            // InternalSimpleJ.g:166:6: lv_attributs_3_0= ruleAttribut
            {

            						newCompositeNode(grammarAccess.getClasseAccess().getAttributsAttributParserRuleCall_2_1_0());
            					
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

            // InternalSimpleJ.g:183:4: (otherlv_4= ',' ( (lv_attributs_5_0= ruleAttribut ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSimpleJ.g:184:5: otherlv_4= ',' ( (lv_attributs_5_0= ruleAttribut ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_6); 

            	    					newLeafNode(otherlv_4, grammarAccess.getClasseAccess().getCommaKeyword_2_2_0());
            	    				
            	    // InternalSimpleJ.g:188:5: ( (lv_attributs_5_0= ruleAttribut ) )
            	    // InternalSimpleJ.g:189:6: (lv_attributs_5_0= ruleAttribut )
            	    {
            	    // InternalSimpleJ.g:189:6: (lv_attributs_5_0= ruleAttribut )
            	    // InternalSimpleJ.g:190:7: lv_attributs_5_0= ruleAttribut
            	    {

            	    							newCompositeNode(grammarAccess.getClasseAccess().getAttributsAttributParserRuleCall_2_2_1_0());
            	    						
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
            	    break loop3;
                }
            } while (true);


            }

            // InternalSimpleJ.g:209:3: (otherlv_6= ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSimpleJ.g:210:4: otherlv_6= ')'
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getClasseAccess().getRightParenthesisKeyword_3());
                    			

                    }
                    break;

            }

            // InternalSimpleJ.g:215:3: (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSimpleJ.g:216:4: otherlv_7= ':' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getClasseAccess().getColonKeyword_4_0());
                    			
                    // InternalSimpleJ.g:220:4: ( (otherlv_8= RULE_ID ) )
                    // InternalSimpleJ.g:221:5: (otherlv_8= RULE_ID )
                    {
                    // InternalSimpleJ.g:221:5: (otherlv_8= RULE_ID )
                    // InternalSimpleJ.g:222:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClasseRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_8, grammarAccess.getClasseAccess().getParentClasseCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSimpleJ.g:234:3: ( ( (lv_methodes_9_0= ruleMethode ) ) ( (lv_methodes_10_0= ruleMethode ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSimpleJ.g:235:4: ( (lv_methodes_9_0= ruleMethode ) ) ( (lv_methodes_10_0= ruleMethode ) )*
                    {
                    // InternalSimpleJ.g:235:4: ( (lv_methodes_9_0= ruleMethode ) )
                    // InternalSimpleJ.g:236:5: (lv_methodes_9_0= ruleMethode )
                    {
                    // InternalSimpleJ.g:236:5: (lv_methodes_9_0= ruleMethode )
                    // InternalSimpleJ.g:237:6: lv_methodes_9_0= ruleMethode
                    {

                    						newCompositeNode(grammarAccess.getClasseAccess().getMethodesMethodeParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_methodes_9_0=ruleMethode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClasseRule());
                    						}
                    						add(
                    							current,
                    							"methodes",
                    							lv_methodes_9_0,
                    							"fr.paris10.miage.SimpleJ.Methode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSimpleJ.g:254:4: ( (lv_methodes_10_0= ruleMethode ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==17) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSimpleJ.g:255:5: (lv_methodes_10_0= ruleMethode )
                    	    {
                    	    // InternalSimpleJ.g:255:5: (lv_methodes_10_0= ruleMethode )
                    	    // InternalSimpleJ.g:256:6: lv_methodes_10_0= ruleMethode
                    	    {

                    	    						newCompositeNode(grammarAccess.getClasseAccess().getMethodesMethodeParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_methodes_10_0=ruleMethode();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getClasseRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"methodes",
                    	    							lv_methodes_10_0,
                    	    							"fr.paris10.miage.SimpleJ.Methode");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

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
    // $ANTLR end "ruleClasse"


    // $ANTLR start "entryRuleAttribut"
    // InternalSimpleJ.g:278:1: entryRuleAttribut returns [EObject current=null] : iv_ruleAttribut= ruleAttribut EOF ;
    public final EObject entryRuleAttribut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribut = null;


        try {
            // InternalSimpleJ.g:278:49: (iv_ruleAttribut= ruleAttribut EOF )
            // InternalSimpleJ.g:279:2: iv_ruleAttribut= ruleAttribut EOF
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
    // InternalSimpleJ.g:285:1: ruleAttribut returns [EObject current=null] : ( ( (lv_acces_0_0= ruleAcces ) )? ( (lv_delegue_1_0= ruleDelegation ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) ) ;
    public final EObject ruleAttribut() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_acces_0_0 = null;

        EObject lv_delegue_1_0 = null;

        EObject lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalSimpleJ.g:291:2: ( ( ( (lv_acces_0_0= ruleAcces ) )? ( (lv_delegue_1_0= ruleDelegation ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) ) )
            // InternalSimpleJ.g:292:2: ( ( (lv_acces_0_0= ruleAcces ) )? ( (lv_delegue_1_0= ruleDelegation ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) )
            {
            // InternalSimpleJ.g:292:2: ( ( (lv_acces_0_0= ruleAcces ) )? ( (lv_delegue_1_0= ruleDelegation ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) )
            // InternalSimpleJ.g:293:3: ( (lv_acces_0_0= ruleAcces ) )? ( (lv_delegue_1_0= ruleDelegation ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) )
            {
            // InternalSimpleJ.g:293:3: ( (lv_acces_0_0= ruleAcces ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=18 && LA8_0<=20)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSimpleJ.g:294:4: (lv_acces_0_0= ruleAcces )
                    {
                    // InternalSimpleJ.g:294:4: (lv_acces_0_0= ruleAcces )
                    // InternalSimpleJ.g:295:5: lv_acces_0_0= ruleAcces
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
                    break;

            }

            // InternalSimpleJ.g:312:3: ( (lv_delegue_1_0= ruleDelegation ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==RULE_ID) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // InternalSimpleJ.g:313:4: (lv_delegue_1_0= ruleDelegation )
                    {
                    // InternalSimpleJ.g:313:4: (lv_delegue_1_0= ruleDelegation )
                    // InternalSimpleJ.g:314:5: lv_delegue_1_0= ruleDelegation
                    {

                    					newCompositeNode(grammarAccess.getAttributAccess().getDelegueDelegationParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_4);
                    lv_delegue_1_0=ruleDelegation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAttributRule());
                    					}
                    					set(
                    						current,
                    						"delegue",
                    						lv_delegue_1_0,
                    						"fr.paris10.miage.SimpleJ.Delegation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSimpleJ.g:331:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSimpleJ.g:332:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSimpleJ.g:332:4: (lv_name_2_0= RULE_ID )
            // InternalSimpleJ.g:333:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_2_0, grammarAccess.getAttributAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributAccess().getColonKeyword_3());
            		
            // InternalSimpleJ.g:353:3: ( (lv_type_4_0= ruleType ) )
            // InternalSimpleJ.g:354:4: (lv_type_4_0= ruleType )
            {
            // InternalSimpleJ.g:354:4: (lv_type_4_0= ruleType )
            // InternalSimpleJ.g:355:5: lv_type_4_0= ruleType
            {

            					newCompositeNode(grammarAccess.getAttributAccess().getTypeTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_4_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
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
    // InternalSimpleJ.g:376:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalSimpleJ.g:376:45: (iv_ruleType= ruleType EOF )
            // InternalSimpleJ.g:377:2: iv_ruleType= ruleType EOF
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
    // InternalSimpleJ.g:383:1: ruleType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSimpleJ.g:389:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSimpleJ.g:390:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSimpleJ.g:390:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSimpleJ.g:391:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSimpleJ.g:391:3: (lv_name_0_0= RULE_ID )
            // InternalSimpleJ.g:392:4: lv_name_0_0= RULE_ID
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


    // $ANTLR start "entryRuleProgram"
    // InternalSimpleJ.g:411:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalSimpleJ.g:411:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalSimpleJ.g:412:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalSimpleJ.g:418:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_contenu_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_contenu_2_0=null;


        	enterRule();

        try {
            // InternalSimpleJ.g:424:2: ( (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_contenu_2_0= RULE_STRING ) ) ) )
            // InternalSimpleJ.g:425:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_contenu_2_0= RULE_STRING ) ) )
            {
            // InternalSimpleJ.g:425:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_contenu_2_0= RULE_STRING ) ) )
            // InternalSimpleJ.g:426:3: otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_contenu_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getProgramKeyword_0());
            		
            // InternalSimpleJ.g:430:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSimpleJ.g:431:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSimpleJ.g:431:4: (lv_name_1_0= RULE_ID )
            // InternalSimpleJ.g:432:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProgramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSimpleJ.g:448:3: ( (lv_contenu_2_0= RULE_STRING ) )
            // InternalSimpleJ.g:449:4: (lv_contenu_2_0= RULE_STRING )
            {
            // InternalSimpleJ.g:449:4: (lv_contenu_2_0= RULE_STRING )
            // InternalSimpleJ.g:450:5: lv_contenu_2_0= RULE_STRING
            {
            lv_contenu_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_contenu_2_0, grammarAccess.getProgramAccess().getContenuSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProgramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"contenu",
            						lv_contenu_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleMethode"
    // InternalSimpleJ.g:470:1: entryRuleMethode returns [EObject current=null] : iv_ruleMethode= ruleMethode EOF ;
    public final EObject entryRuleMethode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethode = null;


        try {
            // InternalSimpleJ.g:470:48: (iv_ruleMethode= ruleMethode EOF )
            // InternalSimpleJ.g:471:2: iv_ruleMethode= ruleMethode EOF
            {
             newCompositeNode(grammarAccess.getMethodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethode=ruleMethode();

            state._fsp--;

             current =iv_ruleMethode; 
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
    // $ANTLR end "entryRuleMethode"


    // $ANTLR start "ruleMethode"
    // InternalSimpleJ.g:477:1: ruleMethode returns [EObject current=null] : (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )? (otherlv_4= '(' ( (lv_attributs_5_0= ruleAttribut ) ) (otherlv_6= ',' ( (lv_attributs_7_0= ruleAttribut ) ) )* otherlv_8= ')' )? ( (lv_contenu_9_0= RULE_STRING ) ) ) ;
    public final EObject ruleMethode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_contenu_9_0=null;
        EObject lv_type_3_0 = null;

        EObject lv_attributs_5_0 = null;

        EObject lv_attributs_7_0 = null;



        	enterRule();

        try {
            // InternalSimpleJ.g:483:2: ( (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )? (otherlv_4= '(' ( (lv_attributs_5_0= ruleAttribut ) ) (otherlv_6= ',' ( (lv_attributs_7_0= ruleAttribut ) ) )* otherlv_8= ')' )? ( (lv_contenu_9_0= RULE_STRING ) ) ) )
            // InternalSimpleJ.g:484:2: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )? (otherlv_4= '(' ( (lv_attributs_5_0= ruleAttribut ) ) (otherlv_6= ',' ( (lv_attributs_7_0= ruleAttribut ) ) )* otherlv_8= ')' )? ( (lv_contenu_9_0= RULE_STRING ) ) )
            {
            // InternalSimpleJ.g:484:2: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )? (otherlv_4= '(' ( (lv_attributs_5_0= ruleAttribut ) ) (otherlv_6= ',' ( (lv_attributs_7_0= ruleAttribut ) ) )* otherlv_8= ')' )? ( (lv_contenu_9_0= RULE_STRING ) ) )
            // InternalSimpleJ.g:485:3: otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )? (otherlv_4= '(' ( (lv_attributs_5_0= ruleAttribut ) ) (otherlv_6= ',' ( (lv_attributs_7_0= ruleAttribut ) ) )* otherlv_8= ')' )? ( (lv_contenu_9_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMethodeAccess().getDefKeyword_0());
            		
            // InternalSimpleJ.g:489:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSimpleJ.g:490:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSimpleJ.g:490:4: (lv_name_1_0= RULE_ID )
            // InternalSimpleJ.g:491:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMethodeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSimpleJ.g:507:3: (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSimpleJ.g:508:4: otherlv_2= ':' ( (lv_type_3_0= ruleType ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getMethodeAccess().getColonKeyword_2_0());
                    			
                    // InternalSimpleJ.g:512:4: ( (lv_type_3_0= ruleType ) )
                    // InternalSimpleJ.g:513:5: (lv_type_3_0= ruleType )
                    {
                    // InternalSimpleJ.g:513:5: (lv_type_3_0= ruleType )
                    // InternalSimpleJ.g:514:6: lv_type_3_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getMethodeAccess().getTypeTypeParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_type_3_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodeRule());
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
                    break;

            }

            // InternalSimpleJ.g:532:3: (otherlv_4= '(' ( (lv_attributs_5_0= ruleAttribut ) ) (otherlv_6= ',' ( (lv_attributs_7_0= ruleAttribut ) ) )* otherlv_8= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==12) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSimpleJ.g:533:4: otherlv_4= '(' ( (lv_attributs_5_0= ruleAttribut ) ) (otherlv_6= ',' ( (lv_attributs_7_0= ruleAttribut ) ) )* otherlv_8= ')'
                    {
                    otherlv_4=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getMethodeAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalSimpleJ.g:537:4: ( (lv_attributs_5_0= ruleAttribut ) )
                    // InternalSimpleJ.g:538:5: (lv_attributs_5_0= ruleAttribut )
                    {
                    // InternalSimpleJ.g:538:5: (lv_attributs_5_0= ruleAttribut )
                    // InternalSimpleJ.g:539:6: lv_attributs_5_0= ruleAttribut
                    {

                    						newCompositeNode(grammarAccess.getMethodeAccess().getAttributsAttributParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_attributs_5_0=ruleAttribut();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodeRule());
                    						}
                    						add(
                    							current,
                    							"attributs",
                    							lv_attributs_5_0,
                    							"fr.paris10.miage.SimpleJ.Attribut");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSimpleJ.g:556:4: (otherlv_6= ',' ( (lv_attributs_7_0= ruleAttribut ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==13) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalSimpleJ.g:557:5: otherlv_6= ',' ( (lv_attributs_7_0= ruleAttribut ) )
                    	    {
                    	    otherlv_6=(Token)match(input,13,FOLLOW_6); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getMethodeAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalSimpleJ.g:561:5: ( (lv_attributs_7_0= ruleAttribut ) )
                    	    // InternalSimpleJ.g:562:6: (lv_attributs_7_0= ruleAttribut )
                    	    {
                    	    // InternalSimpleJ.g:562:6: (lv_attributs_7_0= ruleAttribut )
                    	    // InternalSimpleJ.g:563:7: lv_attributs_7_0= ruleAttribut
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethodeAccess().getAttributsAttributParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_attributs_7_0=ruleAttribut();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMethodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributs",
                    	    								lv_attributs_7_0,
                    	    								"fr.paris10.miage.SimpleJ.Attribut");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,14,FOLLOW_11); 

                    				newLeafNode(otherlv_8, grammarAccess.getMethodeAccess().getRightParenthesisKeyword_3_3());
                    			

                    }
                    break;

            }

            // InternalSimpleJ.g:586:3: ( (lv_contenu_9_0= RULE_STRING ) )
            // InternalSimpleJ.g:587:4: (lv_contenu_9_0= RULE_STRING )
            {
            // InternalSimpleJ.g:587:4: (lv_contenu_9_0= RULE_STRING )
            // InternalSimpleJ.g:588:5: lv_contenu_9_0= RULE_STRING
            {
            lv_contenu_9_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_contenu_9_0, grammarAccess.getMethodeAccess().getContenuSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"contenu",
            						lv_contenu_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleMethode"


    // $ANTLR start "entryRuleDelegation"
    // InternalSimpleJ.g:608:1: entryRuleDelegation returns [EObject current=null] : iv_ruleDelegation= ruleDelegation EOF ;
    public final EObject entryRuleDelegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelegation = null;


        try {
            // InternalSimpleJ.g:608:51: (iv_ruleDelegation= ruleDelegation EOF )
            // InternalSimpleJ.g:609:2: iv_ruleDelegation= ruleDelegation EOF
            {
             newCompositeNode(grammarAccess.getDelegationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelegation=ruleDelegation();

            state._fsp--;

             current =iv_ruleDelegation; 
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
    // $ANTLR end "entryRuleDelegation"


    // $ANTLR start "ruleDelegation"
    // InternalSimpleJ.g:615:1: ruleDelegation returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDelegation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSimpleJ.g:621:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSimpleJ.g:622:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSimpleJ.g:622:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSimpleJ.g:623:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSimpleJ.g:623:3: (lv_name_0_0= RULE_ID )
            // InternalSimpleJ.g:624:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getDelegationAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDelegationRule());
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
    // $ANTLR end "ruleDelegation"


    // $ANTLR start "ruleAcces"
    // InternalSimpleJ.g:643:1: ruleAcces returns [Enumerator current=null] : ( (enumLiteral_0= 'var' ) | (enumLiteral_1= 'const' ) | (enumLiteral_2= 'hidden' ) ) ;
    public final Enumerator ruleAcces() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSimpleJ.g:649:2: ( ( (enumLiteral_0= 'var' ) | (enumLiteral_1= 'const' ) | (enumLiteral_2= 'hidden' ) ) )
            // InternalSimpleJ.g:650:2: ( (enumLiteral_0= 'var' ) | (enumLiteral_1= 'const' ) | (enumLiteral_2= 'hidden' ) )
            {
            // InternalSimpleJ.g:650:2: ( (enumLiteral_0= 'var' ) | (enumLiteral_1= 'const' ) | (enumLiteral_2= 'hidden' ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt13=1;
                }
                break;
            case 19:
                {
                alt13=2;
                }
                break;
            case 20:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalSimpleJ.g:651:3: (enumLiteral_0= 'var' )
                    {
                    // InternalSimpleJ.g:651:3: (enumLiteral_0= 'var' )
                    // InternalSimpleJ.g:652:4: enumLiteral_0= 'var'
                    {
                    enumLiteral_0=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getAccesAccess().getAccessVarEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAccesAccess().getAccessVarEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleJ.g:659:3: (enumLiteral_1= 'const' )
                    {
                    // InternalSimpleJ.g:659:3: (enumLiteral_1= 'const' )
                    // InternalSimpleJ.g:660:4: enumLiteral_1= 'const'
                    {
                    enumLiteral_1=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getAccesAccess().getAccessConstEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAccesAccess().getAccessConstEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSimpleJ.g:667:3: (enumLiteral_2= 'hidden' )
                    {
                    // InternalSimpleJ.g:667:3: (enumLiteral_2= 'hidden' )
                    // InternalSimpleJ.g:668:4: enumLiteral_2= 'hidden'
                    {
                    enumLiteral_2=(Token)match(input,20,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000001C0010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000002E002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000028002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000009020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000006000L});

}