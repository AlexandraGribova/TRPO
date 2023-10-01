import org.jetbrains.annotations.NotNull;

public class Operations {

    // Сложение
    public Vector getSum(@NotNull Vector vec1, @NotNull Vector vec2) {
        return new Vector(vec1.vec_x + vec2.vec_x, vec1.vec_y + vec2.vec_y);
    }

    // Вычитание
    public Vector getSubtract(@NotNull Vector vec1, @NotNull Vector vec2) {
        return new Vector(vec1.vec_x - vec2.vec_x, vec1.vec_y - vec2.vec_y);
    }

    // Угол между вектором и ОХ или параллельной ей прямой
    public double getCorner(@NotNull Vector vec) {
        if (Exception.divByZero(vec.vec_x)) {
            return Math.atan(vec.vec_y / vec.vec_x);
        }
        return Math.PI / 2;
    }

    // Угол между двумя векторами
    public double getCornBetween(@NotNull Vector vec1, @NotNull Vector vec2) {
        if (Exception.divByZero(vec1.vec_x) && Exception.divByZero(vec2.vec_x)) {
            if (vec1.vec_y > vec2.vec_y) {
                return getCorner(vec1) - getCorner(vec2);
            } else if (vec1.vec_y < vec2.vec_y) {
                return getCorner(vec2) - getCorner(vec1);
            } else return 0;
        } else if (Exception.divByZero(vec1.vec_x)) {
            if (vec2.vec_y > 0) {
                return Math.PI / 2 - getCorner(vec1);
            } else return Math.PI + getCorner(vec1);
        } else {
            if (vec1.vec_y > 0) {
                return Math.PI / 2 - getCorner(vec2);
            } else return Math.PI / 2 + getCorner(vec2);
        }
    }

    // Модуль вектора
    public double getModulus(@NotNull Vector vec) {
        return Math.sqrt(Math.pow(vec.vec_x, 2) + Math.pow(vec.vec_y, 2));
    }

    // Скалярное произведение векторов
    public double getMultiply(@NotNull Vector vec1, @NotNull Vector vec2) {
        return getModulus(vec1) * getModulus(vec2) * Math.sin(getCornBetween(vec1, vec2));
    }

    // Умножение вектора на число (растяжение, сужение)
    public Vector getMultiByConst(@NotNull Vector vec, float k) {
        return new Vector(vec.vec_x * k, vec.vec_y * k);
    }

}
