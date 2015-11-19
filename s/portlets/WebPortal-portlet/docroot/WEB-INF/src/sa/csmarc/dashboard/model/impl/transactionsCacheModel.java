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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import sa.csmarc.dashboard.model.transactions;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing transactions in entity cache.
 *
 * @author Salem
 * @see transactions
 * @generated
 */
public class transactionsCacheModel implements CacheModel<transactions>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{type=");
		sb.append(type);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", count=");
		sb.append(count);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public transactions toEntityModel() {
		transactionsImpl transactionsImpl = new transactionsImpl();

		if (type == null) {
			transactionsImpl.setType(StringPool.BLANK);
		}
		else {
			transactionsImpl.setType(type);
		}

		transactionsImpl.setCompanyId(companyId);
		transactionsImpl.setUserId(userId);

		if (userName == null) {
			transactionsImpl.setUserName(StringPool.BLANK);
		}
		else {
			transactionsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			transactionsImpl.setCreateDate(null);
		}
		else {
			transactionsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			transactionsImpl.setModifiedDate(null);
		}
		else {
			transactionsImpl.setModifiedDate(new Date(modifiedDate));
		}

		transactionsImpl.setCount(count);

		transactionsImpl.resetOriginalValues();

		return transactionsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		type = objectInput.readUTF();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		count = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (type == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(type);
		}

		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeInt(count);
	}

	public String type;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public int count;
}