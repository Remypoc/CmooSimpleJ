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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'class'", "'('", "','", "')'", "':'", "'program'", "'var'", "'const'", "'hidden'"
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
    // InternalSimpleJ.g:129:1: ruleClasse returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_attributs_3_0= ruleAttribut ) ) (otherlv_4= ',' ( (lv_attributs_5_0= ruleAttribut ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? ) ;
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



        	enterRule();

        try {
            // InternalSimpleJ.g:135:2: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_attributs_3_0= ruleAttribut ) ) (otherlv_4= ',' ( (lv_attributs_5_0= ruleAttribut ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? ) )
            // InternalSimpleJ.g:136:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_attributs_3_0= ruleAttribut ) ) (otherlv_4= ',' ( (lv_attributs_5_0= ruleAttribut ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? )
            {
            // InternalSimpleJ.g:136:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_attributs_3_0= ruleAttribut ) ) (otherlv_4= ',' ( (lv_attributs_5_0= ruleAttribut ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? )
            // InternalSimpleJ.g:137:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_attributs_3_0= ruleAttribut ) ) (otherlv_4= ',' ( (lv_attributs_5_0= ruleAttribut ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )?
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

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getClasseAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSimpleJ.g:163:3: ( ( (lv_attributs_3_0= ruleAttribut ) ) (otherlv_4= ',' ( (lv_attributs_5_0= ruleAttribut ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=17 && LA4_0<=19)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSimpleJ.g:164:4: ( (lv_attributs_3_0= ruleAttribut ) ) (otherlv_4= ',' ( (lv_attributs_5_0= ruleAttribut ) ) )*
                    {
                    // InternalSimpleJ.g:164:4: ( (lv_attributs_3_0= ruleAttribut ) )
                    // InternalSimpleJ.g:165:5: (lv_attributs_3_0= ruleAttribut )
                    {
                    // InternalSimpleJ.g:165:5: (lv_attributs_3_0= ruleAttribut )
                    // InternalSimpleJ.g:166:6: lv_attributs_3_0= ruleAttribut
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
                    	    otherlv_4=(Token)match(input,13,FOLLOW_8); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getClasseAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalSimpleJ.g:188:5: ( (lv_attributs_5_0= ruleAttribut ) )
                    	    // InternalSimpleJ.g:189:6: (lv_attributs_5_0= ruleAttribut )
                    	    {
                    	    // InternalSimpleJ.g:189:6: (lv_attributs_5_0= ruleAttribut )
                    	    // InternalSimpleJ.g:190:7: lv_attributs_5_0= ruleAttribut
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
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getClasseAccess().getRightParenthesisKeyword_4());
            		
            // InternalSimpleJ.g:213:3: (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSimpleJ.g:214:4: otherlv_7= ':' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getClasseAccess().getColonKeyword_5_0());
                    			
                    // InternalSimpleJ.g:218:4: ( (otherlv_8= RULE_ID ) )
                    // InternalSimpleJ.g:219:5: (otherlv_8= RULE_ID )
                    {
                    // InternalSimpleJ.g:219:5: (otherlv_8= RULE_ID )
                    // InternalSimpleJ.g:220:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClasseRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_8, grammarAccess.getClasseAccess().getParentClasseCrossReference_5_1_0());
                    					

                    }


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
    // $ANTLR end "ruleClasse"


    // $ANTLR start "entryRuleAttribut"
    // InternalSimpleJ.g:236:1: entryRuleAttribut returns [EObject current=null] : iv_ruleAttribut= ruleAttribut EOF ;
    public final EObject entryRuleAttribut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribut = null;


        try {
            // InternalSimpleJ.g:236:49: (iv_ruleAttribut= ruleAttribut EOF )
            // InternalSimpleJ.g:237:2: iv_ruleAttribut= ruleAttribut EOF
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
    // InternalSimpleJ.g:243:1: ruleAttribut returns [EObject current=null] : ( ( (lv_acces_0_0= ruleAcces ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) ;
    public final EObject ruleAttribut() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_acces_0_0 = null;

        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalSimpleJ.g:249:2: ( ( ( (lv_acces_0_0= ruleAcces ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) )
            // InternalSimpleJ.g:250:2: ( ( (lv_acces_0_0= ruleAcces ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            {
            // InternalSimpleJ.g:250:2: ( ( (lv_acces_0_0= ruleAcces ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            // InternalSimpleJ.g:251:3: ( (lv_acces_0_0= ruleAcces ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) )
            {
            // InternalSimpleJ.g:251:3: ( (lv_acces_0_0= ruleAcces ) )
            // InternalSimpleJ.g:252:4: (lv_acces_0_0= ruleAcces )
            {
            // InternalSimpleJ.g:252:4: (lv_acces_0_0= ruleAcces )
            // InternalSimpleJ.g:253:5: lv_acces_0_0= ruleAcces
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

            // InternalSimpleJ.g:270:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSimpleJ.g:271:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSimpleJ.g:271:4: (lv_name_1_0= RULE_ID )
            // InternalSimpleJ.g:272:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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
            		
            // InternalSimpleJ.g:292:3: ( (lv_type_3_0= ruleType ) )
            // InternalSimpleJ.g:293:4: (lv_type_3_0= ruleType )
            {
            // InternalSimpleJ.g:293:4: (lv_type_3_0= ruleType )
            // InternalSimpleJ.g:294:5: lv_type_3_0= ruleType
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
    // InternalSimpleJ.g:315:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalSimpleJ.g:315:45: (iv_ruleType= ruleType EOF )
            // InternalSimpleJ.g:316:2: iv_ruleType= ruleType EOF
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
    // InternalSimpleJ.g:322:1: ruleType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSimpleJ.g:328:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSimpleJ.g:329:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSimpleJ.g:329:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSimpleJ.g:330:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSimpleJ.g:330:3: (lv_name_0_0= RULE_ID )
            // InternalSimpleJ.g:331:4: lv_name_0_0= RULE_ID
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
    // InternalSimpleJ.g:350:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalSimpleJ.g:350:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalSimpleJ.g:351:2: iv_ruleProgram= ruleProgram EOF
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
    // InternalSimpleJ.g:357:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSimpleJ.g:363:2: ( (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSimpleJ.g:364:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSimpleJ.g:364:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSimpleJ.g:365:3: otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getProgramKeyword_0());
            		
            // InternalSimpleJ.g:369:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSimpleJ.g:370:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSimpleJ.g:370:4: (lv_name_1_0= RULE_ID )
            // InternalSimpleJ.g:371:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

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


    // $ANTLR start "ruleAcces"
    // InternalSimpleJ.g:391:1: ruleAcces returns [Enumerator current=null] : ( (enumLiteral_0= 'var' ) | (enumLiteral_1= 'const' ) | (enumLiteral_2= 'hidden' ) ) ;
    public final Enumerator ruleAcces() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSimpleJ.g:397:2: ( ( (enumLiteral_0= 'var' ) | (enumLiteral_1= 'const' ) | (enumLiteral_2= 'hidden' ) ) )
            // InternalSimpleJ.g:398:2: ( (enumLiteral_0= 'var' ) | (enumLiteral_1= 'const' ) | (enumLiteral_2= 'hidden' ) )
            {
            // InternalSimpleJ.g:398:2: ( (enumLiteral_0= 'var' ) | (enumLiteral_1= 'const' ) | (enumLiteral_2= 'hidden' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt6=1;
                }
                break;
            case 18:
                {
                alt6=2;
                }
                break;
            case 19:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSimpleJ.g:399:3: (enumLiteral_0= 'var' )
                    {
                    // InternalSimpleJ.g:399:3: (enumLiteral_0= 'var' )
                    // InternalSimpleJ.g:400:4: enumLiteral_0= 'var'
                    {
                    enumLiteral_0=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getAccesAccess().getAccessVarEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAccesAccess().getAccessVarEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleJ.g:407:3: (enumLiteral_1= 'const' )
                    {
                    // InternalSimpleJ.g:407:3: (enumLiteral_1= 'const' )
                    // InternalSimpleJ.g:408:4: enumLiteral_1= 'const'
                    {
                    enumLiteral_1=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getAccesAccess().getAccessConstEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAccesAccess().getAccessConstEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSimpleJ.g:415:3: (enumLiteral_2= 'hidden' )
                    {
                    // InternalSimpleJ.g:415:3: (enumLiteral_2= 'hidden' )
                    // InternalSimpleJ.g:416:4: enumLiteral_2= 'hidden'
                    {
                    enumLiteral_2=(Token)match(input,19,FOLLOW_2); 

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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000E4000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});

}