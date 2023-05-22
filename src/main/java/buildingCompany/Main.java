package buildingCompany;

import buildingCompany.clients.CompanyClient;
import buildingCompany.clients.IndividualClient;
import buildingCompany.interfaces.IFindItem;
import buildingCompany.interfaces.IFunction;
import buildingCompany.interfaces.IValue;
import buildingCompany.interfaces.Requestor;
import buildingCompany.residental.House;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.function.Consumer;

import static buildingCompany.Enums.CompanySize.SMALL;

public class Main {
//    Use at least 5 lambda functions from the java.util.function package.++
//    Create 3 custom Lambda functions with generics.++
//    Create 5 complex Enums(with fields, methods, blocks).
//    Add 7 collection streaming in the hierarchy with terminal and non-terminal operations.++
//    Using reflection extract information(modifiers, return types, parameters, etc) about fields, constructors, methods. Create object and call method using the only reflection.++
//    Create 2 Threads using Runnable and Thread.++
//    Create Connection Pool. Use collection from java.util.concurrent package. Connection class may be mocked. The pool should be threadsafe and lazy initialized.
//    Initialize Connection Pool object of size 5. Load Connection Pool using single threads and Java Thread Pool (7 threads in total). 5 threads should be able to get the connection. 2 Threads should wait for the next available connection. The program should wait as well.
//    Implement previous point but with interfaces Future and CompletableStage.

    public static void main(String[] args) throws IOException {


        List<Requestor> clients = new ArrayList<>();
        List<Building> clientBuilding1 = new ArrayList<>();
        List<Building> clientBuilding2 = new ArrayList<>();
        List<Building> clientBuilding3 = new ArrayList<>();
        List<Building> clientBuilding4 = new ArrayList<>();
        IndividualClient individualClient1 = new IndividualClient(1, "Janusz", "Kowalski", new Date(), 20000, clientBuilding1);
        IndividualClient individualClient2 = new IndividualClient(2, "Janusz", "Kowalski", new Date(), 20000, clientBuilding2);
        IndividualClient individualClient3 = new IndividualClient(3, "Janusz", "Kowalski", new Date(), 20000, clientBuilding3);
        CompanyClient companyClient1 = new CompanyClient("Polbid", SMALL, 10000000, 023114423, clientBuilding4);

        clients.add(individualClient1);
        clients.add(individualClient2);
        clients.add(individualClient3);
        clients.add(companyClient1);

        clientBuilding1.add(new House("Słowackiego 3", 1, true, 6, true, true, true, true));
        clientBuilding1.add(new House("Słowackiego 7", 1, true, 6, true, true, true, true));
        clientBuilding1.add(new House("Słowackiego 12", 1, true, 6, true, true, true, true));
        clientBuilding2.add(new House("Słowackiego 4", 1, true, 6, true, true, true, true));
        clientBuilding3.add(new House("Słowackiego 5", 1, true, 6, true, true, true, true));
//  Lambda
        IFunction<String> exclaim = s -> s + "!";
        IFunction<String> ask = s -> s + "?";
        IValue<Integer> refValue;
        refValue = () -> 100000;
        Integer k = refValue.getValue();
        IFindItem<String> ref;

        ref = (item,items) ->{
            int count=0;
            for(int i = 0;i<items.size();i++){
                if(item==items.get(i)){
                    count++;
                }
            }return count;
        };
//        int count = ref.Search("Janusz",);

        individualClient1.getClientBuilding().forEach(n -> System.out.println(n));
        printFormatted(individualClient1.getName(),exclaim);
        Consumer<Building> method = (n) -> {
            System.out.println(n);
        };
        individualClient2.getClientBuilding().forEach(method);



        for (Requestor client : clients) {
            printFormatted(client.toString(), ask);
        }




//Count and write
        String string = "To test może uda się się się";
        File file = new File("test.txt");
        FileUtils.writeStringToFile(file, string + "\n" + (countingUniqueWords(file)), "UTF-8");
    }

    public static long countingUniqueWords(File file) throws IOException {
        long count = 0;
        FileUtils.touch(file);
        try (LineIterator lineIterator = FileUtils.lineIterator(file)) {
            while (lineIterator.hasNext()) {
                List<String> line = List.of(StringUtils.split(lineIterator.next()));
                for (String x : line) {
                    if (Collections.frequency(line, x) == 1) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void printFormatted(String str, IFunction<String> function) {
        String result = function.run(str);
        System.out.println(result);
    }
}
