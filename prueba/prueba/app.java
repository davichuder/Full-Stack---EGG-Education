package prueba;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;
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

                // int a = 10;
                // int b = 20;
                // String mensaje;

                // if ((a + b) > 30)
                // mensaje = "Mayor a 30";
                // else
                // mensaje = "Menor a 30";
                // System.out.println(mensaje);

                // // CONDICION ? DEVOLVER SI VERDADERO: DEVOLVER SI FALSO

                // System.out.println((a + b) > 30 ? "Mayor a 30" : "Menor a 30");

                // int resultado = (a > 30 ? 10 : 0)
                // + ((a >= 3 && a <= 10) ? 5 : 0);
                // -------------------------

                // System.out.println((char) (65)); // A
                // char letra = "A".charAt(0);
                // System.out.println(letra == 'A');
                // System.out.println(letra == 'B');
                // if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra ==
                // 'E')
                // System.out.println(letra);
                // System.out.println(letra == 'F');

                // Calendar calendar = Calendar.getInstance();
                // Calendar calendar2 = Calendar.getInstance();
                // System.out.println(Calendar.);
                // -------------------------
                // ArrayList<String> lista = new ArrayList<String>();
                // lista.add("A");
                // lista.add("B");
                // lista.add("C");
                // lista.add("D");
                // System.out.println(lista.indexOf("E"));
                // -------------------------
                // System.out.println("AAAAAAAAAAAAAAAAAA");
                // System.out.println("\033[H\033[2J" + "BBBBBBBBBBBBBBBB");
                // ---------------------------
                // Calendar calendario1 = Calendar.getInstance();
                // calendario1.set(2022, 9, 26);

                // Calendar calendario2 = Calendar.getInstance();
                // calendario2.set(2022, 9, 16);

                // long diferencia = calendario1.getTimeInMillis() -
                // calendario2.getTimeInMillis();
                // int dias = (int) TimeUnit.MILLISECONDS.toDays(diferencia);
                // System.out.println(dias);
                // ---------------------------
                System.out.println(StringToCalendar("01-01-22", "dd-MM-yy"));
        }

        public static void aaa(String x) {
                System.out.println(x.toUpperCase());
        }

        public static Calendar StringToCalendar(String time, String format) {
                Calendar calendar = Calendar.getInstance();
                SimpleDateFormat dateformat = new SimpleDateFormat(format);
                try {
                        calendar.setTime(dateformat.parse(time));
                        return calendar;
                } catch (Exception e) {
                        return calendar;
                }
        }

}
