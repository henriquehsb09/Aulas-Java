package trycatch;

public class AumentaFrase {
    public static void main(String args[])
    {
        String frase = null;
        String novaFrase = null;
        try
        {
            novaFrase = frase.toUpperCase();
        }
        catch(NullPointerException e)
        {
            System.out.println("O frase inicial está nulo, para"
                   + " solucional tal o problema, foi lhe atribuito um valor default.");
            frase = "Frase vazia";
        }
        finally
        {
            novaFrase = frase.toUpperCase();
        }
        System.out.println("Frase antiga: "+frase);
        System.out.println("Frase nova: "+novaFrase);
    }
}