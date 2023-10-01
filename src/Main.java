import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Operations operations = new Operations();
        float v1_point1[] = new float[2], v1_point2[] = new float[2];//Координаты 1 вектора
        float v2_point1[] = {1, 1}, v2_point2[] = {2, 2};//Координаты 2 вектора
        Scanner in = new Scanner(System.in);
        // Ввод координат вектора1
        System.out.printf("Введите координаты вектора.\nПервая точка: ");
        for (int i=0; i<2; i++)
            v1_point1[i] = in.nextFloat();
        System.out.printf("Вторая точка: ");
        for (int i=0; i<2; i++)
            v1_point2[i] = in.nextFloat();
        // Создание двух векторов
        Vector vec1 = new Vector(v1_point1[0], v1_point1[1], v1_point2[0], v1_point2[1]);
        Vector vec2 = new Vector(1, 1, 2, 2);
        // Через класс opertions производятся действия с векторами
        operations.getSumm(vec1, vec2);
    }
}