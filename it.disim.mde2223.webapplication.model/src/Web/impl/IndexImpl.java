/**
 */
package Web.impl;

import Web.Attribute;
import Web.Index;
import Web.WebPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Index</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Web.impl.IndexImpl#getIndexAttribute <em>Index Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndexImpl extends NamedElementImpl implements Index {
	/**
	 * The cached value of the '{@link #getIndexAttribute() <em>Index Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute indexAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebPackage.Literals.INDEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getIndexAttribute() {
		if (indexAttribute != null && indexAttribute.eIsProxy()) {
			InternalEObject oldIndexAttribute = (InternalEObject)indexAttribute;
			indexAttribute = (Attribute)eResolveProxy(oldIndexAttribute);
			if (indexAttribute != oldIndexAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebPackage.INDEX__INDEX_ATTRIBUTE, oldIndexAttribute, indexAttribute));
			}
		}
		return indexAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetIndexAttribute() {
		return indexAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexAttribute(Attribute newIndexAttribute) {
		Attribute oldIndexAttribute = indexAttribute;
		indexAttribute = newIndexAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebPackage.INDEX__INDEX_ATTRIBUTE, oldIndexAttribute, indexAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebPackage.INDEX__INDEX_ATTRIBUTE:
				if (resolve) return getIndexAttribute();
				return basicGetIndexAttribute();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WebPackage.INDEX__INDEX_ATTRIBUTE:
				setIndexAttribute((Attribute)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WebPackage.INDEX__INDEX_ATTRIBUTE:
				setIndexAttribute((Attribute)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WebPackage.INDEX__INDEX_ATTRIBUTE:
				return indexAttribute != null;
		}
		return super.eIsSet(featureID);
	}

} //IndexImpl
