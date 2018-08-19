import java.util.Scanner;
import java.util.ArrayList;

public class Notas {
	private String Materia;
        private int NumeroSemestre,NumeroCreditos;
	private int NotaFinal;
	private double Total_acumulado,cantidad,Promedio_acumulado;

	private String []Materias1={"competencias comunicativas","Gestion tecnologica","Fundamentacion en Ingenieria","Sistemas Dinamicos Discretos","Ingles de Negocio", "Arquitectura de Computacion"};
	private String []Materias2={"Sistemas Dinamicos Discretos","Ingles de Negocio","Arquitectura de Computacion"};
	private String []Materias3={"Sistemas Dinamicos Continuos","Estadistica y Probabilidad","Modelado Fenomenos fisicos","Investigacion de Operación"};
	private String []Materias4={"Ecuaciones Diferenciales","Contruccion Software","Cultura Emprendimiento","Estudios Culturales y Socio Humanisticos"};
	private Scanner teclado;
	public ArrayList Materias;
	public ArrayList DatosUnidades;
	public int i,j,n,Total_Creditos,Perdidas,nota;
	
	public void main()
	{
		Materias = new ArrayList();
	}
	
	public void CapturaNotas()
	{
  	   teclado = new Scanner(System.in);
	   System.out.print("\nDatos de las Unidades de Estudio\n");  
	   System.out.print("\nDigite el Numero Semestre: ");
    	   NumeroSemestre = teclado.nextInt();	
	   System.out.print("Seleccione la materia a registrar: ");
           
	   if (NumeroSemestre==1)
	   {
	      n=Materias1.length;
              for(i=0;i<n;i++)
                {
          	   System.out.print("\n"+i+" :"+Materias1[i]);
                }
              System.out.print("\nEscoja Un Numero: ");
              j = teclado.nextInt();
 	      teclado.nextLine();
 	      Materia = Materias1[j];
	   }   
	   else
	   if (NumeroSemestre==2)
	   {
	      n=Materias2.length;
              for(i=0;i<n;i++)
                {
          	   System.out.print("\n"+i+" :"+Materias2[i]);
                }
              System.out.print("\nEscoja Un Numero: ");
              j = teclado.nextInt();
 	      teclado.nextLine();
       	      Materia = Materias2[j];
	   }   
	   else
	   if (NumeroSemestre==3)
	   {
	      n=Materias3.length;
              for(i=0;i<n;i++)
                {
          	   System.out.print("\n"+i+" :"+Materias3[i]);
                }
              System.out.print("\nEscoja Un Numero: ");
              j = teclado.nextInt();
 	      teclado.nextLine();
       	      Materia = Materias3[j];
	   }   
	   else
	   if (NumeroSemestre==4)
	   {
	      n=Materias4.length;
              for(i=0;i<n;i++)
                {
          	   System.out.print("\n"+i+" :"+Materias4[i]);
                }
              System.out.print("\nEscoja Un Numero: ");
              j = teclado.nextInt();
 	      teclado.nextLine();
       	      Materia = Materias4[j];
	   }   
               
           System.out.print("Digite Numero de Creditos: ");
           NumeroCreditos = teclado.nextInt();
           System.out.print("Digite La Nota Final: ");
           NotaFinal = teclado.nextInt();	
       		
	   DatosUnidades = new ArrayList();
	   DatosUnidades.add(0,NumeroSemestre);
	   DatosUnidades.add(1,Materia);
	   DatosUnidades.add(2,NumeroCreditos);
	   DatosUnidades.add(3,NotaFinal);				
	   Materias.add(DatosUnidades);
	}
	
	public void CalcularNotas()
	{		
	   n = Materias.size();
	   if(n!=0)
	   {
	        i=0;
	        j=0;
	        System.out.print("\nListado de Materias: "+n+"\n");
	        Perdidas = 0;
		Total_acumulado =0;
		Promedio_acumulado =0;
		Total_Creditos =0;
		cantidad = 0;
		for(i=0;i<n;i++)
		{			
		    Total_acumulado = Total_acumulado + (int)((ArrayList)Materias.get(i)).get(3);
		    Total_Creditos = Total_Creditos + (int)((ArrayList)Materias.get(i)).get(2);
		    cantidad = cantidad +1;
		    nota = (int)((ArrayList)Materias.get(i)).get(3);
		    if (nota< 3 )
		    {
		       Perdidas = Perdidas + 1;
		    }   
		}
		Promedio_acumulado = (Total_acumulado/cantidad);
		System.out.print("\nPromedio Acumulado: " + Promedio_acumulado);
		System.out.print("\nTotal_creditos: " + Total_Creditos);
		System.out.print("\nCantidad de Notas Perdidas: " + Perdidas);
			
	   }
	   else
	   {
		System.out.print("\nLista De Materias - No hay Datos Registrados.");
   	   }
	}
	
	public void MostrarNotas()
	{		
		System.out.print("\n\nDatos de Ultima Materia Registrada: ");
		System.out.print("\nNumero Semestre: "+DatosUnidades.get(0));
		System.out.print("\nMateria: "+DatosUnidades.get(1));
		System.out.print("\nNUmero Creditos: "+DatosUnidades.get(2));
		System.out.print("\nNota: "+DatosUnidades.get(3));
	}
	
	public void ListarNotas()
	{
		n = Materias.size();
		if(n!=0)
		{
		    i=0;
		    j=0;
		    System.out.print("\nListado de Materias: "+n+"\n");
		    for(i=0;i<n;i++)
		    {			
			int semestre = (int)((ArrayList)Materias.get(i)).get(0);
			String materia =(String)((ArrayList)Materias.get(i)).get(1);
			int creditos = (int)((ArrayList)Materias.get(i)).get(2);
			int notaf = (int)((ArrayList)Materias.get(i)).get(3);
		        
		        String Msj = i+1+":Numero de Semestre: "+semestre+"  Materia: "+materia+" Numero Creditos: "+creditos+"  Nota Final: "+notaf+"\n";
			System.out.print(Msj);
		    }
		}
		else
		{
		    System.out.print("\nLista De Materias - No hay Datos Registrados.");
		}
	}
}