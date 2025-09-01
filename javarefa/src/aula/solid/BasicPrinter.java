package aula.solid;

public class BasicPrinter implements Printer{
	@Override
    public void print(String content) {
        System.out.println("[PRINT] " + content);
    }
}
