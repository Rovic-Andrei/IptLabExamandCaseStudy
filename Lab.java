/*
 * To change this license header, choose License Headers in Project Properties.
 * and open the template in the editor.
 */
package com.labquiz;

import javax.jws.WebMethod;
import javax.jws.WebService;



/**
 *
 * @author Andrei
 */
@WebService
public class Lab {
@WebMethod
  public String Example(int answer){
      String back = "Success";
      String back1 = "Failed";
      if(answer==1){return back;}
      else return back1;
  }
  @WebMethod
  public String Example2(int answer){
      String back = "Success";
      String back1 = "Failed";
      if(answer==2){return back;}
      else return back1;
  }
  @WebMethod
  public String Example3(int answer){
      String back = "Success";
      String back1 = "Failed";
      if(answer==3){return back;}
      else return back1;
  }
  
    }

