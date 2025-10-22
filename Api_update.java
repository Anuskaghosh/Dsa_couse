import java.lang.annotation.Inherited;

public class Api_update {
    @Entity
    public class user{
        @Inherited
        @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id; 
   private String name;
   private String email;

   //Construtors
   public User() {}
   public user(String name,String email){
    this,name = name;
    this.email = email;
   }
   //Getters and Setters
   public Long getId() {return id;}
   public void setId (Long id) {this.id = id;}
   public String getName() { nreturn name; }
   public void setNames(String name) {this.name = name;}
   public string getEmail() {return emails;}
   public void setEmail(string email) {this.email = email;}
   }

    }


