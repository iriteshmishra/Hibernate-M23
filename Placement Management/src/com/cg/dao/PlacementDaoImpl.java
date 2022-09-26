package com.cg.dao;

import javax.persistence.EntityManager;
import com.cg.entities.Placement;

public class PlacementDaoImpl implements PlacementDao
{

	private EntityManager em;
	
	public PlacementDaoImpl() 
	{
		super();
		em=JPAUtil.getEntityManager();
	}
	
	@Override
	public Placement addPlacement(Placement placement) {
		em.persist(placement);
		return placement;
	}

	@Override
	public Placement updatePlacement(Placement placement) {
		em.merge(placement);
		return placement;
	}

	@Override
	public Placement searchPlacement(int id) {
		Placement placement=em.find(Placement.class, id);
		return placement;
		
	}

	@Override
	public void beingTransaction() {
		em.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
		
	}

	@Override
	public boolean cancelPlacement(int id) {
		
		return false;
	}

}
