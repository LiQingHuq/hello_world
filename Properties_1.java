import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Properties_1 {

	public Properties_1() {
		// TODO 自动生成的构造函数存根
	}
public static void main(String[] args) throws IOException {
	Properties p=new Properties();
	p.setProperty("1","jack");
	p.setProperty("2","tom");
	p.setProperty("3","jk");
	p.setProperty("4","jb");
	p.setProperty("1", "李青华");
	BufferedOutputStream bos=new BufferedOutputStream( new FileOutputStream("a.txt"));
	p.store(bos, "id+name");
	bos.close();
	BufferedWriter bos1=new BufferedWriter( new FileWriter("a1.txt"));
	p.store(bos1, "Id+name");
//	Set<String> ss=p.stringPropertyNames();
//	for(String st:ss){
//		String value=p.getProperty(st);
//		System.out.println("id："+st+"\tname："+value);
//	}
}
}
