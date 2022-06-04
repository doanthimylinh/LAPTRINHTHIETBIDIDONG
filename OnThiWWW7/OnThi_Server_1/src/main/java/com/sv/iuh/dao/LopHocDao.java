package com.sv.iuh.dao;

import java.util.List;

import com.sv.iuh.entity.LopHoc;

public interface LopHocDao {
	public List<LopHoc> getAll();
	public LopHoc getById(int maLopHoc);
	public void save(LopHoc lopHoc);
	public void delete(int maLopHoc);
}
