import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class test1 {

	/**
	 * @param args
	 * @throws IOException 
	 * this is Hyun ver1.1
	 */
	public static void main(String[] args) throws IOException {	


		InputStreamReader str = new InputStreamReader(System.in);
		BufferedReader str2 = new BufferedReader(str);

		System.out.println("ã����� ���ڿ��� �Է��ϼ���");
		String userStr = str2.readLine();

		System.out.println("����� �Է��� ���ڴ� "+userStr+" �Դϴ�.");

		BufferedReader b = new BufferedReader(new FileReader("c:/kor.txt"));


		String line;
		boolean tf = false;
		int i = 1;
		while ( (line = b.readLine()) != null ) 			  
		{
			if(line.equals(userStr)){
				System.out.println("����� ã�� ���� ���� "+i+"���ο� �ֽ��ϴ�.");
				tf= true;
			}else {					  
			}				  
			i++;
		}

		if(!tf){
			System.out.println("����� ã�� ���ڿ��� �����ϴ�.");
		}
	}
}
