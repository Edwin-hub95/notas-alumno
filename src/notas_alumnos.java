
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mejía Sánchez
 */
public class notas_alumnos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        List<alumno> listalumnos = new ArrayList();
        
        int id;
        String nombre;
        double parcialUno;
        double parcialDos;
        double zona;
        double examenFinal;
        double total;
        char ingresaRegistro = 'n';
        
        do{
        
            System.out.println("ingresar los siguientes registros:");
            System.out.print("Id:");
            id = sc.nextInt();
            System.out.print("nombre:");
            nombre = sc.next();
            System.out.print("parcial uno:");
            parcialUno = sc.nextDouble();
            System.out.print("parcial dos:");
            parcialDos = sc.nextDouble();
            System.out.print("zona:");
            zona = sc.nextDouble();
            System.out.print("examen final:");
            examenFinal = sc.nextDouble();
            
            listalumnos.add(new alumno(id,
                    nombre,
                    parcialUno,
                    parcialDos,
                    zona,
                    examenFinal));
        
            System.out.println("desa ingresar un nuevo registro? s/n");
            ingresaRegistro = sc.next().charAt(0);
        }while(ingresaRegistro == 's');
        
        System.out.println("Id\tNombre\tParcial1\tParcial2\tZona\tFinal\tTotal");
        for(alumno alumno: listalumnos){
                        
            System.out.println(alumno.getId() + 
                    "\t" + alumno.getNombre() + 
                    "\t" + alumno.getParcialUno() +
                    "\t\t" + alumno.getParcialDos() +
                    "\t\t" + alumno.getZona() + 
                    "\t" + alumno.getExamenFinal() +
                    "\t" + alumno.getTotal());
        }
        
         for(alumno alumno: listalumnos){
            
            alumno.setZona(0);
            
            System.out.println(alumno.getId() + 
                    "\t" + alumno.getNombre() + 
                    "\t" + alumno.getParcialUno() +
                    "\t\t" + alumno.getParcialDos() +
                    "\t\t" + alumno.getZona() + 
                    "\t" + alumno.getExamenFinal() +
                    "\t" + alumno.getTotal());
        }
        
    }
    
}

     