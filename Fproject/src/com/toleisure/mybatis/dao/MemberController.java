package com.toleisure.mybatis.dao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.toleisure.mybatis.dto.MemberDTO;


@Controller
public class MemberController
{	
	@Autowired
	private SqlSession sqlsession;
	
	@RequestMapping(value = "/memberfindform.action", method = RequestMethod.GET)
	public String findEmail(Model m)
	{
		String view = "/WEB-INF/views/FindEmail.jsp";
		
		return view;
	}
	
	@RequestMapping(value = "/efind.action", method = {RequestMethod.POST,RequestMethod.GET})
	public String memberEfind(MemberDTO dto, Model model)
	{
		String view = "/WEB-INF/views/email.jsp";
		
		IMemberDAO dao = sqlsession.getMapper(IMemberDAO.class);
		
		model.addAttribute("memId", dao.efind(dto));
		
		return view;
	}
	
	@RequestMapping(value = "/findemail.action", method = {RequestMethod.POST,RequestMethod.GET})
	public String findEmail(MemberDTO dto, Model model)
	{
		String view = "/WEB-INF/views/FindEmail.jsp";
		
		
		return view;
	}
	
	
	@RequestMapping(value = "/findpassword.action", method = {RequestMethod.POST,RequestMethod.GET})
	public String findPw(MemberDTO dto, Model model)
	{
		String view = "/WEB-INF/views/FindPassword.jsp";
		
		
		return view;
	}
	
	@RequestMapping(value = "/selectMem.action", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public String selectMem(MemberDTO dto, Model model)
	{
		IMemberDAO dao = sqlsession.getMapper(IMemberDAO.class);
		String isMemYn = dao.selectMem(dto);
		
		System.out.println("==================");
		System.out.println("==== isMemYn = "+isMemYn);
		System.out.println("==================");
		
		return isMemYn;
	}
	
	@RequestMapping(value = "/loginactive.action", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public String loginMem(MemberDTO dto, Model model)
	{
		IMemberDAO dao = sqlsession.getMapper(IMemberDAO.class);
		String isMemYn = dao.searchMem(dto);
		
		System.out.println("==================");
		System.out.println("==== isMemYn = " + isMemYn);
		System.out.println("==== dto.getMemId = " + dto.getMemId());
		System.out.println("==== dto.getMemPw = " + dto.getMemPw());
		System.out.println("==================");
		
		if(isMemYn == "Y")
		{
			
		}
		
		return isMemYn;
	}
	
	
	
}
