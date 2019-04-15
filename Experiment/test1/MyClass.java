import java.io.*;
public class MyClass
{
private int val1,val2;
    public void myFun(int x,int y)
{
         val1=x;
         val2=y;
         System.out.println("the sum is "+(val1+val2));
     }

     public static void main(String arg[])
     {
         MyClass MyObj=new MyClass();
         MyObj.myFun(3,4);
     }
 }
/*
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class MyClass {
    public static void main(String[] args) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy.MM.dd");
        String str = "2016.11.01";
        Date date2=new Date();
        try {
            date2 = df.parse(str);
            System.out.println(date2);
        }catch (ParseException e){
            System.out.println("Unparseable using"+df);
        }

        Date now = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat ("MM");

        System.out.println("Current Date: " + ft.format(date2));
        int m = Integer.valueOf(ft.format(date2)).intValue();
        System.out.println(m>7);
        // //默认输出格式
        // Date date=new Date();
        // System.out.println(date);//Fri Oct 27 16:56:37 CST 2017
        // //日期格式化显示，首先定义格式
        // SimpleDateFormat sdf1=new SimpleDateFormat("yyyyMMdd");//显示20171027格式
        // SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd");//显示2017-10-27格式
        // SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//显示2017-10-27 10:00:00格式
        // SimpleDateFormat  sdf4=new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");//显示2017年10月27日10时00分00秒格式

        // SimpleDateFormat sdf =  new SimpleDateFormat( "yyyy-MM-dd" );
        // date = sdf.parse( "2008-07-10" );
        // SimpleDateFormat t = new SimpleDateFormat("MM");
        // System.out.println(t.format(date));

        // //将格式应用于日期
        // System.out.println(sdf1.format(date));//20171027
        // System.out.println(sdf2.format(date));//2017-10-27
        // System.out.println(sdf3.format(date));//2017-10-27 17:11:13
        // System.out.println(sdf4.format(date));//2017年10月27日17时11分13秒
    }
}
*/
