package ex9;

public class Customer {
    private String name;
    private String ssn;



    public Customer(String name) {
        if(checkOnlyDigitsMadeHomeNumberUtils(name)){
            return;
        }
        this.name = name;

    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    private void setSsn(String ssn) {
        if(checkOnlyDigitsHomeMade(ssn)){
            this.ssn = ssn;
        }

    }

    private boolean checkOnlyDigitsHomeMade(String ssn){
        char[] ssnAsChar = ssn.toCharArray();
        for (Character c : ssnAsChar) {
            if(c >= 47 || c <= 57){
                return false;
            }

        }
        return true;

    }

    private  boolean checkOnlyDigitsMadeHomeNumberUtils(String ssn){
       try {
           Integer.valueOf(ssn);
           return true;
       }catch (Exception ex){

       }

       return false;
    }

    // Encapsulate this class.  Make ssn read only.
 
}
