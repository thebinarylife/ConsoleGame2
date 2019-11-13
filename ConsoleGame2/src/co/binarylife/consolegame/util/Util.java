package co.binarylife.consolegame.util;

public class Util {
	
	public static boolean isInt(Object o)
	{
		try
		{
			Integer.parseInt(o.toString());
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public static int toInteger(Object o)
	{
		return Integer.parseInt(o.toString());
	}
	
	public static String amend(String[] arr) {
		String amended = "";
		for(String s : arr) {
			if(s == null)
				continue;
			
			amended += " " + s;
		}
		
		return amended.trim();
	}

}
