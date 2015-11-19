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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import sa.csmarc.dashboard.NoSuchtransactionsException;
import sa.csmarc.dashboard.model.impl.transactionsImpl;
import sa.csmarc.dashboard.model.impl.transactionsModelImpl;
import sa.csmarc.dashboard.model.transactions;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the transactions service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Salem
 * @see transactionsPersistence
 * @see transactionsUtil
 * @generated
 */
public class transactionsPersistenceImpl extends BasePersistenceImpl<transactions>
	implements transactionsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link transactionsUtil} to access the transactions persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = transactionsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(transactionsModelImpl.ENTITY_CACHE_ENABLED,
			transactionsModelImpl.FINDER_CACHE_ENABLED, transactionsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(transactionsModelImpl.ENTITY_CACHE_ENABLED,
			transactionsModelImpl.FINDER_CACHE_ENABLED, transactionsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(transactionsModelImpl.ENTITY_CACHE_ENABLED,
			transactionsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public transactionsPersistenceImpl() {
		setModelClass(transactions.class);
	}

	/**
	 * Caches the transactions in the entity cache if it is enabled.
	 *
	 * @param transactions the transactions
	 */
	@Override
	public void cacheResult(transactions transactions) {
		EntityCacheUtil.putResult(transactionsModelImpl.ENTITY_CACHE_ENABLED,
			transactionsImpl.class, transactions.getPrimaryKey(), transactions);

		transactions.resetOriginalValues();
	}

	/**
	 * Caches the transactionses in the entity cache if it is enabled.
	 *
	 * @param transactionses the transactionses
	 */
	@Override
	public void cacheResult(List<transactions> transactionses) {
		for (transactions transactions : transactionses) {
			if (EntityCacheUtil.getResult(
						transactionsModelImpl.ENTITY_CACHE_ENABLED,
						transactionsImpl.class, transactions.getPrimaryKey()) == null) {
				cacheResult(transactions);
			}
			else {
				transactions.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all transactionses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(transactionsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(transactionsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the transactions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(transactions transactions) {
		EntityCacheUtil.removeResult(transactionsModelImpl.ENTITY_CACHE_ENABLED,
			transactionsImpl.class, transactions.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<transactions> transactionses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (transactions transactions : transactionses) {
			EntityCacheUtil.removeResult(transactionsModelImpl.ENTITY_CACHE_ENABLED,
				transactionsImpl.class, transactions.getPrimaryKey());
		}
	}

	/**
	 * Creates a new transactions with the primary key. Does not add the transactions to the database.
	 *
	 * @param type the primary key for the new transactions
	 * @return the new transactions
	 */
	@Override
	public transactions create(String type) {
		transactions transactions = new transactionsImpl();

		transactions.setNew(true);
		transactions.setPrimaryKey(type);

		return transactions;
	}

	/**
	 * Removes the transactions with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param type the primary key of the transactions
	 * @return the transactions that was removed
	 * @throws sa.csmarc.dashboard.NoSuchtransactionsException if a transactions with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public transactions remove(String type)
		throws NoSuchtransactionsException, SystemException {
		return remove((Serializable)type);
	}

	/**
	 * Removes the transactions with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the transactions
	 * @return the transactions that was removed
	 * @throws sa.csmarc.dashboard.NoSuchtransactionsException if a transactions with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public transactions remove(Serializable primaryKey)
		throws NoSuchtransactionsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			transactions transactions = (transactions)session.get(transactionsImpl.class,
					primaryKey);

			if (transactions == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchtransactionsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(transactions);
		}
		catch (NoSuchtransactionsException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected transactions removeImpl(transactions transactions)
		throws SystemException {
		transactions = toUnwrappedModel(transactions);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(transactions)) {
				transactions = (transactions)session.get(transactionsImpl.class,
						transactions.getPrimaryKeyObj());
			}

			if (transactions != null) {
				session.delete(transactions);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (transactions != null) {
			clearCache(transactions);
		}

		return transactions;
	}

	@Override
	public transactions updateImpl(
		sa.csmarc.dashboard.model.transactions transactions)
		throws SystemException {
		transactions = toUnwrappedModel(transactions);

		boolean isNew = transactions.isNew();

		Session session = null;

		try {
			session = openSession();

			if (transactions.isNew()) {
				session.save(transactions);

				transactions.setNew(false);
			}
			else {
				session.merge(transactions);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(transactionsModelImpl.ENTITY_CACHE_ENABLED,
			transactionsImpl.class, transactions.getPrimaryKey(), transactions);

		return transactions;
	}

	protected transactions toUnwrappedModel(transactions transactions) {
		if (transactions instanceof transactionsImpl) {
			return transactions;
		}

		transactionsImpl transactionsImpl = new transactionsImpl();

		transactionsImpl.setNew(transactions.isNew());
		transactionsImpl.setPrimaryKey(transactions.getPrimaryKey());

		transactionsImpl.setType(transactions.getType());
		transactionsImpl.setCompanyId(transactions.getCompanyId());
		transactionsImpl.setUserId(transactions.getUserId());
		transactionsImpl.setUserName(transactions.getUserName());
		transactionsImpl.setCreateDate(transactions.getCreateDate());
		transactionsImpl.setModifiedDate(transactions.getModifiedDate());
		transactionsImpl.setCount(transactions.getCount());

		return transactionsImpl;
	}

	/**
	 * Returns the transactions with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the transactions
	 * @return the transactions
	 * @throws sa.csmarc.dashboard.NoSuchtransactionsException if a transactions with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public transactions findByPrimaryKey(Serializable primaryKey)
		throws NoSuchtransactionsException, SystemException {
		transactions transactions = fetchByPrimaryKey(primaryKey);

		if (transactions == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchtransactionsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return transactions;
	}

	/**
	 * Returns the transactions with the primary key or throws a {@link sa.csmarc.dashboard.NoSuchtransactionsException} if it could not be found.
	 *
	 * @param type the primary key of the transactions
	 * @return the transactions
	 * @throws sa.csmarc.dashboard.NoSuchtransactionsException if a transactions with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public transactions findByPrimaryKey(String type)
		throws NoSuchtransactionsException, SystemException {
		return findByPrimaryKey((Serializable)type);
	}

	/**
	 * Returns the transactions with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the transactions
	 * @return the transactions, or <code>null</code> if a transactions with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public transactions fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		transactions transactions = (transactions)EntityCacheUtil.getResult(transactionsModelImpl.ENTITY_CACHE_ENABLED,
				transactionsImpl.class, primaryKey);

		if (transactions == _nulltransactions) {
			return null;
		}

		if (transactions == null) {
			Session session = null;

			try {
				session = openSession();

				transactions = (transactions)session.get(transactionsImpl.class,
						primaryKey);

				if (transactions != null) {
					cacheResult(transactions);
				}
				else {
					EntityCacheUtil.putResult(transactionsModelImpl.ENTITY_CACHE_ENABLED,
						transactionsImpl.class, primaryKey, _nulltransactions);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(transactionsModelImpl.ENTITY_CACHE_ENABLED,
					transactionsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return transactions;
	}

	/**
	 * Returns the transactions with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param type the primary key of the transactions
	 * @return the transactions, or <code>null</code> if a transactions with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public transactions fetchByPrimaryKey(String type)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)type);
	}

	/**
	 * Returns all the transactionses.
	 *
	 * @return the transactionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<transactions> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<transactions> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<transactions> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<transactions> list = (List<transactions>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TRANSACTIONS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TRANSACTIONS;

				if (pagination) {
					sql = sql.concat(transactionsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<transactions>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<transactions>(list);
				}
				else {
					list = (List<transactions>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the transactionses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (transactions transactions : findAll()) {
			remove(transactions);
		}
	}

	/**
	 * Returns the number of transactionses.
	 *
	 * @return the number of transactionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TRANSACTIONS);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the transactions persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.sa.csmarc.dashboard.model.transactions")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<transactions>> listenersList = new ArrayList<ModelListener<transactions>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<transactions>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(transactionsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TRANSACTIONS = "SELECT transactions FROM transactions transactions";
	private static final String _SQL_COUNT_TRANSACTIONS = "SELECT COUNT(transactions) FROM transactions transactions";
	private static final String _ORDER_BY_ENTITY_ALIAS = "transactions.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No transactions exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(transactionsPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"type"
			});
	private static transactions _nulltransactions = new transactionsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<transactions> toCacheModel() {
				return _nulltransactionsCacheModel;
			}
		};

	private static CacheModel<transactions> _nulltransactionsCacheModel = new CacheModel<transactions>() {
			@Override
			public transactions toEntityModel() {
				return _nulltransactions;
			}
		};
}