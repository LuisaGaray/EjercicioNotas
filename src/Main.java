import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int op,c,corriente,resistencia,voltaje;
        double tareas,quizes,parciales,total1,total2,total3,total4;
        double port=0.10;
        double porp=0.15;
        boolean flag = false;
        do {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Bienvenido al menu");
            System.out.println("Ingrese 1 para la ley de ohm");
            System.out.println("ingrese 2 para calcular las notas");
            op = teclado.nextInt();
            if (op == 1) {
                System.out.println("Ingrese 1 para conocer voltaje");
                System.out.println("Ingrese 2 para conocer corriente");
                System.out.println("ingrese 3 para conocer resistencia");
                c= teclado.nextInt();
                if (c==1){
                    System.out.println("ingrese la corriente y la resistencia respectivamente");
                    corriente=teclado.nextInt();
                    resistencia=teclado.nextInt();
                    voltaje=corriente*resistencia;
                    System.out.println(voltaje);
                } else if (c==2) {
                    System.out.println("Ingrese el voltaje y la resistencia respectivamente");
                    voltaje=teclado.nextInt();
                    resistencia=teclado.nextInt();
                    corriente=voltaje/resistencia;
                    System.out.println(corriente);
                }else if(c==3){
                    System.out.println("Ingrese el voltaje y la corriente respectivamente");
                    voltaje=teclado.nextInt();
                    corriente=teclado.nextInt();
                    resistencia=voltaje/corriente;
                    System.out.println(resistencia);
                }
            } else if (op == 2) {
                System.out.println("Ingrese las notas de su primer corte");
                do {
                    System.out.println("ingrese el total de nota en todas las tareas");
                    tareas = teclado.nextDouble();
                    if (tareas<0.0 && tareas>5.0) {
                        System.out.println("numero mal digitado");
                        flag = false;
                    } else if (tareas>0.0 && tareas<5.0) {
                        flag = true;
                    }
                }while(flag == false);
                System.out.println("ingrese el total de nota en todos los Quizes");
                quizes=teclado.nextDouble();
                System.out.println("ingrese el total de nota en todos lo parciales");
                parciales=teclado.nextDouble();

                tareas=tareas*port;
                quizes=quizes*port;
                parciales=parciales*porp;
                System.out.println(tareas);
                System.out.println(quizes);
                System.out.println(parciales);
                total1=tareas+quizes+parciales;
                total1=total1/3;
                total1=total1*10.0;

                System.out.println("Su total en el primer corte es "+total1);

                System.out.println("Ingrese las notas de su segundo corte");
                System.out.println("ingrese el total de nota en todas las tareas");
                tareas=teclado.nextDouble();
                System.out.println("ingrese el total de nota en todos los Quizes");
                quizes=teclado.nextDouble();
                System.out.println("ingrese el total de nota en todos lo parciales");
                parciales=teclado.nextDouble();

                tareas=tareas*port;
                quizes=quizes*port;
                parciales=parciales*porp;
                System.out.println(tareas);
                System.out.println(quizes);
                System.out.println(parciales);
                total2=tareas+quizes+parciales;
                total2=total2/3;
                total2=total2*10.0;
                System.out.println("Su total en el primer corte es "+total2);


                System.out.println("Ingrese las notas de su segundo corte");
                System.out.println("ingrese el total de nota en todas las tareas");
                tareas=teclado.nextDouble();
                System.out.println("ingrese el total de nota en todos los Quizes");
                quizes=teclado.nextDouble();
                System.out.println("ingrese el total de nota en todos lo parciales");
                parciales=teclado.nextDouble();

                tareas=tareas*port;
                quizes=quizes*port;
                parciales=parciales*port;
                System.out.println(tareas);
                System.out.println(quizes);
                System.out.println(parciales);
                total3=tareas+quizes+parciales;
                total3=total3/3;
                total3=total3*10.0;
                System.out.println("Su total en el primer corte es "+total3);

                total1=total1*0.35;
                total1=total1*0.35;
                total1=total1*0.30;
                total4=(total1+total2+total3)/3;
                total4=total4*10.0;
                System.out.println("Su total en la materia es de "+total4);

                if (total4>0 && total4<2.0){
                    System.out.println("reprobaste");
                } else if (total4>1.9&&total4<3.0) {
                    System.out.println("Necesitas habilitar la materia");
                } else if (total4>2.9&&total4<5.0) {
                    System.out.println("felicidades pasaste");
                }
            } else System.out.println("error de numero");
        }while(op<4);
    }
}