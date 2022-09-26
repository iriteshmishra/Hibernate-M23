package com.cg.service;

import com.cg.entities.College;
import com.cg.entities.Placement;

public interface CollegeService 
{
	College addCollege(College college);
	College updateCollege(College college);
	College searchCollege(int college_id);
	boolean deleteCollege(int college_id);
	boolean shedulePlacement(Placement placement);


}
