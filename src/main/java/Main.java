import br.com.digitalhouse.aula.java.classes.Cachorro;
import br.com.digitalhouse.aula.java.classes.CachorroCaramelo;
import br.com.digitalhouse.aula.java.classes.CachorroGourmet;
import br.com.digitalhouse.aula.java.classes.Usuario;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* System.out.println("Hello World!");

        System.out.print("Qual seu nome? => ");
        String name = scanner.next();

        System.out.print("Qual sua idade? => ");
        int age = scanner.nextInt();

        if (age >= 18){
            System.out.println("Você é maior já pode dirigir! Parabens");
        }else if (age >= 12 && age < 17){
            System.out.println("Você ainda é adolescente.");
        }else{
            System.out.println("Você ainda não pode dirigir!");

        String names[] = {"Lucas", "Dio", "Rachel", "Raiane", "Thacio"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("Qual sua linguagem de programação favorita?");
        String favoriteLanguage = scanner.next();

        switch (favoriteLanguage){
            case "react":
                System.out.println("Gosta de funcional né amiguinho!");
                break;
            case "angular":
                System.out.println("Seu caminho será tortuoso!!");
                break;
            case "java":
                System.out.println("POO galerinha , vambora");
                break;
            case "python":
                System.out.println("Bagunceiro hein!!");
                break;
            default:
                System.out.println("Java");
        }
        String resultLanguage = scanner.next();
        while (!resultLanguage.equals("Sair")){
            System.out.println("Você não digitou sair!");
            resultLanguage = scanner.next();
        }

        Integer i = 0;
        while (i < 10){
            System.out.println("Estamos aprendendo Java!!");
            i++;
        }

        Integer j = 0;
        do {
            System.out.println("Estamos aprendendo Java!!");
            j++;
        }while(j < 10);*/
        Cachorro cachorro1 = new Cachorro();
        cachorro1.setCor("Amarelo");
        cachorro1.setIdade(10);
        cachorro1.setNome("Massaranduba");
        cachorro1.setPeso(82.5);
        cachorro1.setRaca("Pitbull");
        cachorro1.setTamanho("100");
        cachorro1.setTipoPelagem("Curta");

        System.out.println(cachorro1.toString());
        if (cachorro1.brincar()){
            System.out.println("Cachorro gente boa");
        }

        Cachorro cachorro2 = new Cachorro();
        cachorro2.setCor("Branco");
        cachorro2.setIdade(8);
        cachorro2.setNome("Lessie");
        cachorro2.setPeso(110.2);
        cachorro2.setRaca("Poodle");
        cachorro2.setTamanho("8");
        cachorro2.setTipoPelagem("Longa");

        if (!cachorro2.brincar()){
            System.out.println("Cachorro mau!");
        }else{
            System.out.println("Cachorro gente boa");
        }
        System.out.println(cachorro2.correr());


        System.out.println("Igual?: " + cachorro1.equals(cachorro2));

        CachorroGourmet nutelinha = new CachorroGourmet();
        nutelinha.setCor("Branco");
        nutelinha.setIdade(5);
        nutelinha.setNome("Nutela");
        nutelinha.setPeso(110.2);
        nutelinha.setRaca("Chihuahua");
        nutelinha.setTamanho("2");
        nutelinha.setTipoPelagem("Curta");
        nutelinha.setCertificadoPedrigree("554001SZa12");
        nutelinha.brincar();
        System.out.println(nutelinha.correr());

        CachorroCaramelo caramelo = new CachorroCaramelo();
        caramelo.setCor("Caramelo");
        caramelo.setIdade(5);
        caramelo.setNome("Alfred");
        caramelo.setPeso(10.4);
        caramelo.setRaca("Vira Lata");
        caramelo.setTamanho("4");
        caramelo.setTipoPelagem("Media");
        System.out.println(caramelo.correr());
        System.out.println(caramelo.toString());

        String assunto = "";
        String email = "";

        Usuario.enviarEmail(email, assunto);

        Usuario user = new Usuario();
        System.out.println(user.toString());

    }
}