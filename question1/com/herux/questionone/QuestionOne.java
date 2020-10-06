package question1.com.herux.questionone;

import java.util.ArrayList;

public class QuestionOne {

    public static void main(String[] args) {

        int count = Integer.valueOf(args[0]);
        ArrayList<String> arr = new ArrayList<>();
        for (var i=1; i <= count; i++) {
            arr = new ArrayList<>();
            for (var j=1; j <= count; j++) {
                int row = count - i;
                if (j > row){
                    arr.add("#");
                }else{
                    arr.add(" ");
                }
            }
            System.out.println(String.join(" ", arr));
        }
    }

}