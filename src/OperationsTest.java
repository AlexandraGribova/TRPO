import org.junit.jupiter.api.*;

class OperationsTest {

    Operations operations = new Operations();

    @Test
    @DisplayName("Get vectors sum")
    void getSum() {
        Vector vector = new Vector(1, 3);
        Vector vector1 = new Vector(6, 8);
        Vector vector2 = new Vector(13, 9);
        Vector vector3 = new Vector(-76, 56);
        Vector vector4 = new Vector(18, 42);

        Vector actual1 = new Vector(7, 11);
        Vector actual2 = new Vector(14, 12);
        Vector actual3 = new Vector(-75, 59);
        Vector actual4 = new Vector(19, 45);
        Vector expected1 = operations.getSum(vector, vector1);
        Vector expected2 = operations.getSum(vector, vector2);
        Vector expected3 = operations.getSum(vector, vector3);
        Vector expected4 = operations.getSum(vector, vector4);
        Assertions.assertEquals(expected1.toString(), actual1.toString());
        Assertions.assertEquals(expected2.toString(), actual2.toString());
        Assertions.assertEquals(expected3.toString(), actual3.toString());
        Assertions.assertEquals(expected4.toString(), actual4.toString());
    }

    @Test
    @DisplayName("Get vectors subtract")
    void getSubtract() {
        Vector vector = new Vector(1, 3);
        Vector vector1 = new Vector(6, 8);
        Vector vector2 = new Vector(13, 9);
        Vector vector3 = new Vector(-76, 56);
        Vector vector4 = new Vector(18, 42);

        Vector actual1 = new Vector(-5, -5);
        Vector actual2 = new Vector(-12, -6);
        Vector actual3 = new Vector(77, -53);
        Vector actual4 = new Vector(-17, -39);
        Vector expected1 = operations.getSubtract(vector, vector1);
        Vector expected2 = operations.getSubtract(vector, vector2);
        Vector expected3 = operations.getSubtract(vector, vector3);
        Vector expected4 = operations.getSubtract(vector, vector4);
        Assertions.assertEquals(expected1.toString(), actual1.toString());
        Assertions.assertEquals(expected2.toString(), actual2.toString());
        Assertions.assertEquals(expected3.toString(), actual3.toString());
        Assertions.assertEquals(expected4.toString(), actual4.toString());
    }

    @Test
    @DisplayName("Get corner between vector and OX")
    void getCorner() {
        Vector vector1 = new Vector(1, 1);
        double actual1 = Math.atan(1F);
        double expected1 = operations.getCorner(vector1);
        Assertions.assertEquals(expected1, actual1);

        Vector vector2 = new Vector(5, 2);
        double actual2 = Math.atan(2F / 5);
        double expected2 = operations.getCorner(vector2);
        Assertions.assertEquals(expected2, actual2);

        Vector vector3 = new Vector(10, 6);
        double actual3 = Math.atan(6 / 10F);
        double expected3 = operations.getCorner(vector3);
        Assertions.assertEquals(expected3, actual3);

        Vector vector4 = new Vector(23, -4);
        double actual4 = Math.atan(-4 / 23F);
        double expected4 = operations.getCorner(vector4);
        Assertions.assertEquals(expected4, actual4);

    }

    @Test
    @DisplayName("Get corner between vectors")
    void getCornBetween() {
        Vector vector = new Vector(1, 1);
        Vector vector1 = new Vector(4, 76);
        Vector vector2 = new Vector(34, -18);
        Vector vector3 = new Vector(64, 17);
        Vector vector4 = new Vector(0, 9);

        double actual1 = Math.atan(76 / 4F) - Math.atan(1F);
        double actual2 = Math.atan(1F) - Math.atan(-18 / 34F);
        double actual3 = Math.atan(17 / 64F) - Math.atan(1F);
        double actual4 = Math.PI / 2 - Math.atan(1F);

        double expected1 = operations.getCornBetween(vector, vector1);
        double expected2 = operations.getCornBetween(vector, vector2);
        double expected3 = operations.getCornBetween(vector, vector3);
        double expected4 = operations.getCornBetween(vector, vector4);

        Assertions.assertEquals(expected1, actual1);
        Assertions.assertEquals(expected2, actual2);
        Assertions.assertEquals(expected3, actual3);
        Assertions.assertEquals(expected4, actual4);
    }

