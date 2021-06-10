import java.util.Scanner;

public class doceavo {
    public static void main(String[] args) {
        int edad;
        double altura;
        char sexo;
        double promHombre, hombre = 0, i = 0;
        double promMujer, mujer = 0, j = 0;
        double promGeneral, general = 0, k = 0;
        boolean salir = true;
        Scanner ent = new Scanner(System.in);
        while (salir) {
            System.out.println("Ingrese la edad: ");
            edad = ent.nextInt();
            System.out.println("Ingrese la Altura: ");
            altura = ent.nextDouble();
            if (altura < 0) {
                salir = false;
            }
            System.out.println("Ingrese el sexo: ");
            sexo = ent.next().charAt(0);
            if (sexo == 'f' || sexo == 'f') {
                mujer = mujer + altura;
                i++;
            } else if (sexo == 'm' || sexo == 'M') {
                hombre = hombre + altura;
                j++;
            }
            general = edad + general;
            k++;

        }
        promMujer = mujer / i;
        promHombre = hombre / j;
        promGeneral = general / k;
        System.out.println("El promedio de altura de mujeres es:  "+promMujer);
        System.out.println("el promedio de altira de hombres es:  "+promHombre);
        System.out.println("El promedio de edad es de todos:  "+promGeneral);
    }

}
