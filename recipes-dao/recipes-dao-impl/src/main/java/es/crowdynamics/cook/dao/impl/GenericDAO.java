package es.crowdynamics.cook.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Usuario on 16/12/2016.
 */
public abstract class GenericDAO<T, PK> {

    @PersistenceContext
    protected EntityManager entitymanager;

    protected void createEntity(T entity) {
        this.entitymanager.persist(entity);
    }

    protected  T findEntity(PK id)	{
        return this.entitymanager.find(getEntityClass(), id);
    }

    protected void deleteEntity(T entity)	{
        this.entitymanager.remove(entity);
    }

    protected void updateEntity(T entity)	{
        this.entitymanager.merge(entity);
    }

    protected List<T> findAllEntity()	{
        return this.entitymanager.createQuery("select o from " + getTableName() + " o", getEntityClass()).getResultList();
    }

    protected abstract String getTableName();
    protected abstract Class<T> getEntityClass();
}
