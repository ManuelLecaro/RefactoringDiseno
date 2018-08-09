/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.feature.rfeature;

/**
 * Se soluciono con extract method para ambas clases y customer de este modo 
 * depende de Phone para seguir trabajando
 * @source:
 * https://elearning.industriallogic.com/gh/submit?Action=PageAction&album=recognizingSmells&path=recognizingSmells/featureEnvy/featureEnvyExample&devLanguage=Java
 */
public class Customer{
    private Phone mobilePhone;
   public String getMobilePhoneNumber() {
      return mobilePhone.toFormattedString();
   }
}
   
