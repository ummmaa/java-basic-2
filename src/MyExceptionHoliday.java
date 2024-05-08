import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyExceptionHoliday {
    public static void main(String[] args){
        MyExceptionHoliday myE = new MyExceptionHoliday();
    }

    MyExceptionHoliday(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.println("何日ですか？");
            String line = reader.readLine();
            int day = Integer.parseInt(line);
            System.out.println(line + "日ですね");

            test(day);
        }
        catch(IOException e) {
            System.out.println(e);
        } catch (NoHolidayException e){
            e.printStackTrace();
        }
    }

    void test(int day) throws NoHolidayException{
        if(day==1 || day==2 || day==7 || day==8 || day==9 || day==10 || day==13 || day==14 || day==15 || day==16 || day==17 || day==20 || day==21 || day==22 || day==23 || day==24 || day==27 || day==28 || day==29 || day==30 || day==31){
            throw new NoHolidayException();
        }
    }
}
