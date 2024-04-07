/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ellioraorvalinnisa_2203451.main;

/**
 *
 * @author Elliora Orva Linnisa
 */

/* atribut dari suatu class */
public class LimasSegiEmpat {
  double luasAlas; 
  double luasSelubungLimas; 
  double tinggi; 
 
/* konstruktor dengan nilai default alas, tinggi, dan sisi adalah 1, non argumen */
  LimasSegiEmpat (){
      luasAlas = 1;
      luasSelubungLimas = 1;
      tinggi = 1;
  }

  /* konstruktor dengan nilai alas, tinggi, dan sisi spesifik */
    LimasSegiEmpat (double luasAlasBaru, double luasSelubungLimasBaru, double tinggiBaru){
      luasAlas = luasAlasBaru;
      luasSelubungLimas = luasSelubungLimasBaru;
      tinggi = tinggiBaru;
  }
    
/* method dari suatu class */

/* menghitung luas segitiga */
  double getLuas (){
      return luasAlas + luasSelubungLimas; 
  }
  
 /* menghitung keliling segitiga */
  double getVolume (){
      return 0.33 * luasAlas * tinggi;
  }
 
 /* menset nilai alas segitiga */
  void setLuasAlas (double luasAlasBaru){
      luasAlas = luasAlasBaru;
  }

 /* menset nilai tinggi segitiga */
  void setLuasSelubung (double luasSelubungLimasBaru){
      luasSelubungLimas = luasSelubungLimasBaru;
  }

/* menset nilai tinggi segitiga */
  void setTinggi (double tinggiBaru){
      tinggi = tinggiBaru;
  }
 
}
