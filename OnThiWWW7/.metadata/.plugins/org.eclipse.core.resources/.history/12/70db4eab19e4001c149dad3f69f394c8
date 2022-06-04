package com.sv.iuh.server;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sv.iuh.dao.LopHocDao;
import com.sv.iuh.entity.LopHoc;

@Service
public class LopHocServerImpl implements LopHocServer {
	
	@Autowired
	private LopHocDao lopHocDao;
	
	@Transactional
	@Override
	public List<LopHoc> getAll() {
		// TODO Auto-generated method stub
		return lopHocDao.getAll();
	}
	@Transactional
	@Override
	public LopHoc getById(int maLopHoc) {
		// TODO Auto-generated method stub
		return lopHocDao.getById(maLopHoc);
	}
	@Transactional
	@Override
	public void save(LopHoc lopHoc) {
		// TODO Auto-generated method stub
		lopHocDao.save(lopHoc);
	}
	@Transactional
	@Override
	public void delete(int maLopHoc) {
		lopHocDao.delete(maLopHoc);
		
	}

}
