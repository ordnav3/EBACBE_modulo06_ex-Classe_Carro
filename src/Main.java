public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setMarca("Ford");
        carro1.setModelo("Shelby Mustang");
        carro1.setCor("Azul");
        carro1.setAno(2020);
        carro1.setQuilometragem(10000.01f);

        System.out.println(carro1.getMarca().concat(" ") + carro1.getModelo().concat(" ") + carro1.getCor().concat(" ") + carro1.getAno());

        System.out.println(carro1.acelerar(200f));
        System.out.println(carro1.desacelerar());
    }
}