import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



/**
 * Book
 */
public class Book {

    String title;
    Date pdate;
    long words;
    final SimpleDateFormat date_form = new SimpleDateFormat("yyyy.MM.dd");

    Book(String t, String d, long w) {
        title = t;
        words = w;
        // str to date
        try {
            pdate = date_form.parse(d);
        } catch (ParseException e) {
            System.out.println("The date format should like \"2019.04.19\"");
        }
    }
    double getPrice() {
        int month;
        SimpleDateFormat t_df = new SimpleDateFormat("MM");
        month = Integer.valueOf(t_df.format(pdate)).intValue();
        // System.out.println(month);
        if (month <= 6) {
            return words/1000.0*35.0*1.2;
        }
        else {
            return words/1000.0*35.0*1.18;
        }
    }
}