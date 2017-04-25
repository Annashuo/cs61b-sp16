import java.io.*;
import java.util.*;
public class Year{
	public static void main(String[] args){
		//Scanner reader = new Scanner(System.in);
		//int year = reader.nextInt();
		int year = Integer.parseInt(args[0]);
		
		//int year = 2001;
		if(year%400==0||(year%4==0&&year%100!=0))
			System.out.println(year+" is a leap year.");
		else
			System.out.println(year+" is not a leap year.");
	}
}