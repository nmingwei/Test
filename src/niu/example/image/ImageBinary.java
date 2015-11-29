package niu.example.image;

import java.io.File;  
import java.io.FileInputStream;  
import java.io.FileNotFoundException;  
import java.io.FileOutputStream;  
import java.io.IOException;  
  
public class ImageBinary  {  
    public static void main(String[] args)  
    {  
        String path = "F:/256t2.bmp";  
        File file = new File(path);  
        FileInputStream fis;  
        try  
        {  
            fis = new FileInputStream(file);  
            byte[] b;  
            b = new byte[fis.available()];  
            StringBuilder str = new StringBuilder();// 不建议用String  
            fis.read(b);  
            for (byte bs : b)  
            {  
                str.append(Integer.toBinaryString(bs));// 转换为二进制  
            }  
            System.out.println(str);  
            File apple = new File("F:/test2.bmp");// 把字节数组的图片写到另一个地方  
            FileOutputStream fos = new FileOutputStream(apple);  
            fos.write(b);  
            fos.flush();  
            fos.close();  
        }  
        catch (FileNotFoundException e)  
        {  
            e.printStackTrace();  
        }  
        catch (IOException e)  
        {  
            e.printStackTrace();  
        }  
    }  
}  
