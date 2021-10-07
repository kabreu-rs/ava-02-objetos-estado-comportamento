public class Forno {

  int volume;
  int tensao;
  int potencia;
  int largura;
  int altura;
  int profundidade;
  boolean ligado = false;
  int temperatura;
  int tempo;

  Forno(int volume, int tensao, int potencia, int largura, int altura, int profundidade) {

    this.volume = volume;
    this.tensao = tensao;
    this.potencia = potencia;
    this.largura = largura;
    this.altura = altura;
    this.profundidade = profundidade;
  }

  int volume() {
    return this.volume;
  }

  int tensão() {
    return this.tensao;
  }

  int potencia() {
    return this.potencia;
  }

  int largura() {
    return this.largura;
  }

  int altura() {
    return this.altura;
  }

  int profundidade() {
    return this.profundidade;
  }

  int temperatura() {
    return this.temperatura;
  }

  boolean ligado() {
    return this.ligado;
  }

  void aumentarTemperatura() {

    if(temperatura() == 200){
      temperatura += 20;
    }else if(temperatura() == 220){
      temperatura += 30;
    }else if(temperatura() < 300){
      temperatura += 50;
      ligado = true;
    }

  }
  void diminuirTemperatura() {
    if (temperatura() == 250) {
      temperatura -= 30;
    } else if (temperatura() == 220) {
      temperatura -= 20;
    } else if (temperatura() > 0) {
      temperatura -= 50;
    }
    if (temperatura == 0) {
      ligado = false;
    }
  }
  void TempoRestante(){
    if (tempo <=1 && tempo >= 120) {
      tempo = tempo - 1;

    }
  }

}
