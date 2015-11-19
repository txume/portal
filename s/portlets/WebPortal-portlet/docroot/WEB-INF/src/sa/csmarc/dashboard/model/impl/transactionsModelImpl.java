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

package sa.csmarc.dashboard.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import sa.csmarc.dashboard.model.transactions;
import sa.csmarc.dashboard.model.transactionsModel;
import sa.csmarc.dashboard.model.transactionsSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the transactions service. Represents a row in the &quot;dashboard_transactions&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link sa.csmarc.dashboard.model.transactionsModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link transactionsImpl}.
 * </p>
 *
 * @author Salem
 * @see transactionsImpl
 * @see sa.csmarc.dashboard.model.transactions
 * @see sa.csmarc.dashboard.model.transactionsModel
 * @generated
 */
@JSON(strict = true)
public class transactionsModelImpl extends BaseModelImpl<transactions>
	implements transactionsModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a transactions model instance should use the {@link sa.csmarc.dashboard.model.transactions} interface instead.
	 */
	public static final String TABLE_NAME = "dashboard_transactions";
	public static final Object[][] TABLE_COLUMNS = {
			{ "type_", Types.VARCHAR },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "count", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table dashboard_transactions (type_ VARCHAR(75) not null primary key,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,count INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table dashboard_transactions";
	public static final String ORDER_BY_JPQL = " ORDER BY transactions.type ASC";
	public static final String ORDER_BY_SQL = " ORDER BY dashboard_transactions.type_ ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.sa.csmarc.dashboard.model.transactions"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.sa.csmarc.dashboard.model.transactions"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static transactions toModel(transactionsSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		transactions model = new transactionsImpl();

		model.setType(soapModel.getType());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setCount(soapModel.getCount());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<transactions> toModels(transactionsSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<transactions> models = new ArrayList<transactions>(soapModels.length);

		for (transactionsSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.sa.csmarc.dashboard.model.transactions"));

	public transactionsModelImpl() {
	}

	@Override
	public String getPrimaryKey() {
		return _type;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setType(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _type;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
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

	@JSON
	@Override
	public String getType() {
		if (_type == null) {
			return StringPool.BLANK;
		}
		else {
			return _type;
		}
	}

	@Override
	public void setType(String type) {
		_type = type;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public int getCount() {
		return _count;
	}

	@Override
	public void setCount(int count) {
		_count = count;
	}

	@Override
	public transactions toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (transactions)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		transactionsImpl transactionsImpl = new transactionsImpl();

		transactionsImpl.setType(getType());
		transactionsImpl.setCompanyId(getCompanyId());
		transactionsImpl.setUserId(getUserId());
		transactionsImpl.setUserName(getUserName());
		transactionsImpl.setCreateDate(getCreateDate());
		transactionsImpl.setModifiedDate(getModifiedDate());
		transactionsImpl.setCount(getCount());

		transactionsImpl.resetOriginalValues();

		return transactionsImpl;
	}

	@Override
	public int compareTo(transactions transactions) {
		int value = 0;

		value = getType().compareTo(transactions.getType());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof transactions)) {
			return false;
		}

		transactions transactions = (transactions)obj;

		String primaryKey = transactions.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<transactions> toCacheModel() {
		transactionsCacheModel transactionsCacheModel = new transactionsCacheModel();

		transactionsCacheModel.type = getType();

		String type = transactionsCacheModel.type;

		if ((type != null) && (type.length() == 0)) {
			transactionsCacheModel.type = null;
		}

		transactionsCacheModel.companyId = getCompanyId();

		transactionsCacheModel.userId = getUserId();

		transactionsCacheModel.userName = getUserName();

		String userName = transactionsCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			transactionsCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			transactionsCacheModel.createDate = createDate.getTime();
		}
		else {
			transactionsCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			transactionsCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			transactionsCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		transactionsCacheModel.count = getCount();

		return transactionsCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{type=");
		sb.append(getType());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", count=");
		sb.append(getCount());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("sa.csmarc.dashboard.model.transactions");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>type</column-name><column-value><![CDATA[");
		sb.append(getType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>count</column-name><column-value><![CDATA[");
		sb.append(getCount());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = transactions.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			transactions.class
		};
	private String _type;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private int _count;
	private transactions _escapedModel;
}