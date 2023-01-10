class TryCatchFinally{
  public TryCatchFinally(){
    try{
      System.out.println(5/0);
    }
    catch(Exception e){
      System.out.println("Gives message but keeps running: "+e.getMessage());
    }
    finally{
      System.out.println("I always finish wait no not that way");
    }
  }
}