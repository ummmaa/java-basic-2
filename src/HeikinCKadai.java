import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class HeikinCKadai {
    public static void main(String[] args) {
        HeikinCKadai kadai = new HeikinCKadai();
        kadai.setScores();
        kadai.calcAverage();
        kadai.pass();
    }

    private Kamoku[] scores;
    private final int N = 100;

    public HeikinCKadai(){
        scores = new Kamoku[N];
    }

    public void setScores(){
        Random random = new Random();
        for(int i = 0; i < 100; i ++){
            int score = random.nextInt(101);
            scores[i] = new Kamoku(score);
        }
    }

    public void calcAverage(){
        int sum = 0;
        for(Kamoku score : scores){
            sum += score.getScore();
        }
        System.out.println("平均点は" + sum/N);
    }

    public void pass(){
        ArrayList<Kamoku> passMember = new ArrayList<Kamoku>();
        for(Kamoku score : scores){
            if(score.getScore() > 80){
                passMember.add(score);
            }
        }
        Comparator<Kamoku> compare = Comparator.comparing(Kamoku::getScore);
        passMember.sort(compare);

        System.out.println("以下、合格者の点数です。");
        for(Kamoku score : passMember){
            System.out.println(score.getScore() + "点");
        }
    }
}
