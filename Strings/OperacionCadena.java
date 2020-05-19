public class OperacionCadena{
    public static void main(String[]args){
    String cadena1 = "Hola";
    String cadena2 = "Papu";

    //VARIABLES NUMERICAS
    int enteroAUnir = 20;
    double decimal = 1.12;
    //Unir estas weas
    
    String concatenar = cadena1 +" "+ cadena2;
    System.out.println(concatenar);
    //Mezclar cadenas con numeros
    String concatenar2 = cadena1 + enteroAUnir;
    System.out.println(concatenar2);
    //
    String concatenar3 = cadena1.concat(cadena2);
    System.out.println("Concatenar con concat "+concatenar3);
    
    String cadena4 = "Java";
    //Metodo lenght para contar xd
    int contarCadena = cadena4.length();
    System.out.println("Tu palabra tiene "+contarCadena+" Letras");
    //Usando una varable anonima
    System.out.println("La dimension es: "+"xdxdx".length());
    //Metodo substring
    String cadena5 = "Mi lenguaje favorito es Python";
    System.out.println(cadena5);
    String extraer = cadena5.substring(24, 30);
    //String extraer = "Mi lenguaje favorito es Python".substring(24, 30);
    System.out.println("La extracion es: "+ extraer);
    //Comparar cadenas de texto xdxd
    
    }
}