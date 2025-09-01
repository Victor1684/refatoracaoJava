package aula.solid;

public class OfficeAlllnOne implements Printer, Scanner, Fax{
	@Override
    public void print(String content) {
        System.out.println("[PRINT] " + content);
    }

    @Override
    public void scan(String document) {
        System.out.println("[SCAN] " + document);
    }

    @Override
    public void fax(String number, String content) {
        System.out.println("[FAX] Enviando para " + number + ": " + content);
    }
}
