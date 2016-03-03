import ts.Message;
import ts.support.*;
class p1 {
  public static void main(String args[])
  {
    TSValue undefined = TSUndefined.value;
    double var_n_1;
    Message.setLineNumber(2);
    double var_i_0;
    Message.setLineNumber(3);
    double var_j_0;
    Message.setLineNumber(4);
    double var_k_0;
    Message.setLineNumber(5);
    double var_l_0;
    Message.setLineNumber(7);
    double temp0 = 1.0;
    var_i_0 = temp0;
    Message.setLineNumber(8);
    double temp2 = 2.0;
    var_j_0 = temp2;
    Message.setLineNumber(9);
    double temp4 = 3.0;
    var_k_0 = temp4;
    {
      Message.setLineNumber(11);
      double temp6 = var_i_0;
      double temp7 = 41.0;
      double temp8 = temp6 + temp7;
      System.out.println(TSNumber.create(temp8).toStr().getInternal());
      Message.setLineNumber(11);
      double temp9 = 15.0;
      var_i_0 = temp9;
      Message.setLineNumber(11);
      double temp11 = var_j_0;
      double temp12 = 40.0;
      double temp13 = temp11 + temp12;
      System.out.println(TSNumber.create(temp13).toStr().getInternal());
    }
    Message.setLineNumber(12);
    double temp14 = var_i_0;
    double temp15 = 2.0;
    double temp16 = temp14 + temp15;
    var_i_0 = temp16;
    {
      Message.setLineNumber(13);
      double temp18 = var_i_0;
      double temp19 = var_j_0;
      double temp20 = temp18 + temp19;
      double temp21 = var_k_0;
      double temp22 = temp20 + temp21;
      var_l_0 = temp22;
      Message.setLineNumber(13);
      double var_n_1;
    }
    {
    }
    Message.setLineNumber(16);
    double temp24 = var_i_0;
    double temp25 = 3.0;
    double temp26 = temp24 + temp25;
    var_i_0 = temp26;
    {
      Message.setLineNumber(18);
      double temp28 = var_l_0;
      double temp29 = 20.0;
      double temp30 = temp28 + temp29;
      var_n_1 = temp30;
      Message.setLineNumber(19);
      double temp32 = var_n_1;
      System.out.println(TSNumber.create(temp32).toStr().getInternal());
    }
  }
}
