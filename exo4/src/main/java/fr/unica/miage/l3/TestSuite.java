package fr.unica.miage.l3;

import java.util.function.Function;

public class TestSuite {

    public static class SuiteIMPL implements Suite {
        @Override
        public Double apply(Integer integer) {
            return (double) integer * integer;
        }
    }
    public static void main(String[] args) {
        //avec une classe interne
        Suite s1 = new SuiteIMPL(); ;
        //avec une classe anonyme
        Suite s2 = new Suite(){
            @Override
            public Double apply(Integer integer) {
                return (double) integer * integer;
            }
        };
        //avec une expression lambda
        Suite s3 = (n) -> (double) n*n;

        //todo Modifier test suite pour tester toutes ces méthodes
        //1. Affiche
        System.out.println("\nAffiche");
        Suites.affiche(s1,4);
        Suites.affiche(s2,4);
        Suites.affiche(s3,4);

        //2. Arithmetic
        System.out.println("\nArithmetic");
        Suite arithmetic = Suites.arithmetic(5,8);
        Suites.affiche(arithmetic,3);

        //3. Geometric
        System.out.println("\nGeometric");
        Suite geometric = Suites.geometric(5,8); //TODO FIX
        Suites.affiche(geometric,3);

        //4. recurrent
        System.out.println("\nRecurrent");
        Suite recurrent = Suites.recurrent(3, new Function<Double, Double>() {
            @Override
            public Double apply(Double aDouble) {
                return aDouble * aDouble;
            }
        });
        Suites.affiche(recurrent,2);

        //5. Heron
        System.out.println("\nHeron");
        Suite heron = Suites.heron(5);
        Suites.affiche(heron,3);

        //6. Syracuse
        System.out.println("\nSyracuse impair");
        Suite syracuse = Suites.syracuse(5);
        Suites.affiche(syracuse,8);

        System.out.println("\nSyracuse pair");
        syracuse = Suites.syracuse(14);
        Suites.affiche(syracuse,20);

        //7. Add
        System.out.println("\nAdd");
        Suite syracusePlusGeo = Suites.add(syracuse,geometric);
        Suites.affiche(syracusePlusGeo,20);

        //8. Multiply
        System.out.println("\nMultiply");
        Suite geoXArithmetic = Suites.multiply(geometric,arithmetic);
        Suites.affiche(geoXArithmetic,5);

        //9. PartialSum
        System.out.println("\nPartialSum");
        Suite partialSum = Suites.partialSum(arithmetic);
        Suites.affiche(partialSum,5);

        //10. Compose
        System.out.println("\nCompose");
        Function<Double,Double> f = (n) -> n + 10;
        Suite compose = Suites.compose(f,arithmetic);
        Suites.affiche(compose,5);
    }
}
