import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;

/**
 * @author 3次之后购买正版
 *
 */
public class Properties_4_1 {

	public Properties_4_1() {
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) throws IOException {
		File f=new File("p.properties");	
		if(!f.exists())
			f.createNewFile();
		save(f);
	}
	private static void save(File f) throws IOException {
		// TODO 自动生成的方法存根
		
		BufferedReader br=new BufferedReader(new FileReader(f));
		Properties p=new Properties();
		p.load(br);
		String s=p.getProperty("time");
		int count=0;
		
		if(s!=null){
			count=Integer.parseInt(s.trim());
			if(count>3)
				throw new RuntimeException("三次机会用完，大侠请购买正版！！！");
		}
		
		count++;
		p.setProperty("time", count+" ");
		BufferedWriter bw=new BufferedWriter(new FileWriter(f));
		p.store(bw, "次数");
		bw.close();
		br.close();
	}
 } 