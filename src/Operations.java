public class Operations {

    public Vector getSumm(Vector vec1, Vector vec2){
        Vector result = new Vector(vec1.vec_x + vec2.vec_x, vec1.vec_y + vec2.vec_y);
        return result;
    }

    public Vector getSubtract(Vector vec1, Vector vec2){
        Vector result = new Vector(vec1.vec_x - vec2.vec_x, vec1.vec_y - vec2.vec_y);
        return result;
    }
}
