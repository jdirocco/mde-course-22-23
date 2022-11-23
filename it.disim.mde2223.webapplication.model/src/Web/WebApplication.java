/**
 */
package Web;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Web.WebApplication#getEntities <em>Entities</em>}</li>
 *   <li>{@link Web.WebApplication#getIndexes <em>Indexes</em>}</li>
 * </ul>
 *
 * @see Web.WebPackage#getWebApplication()
 * @model
 * @generated
 */
public interface WebApplication extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link Web.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see Web.WebPackage#getWebApplication_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * Returns the value of the '<em><b>Indexes</b></em>' containment reference list.
	 * The list contents are of type {@link Web.Index}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indexes</em>' containment reference list.
	 * @see Web.WebPackage#getWebApplication_Indexes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Index> getIndexes();

} // WebApplication
