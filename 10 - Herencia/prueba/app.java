package prueba;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class app {

        public static void main(String[] args) {
                // ArrayList<String> list1 = new ArrayList<String>();
                // list1.add("a");
                // list1.add("b");
                // list1.add("c");
                // System.out.println(list1);

                // ArrayList<String> list2 = new ArrayList<String>();
                // list2.add(list1.get(0));
                // list2.add(list1.get(1));
                // list2.add(list1.get(2));
                // System.out.println(list2);

                // list1.remove(0);
                // System.out.println(list1);
                // System.out.println(list2);

                // list1.removeIf(x -> x.equals("c"));
                // System.out.println(list1);
                // System.out.println(list2);

                // -------------------------

                // ArrayList<String> list3 = new ArrayList<String>();
                // list3.add("a");
                // list3.add("b");
                // list3.add("c");
                // list3.add("d");
                // System.out.println(list3);

                // Stream<String> stream = list3.stream().filter(x -> (x.equals("a") ||
                // x.equals("c")));
                // System.out.println(stream);
                // System.out.println(stream.count());
                // System.out.println(stream.toString());

                // list3.stream()
                // .filter(x -> (x.equals("a") ||
                // x.equals("c")))
                // .forEach(System.out::println);

                // List<String> aux = list3.stream()
                // .filter(x -> (x.equals("a") ||
                // x.equals("c")))
                // .collect(Collectors.toList());

                // System.out.println(aux.get(0));

                // list3.forEach(x -> aaa(x));
                // list3.forEach(System.out::println);

                // System.out.println("\033[H\033[2J" + "pepito");

                // -------------------------

                int a = 10;
                int b = 20;
                String mensaje;

                if ((a + b) > 30)
                        mensaje = "Mayor a 30";
                else
                        mensaje = "Menor a 30";
                System.out.println(mensaje);

                // CONDICION ? DEVOLVER SI VERDADERO: DEVOLVER SI FALSO

                System.out.println((a + b) > 30 ? "Mayor a 30" : "Menor a 30");

                int resultado = (a > 30 ? 10 : 0)
                                + ((a >= 3 && a <= 10) ? 5 : 0);
        }

        public static void aaa(String x) {
                System.out.println(x.toUpperCase());
        }

}
