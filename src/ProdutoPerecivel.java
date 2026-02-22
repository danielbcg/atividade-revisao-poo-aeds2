import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ProdutoPerecivel extends Produto{
    private static final double DESCONTO = 0.25;
    private static final int PRAZO = 7;
    private LocalDate dataDeValidade;


    public ProdutoPerecivel(String desc, double precoCusto, double margemLucro, LocalDate validade){
        super(desc, precoCusto, margemLucro);
        dataDeValidade = validade;
    }

    public LocalDate getDataDeValidade(){
        return dataDeValidade;
    }

    @Override
    public double valorDeVenda(){
        double valorDeVenda = super.valorDeVenda();

        //calcula qnts dias falta pra vencer o produto
        LocalDate hoje = LocalDate.now();
        int diasAteVencer = ChronoUnit.DAYS.between(hoje, dataDeValidade);

        if(diasAteVencer<=PRAZO){
            return valorDeVenda*(1-DESCONTO);
        }
        else{
            return valorDeVenda;
        }
    }

    @Override
    public String toString(){
        return super.toString() +" VALIDADE: " + dataDeValidade;
    }
    
}