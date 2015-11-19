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

package sa.csmarc.dashboard.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import sa.csmarc.dashboard.service.transactionsLocalServiceUtil;
import sa.csmarc.dashboard.service.base.transactionsLocalServiceBaseImpl;

/**
 * The implementation of the transactions local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link sa.csmarc.dashboard.service.transactionsLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Salem
 * @see sa.csmarc.dashboard.service.base.transactionsLocalServiceBaseImpl
 * @see sa.csmarc.dashboard.service.transactionsLocalServiceUtil
 */
public class transactionsLocalServiceImpl
	extends transactionsLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link sa.csmarc.dashboard.service.transactionsLocalServiceUtil} to access the transactions local service.
	 */
	
	
	public int[] getTransactions() throws PortalException, SystemException
	{

		
		int [] transactionsCount = {0,0,0,0};
		transactionsCount[0] = transactionsLocalServiceUtil.gettransactions("RT").getCount();
		transactionsCount[1] = transactionsLocalServiceUtil.gettransactions("LL").getCount();
		transactionsCount[2] = transactionsLocalServiceUtil.gettransactions("AD").getCount();
		transactionsCount[3] = transactionsLocalServiceUtil.gettransactions("HM").getCount();
		
		return transactionsCount;
	}
}