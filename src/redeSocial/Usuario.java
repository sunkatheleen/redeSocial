package redeSocial;

public class Usuario {

        static void curtirPostagem() {
            System.out.println("Usuário curtiu a postagem");
            Postagem.mostrarCurtidas();
            int x = Postagem.curtidas;
            System.out.println("Curtidas antes = " + x);
            Postagem.curtidas++;
            System.out.println("Curtidas agora = " + Postagem.curtidas);
        }

        public static void main(String args[]) {
            curtirPostagem();
        }
    }

    /* Exercícios

É possível usar o modificador private antes da palavra-chave class, tanto na classe A quanto na classe B?
O que acontece?

Não é possível. Gera erro de compilação, pois a classe precisa ser pública ou default (vazio).

É possível usar o modificador private nos métodos Postagem.mostrarCurtidas() e Usuario.curtirPostagem()?
Justifique.

O método Postagem.mostrarCurtidas() não pode ter modificador private porque ele é utilizado nos objetos da classe
     Usuario. O método Usuario.curtirPostagem() poderia ter modificador private porque apenas é utilizado dentro da
                   própria classe Usuario.

É possível usar o modificador protected nos métodos Postagem.mostrarCurtidas() e Usuario.curtirPostagem()?
Justifique.

Poderíamos utilizar o modificador protected em ambos os métodos Postagem.mostrarCurtidas() e Usuario.curtirPostagem(),
 pois são classes que estão no mesmo pacote e, com esse modificador, os métodos estariam acessíveis entre as classes.

*/
