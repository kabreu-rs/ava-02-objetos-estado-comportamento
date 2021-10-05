public class MaquinaAguaConfiguravel {

  int quantidadeAgua;
  int quantidadeCopo200;
  int quantidadeCopo300;
  // int quantidade = 0;
  final int capacidadeAgua;
  final int capacidadeCopos200;
  final int capacidadeCopos300;

  MaquinaAguaConfiguravel(int capacidadeAgua, int capacidadeCopo200, int capacidadeCopo300) { // contrutor
    if (capacidadeAgua < 0) {
      throw new IllegalArgumentException(" Capacidade de Água zerada");

    }
    if (capacidadeCopo200 <= 0) {
      throw new IllegalArgumentException(" Nãp há copos de 200mL");

    }
    if (capacidadeCopo300 <= 0) {
      throw new IllegalArgumentException("Não há copos de 300mL");

    }
    this.capacidadeAgua = capacidadeAgua;
    this.capacidadeCopos200 = capacidadeCopo200;
    this.capacidadeCopos300 = capacidadeCopo300;
    this.quantidadeAgua = 0;
    this.quantidadeCopo200 = 0;
    this.quantidadeCopo300 = 0;

  }

  int agua() { // consultar o atributo de quantidade(sempre que tiver retorno é consulta)
    return this.quantidadeAgua;
  }

  int copos200() {
    return this.quantidadeCopo200;
  }

  int copos300() {
    return this.quantidadeCopo300;
  }

  void servirCopo200() {

    if (quantidadeAgua < 200) {
      throw new IllegalStateException(" Falta Água");

    }
    if (quantidadeCopo200 <= 0) {
      throw new IllegalStateException(" Falta Copo 200 ");

    }
    quantidadeCopo200--;
    quantidadeAgua -= 200;

  }

  void servirCopo300() {

    if (quantidadeAgua < 300) {
      throw new IllegalStateException(" Falta  Agua");

    }
    if (quantidadeCopo300 <= 0) {
      throw new IllegalStateException(" Falta Copo 300 ");

    }
    quantidadeCopo300--;
    quantidadeAgua -= 300;

  }

  void abastecerAgua() {
    this.quantidadeAgua = this.capacidadeAgua;
  }

  void abastecerCopo200() {
    this.quantidadeCopo200 = this.capacidadeCopos200;
  }

  void abastecerCopo300() {
    this.quantidadeCopo300 = this.capacidadeCopos300;
  }

}
