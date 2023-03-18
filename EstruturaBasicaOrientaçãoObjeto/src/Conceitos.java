/*public class Conceitos {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
*/

/*
ESTRUTURAS BÁSICAS DA ORIENTAÇÃO A OBJETOS (OO)

    Classe: "É uma estrutura que abstrai um conjunto de objetos com características similares. Uma classe define o comportamento de seus objetos através de métodos e os estados possíveis destes objertos através de atributos. Em outros termos, uma classe descreve os serviços providos por seus objetos e quais informações eles podem armazenar"

    Sua  função é servir de molde, ela vai modelar o nosso conceito do mundo real. 
    Dicas para criar classes: substantivos, nome significativos, contexto deve ser considerado.  
    ex: Carro; Bola; Viagem. 
    JAVA
        class Carro {}
    C# 
        class Carro {}
    Python
        class Carro: pass
    


    Atributo: "É o elemento de uma classe responsável por definir sua estrutura de dados. O conjunto destes será responsável por representar suas características e fará parte dos objetos criados a partir da classe"
    ex: Carro: cor; Bola: diamêtro; Viagem: distancia.  
    Atributos vs Variável
        Atributo: O que é próprio e peculiar a alguém ou a alguma coisa.  
        Variável: Sujeito a variações ou mudaanças; que pode variar; inconstante, instável.   
    Dicas para criar atributos: substantivos e adjetivos; nome significativos; contexto deve ser considerado; abstração; tipos adequados.   
    Java (com exemplo mais elaborado)
        class Carro{
            String cor;
            String modelo;
            int capacidadeTanque
        }
    C#  
        class Carro{
            int portas
        }
    Python
        class Carro: portas = 0





    Método: "É uma porção de código (sub-rotina) que é disponibilizada pela classe. Este é executado quando é feita uma requisição a ele. Um método serve para identificar quais serviços, ações que a classe oferece. Eles são responsáveis por definir e realizar um determinado comportamento"
    Carro: ligar; Comprador: realizar uma troca; Venda: calcular total.  
    Java
        class Carro {
            void frear(){

            }
        }
    C#  
    class Carro {
            void frear(){

            }
        }
    Python
        class Carro: def frear()

    ~~~~~~~ Dois métodos especiais
    Construtor:
    Java
        class Carro {
            Carro(){

            }
        }
    C#  
        class Carro {
            Carro (){

            }
        }
    Python
        class Carro:
        def_init_(self):

    Destrutor auxilia na destruição do objeto:
    Java
        class Carro {
            void finalize(){

            }
        }
    C#  
    class Carro{
        ~Carro(){

        }
    }
    Python
        class Carro:
        def_del_(self):

    Sobrecarga: mudar a assinatura de acordo com a necessidade
    Assinatura: nome + parâmetros
    Java
        ml ()
        ml (int i)
        ml (float f)
        ml (String s, long l)
        ml (long l, String s)
    C# 
        ML ()
        Ml (int i)
        Ml (float f)
        Ml (String s, long l)
        Ml (long l, String s)
    Python não tem sobrecargas

    Através das sobrecargas podemos representar de uma forma mais fidedigna o mundo real
    


    Objeto: "Um objeto é a representação de um conceito /entidade do mundo real, que pode ser física (bola, carro, árvore) ou conceitual (viagem, estoque, compra) e possui um significado bem definido para um determinado software. Para esse conceito/entidade, deve ser definida inicialmente uma classe a partir da qual posteriormente serão instanciados objetos distintos"
    Java
        Carro carro = new Carro ();
    C# 
        Carro carro = new Carro ();
    Python 
        carro = Carro ()
    

    Mensagem: "É o processo de ativação de um método de um objeto. Isto ocorre quando uma requisição (chamada) a esse método é realizada, assim disparando a execução de seu comportamento descrito por sua classe. Pode també, ser direcionada diretamente à classe, caso a requisição seja a um método estático"
    Java
        Carro carro = new Carro ();
        carro. <metodo>;
        
        Carro.<metodo>;
    C# 
        Carro carro = new Carro ();
        carro. <metodo>;
        
        Carro.<metodo>;
    Python
        carro = Carro ()
        carro.<metodo>

        Carro.<metodo>

        

*/