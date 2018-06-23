package study.liangyehong.android.httpurlconnection;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/**
 * Created by Curtain_Liang on 2018/6/23.
 */

public class StreamTools {

    //把一个inputStream 转换成一个String
    public static String readStream(InputStream in) throws Exception{

        //定义一个内存输出流
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int len = -1;
        byte[] buffer = new byte[1024]; //1kb
        while((len=in.read(buffer))!=-1){

            baos.write(buffer, 0, len);
        }
        in.close();
        String content = new String(baos.toByteArray());

        return content;

    }
}
