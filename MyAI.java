//package MYAI;
import java.util.*;
import java.io.*;
import java.time.*;
import java.text.*; 
class MyAI
{
    public static void main(String args[])
    {
        MirrorPyramidStr A =new MirrorPyramidStr();
        PREETHIDIS B=new PREETHIDIS();
        PigLatin C= new PigLatin();
        SHORT D=new SHORT(); 
        SHORT2 E=new SHORT2();
        GCD F=new GCD();
        REVERSE G =new REVERSE();
        NoZeroes H=new NoZeroes();
        ALPHABETIC_ORDER I=new ALPHABETIC_ORDER();
        SIMPLEDATEFORMAT J=new SIMPLEDATEFORMAT();       
        PrimeNo K=new PrimeNo();
        NextPrime L=new NextPrime();
        Bytecode M=new Bytecode();
        PrimeFactors N=new PrimeFactors();
        HappyNumber O=new HappyNumber();
        JAVACHE P=new JAVACHE();
        
        

        String str="",str2="",str3="",out="";
        int i1=0,i2=0;
        System.out.println("Hello Sir!");
        Scanner scan=new Scanner(System.in); 
        System.out.print("What can I do for you ??\n\t\t\t\t\t\t\t\t\t");
        while(true)
        {
            str=scan.nextLine();
            out="";
            str2=" "+str.toUpperCase()+" ";
            Scanner scan2=new Scanner(str2);           
            if((str2.indexOf("PRINT")!=-1||str2.indexOf("SHOW")!=-1))
            {
                if(str2.indexOf("MIRROR PYRAMID")!=-1)
                    A.MPS();
                if(str2.indexOf("PREETHI'S PROGRAM")!=-1||str2.indexOf("PREETHI'S PATTERN")!=-1)
                    B.main();
            }
            if(str2.indexOf("WHAT IS THE")!=-1)
            {
                if(str2.indexOf("PIG LATIN WORD FOR")!=-1)
                {                
                    if((str2.indexOf("\"")!=-1)&&((str2.indexOf("\"")+2)!=-1))
                        str3=str2.substring((str2.indexOf("\"")+1),(str2.indexOf("\"",(str2.indexOf("\"")+2))));
                    else
                        str3=str2.substring((str2.indexOf("FOR")+4),str2.indexOf(" ",(str2.indexOf("FOR")+5)));
                    C.PL(str3);                    
                }
            }                        
            if(str2.indexOf("SHORT THIS NAME COMPLETELY")!=-1)
            {
                if((str2.indexOf("\"")!=-1)&&((str2.indexOf("\"")+2)!=-1))
                    str3=str2.substring((str2.indexOf("\"")+1),(str2.indexOf("\"",(str2.indexOf("\"")+2))));
                else 
                    str3=str2.substring((str2.indexOf("COMPLETELY")+4),str2.indexOf(" ",(str2.indexOf("COMPLETELY")+5)));
                D.Short(str3);                                                    
            }
            if(str2.indexOf("SHORT THIS NAME")!=-1&&str2.indexOf("\"")!=-1)
            {                
                if((str2.indexOf("\"")!=-1)&&((str2.indexOf("\"")+2)!=-1))
                    str3=str2.substring((str2.indexOf("\"")+1),(str2.indexOf("\"",(str2.indexOf("\"")+2))));
                out=E.Short2(str3);
            }
            if(str2.indexOf("SHORT THIS NAME")!=-1&&str2.indexOf("\"")==-1)
            {                
                str3=str2.substring((str2.indexOf(" ",str2.indexOf("NAME"))+1));
                out=E.Short2(str3);
            }
            if(str2.indexOf("GCD OF")!=-1||str2.indexOf("G.C.D. OF")!=-1)
            {
                try
                {
                    if(str2.indexOf(",",str2.indexOf("OF"))!=-1)
                    {                    
                        String str4=(str2.substring((str2.indexOf("OF")+3),str2.indexOf(",",str2.indexOf("OF"))));                
                        int i=str2.indexOf(",",str2.indexOf("F"));                
                        int j=str2.indexOf(" ",i);                
                        str4+=" "+(str2.substring(++i,j));               
                        Scanner scan3 =new Scanner(str4);                              
                        i1=scan3.nextInt();
                        i2=scan3.nextInt();                
                    }                                             
                    if(str2.indexOf("GCD OF")!=-1||str2.indexOf("G.C.D. OF")!=-1)
                    {                    
                        i1=scan2.nextInt();
                        i2=scan2.nextInt();                            
                    }
                }   
                catch(NumberFormatException n)
                {
                    new NumberFormatException();
                    System.out.println("Please Enter again by giving space between numbers:"+n);
                    continue;
                }
                F.gcd(i1,i2);
            }
            if(str2.indexOf("REVERSE THIS NAME")!=-1)
            {
                str3=str2.substring(str2.indexOf("\"")+1,str2.indexOf("\"",(str2.indexOf("\"")+2)));
                G.Reverse(str3);
            }
            if(str2.indexOf("REMOVE ZEROES FROM")!=-1)
            {
                if(str2.indexOf("\"")!=-1)
                    i1=Integer.parseInt(str2.substring(str2.indexOf("\"")+1,str2.indexOf("\"",(str2.indexOf("\"")+2))));
                else
                {
                    int j=1;
                    for(int i=1;i<str2.length();i++) if(str2.charAt(i)==' ') j++;
                    for(int i=0,k=0;i<j-1;i++)
                    {                                
                        str3=str2.substring(++k,str2.lastIndexOf(" "));                                
                        k=str2.indexOf(" ",k);                                
                    }
                    i1=Integer.parseInt(str3);                            
                }
                H.No0s(i1);
            }
            if(str2.indexOf("ALPHABETIC ORDER")!=-1)
            {                    
                if(str2.indexOf("\"")!=-1)
                {
                    str3=str2.substring(str2.indexOf("\"")+1,str2.indexOf("\"",(str2.indexOf("\"")+2)));                                            
                }
                else 
                {
                    System.out.print("Enter the word/sentence to be arranged in alphabetic order again within double quotes!\n\t\t\t\t\t\t\t\t\t");
                    str3=" "+scan.nextLine()+" ";                        
                    str3=str3.substring(str3.indexOf("\"")+1,str3.indexOf("\"",(str3.indexOf("\"")+2)));
                }
                I.AlphaORD(str3);
            }
            if(str2.indexOf("WHAT IS MY")!=-1)
            {
                if(str2.indexOf("NAME")!=-1||str2.indexOf("NAME?")!=-1)
                    System.out.println("Your name is M.S. Poojyanth Reddy!");
                if(str2.indexOf("AGE")!=-1||str2.indexOf("AGE?")!=-1)
                    System.out.println("Your age is "+(Integer.parseInt(J.SDF(" YEAR "))-2004));
            }            
            if (str2.indexOf("TODAY")!=-1||str2.indexOf("NOW")!=-1||str2.indexOf("NOW?")!=-1||str2.indexOf("TIME")!=-1||str2.indexOf("YEAR")!=-1||str2.indexOf("MONTH")!=-1)
            {
                str2=str2.trim();                
                if(str2.indexOf("DATE")!=-1||str2.indexOf("TIME")!=-1||str2.indexOf("DAY")!=-1||str2.indexOf("YEAR")!=-1||str2.indexOf("MONTH")!=-1)
                {                    
                    System.out.println(J.SDF(" "+str2+" "));
                }
            }
            if(str2.indexOf("DATE")!=-1)
            {
                str2=str2.trim();
                System.out.println(J.SDF(" "+str2+" "));
            }
            if(str2.indexOf("PRIME NUMBER")!=-1)
            {                
                if(str2.indexOf(" PRIME NUMBER AFTER ")!=-1)
                {
                    Scanner scan3=new Scanner(str2);
                    scan3.useDelimiter("\\D+"); 
                    long j=0;
                    j=scan3.nextLong();
                    try{j=scan3.nextLong();L.nextprime(j); System.out.print("\n\n\t\t\t\t\t\t\t\t\t"); continue;}
                    catch( NoSuchElementException ns)
                    {System.out.println("Please try again correctly!!");}
                    catch(NumberFormatException nfe){System.out.println("Please try again correctly!!");}                    
                }   
                if(str2.indexOf(" PRIME NUMBER AFTER ")!=-1)
                {
                    Scanner scan3=new Scanner(str2);
                    scan3.useDelimiter("\\D+"); 
                    long j=0;                                        
                    try{j=scan3.nextLong();L.nextprime(j);}
                    catch( NoSuchElementException ns)
                    {System.out.println("There is no number in the input! Please try again!");}
                }   
                else 
                {
                    long j=0;
                    Scanner scan3=new Scanner(str2);
                    scan3.useDelimiter("\\D+");                   
                    try{j=scan3.nextLong();K.primeno(j);}
                    catch( NoSuchElementException ns)
                    {System.out.println("There is no number in the input! Please try again!");}                
                }            
            }
            if(str2.indexOf("PRIME FACTORS")!=-1)
            {
                Scanner scan3=new Scanner(str2);
                scan3.useDelimiter("\\D+");                   
                N.primefact(scan3.nextDouble());
            }
            if(str2.indexOf("IS")!=-1&&str2.indexOf("HAPPY NUMBER")!=-1)
            {
                Scanner scan3=new Scanner(str2);
                scan3.useDelimiter("\\D+");                   
                O.happynum(scan3.nextDouble());
            }
            if(str2.indexOf("PERIODIC")!=-1&&str2.indexOf("TABLE")!=-1) P.PDT();                   
            if(str2.indexOf("NO. OF PROTONS IN")!=-1||str2.indexOf("NUMBER OF PROTONS IN")!=-1||str2.indexOf("PROTONS IN")!=-1)
            {
                if(str2.indexOf(" IN THE ELEMENT")!=-1||str2.indexOf(" IN ELEMENT")!=-1)
                {                    
                    P.pro(str2.substring(str2.indexOf(" ",str2.indexOf("ELEMENT"))+1,str2.indexOf(" ",str2.indexOf(" ",str2.indexOf("ELEMENT"))+2)));
                }
                else 
                P.pro(str2.substring(str2.indexOf(" ",str2.indexOf("IN"))+1,str2.indexOf(" ",str2.indexOf(" ",str2.indexOf("IN"))+2)));
            }
            if(str2.indexOf("NO. OF ELECTRONS IN")!=-1||str2.indexOf("NUMBER OF ELECTRONS IN")!=-1||str2.indexOf("ELECTRONS IN")!=-1)
            {
                if(str2.indexOf(" IN THE ELEMENT")!=-1||str2.indexOf(" IN ELEMENT")!=-1)
                {                    
                    P.elec(str2.substring(str2.indexOf(" ",str2.indexOf("ELEMENT"))+1,str2.indexOf(" ",str2.indexOf(" ",str2.indexOf("ELEMENT"))+2)));
                }
                else 
                P.elec(str2.substring(str2.indexOf(" ",str2.indexOf("IN"))+1,str2.indexOf(" ",str2.indexOf(" ",str2.indexOf("IN"))+2)));
            }
            if(str2.indexOf("NO. OF NEUTRONS IN")!=-1||str2.indexOf("NUMBER OF NEUTRONS IN")!=-1||str2.indexOf("NEUTRONS IN")!=-1)
            {
                if(str2.indexOf(" IN THE ELEMENT")!=-1||str2.indexOf(" IN ELEMENT")!=-1)
                {                    
                    P.neu(str2.substring(str2.indexOf(" ",str2.indexOf("ELEMENT"))+1,str2.indexOf(" ",str2.indexOf(" ",str2.indexOf("ELEMENT"))+2)));
                }
                else 
                P.neu(str2.substring(str2.indexOf(" ",str2.indexOf("IN"))+1,str2.indexOf(" ",str2.indexOf(" ",str2.indexOf("IN"))+2)));
            }
            if(str2.indexOf("ATOMIC NUMBER OF")!=-1)
            {
                P.AT(str2.substring(str2.indexOf(" ",str2.indexOf("OF"))+1,str2.indexOf(" ",str2.indexOf(" ",str2.indexOf("OF"))+2)));
            }
            if(str2.indexOf("MASS NUMBER OF")!=-1)
            {
                P.MA(str2.substring(str2.indexOf(" ",str2.indexOf("OF"))+1,str2.indexOf(" ",str2.indexOf(" ",str2.indexOf("OF"))+2)));
            }
            if(str2.indexOf("FORMULA OF")!=-1)
            {
                P.FOR(str2);
            }
            if(str2.indexOf("ALL ELEMENTS")!=-1) P.AllEle();
            if(str2.indexOf("ELEMENTS")!=-1&&str2.indexOf("SYMBOLS")!=-1) P.EleSym();                       
            if(str2.indexOf("BYTE")!=-1&&str2.indexOf("CODE")!=-1) M.bytecode();
            if(str2.indexOf("EXIT")!=-1)
                {System.out.println("Have a Good Day!  :-)"); System.exit(0);             }
            if(str2.indexOf("CLEAR SCREEN")!=-1) System.out.println("\f");
            for(int i=0;i<out.length();i++)
            {
                for(int sl=0;sl<10000000;sl++);
                System.out.print(out.charAt(i));
            }
            System.out.print("\n\n\t\t\t\t\t\t\t\t\t");
        }
    }
}
class SIMPLEDATEFORMAT
{
    public static String SDF(String str) //throws ParseExcaption
    {
        Date date=new Date();        
        String DMY2,DMY4,Yy,Hh,mm,Ss,Hms2,Ee1,z,Z,out=""; 
        Calendar cal = Calendar.getInstance(); 
        try
        {
         cal.setTime( new SimpleDateFormat("dd:MM:YYYY").parse(new SimpleDateFormat("dd:MM:YYYY").format(date)));    
        cal.add( Calendar.DATE, 1 );    
        //String convertedDate=new SimpleDateFormat("dd:MM:YYYY").format(cal.getTime());   
        //LocalDateTime.from(date.toInstant()).plusDays(1);
        if(str.indexOf(" WEEK IN MONTH ")!=-1)out=new SimpleDateFormat("W").format(date);
        else if(str.indexOf(" WEEK IN YEAR ")!=-1)out=new SimpleDateFormat("w").format(date);        
        else if(str.indexOf(" DATE ")!=-1&&str.indexOf(" TIME ",(str.indexOf(" DATE "))+1)!=-1)out="Date:"+new SimpleDateFormat("dd:MM:YYYY").format(date)+"  Time: "+new SimpleDateFormat("HH:mm:ss").format(date);
        else if(str.indexOf(" TIME ")!=-1&&str.indexOf(" DATE ",(str.indexOf(" TIME "))+1)!=-1)out="Time: "+new SimpleDateFormat("HH:mm:ss").format(date)+"  Date:"+new SimpleDateFormat("dd:MM:YYYY").format(date);
        else if(str.indexOf(" DATE ")!=-1)out="Date: "+new SimpleDateFormat("dd:MM:YYYY").format(date);        
        else if(str.indexOf(" TIME ")!=-1)out="Time: "+new SimpleDateFormat("hh:mm:ss a").format(date);        
        else if(str.indexOf(" DAY OF MONTH ")!=-1)out=new SimpleDateFormat("dd").format(date);
        else if(str.indexOf(" DAY OF YEAR ")!=-1)out=new SimpleDateFormat("D").format(date);
        else if(str.indexOf(" DAY OF WEEK IN MONTH ")!=-1)out=new SimpleDateFormat("F").format(date);
        else if(str.indexOf(" DAY ")!=-1)out=new SimpleDateFormat("EEEE").format(date);     
        else if(str.indexOf(" TIME ZONE ")!=-1)out=new SimpleDateFormat("zzzz").format(date);        
        else if(str.indexOf(" YEAR ")!=-1)out=new SimpleDateFormat("YYYY").format(date);
        else if(str.indexOf(" MONTH ")!=-1)out=new SimpleDateFormat("MMMM").format(date);
        else if(str.indexOf(" WEEK ")!=-1)out=new SimpleDateFormat("W").format(date)+"th week in the month";        
        else if(str.indexOf(" ")!=-1) out=new SimpleDateFormat("dd:MM:YYYY").format(date);
        Ee1=new SimpleDateFormat("EE").format(date);
        DMY2=new SimpleDateFormat("dd:MM:YY").format(date);        
        DMY4=new SimpleDateFormat("dd:MM:YY  hh:mm:ss a").format(date);
        Hh=new SimpleDateFormat("HH").format(date);
        mm=new SimpleDateFormat("mm").format(date);
        Ss=new SimpleDateFormat("ss").format(date);        
        Hms2=new SimpleDateFormat("hh:mm:ss a").format(date);
        z=new SimpleDateFormat("z").format(date);        
        Z=new SimpleDateFormat("Z").format(date);        
        }
        catch(ParseException j){}return out;
    }
}
class PrimeFactors
{
    public static double primefact(double n)
    {
        long m=(long)n;
        while(m!=0)
        {            
            for(long i=2;i<=m;)
            {
                if(m%i==0) { m/=i;System.out.println(i);i=2;}
                else {i++;}               
            }
        }
        return 0.0;
    }    
}
class PrimeNo
{
    public static long primeno(long n)
    {
        long m=n,c=0;
        for (long i=2;i<m;i++)
            if(m==2) {System.out.println(n+" is a prime number"); break;}
            else if(m%  i==0||m==-1*Math.abs(m)) {System.out.println(n+" is not a prime number");c=1;break;}
        if(c==0) System.out.println(n+" is a prime number");
        return 0;
    }
}
class PigLatin
{
    public static String PL(String str)
    {        
        String str1="";
        int i;
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
            {str1=str.substring(0,i);break;}

        }
        String stri=str.substring((i),(str.length()))+str1+"AY";
        System.out.println(stri);       
        return " ";
    }
}
class HappyNumber
{
    public static double happynum(double n)
    {
        long m=(long)n,sum=0,d=0;
        do
        {
            sum=0;
            while(m!=0)
            {
                d=m%10;
                sum=sum+d*d;
                m/=10;
            }
            m=sum;
        }while(sum>9);
        if(sum==1)        
            System.out.println("Yes,It is a happy number!");
        else System.out.println("No, It is not a happy number!");
        return 0.0;
    }
}
class Bytecode
{
    public static int bytecode()
    {
        for(int i=1;;i++)
        {
            for(int j=1;j<=60;j++)
            {
                System.out.print((int)(Math.random()*2)+" ");
            }
            System.out.println();
        }
    }
}
class GCD
{
    public static int gcd(int a, int b)
    {

        int mini=Math.min(a,b);
        int gcd=0;
        for(int i=1;i<=mini;i++)
            if(a%i==0&&b%i==0)
                gcd=i;
        System.out.println(gcd);
        return 0;
    }
}
class ALPHABETIC_ORDER
{
    public static String AlphaORD(String str)
    {
        int l=str.length();
        String t="";
        str=str.toUpperCase();
        for (char i='A';i<='Z';i++)
        {
            for(int j=0;j<=l-1;j++)
                if(str.charAt(j)==i)
                    t=t+i;    
        }
        System.out.println(t);
        return "";
    }
}
class NextPrime
{
    public static void nextprime(long n)
    {
        long l=n;
        boolean b=true,bl=false;
        while(b==true)
        {    
            ++l;
            bl=false;
            for (long i=2;i<l;i++)
            {                
                if(l==2) 
                {
                    b=false;break;
                }
                else if(l%i==0) {bl=true;break;}
            }            
            if(bl==false) b=false;
        }
        if(bl==false) System.out.println("The next prime number after "+n+" is "+l);

    }
}
class SHORT2
{
    public static String Short2(String str)
    {
        str=str.trim();
        String str2=""; 
        char ch='\u0000';
        String st="",st2="";
        int fi,li=0;
        fi=0;
        while(li!=str.lastIndexOf(' '))
        {

            li=str.indexOf(" ",fi+1);
            st=str.substring(fi,li);      
            st2=st2+Character.toUpperCase(st.charAt(0))+'.';          
            fi=li+1;            
        }
        str2=str.substring(fi);
        //System.out.print(st2+str2);
        return st2+str2;
    }
}
class NoZeroes
{
    public static int No0s(int n)
    {                                    
        int m=n,c=0;
        while(m>0)
        {
            c++;
            m/=10;
        }
        m=n;int sum=0;int x=0;
        for(int i=0;i<=c;i++)
        {
            int d=m%10;        
            if(d!=0)
                sum=sum+d*(int)Math.pow(10,x++);
            m/=10;
        }
        System.out.println(sum);
        return 0;
    }       
}
class SHORT
{
    public static String Short(String str)
    {
        str=str.trim();
        str=str+' ';
        char ch='\u0000';
        String st="",st2="";
        int fi,li=0;
        fi=0;
        while(li!=str.lastIndexOf(' '))
        {

            li=str.indexOf(' ',fi+1);
            st=str.substring(fi,li);      
            st2=st2+Character.toUpperCase(st.charAt(0))+'.';          
            fi=li+1;            
        }
        //System.out.print(st2);
        return st2;
    }
}
class REVERSE
{
    public static String Reverse(String str)
    {        
        System.out.println(new StringBuilder(str).reverse());
        return "";
    }
}
class MirrorPyramidStr
{
    static String MPS(){ 
        String st = "LOYOLA";
        int len = st.length();
        for(int i=0;i<len;i++){
            for(int j=len-1;j>=0;j--)
                if(j>i)     System.out.print(" ");
                else        {
                    char ch = st.charAt(i);
                    System.out.print(ch+" ");
                }
            System.out.println();
        }    
        for(int i=len-2;i>=0;i--){
            for(int j=len-1;j>=0;j--)
                if(j>i)     System.out.print(" ");
                else        {
                    char ch = st.charAt(i);
                    System.out.print(ch+" ");}
            System.out.println();
        }
        return " ";
    }

}
class PREETHIDIS
{
    public static void main()
    {
        PREETHI1.ABC();
        PREETHI2.def();
        PREETHI3.GHI();
        PREETHI4.jkl();
        System.out.println("\"CAT\"  ->  GOOD PREETHI!  :)");
    }
}
class PREETHI1 extends PREETHI3
{
    protected static char ABC()
    {
        for(int i=3;i<=8;i++)
            if(i%4==0)
                System.out.print('^');
            else System.out.print(" ");
        System.out.println();
        return '^';
    }
}
class PREETHI2 extends PREETHI4
{
    protected static char def()
    {
        for(int i=1;i<=6;i++)
            if(i==2)
                System.out.print("(");
            else if (i!=1&&i%2!=0)
                System.out.print("o");      
            else if(i==6)
                System.out.print(")");
            else System.out.print(" ");
        System.out.println();
        return ' ';
    }
}
class PREETHI3 extends PREETHIDIS
{
    protected static char GHI()
    {
        for(int i=1;i<=7;i++)
            if(i==1) System.out.print("(");
            else if(i==3) System.out.print(">");
            else if(i==4) System.out.print("o");
            else if(i==5) System.out.print("<");
            else if(i==7) System.out.print(")");
            else System.out.print(" ");
        System.out.println();
        return' ';
    }
}
class PREETHI4 extends PREETHIDIS
{
    protected static char jkl()
    {
        for(int i=1;i<=6;i++)               
            if(i==2) System.out.print("(");
            else if(i==4) System.out.print("w");
            else if(i==6) System.out.print(")");
            else System.out.print(" ");
        System.out.println();
        return ' ';
    }
}        
class JAVACHE
{
    static char aco='\u2080';
    static String E[]={"H","He","Li","Be","B","C","N","O","F","Ne","Na","Mg","Al","Si","P","S","Cl","Ar","K","Ca","Sc","Ti","V","Cr","Mn","Fe","Co","Ni","Cu","Zn","Ga","Ge","As","Se","Br","Kr","Rb","Sr","Y","Zr","Nb","Mo","Tc","Ru","Rh","Pd","Ag","Cd","In","Sn","Sb","Te","I","Xe","Cs","Ba","La","Ce","Pr","Nd","Pm","Sm","Eu","Gd","Tb","Dy","Ho","Er","Tm","Yb","Lu","Hf","Ta","W","Re","Os","Ir","Pt","Au","Hg","Tl","Pb","Bi","Po","At","Rn","Fr","Ra","Ac","Th","Pa","U","Np","Pu","Am","Cm","Bk","Cf","Es","Fm","Md","No","Lr","Rf","Db","Sg","Bh","Hs","Mt","Ds","Rg","Cn","Uut","Fl","Uup","Lv","Uus","Uuo"};
    static String EE[]={"Hydrogen","Helium","Lithium","Berylium","Boron","Carbon","Nitrogen","Oxygen","Fluorine","Neon","Sodium","Magnesium","Aluminium","Silicon","Phosphorus","Sulphur","Chlorine","Argon","Potassium","Calcium","Scandium","Titanium","Vanadium","Chromium","Manganese","Iron","Cobalt","Nickel","Copper","Zinc","Gallium","Germanium","Arsenic","Selenium","Bromine","Krypton","Rubidium","Strontium","Yttrium","Zirconium","Niobium","Molybdenum","Technetium","Ruthenium","Rhodium","Palladium","Silver","Cadmium","Indium","Tin","Antimony","Tellurium","Iodine","Xenon","Caesium","Barium","Lanthanum","Cerium","Praseodymium","Neodymium","Promethium","Samarium","Europium","Gadolinium","Terbium","Dysprosium","Holmium","Erbium","Thulium","Ytterbium","Lutetium","Hafnium","Tantalum","Tungsten","Rhenium","Osmium","Iridium","Platinum","Gold","Mercury","Thallium","Lead","Bismuth","Polonium","Astatine","Radon","Francium","Radium","Actinium","Thorium","Protactinium","Uranium","Neptunium","Plutonium","Americium","Curium","Berkelium","Californium","Einstenium","Fermium","Mendelevium","Nobelium","Lawrencium","Rutherfordium","Dubnium","Seaborgium","Bohrium","Hassium","Mitnerium","Damstacium","Roentgentium","Copernicium","Ununtrium","Flerovium","Ununpentium","Livermorium","Ununseptium","Ununoctium"};    
    static double Ma[]={1,4,7,9,11,12,14,16,19,20,23,24,27,28,31,32,35.5,40,39,40,45,48,51,52,55,56,59,59,64,65,70,73,75,79,80,84,85.5,88,89,91,93,96,97,101,103,106,108,112,115,119,122,128,127,131,133,137,139,140,141,144,145,150,152,157,159,162.5,165,167,169,173,175,178.5,181,184,186,190,192,195,197,201,204,207,209,209,210,222,223,226,227,232,231,238,237,244,243,247,247,251,254,257,258,259,260,261,262,263,262,265,267,000,000,000,000,289,000,298,000,000};    
    static int Va[]={+1,0,1,2,3,4,-3,-2,-1,0,1,2,3,4,-3,-2,-1,0,1,2,3,4,-3,-2,-1};
    static String RAD[]={"SULPHATE","SULPHITE","CARBONATE","DICHROMATE","ACETATE","BI","PERMANGANATE","HYDROXIDE","CYANIDE","NITRATE","NITRITE","CHLORITE","HYPOCHLORITE","CHLORATE","PERCHLORATE","META ALUMINATE","SILICATE","THIOSULPHATE","ZINCATE","PLUMBITE","STANNATE","MANGANATE","CHROMATE","OXALATE","ARSENATE","NITRIDE","ARSENITE","PHOSPHITE","PHOSPHATE","BORATE","ALUMINATE","FERROCYANIDE"};
    static String rad[]={"SO"+((char)(aco+4)),"SO"+((char)(aco+3)),"CO"+((char)(aco+3)),"Cr"+((char)(aco+2))+"O"+((char)(aco+7))};
    public static void PDT()
    {        
        String format="%1$-15s %2$-15s %3$-10s %4$-10s\n";
        System.out.format(format,"Atomic.No:","Name:","Symbol:","Mass No.");
        for(int i=0;i<118;i++)
        {    
            System.out.format(format,(i+1),EE[i],E[i],Ma[i]);
        }
        System.out.println("\n\n\t"+'\u8432'+" 0.0 - the mass numbers of the elements have not yet been found");
    }
    public static void AllEle()
    {        
        System.out.println("Name:");
        for(int i=0;i<118;i++)
        {                     
            System.out.println(EE[i]);
        }
    }
    public static void EleSym()
    {
        String Tformat="%1$-10s %2$-15s %3$-10s\n";
        System.out.format(Tformat,"S.No.:","Name:","Symbol:");
        for(int i=0;i<118;i++)
        {    
            System.out.format(Tformat," "+(i+1),EE[i],E[i]);
        }
    }
    public static void AT(String str)
    {
        for(int i=0;i<E.length;i++)
        {
            if(str.compareTo(E[i])==0)
            {
                System.out.println("Atomic Number of "+str+" is "+(i+1));
                break;
            }
        }
    }
    public static void MA(String str)
    {
        for(int i=0;i<E.length;i++)
        {
            if(str.compareTo(E[i])==0)
            {
                System.out.println("Mass Number of "+str+" is "+Ma[i]+"(app.)");
                break;
            }
        }
    }
    public static void pro(String str)
    {
        for(int i=0;i<E.length;i++)
        {
            if(str.compareTo(E[i])==0)
            {
                System.out.println(EE[i]+" has "+(i+1)+" protons!");
                break;
            }
        }
    }
    public static void elec(String str)
    {
        for(int i=0;i<E.length;i++)
        {
            if(str.compareTo(E[i])==0)
            {
                System.out.println(EE[i]+" has "+(i+1)+" electrons!");
                break;
            }
        }
    }
    public static void neu(String str)
    {        
        for(int i=0;i<E.length;i++)
        {
            if(str.compareTo(E[i])==0)
            {
                System.out.println(EE[i]+" has "+(int)(Ma[i]-(i+1))+" neutrons!");
                break;
            }
        }
    }
    public static void ECG(String str)
    {
        for(int i=0;i<E.length;i++)
        {
            if(str.compareTo(E[i])==0)
            {
                String ecg=""; int t=i+1;
                for(int j=i+1,c=1;j>0;c++,j--)
                {
                    if(t-(2*c*c)>0)
                    ecg=ecg+(2*c*c)+",";
                    else {ecg=ecg+(t); break;}
                    t=t-(2*c*c);
                }
                System.out.println("E.Config of "+str+" is "+ecg);
                break;
            }
        }
    }
    public static void FOR(String str)
    {        
        boolean th,ra;
        for(int i=0;i<EE.length;i++)
        {
            EE[i]=EE[i].toUpperCase();
        }
        str=str.toUpperCase();
        Scanner scan=new Scanner(str);                
        while(scan.hasNext())
        {
            th=false;ra=false;
            int i=0,ac=1,a=0;
            String o="";
            boolean a1=false;
            String S=scan.next(); 
            for(a=1;a1==false&&a<S.length()&&S.length()>=3;a++)
            {                    
                switch(S.substring(0,a))
                {                    
                    case "MONO": case "MON":
                    ac=1; a1=true;
                    break;
                    case "BI": case "DI":
                    ac=2; a1=true; 
                    break;
                    case "TRI":
                    {ac=3; a1=true;}
                    break;
                    case "TETRA":
                    {ac=4; a1=true;}
                    break;
                    case "PENTA":
                    {ac=5; a1=true;}
                    break;
                    case "HEXA":
                    {ac=6; a1=true;}
                    break;
                    case "HEPTA":
                    {ac=7; a1=true;}
                    break;
                    case "OCTA":
                    {ac=8; a1=true;}
                    break;
                    case "NON":
                    {ac=9; a1=true;}
                    break;
                    case "DECA":
                    {ac=10; a1=true;}
                    break;                    
                }                               
            }            
            //System.out.println(S);
            for(int b=0;b<RAD.length ;b++)
            {
                //System.out.println(RAD[b]);
                if(ac>0 && RAD[b].compareTo(S.substring(a-1))==0)
                { o="("+rad[b]+")"+((char)(aco+ac)); b=1000; th=true; ra=true;}
                else if(ac==0 && RAD[b].compareTo(S)==0)            
                { o=rad[b]; b=1000; th=true; ra=true;}
                
            }                
            for(int b=0;b<EE.length && a1==true &&ra==false;b++)
            {         
                if(ac>1  &&  EE[b].substring(0,2).compareTo(S.substring(a-1,a+1))==0)
                {o=E[b]+((char)(aco+ac)); b=100000; th=true;
                }
                else if(ac==1  &&  EE[b].substring(0,2).compareTo(S.substring(a-1,a+1))==0)
                {o=E[b]; b=100000;   th=true;
                }                
            }
            if(S.indexOf('(')!=-1)
            {               
                for(int c=0;c<EE.length&&a1==false;c++)
                {                
                    if(EE[c].compareTo(S.substring(0,S.indexOf('(')))==0)
                    {o=EE[c]; c=1000;th=true;
                    }
                }
            }
            else if(S.compareTo("TIN")==0){o="Sn";th=true; }
            else
            {                         
                for(int c=0;c<EE.length&&a1==false&&S.length()>3 &&ra==false;c++)
                {                            
                    if(S.compareTo("OXIDE")==0)
                    {o=E[7]; c=1000;th=true;}   
                    else if(EE[c].compareTo("TIN")==0) continue;
                    else if(EE[c].substring(0,4).compareTo(S.substring(0,4))==0)
                    {o=E[c]; c=1000;     th=true;                    
                    }                    
                }
            }
            if(th!=true) {System.out.println(); continue;}                        
            if(S.indexOf(",")!=-1) {System.out.println(o+"\n");continue;}
            else System.out.print(o);
        }        
    }    
}