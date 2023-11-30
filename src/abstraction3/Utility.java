package abstraction3;

import java.util.Scanner;

public class Utility
{
	String checkForName(String animalType)
	{		
		Scanner myScan = new Scanner(System.in);
        System.out.print("Do you have a name for " + animalType + "?(Y/N): ");
        String animalReply = myScan.nextLine();
        
	        if (animalReply.equalsIgnoreCase("Y"))
	        {
	            System.out.print("Enter the name of the " + animalType + ": ");
	            return myScan.next();
	        }
	        else if(animalReply.equalsIgnoreCase("N"))
	        {
	        	return null;
	        }
       return null;
	}	
 
    Lion getLionObject(String lionName)
    {
    	if (lionName == null)
        {
            return new Lion();
        }
    	return new Lion(lionName);
    }
	
	Giraffe getGiraffeObject (String giraffeName)
	{
		if(giraffeName == null)
		{
			return new Giraffe();
		}
		else
		return new Giraffe(giraffeName);
	}

	Bear getBearObject (String bearName)
	{
		if(bearName == null)
		{
			return new Bear();
		}
		return new Bear(bearName);
	}
}
