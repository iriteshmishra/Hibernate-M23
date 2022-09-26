package com.cg.dao;

import com.cg.entities.College;

public interface CollegeDao 
{
	College addCollege(College college);
	College updateCollege (College college);
	College searchCollege(int college_id);
	boolean deleteCollege(int college_id);

	public abstract void beingTransaction();
	public abstract void commitTransaction();
	
}
