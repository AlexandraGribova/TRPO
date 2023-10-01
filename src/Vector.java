public class Vector {
    // координаты точки 1
    float point1_x, point1_y;
    // координаты точки 2
    float point2_x, point2_y;
    // координаты вектора
    float vec_x, vec_y;

    // Конструктор для инициализации вектора по координате вектора
    Vector(float vec_x, float vec_y)
    {
        this.vec_x = vec_x;
        this.vec_y = vec_y;
    }
    // Конструктор для инициализации вектора по координатам двух точек
    Vector(float point1_x,float point1_y, float point2_x, float point2_y)
    {
        this.point1_x = point1_x;
        this.point1_y = point1_y;
        this.point2_x = point2_x;
        this.point2_y = point2_y;
        coordinate();
    }
    // нахождение координат вектора по его точкам
    private void coordinate(){
        this.vec_x = this.point2_x - this.point1_x;
        this.vec_y = this.point2_y - this.point1_y;
    }


}
