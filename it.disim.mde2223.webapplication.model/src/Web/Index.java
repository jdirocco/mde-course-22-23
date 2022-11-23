/**
 */
package Web;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Web.Index#getIndexAttribute <em>Index Attribute</em>}</li>
 * </ul>
 *
 * @see Web.WebPackage#getIndex()
 * @model
 * @generated
 */
public interface Index extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Index Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Attribute</em>' reference.
	 * @see #setIndexAttribute(Attribute)
	 * @see Web.WebPackage#getIndex_IndexAttribute()
	 * @model required="true"
	 * @generated
	 */
	Attribute getIndexAttribute();

	/**
	 * Sets the value of the '{@link Web.Index#getIndexAttribute <em>Index Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Attribute</em>' reference.
	 * @see #getIndexAttribute()
	 * @generated
	 */
	void setIndexAttribute(Attribute value);

} // Index
