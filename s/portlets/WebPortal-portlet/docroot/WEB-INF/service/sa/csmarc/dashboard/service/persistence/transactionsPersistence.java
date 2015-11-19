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

import com.liferay.portal.service.persistence.BasePersistence;

import sa.csmarc.dashboard.model.transactions;

/**
 * The persistence interface for the transactions service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Salem
 * @see transactionsPersistenceImpl
 * @see transactionsUtil
 * @generated
 */
public interface transactionsPersistence extends BasePersistence<transactions> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link transactionsUtil} to access the transactions persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the transactions in the entity cache if it is enabled.
	*
	* @param transactions the transactions
	*/
	public void cacheResult(sa.csmarc.dashboard.model.transactions transactions);

	/**
	* Caches the transactionses in the entity cache if it is enabled.
	*
	* @param transactionses the transactionses
	*/
	public void cacheResult(
		java.util.List<sa.csmarc.dashboard.model.transactions> transactionses);

	/**
	* Creates a new transactions with the primary key. Does not add the transactions to the database.
	*
	* @param type the primary key for the new transactions
	* @return the new transactions
	*/
	public sa.csmarc.dashboard.model.transactions create(java.lang.String type);

	/**
	* Removes the transactions with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param type the primary key of the transactions
	* @return the transactions that was removed
	* @throws sa.csmarc.dashboard.NoSuchtransactionsException if a transactions with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public sa.csmarc.dashboard.model.transactions remove(java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException,
			sa.csmarc.dashboard.NoSuchtransactionsException;

	public sa.csmarc.dashboard.model.transactions updateImpl(
		sa.csmarc.dashboard.model.transactions transactions)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the transactions with the primary key or throws a {@link sa.csmarc.dashboard.NoSuchtransactionsException} if it could not be found.
	*
	* @param type the primary key of the transactions
	* @return the transactions
	* @throws sa.csmarc.dashboard.NoSuchtransactionsException if a transactions with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public sa.csmarc.dashboard.model.transactions findByPrimaryKey(
		java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException,
			sa.csmarc.dashboard.NoSuchtransactionsException;

	/**
	* Returns the transactions with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param type the primary key of the transactions
	* @return the transactions, or <code>null</code> if a transactions with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public sa.csmarc.dashboard.model.transactions fetchByPrimaryKey(
		java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the transactionses.
	*
	* @return the transactionses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<sa.csmarc.dashboard.model.transactions> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<sa.csmarc.dashboard.model.transactions> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<sa.csmarc.dashboard.model.transactions> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the transactionses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of transactionses.
	*
	* @return the number of transactionses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}