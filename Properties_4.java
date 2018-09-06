import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Properties_4 {

	public Properties_4() {
		// TODO 自动生成的构造函数存根
	}
public static void main(String[] args) throws IOException {
	Add_first();
}
private static void Add_first() throws IOException {
	// TODO 自动生成的方法存根
	  File f=new File("ab.properties");
	  if(!f.exists())
		  f.createNewFile();
	  BufferedReader br=new BufferedReader(new FileReader(f)) ;
	  Properties p=new Properties();
	  p.load(br);
	  
	 String s=p.getProperty("time");
	 int count=0;
	 if(s!=null)
	 {
		 count=Integer.parseInt(s.trim());
		 if(count>=5)
			 throw new RuntimeException("五次免费使用完，请给钱。买正版");
	 }
	 count++;

	 p.setProperty("time", count+"  ");
	 BufferedWriter bw=new BufferedWriter(new FileWriter(f));
	 p.store(bw, "次数");
	 bw.close();
	 br.close();
}
}
