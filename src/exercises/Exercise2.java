package exercises;

import dao.CountryDao;
import dao.InMemoryWorldDao;
import domain.Country;

import java.util.List;

/**
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
public class Exercise2 {
    private static final CountryDao countryDao = InMemoryWorldDao.getInstance();

    public static void main(String[] args) {

        List<Country> countries = countryDao.findAllCountries();
        System.out.println(countries);

        //numarul de tari de pe fiecare continent


    }

}