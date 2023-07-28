package constructor;

public class MainCarr {
    public static void main(String[] args) {
        Carr car = new Carr("fka839", 2023 ); //instancia
        Carr car2 = new Carr("skj233", 1998);
        car.setPlate("xwt246");
        System.out.println(car.getPlate());
    }
}
