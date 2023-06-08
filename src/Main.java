import java.io.File;
import java.util.HashMap;
import java.util.concurrent.ForkJoinPool;

public class Main {

    public static void main(String[] args) {

        String folderPath = "C:/Users/proximacc/Desktop/webinar";

        File file = new File(folderPath);
        Node root = new Node(file);

        FolderSizeCalculator calculator =  new FolderSizeCalculator(root);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(calculator);
        System.out.println(root);

    }

}
