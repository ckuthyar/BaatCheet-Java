package com.sangamone.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangamone.dao.LeavsLeaveDao;
import com.sangamone.model.LeavsLeave;
import com.sangamone.repository.LeavsLeaveRepo;

@Service
public class LeavsLeaveServiceImpl implements LeavsLeaveDao {
	
	@Autowired
	LeavsLeaveRepo leavsLeaveRepo;

	@Override
	public String applyLeave(LeavsLeave leavsLeave) {
		leavsLeaveRepo.save(leavsLeave);
		return "applyLeave successful";
	}

	/*
	 * @Override public String approveLeave(LeavsLeave leavsLeave, int leave_id) {
	 * leavsLeave.setLeave_id(leave_id); leavsLeaveRepo.save(leavsLeave); return
	 * "ApproveLeave successful"; }
	 */
}
