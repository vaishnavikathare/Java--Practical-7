class Practical_7{
	
	  public static void main(String args[])
	  {
		  Practical_7 p=new Practical_7();
		  p.displaypatternV(1);
		  System.out.print("\n");
		  p.displaypatternA(1);
		  System.out.print("\n");
		  p.displaypatternI(1);
		  System.out.print("\n");
		  p.displaypatternS(1);
		  System.out.print("\n");
		  p.displaypatternH(1);
		  System.out.print("\n");
		   p.displaypatternN(1);
		  System.out.print("\n");
		  p.displaypatternA(1);
		  System.out.print("\n");
		  p.displaypatternV(1);
		  System.out.print("\n");
		  p.displaypatternI(1);
		  System.out.print("\n");
		  
	  }
	  
	  void displaypatternV(int size)
	  {
		  for(int line=1; line<=2*size+3; line++)
		  {
		   	for(int symbol=1; symbol<=2*size+3; symbol++)
		   	{
		   		if((symbol==1 && line<2*size+2 )|| (symbol==2*size+3 && line<2*size+2))
		   		 {
		   			System.out.print("*");	
		   		 }
    		   else if(line==2*size+2)
    		   {
    		      if(symbol==1 || symbol==2*size+3)
    		      {   
    		        System.out.print(" ");
    		      } 
    		      else if(symbol==2 || symbol==2*size+2)
    		      {
    		        System.out.print("*");
    		      }
    		      else
    		      {
    		        System.out.print(" ");
    		      }
    		   }
    		   else if(line==2*size+3)
    		   {
    		      if(symbol==1 || symbol==2*size+3)
    		      {
    		        System.out.print(" ");	
    		      }
    		      else if(symbol%2==0)
    		      {
    		       System.out.print(" ");	
    		      }
    		      else
    		      {
    		      System.out.print("*");
    		      }
    		  }
		   		else 
		   		{
		   			System.out.print(" ");	
		   		}
		   	}
		   	System.out.print("\n");
	   }
   }
   
   
   
   void displaypatternA(int size)
   {
      for(int line=1; line<=2*size+3; line++)
      {
        for(int symbol=1; symbol<=2*size+3; symbol++)
        {
          if(line==1)
          {  
              if(symbol==1 || symbol==2*size+3)
              {
                System.out.print(" ");
              }
              else
              {
                System.out.print("*");
              }
          }
          else if(line==2 || line<=2*size+3)
          {
             if(symbol==1 && line<=2*size+3)
              {
                System.out.print("*");
              }
              else if(symbol==2*size+3 && symbol<=2*size+3)
              {
                System.out.print("*");
              }
              else if( line==2+size)
              {
                 System.out.print("*");
              }
              else
              {
                System.out.print(" ");
              }
          }
          else
          {
            System.out.print(" ");
          }
        }
         System.out.print("\n");
      }
   }
  
  
   void displaypatternI(int size)
   {
      for(int line=1; line<=2*size+3; line++)
      {
        for(int symbol=1; symbol<=2*size+3 ; symbol++)
        {
          if(line==1 || line==2*size+3)
          {
            System.out.print("*");
          }
          else if(symbol==size+2)
          {
            System.out.print("*");
          }
          else
          {
            System.out.print(" ");
          }
        }
        System.out.print("\n");
      }
   }
   
   
   void displaypatternS(int size)
   {
      for(int line=1; line<=2*size+3 ; line++)
      {
        for(int symbol=1; symbol<=2*size+3; symbol++)
        {
          if(line==1)
          {
              if(symbol==1)
              {
                System.out.print(" ");
              }
              else
              {
                System.out.print("*");
              }
          }
          else if(line==2*size+3)
          {
              if(symbol==2*size+3)
              {
                System.out.print(" ");
              }
              else
              {
                System.out.print("*");
              }
          }
          else if(line==size+2)
          {
              if(symbol==1 || symbol==2*size+3)
              {
                System.out.print(" ");
              }
              else
              {
                System.out.print("*");
              }
          }
          else if(line==2 || line<=size+2)
          {
              if(symbol==1 && symbol<=size+2)
              {
                System.out.print("*");
              }
              else
              {
                System.out.print(" ");
              }
          }
          else if (line>size+2 && line<2*size+3)
          {
              if(symbol==2*size+3 && symbol>2+size)
              {
                System.out.print("*");
              }
              else
              {
                System.out.print(" ");
              }
         }
        }
        System.out.print("\n");
      }
   }
   
   
   void displaypatternH(int size)
   {
      for(int line=1 ; line<=2*size+3; line++)
      {
        for(int symbol=1; symbol<=2*size+3; symbol++)
        {
            if((symbol==1  && line<=2*size+3 ) || (symbol==2*size+3 && line<=2*size+3))
            {
              System.out.print("*");
            }
            else if(line==size+2)
            {
              System.out.print("*");
            }
            else
            {
              System.out.print(" ");
            }
        }
        System.out.print("\n");
      }
   }
   
   
   void displaypatternN(int size)
   {
      for(int line=1; line<=2*size+3; line++)
      {
        for(int symbol=1 ; symbol<=2*size+3; symbol++)
        {
            if((symbol==1  && line<=2*size+3 ) || (symbol==2*size+3 && line<=2*size+3))
            {
              System.out.print("*");
            }
            else if(line==symbol)
            {
              System.out.print("*");
            }
            else
            {
              System.out.print(" ");
            }
        }
        System.out.print("\n");
      }
   }
   
   
   
}
