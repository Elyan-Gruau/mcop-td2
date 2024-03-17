package fr.unica.miage.l3;

import java.util.function.Function;

public class Suites {


    public static void affiche(Suite s, int n){
        //qui affiche tous les éléments de la suite jusqu'au n-ième (compris)
        for (int i = 0; i <=n;i++){
            System.out.println(i+": "+s.apply(i));
        }
    }
    public static Suite arithmetic(double u0, double r){
        //qui renvoie la suite arithmétique u0+n⋅r
        return (n) -> u0 + n * r;
    }
    public static Suite geometric(double u0, double q){
      //qui renvoie la suite géométrique u0⋅qn

        return (n) -> {
            if (n==0) return u0;
            return u0 *( q * n);
        };
    }
    public static Suite recurrent(double a, Function<Double, Double> f) {
        //qui renvoie la suite récurrente définie par u0=a
        //    et ∀n≥0, un+1=f(un)
        return (n) -> {
            double res = a;
            for (int i = 0; i <n; i++) {
                res = f.apply(res);
            }
            return res;
        };

    }
    public static Suite heron(double x) {
        //qui utilise la méthode précédente pour définir la suite de Héron qui pour x>0
        //    donnée est définie par u0=1
        //    et
        //∀n≥0, un+1=(x/un+un)/2.
        //    Cette suite converge vers x−−√
//        Function<Double, Double> f =  ;
        return Suites.recurrent(1, (n) ->  (x/n+n)/2); //TODO TEST

    }

    public static Suite syracuse(int u0) {
        //définie elle aussi récursivement à l'aide de la fonction f
        //    suivante :
        //    f(n)=n2
        //    si n
        //    est pair
        //    f(n)=3n+1
        //    si n
        //    est impair
        //    Vérifiez que quel que soit l'entier de  départ, à partir d'un certain moment la suite entre dans une boucle.
        return Suites.recurrent(u0, (n) -> (n%2 == 0 ? n/2 : 3*n+1));
    }
    public static Suite add(Suite s1, Suite s2){
        // qui somme deux suites.
        return integer -> s1.apply(integer) + s2.apply(integer);
    }
    public static Suite multiply(Suite s1, Suite s2) {
        //qui multiplie deux suites.
        return integer -> s1.apply(integer) * s2.apply(integer);
    }
    public static Suite partialSum(Suite u) {
        //qui renvoie la somme des sommes partielles de la suite u. Par exemple pour la suite un
        //, la suite des sommes partielles est donnée par
        //    sn=∑k=0nuk
        return (n) -> {
            double res = 0.0;
              for (int i = 0; i <=n;i++){
                res += u.apply(i);
              }
              return res;
        };
    }
    public static Suite compose(Function<Double, Double> f, Suite u){
        return (n) -> f.apply(u.apply(n));
    }
}
