/*
  Herança: "É o relacionamento entre classes em que uma classe chamada de subclasse (classe herança filha, classe derivada) é uma extensão, um subtido, de outra classe chamada de superclasse (classe pai, classe mãe, classe base). Devido a isto, a subclasse consegue reaproveitar os atributos e métodos dela. Além dos que venham a ser herdados, a subclasse pode definir seus próprios membros"

    Java
        class A extends B{}
    C# 
        class A : B{}
    Python 
        class A(B):
    
    Tipos de Heranças:
    Simples: A classe filha tem só uma mãe
    Múltipla: A classe filha tem uma ou mais mães. Ex: estudante e funcionário maẽs de estagiário. 
        Java não tem herança multipla
        C# não tem herança multipla
        Python 
            class A(B, C): 
                pass
        C++ também tem

    Upcast: sobe na hierarquia generica
        Java
            A a = new B();
        C#  
            A a = new B();
        Python não tem upcast
    Downcast: desce na hierarquia generica
        Java
            B a = (B) new (A)
        C#  
            B b = (B) new A ()
        Python não tem

    Polimorfismo: A mesma ação se comportando diferente.  
    Ex: Pagamento pode ser feito por boleto, credito, debito, pix

    Sobrescrita: A mesma ação podendo se comportar diferente
    Ex: Conta para exibir saldo pode ser corrente sem alteraçõesa, poupança com os adicionais da poupança, especial com os descontos e universitária que é sem alterações também
    ~~~~~~~~~~~~Polimorfismo vs Sobrescrita
        Polimorfismo sempre vai ser diferente, a sobrescrita pode ser diferente ou não
    exercicios 2











 */