public class NoHolidayException extends Exception {
    public void printStackTrace(){
        super.printStackTrace();
        System.out.println("ドンマイ！この日は平日だよ！たくさん働いてね！");
    }
}
