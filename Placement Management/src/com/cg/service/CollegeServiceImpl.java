package com.cg.service;

import com.cg.dao.CollegeDao;
import com.cg.dao.CollegeDaoImpl;
import com.cg.entities.College;
import com.cg.entities.Placement;

public class CollegeServiceImpl implements CollegeService
{

private CollegeDao dao;
	
	public CollegeServiceImpl() {
		super();
		dao=new CollegeDaoImpl();
	}

	@Override
	public College addCollege(College college) {
		dao.beingTransaction();
		dao.addCollege(college);
		dao.commitTransaction();
		return college;
	}

	@Override
	public College updateCollege(College college) {
		dao.beingTransaction();
		dao.updateCollege(college);
		dao.commitTransaction();
		return college;
	}

	@Override
	public College searchCollege(int college_id) {
		College college=dao.searchCollege(college_id);
		return college;
	}

	@Override
	public boolean deleteCollege(int college_id) {
		dao.beingTransaction();
		boolean res=dao.deleteCollege(college_id);
		dao.commitTransaction();
		return res;
	}

	@Override
	public boolean shedulePlacement(Placement placement) {
		return false;
	}
	
}
