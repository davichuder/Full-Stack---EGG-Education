package herencia_ejercicio4extra;

import java.util.ArrayList;

import herencia_ejercicio4extra.entidades.Estudiante;
import herencia_ejercicio4extra.entidades.Menu;
import herencia_ejercicio4extra.entidades.Persona;
import herencia_ejercicio4extra.entidades.PersonalDeServicio;
import herencia_ejercicio4extra.entidades.Profesor;
import herencia_ejercicio4extra.enums.Departamento;
import herencia_ejercicio4extra.enums.EstadoCivil;
import herencia_ejercicio4extra.enums.Seccion;

public class app {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<Persona>();
        agregarPersonas(personas);
        Menu.ejecutar(personas);
    }

    private static void agregarPersonas(ArrayList<Persona> personas) {
        personas.add(new Estudiante("Web", "Gainsborough", 337135824, EstadoCivil.VIUDO, "FEED"));
        personas.add(new Estudiante("Collin", "Trebble", 54038182, EstadoCivil.SOLTERO, "HSSE"));
        personas.add(new Estudiante("Gertrudis", "Sterrie", 178605347, EstadoCivil.SOLTERO, "Apache Pig"));
        personas.add(new Estudiante("Yoko", "Suggitt", 489110958, EstadoCivil.SOLTERO, "YMS"));
        personas.add(new Estudiante("Linda", "Filer", 466101580, EstadoCivil.CASADO, "NG-SDH"));
        personas.add(new Estudiante("Jan", "Joutapaitis", 139723413, EstadoCivil.DIVORCIADO, "Web Development"));
        personas.add(new Estudiante("Willey", "Roark", 915727704, EstadoCivil.SOLTERO, "Foreign Trade Zone"));
        personas.add(new Estudiante("Elvira", "Grindley", 370005811, EstadoCivil.DIVORCIADO, "Oxygen"));
        personas.add(new Estudiante("Donnie", "Carradice", 985436633, EstadoCivil.VIUDO, "IRI"));
        personas.add(new Estudiante("Audre", "Binden", 748488933, EstadoCivil.DIVORCIADO, "Lyrics"));
        personas.add(new Estudiante("Joela", "de Aguirre", 155280883, EstadoCivil.CASADO, "Ghost Imaging"));
        personas.add(new Estudiante("Teodoro", "Bosward", 874944413, EstadoCivil.CASADO, "Broadband"));
        personas.add(new Estudiante("Auberon", "Olyfant", 424659033, EstadoCivil.CASADO, "Computer Graphics"));
        personas.add(new Estudiante("Margot", "Pinsent", 513436690, EstadoCivil.VIUDO, "GDS"));
        personas.add(new Estudiante("Blancha", "Gaffney", 832492719, EstadoCivil.CASADO, "Jewish Education"));
        personas.add(new Estudiante("Sutton", "Topham", 603913660, EstadoCivil.SOLTERO, "Medical-Surgical"));
        personas.add(new Estudiante("Audrye", "Boik", 379369333, EstadoCivil.DIVORCIADO, "SWIFT Messaging"));
        personas.add(new Estudiante("Cord", "Booty", 860490661, EstadoCivil.DIVORCIADO, "Successful Business Owner"));
        personas.add(new Estudiante("Zsazsa", "Sarl", 852064348, EstadoCivil.SOLTERO, "Workers Compensation"));
        personas.add(new Estudiante("Faye", "Furse", 101155648, EstadoCivil.DIVORCIADO, "IV"));
        personas.add(new Estudiante("Cherri", "Pala", 851506695, EstadoCivil.DIVORCIADO, "Railway"));
        personas.add(new Estudiante("Enrica", "Howlings", 918568116, EstadoCivil.SOLTERO, "Whole Life"));
        personas.add(new Estudiante("Yank", "Wittrington", 764116888, EstadoCivil.DIVORCIADO, "cGLP"));
        personas.add(new Estudiante("Doro", "Mashro", 520991319, EstadoCivil.VIUDO, "Manual Therapy"));
        personas.add(new Estudiante("Alford", "Eplate", 618466882, EstadoCivil.CASADO, "QR"));
        personas.add(new Estudiante("Joly", "Merry", 352662607, EstadoCivil.DIVORCIADO, "TTS"));
        personas.add(new Estudiante("Edythe", "Cuttell", 271664735, EstadoCivil.SOLTERO, "MPR"));
        personas.add(new Estudiante("Vera", "Jowers", 801227827, EstadoCivil.DIVORCIADO, "TCPA"));
        personas.add(new Estudiante("Nannette", "Burditt", 110803733, EstadoCivil.SOLTERO, "OID"));
        personas.add(new Estudiante("Stephanus", "Setterington", 856155167, EstadoCivil.DIVORCIADO, "RSVP-TE"));
        personas.add(new Estudiante("Caye", "Carus", 716524410, EstadoCivil.SOLTERO, "Omniture"));
        personas.add(new Estudiante("Neala", "Ayree", 528178474, EstadoCivil.CASADO, "Residential Homes"));
        personas.add(new Estudiante("Nils", "Kiln", 846111091, EstadoCivil.DIVORCIADO, "DTC"));
        personas.add(new Estudiante("Rob", "Copcote", 766343099, EstadoCivil.DIVORCIADO, "Requirements Gathering"));
        personas.add(new Estudiante("Harbert", "Terrett", 667355965, EstadoCivil.CASADO, "Play by Play"));
        personas.add(new Estudiante("Carlyn", "Jukubczak", 183338263, EstadoCivil.SOLTERO, "ICD-10"));
        personas.add(new Estudiante("Correy", "Pollendine", 692340705, EstadoCivil.SOLTERO, "NSN"));
        personas.add(new Estudiante("Ileana", "Antonowicz", 18590914, EstadoCivil.SOLTERO, "Comic Book Illustration"));
        personas.add(new Estudiante("Madelle", "Colls", 368789414, EstadoCivil.SOLTERO, "RRP"));
        personas.add(new Estudiante("Estel", "Wheway", 676806511, EstadoCivil.CASADO, "WFA"));
        personas.add(new Estudiante("Kris", "Lynd", 120585722, EstadoCivil.SOLTERO, "BIM"));
        personas.add(new Estudiante("Porter", "Washbrook", 161829196, EstadoCivil.VIUDO, "EWM"));
        personas.add(new Estudiante("Corri", "Attrey", 631533145, EstadoCivil.CASADO, "Class Actions"));
        personas.add(new Estudiante("Karita", "Bartalucci", 933162444, EstadoCivil.CASADO, "LSAMS"));
        personas.add(new Estudiante("Marena", "Nuschke", 170163607, EstadoCivil.VIUDO, "Airworthiness"));
        personas.add(new Estudiante("Kettie", "Winsom", 851086271, EstadoCivil.SOLTERO, "NDM"));
        personas.add(new Estudiante("Liam", "Roblett", 451665240, EstadoCivil.DIVORCIADO, "Special Education"));
        personas.add(new Estudiante("Wandis", "Simon", 352261408, EstadoCivil.SOLTERO, "Claims Management"));
        personas.add(new Estudiante("Brigitta", "Cuddy", 164353670, EstadoCivil.DIVORCIADO, "AES"));
        personas.add(new Estudiante("Isadore", "Ferie", 1111, EstadoCivil.DIVORCIADO, "Ultimate Frisbee"));

        personas.add(new Profesor("Dana", "MacCaull", 130842142, EstadoCivil.SOLTERO, 2011, 8, Departamento.FISICA));
        personas.add(
                new Profesor("Dayle", "Coggan", 362682762, EstadoCivil.SOLTERO, 2006, 100, Departamento.GEOGRAFIA));
        personas.add(new Profesor("Chevy", "Hucke", 989105221, EstadoCivil.CASADO, 1993, 98, Departamento.MATEMATICA));
        personas.add(new Profesor("Vachel", "Mossdale", 785350637, EstadoCivil.VIUDO, 2007, 49, Departamento.HISTORIA));
        personas.add(new Profesor("Doro", "Flinn", 951387166, EstadoCivil.CASADO, 1997, 50, Departamento.DEPORTE));
        personas.add(new Profesor("Gal", "Elger", 696241693, EstadoCivil.DIVORCIADO, 2003, 19, Departamento.DEPORTE));
        personas.add(
                new Profesor("Annadiane", "Pettifer", 445832461, EstadoCivil.VIUDO, 2007, 100, Departamento.HISTORIA));
        personas.add(
                new Profesor("Ardath", "Chrystal", 719143232, EstadoCivil.SOLTERO, 2000, 96, Departamento.HISTORIA));
        personas.add(new Profesor("Marrilee", "Szach", 918961197, EstadoCivil.SOLTERO, 1995, 48, Departamento.LENGUA));
        personas.add(new Profesor("Conn", "Mityakov", 522623822, EstadoCivil.DIVORCIADO, 2004, 6, Departamento.LENGUA));
        personas.add(
                new Profesor("Yehudi", "Hearty", 946720375, EstadoCivil.DIVORCIADO, 2001, 77, Departamento.FISICA));
        personas.add(
                new Profesor("Clarinda", "Ruppelin", 350670420, EstadoCivil.CASADO, 2009, 44, Departamento.HISTORIA));
        personas.add(
                new Profesor("Lois", "Mohan", 666100941, EstadoCivil.DIVORCIADO, 2002, 74, Departamento.MATEMATICA));
        personas.add(
                new Profesor("Ivory", "Rossetti", 613927704, EstadoCivil.SOLTERO, 2003, 40, Departamento.HISTORIA));
        personas.add(new Profesor("Urbano", "Chellam", 347830968, EstadoCivil.VIUDO, 1998, 25, Departamento.FISICA));
        personas.add(new Profesor("Roselle", "Pond", 854458618, EstadoCivil.CASADO, 2005, 34, Departamento.HISTORIA));
        personas.add(new Profesor("Petra", "Lyffe", 538249521, EstadoCivil.CASADO, 2001, 89, Departamento.DEPORTE));
        personas.add(new Profesor("Kennett", "Pauncefoot", 2406522, EstadoCivil.DIVORCIADO, 2004, 35,
                Departamento.GEOGRAFIA));
        personas.add(new Profesor("Griz", "Peirson", 657332223, EstadoCivil.VIUDO, 2010, 82, Departamento.GEOGRAFIA));
        personas.add(
                new Profesor("Herrick", "Le Fevre", 611739808, EstadoCivil.VIUDO, 2007, 34, Departamento.MATEMATICA));
        personas.add(
                new Profesor("Charley", "Koschek", 618176589, EstadoCivil.DIVORCIADO, 2010, 60, Departamento.HISTORIA));
        personas.add(new Profesor("Gun", "Schurcke", 975260871, EstadoCivil.VIUDO, 2008, 58, Departamento.FISICA));
        personas.add(new Profesor("Irena", "Pail", 545061633, EstadoCivil.DIVORCIADO, 2009, 20, Departamento.FISICA));
        personas.add(new Profesor("Gert", "Kernes", 406708002, EstadoCivil.VIUDO, 2004, 95, Departamento.FISICA));
        personas.add(
                new Profesor("Martha", "McVitty", 344062986, EstadoCivil.DIVORCIADO, 2002, 56, Departamento.LENGUA));
        personas.add(new Profesor("Sharia", "Dorber", 497089573, EstadoCivil.VIUDO, 1999, 1, Departamento.HISTORIA));
        personas.add(
                new Profesor("Carmine", "Magnay", 734710364, EstadoCivil.SOLTERO, 1989, 89, Departamento.HISTORIA));
        personas.add(new Profesor("Hube", "Tretter", 949020398, EstadoCivil.VIUDO, 1993, 100, Departamento.DEPORTE));
        personas.add(new Profesor("Brenden", "Noni", 593177819, EstadoCivil.CASADO, 2011, 97, Departamento.GEOGRAFIA));
        personas.add(new Profesor("Riki", "Gierardi", 347741587, EstadoCivil.SOLTERO, 1992, 66, Departamento.DEPORTE));
        personas.add(new Profesor("Vail", "Inde", 992099424, EstadoCivil.CASADO, 2009, 64, Departamento.HISTORIA));
        personas.add(
                new Profesor("Rodd", "Turton", 815523262, EstadoCivil.DIVORCIADO, 1998, 91, Departamento.GEOGRAFIA));
        personas.add(new Profesor("Matti", "O'Dowd", 172314904, EstadoCivil.SOLTERO, 1992, 16, Departamento.GEOGRAFIA));
        personas.add(new Profesor("Paxton", "Phidgin", 213439201, EstadoCivil.CASADO, 1993, 33, Departamento.HISTORIA));
        personas.add(new Profesor("Augustine", "Dawidman", 57134579, EstadoCivil.SOLTERO, 1993, 39,
                Departamento.MATEMATICA));
        personas.add(
                new Profesor("Levin", "Beazleigh", 678246219, EstadoCivil.SOLTERO, 2010, 15, Departamento.HISTORIA));
        personas.add(new Profesor("Cullin", "Della", 729107284, EstadoCivil.SOLTERO, 1998, 17, Departamento.GEOGRAFIA));
        personas.add(new Profesor("Maryrose", "Van Der Straaten", 992719111, EstadoCivil.CASADO, 2012, 34,
                Departamento.LENGUA));
        personas.add(
                new Profesor("Jaquelyn", "Haistwell", 246689248, EstadoCivil.CASADO, 2005, 55, Departamento.GEOGRAFIA));
        personas.add(new Profesor("Cynthie", "Dykas", 748435543, EstadoCivil.SOLTERO, 2005, 95, Departamento.HISTORIA));
        personas.add(new Profesor("Crystal", "Van der Kruis", 430645623, EstadoCivil.DIVORCIADO, 2005, 49,
                Departamento.GEOGRAFIA));
        personas.add(new Profesor("Rey", "Reeveley", 318287056, EstadoCivil.CASADO, 2011, 11, Departamento.DEPORTE));
        personas.add(
                new Profesor("Garth", "Bogue", 547085629, EstadoCivil.DIVORCIADO, 1996, 39, Departamento.GEOGRAFIA));
        personas.add(
                new Profesor("Aubrey", "Clowney", 109518023, EstadoCivil.SOLTERO, 1996, 16, Departamento.HISTORIA));
        personas.add(new Profesor("Patsy", "Meletti", 676944014, EstadoCivil.VIUDO, 2001, 37, Departamento.FISICA));
        personas.add(new Profesor("Fonsie", "Grigg", 289238654, EstadoCivil.CASADO, 2007, 72, Departamento.LENGUA));
        personas.add(
                new Profesor("Cami", "Trammel", 572526972, EstadoCivil.SOLTERO, 2002, 23, Departamento.MATEMATICA));
        personas.add(
                new Profesor("Heddie", "Hammelberg", 324148590, EstadoCivil.CASADO, 1992, 74, Departamento.LENGUA));
        personas.add(
                new Profesor("Jorgan", "Tonbye", 267352182, EstadoCivil.DIVORCIADO, 2000, 67, Departamento.GEOGRAFIA));
        personas.add(new Profesor("Iver", "Stanford", 1212, EstadoCivil.SOLTERO, 2001, 42, Departamento.FISICA));

        personas.add(new PersonalDeServicio("Bernardina", "Tremblot", 376869264, EstadoCivil.SOLTERO, 2004, 35,
                Seccion.DECANATO));
        personas.add(new PersonalDeServicio("Danya", "Flaherty", 101222837, EstadoCivil.SOLTERO, 2000, 43,
                Seccion.DECANATO));
        personas.add(
                new PersonalDeServicio("Mayor", "McCahey", 807513208, EstadoCivil.CASADO, 2008, 67, Seccion.DECANATO));
        personas.add(new PersonalDeServicio("Jeanine", "Cunnah", 182893445, EstadoCivil.VIUDO, 2010, 24,
                Seccion.MANTENIMIENTO));
        personas.add(new PersonalDeServicio("Dannye", "Hagergham", 851605992, EstadoCivil.CASADO, 2005, 51,
                Seccion.MANTENIMIENTO));
        personas.add(new PersonalDeServicio("Missie", "Breinl", 101739674, EstadoCivil.DIVORCIADO, 1992, 83,
                Seccion.MANTENIMIENTO));
        personas.add(new PersonalDeServicio("Sofie", "Newis", 293435221, EstadoCivil.VIUDO, 1992, 14,
                Seccion.MANTENIMIENTO));
        personas.add(new PersonalDeServicio("Yolane", "Blundell", 876746757, EstadoCivil.SOLTERO, 2009, 20,
                Seccion.BIBLIOTECA));
        personas.add(new PersonalDeServicio("Sarita", "Carrack", 639695261, EstadoCivil.SOLTERO, 1996, 58,
                Seccion.DECANATO));
        personas.add(new PersonalDeServicio("Florette", "Leonardi", 98699992, EstadoCivil.DIVORCIADO, 2006, 64,
                Seccion.SECRETARIA));
        personas.add(new PersonalDeServicio("Jeromy", "Fendley", 116697519, EstadoCivil.DIVORCIADO, 2001, 22,
                Seccion.SECRETARIA));
        personas.add(new PersonalDeServicio("Worthington", "Lamborne", 633391965, EstadoCivil.CASADO, 1995, 97,
                Seccion.SECRETARIA));
        personas.add(new PersonalDeServicio("Kori", "Winter", 385854495, EstadoCivil.DIVORCIADO, 2011, 45,
                Seccion.SECRETARIA));
        personas.add(new PersonalDeServicio("Ana", "Winteringham", 469955116, EstadoCivil.SOLTERO, 2003, 90,
                Seccion.SECRETARIA));
        personas.add(
                new PersonalDeServicio("Nicky", "Abade", 92855497, EstadoCivil.VIUDO, 2005, 40, Seccion.SECRETARIA));
        personas.add(new PersonalDeServicio("Guendolen", "Mincher", 471837493, EstadoCivil.CASADO, 2000, 12,
                Seccion.BIBLIOTECA));
        personas.add(new PersonalDeServicio("Rachael", "Easter", 513810068, EstadoCivil.CASADO, 2010, 90,
                Seccion.MANTENIMIENTO));
        personas.add(new PersonalDeServicio("Burr", "Waterhowse", 819370941, EstadoCivil.DIVORCIADO, 1991, 86,
                Seccion.MANTENIMIENTO));
        personas.add(new PersonalDeServicio("Reggis", "Lethcoe", 278453297, EstadoCivil.VIUDO, 1992, 67,
                Seccion.BIBLIOTECA));
        personas.add(
                new PersonalDeServicio("Chadwick", "Fivey", 581067982, EstadoCivil.VIUDO, 1998, 39, Seccion.DECANATO));
        personas.add(new PersonalDeServicio("Shari", "Bosnell", 811477482, EstadoCivil.DIVORCIADO, 2011, 49,
                Seccion.SECRETARIA));
        personas.add(
                new PersonalDeServicio("Archie", "Rosen", 840028010, EstadoCivil.VIUDO, 2009, 87, Seccion.DECANATO));
        personas.add(new PersonalDeServicio("Fremont", "Murtagh", 345222616, EstadoCivil.DIVORCIADO, 1995, 29,
                Seccion.DECANATO));
        personas.add(new PersonalDeServicio("Fredek", "Oran", 231589362, EstadoCivil.VIUDO, 2005, 22,
                Seccion.MANTENIMIENTO));
        personas.add(new PersonalDeServicio("Ring", "De Bell", 983580158, EstadoCivil.DIVORCIADO, 1988, 98,
                Seccion.SECRETARIA));
        personas.add(
                new PersonalDeServicio("Daryl", "Lile", 278779816, EstadoCivil.VIUDO, 2011, 97, Seccion.BIBLIOTECA));
        personas.add(new PersonalDeServicio("Kristian", "Genge", 174524133, EstadoCivil.SOLTERO, 2010, 66,
                Seccion.BIBLIOTECA));
        personas.add(
                new PersonalDeServicio("Savina", "Grogor", 884459006, EstadoCivil.VIUDO, 1997, 59, Seccion.BIBLIOTECA));
        personas.add(
                new PersonalDeServicio("Averyl", "Ofener", 168722054, EstadoCivil.CASADO, 2006, 97, Seccion.DECANATO));
        personas.add(new PersonalDeServicio("Shannan", "Towndrow", 442817061, EstadoCivil.SOLTERO, 2011, 16,
                Seccion.SECRETARIA));
        personas.add(new PersonalDeServicio("Manny", "Showte", 202546459, EstadoCivil.CASADO, 1990, 55,
                Seccion.MANTENIMIENTO));
        personas.add(new PersonalDeServicio("Sherlocke", "Groocock", 128675568, EstadoCivil.DIVORCIADO, 2002, 69,
                Seccion.MANTENIMIENTO));
        personas.add(new PersonalDeServicio("Joanie", "Girardy", 39976540, EstadoCivil.SOLTERO, 1989, 96,
                Seccion.BIBLIOTECA));
        personas.add(new PersonalDeServicio("Guglielma", "Hebbes", 897180711, EstadoCivil.CASADO, 1999, 61,
                Seccion.SECRETARIA));
        personas.add(new PersonalDeServicio("Rosmunda", "Pettyfer", 5975563, EstadoCivil.SOLTERO, 2010, 30,
                Seccion.SECRETARIA));
        personas.add(new PersonalDeServicio("Cassandry", "Melbert", 312803054, EstadoCivil.SOLTERO, 2009, 68,
                Seccion.SECRETARIA));
        personas.add(new PersonalDeServicio("Nicolle", "Bradmore", 623796189, EstadoCivil.SOLTERO, 2011, 63,
                Seccion.DECANATO));
        personas.add(new PersonalDeServicio("Everett", "Savile", 658630571, EstadoCivil.CASADO, 1984, 18,
                Seccion.SECRETARIA));
        personas.add(
                new PersonalDeServicio("Arni", "Davall", 288933184, EstadoCivil.CASADO, 1999, 92, Seccion.DECANATO));
        personas.add(new PersonalDeServicio("Margalo", "Roggerone", 732550280, EstadoCivil.SOLTERO, 2008, 39,
                Seccion.SECRETARIA));
        personas.add(new PersonalDeServicio("Daryl", "Yesenin", 945374049, EstadoCivil.DIVORCIADO, 2002, 99,
                Seccion.DECANATO));
        personas.add(new PersonalDeServicio("Dionne", "Vitler", 461808307, EstadoCivil.CASADO, 2007, 83,
                Seccion.SECRETARIA));
        personas.add(new PersonalDeServicio("Ellswerth", "Nano", 838544674, EstadoCivil.DIVORCIADO, 2002, 72,
                Seccion.BIBLIOTECA));
        personas.add(new PersonalDeServicio("Paddie", "Sommers", 314199932, EstadoCivil.SOLTERO, 2007, 10,
                Seccion.DECANATO));
        personas.add(
                new PersonalDeServicio("Gretel", "Bogeys", 302893978, EstadoCivil.VIUDO, 2007, 71, Seccion.SECRETARIA));
        personas.add(
                new PersonalDeServicio("Arni", "Marshman", 799903511, EstadoCivil.CASADO, 1994, 81, Seccion.DECANATO));
        personas.add(
                new PersonalDeServicio("Cordi", "Tzarkov", 267137400, EstadoCivil.SOLTERO, 2011, 6, Seccion.DECANATO));
        personas.add(
                new PersonalDeServicio("Frasco", "Roiz", 445913259, EstadoCivil.CASADO, 2001, 85, Seccion.DECANATO));
        personas.add(
                new PersonalDeServicio("Lew", "Emig", 299268530, EstadoCivil.DIVORCIADO, 2010, 96, Seccion.SECRETARIA));
        personas.add(new PersonalDeServicio("Alaine", "Garnett", 1234, EstadoCivil.SOLTERO, 2005, 10,
                Seccion.MANTENIMIENTO));

    }
}
