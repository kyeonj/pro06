package com.shop2.myapp.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shop2.myapp.dto.NoticeDTO;
import com.shop2.myapp.dto.SampleDTO;
import com.shop2.myapp.service.NoticeService;

@Controller
@RequestMapping("/notice/")
public class NoticeController {

	@Resource
	private NoticeService noticeService;
	
	@GetMapping("list")
	public String noticeList(Model model) throws Exception {
		List<NoticeDTO> list = noticeService.findAll();
		model.addAttribute("list", list);
		return "notice/list";
	}
	
	@GetMapping("detail")
	public String getNotice(@RequestParam("subject") String subject, Model model) throws Exception {
		NoticeDTO notice = noticeService.getNotice(subject);
		model.addAttribute("notice", notice);
		return "notice/detail";
	}
}
