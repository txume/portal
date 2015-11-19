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

package sa.csmarc.dashboard.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link transactionsLocalService}.
 *
 * @author Salem
 * @see transactionsLocalService
 * @generated
 */
public class transactionsLocalServiceWrapper implements transactionsLocalService,
	ServiceWrapper<transactionsLocalService> {
	public transactionsLocalServiceWrapper(
		transactionsLocalService transactionsLocalService) {
		_transactionsLocalService = transactionsLocalService;
	}

	/**
	* Adds the transactions to the database. Also notifies the appropriate model listeners.
	*
	* @param transactions the transactions
	* @return the transactions that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public sa.csmarc.dashboard.model.transactions addtransactions(
		sa.csmarc.dashboard.model.transactions transactions)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _transactionsLocalService.addtransactions(transactions);
	}

	/**
	* Creates a new transactions with the primary key. Does not add the transactions to the database.
	*
	* @param type the primary key for the new transactions
	* @return the new transactions
	*/
	@Override
	public sa.csmarc.dashboard.model.transactions createtransactions(
		java.lang.String type) {
		return _transactionsLocalService.createtransactions(type);
	}

	/**
	* Deletes the transactions with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param type the primary key of the transactions
	* @return the transactions that was removed
	* @throws PortalException if a transactions with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public sa.csmarc.dashboard.model.transactions deletetransactions(
		java.lang.String type)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _transactionsLocalService.deletetransactions(type);
	}

	/**
	* Deletes the transactions from the database. Also notifies the appropriate model listeners.
	*
	* @param transactions the transactions
	* @return the transactions that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public sa.csmarc.dashboard.model.transactions deletetransactions(
		sa.csmarc.dashboard.model.transactions transactions)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _transactionsLocalService.deletetransactions(transactions);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _transactionsLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _transactionsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sa.csmarc.dashboard.model.impl.transactionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _transactionsLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sa.csmarc.dashboard.model.impl.transactionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _transactionsLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _transactionsLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _transactionsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public sa.csmarc.dashboard.model.transactions fetchtransactions(
		java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _transactionsLocalService.fetchtransactions(type);
	}

	/**
	* Returns the transactions with the primary key.
	*
	* @param type the primary key of the transactions
	* @return the transactions
	* @throws PortalException if a transactions with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public sa.csmarc.dashboard.model.transactions gettransactions(
		java.lang.String type)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _transactionsLocalService.gettransactions(type);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _transactionsLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<sa.csmarc.dashboard.model.transactions> gettransactionses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _transactionsLocalService.gettransactionses(start, end);
	}

	/**
	* Returns the number of transactionses.
	*
	* @return the number of transactionses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int gettransactionsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _transactionsLocalService.gettransactionsesCount();
	}

	/**
	* Updates the transactions in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param transactions the transactions
	* @return the transactions that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public sa.csmarc.dashboard.model.transactions updatetransactions(
		sa.csmarc.dashboard.model.transactions transactions)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _transactionsLocalService.updatetransactions(transactions);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _transactionsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_transactionsLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _transactionsLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public transactionsLocalService getWrappedtransactionsLocalService() {
		return _transactionsLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedtransactionsLocalService(
		transactionsLocalService transactionsLocalService) {
		_transactionsLocalService = transactionsLocalService;
	}

	@Override
	public transactionsLocalService getWrappedService() {
		return _transactionsLocalService;
	}

	@Override
	public void setWrappedService(
		transactionsLocalService transactionsLocalService) {
		_transactionsLocalService = transactionsLocalService;
	}

	private transactionsLocalService _transactionsLocalService;
}