package utilities;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readandwriteExcel {
	

	public static void main(String[] args) throws InvalidFormatException, IOException {
	
        


                //                D:\SL\mydata\LoginData.xlsx

                FileInputStream inputStream = new FileInputStream("C:\\Users\\laksh\\Documents\\phase2Project.xlsx");

                Workbook workbook = WorkbookFactory.create(inputStream);

                Sheet sheet = workbook.getSheet("Login");

                int lastRowNum = sheet.getLastRowNum();   //for 5 rows  lastRowNum =4

                //                 for cnt = 1 to  lastRowNum


                for (int cnt = 1; cnt <= lastRowNum; cnt++) {

                        Row row1 = sheet.getRow(cnt);  //1,2,3,4 is Data   .   0 is Header

                        Cell cellUN = row1.getCell(1);

                        String stringUN = cellUN.getStringCellValue();

                        System.out.println(stringUN);


                        Cell cellPWD = row1.getCell(2);

                        String stringPWD = cellPWD.getStringCellValue();

                        System.out.println(stringPWD);


                        Cell cellRes = row1.createCell(3);

                        cellRes.setCellValue("PASS");


                }

                

//                FileOutputStream fos = new FileOutputStream("D:\\SL\\mydata\\ResultLogin.xlsx");
//
//                workbook.write(fos);



        }

}
