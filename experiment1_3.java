package bank.acc;
import java.util.*;
abstract class Account {

int tenure;

    float principal;

    float rateOfInterest;

    public void setInterest(int age, String gender) {

             if(gender.equalsIgnoreCase("Male"))

          {

               if(age<60)

               {

                    rateOfInterest=(float) 9.8;

               }

               if(age>=60)

               {

                    rateOfInterest=10.5f;

               }

          }

          else

          {

               if(age<58)

               {

                    rateOfInterest=10.2f;

               }

               if(age>=58)

               {

                    rateOfInterest=10.8f;

               }

          }  

    }

 

    public float calculateMaturityAmount(float totalPrincipleDeposited,

               float maturityInterest) {

          return (totalPrincipleDeposited+maturityInterest);

    }

 

    public abstract float calculateInterest();

    public abstract float calculateAmountDeposited();

}

 

// RDAccount class

class RDAccount extends Account {

int tenure;

    float principal;

    public RDAccount(int tenure, float principal)

    {

          this.tenure=tenure;

          this.principal=principal;

    }

    @Override

    public float calculateInterest() {

          // TODO Auto-generated method stub

          float result=0.0f;

          float quat=4;

          int totalMonths=tenure*12;

          float monInYears=0;

          float iRate= rateOfInterest/100;

          

          for(int i=totalMonths;i>0;i--)

          {

               monInYears=i/12.0f;

               result+=principal*((Math.pow((1+iRate/quat),quat*monInYears))-1);

          }     

                 return result;        

    }

    @Override

    public float calculateAmountDeposited() {

          // TODO Auto-generated method stub       

          return principal*tenure*12;

    }

}

public class MainClass {

    public static void main(String[] args) {

          // TODO Auto-generated method stub

        int tenure = 5;

        float principal = 1000;

        int age = 20;

        String gender = "male";

   RDAccount b=new RDAccount(tenure,principal);    

 b.setInterest(age, gender);

float maturityInterest= b.calculateInterest();

    System.out.println(b.calculateInterest());

float totalPrincipleDeposited = b.calculateAmountDeposited();

    System.out.println(totalPrincipleDeposited);

 

System.out.println(b.calculateMaturityAmount(totalPrincipleDeposited, maturityInterest));

 

    }

}

public class experiment1_3 {

    public static void main(String[] args) {

          // TODO Auto-generated method stub

        int tenure = 5;

        float principal = 1000;

        int age = 20;

        String gender = "male";

        BankService b=new BankService();

        b.calculate(principal, tenure, age, gender);

    }

}

 

// Account class

abstract class Account {

int tenure;

    float principal;

    float rateOfInterest;

    public void setInterest(int age, String gender) {

             if(gender.equalsIgnoreCase("Male"))

          {

               if(age<60)

               {

                    rateOfInterest=(float) 9.8;

               }

               if(age>=60)

               {

                    rateOfInterest=10.5f;

               }

          }

          else

          {

               if(age<58)

               {

                    rateOfInterest=10.2f;

               }

               if(age>=58)

               {

                    rateOfInterest=10.8f;

               }

          }  

    }

 

    public float calculateMaturityAmount(float totalPrincipleDeposited,

               float maturityInterest) {

          return (totalPrincipleDeposited+maturityInterest);

    }

 

    public abstract float calculateInterest();

    public abstract float calculateAmountDeposited();

}

 

// RDAccount class

 class RDAccount extends Account {

int tenure;

    float principal;

    public RDAccount(int tenure, float principal)

    {

          this.tenure=tenure;

          this.principal=principal;

    }

    @Override

    public float calculateInterest() {

          // TODO Auto-generated method stub

          float result=0.0f;

          float quat=4;

          int totalMonths=tenure*12;

          float monInYears=0;

          float iRate= rateOfInterest/100;

          

          for(int i=totalMonths;i>0;i--)

          {

               monInYears=i/12.0f;

               result+=principal*((Math.pow((1+iRate/quat),quat*monInYears))-1);

          }     

                 return result;        

    }

    @Override

    public float calculateAmountDeposited() {

          // TODO Auto-generated method stub       

          return principal*tenure*12;

    }

}

