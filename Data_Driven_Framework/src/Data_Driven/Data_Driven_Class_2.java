package Data_Driven;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Data_Driven_Class_2 {
	@Test (dataProvider="Test")
	public void add(String val1,String val2, String val3)
	{
		//Second Commit
		//Third commit
		
		try{
			int result;
			int a=Integer.parseInt(val1);
			int b=Integer.parseInt(val2);
			int c=Integer.parseInt(val3);
		result=a+b+c;
		//String str=Integer.toString(result);
		
		System.out.println(result);
		}
		
		catch (NumberFormatException e)
		{
			System.out.println("Null Values");
		}
		
		
	}
@DataProvider(name="Test")
	public Object[][] readExcel() throws BiffException, IOException {
	
		File file=new File("D:/Test.xls");
		Workbook book=Workbook.getWorkbook(file);
		Sheet sheet=book.getSheet("Sheet2");
		int row=sheet.getRows();
		int col=sheet.getColumns();
		System.out.println(row);
		System.out.println(col);
		String input[][]=new String[row][col];
		//int a=0;
		for(int i=0;i<row;i++)
		{
			
			//if(a==0  && a<row)
			//{
			for(int j=0;j<col;j++)
			{
				Cell c=sheet.getCell(j,i);
				input[i][j]=c.getContents();
				System.out.print(input[i][j] + " ");
				
			}
			//}
			//a++;
			System.out.println();
		}
		
		return input;
	}

}
