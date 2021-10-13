package test;


import java.io.*;

public class test {
    public static void main(String[] args){
        if(args.length == 0) {
            System.out.println("Please input file name.");
            return;
        } else {
            for(int i=0; i<args.length; i++){
                File file = new File(args[i]);
                run(file);
            }
        }
    }

    /* methods */
    private static void run(File file){
        try{
            /* variable */
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            /* Read file and Output */
            String str;
            while( true ){
                str = br.readLine();
                if(str == null)break;
                System.out.println(str);
            }

            br.close();
        } catch(FileNotFoundException e) {
            System.out.println("cat: "+file+": "+"No such file or directory");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
