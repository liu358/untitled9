package 输入输出流;


import java.io.*;

public class AnalysisResult {
    public static void main(String args[]){
        File fRead=new File("C:\\Users\\LIU  YAN  PING\\Desktop\\新建文件夹\\score.txt");
        File fWrite=new File("C:\\Users\\LIU  YAN  PING\\Desktop\\新建文件夹\\scoreAnalyze.txt");
        try {Writer out = new FileWriter(fWrite, true);
            BufferedWriter bufferWrite = new BufferedWriter(out);
            Reader in = new FileReader(fRead);
            BufferedReader bufferRead = new BufferedReader(in);
            String str = null;
            while ((str = bufferRead.readLine()) != null) {
                double totalScore=Fenxi.getTotalScore(str);
                double averageScore=Fenxi.getAverageScore(str);

                str=str+"总分：" +totalScore;
                str=str+"平均分" +averageScore;

                System.out.println(str);
                bufferWrite.write(str);
                bufferWrite.newLine();
            }
            bufferRead.close();
            bufferWrite.close();        }
        catch(IOException e){
            System.out.println(e. toString());
        }
    }
}
