//*******************************************************************
// Program Klasa prostokąt
// Michał Kaczmarek s18464 i Adrian Matyszczak s19850
//
//*******************************************************************

import java.lang.Math;
import java.util.Scanner;

public class Postokat{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Podaj A");
int a = input.nextInt();
System.out.println("Podaj B");
int b = input.nextInt();
System.out.println("Pole wynosi: "+a*b+"cm2");
System.out.println("Obwod wynosi wynosi: "+2*(a+b)+"cm2");
System.out.println("Przekatna wynosi wynosi: "+Math.sqrt(2*(a+b))+"cm2");
}
}
