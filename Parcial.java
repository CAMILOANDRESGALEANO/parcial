import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
public class Parcial { 
    private static int v;
   
     
    public static void main(String[] args) throws IOException { 
        /** Frase a analizar */ 
        BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in)); 
        String frase; 
        System.out.println("Ponga una frase por favor: "); 
        frase = lectura.readLine(); 
         
        
        int a, e, i, o, u; 
        a = e = i = o = u = 0; 
       
        int longitud = frase.length(); 
      
        int indice = 0; 
       
        char letras; 
        do { 
            letras = frase.charAt(indice); 
            switch(letras) { 
            case 'a': 
            case 'á': 
            case 'A': 
                a++; 
                break; 
            case 'e': 
            case 'é': 
            case 'E': 
                e++; 
                break; 
            case 'i': 
            case 'í': 
            case 'I': 
                i++; 
                break; 
            case 'o': 
            case 'ó': 
            case 'O': 
                o++; 
                break; 
            case 'u': 
            case 'ú': 
            case 'U': 
                u++; 
                break; 
            default: 
                break; 
            } 
            indice++; 
        }while(indice < longitud); 
        System.out.println("El número de letras 'a' es: " + a); 
        System.out.println("El número de letras 'e' en: " + e); 
        System.out.println("El número de letras 'i' es: " + i); 
        System.out.println("El número de letras 'o' es: " + o); 
        System.out.println("El número de letras 'u' es: " + u); 
        
        
       int b, c, d, f, g,h,j,k,l,n,m,p,q,r,s,t = 0,w,x,y,z = 0; 
        b = c = d = f = g = h=j=k=l=n=m=p=q=r=s=w=x=y=z; 
       
        int longitu = frase.length(); 
      
        int indic = 0; 
       
        char letra; 
        do { 
            letra = frase.charAt(indic); 
            switch(letra) { 
            case 'b': 
            case 'B': 
            
                b++; 
                break; 
            case 'c': 
            case 'C': 
                c++; 
                break; 
            case 'd': 
            case 'D': 
                d++; 
                break; 
            case 'f': 
            case 'F': 
                f++; 
                break; 
            case 'g':
            case 'G': 
                g++; 
                break; 
                 case 'h':
            case 'H': 
                h++; 
                break;
                 case 'j':
            case 'J': 
                j++; 
                break;
                 case 'k':
            case 'K': 
                k++; 
                break;
                 case 'l':
            case 'L': 
                l++; 
                break;
                 case 'n':
            case 'N': 
                n++; 
                break;
                 case 'M':
            case 'm': 
                m++; 
                break;
                 case 'p':
            case 'P': 
                p++; 
                break;
                 case 'r':
            case 'R': 
                r++; 
                break;
                 case 'S':
            case 's': 
                s++; 
                break;
                 case 't':
            case 'T': 
                t++; 
               
                break;
                 case 'v':
            case 'V': 
                v++;
                break;
                 case 'w':
            case 'W': 
                w++; 
                break;
                 case 'x':
            case 'X': 
                x++; 
                break;
                 case 'y':
            case 'Y': 
                y++; 
                break;
                 case 'z':
            case 'Z': 
                z++; 
                break;
                
            default: 
                break; 
                
            } 
            indic++; 
        }while(indic < longitu); 
        System.out.println("El numero de letras 'b' es:"+b);
System.out.println("El numero de letras 'c' es:"+c);
System.out.println("El numero de letras 'd' es:"+d);
System.out.println("El numero de letras 'f' es:"+f);
System.out.println("El numero de letras 'g' es:"+g);
System.out.println("El numero de letras 'h' es:"+h);
System.out.println("El numero de letras 'j' es:"+j);
System.out.println("El numero de letras 'k' es:"+k);
System.out.println("El numero de letras 'l' es:"+l);
System.out.println("El numero de letras 'm' es:"+m);
System.out.println("El numero de letras 'n' es:"+n);
System.out.println("El numero de letras 'p' es:"+p);
System.out.println("El numero de letras 'q' es:"+q);
System.out.println("El numero de letras 'r' es:"+r);
System.out.println("El numero de letras 's' es:"+s);
System.out.println("El numero de letras 't' es:"+t);
System.out.println("El numero de letras 'v' es:"+v);
System.out.println("El numero de letras 'w' es:"+w);
System.out.println("El numero de letras 'x' es:"+x);
System.out.println("El numero de letras 'y' es:"+y);
System.out.println("El numero de letras 'z' es:"+z);
         
    } 
}
