package javacoffee.members;

//Ezrela Amoako EBA190002
/*
 * Member class holds a members username, password, and rewards class
 */
public class Member {
	
	private Rewards rewards;
	private String username;
	private String password;
	
	// Default constructor
	public Member()
	{
		rewards = new Rewards();
	}
	
	// Constructor
	public Member(String u, String p)
	{
		username = u;
		password = p;
		rewards = new Rewards();
	}
	
	// Set user's password
	public void setPassword(String p)
	{
		password = p;
	}
	
	// Get user's password
	public void setUser(String u)
	{
		username = u;
	}
	
	// Set user's rewards
	public void setRewards(Rewards r)
	{
		rewards = r;
	}
	
	// Get password
	public String getPassword()
	{
		return password;
	}
	
	// Get username
	public String getUser()
	{
		return username;
	}
	
	// Get rewards
	public Rewards getRewards()
	{
		return rewards;
	}
	
	


}
