/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ebuss.commons;

/**
 *
 * @author Ramu
 */
public class GenerateBusServiceNo {
  int finalid;
int masterKey;
int pKey;
int pkeys;
public int generateServiceNo(){
for(int i=1;i<=10;i++){
pkeys = (int) Math.round(Math.random()*5000);

pKey+=pkeys;
}
finalid =pKey/10;
return finalid;
}  
}
