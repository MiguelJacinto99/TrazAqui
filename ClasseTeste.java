import java.util.List;
import java.util.ArrayList;

public class ClasseTeste {
    public static void main (String [] args) {
        String p = "Batatas";
        String p1 = "Cenouras";
        String p2 = "Mesas";
        ArrayList<String> produtos = new ArrayList<>();
        produtos.add(p);
        produtos.add(p1);
        produtos.add(p2);
        Encomenda enc1 = new Encomenda("Loja dos 300","Andre Mendes","Samsung",20,24,false,produtos);
        Encomenda enc2 = new Encomenda("Mariazinha","Rui Fonseca","HP",50,2,false,produtos);
        PedidoEncomenda pe1 = new PedidoEncomenda(300,23,false,enc1);
        PedidoEncomenda pe2 = new PedidoEncomenda(100,57,false,enc2);
        ArrayList<PedidoEncomenda> pedido = new ArrayList<>();
        pedido.add(pe1);
        pedido.add(pe2);
        Empresa e = new Empresa("Samsung",40,30,1000,530918243,5000000,20,550.50,0.05,true,false);
        Empresa e1 = new Empresa("Nokia",10,20,4000,587921550,2000000,6,1550.50,0.02,true,false);
        Voluntario v = new Voluntario("Rui Manuel",10,30,600.00,true);
        Voluntario v1 = new Voluntario("Miguel Jacinto",20,30,50.00,true); 
        Loja l1 = new Loja("Loja dos 300",50,500,1500,pedido);
        System.out.println(l1.toString());
    }
}
