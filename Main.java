public class Main {

    public static void main(String[] args) {
        // Criando as figuras
        Figura circulo = new Circulo("Azul", 3.0);
        Figura retangulo = new Retangulo("Vermelho", 4.0, 5.0);
        Figura triangulo = new Triangulo("Amarelo", 3.0, 4.0, 3.0, 5.0);

        // Criando um array de figuras
        Figura[] figuras = { circulo, retangulo, triangulo };

        // Percorrendo e imprimindo informações
        for (Figura figura : figuras) { 
            System.out.println(figura.toString());
            System.out.printf("Área: %.2f\n", figura.calculaArea());
            System.out.printf("Perímetro: %.2f\n", figura.calculaPerimetro());
            System.out.println("-----------------------------------");
            
        }
    }
}