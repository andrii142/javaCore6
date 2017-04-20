package module11;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by citsym on 20.04.17.
 */
public class UsePeople {

    public static void main(String[] args) {

        // prepare data
        List<Company> listCompanies = new ArrayList<>();

        listCompanies.add(createCompany("Oranta"));
        listCompanies.add(createCompany("ATB"));
        listCompanies.add(createCompany("Private Bank"));


        // execute code
        List<String> lastNames = getLastNamesList(listCompanies);


        // check the result

        lastNames.forEach(System.out::println);

    }

    private static List<String> getLastNamesList(List<Company> listCompanies) {
//        listCompanies.stream().map((company) -> company.getListDivision())
//                .map(divisionList->divisionList.stream().map(division-> division.getListPerson())
//                        .map(listPersons-> listPersons.stream().map(person -> person.getLastName()).distinct()));
        return listCompanies.stream().flatMap(company -> company.getListDivision().stream())
                .filter(division-> division.getDivisionName().equals("IT"))
                .flatMap(division -> division.getListPerson().stream())
                .limit(5)
                .map(Person::getLastName)
                .distinct().collect(Collectors.toList());
    }


    private static Company createCompany(String companyName) {
        List<Division> listDivision = new ArrayList<>();

        listDivision.add(createDivision("IT", companyName));
        listDivision.add(createDivision("Finance", companyName));

        return new Company(listDivision);
    }


    private static Division createDivision(String divisionName, String companyName) {
        List<Person> listPerson = new ArrayList<>();

        listPerson.add(new Person("1", companyName + "1"));
        listPerson.add(new Person("2", companyName + divisionName + "2"));
        listPerson.add(new Person("3", companyName + divisionName+"3"));

        return new Division(divisionName ,listPerson);
    }
}
