package com;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

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
	
	@DataProvider(name="xldata")
	public Object[][] readXlSheet() throws IOException
	{
		File f=new File("/Users/bittechconsulting/eclipse-workspace/new/TestNGFrameWork/book.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook book=new XSSFWorkbook(fi);
		XSSFSheet sheet=book.getSheetAt(0);
		//sheet.getRow(1).getCell(1).getStringCellValue();
		int cell=sheet.getRow(0).getLastCellNum();
		int row=sheet.getLastRowNum();
		Object [][] datas=new Object[row][cell];
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
