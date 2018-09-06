import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Properties_2 {

	public Properties_2() {
		// TODO 自动生成的构造函数存根
	}
public static void main(String[] args) throws IOException {
	Properties p=new Properties();
	BufferedReader br=new BufferedReader(new FileReader("a1.txt"));
	p.load(br);
	System.out.println(p);
	
	BufferedInputStream bir=new BufferedInputStream(new FileInputStream("a.txt"));
	p.load(bir);
	System.out.println(p);
}
}
