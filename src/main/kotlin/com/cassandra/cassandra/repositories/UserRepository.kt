package com.cassandra.cassandra.repositories


import com.cassandra.cassandra.entities.User
import org.springframework.data.cassandra.repository.CassandraRepository
import org.springframework.stereotype.Repository


@Repository
interface UserRepository:   CassandraRepository<User,String> {
    fun findByfirstName(firstName: String): MutableList<User>

}
        /*



        CrudRepository{

    @Query(value="SELECT * FROM customer WHERE firstname=?0")
fun  findByFirstname(firstname:String):List<Customer>
    @Query("SELECT * FROM customer WHERE age > ?0")
    fun  findCustomerHasAgeGreaterthan(age:Int):List<Customer>


}*/