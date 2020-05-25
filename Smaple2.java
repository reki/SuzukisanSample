import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Smaple2 {

  public static void main(String[] args)throws IOException {

   String[] hands = { "グー", "チョキ", "パー" };
      String owari = "おしまい";

   System.out.println("「グー」「チョキ」「パー」を入力して下さい。");
   System.out.println("終わるときは、「おしまい」と入力して下さい。");

   int won = 0;
   int lose = 0;

   while(true) {

    System.out.println("じゃんけん、、、、");

    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String yourhands = br.readLine();

       Random r = new Random();
          String pchands = hands[r.nextInt(3)];

          if (yourhands.equals(pchands)){
           System.out.println("パソコンは" + pchands + "です。あいこです。");
          }
          else if((yourhands .equals(hands[0]) && pchands.equals(hands[1])) &&
               (yourhands.equals(hands[1]) && pchands.equals(hands[2])) &&
                  (yourhands.equals(hands[2]) && pchands.equals(hands[0]))){
               System.out.println("パソコンは" + pchands + "です。あなたの勝ちです。");
                won +=1;
          }

          else if((yourhands.equals(hands[0]) && pchands.equals(hands[2])) &&
               (yourhands .equals(hands[1]) && pchands.equals(hands[0])) &&
               (yourhands.equals(hands[2])&& pchands.equals(hands[1]))) {
               System.out.println("パソコンは"+ pchands +"です。 あなたの負けです。");
               lose +=1;
          }

          else if( yourhands.equals(owari)) {
               System.out.println ("ゲーム終了");
               System.out.println ("あなたは"+ won +"勝"+ lose +"敗です。");
              break;
          }
          else{
           System.out.println("error");
          }

          }
   }
  }
