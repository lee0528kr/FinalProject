/*=================
  IProfileDAO.java
==================*/


package com.toleisure.mybatis.dao;

import java.util.ArrayList;

import com.toleisure.mybatis.dto.GroupDTO;
import com.toleisure.mybatis.dto.MemberDTO;

public interface IProfileDAO
{
	// 프로필 - (현재 로그인 한) 회원 정보(사진, 이름, 소개) 가져오기
	public MemberDTO memInfo(MemberDTO memId);
	
	// 프로필 - (현재 로그인 한) 회원이 개설했던 모임 리스트 가져오기
	public ArrayList<GroupDTO> grHistory(GroupDTO memId);
}
