/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package sa.csmarc.dashboard.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import sa.csmarc.dashboard.model.transactions;

import java.util.List;

/**
 * The persistence utility for the transactions service. This utility wraps {@link transactionsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Salem
 * @see transactionsPersistence
 * @see transactionsPersistenceImpl
 * @generated
 */
public class transactionsUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(transactions transactions) {
		getPersistence().clearCache(transactions);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<transactions> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<transactions> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<transactions> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static transactions update(transactions transactions)
		throws SystemException {
		return getPersistence().update(transactions);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static transactions update(transactions transactions,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(transactions, serviceContext);
	}

	/**
	* Caches the transactions in the entity cache if it is enabled.
	*
	* @param transactions the transactions
	*/
	public static void cacheResult(
		sa.csmarc.dashboard.model.transactions transactions) {
		getPersistence().cacheResult(transactions);
	}

	/**
	* Caches the transactionses in the entity cache if it is enabled.
	*
	* @param transactionses the transactionses
	*/
	public static void cacheResult(
		java.util.List<sa.csmarc.dashboard.model.transactions> transactionses) {
		getPersistence().cacheResult(transactionses);
	}

	/**
	* Creates a new transactions with the primary key. Does not add the transactions to the database.
	*
	* @param type the primary key for the new transactions
	* @return the new transactions
	*/
	public static sa.csmarc.dashboard.model.transactions create(
		java.lang.String type) {
		return getPersistence().create(type);
	}

	/**
	* Removes the transactions with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param type the primary key of the transactions
	* @return the transactions that was removed
	* @throws sa.csmarc.dashboard.NoSuchtransactionsException if a transactions with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static sa.csmarc.dashboard.model.transactions remove(
		java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException,
			sa.csmarc.dashboard.NoSuchtransactionsException {
		return getPersistence().remove(type);
	}

	public static sa.csmarc.dashboard.model.transactions updateImpl(
		sa.csmarc.dashboard.model.transactions transactions)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(transactions);
	}

	/**
	* Returns the transactions with the primary key or throws a {@link sa.csmarc.dashboard.NoSuchtransactionsException} if it could not be found.
	*
	* @param type the primary key of the transactions
	* @return the transactions
	* @throws sa.csmarc.dashboard.NoSuchtransactionsException if a transactions with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static sa.csmarc.dashboard.model.transactions findByPrimaryKey(
		java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException,
			sa.csmarc.dashboard.NoSuchtransactionsException {
		return getPersistence().findByPrimaryKey(type);
	}

	/**
	* Returns the transactions with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param type the primary key of the transactions
	* @return the transactions, or <code>null</code> if a transactions with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static sa.csmarc.dashboard.model.transactions fetchByPrimaryKey(
		java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(type);
	}

	/**
	* Returns all the transactionses.
	*
	* @return the transactionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<sa.csmarc.dashboard.model.transactions> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the transactionses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sa.csmarc.dashboard.model.impl.transactionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of transactionses
	* @param end the upper bound of the range of transactionses (not inclusive)
	* @return the range of transactionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<sa.csmarc.dashboard.model.transactions> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the transactionses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sa.csmarc.dashboard.model.impl.transactionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of transactionses
	* @param end the upper bound of the range of transactionses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of transactionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<sa.csmarc.dashboard.model.transactions> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the transactionses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of transactionses.
	*
	* @return the number of transactionses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static transactionsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (transactionsPersistence)PortletBeanLocatorUtil.locate(sa.csmarc.dashboard.service.ClpSerializer.getServletContextName(),
					transactionsPersistence.class.getName());

			ReferenceRegistry.registerReference(transactionsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(transactionsPersistence persistence) {
	}

	private static transactionsPersistence _persistence;
}