/**
 * @author Evandro Santos
 */

public class Carro {

 public String marca;
 public String modelo;
 public Integer ano;
 public String cor;
 public Float quilometragem;
 private Float velocidade;

 public String getMarca() {
  return marca;
 }

 public void setMarca(String marca) {
  this.marca = marca;
 }


 public String getModelo() {
  return modelo;
 }

 public void setModelo(String modelo) {
  this.modelo = modelo;
 }


 public Integer getAno() {
  return ano;
 }

 public void setAno(Integer ano) {
  this.ano = ano;
 }


 public String getCor() {
  return cor;
 }

 public void setCor(String cor) {
  this.cor = cor;
 }


 public Float getQuilometragem() {
  return quilometragem;
 }

 public void setQuilometragem(Float quilometragem) {
  this.quilometragem = quilometragem;
 }


 private Float getVelocidade() {
  return velocidade;
 }

 private void setVelocidade(Float velocidade) {
  this.velocidade = velocidade;
 }

 /**
  * acerlera o carro
  * @param km
  * @return velocidade do carro
  */

 Float acelerar(Float km) {
  this.setVelocidade(km);
  return this.velocidade ;
 }

 /**
  * desacelera o carro em 10 km/h
  * @return velocidade - 10 km/h
  */

 Float desacelerar() {
  this.setVelocidade(this.getVelocidade() - 10);
  return this.velocidade ;
 }

}
