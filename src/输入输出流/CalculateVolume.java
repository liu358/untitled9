package 输入输出流;


    import java.io.File;
import java.io.*;
import java.util.*;
    public class CalculateVolume  {
        public static void main(String args[]){
            File fRead=new File("C:\\Users\\LIU  YAN  PING\\Desktop\\新建文件夹\\goods.txt");
            File fWrite=new File("C:\\Users\\LIU  YAN  PING\\Desktop\\新建文件夹\\goodsVolume.txt");
            try{
                    Writer out=new FileWriter(fWrite, true);
                BufferedWriter bufferWrite=new BufferedWriter (out);
                Reader in=new FileReader(fRead);
                BufferedReader bufferRead=new BufferedReader (in);

                String str = null;

                while ((str = bufferRead.readLine()) != null) {

                    double s = Jisuan.getVolume(str);
                    str = str + "体积：" + s + "cm3";
                    System.out.println(str);
                    bufferWrite.write(str);
                    bufferWrite.newLine();
                }
                    bufferRead.close();
                    bufferWrite.close();

            }
            catch(IOException e){
                System.out.println(e.toString());
            }

        }
    }


