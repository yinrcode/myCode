package cn.Text00.file;

import java.io.File;

/**
 * ����Ŀ¼�е��ļ�
 * @author YR
 *
 */
public class fileList {
    public static void main(String[] args) {
	String src = "E:\\ѧϰ�ĵ�\\API";
	File file = new File(src);
	fileTest(file);
    
    
    }
    public static void fileTest(File file){
	
	if(file.isFile()){
	    System.out.println("�ļ��ǣ�"+file.getName());
	}
	else if(file.isDirectory()){
	    System.out.println("�ļ��У�Ŀ¼�ǣ�"+file.getName());
	    File f[] = file.listFiles();
	    for(int i = 0;i<f.length;i++){
		fileTest(f[i]);
	    }
	}
    
	
    }
}