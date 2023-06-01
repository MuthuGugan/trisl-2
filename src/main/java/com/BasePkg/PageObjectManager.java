package com.BasePkg;

import com.PageObjectModel.LoginPage;
import com.PageObjectModel.MyProfilePage;

public class PageObjectManager 
{
	public LoginPage lp;
	public MyProfilePage mp;

	public MyProfilePage getMp() 
	{
		mp = new MyProfilePage();
		return mp;
	}

	public LoginPage getLp() 
	{
		lp = new LoginPage();
		return lp;
	}

}
