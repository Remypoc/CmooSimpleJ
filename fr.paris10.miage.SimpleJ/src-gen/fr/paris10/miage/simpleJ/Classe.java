/**
 * generated by Xtext 2.10.0
 */
package fr.paris10.miage.simpleJ;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.paris10.miage.simpleJ.Classe#getName <em>Name</em>}</li>
 *   <li>{@link fr.paris10.miage.simpleJ.Classe#getAttributs <em>Attributs</em>}</li>
 *   <li>{@link fr.paris10.miage.simpleJ.Classe#getParent <em>Parent</em>}</li>
 *   <li>{@link fr.paris10.miage.simpleJ.Classe#getMethodes <em>Methodes</em>}</li>
 * </ul>
 *
 * @see fr.paris10.miage.simpleJ.SimpleJPackage#getClasse()
 * @model
 * @generated
 */
public interface Classe extends EObject
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
   * @see fr.paris10.miage.simpleJ.SimpleJPackage#getClasse_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.paris10.miage.simpleJ.Classe#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Attributs</b></em>' containment reference list.
   * The list contents are of type {@link fr.paris10.miage.simpleJ.Attribut}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributs</em>' containment reference list.
   * @see fr.paris10.miage.simpleJ.SimpleJPackage#getClasse_Attributs()
   * @model containment="true"
   * @generated
   */
  EList<Attribut> getAttributs();

  /**
   * Returns the value of the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' reference.
   * @see #setParent(Classe)
   * @see fr.paris10.miage.simpleJ.SimpleJPackage#getClasse_Parent()
   * @model
   * @generated
   */
  Classe getParent();

  /**
   * Sets the value of the '{@link fr.paris10.miage.simpleJ.Classe#getParent <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' reference.
   * @see #getParent()
   * @generated
   */
  void setParent(Classe value);

  /**
   * Returns the value of the '<em><b>Methodes</b></em>' containment reference list.
   * The list contents are of type {@link fr.paris10.miage.simpleJ.Methode}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methodes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methodes</em>' containment reference list.
   * @see fr.paris10.miage.simpleJ.SimpleJPackage#getClasse_Methodes()
   * @model containment="true"
   * @generated
   */
  EList<Methode> getMethodes();

} // Classe
