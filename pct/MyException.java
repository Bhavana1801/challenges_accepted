class MyException extends Exception 
{
  public void method() throws MyException
  {
    throw new MyException(); 
  }
}