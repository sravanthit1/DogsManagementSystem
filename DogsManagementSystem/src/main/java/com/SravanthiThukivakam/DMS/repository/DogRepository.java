/**
 * 
 */
package com.SravanthiThukivakam.DMS.repository;

import org.springframework.data.repository.CrudRepository;

import com.SravanthiThukivakam.DMS.Models.Dog;

import java.util.*;

/**
 *@author Sravanthi Thukivakam
 */
public interface DogRepository extends CrudRepository<Dog,Integer>{
	List<Dog> findByName(String name);

}
