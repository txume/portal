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

package sa.csmarc.dashboard.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link transactions}.
 * </p>
 *
 * @author Salem
 * @see transactions
 * @generated
 */
public class transactionsWrapper implements transactions,
	ModelWrapper<transactions> {
	public transactionsWrapper(transactions transactions) {
		_transactions = transactions;
	}

	@Override
	public Class<?> getModelClass() {
		return transactions.class;
	}

	@Override
	public String getModelClassName() {
		return transactions.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("type", getType());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("count", getCount());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Integer count = (Integer)attributes.get("count");

		if (count != null) {
			setCount(count);
		}
	}

	/**
	* Returns the primary key of this transactions.
	*
	* @return the primary key of this transactions
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _transactions.getPrimaryKey();
	}

	/**
	* Sets the primary key of this transactions.
	*
	* @param primaryKey the primary key of this transactions
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_transactions.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the type of this transactions.
	*
	* @return the type of this transactions
	*/
	@Override
	public java.lang.String getType() {
		return _transactions.getType();
	}

	/**
	* Sets the type of this transactions.
	*
	* @param type the type of this transactions
	*/
	@Override
	public void setType(java.lang.String type) {
		_transactions.setType(type);
	}

	/**
	* Returns the company ID of this transactions.
	*
	* @return the company ID of this transactions
	*/
	@Override
	public long getCompanyId() {
		return _transactions.getCompanyId();
	}

	/**
	* Sets the company ID of this transactions.
	*
	* @param companyId the company ID of this transactions
	*/
	@Override
	public void setCompanyId(long companyId) {
		_transactions.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this transactions.
	*
	* @return the user ID of this transactions
	*/
	@Override
	public long getUserId() {
		return _transactions.getUserId();
	}

	/**
	* Sets the user ID of this transactions.
	*
	* @param userId the user ID of this transactions
	*/
	@Override
	public void setUserId(long userId) {
		_transactions.setUserId(userId);
	}

	/**
	* Returns the user uuid of this transactions.
	*
	* @return the user uuid of this transactions
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _transactions.getUserUuid();
	}

	/**
	* Sets the user uuid of this transactions.
	*
	* @param userUuid the user uuid of this transactions
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_transactions.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this transactions.
	*
	* @return the user name of this transactions
	*/
	@Override
	public java.lang.String getUserName() {
		return _transactions.getUserName();
	}

	/**
	* Sets the user name of this transactions.
	*
	* @param userName the user name of this transactions
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_transactions.setUserName(userName);
	}

	/**
	* Returns the create date of this transactions.
	*
	* @return the create date of this transactions
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _transactions.getCreateDate();
	}

	/**
	* Sets the create date of this transactions.
	*
	* @param createDate the create date of this transactions
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_transactions.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this transactions.
	*
	* @return the modified date of this transactions
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _transactions.getModifiedDate();
	}

	/**
	* Sets the modified date of this transactions.
	*
	* @param modifiedDate the modified date of this transactions
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_transactions.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the count of this transactions.
	*
	* @return the count of this transactions
	*/
	@Override
	public int getCount() {
		return _transactions.getCount();
	}

	/**
	* Sets the count of this transactions.
	*
	* @param count the count of this transactions
	*/
	@Override
	public void setCount(int count) {
		_transactions.setCount(count);
	}

	@Override
	public boolean isNew() {
		return _transactions.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_transactions.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _transactions.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_transactions.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _transactions.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _transactions.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_transactions.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _transactions.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_transactions.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_transactions.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_transactions.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new transactionsWrapper((transactions)_transactions.clone());
	}

	@Override
	public int compareTo(sa.csmarc.dashboard.model.transactions transactions) {
		return _transactions.compareTo(transactions);
	}

	@Override
	public int hashCode() {
		return _transactions.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<sa.csmarc.dashboard.model.transactions> toCacheModel() {
		return _transactions.toCacheModel();
	}

	@Override
	public sa.csmarc.dashboard.model.transactions toEscapedModel() {
		return new transactionsWrapper(_transactions.toEscapedModel());
	}

	@Override
	public sa.csmarc.dashboard.model.transactions toUnescapedModel() {
		return new transactionsWrapper(_transactions.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _transactions.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _transactions.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_transactions.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof transactionsWrapper)) {
			return false;
		}

		transactionsWrapper transactionsWrapper = (transactionsWrapper)obj;

		if (Validator.equals(_transactions, transactionsWrapper._transactions)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public transactions getWrappedtransactions() {
		return _transactions;
	}

	@Override
	public transactions getWrappedModel() {
		return _transactions;
	}

	@Override
	public void resetOriginalValues() {
		_transactions.resetOriginalValues();
	}

	private transactions _transactions;
}