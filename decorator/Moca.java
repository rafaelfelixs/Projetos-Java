
public class Moca extends DecoratorBebida {
	public Moca( Bebida bebida ){
        super( bebida );
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Moca";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 0.25;
    }
}
