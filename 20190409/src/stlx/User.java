package stlx;

public class User {

	public User() 
	{
		usernames = new String[] {"123456"};
		wolds = new String[] {"654321"};
	}
	
	String username;
	String wold;
	String[] usernames;
	String[] wolds;
	
	public boolean uset(String username,String wold)
	{
		for(int i=0;i<usernames.length;i++) 
		{
			if(usernames[i].equals(username)  && wolds[i].equals(wold))
			{
				return true;
			}
		}
		return false;
	}

}
