package com.themechguy.registrationpage.model;



import javax.persistence.*;
import java.util.Collection;
//making the class JPA entity using proper annotations making email field unique for the table

@Entity
@Table(name = "user", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name="user_roles",
            joinColumns = @JoinColumn(
                    name="user_id", referencedColumnName = "id"
            ),
            inverseJoinColumns = @JoinColumn(
                    name="role_id", referencedColumnName = "id"
            )

    )
    private Collection<Role> roles;

    //Creating default constructor and custom constructor
    public User(){

    }


    public User(String firstName, String lastName, String email, String password, Collection<Role> roles){
        super();
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.password=password;
        this.roles=roles;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }
}
