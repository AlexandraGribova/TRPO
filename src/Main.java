import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args){
        Operations operations = new Operations();
        String line;
        float[][] vectors = new float[4][2];
        // считывание из файла
        try {
            FileInputStream fis = new FileInputStream("C:/Users/sasha/IdeaProjects/project1/src/input.txt");
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            for(int j=0; (line=br.readLine())!=null; j++)
            {
                String[] str = line.split(" ");
                for(int i=0; i<str.length; i++)
                    vectors[j][i] = Float.parseFloat(str[i]);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        // Создание двух векторов
        Vector vec1 = new Vector(vectors[0][0],vectors[0][1], vectors[1][0], vectors[1][1]);
        Vector vec2 = new Vector(vectors[2][0], vectors[2][1], vectors[3][0], vectors[3][1]);
        Vector vec_result = new Vector();
        // Операции с векторами
        vec_result = operations.getSum(vec1, vec2);
        // Вывод в файл
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write("Результат суммы векторов:\n");
            writer.write(Float.toString(vec_result.vec_x));
            writer.write(" ");
            writer.write(Float.toString(vec_result.vec_y));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}