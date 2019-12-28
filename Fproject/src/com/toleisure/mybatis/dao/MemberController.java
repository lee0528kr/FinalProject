package com.toleisure.mybatis.dao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.toleisure.mybatis.dto.BoardDTO;
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
	public String findEmail(MemberDTO dto, Model model, HttpServletRequest req)
	{
		
		String view = "/WEB-INF/views/FindEmail.jsp";
		
		
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
		
		return isMemYn;
	}
	
	@RequestMapping(value = "/login_success.action", method = {RequestMethod.POST,RequestMethod.GET})
	public String loginSuccess(MemberDTO dto, HttpServletRequest req)
	{
		HttpSession session = req.getSession(true);
		IMemberDAO dao = sqlsession.getMapper(IMemberDAO.class);
		
		
		MemberDTO login = dao.login(dto);
		
		
		
		
		if(login!=null)
		{
			session.setAttribute("member", login);
			
			int check = dao.adminCheck(login);
			
			if(check==1)
			{
				session.setAttribute("mode", 1);
			}
			else 
			{
				session.setAttribute("mode", 0);
			}
				
		
		}
				
		System.out.println("==================");
		System.out.println("==== dto.getMemId = " + dto.getMemId());
		System.out.println("==== dto.getMemPw = " + dto.getMemPw());
		System.out.println("==================");
		
		return "redirect:main.action";
	}
	
	@RequestMapping(value = "/logout.action", method = {RequestMethod.POST,RequestMethod.GET})
	public String logout(MemberDTO dto, HttpServletRequest req)
	{
		HttpSession session = req.getSession();
		
		session.invalidate();
				
		System.out.println("==================");
		System.out.println("==== dto.getMemId = " + dto.getMemId());
		System.out.println("==== dto.getMemPw = " + dto.getMemPw());
		System.out.println("==================");
		
		return "redirect:main.action";
	}
	
	@RequestMapping(value = "/mypage.action", method = {RequestMethod.POST,RequestMethod.GET})
	public String myPageMain(MemberDTO dto, Model model, HttpSession session)
	{
		IMemberDAO dao = sqlsession.getMapper(IMemberDAO.class);
		
		MemberDTO mine = dao.myInfo(dto.getMemId());
		
		model.addAttribute("myInfo", mine);
		
		System.out.println("==================");
		System.out.println("==== dto.getMemId = " + dto.getMemId());
		System.out.println("==== dto.getMemPw = " + dto.getMemPw());
		System.out.println("==================");
		
		return "/WEB-INF/views/MyPage.jsp";
	}
	
	@RequestMapping(value = "/infomodify.action", method = {RequestMethod.POST,RequestMethod.GET})
	public String myPageModify(MemberDTO dto, Model model, HttpSession session)
	{
		IMemberDAO dao = sqlsession.getMapper(IMemberDAO.class);
		
		MemberDTO mine2 = dao.myInfo(dto.getMemId());
		
		session.getAttribute("member");
		session.setAttribute("myInfo", mine2);
		
		
		System.out.println("==================");
		System.out.println("==== dto.getMemId = " + dto.getMemId());
		System.out.println("==================");
		
		return "/WEB-INF/views/My_modify.jsp";
	}
	
	@RequestMapping(value = "/idCheck.action", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public String idCheck(MemberDTO dto, Model model)
	{
		IMemberDAO dao = sqlsession.getMapper(IMemberDAO.class);
		String idCheckYn = dao.idCheck(dto);
		
		return idCheckYn;
	}
	
	@RequestMapping(value = "/memberinsertForm.action", method = RequestMethod.GET)
	public String memberInsert(Model model)
	{
		String view = "WEB-INF/views/join.jsp";
		
		return view;
	}
	
	@RequestMapping(value = "/memberinsert.action", method = RequestMethod.POST)
	public String memberinsert(MemberDTO m)
	{
		String view = "WEB-INF/views/joinTest.jsp";
		
		IMemberDAO dao = sqlsession.getMapper(IMemberDAO.class);
		dao.add(m);
		
		return view;
		
	}
	
	@RequestMapping(value = "/memberpasswordform.action", method = RequestMethod.GET)
	public String finePassword(Model model)
	{
		String view = "/WEB-INF/views/FindPassword.jsp";
		
		/* IMemberDAO dao = sqlsession.getMapper(IMemberDAO.class); */
		
		return view;
	}
	
	@RequestMapping(value = "/findpassword.action", method = {RequestMethod.POST,RequestMethod.GET})
	public String findPw(MemberDTO dto, Model model)
	{
		String view = "/WEB-INF/views/FindPassword.jsp";
		
		
		return view;
	}
	
	
	@RequestMapping(value = "/selectPmp.action", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public String selectPmem(MemberDTO dto, Model model)
	{
		IMemberDAO dao = sqlsession.getMapper(IMemberDAO.class);
		String isMem = dao.selectPmp(dto);
		
		System.out.println("==================");
		System.out.println("==== isMem = "+isMem);
		System.out.println("==================");
		
		return isMem;
	}
	
	@RequestMapping(value = "/password.action", method = {RequestMethod.POST, RequestMethod.GET})
	public String memberPfind(MemberDTO dto, Model model, HttpSession session)
	{
		session.getAttribute("member");
		IMemberDAO dao = sqlsession.getMapper(IMemberDAO.class);
		
		MemberDTO find = dao.password(dto);
		
		System.out.println("memid = " + dto.getMemId());
		System.out.println("mempw = " + dto.getMemPw());
		
		session.setAttribute("memId", find);
		
		return "/WEB-INF/views/ChangePassword.jsp";
		
	}
	
	@RequestMapping(value = "/updatePw.action", method = {RequestMethod.POST, RequestMethod.GET})
	public String updatePw(MemberDTO dto, Model model, HttpSession session)
	{
		session.getAttribute("member");
		IMemberDAO dao = sqlsession.getMapper(IMemberDAO.class);
		
		session.getAttribute("memId");
		
		System.out.println("memid = " + session.getAttribute("memId"));
		System.out.println("mempw = " + dto.getMemPw());
		
		dao.updatePw(dto);
		
		return "/WEB-INF/views/login.jsp";
		
	}
	
	@RequestMapping(value = "/mypwmodify.action", method = {RequestMethod.POST, RequestMethod.GET})
	public String myPagePwmodify(MemberDTO dto, Model model, HttpSession session)
	{
		IMemberDAO dao = sqlsession.getMapper(IMemberDAO.class);
		
		MemberDTO mine2 = dao.myInfo(dto.getMemId());
		
		session.getAttribute("member");
		session.setAttribute("myId", mine2.getMemId());
		
		System.out.println("==================");
		System.out.println("==== dto.getMemId = " + dto.getMemId());
		System.out.println("==================");
		
		return "/WEB-INF/views/pw_modify.jsp";
	}
	
	@RequestMapping(value = "/pwCheck.action", method = {RequestMethod.POST, RequestMethod.GET})
	@ResponseBody
	public String pwCheck(MemberDTO dto, HttpSession session)
	{
		IMemberDAO dao = sqlsession.getMapper(IMemberDAO.class);
		
		session.getAttribute("member");
		session.getAttribute("myId");
		/* System.out.println(dto.getMemPw()); */
		
		String pwCheck = dao.pwCheck(dto);
		System.out.println(pwCheck);
		
		return pwCheck;
	}
	
	
	@RequestMapping(value = "/memPwModify.action", method = {RequestMethod.POST, RequestMethod.GET})
	public String pwModify(MemberDTO dto, Model model, HttpSession session)
	{
		session.getAttribute("member");
		IMemberDAO dao = sqlsession.getMapper(IMemberDAO.class);
		
		/* session.getAttribute("myId"); */
		
		dao.updatePw(dto);
		
		return "mypage.action";
	}
	
	
	@RequestMapping(value = "/infoupdate.action", method = {RequestMethod.POST, RequestMethod.GET})
	public String infoModify(MemberDTO dto, Model model, HttpSession session)
	{
		session.getAttribute("member");
		
		IMemberDAO dao = sqlsession.getMapper(IMemberDAO.class);
		
		dao.infoUpdate(dto);
		
		return "mypage.action"; 
	}
	
	@RequestMapping(value = "/mycal.action", method = {RequestMethod.POST, RequestMethod.GET})
	public String myCalendar(MemberDTO dto, Model model, HttpSession session)
	{
		dto = (MemberDTO)session.getAttribute("member");
		String memId = dto.getMemId();
		
		IMemberDAO dao = sqlsession.getMapper(IMemberDAO.class);
		
		return "/WEB-INF/views/myCalendar.jsp"; 
	}
}
