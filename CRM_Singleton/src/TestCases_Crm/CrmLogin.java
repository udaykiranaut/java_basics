package TestCases_Crm;

import library_crm.LoginCode;

public class CrmLogin 
{
	
	public void adminLogin() throws Exception
	{
		LoginCode lc = new LoginCode();
		lc.browserName("chrome");
		String path = "http://127.0.0.1:8091/sugarcrm/index.php?action=Login&module=Users";
		lc.url(path);
		lc.userDetails("admin", "root");
		lc.close();
	}
}
