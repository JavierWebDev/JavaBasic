package com.stardevs;

import java.util.Scanner;
import java.text.MessageFormat;
import java.util.ArrayList;

public class Main {
    @SuppressWarnings({"unusued","resource"})
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Persona> personas = new ArrayList<Persona>();
        

        boolean flag = true;
        int idx = 0;

        while (flag) {
            Persona myPerson = new Persona();

            idx++;
            String mensajepersonas = MessageFormat.format("Persona #{0}", idx);
            System.out.println(mensajepersonas);

            System.out.println("Ingrese un nombre: ");
            myPerson.setNombre(sc.nextLine());
    
            System.out.println("Ingrese la edad: ");
            myPerson.setEdad(Integer.parseInt(sc.nextLine()));
    
            System.out.println("Ingrese un email: ");
            myPerson.setEmail(sc.nextLine());
    
            personas.add(myPerson);

            System.out.println("Desea ingresar otra persona? [Ingrese ' 0 ' Si quiere salir.]:");
            String opc = sc.nextLine();

            if (opc.equals("0")) {
                flag = false;
                System.out.println("Saliendo del programa");
            }
            else if (personas.size() >= 5) {
                flag = false;
                System.out.println("Saliendo del programa");
            }
            else {
                flag = true;
            }
        }

        idx = 0;

        int edadMayor = 0;
        for (Persona persona : personas) {
            idx++;
            String mostrarpersona = MessageFormat.format("Persona #{0}: \n - Nombre: {1} \n - Edad: {2} \n - Email: {3}", idx, persona.nombre, persona.edad, persona.email);
            System.out.println(mostrarpersona);

            if (persona.edad > edadMayor) {
                edadMayor = persona.edad;
            } else {
                continue;
            }

        }
        System.out.println(edadMayor);
    }
}