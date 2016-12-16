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

    public void create(T entity) {
        this.entitymanager.persist(entity);
    }

    public  T find(PK id)	{
        return this.entitymanager.find(getEntityClass(), id);
    }

    public void delete(T entity)	{
        this.entitymanager.remove(entity);
    }

    public void update(T entity)	{
        this.entitymanager.merge(entity);
    }

    public List<T> findAll()	{
        return this.entitymanager.createQuery("select o from " + getTableName() + " o", getEntityClass()).getResultList();
    }

    protected abstract String getTableName();
    protected abstract Class<T> getEntityClass();
}
