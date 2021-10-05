public class App {
  public static void main(String[] args) {

    System.out.println("Olá mundo!");
      /*java*/
    MaquinaAgua maq = new MaquinaAgua();
    System.out.println(maq.agua() == 0); // mL
    System.out.println(maq.copos200() == 0);
    System.out.println(maq.copos300() == 0);

    maq.servirCopo200(); // não efetua, pois não há copo nem água

    System.out.println(maq.agua() == 0); // mL
    System.out.println(maq.copos200() == 0); // unidades
    System.out.println(maq.copos300() == 0); // unidades

    maq.abastecerAgua(); // inicializa 20000mL
    System.out.println(maq.agua() == 20000); // mL

    maq.abastecerAgua(); // mantém consistente
    System.out.println(maq.agua() == 20000); // mL

    maq.servirCopo200(); // não efetua, sem copo
    System.out.println(maq.agua() == 20000); // mL

    System.out.println(maq.copos200() == 0);
    maq.abastecerCopo200(); // agora a máquina possui 100 copos de 200
    System.out.println(maq.copos200() == 100);

    maq.servirCopo200(); // -200
    maq.servirCopo200(); // -200
    maq.servirCopo200(); // -200
    maq.servirCopo200(); // -200
    maq.servirCopo200(); // -200, isto é, -1000ml e 5 copos de 200

    System.out.println(maq.agua() == 19000);
    System.out.println(maq.copos300() == 0);
    System.out.println(maq.copos200() == 95);
    maq.abastecerCopo200(); // agora a máquina possui 100 copos de 200 novamente
    System.out.println(maq.copos200() == 100);

    maq.servirCopo200(); // -200ml e 1 copo de 200
    System.out.println(maq.agua() == 18800);
    System.out.println(maq.copos200() == 99);

    System.out.println(maq.copos300() == 0);
    maq.servirCopo300(); // não efetua, não há copo 300
    maq.abastecerCopo300(); // agora a máquina possui 100 copos de 300
    System.out.println(maq.copos300() == 100);
    maq.servirCopo300(); // agora efetua
    System.out.println(maq.agua() == 18500);
    System.out.println(maq.copos200() == 99);
    System.out.println(maq.copos300() == 99);

    // servir 50 copos de 300 = -15000ml
    for (int i = 0; i < 50; i++) maq.servirCopo300();

    System.out.println(maq.agua() == 3500);
    System.out.println(maq.copos200() == 99);
    System.out.println(maq.copos300() == 49);

    // servir 17 copos de 200 = 3400ml
    for (int i = 0; i < 17; i++) maq.servirCopo200();

    System.out.println(maq.agua() == 100);
    System.out.println(maq.copos200() == 82);
    System.out.println(maq.copos300() == 49);

    // não há água para atender o pedido
    maq.servirCopo300();
    System.out.println(maq.agua() == 100);
    System.out.println(maq.copos200() == 82);
    System.out.println(maq.copos300() == 49);

    // não há água para atender o pedido
    maq.servirCopo200();
    System.out.println(maq.agua() == 100);
    System.out.println(maq.copos200() == 82);
    System.out.println(maq.copos300() == 49);

    maq.abastecerAgua(); // inicializa 20000mL
    System.out.println(maq.agua() == 20000);
    System.out.println(maq.copos200() == 82);
    System.out.println(maq.copos300() == 49);

    // servir os 49 copos de 300 restantes = 14700ml
    while (maq.copos300() > 0) maq.servirCopo300();

    System.out.println(maq.agua() == 5300);
    System.out.println(maq.copos200() == 82);
    System.out.println(maq.copos300() == 0);

    // não há copo para atender o pedido
    maq.servirCopo300();
    System.out.println(maq.agua() == 5300);
    System.out.println(maq.copos200() == 82);
    System.out.println(maq.copos300() == 0);

    maq.servirCopo200(); // de 200 ok
    maq.servirCopo200(); // de 200 ok

    System.out.println(maq.agua() == 4900);
    System.out.println(maq.copos200() == 80);
    System.out.println(maq.copos300() == 0);

    maq.abastecerCopo300(); // 100 copos de 300
    System.out.println(maq.agua() == 4900);
    System.out.println(maq.copos200() == 80);
    System.out.println(maq.copos300() == 100);

    // servir 3 copos de 300
    maq.servirCopo300(); maq.servirCopo300(); maq.servirCopo300();

    System.out.println(maq.agua() == 4000);
    System.out.println(maq.copos200() == 80);
    System.out.println(maq.copos300() == 97);


    MaquinaAguaConfiguravel maquinaCustom = new MaquinaAguaConfiguravel(10000, 30, 20);

    System.out.println(maquinaCustom.capacidadeAgua == 10000); // mL
    System.out.println(maquinaCustom.capacidadeCopos200 == 30);
    System.out.println(maquinaCustom.capacidadeCopos300 == 20);

    // As três linhas a seguinte não devem compilar pois estes atributos devem ser
    // imutáveis:
    //maquinaCustom.capacidadeAgua = 100000;
    //maquinaCustom.capacidadeCopos200 = 300;
    //maquinaCustom.capacidadeCopos300 = 200;

    // Checando armazenamento
    System.out.println(maquinaCustom.agua() == 0); // mL
    System.out.println(maquinaCustom.copos200() == 0);
    System.out.println(maquinaCustom.copos300() == 0);

    maquinaCustom.abastecerAgua();
    maquinaCustom.abastecerCopo200();
    maquinaCustom.abastecerCopo300();
    System.out.println(maquinaCustom.agua() == 10000);
    System.out.println(maquinaCustom.copos200() == 30);
    System.out.println(maquinaCustom.copos300() == 20);

    maquinaCustom.servirCopo200(); // -200
    maquinaCustom.servirCopo200(); // -200
    maquinaCustom.servirCopo200(); // -200
    maquinaCustom.servirCopo200(); // -200
    maquinaCustom.servirCopo200(); // -200

    // System.out.println(maq.agua() == 9000); // patch:
    System.out.println(maquinaCustom.copos200() == 25);
    System.out.println(maquinaCustom.agua() == 9000);

    MaquinaAguaConfiguravel maquininha = new MaquinaAguaConfiguravel(1000, 6, 3);

    System.out.println(maquininha.capacidadeAgua == 1000); // mL
    System.out.println(maquininha.capacidadeCopos200 == 6);
    System.out.println(maquininha.capacidadeCopos300 == 3);
    maquininha.abastecerAgua();
    maquininha.abastecerCopo200();
    maquininha.abastecerCopo300();
    System.out.println(maquininha.agua() == 1000);
    System.out.println(maquininha.copos200() == 6);
    System.out.println(maquininha.copos300() == 3);

    maquininha.servirCopo200(); // -200
    maquininha.servirCopo200(); // -200
    maquininha.servirCopo200(); // -200
    maquininha.servirCopo200(); // -200
    maquininha.servirCopo200(); // -200

    System.out.println(maquininha.agua() == 0);
    System.out.println(maquininha.copos200() == 1);
    System.out.println(maquininha.copos300() == 3);

    try {
      maquininha.servirCopo200(); // deve lançar exceção
      System.out.println(false); // esta linha não deve ser executada
    } catch (Exception e) {
      System.err.println("true " + e.getMessage()); // Não há água
    }

    maquininha.abastecerAgua();
    System.out.println(maquininha.agua() == 1000);
    System.out.println(maquininha.copos200() == 1);
    System.out.println(maquininha.copos300() == 3);

    maquininha.servirCopo200(); // -200
    System.out.println(maquininha.agua() == 800);
    System.out.println(maquininha.copos200() == 0);

    try {
      maquininha.servirCopo200(); // deve lançar exceção
      System.out.println(false); // esta linha não deve ser executada
    } catch (Exception e) {
      System.err.println("true " + e.getMessage()); // Não há copos de 200mL
    }

    // Máquinas inválidas devem lançar exceção

    try {
      MaquinaAguaConfiguravel maqinvalida = new MaquinaAguaConfiguravel(1000, 0, 3);
      System.out.println(false); // esta linha não deve ser executada
    } catch (Exception e) {
      System.err.println("true " + e.getMessage()); // Copos de 200mL deve ser positivo
    }

    try {
      MaquinaAguaConfiguravel maqinvalida = new MaquinaAguaConfiguravel(1000, 10, 0);
      System.out.println(false); // esta linha não deve ser executada
    } catch (Exception e) {
      System.err.println("true " + e.getMessage()); // Copos de 300mL deve ser positivo
    }

    try {
      MaquinaAguaConfiguravel maqinvalida = new MaquinaAguaConfiguravel(-1000, 10, 10);
      System.out.println(false); // esta linha não deve ser executada
    } catch (Exception e) {
      System.err.println("true " + e.getMessage()); // Quantidade água deve ser positivo
    }

    // Máquina de 500 litros!
    MaquinaAguaConfiguravel maquinao = new MaquinaAguaConfiguravel(500000, 3000, 2000);
    maquinao.abastecerAgua();
    maquinao.abastecerCopo300();
    // Esvaziando a máquina
    try { // servindo enquanto houver água
      // maquinao.servirCopo300(); // patch: faltou o while (true)
      while (true)
        maquinao.servirCopo300();
    } catch (Exception e) {
      System.err.println("true: acabou a água");
    }
    System.out.println(maquinao.agua() == 200);
    System.out.println(maquinao.copos300() == 334);
    //System.out.println(maquinao.agua());
  }



}
