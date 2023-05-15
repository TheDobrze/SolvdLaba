package buildingCompany;

import buildingCompany.clients.IndividualClient;
import buildingCompany.residental.House;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Building> clientBuilding = new ArrayList<>();
        IndividualClient individualClient = new IndividualClient(1,"Janusz","Kowalski",new Date(),20000,
                clientBuilding);

        System.out.println(individualClient.getJoined());
        clientBuilding.add( new House("Słowackiego 3",1,true, 6,true,true,true,true));
        for(int i=0;i<individualClient.getClientBuilding().size();i++){
            System.out.println(individualClient.getClientBuilding().get(i));
        }

        String string = "To test";
        File file = new File("test.txt");
        FileUtils.writeStringToFile(file,string,"UTF-8");

    }

    public static long countingUniqueWords() throws IOException{
        long count = 0;
        File file = FileUtils.getFile("input.txt");
        try(LineIterator lineIterator = FileUtils.lineIterator(file)){
            while (lineIterator.hasNext()){
                String[] line= StringUtils.split(lineIterator.next());
                for(int i=0;i<line.length;i++){
                    count=1;
                    for(int j=i;j<line.length;j++){
                        if(line[i].equals(line[j])){
                            count++;
                            line[j] = "";
                        }
                    }
                }
            }
        }

        return count;
    }







}
