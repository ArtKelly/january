/**
 * generated by Xtext 2.10.0
 */
package org.eclipse.january.geometry.xtext.iGES.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.january.geometry.xtext.iGES.End;
import org.eclipse.january.geometry.xtext.iGES.IGESPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.january.geometry.xtext.iGES.impl.EndImpl#getSval <em>Sval</em>}</li>
 *   <li>{@link org.eclipse.january.geometry.xtext.iGES.impl.EndImpl#getGval <em>Gval</em>}</li>
 *   <li>{@link org.eclipse.january.geometry.xtext.iGES.impl.EndImpl#getDval <em>Dval</em>}</li>
 *   <li>{@link org.eclipse.january.geometry.xtext.iGES.impl.EndImpl#getPval <em>Pval</em>}</li>
 *   <li>{@link org.eclipse.january.geometry.xtext.iGES.impl.EndImpl#getTval <em>Tval</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EndImpl extends MinimalEObjectImpl.Container implements End
{
  /**
   * The default value of the '{@link #getSval() <em>Sval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSval()
   * @generated
   * @ordered
   */
  protected static final int SVAL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSval() <em>Sval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSval()
   * @generated
   * @ordered
   */
  protected int sval = SVAL_EDEFAULT;

  /**
   * The default value of the '{@link #getGval() <em>Gval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGval()
   * @generated
   * @ordered
   */
  protected static final int GVAL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getGval() <em>Gval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGval()
   * @generated
   * @ordered
   */
  protected int gval = GVAL_EDEFAULT;

  /**
   * The default value of the '{@link #getDval() <em>Dval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDval()
   * @generated
   * @ordered
   */
  protected static final int DVAL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDval() <em>Dval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDval()
   * @generated
   * @ordered
   */
  protected int dval = DVAL_EDEFAULT;

  /**
   * The default value of the '{@link #getPval() <em>Pval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPval()
   * @generated
   * @ordered
   */
  protected static final int PVAL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPval() <em>Pval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPval()
   * @generated
   * @ordered
   */
  protected int pval = PVAL_EDEFAULT;

  /**
   * The default value of the '{@link #getTval() <em>Tval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTval()
   * @generated
   * @ordered
   */
  protected static final int TVAL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTval() <em>Tval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTval()
   * @generated
   * @ordered
   */
  protected int tval = TVAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EndImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return IGESPackage.Literals.END;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSval()
  {
    return sval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSval(int newSval)
  {
    int oldSval = sval;
    sval = newSval;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IGESPackage.END__SVAL, oldSval, sval));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getGval()
  {
    return gval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGval(int newGval)
  {
    int oldGval = gval;
    gval = newGval;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IGESPackage.END__GVAL, oldGval, gval));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDval()
  {
    return dval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDval(int newDval)
  {
    int oldDval = dval;
    dval = newDval;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IGESPackage.END__DVAL, oldDval, dval));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPval()
  {
    return pval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPval(int newPval)
  {
    int oldPval = pval;
    pval = newPval;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IGESPackage.END__PVAL, oldPval, pval));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getTval()
  {
    return tval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTval(int newTval)
  {
    int oldTval = tval;
    tval = newTval;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IGESPackage.END__TVAL, oldTval, tval));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case IGESPackage.END__SVAL:
        return getSval();
      case IGESPackage.END__GVAL:
        return getGval();
      case IGESPackage.END__DVAL:
        return getDval();
      case IGESPackage.END__PVAL:
        return getPval();
      case IGESPackage.END__TVAL:
        return getTval();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case IGESPackage.END__SVAL:
        setSval((Integer)newValue);
        return;
      case IGESPackage.END__GVAL:
        setGval((Integer)newValue);
        return;
      case IGESPackage.END__DVAL:
        setDval((Integer)newValue);
        return;
      case IGESPackage.END__PVAL:
        setPval((Integer)newValue);
        return;
      case IGESPackage.END__TVAL:
        setTval((Integer)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case IGESPackage.END__SVAL:
        setSval(SVAL_EDEFAULT);
        return;
      case IGESPackage.END__GVAL:
        setGval(GVAL_EDEFAULT);
        return;
      case IGESPackage.END__DVAL:
        setDval(DVAL_EDEFAULT);
        return;
      case IGESPackage.END__PVAL:
        setPval(PVAL_EDEFAULT);
        return;
      case IGESPackage.END__TVAL:
        setTval(TVAL_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case IGESPackage.END__SVAL:
        return sval != SVAL_EDEFAULT;
      case IGESPackage.END__GVAL:
        return gval != GVAL_EDEFAULT;
      case IGESPackage.END__DVAL:
        return dval != DVAL_EDEFAULT;
      case IGESPackage.END__PVAL:
        return pval != PVAL_EDEFAULT;
      case IGESPackage.END__TVAL:
        return tval != TVAL_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (sval: ");
    result.append(sval);
    result.append(", gval: ");
    result.append(gval);
    result.append(", dval: ");
    result.append(dval);
    result.append(", pval: ");
    result.append(pval);
    result.append(", tval: ");
    result.append(tval);
    result.append(')');
    return result.toString();
  }

} //EndImpl