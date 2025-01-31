class Practical7{

	  public static void main(String args[])
	  {
	    Practical7 p=new Practical7();
	    int size=Integer.parseInt(args[0]);
		  for(int line=1; line<=2*size+3; line++)
		  {
			  System.out.print( p.displaypatternV(line,size) + " " + p.displaypatternA(line,size) + " " + p.displaypatternI(line,size) + " " + p.displaypatternS(line,size) + " " + p.displaypatternH(line,size) + " " + p.displaypatternN(line,size) + " " + p.displaypatternA(line,size) + " " + p.displaypatternV(line,size) + " " + p.displaypatternI(line,size) );
			  System.out.println();
		  }
	  }
	
  // V pattren
 	
	  String displaypatternV(int line, int size)
	  {
	  	String pattern="";
		  for(int symbol=1; symbol<=2*size+3; symbol++)
		  {
			      if((symbol==1 && line<2*size+2 )|| (symbol==2*size+3 && line<2*size+2))
		     		 {
		     			pattern+="*";	
		     		 }
	      		   else if(line==2*size+2)
	      		   {
	      		      if(symbol==1 || symbol==2*size+3)
	      		      {   
	      		        pattern+=" ";
	      		      } 
	      		      else if(symbol==2 || symbol==2*size+2)
	      		      {
	      		        pattern+="*";
	      		      }
	      		      else
	      		      {
	      		        pattern+=" ";
	      		      }
	      		   }
	      		   else if(line==2*size+3)
	      		   {
	      		      if(symbol==1 || symbol==2*size+3)
	      		      {
	      		        pattern+=" ";	
	      		      }
	      		      else if(symbol%2==0)
	      		      {
	      		        pattern+=" ";	
	      		      }
	      		      else
	      		      {
	      		        pattern+="*";
	      		      }
			    }
		            else 
			    {
		   	  	pattern+=" ";	
			    }
		    }
		    return pattern;
	  }
	  
// A pattern

	String displaypatternA(int line, int size)
	{
		String pattern="";
		for(int symbol=1; symbol<=2*size+3; symbol++)
		{
		  if(line==1)
		  {  
		      if(symbol==1 || symbol==2*size+3)
		      {
		        pattern+=" ";
		      }
		      else
		      {
		        pattern+="*";
		      }
		  }
		  else if(line==2 || line<=2*size+3)
		  {
		     if(symbol==1 && line<=2*size+3)
		      {
		        pattern+="*";
		      }
		      else if(symbol==2*size+3 && symbol<=2*size+3)
		      {
		        pattern+="*";
		      }
		      else if( line==2+size)
		      {
		         pattern+="*";
		      }
		      else
		      {
		         pattern+=" ";
		      }
		  }
		  else
		  {
		     pattern+=" ";
		  }
               }
               return pattern;
	}
	
	
//I pattern

	String displaypatternI(int line,int size)
	{
		String pattern="";
		for(int symbol=1; symbol<=2*size+3 ; symbol++)
		{
			  if(line==1 || line==2*size+3)
			  {
			     pattern+="*";
			  }
			  else if(symbol==size+2)
			  {
			     pattern+="*";
			  }
			  else
			  {
			     pattern+=" ";
			  }
		}
		return pattern;
	}
	
	
  // S pattern
  
  	String displaypatternS(int line,int size)
  	{
  		String pattern="";
  		 for(int symbol=1; symbol<=2*size+3; symbol++)
		{
		  if(line==1)
		  {
		      if(symbol==1)
		      {
		         pattern+=" ";
		      }
		      else
		      {
		         pattern+="*";
		      }
		  }
		  else if(line==2*size+3)
		  {
		      if(symbol==2*size+3)
		      {
		         pattern+=" ";
		      }
		      else
		      {
		         pattern+="*";
		      }
		  }
		   else if(line==size+2)
		  {
		      if(symbol==1 || symbol==2*size+3)
		      {
		         pattern+=" ";
		      }
		      else
		      {
		         pattern+="*";
		      }
		  }
		  else if(line==2 || line<=size+2)
		  {
		      if(symbol==1 && symbol<=size+2)
		      {
		         pattern+="*";
		      }
		      else
		      {
		         pattern+=" ";
		      }
		  }
		  else if (line>size+2 && line<2*size+3)
		  {
		      if(symbol==2*size+3 && symbol>2+size)
		      {
		         pattern+="*";
		      }
		      else
		      {
		         pattern+=" ";
		      }
		  }
              }
              return pattern;
  	}
  
  
  // H pattern
  
  	String displaypatternH(int line,int size)
  	{
  		String pattern="";
  		for(int symbol=1; symbol<=2*size+3; symbol++)
		{
		    if((symbol==1  && line<=2*size+3 ) || (symbol==2*size+3 && line<=2*size+3))
		    {
		       pattern+="*";
		    }
		    else if(line==size+2)
		    {
		       pattern+="*";
		    }
		    else
		    {
		       pattern+=" ";
		    }
		}
		return pattern;
  	}
  	
  // N pattern
  
  	String displaypatternN(int line,int size)
  	{
  		String pattern="";
	  	for(int symbol=1 ; symbol<=2*size+3; symbol++)
		{
		    if((symbol==1  && line<=2*size+3 ) || (symbol==2*size+3 && line<=2*size+3))
		    {
		       pattern+="*";
		    }
		    else if(line==symbol)
		    {
		       pattern+="*";
		    }
		    else
		    {
		       pattern+=" ";
		    }
		}
		return pattern;
  	}
}
