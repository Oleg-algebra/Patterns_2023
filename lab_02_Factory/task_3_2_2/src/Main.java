import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> fileInput = new ArrayList<>();
        fileInput.add("task_3_2_2/input01.txt");
        fileInput.add("task_3_2_2/input02.txt");
        fileInput.add("task_3_2_2/input03.txt");
        Student student = new Student();
        for(String fileName : fileInput){
            student.solveTask(fileName);
            //student.showReportToConsole();
            System.out.println("------input01.txt-------");
            student.showMinMaxRoots();
            try {
                String partName = fileName.split("\\.")[0];
                student.writeReportFile(partName+"_solution.txt");
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }


    }

}

