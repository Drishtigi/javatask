public class Validator
{




    public void validate (String userName,String password ) throws Exception {




        switch (userName) {
            case "saran": {
                String tempPassword = "12345";

                if (tempPassword.equals(password)) {
                    System.out.println("Login Successfully");

                } else {
                    throw new Exception("password does not match");
                }
                break;
            }
            case "Priyanka": {
               String  tempPassword = "43876";

                if (tempPassword.equals(password)) {
                    System.out.println("Login Successfully");

                } else {
                    throw new Exception("password does not match");
                }
                break;
            }
            case "Yasiva":
            {
                String tempPassword = "345678";
                if(tempPassword.equals(password)){
                    System.out.println("Login Successfully");


                } else {
                throw new Exception("password does not match");
              }
              break;
            }







            default:
                throw new Exception("The given user name not found");

        }

    }
    public static void main(String[] args) {
        try {
            Validator v = new Validator();

            v.validate("saran", "123456");
        } catch (Exception e) {
          System.out.println(e);

        }
    }
}





