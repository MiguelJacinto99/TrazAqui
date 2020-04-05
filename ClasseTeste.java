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
        Empresa e = new Empresa("Samsung",40,30,1000,530918243,5000000,20,550.50,0.05,true,false);
        Empresa e1 = new Empresa("Nokia",10,20,4000,587921550,2000000,6,1550.50,0.02,true,false);
        Voluntario v = new Voluntario("Rui Manuel",10,30,600.00,true);
        Voluntario v1 = new Voluntario("Miguel Jacinto",20,30,50.00,true);
        Encomenda enc1 = new Encomenda("Loja dos 300","Andre Mendes","Samsung",20,false,produtos);
        Encomenda enc2 = new Encomenda("Mariazinha","Rui Fonseca","HP",50,false,produtos);
        Loja l1 = new Loja("Loja dos 300",50,500,1500);
        Loja l2 = new Loja("Mariazinha",10,200,500);
        System.out.println(l1.toString());
        System.out.println(l2.toString());
    }
}
