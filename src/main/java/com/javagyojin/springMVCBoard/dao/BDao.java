package com.javagyojin.springMVCBoard.dao;

import java.util.ArrayList;

import com.javagyojin.springMVCBoard.dto.BDto;

public class BDao {

	public ArrayList<BDto> list() {
		
		
		return dtos;
	}
	
	
	public void write(String bName, String bTitle, String bContent) {
		
	}
	
	public BDto contentView(String strID) {
		
		return dto;
	}
	
	public void modify(String bId, String bName, String bTitle, String bContent) {
		
		
	}
	
	public void delete(String bId) {
		
		
	}
	
	public BDto reply_view(String strID) {
		
		return dto;
	}
	
	public void reply(String bId, String bName, String bTitle, String bContent, String bGroup, String bStep, String bIndent) {
		
	}
}
