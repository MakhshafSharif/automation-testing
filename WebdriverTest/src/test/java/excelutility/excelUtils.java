package excelutility;

public class excelUtils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String projectPath = System.getProperty("name.dir");
        excelutility excel = new excelutility(projectPath+"/excel/data.xlsx" , "Sheet1");
        
        excelutility.getRowCount();
        excelutility.getCellDataString(0, 0);
        excelutility.getCellDataNumber(1, 1);
	}

}
