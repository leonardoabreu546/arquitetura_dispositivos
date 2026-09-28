public class Main {

  public static void helloWorld() {
    System.out.println("Hello world!");
  }

  public static void calcularPerimetroRetangulo(double height, double width) {
    double perimeter= 2 * (height + width);
    System.out.println("O perímetro é: " + perimeter);
  }

  public static void calcularVolume(double heigth, double width, double large) {
    double volume=heigth*width*large;
    System.out.println("O volume é: " + volume);
  }

  public  static void converterFarenheit(double farenheit)  {
    double celsius=(farenheit-32)*(5.0/9.0);
    System.out.println("A temperatura em graus Celsius é: " + celsius);
  }

  public static double calcularMaximo(double[] valores) {
    double maximo = valores[0];
    for (int i = 1; i < valores.length; i++) {
      if (valores[i] > maximo) {
        maximo = valores[i];
      }
    }

    System.out.println("Máximo: " + maximo);
    return maximo;
  }

  public static double calcularMinimo(double[] valores) {
    double minimo = valores[0];
    for (int i = 1; i < valores.length; i++) {
      if (valores[i] < minimo) {
        minimo = valores[i];
      }
    }

    System.out.println("Mínimo: " + minimo);
    return minimo;
  }

  public static double media(double[] valores) {
    double soma=0;
    for (int i = 1; i < valores.length; i++) {
      soma = +valores[i];
      }

    double media=soma/valores.length;
    System.out.println("Média: " + media);
    return media;
  }

  public static void main(String[] args) {
    helloWorld();
    calcularPerimetroRetangulo(4.5, 6.7);
    calcularVolume(4.6, 3.9, 8.9);
    converterFarenheit(40);
    double[] valores = {4.5, 2.1, 9.8, 3.3, 7.6};
    calcularMaximo(valores);
    calcularMinimo(valores);
    media(valores);

  }
}