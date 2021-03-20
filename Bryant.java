
  @WebMethod
  public String Example4(int answer){
      String back = "Success";
      String back1 = "Failed";
      if(answer==4){return back;}
      else return back1;
  }
  @WebMethod
  public String Example5(int answer){
      String back = "Success";
      String back1 = "Failed";
      if(answer>4){return back;}
      else return back1;
  }
 @WebMethod
  public String Example5(int answer){
      String back = "Success";
      String back1 = "Failed";
      if(answer<5){return back;}
      else return back1;
  }