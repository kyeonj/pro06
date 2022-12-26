package com.shop2.myapp.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.shop2.myapp.dto.NoticeDTO;

@Mapper
public interface NoticeMapper {
	public List<NoticeDTO> findAll() throws Exception;
	public NoticeDTO getNotice(String subject) throws Exception;
}
