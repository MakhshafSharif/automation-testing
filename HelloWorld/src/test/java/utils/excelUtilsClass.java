package utils;

public class excelUtilsClass {
	static ExcelUtils excel;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String projectPath = System.getProperty("user.dir");
		excel = new ExcelUtils(projectPath+"/excel/data.xlsx" , "Sheet1");
        
        excel.getRowCount();
        excel.getCellDataString(0, 0);
        excel.getCellDataNumber(1, 1);
	}
	}

