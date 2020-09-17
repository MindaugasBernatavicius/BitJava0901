package cf.mindaugas.app;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.FileAlreadyExistsException;
import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        // 0. Hw
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        System.out.println("-------------");

        // 1. Kintamieji
        // ... Deklaracija
        int i;

        // Deklaracija + inicializacija
        int j = 5;
        int z = 5;

        // Uniary operator (post-increment)
        j++; // j+=1 ;; j=j+1;

        // ... unary pre-increment operator
        System.out.println(++j);
        System.out.println(j++); // reikšmė pasikeičia po šitos eilutės

        // Binary operator
        int result = z + j;
        // System.out.print(result);

        // "+" overloaded operator
        System.out.println(5 + 6); // 11
        System.out.println("5" + "6"); // 56
        System.out.println("5" + 6); // 56
        System.out.println(5 + "6"); // 56

        // cast'ing
        double d = 5.9;
        int di = (int)d;
        System.out.println(di); // skaičius po kablelio yra numetamas

        float f1 = 5.9f;
        double d1 = f1; // priskirti galime be cast'o

        double d2 = 5.9;
        float f2 = (float)d2; // reikia castinti,nes duoble yra didesnis (rizika prarasti duomenis)

        // String
        String s1 = "\uD83E\uDDE0 \uD83E\uDDB7 \uD83E\uDDB4";
        System.out.println(s1);

        // ... equality
        String s2 = "ABC";
        String s3 = new String("ABC");
        System.out.println(s2 == s3); // netaisyklingas būdas
        System.out.println(s2.equals(s3));
        System.out.println(!
                (s2.equals(s3) // true ==> !true == false
            ));

        // ... int equality
        int i1 = 10;
        int i2 = 10;
        System.out.println(i1 == i2);

        // ...
        System.out.println("-------------");
        System.out.println("ABC".equalsIgnoreCase("abc"));
        System.out.println("ABC".endsWith("BC"));
        System.out.println("ABC".endsWith("bc"));
        System.out.println("ABC".toLowerCase());
        System.out.println("ABC".toLowerCase().endsWith("bc"));
        System.out.println("ABC".length());
        System.out.println("ABC".replace("A","Z"));
        System.out.println("ABC".replace('A', 'Z'));

        // ... StringBiulder
        // ... imutability of strings
        System.out.println("... StringBiulder");
        String s4 = "ABC";
        String s5 = s4;
        System.out.println(System.identityHashCode(s4));
        System.out.println(System.identityHashCode(s5));
        s4 += "D"; // ... pridėjus raidę, buvo sukuratas naujas kintamasis
        System.out.println(System.identityHashCode(s4));

        // ... using StringBuilder
        StringBuilder builder = new StringBuilder();
        builder.append("abc ");
        builder.append("abc ");
        builder.append("abc ");
        builder.append("abc ");
        builder.append("abc ");
        builder.append("abc ");
        System.out.println(builder.toString());

        // ... If condition
        int age = 17;
        if(age > 18){ // amžiaus daugiau nei 18-niolika
            System.out.println("Galima pirkti alkoholį");
        } else { // ... jei ne
            System.out.println("Negalima pirkti alkoholio");
        }

        if(age > 18){ // amžiaus daugiau nei 18-niolika
            System.out.println("Galima pirkti alkoholį");
        } else if(age == 18) {
            System.out.println("Galima pirkti alkoholį");
        } else { // ... jei ne
            System.out.println("Negalima pirkti alkoholio");
        }

        // ... panaikingame else if panaudoję >= (daugiau arba lygu)
        // (age > 18 || age = 18) == (age >= 18)
        if(age >= 18){ // amžiaus daugiau nei 18-niolika
            System.out.println("Galima pirkti alkoholį");
        } else { // ... jei ne
            System.out.println("Negalima pirkti alkoholio");
        }

        age = 21;
        if(age < 18){
            System.out.println("Negalima nei prikti nei gerti");
        } else if(age >= 18 && age < 21){
            System.out.println("Galima gerti, bet negalima pirkti");
        } else {
            System.out.println("Galima gerti, ir pirkti");
        }

        // ... switch()
        System.out.println("... switch()");
        String name = "Petras";
        switch (name){ // char, byte, short, int, enum, String
            case "Jonas":
                System.out.println("Sveikas Jonai");
                break; // būtinas jei norime tik vieną
            case "Mindaugas":
                System.out.println("Sveikas Mindaugai");
                break;
            default:
                System.out.println("Sveiki!");
        }

        double d3 = 55.5;
        // switch(d3){ } // ... Incompatible types. Found: 'double', required: 'char, byte, short, int, Character, Byte, Short, Integer, String, or an enum'
        int i4 = 5;
        switch (i4){
            case (short)5: System.out.println("Shortai!");
        }

        // ... Loops
        // ... while
        System.out.println("... while");
        int counter = 5;
        while(counter > 0){
            System.out.println(counter);
            counter = counter - 1;
        }
        // while(true){}

        int x1 = 5;
        for( ; x1 > 0; ){
            System.out.println(x1);
            // ..
            // ..
            // ..
            x1 = x1 - 1;
        }
        // infinite loop
        // for( ; ; ){
        //     System.out.println("Labas");
        // }

        for(x1 = 5; x1 > 0 ; )
            System.out.println("Labas : " + --x1);
            System.out.println("Labas už ciklo"); // nėra ciklo dalis

        for (int k = 0; k < 5; k++) {
            System.out.println(">");
            // k++ / --k
        }

        // ... Getting user input
        // ... import java.util.Scanner;
        // Scanner sc = new Scanner(System.in);  // Create a Scanner object
        //
        // System.out.print("Enter username, please: ");
        // String userName = sc.nextLine();  // Read user input - laukia vartotojo įvesties ir enter paspausto
        //
        // System.out.print("Enter password, please: ");
        // String password = sc.nextLine();  // Read user input - laukia vartotojo įvesties ir enter paspausto
        //
        // System.out.println("Username is: " + userName + " and the password is: " + password);  // Output user input

        // ... do-while
        // System.out.println("... do-while");
        // Scanner sc1 = new Scanner(System.in);
        // String userInput = null;
        // String psw = "poiuytr";
        // do {
        //     System.out.print("Please enter password: ");
        //     userInput = sc1.nextLine();
        // } while(!userInput.equals(psw)); // while userinput is not equal to password, do x
        // System.out.println("You are logged in!");

        // ... for ciklo sudėtingesnė sintaksė
        int abc = 5;
        for (int k = 0, k2 = 0; k < 5 && k2 < 9 ; k++, k2++, abc++) { }

        // ... enhanced for
        System.out.println("... enhanced for");
        String[] myAwesomeArray = { "1", "2", "3", "4", "5" }; // masyvo deklaracija ir inicializacija
        for (String manoPasirinktasTarpinioKintamojoVardas : myAwesomeArray) {
            System.out.println(manoPasirinktasTarpinioKintamojoVardas);
        }

        // ... equivalent to enhanced for
        for(int u = 0; u < myAwesomeArray.length; u++){
            System.out.println(myAwesomeArray[u]);
        }

        // ... How to reverse string in Java
        System.out.println("... How to reverse string in Java");
        String str = "alus";
        String reversedString = new StringBuffer(str).reverse().toString();
        System.out.println(reversedString);

        String input = "alus"; // 4
        // toCharArray() method to convert string into char[].
        char[] charArr = input.toCharArray();
        char[] resArr = new char[charArr.length];
        // Store result in reverse order into the result byte[]
        for (int idx = 0; idx < charArr.length; idx++)
            resArr[idx] = charArr[charArr.length - idx - 1]; // pradžioje charArr.length - i - 1 = 3
        System.out.println(resArr);


        // ... break and continue
        System.out.println("... break and continue");
        int[] intArr = { 1, 15, 256, 5465, 121, 548, -55, 549, -5155156 };

        // ... find first negative number
        for (int k = 0; k < intArr.length; k++) {
            if(intArr[k] < 0){
                System.out.println(intArr[k]);
                break;
            }
            System.out.println("Už if'o!");
        }
        System.out.println("Už ciklo!");

        // ... find all
        for (int k = 0; k < intArr.length; k++) {
            if(intArr[k] < 0) System.out.println(intArr[k]);
        }

        // ... continue
        System.out.println("... continue");
        for (int k = 0; k < intArr.length; k++) {
            if(intArr[k] < 0) {
                System.out.println("Neigiamas: " + intArr[k]);
                continue;
            }
            // jei intArr[k] < 0 == true, tai šios eilutės nevykdysime
            System.out.println("Teigiamas: " + intArr[k]);
        }

        // ... arrays
        System.out.println("... arrays");
        int[] intArr2 = { 1, 15 }; // length == 2, tačiau nariai tik 0, 1
        for (int k = 0; k < 5; k++) {
            // java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
            // System.out.println(intArr2[k]);
        }
        // k jau neegzistuoja

        System.out.println("intArr2.length: " + intArr2.length);

        // ... fixed size
        int[] arr3 = new int[2]; // masyvo dydis yra aprašomas šioje vietoje: new int[2]
        arr3[0] = 0;
        arr3[1] = 1;
        // arr3[2] = 2; // java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
        arr3[1] = 55;
        System.out.println("arr3[1]: " + arr3[1]);

        // ... array initialization:
        int[] intArr21 = new int[2];
        intArr21[0] = 5; // adding a variable
        int[] intArr22 = new int[]{ 1, 15 }; // + declaration of internal variables
        int[] intArr23 = { 1, 15 }; // + declaration of internal variables

        // String[] s = new String[5];
        // s = new int[5];

        float[] fArr = new float[5];
        // double[] dArr = fArr; // negalime priskirti kito tipo masyvo

        double d6 = 99.9;
        fArr[0] = (float)d6; // galime su castingu priskirti

        // ... Išvardinti kas antrą narį.
        System.out.println("Išvardinti kas antrą narį.");
        String[] myAwesomeArray2 = { "1", "2", "3", "4", "5" }; // masyvo deklaracija ir inicializacija
        for (int k = 0; k < myAwesomeArray2.length; k += 2) {
            System.out.println(myAwesomeArray2[k]);
        }

        // "0 , 1 , 2 ... , 4"
        for (int k = 0; k < 5; k++) {
            System.out.println(k); // 0 ... 4
        }

        // ... Išvardinti narius iš dviejų vienodo ilgio masyvų vienu ciklu.
        System.out.println("Išvardinti narius iš dviejų vienodo ilgio masyvų vienu ciklu.");
        String[] myAwesomeArray3 = { "1", "2", "3", "4", "5" };
        String[] myAwesomeArray4 = { "5", "4", "3", "2", "1" };
        System.out.println("myAwesomeArray3.length: " + myAwesomeArray3.length);
        // for (int k = 0; k < myAwesomeArray3.length; k++) {
        //     System.out.println(myAwesomeArray3[k] + " -- " + myAwesomeArray4[k]);
        // }

        for (int k = 0, k2 = 0; k < myAwesomeArray3.length && k2 < myAwesomeArray4.length; k++, k2++) {
            System.out.println(myAwesomeArray3[k] + " -- " + myAwesomeArray4[k2]);
        }

        // ... filtravimas
        int[] intArr3 = { 1, 4, 15, 256, 0, 5465, 121, 548, -55, 549, -5155156, 22, 12 };
        for (int k = 0; k < intArr3.length; k++) {
            // jei liekana dalinant iš dviejų (ne)lygi nuliui (a.k.a (ne)lyginis)
            if (intArr3[k] % 2 != 0){
                System.out.println("intArr3[" + k + "]: " + intArr3[k]);
            }
        }

        // ... kaip iš jau turimo masyvo viršuje, pasigaminti antrą masyvą, kuris turėtų tik lyginius skaičius.
        // ... suskaičiuojame kiek yra lyginių skaičių
        int[] intArr4 = { 4, 1, 2, 5, 6 };
        int evenCounter = 0;
        for (int k = 0; k < intArr4.length; k++) {
            if (intArr4[k] % 2 == 0) evenCounter++;
        }
        System.out.println(evenCounter);

        // pasideklaruojame naują masyvą tokio dydžio kiek yra lyginių skaitmenų
        int[] arrWithEvenNumbers = new int[evenCounter];
        System.out.println(Arrays.toString(arrWithEvenNumbers));

        // pridedame juos į naują masyvą
        int jidx = 0;
        for (int k = 0; k < intArr4.length; k++) {
            if (intArr4[k] % 2 == 0) {
                arrWithEvenNumbers[jidx] = intArr4[k];
                jidx++;
            }
        }
        System.out.println(Arrays.toString(arrWithEvenNumbers));

        String[] sArr = {"A", "B", "C"};
        System.out.println(Arrays.toString(sArr));
        for (String s: sArr) {
            System.out.println("-->" + s);
        }

        // // ... Lauryno klausimas: kodėl pirmas masyvo stringas tuščias lieka
        // // .... Scanner.nextInt method does not read the newline character in your input created by hitting "Enter,"
        // Scanner s = new Scanner(System.in);
        // System.out.println("Enter the required size of the array: ");
        // // Jei naudojame nextLine() po nextInt(), tai po pastarojo reikia "suvalgyti" newline simbolį
        // // ... kuris atsiranda paspaudus enter. s.nextLine() jį automatiškai suvalgo, todėl po jo nereikia
        // // ... nereikia papildomo s.nextLine()
        // int arrDydis = s.nextInt(); s.nextLine();
        // System.out.println(arrDydis);
        // String[] myArray = new String[arrDydis];
        // System.out.println("Enter the elements of the array one by one ");
        // for(int a = 0; a < arrDydis; a++) {
        //     myArray[a] = s.nextLine();
        // }
        // System.out.println("Contents of the array are: "+ Arrays.toString(myArray));

        // // ... Lauryno klausimas: kodėl veikia gerai su nextInt()
        // Scanner s6 = new Scanner(System.in);
        // System.out.println("Enter the required size of the array: ");
        // int arrDydis6 = s6.nextInt();
        // System.out.println(arrDydis6);
        // int[] myArray6 = new int[arrDydis6];
        // System.out.println("Enter the elements of the array one by one ");
        // for(int a = 0; a < arrDydis6; a++) {
        //     myArray6[a] = s6.nextInt();
        // }
        // System.out.println("Contents of the array are: "+ Arrays.toString(myArray6));

        // ... sprendžiame lyginių skaičių išfiltravimo užduotį "hackiniu" būdu:
        int[] intArr5 = { 4, 1, 2, 0, 6 };
        //...
        int[] filtruotasMasyvas = { 4, 2, 0, 6, -1 };
        System.out.println("Contents of the array are: "+ Arrays.toString(filtruotasMasyvas));
        int counter2 = 0;
        for (int k = 0; k < filtruotasMasyvas.length; k++) {
            if(filtruotasMasyvas[k] != -1){
                counter2++;
            } else {
                break;
            }
        }
        System.out.println("Kiek buvo išfiltruota: " + counter2);

        // ... narių apkeitimas: kaip padaryti, kad "A", "B", "C", "D" taptų "A", "C", "B", "D"
        String[] arrTwoItems = { "A", "B", "C", "D" };

        // ... pradėkime nuo paprastesnio varianto
        // ... swap - apkeitimas kintamūjų
        char a = 'a', b = 'b';
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        char tmp = b;
        b = a;
        a = tmp;
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        // ... grįžtame prie originalios problemos
        int originalPosition = 1;
        int newPosition = 2;
        String [] myArray = {"A", "B", "C", "D"};
        String temp = myArray[originalPosition];
        myArray[originalPosition] = myArray[newPosition];
        myArray[newPosition] = temp;
        System.out.println(Arrays.toString(myArray));

        // ... rikiavimas (bubble sort algoritmas)
        System.out.println("... rikiavimas (bubble sort algoritmas)");
        // int[] intArr6 = { 4, 1, 2, 0, 6, 3 }; // rezultatas turėtų būti: 0, 1, 2, 4, 6
        int[] intArr6 = { 5, 4, 3, 2, 1 };
        System.out.println("Prieš rikiavimą: " + Arrays.toString(intArr6));
        int iterationCounter = 0, swapCounter = 0;

        for (int k = 0; k < intArr6.length - 1; k++) {
            for(int kidx = 0; kidx < intArr6.length - 1 - k; kidx++) {
                iterationCounter++;
                if(intArr6[kidx] > intArr6[kidx + 1]){
                    swapCounter++;
                    int temporary = intArr6[kidx + 1];
                    intArr6[kidx + 1] = intArr6[kidx];
                    intArr6[kidx] = temporary;
                }
            }
        }

        System.out.println("Iteracijų : " + iterationCounter);
        System.out.println("Apkeitimų vietomis : " + swapCounter);
        System.out.println("Po rikiavimo: " + Arrays.toString(intArr6));

        // ... linijinė paieška
        System.out.println(" ... linijinė paieška");
        String[] arrOfStrings = { "Mindaugas", "Petras", "Tomas", "Antanas" };
        String paieškomasis = "Antanas";
        boolean atsakymas = false;
        for (int k = 0; k < arrOfStrings.length; k++) {
            if(arrOfStrings[k].equals(paieškomasis)) {
                atsakymas = true;
            }
        }
        System.out.println("Ar " + paieškomasis + " yra sąraše: " + atsakymas);

        // 2D array
        int[][] _2dArr1 = new int[2][2];
        _2dArr1[0][0] = 1;
        _2dArr1[0][1] = 2;
        _2dArr1[1][0] = 3;
        _2dArr1[1][1] = 4;

        int[][] _2dArr2 = { {1, 2},
                            {3, 4} };

        // ... pasiekiame kiekvieną "giliausią narį"
        for (int k = 0; k < _2dArr1.length; k++) {
            for (int l = 0; l < _2dArr1[k].length; l++) {
                System.out.println("[" + k + "][" + l + "]" + _2dArr1[k][l]);
            }
        }
        System.out.println("------------");
        for (int k = 0; k < _2dArr2.length; k++) {
            for (int l = 0; l < _2dArr2[k].length; l++) {
                System.out.println("[" + k + "][" + l + "]" + _2dArr2[k][l]);
            }
        }

        // ... Iš 2D masyvo padaryti 1D ir pan
        // ... (darykime prielaidą, kad vienodo ilgio visi sub-masyvai)
        int[][] _2dArr3 = { {1, 2}, {3, 4} }; // { 1, 2, 3, 4}
        int len = _2dArr3.length * _2dArr3[0].length;
        int[] _1dFrom2d = new int[len];

        int count = 0;
        for (int k = 0; k < _2dArr3.length; k++) {
            for (int l = 0; l < _2dArr3[k].length; l++) {
                _1dFrom2d[count] = _2dArr3[k][l];
                count++;
            }
        }
        System.out.println("----------------");
        System.out.println("1D: " + Arrays.toString(_1dFrom2d));


        // ... jagged arrays
        int[][][] _3d = new int[2][][];
        _3d[0] = new int[2][];
        _3d[1] = new int[15][];

        System.out.println("Funkcijos");
        // ... funkcijos kvietimas
        mySecondFunction();
        sum(5, 6);
        sum(5.0, 6);

        System.out.println("factorialIterative(4): " + factorialIterative(4));
        System.out.println("factorialIterative(6): " + factorialIterative(6));
        System.out.println("factorialIterative(12): " + factorialIterative(12));

        System.out.println("factorialRecursive(0): " + factorialRecursive(0));
        System.out.println("factorialRecursive(1): " + factorialRecursive(1));
        System.out.println("factorialRecursive(2): " + factorialRecursive(2));
        System.out.println("factorialRecursive(4): " + factorialRecursive(4));
        System.out.println("factorialRecursive(6): " + factorialRecursive(6));
        System.out.println("factorialRecursive(12): " + factorialRecursive(12));

        System.out.println("------ Fibonacci ------");
        // 0, 1, 1, 2, 3
        System.out.println("fibonacciIterative(4): " + fibonacciIterative(4));
        System.out.println("fibonacciRecursive(4): " + fibonacciRecursive(4));

        System.out.println("------ Passing function parameters ------");
        int bandomsisTriušis = 5;
        System.out.println("bandomsisTriušis: " + bandomsisTriušis);
        addOne(bandomsisTriušis);
        System.out.println("bandomsisTriušis: " + bandomsisTriušis);

        int[] pairOfNumbers = {2, 1};
        System.out.println("pairOfNumbers: " + Arrays.toString(pairOfNumbers));
        swapPair(pairOfNumbers);
        System.out.println("pairOfNumbers: " + Arrays.toString(pairOfNumbers));


        int res;
        try {
            // ... pavojingas kodas
            res = 1 / 0; // ArithmeticException: / by zero
        } catch (Exception e){
            System.out.println("Įvyko klaida!");
        } finally {
            // finally blokas bus iškviestas, net jei darysime res = 1 / 1;
            System.out.println("Finally blokas!");
        }

        // File I/O
        System.out.println("Working Directory = " + System.getProperty("user.dir"));

        // ... sukuriu failo objektą, kuris laiko info kur failas randasi
        // File relativeFile = new File("data/singleLine.txt");
        File relativeFile = new File("./data/singleLine.txt");
        try {
            // standartinis būdas gauti duomenis iš teksitinio failo javoje
            FileReader fileReader = new FileReader(relativeFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            // skaitome eilutė po eilutės su .readLine() metodu
            String fileLine = bufferedReader.readLine(); // "\n", "\r\n" - ieško newline
            System.out.println(fileLine);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // ... skaitome failą, kuriame daug eilučių (vieną po kitos)
        File relativeFileMultiLine = new File("./data/multiLine.txt");
        try {
            FileReader fileReader = new FileReader(relativeFileMultiLine);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String fileLine = bufferedReader.readLine();
            while (fileLine != null) { // žiūrome ar perskaityta eilutė nėra tuščia
                // System.out.println(fileLine); // spausdiname visą eilutę
                // String[] splitString = fileLine.split(" ");
                String[] splitString = fileLine.split("\\s;|\\s|;");
                System.out.println(Arrays.toString(splitString));
                fileLine = bufferedReader.readLine(); // skaitome sekančią eilutę
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // ... writting to files
        File relativeFile2 = new File("./data/writtingToFiles.csv");
        FileWriter fw = null;
        try {
            fw = new FileWriter(relativeFile2);
            BufferedWriter bw = new BufferedWriter(fw);
            // for (int k = 0; k < 20000; k++) {
            //     bw.write("A");
            // }

            // writting file with newline
            String fileLine2 = "Mindaugas\n";
            bw.write(fileLine2);

            bw.write("Jonas");
            bw.newLine();

            bw.write("Antanas");
            bw.write("\n");

            bw.write("Petras");

            // bw.flush();
            bw.close(); // close automatically flushes the buffer
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            fw = new FileWriter(relativeFile2, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fw);
            String fileLine = "\nappended file line";
            bufferedWriter.write(fileLine);
            bufferedWriter.close();
        } catch(IOException e) {
            e.printStackTrace();
        }

        // Checked vs. unchecked exceptions
        try {
            checked();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            unchecked();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            u(2);
        } catch (FileNotFoundException e) {
            System.err.println("Failas nerastas, pažiūrėkite ar jis yra direktorijoje: " + relativeFile2.getPath());
        } catch (IOException | ArrayIndexOutOfBoundsException e) {
            System.err.println("I/O klaida, failas rastas, bet negaliu perskaityti!");
            System.err.println(e.getClass());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Bendrinė klaida");
        }

        // ... Network I/O
        try {
            URL url = new URL("https", "www.delfi.lt", "/");
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

            String inputLine = in.readLine();
            while (inputLine != null) {
                System.out.println(inputLine);
                inputLine = in.readLine();
            }
        } catch(MalformedURLException e){
            e.getStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("Programos pabaiga!");
    }


    // Exception catching order
    public static void u(int param) throws Exception {
        switch (param){
            case 1: throw new Exception();
            case 2: throw new IOException();
            case 3: throw new FileNotFoundException();
        }
    }

    // Checked vs. unchecked exceptions
    public static void checked(){
        throw new ArithmeticException("Aritmetikos klaida");
    }

    public static void unchecked() throws IOException {
        throw new IOException("IO klaida");
    }

    public static void swapPair(int[] arr){
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }

    // Parameter passing
    // public static void addOne(Integer i){
    //     ++i;
    //     System.out.println("bandomsisTriušis: " + i);
    // }

    public static void addOne(int i){
        ++i;
        System.out.println("bandomsisTriušis: " + i);
    }

    // Recursion
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        // fibN = fibN-1 + fibN-2
        return fibonacciRecursive(n - 1)
                + fibonacciRecursive(n - 2);
    }

    public static int fibonacciIterative(int n) {
        if(n <= 1) return n;
        int fib = 1;
        int prevFib = 1;

        for(int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }

    public static int factorialRecursive(int i){
        if(i <= 1) return 1; // base case
        return i * factorialRecursive(i - 1); // recursive step
    }

    public static int factorialIterative(int i){
        // 4 * 3 * 2 * 1 = 4!
        int res = 1, stopCondition = i;
        for (int j = 0; j < stopCondition; j++){
            res = res * i; // 4 * 3
            i--;
        }
        return res;
    }

    // Funkcijos deklaracija:
    // ... be parametrų f-ja
    // ... nieko negražina, tik padaro side-effect
    public static void mySecondFunction(){
        System.out.println("Side-effect");
        // return
    }

    // ... overloaded functions
    public static void sum(int i, int j){
        System.out.println("Suma:" + (i + j));
    }

    public static void sum(double d1, double d2){
        System.out.println("Suma:" + (d1 + d2));
    }

    // ... pure function.
    public static long sum(long l1, long l2){
        return l1 + l2;
    }

    public static void myThirdFunction2(int i, int j){
        System.out.println("Suma:" + (i + j));
    }
}