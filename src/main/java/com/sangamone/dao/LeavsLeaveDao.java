package com.sangamone.dao;

import com.sangamone.model.LeavsLeave;

public interface LeavsLeaveDao {

	String applyLeave(LeavsLeave leavsLeave);

	String approveLeave(LeavsLeave leavsLeave);

	String cancelLeave(LeavsLeave leavsLeave);

	String withdrawLeave(LeavsLeave leavsLeave);

	

}
