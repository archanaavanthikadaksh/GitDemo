package ExcelRead;

import java.io.FileNotFoundException;
import java.io.IOException;

public class StaticExcelMain 
{

	public static void main(String[] args)throws IOException,FileNotFoundException
	{
		StaticExcelCode.ExcelCode();
		String str=StaticExcelCode.readData(0, 0);
		System.out.println(str);
		String str1=StaticExcelCode.readData(0,1);
		System.out.println(str1);
		String str2=StaticExcelCode.readData(0,2);
		System.out.println(str2);
		System.out.println();
		String str3=StaticExcelCode.readData(1,0);
		System.out.println(str3);
		String str4=StaticExcelCode.readData(1,1);
		System.out.println(str4);
		String str5=StaticExcelCode.readData(1,2);
		System.out.println(str5);
		}
	}