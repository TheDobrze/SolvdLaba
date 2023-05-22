package buildingCompany.ex;

import buildingCompany.employees.Builder;
import buildingCompany.residental.Hotel;
import buildingCompany.residental.House;

import java.lang.reflect.Field;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

import static buildingCompany.Enums.Certificate.FORKLIFT;
import static buildingCompany.Enums.Salary.MIDIUM;

public class MainStreams {
    public static void main(String[] args) throws ParseException {
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date date = df.parse("12-04-2020");
        List<House> houses = new ArrayList<>();
        List<Hotel> hotels = new ArrayList<>();


        House house1 = new House("Słowackiego 3", 1, true, 6, true, true, true, true);
        House house2 = new House("Słowackiego 4", 2, true, 8, true, true, true, false);
        House house3 = new House("Słowackiego 5", 1, true, 6, true, false, true, false);
        House house4 = new House("Słowackiego 6", 2, true, 8, true, true, true, true);
        House house5 = new House("Słowackiego 7", 1, true, 4, false, true, true, false);
        House house6 = new House("Słowackiego 9", 2, true, 8, true, false, true, true);

        houses.add(house1);
        houses.add(house2);
        houses.add(house3);
        houses.add(house4);
        houses.add(house5);
        houses.add(house6);

        Hotel hotel1 = new Hotel("Mickiewicza 4", 6,true,200,3,0,2);
        Hotel hotel2 = new Hotel("Dąbroszczaków 3", 10,true,900,4,1,4);
        Hotel hotel3 = new Hotel("Elegancka 9", 4,true,150,2,0,1);
        Hotel hotel4 = new Hotel("Słowackiego 5", 5,true,200,3,0,2);
        Hotel hotel5 = new Hotel("Mickiewicza 24", 3,true,100,2,0,1);
        Hotel hotel6 = new Hotel("Sobieskiego 3", 8,true,800,4,2,4);

        hotels.add(hotel1);
        hotels.add(hotel2);
        hotels.add(hotel3);
        hotels.add(hotel4);
        hotels.add(hotel5);
        hotels.add(hotel6);

        List<Hotel> hotelsWithCapacityOver200 = hotels.stream()
                .filter(h-> h.getCapacity()>200)
                .collect(Collectors.toList());

        List<String> upperAddresses = hotels.stream()
                .map(hotel -> hotel.getAddress().toUpperCase(Locale.ROOT))
                .sorted()
                .collect(Collectors.toList());

        houses.stream().distinct().forEach(System.out::println);

        hotels.stream().filter(hotel -> hotel.getFloors()>0).limit(4).forEach(System.out::println);

        System.out.println(houses.stream().map(house -> house.getCapacity()).min(Integer::compare));
        System.out.println(houses.stream().map(house -> house.getCapacity()).max(Integer::compare));

        System.out.println(houses.stream().findAny());



    }
}
