package common.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileUtlis {

    public static void main(String[] args) throws IOException {
        File file = new File("./src/main/resources/data.ini");
        System.out.println(file.exists());
        InputStream inputStream=new FileInputStream(file);


//        FileUtlis FileUtlis =new FileUtlis();
//        FileUtlis.localConversionPath("");
//        System.out.println("path4:" +System.getProperty("user.dir"));
//        System.out.println(FileUtlis.class.getClassLoader().getResourceAsStream("data.ini"));
//        File file = new File(System.getenv("USERPROFILE")
//                +"\\AppData\\Local\\Google\\Chrome\\User Data\\Default");
//        System.out.println(file.getPath());
//        System.out.println(file.exists());
//        System.out.println(file.getCanonicalPath());
    }




    public String localConversionPath(String relativePath){
        System.out.println(FileUtlis.class.getClassLoader().getResource("").getPath());
//        System.out.println(Thread.currentThread().getContextClassLoader().getResourceAsStream("data.ini"));
////        String path = this.getClass().getClassLoader().getResource("./data.ini").getPath();
//        System.out.println(FileUtlis.class.getResource("/").getPath());
//        System.out.println(FileUtlis.class.getClassLoader().getResourceAsStream("./data.ini"));
////        System.getProperty("user.dir")+"\\src\\main\\java";
//        File file = new File(relativePath);
        return  "";
    }



}

