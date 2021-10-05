public class MaquinaAgua {

  int quantidadeAgua;
  int quantidadeCopo200;
  int quantidadeCopo300;
 // int quantidade = 0;
 final int capacidadeAgua;
 final int capacidadeCopo200;
 final int capacidadeCopo300;

 MaquinaAgua(){ // contrutor

  this.capacidadeAgua = 20000;
  this.capacidadeCopo200 = 100;
  this.capacidadeCopo300 = 100;
  this.quantidadeAgua =0;
  this.quantidadeCopo200 =0;
  this.quantidadeCopo300 =0;

 }
 int agua(){ // consultar o atributo de quantidade(sempre que tiver retorno é consulta)
   return this.quantidadeAgua;
 }
 int copos200(){
   return this.quantidadeCopo200;
 }
 int copos300(){
   return this.quantidadeCopo300;
 }
 void servirCopo200(){
   if (quantidadeCopo200 > 0 && quantidadeAgua >= 200) {
     quantidadeCopo200--;
     quantidadeAgua-= 200;
   }
 }
 void servirCopo300(){
   if (quantidadeCopo300 > 0 && quantidadeAgua >= 300) {
     quantidadeCopo300--;
     quantidadeAgua-= 300;
   }

 }
  void abastecerAgua(){
    this.quantidadeAgua = this.capacidadeAgua;
  }
  void abastecerCopo200(){
    this.quantidadeCopo200 = this.capacidadeCopo200;
  }
  void abastecerCopo300(){
    this.quantidadeCopo300 = this.capacidadeCopo300;
  }

}

