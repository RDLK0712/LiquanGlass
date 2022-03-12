/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LiquanGlass;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 *
 * @author User
 */
public class model {
   public String splitpath(String path,String x) {
        
        String str="";

        File f = new File(path+"webapp\\img\\LiquanGlass_image\\"+x+"\\");
        String[] list1 = f.list();
        for(int i=0;i<list1.length;i++)
        {
            str+="img\\LiquanGlass_image\\"+x+"\\"+list1[i]+","+"\n";
        }  

        str=str.substring(0,str.length()-2);
        return str;
    }
    public void savefile(String content,String path,String name){
        BufferedWriter fw = null;
        try {
          File file = new File(path+"java\\LiquanGlass\\"+name+".csv");
          fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, false), "UTF-8")); // 指點編碼格式，以免讀取時中文字符異常
          fw.write(content);
          fw.flush(); 
        } catch (Exception e) {
          e.printStackTrace();
        } finally {
            if (fw != null) {
              try {
                fw.close();
              } catch (IOException e) {
                e.printStackTrace();
              }
            }
        }
    }
}
