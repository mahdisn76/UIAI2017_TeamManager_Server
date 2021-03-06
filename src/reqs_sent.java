import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

/**
 * Created by MSN on 5/30/2017.
 */
public class reqs_sent {
    public static void send(PrintWriter out, String path , String TeamName)
    {
        String reqs_sent="";
        try {
            File file = new File(path + "//" + TeamName +"//reqs_received.txt");
            if(!file.exists())
                file.createNewFile();
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line="";
            while((line=br.readLine())!=null)
            {
                if(!reqs_sent.isEmpty())
                    reqs_sent+=",";
                reqs_sent+=line;
            }
            br.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        out.println(reqs_sent);
        out.flush();
    }
}
