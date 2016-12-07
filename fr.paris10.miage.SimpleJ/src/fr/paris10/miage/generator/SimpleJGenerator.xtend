/*
 * generated by Xtext 2.10.0
 */
package fr.paris10.miage.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import fr.paris10.miage.simpleJ.Classe
import fr.paris10.miage.simpleJ.Attribut
import fr.paris10.miage.simpleJ.Acces
import fr.paris10.miage.simpleJ.Program
import fr.paris10.miage.simpleJ.Delegation

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
 
class SimpleJGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(typeof(Greeting))
//				.map[name]
//				.join(', '))
		val programs = resource.allContents.filter(typeof(Program)).toSet
		for (Program program : programs) {
			fsa.generateFile(program.name + ".java", genererMain(program.name, program.contenu))
		}

		val classes = resource.allContents.filter(typeof(Classe)).toSet
		for (Classe classe : classes) {
			fsa.generateFile(classe.name + ".java",
				genererJava(classe.name, genererAttributs(resource, classe), classe, genererMethode(classe)))
		}
	}

	// Template de nos pages html
	def genererJava(String nom, String attributs, Classe classe, String methodes) '''
		public class �nom� �genererHeritage(classe)�{
			
			�attributs�
			�methodes�
		}
	'''

	def genererAttributs(Resource resource, Classe classe) {
		return '''
			�FOR attribut : classe.attributs�
				private �attribut.type.name� �attribut.name�; //�attribut.acces�
			�ENDFOR�
			
			�genererConstructeur(classe)�
			�FOR attribut : classe.attributs�
				�genererGetterSetter(attribut)�
			�ENDFOR�
		'''
	}
	
	/*
	 * public �classe.name�(�FOR attribut : classe.attributs SEPARATOR', '��ENDFOR�) {
	 * 
	 * �FOR attribut : classe.attributs� this.�attribut.name� = �attribut.name�; �ENDFOR�
	 * 
	 * ���classe.attributs.map[type.name + " " + name].join(', ') 
	 * ���genererConstructeurParent(classe)�
	 */
	def genererConstructeur(Classe classe) '''
		public �classe.name�() {
		}''' 
			
	
	def genererConstructeurParent(Classe classe)
		'''�IF classe.parent != null�super(�classe.parent.attributs.map[name].join(', ')�)�ENDIF�'''

	/*
	 * public �classe.name�(�FOR attribut : classe.attributs��attribut.type.name� �attribut.name�, �ENDFOR�) {
	 * 		�FOR attribut : classe.attributs�
	 * 			this.�attribut.name� = �attribut.name�;
	 * 		�ENDFOR�
	 * 	}
	 * 
	 * 
	 */
	def genererGetterSetter(Attribut attribut) '''
		�IF attribut.acces == Acces.ACCESS_VAR�
			�genererGetter(attribut)�
			
			�genererSetter(attribut)�
		�ELSEIF attribut.acces == Acces.ACCESS_CONST�
			�genererGetter(attribut)�
		�ENDIF�
	'''

	def genererGetter(Attribut attribut) '''
		
		public �attribut.type.name� get�attribut.name.toFirstUpper()�() {
			return �attribut.name�;
		}
	'''

	def genererSetter(Attribut attribut) '''
		public void set�attribut.name.toFirstUpper()�(�attribut.type.name� �attribut.name�) {
			this.�attribut.name� = �attribut.name�;
		}
	'''

	def genererHeritage(Classe classe) '''
		�IF classe.parent != null�extends �classe.parent.name� �ENDIF�'''

	def genererMain(String titre, String contenu) '''
	public class �titre� {
		
		public static void main() {
			�contenu�
		}
	}
	'''
	
	def genererMethode(Classe classe) {
		return '''
		
		�FOR methode : classe.methodes�
			public �IF methode.type != null��methode.type.name��ELSE�void�ENDIF� �methode.name�(�methode.attributs.map[type.name + " " + name].join(', ')�) {
				�methode.contenu�
			}
				
		�ENDFOR�
		'''
	}
}
