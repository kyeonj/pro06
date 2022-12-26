package com.shop2.myapp.service;

import java.util.List;

import com.shop2.myapp.dto.NoticeDTO;

public interface NoticeService {
	public List<NoticeDTO> findAll() throws Exception;
	public NoticeDTO getNotice(String subject) throws Exception;
}
