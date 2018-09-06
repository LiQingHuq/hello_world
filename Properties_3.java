import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;

public class Properties_3 {

	public Properties_3() {
		// TODO 自动生成的构造函数存根
	}
public static void main(String[] args) throws IOException {
	File f=new File("a.txt");
	if(!f.exists()){
		f.createNewFile();
	}
	BufferedReader bd=new BufferedReader(new FileReader(f));
	
	Properties p=new Properties();
	p.load(bd);
	p.setProperty("3", "清华大咖");
	
	BufferedWriter bw=new BufferedWriter(new FileWriter(f));
	p.store(bw, "ID+Name");
	
}
}
