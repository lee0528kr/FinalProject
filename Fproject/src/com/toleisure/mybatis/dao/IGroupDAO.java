package com.toleisure.mybatis.dao;

import java.util.ArrayList;

import com.toleisure.mybatis.dto.GroupDTO;

public interface IGroupDAO
{
	// 모임 정보 INSERT 메소드 구현
	public int newGroup(GroupDTO g);	// 신규 개설
	public int addGroup(GroupDTO g);	// 기존 개설
	
	// 호스트ID 에 따른 모임 정보 모두 출력 (모임개설 시 리스트 표시)
	public ArrayList<GroupDTO> grSearch(String hostId);
	
	// grCode 에 따른 모임의 가장 최근 정보 가져오기
	public GroupDTO groupFormInfo(int grCode);
	
	// 메이트ID 에 따른 찜 모임 리스트 출력 (마이페이지 - 찜 목록)
	public ArrayList<GroupDTO> jjimGroup(String memId);
	
	// 메이트ID 에 따른 찜 호스트 리스트 출력 (마이페이지 - 찜 목록)
	public ArrayList<GroupDTO> jjimHost(String memId);
	
	// 모임 정보 DELETE 메소드 구현 (관리자만 가능)
	public int removeGroup(int grCode);
	
	// 모임명으로 검색 
	public ArrayList<GroupDTO> searchGroup(String gName);
	
	// 호스트명으로 검색
	public ArrayList<GroupDTO> searchHost(String hName);
	
	// 분위기명으로 검색
	public ArrayList<GroupDTO> searchMood(String mName);
	
}