package com.toleisure.mybatis.dto;


public class NoticeVo {
	private int newsNum, adminCode, newsHits;
	private String newsTitle, newsCont, newsDate, newsMem,memPwd;
	
	
	private int  eventHits;
	private String eventNum,eventTitle, eventCont,eventMem, eventDate;
	
	
	private String faqNum,faqTitle, faqCont, faqDate, faqMem;
	
	 private int startIndex;
	    private int cntPerPage;
		public int getNewsNum()
		{
			return newsNum;
		}
		public void setNewsNum(int newsNum)
		{
			this.newsNum = newsNum;
		}
		public int getAdminCode()
		{
			return adminCode;
		}
		public void setAdminCode(int adminCode)
		{
			this.adminCode = adminCode;
		}
		public int getNewsHits()
		{
			return newsHits;
		}
		public void setNewsHits(int newsHits)
		{
			this.newsHits = newsHits;
		}
		public String getNewsTitle()
		{
			return newsTitle;
		}
		public void setNewsTitle(String newsTitle)
		{
			this.newsTitle = newsTitle;
		}
		public String getNewsCont()
		{
			return newsCont;
		}
		public void setNewsCont(String newsCont)
		{
			this.newsCont = newsCont;
		}
		public String getNewsDate()
		{
			return newsDate;
		}
		public void setNewsDate(String newsDate)
		{
			this.newsDate = newsDate;
		}
		public String getNewsMem()
		{
			return newsMem;
		}
		public void setNewsMem(String newsMem)
		{
			this.newsMem = newsMem;
		}
		public String getMemPwd()
		{
			return memPwd;
		}
		public void setMemPwd(String memPwd)
		{
			this.memPwd = memPwd;
		}
	
		public int getEventHits()
		{
			return eventHits;
		}
		public void setEventHits(int eventHits)
		{
			this.eventHits = eventHits;
		}
	
		public String getEventNum()
		{
			return eventNum;
		}
		public void setEventNum(String eventNum)
		{
			this.eventNum = eventNum;
		}
		public String getEventMem()
		{
			return eventMem;
		}
		public void setEventMem(String eventMem)
		{
			this.eventMem = eventMem;
		}
		public String getEventTitle()
		{
			return eventTitle;
		}
		public void setEventTitle(String eventTitle)
		{
			this.eventTitle = eventTitle;
		}
		public String getEventCont()
		{
			return eventCont;
		}
		public void setEventCont(String eventCont)
		{
			this.eventCont = eventCont;
		}
		public String getEventDate()
		{
			return eventDate;
		}
		public void setEventDate(String eventDate)
		{
			this.eventDate = eventDate;
		}
	
		public String getFaqNum()
		{
			return faqNum;
		}
		public void setFaqNum(String faqNum)
		{
			this.faqNum = faqNum;
		}
		public String getFaqMem()
		{
			return faqMem;
		}
		public void setFaqMem(String faqMem)
		{
			this.faqMem = faqMem;
		}
		public String getFaqTitle()
		{
			return faqTitle;
		}
		public void setFaqTitle(String faqTitle)
		{
			this.faqTitle = faqTitle;
		}
		public String getFaqCont()
		{
			return faqCont;
		}
		public void setFaqCont(String faqCont)
		{
			this.faqCont = faqCont;
		}
		public String getFaqDate()
		{
			return faqDate;
		}
		public void setFaqDate(String faqDate)
		{
			this.faqDate = faqDate;
		}
		public int getStartIndex()
		{
			return startIndex;
		}
		public void setStartIndex(int startIndex)
		{
			this.startIndex = startIndex;
		}
		public int getCntPerPage()
		{
			return cntPerPage;
		}
		public void setCntPerPage(int cntPerPage)
		{
			this.cntPerPage = cntPerPage;
		}
    
	
}