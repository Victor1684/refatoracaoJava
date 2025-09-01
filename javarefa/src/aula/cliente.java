package aula;,

import aula.solid.Rectangle;
import aula.solid.BasicPrinter;
import aula.solid.OfficeAlllnOne;
import aula.solid.Printer;
import aula.solid.Shape;
import aula.solid.Square;

public class cliente {

	public static void main(String[] args) {
		
		Shape r1 = new Rectangle(5, 10);
        System.out.println("Área (retângulo): " + r1.area());

        Shape r2 = new Square(10);
        System.out.println("Área (quadrado): " + r2.area());

        Printer impressoraSimples = new BasicPrinter();
        impressoraSimples.print("Contrato 123");

        OfficeAlllnOne allInOne = new OfficeAlllnOne();
        allInOne.print("Relatório");
        allInOne.scan("Documento");
        allInOne.fax("555-1234", "Mensagem importante");
		
	}

}
