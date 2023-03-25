import java.io.InputStream; import java.util.Scanner;

public class dict {

    public static void main(String[] args){

        while(true){
            System.out.print("请输入你查找的单词");
            Scanner sc = new Scanner(System.in);
            String word = sc.nextLine();
            if (word.isEmpty()) {
                break;
            }
            InputStream is = dict.class.getResourceAsStream("words.txt");
            Scanner sc2 = new Scanner(is);
            boolean found = false; // 是否找到单词
            while (sc2.hasNextLine()) {
                String line = sc2.nextLine();
                String[] subs = line.split("\t");
                if (subs.length == 2) {
                    String left = subs[0];
                    String right = subs[1];
                    if (word.equals(left)) {
                        System.out.println(line);
                        found = true;
                        break;
                    }
                }
            }
            if (!found) { // 如果没有找到单词
                System.out.println("对不起，没有找到这个单词。");
            }
        }
    }
}




