
public class Cafeteria {
	 public static void main( String args[] ){
	        Bebida expresso = new Expresso();
	        System.out.println( expresso.getDescricao()+" | R$ "+expresso.getPreco() );
	        /* Caf� Expresso | R$ 1.5 */

	        Bebida creme = new Creme( expresso );
	        System.out.println( creme.getDescricao()+" | R$ "+creme.getPreco() );
	        /* Caf� Expresso, Creme | R$ 2.0 */

	        Bebida caramelo = new Caramelo( creme );
	        System.out.println( caramelo.getDescricao()+" | R$ "+caramelo.getPreco() );
	        Bebida moca = new Moca( caramelo );
	        System.out.println( moca.getDescricao()+" | R$ "+moca.getPreco() );
	        /* Caf� Expresso, Creme, Caramelo, Moca | R$ 3.1 */
	 }
}