    @Test
    @DisplayName("Get vector modulus")
    void getModulus() {
        Vector vector1 = new Vector(1, 1);
        Vector vector2 = new Vector(0, 5);
        Vector vector3 = new Vector(5, 19);
        Vector vector4 = new Vector(-7, 56);

        double actual1 = Math.sqrt(Math.pow(1, 2) + Math.pow(1, 2));
        double actual2 = Math.sqrt(Math.pow(0, 2) + Math.pow(5, 2));
        double actual3 = Math.sqrt(Math.pow(5, 2) + Math.pow(19, 2));
        double actual4 = Math.sqrt(Math.pow(-7, 2) + Math.pow(56, 2));

        double expected1 = operations.getModulus(vector1);
        double expected2 = operations.getModulus(vector2);
        double expected3 = operations.getModulus(vector3);
        double expected4 = operations.getModulus(vector4);

        Assertions.assertEquals(expected1, actual1);
        Assertions.assertEquals(expected2, actual2);
        Assertions.assertEquals(expected3, actual3);
        Assertions.assertEquals(expected4, actual4);
    }

    @Test
    @DisplayName("Scalar product of vectors")
    void getMultiply() {
        Vector vector = new Vector(1, 1);
        Vector vector1 = new Vector(5, 7);
        Vector vector2 = new Vector(5, 7);
        Vector vector3 = new Vector(5, 7);
        Vector vector4 = new Vector(5, 7);

        double actual1 = operations.getModulus(vector) * operations.getModulus(vector1)
                * Math.sin(operations.getCornBetween(vector, vector1));
        double actual2 = operations.getModulus(vector) * operations.getModulus(vector2)
                * Math.sin(operations.getCornBetween(vector, vector2));
        double actual3 = operations.getModulus(vector) * operations.getModulus(vector3)
                * Math.sin(operations.getCornBetween(vector, vector3));
        double actual4 = operations.getModulus(vector) * operations.getModulus(vector4)
                * Math.sin(operations.getCornBetween(vector, vector4));

        double expected1 = operations.getMultiply(vector, vector1);
        double expected2 = operations.getMultiply(vector, vector2);
        double expected3 = operations.getMultiply(vector, vector3);
        double expected4 = operations.getMultiply(vector, vector4);

        Assertions.assertEquals(expected1, actual1);
        Assertions.assertEquals(expected2, actual2);
        Assertions.assertEquals(expected3, actual3);
        Assertions.assertEquals(expected4, actual4);
    }

    @Test
    @DisplayName("Get multiply vector by const")
    void getMultiByConst() {
        Vector vector1 = new Vector(1, 1);
        Vector vector2 = new Vector(5, 3);
        Vector vector3 = new Vector(17, 19);
        Vector vector4 = new Vector(9, 18);

        Vector actual1 = new Vector(2, 2);
        Vector actual2 = new Vector(-5, -3);
        Vector actual3 = new Vector(85, 95);
        Vector actual4 = new Vector(3, 6);

        Vector expected1 = operations.getMultiByConst(vector1, 2);
        Vector expected2 = operations.getMultiByConst(vector2, -1);
        Vector expected3 = operations.getMultiByConst(vector3, 5);
        Vector expected4 = operations.getMultiByConst(vector4, 1/3F);

        Assertions.assertEquals(expected1.toString(), actual1.toString());
        Assertions.assertEquals(expected2.toString(), actual2.toString());
        Assertions.assertEquals(expected3.toString(), actual3.toString());
        Assertions.assertEquals(expected4.toString(), actual4.toString());
    }
}