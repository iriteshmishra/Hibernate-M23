package com.cg.service;

import com.cg.dao.PlacementDao;
import com.cg.dao.PlacementDaoImpl;
import com.cg.entities.Placement;

public class PlacementServiceImpl implements PlacementService
{

	private PlacementDao dao;
	
	public PlacementServiceImpl() {
		super();
		dao=new PlacementDaoImpl();
	}
	@Override
	public Placement addPlacement(Placement placement) {
		dao.beingTransaction();
		dao.addPlacement(placement);
		dao.commitTransaction();
		return placement;
	}

	@Override
	public Placement updatePlacement(Placement placement) {
		dao.beingTransaction();
		dao.updatePlacement(placement);
		dao.commitTransaction();
		return placement;
	}

	@Override
	public Placement searchPlacement(int id) {
		return dao.searchPlacement(id);
	}

	@Override
	public boolean cancelPlacement(int id) {
		dao.beingTransaction();
		boolean res=dao.cancelPlacement(id);
		dao.commitTransaction();
		return res;
		
	}

}
