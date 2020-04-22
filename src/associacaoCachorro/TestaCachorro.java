package associacaoCachorro;

/**
 *
 * @author timoteodimapereira
 */
public class TestaCachorro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cachorro ch = new Cachorro("123", "Farusca", "Pastor Alemão", 
                new Filiacao("FaruscaPai", "FaruscaMãe"),
                new Proprietario ("Lucas", "SHT",
                        new Filiacao ("TimóteoDima", "Juci")));
        System.out.println(ch);
        
    }
    
}
