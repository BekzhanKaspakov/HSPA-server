package com.bekzhankaspakov.myfirstapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(PropertyRepository repository) {

        return args -> {
            log.info("Preloading database items");
            repository.save(new Property( 2,
                    "Birla House",
                    "House",
                    2,
                    "Fully",
                    12000,
                    1200,
                    900,
                    "6 Street","Golf Course Road",
                    "Atlanta",
                    "3",
                    "3",
                    null,
                    "10",
                    "East",
                    0,
                    1,
                    300,
                    "Ready to move",
                    "https://cdn.pixabay.com/photo/2016/11/29/03/53/architecture-1867187_1280.jpg",
                    "Well Maintained builder floor available for rent at prime location.",
                    "01-Jan-2019",
                    1));
            repository.save(new Property( 2,
                    "Birla House",
                    "House",
                    2,
                    "Fully",
                    12000,
                    1200,
                    900,
                    "6 Street","Golf Course Road",
                    "Atlanta",
                    "3",
                    "3",
                    null,
                    "10",
                    "East",
                    0,
                    1,
                    300,
                    "Ready to move",
                    "https://cdn.pixabay.com/photo/2016/11/18/17/46/architecture-1836070_1280.jpg",
                    "Well Maintained builder floor available for rent at prime location.",
                    "01-Jan-2019",
                    1));
            repository.save(new Property( 2,
                    "Erose Flat",
                    "Aparment",
                    3,
                    "Unfurnished",
                    5000,
                    1200,
                    900,
                    "5 Street",
                    "Golf Course Road",
                    "New York",
                    "3",
                    "3",
                    "Description",
                    "10",
                    "East",
                    0,
                    1,
                    300,
                    "Ready to move",
                    "https://cdn.pixabay.com/photo/2017/04/10/22/28/residence-2219972_1280.jpg",
                    "2 BHK, 2 Bathroom, 1 Car Parking",
                    "01-Jan-2019",
                    0));
            repository.save(new Property( 1,
                    "Gun Hill",
                    "House",
                    3,
                    "Fully",
                    12000,
                    1200,
                    900,
                    "5 Street",
                    "Golf Course Road",
                    "New York",
                    "3",
                    "3",
                    "Description",
                    "10",
                    "East",
                    0,
                    1,
                    300,
                    "Ready to move",
                    "https://cdn.pixabay.com/photo/2017/06/16/15/58/luxury-home-2409518_1280.jpg",
                    "2 BHK, 2 Bathroom, 1 Car Parking",
                    "01-Jan-2019",
                    0
                    ));
            repository.save(new Property( 1,
                    "Macro Home",
                    "Duplex",
                    4,
                    "Semi",
                    5000,
                    1200,
                    900,
                    "15 Street",
                    "Golf Course Road",
                    "New York",
                    "3",
                    "3",
                    "Description",
                    "10",
                    "East",
                    0,
                    1,
                    300,
                    "Ready to move",
                    "https://cdn.pixabay.com/photo/2017/06/17/12/59/luxury-home-2412145_1280.jpg",
                    "2 BHK, 2 Bathroom, 1 Car Parking",
                    "01-Jan-2019",
                    0
            ));

        };
    }
}