package com;

import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class ReadData {
 
	WebDriver dr;
@Test(dataProvider="xldata")
public void test1(Object u,Object p)
{
	dr.findElement(By.id("email")).sendKeys(u.toString());
	dr.findElement(By.id("pass")).sendKeys(p.toString());
	}

public static Properties readProperty() throws IOException
{
	f=new File("/Users/bittechconsulting/eclipse-workspace/new/TestNGFrameWork/config.properties");
	fi = new FileInputStream(f);
	Properties p=new Properties();
	p.load(fi);
	return p;
}


@Test
public void readTxt() throws IOException{
	StringBuffer s = null;
	try {
		FileReader f=new FileReader(new File("/Users/bittechconsulting/Desktop/BTC190121E/TestNGFrameWork/hello.txt"));
		BufferedReader r=new BufferedReader(f);
		 s=new StringBuffer();
		String line=r.readLine();
		while(line!=null)
		{
			s.append(line).append(System.lineSeparator());
			line=r.readLine();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		System.out.println(e.getMessage());
		System.out.println("continue");
	}
	System.out.println(s);
	
}











static File f;
XSSFWorkbook book;
static FileInputStream fi;
XSSFSheet sheet;
Object [][] datas;
	@DataProvider(name="xldata")
	public Object[][] readXlSheet() throws IOException 
	{
		
		try {
			f=new File("/Users/bittechconsulting/eclipse-workspace/new/TestNGFrameWork/book.xlsx");
			fi = new FileInputStream(f);
			book = new XSSFWorkbook(fi);
			 sheet=book.getSheetAt(0);
			//sheet.getRow(1).getCell(1).getStringCellValue();
			int cell=sheet.getRow(0).getLastCellNum();
			int row=sheet.getLastRowNum();
			 datas=new Object[row][cell];
			for(int i=1;i<row;i++)
			{
				for(int j=0;j<cell;j++)
				{
					//System.out.println(sheet.getRow(i).getCell(j));
					XSSFCell c=sheet.getRow(i).getCell(j);
					switch(c.getCellType())
					{
					case XSSFCell.CELL_TYPE_NUMERIC:
					{
						System.out.println(c.getNumericCellValue());
						datas[i-1][j]=c.getNumericCellValue();
					}
					case XSSFCell.CELL_TYPE_STRING:
					{
						System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
						datas[i-1][j]=c.getStringCellValue();
					}
					}
				}
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("file not found");
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("file not straming");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("file path not found");
		}
		
		finally
		{
			if(fi!=null)
			{
				fi.close();
			}
			if(book!=null)
			{
				book.close();
			}
		}
		
		return datas;
		
	}
	
	
	
	
	
  @DataProvider(name="login")
  public Object[][] dp() {
	  Object[][] o=new Object[2][2];
	  o[0][0]=8;
	  o[0][1]=8;
	  o[1][0]=8;
	  o[1][1]=8;
	 return o;
	  
//    return new Object[][] {
//      new Object[] { 1, "a" },
//      new Object[] { 2, "b" },
//    };
  }
}
