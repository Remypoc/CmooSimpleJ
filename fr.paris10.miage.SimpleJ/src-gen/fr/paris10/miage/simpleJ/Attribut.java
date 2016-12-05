/**
 * generated by Xtext 2.10.0
 */
package fr.paris10.miage.simpleJ;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribut</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.paris10.miage.simpleJ.Attribut#getAcces <em>Acces</em>}</li>
 *   <li>{@link fr.paris10.miage.simpleJ.Attribut#getName <em>Name</em>}</li>
 *   <li>{@link fr.paris10.miage.simpleJ.Attribut#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see fr.paris10.miage.simpleJ.SimpleJPackage#getAttribut()
 * @model
 * @generated
 */
public interface Attribut extends EObject
{
  /**
   * Returns the value of the '<em><b>Acces</b></em>' attribute.
   * The literals are from the enumeration {@link fr.paris10.miage.simpleJ.Acces}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Acces</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Acces</em>' attribute.
   * @see fr.paris10.miage.simpleJ.Acces
   * @see #setAcces(Acces)
   * @see fr.paris10.miage.simpleJ.SimpleJPackage#getAttribut_Acces()
   * @model
   * @generated
   */
  Acces getAcces();

  /**
   * Sets the value of the '{@link fr.paris10.miage.simpleJ.Attribut#getAcces <em>Acces</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Acces</em>' attribute.
   * @see fr.paris10.miage.simpleJ.Acces
   * @see #getAcces()
   * @generated
   */
  void setAcces(Acces value);

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
   * @see fr.paris10.miage.simpleJ.SimpleJPackage#getAttribut_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.paris10.miage.simpleJ.Attribut#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type)
   * @see fr.paris10.miage.simpleJ.SimpleJPackage#getAttribut_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link fr.paris10.miage.simpleJ.Attribut#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

} // Attribut