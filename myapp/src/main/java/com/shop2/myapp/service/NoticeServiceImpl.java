package com.shop2.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop2.myapp.dto.NoticeDTO;
import com.shop2.myapp.model.NoticeMapper;

@Service
public class NoticeServiceImpl implements NoticeService {
	
	@Autowired
	NoticeMapper noticeMapper;
	
	@Override
	public List<NoticeDTO> findAll() throws Exception {
		return noticeMapper.findAll();
	}

	@Override
	public NoticeDTO getNotice(String subject) throws Exception {
		return noticeMapper.getNotice(subject);
	}	
}