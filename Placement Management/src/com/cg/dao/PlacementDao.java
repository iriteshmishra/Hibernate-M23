package com.cg.dao;

import com.cg.entities.Placement;

public interface PlacementDao 
{
	Placement addPlacement(Placement placement);
	Placement updatePlacement(Placement placement);
	Placement searchPlacement(int id);
	
	public abstract void beingTransaction();
	public abstract void commitTransaction();
	boolean cancelPlacement(int id);

}
