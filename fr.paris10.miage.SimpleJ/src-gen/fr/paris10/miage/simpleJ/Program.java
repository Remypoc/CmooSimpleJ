/**
 * generated by Xtext 2.10.0
 */
package fr.paris10.miage.simpleJ;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.paris10.miage.simpleJ.Program#getName <em>Name</em>}</li>
 *   <li>{@link fr.paris10.miage.simpleJ.Program#getContenu <em>Contenu</em>}</li>
 * </ul>
 *
 * @see fr.paris10.miage.simpleJ.SimpleJPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.paris10.miage.simpleJ.SimpleJPackage#getProgram_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.paris10.miage.simpleJ.Program#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Contenu</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contenu</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contenu</em>' attribute.
   * @see #setContenu(String)
   * @see fr.paris10.miage.simpleJ.SimpleJPackage#getProgram_Contenu()
   * @model
   * @generated
   */
  String getContenu();

  /**
   * Sets the value of the '{@link fr.paris10.miage.simpleJ.Program#getContenu <em>Contenu</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contenu</em>' attribute.
   * @see #getContenu()
   * @generated
   */
  void setContenu(String value);

} // Program
