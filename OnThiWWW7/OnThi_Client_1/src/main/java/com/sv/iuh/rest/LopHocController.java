package com.sv.iuh.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sv.iuh.entity.LopHoc;
import com.sv.iuh.server.LopHocServer;

@Controller
public class LopHocController {
	@Autowired
	private LopHocServer lopHocServer;
	@GetMapping("/")
	public String DanhSachLopHoc(Model model) {
		List<LopHoc> list= lopHocServer.getAll();
		model.addAttribute("lopHocs", list);
		return "lopHoc-list";
	}
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		LopHoc lopHoc= new LopHoc();
		model.addAttribute("lopHoc", lopHoc);
		return "lopHoc-form";
	}
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("maLopHoc") int maSanPham, Model model) {
		LopHoc lopHoc=lopHocServer.getById(maSanPham);
		model.addAttribute("lopHoc", lopHoc);
		return "lopHoc-form";
	}
	@PostMapping("/saveLopHoc")
	public String saveLopHoc(@Valid @ModelAttribute("lopHoc") LopHoc lopHoc,BindingResult theBindingResult, Model model) {
		if(theBindingResult.hasErrors()) {
			return "lopHoc-form";
		}else {
			lopHocServer.save(lopHoc);
			model.addAttribute("lopHoc", lopHoc);
			return "redirect:/";
		}
	}
	@GetMapping("/delete")
	public String deleteLopHoc(@RequestParam("maLopHoc") int maLopHoc) {
		lopHocServer.delete(maLopHoc);
		return "redirect:/";
	}

}
