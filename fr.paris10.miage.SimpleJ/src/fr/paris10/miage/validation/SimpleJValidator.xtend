/*
 * generated by Xtext 2.10.0
 */
package fr.paris10.miage.validation

import org.eclipse.xtext.validation.Check
import fr.paris10.miage.simpleJ.Classe
import fr.paris10.miage.simpleJ.SimpleJPackage
import fr.paris10.miage.simpleJ.Attribut

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class SimpleJValidator extends AbstractSimpleJValidator {
	
//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					SimpleJPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
	
	public static val ERROR_NAME = "invalidName"
	
	@Check(FAST)
	def checkClassStartWithUpper(Classe classe) {
		if(!Character.isUpperCase(classe.name.charAt(0))) {
			warning("Le nom d'une classe doit commencer par une majuscule !", SimpleJPackage.Literals.CLASSE__NAME , ERROR_NAME)
		}
	}
	
	@Check(FAST)
	def checkClassStartWithUpper(Attribut attribut) {
		if(Character.isUpperCase(attribut.name.charAt(0))) {
			warning("Le nom d'un attribut doit commencer par une minuscule !", SimpleJPackage.Literals.ATTRIBUT__NAME , ERROR_NAME)
		}
	}
}