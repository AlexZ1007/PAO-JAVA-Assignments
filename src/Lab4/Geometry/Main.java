package Lab4.Geometry;

public class Main {

    public static void main(String[] args) {
        Form[] forms = new Form[3];
        forms[0] =  new Circle("rosu", (float)2.2);
        forms[1] =  new Triangle("verde", (float)1, (float)2);
        forms[2] =  new Triangle("mov", (float)1, (float)2);


        // Se va afisa, folosindu-se functia toString() din Circle, respectiv Triangle
//        Cerc: rosu 15.1976
//        Triunghi: verde 1.0
//        Triunghi: mov 1.0
        for (Form form : forms) {
            System.out.println(form);
        }

        for (Form form : forms) {
            if(form instanceof Circle){
                ((Circle) form).printCircleDimensions();
            }
            if(form instanceof Triangle){
                ((Triangle) form).printTriangleDimensions();
            }
        }

//       Inlocuim instanceof cu numele clasei pentru a determina tipul obiectului
        for (Form form : forms) {
            if(form.getClass().getSimpleName().equals("Circle")){
                ((Circle) form).printCircleDimensions();
            }
            if(form.getClass().getSimpleName().equals("Triangle")){
                ((Triangle) form).printTriangleDimensions();
            }
        }
    }

}
