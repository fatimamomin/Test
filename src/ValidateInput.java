import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import sun.text.IntHashtable;


public class ValidateInput {

	public static String INVALID="invalid";
	public static String VALID="valid";
	
public static String NUMERICFORMAT="0123456789";
public static String TIMEFORMAT="0123456789:";	
	
	public ValidateInput()
	{
		System.out.println("ValidateInput.ValidateInput()");
	}
	
	
	public static String validateTimeFeilds(String time)
	
	{
		String timeFormat="0123456789";
		System.out.println("ValidateInput.validateTimeFeilds() time="+time);
		
		String returnTime="";
	int checkforTImesymobl=0;	
	System.out.println("ValidateInput.enclosing_method()");		

		if(time==null || time.length()==0)
		{
			returnTime=INVALID;
			return returnTime;
		}
	for(int i=0;i<time.length();i++)
	{
		char timechar=time.charAt(i);
		String timestr=Character.toString(timechar);
		System.out.println("ValidateInput.validateTimeFeilds() timestr="+timestr);
		//byte b='1';
	
		
		if(('0'<=((byte)timechar) && (((byte)timechar) <='9'))||((byte)timechar)==':')
		{
		
			System.out.println("ValidateInput.validateTimeFeilds() input is validated");
			if((byte)timechar==':')
			{
				System.out.println("ValidateInput.validateTimeFeilds() contains :");
				checkforTImesymobl+=1;
			}
			
			
			
			
		}
		
		
		
		
		/*if(timestr.contains(timeFormat))
		{
			returnTime=VALID;
System.out.println("ValidateInput.validateTimeFeilds() timestr in contains block="+timestr);
			if(timestr.equals(":"))
			{
				checkforTImesymobl+=1;
				
			}
			
			
System.out.println("ValidateInput.validateTimeFeilds() time contains valid input");
		continue;
		}*/
		
		
		
		
		else
		{
		System.out.println("ValidateInput.validateTimeFeilds() invaid time field else block");
			returnTime=INVALID;
			///break;
			
		}
	}

	
	System.out.println("ValidateInput.validateTimeFeilds() checkfortimesymobl="+checkforTImesymobl);
		if(checkforTImesymobl==2)
	{
		returnTime=checkforActualTIme(time);
	}else
	{
		returnTime=INVALID;
	}
	
	
	
	System.out.println("ValidateInput.validateTimeFeilds() returntiem="+returnTime);
return returnTime;	
	
	}
	
	
	
	public static String checkforActualTIme(String time)
	{
		System.out.println("ValidateInput.checkforActualTIme() timecheck="+time);
	String actualTime=INVALID;

boolean hrVaild = false,minValid = false,secValid = false;	
	
	String timeArrcheck[]=time.split(":");
	/*
	 * 
	 * if array length is 3 ,then only time is valid
	 * otherwise time is invalid
	 */
	if(timeArrcheck.length ==3)
	{
		String hr=timeArrcheck[0];
		String min=timeArrcheck[1];
		String sec=timeArrcheck[2];
	
	
		
		int hrcheck=Integer.valueOf(hr);
		int mincheck=Integer.valueOf(min);
		int seccheck=Integer.valueOf(sec);
		
		if(0<=hrcheck && hrcheck <=23 )
		{
			hrVaild=true;
			
		}
		
		if(0<=mincheck && mincheck <=59)
		{
		minValid=true;
			
		}
		
		if(0<=seccheck && seccheck <=59)
		{
			
		secValid=true;
		}
	
if(hrVaild  && minValid && secValid)
{
	
	actualTime=VALID;
	
}

	}
System.out.println("ValidateInput.checkforActualTIme() actualTime="+actualTime);	
		return actualTime; 	
	}	
	
	
	
	
	
	
	
	
	
		
	
public static void checkfor()
{
	String intcheck="123456789"; 
	if(intcheck.contains(intcheck))
	{
		System.out.println("ValidateInput.checkfor() 1 is matchedk");
		
	}
	
}
	
	
	
	
	
	
public static String	validateNumberField(String field,String value)
	{
	String returnCheck="";
	
	System.out.println("ValidateInput.validateNumberField()");
		
	
	if(value==null || value.length()==0)
	{
		System.out.println("ValidateInput.validateNumberField() please enter valid numeric value");
	return INVALID;
	}
	
	for(int i=0;i<value.length();i++)
	{
		char check=value.charAt(i);
		String checkstr=Character.toString(check);
		//int checkintvalue=Integer.valueOf(checkstr);
		//byte checkbyte=Byte.valueOf(checkstr);
                System.out.println("checkstr="+checkstr);
	if(NUMERICFORMAT.contains(checkstr))
	{
		returnCheck=VALID;
		System.out.println("ValidateInput.validateNumberField() user has entered valid numeric vlaue");
	continue;
	}
	else
	{
		System.out.println("ValidateInput.validateNumberField() user has entered invalid numeric value");
	returnCheck=INVALID;
		break;
		
	}
	}
	return returnCheck;
	}




public static void main(String[] args) {
	
	
	ValidateInput validobj=new ValidateInput();
	//validobj.validateNumberField("uname", "pqr");
	
	validateTimeFeilds("0123::");
	//validateTimeFeilds("1;2;3");
	validateTimeFeilds("01:34:34");
	
	checkforalaphabetcommaandFullStop("adjlkjd@");
	
	
}

public static String checkforalaphabetcommaandFullStop(String value)
{
	String returnString=INVALID;
	System.out.println("ValidateInput.checkforalaphabetcommaandFullStop()");
	
	if(value==null || value.length()==0)
	{
		return INVALID;
	}
	
	for(int i=0;i<value.length();i++)
	{
		
		char chekvalue=value.charAt(i);
		byte checkbyte=(byte)chekvalue;
		
		if(('a'<=checkbyte && checkbyte <='z') || ('A'<=checkbyte && checkbyte <='Z')|| (checkbyte==32)||
				(checkbyte==',')|| (checkbyte=='.'))		
				{
			System.out.println("ValidateInput.checkforalaphabetcommaandFullStop() pure string is valid");
			returnString=VALID;
			continue;
				}
		else
		{
			System.out
					.println("ValidateInput.checkforalaphabetcommaandFullStop() str is invalid");
			break;
			
			
		}
		
		
		
		
		
	}
	
	
	
	System.out.println("ValidateInput.checkforalaphabetcommaandFullStop() returnString="+returnString);
	return returnString;
	
}








}