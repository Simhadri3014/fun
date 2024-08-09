import java.util.logging.Logger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/** 
   *@author Simhadri
 */
public class StringComparing {
 private static final Logger log=Logger.getLogger(StringComparing.class.getName());
 private BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
/**
   *@param args
 */
     public static void main(String[] args) throws IOException
      {
	StringComparing f=new StringComparing();
	while(true)
         { 
	   log.info("select \"run\" to run the program, \"exit \" to exit the program: ");
  	   String option=f.br.readLine();
           switch(option)
            {
              case "run" :
	        f.userInput();
                break;
              case "exit" :
                return;  
            }
          }     
       }
      void userInput() throws IOException
       {  
         List<String> string=new ArrayList<>();  
         String str;
         while(!(str=br.readLine()).equals("exit"))
	  {
            string.add(str);
          }
         string.add("exit");
         for(String each:string)
          {
            log.info(each);
          }
     
         log.info("The size is "+String.valueOf(string.size()));
       }
  }
          