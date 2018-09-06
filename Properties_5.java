import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Properties_5 {

	public Properties_5() {
		// TODO 自动生成的构造函数存根
	}
	
	
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("D:\\workspace");
		List<File> lf=new ArrayList<File>();
		FilenameFilter ff=new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO 自动生成的方法存根
				return name.endsWith(".java");
			}
		};
		Read(f,ff,lf);
		File fe=new File("a.txt");
		WriterToFile(lf, fe);
	}
	
	
	
  public static void Read(File f,FilenameFilter ff,List<File>  lf) throws FileNotFoundException{
	  File[] fe=f.listFiles();
      for(File fi:fe)
      { //深度遍历
    	  if(fi.isDirectory())
    		  Read(fi, ff, lf);
    	  //对遍历到的数据进行遍历过滤
    	  else
    		  if(ff.accept( f, fi.getName())){
    			  lf.add(fi);
    		  }
    		  
      }
  }
  public static  void  WriterToFile(List<File> lf,File fe ) throws IOException{
	  BufferedWriter dw=new BufferedWriter(new FileWriter(fe));
	  for(File f:lf){
		  dw.write(f.getAbsolutePath());
		  dw.newLine();
		  dw.flush();
		 
	  }
		  
	
  }
}
