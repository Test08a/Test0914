package com.testcases;

import org.testng.annotations.Test;

import com.pageobjects.Pageobj;

public class Tc001 extends Baseclass{

	@Test
	public void tc1() {
		Pageobj ob = new Pageobj(driver);
		ob.getbmw();
		ob.getbenz();
		//ob.getopenwindow();
		//ob.getopentab();
		ob.getselectcars();
		ob.getselectfruits();
		ob.gettypetext(vali);
		ob.getenable();
		ob.getenablebuttonintext(vali);
		ob.getdisablebutton();
		ob.getshowbutton();
		ob.getshowbuttonintext(vali);
		ob.gethidebutton();
		ob.gettextboxinalert(vali);
		ob.getalertbutton();
		ob.getconfirmalertbutton();
		ob.getmousehoverbutton();
		ob.getstatictable();
	}
}
