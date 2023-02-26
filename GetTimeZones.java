package conversion;
import java.util.*;
public class GetTimeZones 
	{
		public static void main(String[] args)
		{
			String[] ids = TimeZone.getAvailableIDs();
			for(String id:ids)
			{
				System.out.println(id);
			}
		}
	}
