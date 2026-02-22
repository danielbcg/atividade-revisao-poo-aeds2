import java.text.NumberFormat;
import java.time.LocalDate;

public class ProdutoPerecivel extends Produto{
    private static final double DESCONTO = 0.25;
    private static final int PRAZO = 7;
    private LocalDate dataDeValidade;


    public ProdutoPerecivel(String desc, double precoCusto, double margemLucro, LocalDate validade){
        super(desc, precoCusto, margemLucro);
        dataDeValidade = validade;
    }

    public double valorDeVenda(){

    }

    public String toString(){

    }
    
}