package com.toleisure.mybatis.dto;

public class GroupDTO
{
	private String memId, grName, grPre, grNotice;
	private int grCode, grCate1, grCate2;
	
	private int ngCode, ngMax, ngMin, ngCost;
	private String ngPic, ngStart, ngEnd, ngLocation, ngIntro;
	
	private int grCount, grStarCount;
	private double grStarAvg;
	
	// setter / getter 구성 (TBL_GROUP 테이블)
	public String getMemId()
	{
		return memId;
	}
	public void setMemId(String memId)
	{
		this.memId = memId;
	}
	public String getGrName()
	{
		return grName;
	}
	public void setGrName(String grName)
	{
		this.grName = grName;
	}
	public String getGrPre()
	{
		return grPre;
	}
	public void setGrPre(String grPre)
	{
		this.grPre = grPre;
	}
	public String getGrNotice()
	{
		return grNotice;
	}
	public void setGrNotice(String grNotice)
	{
		this.grNotice = grNotice;
	}
	public int getGrCode()
	{
		return grCode;
	}
	public void setGrCode(int grCode)
	{
		this.grCode = grCode;
	}
	public int getGrCate1()
	{
		return grCate1;
	}
	public void setGrCate1(int grCate1)
	{
		this.grCate1 = grCate1;
	}
	public int getGrCate2()
	{
		return grCate2;
	}
	public void setGrCate2(int grCate2)
	{
		this.grCate2 = grCate2;
	}
	
	
	// setter / getter 구성 (NOW_GROUP 테이블)
	public int getNgCode()
	{
		return ngCode;
	}
	public void setNgCode(int ngCode)
	{
		this.ngCode = ngCode;
	}
	public int getNgMax()
	{
		return ngMax;
	}
	public void setNgMax(int ngMax)
	{
		this.ngMax = ngMax;
	}
	public int getNgMin()
	{
		return ngMin;
	}
	public void setNgMin(int ngMin)
	{
		this.ngMin = ngMin;
	}
	public int getNgCost()
	{
		return ngCost;
	}
	public void setNgCost(int ngCost)
	{
		this.ngCost = ngCost;
	}
	public String getNgPic()
	{
		return ngPic;
	}
	public void setNgPic(String ngPic)
	{
		this.ngPic = ngPic;
	}
	public String getNgStart()
	{
		return ngStart;
	}
	public void setNgStart(String ngStart)
	{
		this.ngStart = ngStart;
	}
	public String getNgEnd()
	{
		return ngEnd;
	}
	public void setNgEnd(String ngEnd)
	{
		this.ngEnd = ngEnd;
	}
	public String getNgLocation()
	{
		return ngLocation;
	}
	public void setNgLocation(String ngLocation)
	{
		this.ngLocation = ngLocation;
	}
	public String getNgIntro()
	{
		return ngIntro;
	}
	public void setNgIntro(String ngIntro)
	{
		this.ngIntro = ngIntro;
	}
	public int getGrCount()
	{
		return grCount;
	}
	public void setGrCount(int grCount)
	{
		this.grCount = grCount;
	}
	public int getGrStarCount()
	{
		return grStarCount;
	}
	public void setGrStarCount(int grStarCount)
	{
		this.grStarCount = grStarCount;
	}
	public double getGrStarAvg()
	{
		return grStarAvg;
	}
	public void setGrStarAvg(double grStarAvg)
	{
		this.grStarAvg = grStarAvg;
	}
	
	
}
