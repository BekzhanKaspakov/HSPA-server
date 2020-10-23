package com.bekzhankaspakov.myfirstapp;

import org.springframework.data.jpa.repository.JpaRepository;

interface PropertyRepository extends JpaRepository<Property, Long> {

}