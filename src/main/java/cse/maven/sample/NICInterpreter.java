package cse.maven.sample;

import cse.maven.sample.exception.InvalidNICNumberException;
import org.joda.time.DateTime;

public class NICInterpreter {

	public NIC createNIC(String number) throws InvalidNICNumberException {
		try {
			return new NIC(number);
		} catch(Exception ex) {
			throw new InvalidNICNumberException();
		}
	}
	
	public String interpret(NIC nic) throws InvalidNICNumberException {
		try
                {
                validate(nic);
                }
                catch(InvalidNICNumberException e)
                {
                throw e;
                }
		return "Nic [" + "birthday=[ year=" + nic.getBirthday().getYear()
                        +", month= "+nic.getBirthday().getMonthOfYear()+", date="
                        +nic.getBirthday().getDayOfMonth()+"], gender=" + nic.getGender() +", isVoter=" + nic.isVoter() + ", recordSetNumber=" + nic.getrecordSetNumber() + "]";
		}
	
	public void validate(NIC nic) throws InvalidNICNumberException{
            try {
            int year = Integer.parseInt(nic.getNumber().substring(0, 2)) + 1900;
            if(year > 2013 || year < 0)
                throw new InvalidNICNumberException("First two digits are wrong.Please enter again");
            
            int birthDate = Integer.parseInt(nic.getNumber().substring(2, 5));
            if(birthDate >= 500) {
                nic.setGender("FEMALE");
                birthDate-=500;
            }
            else
                nic.setGender("MALE");
            
            DateTime birthday = new DateTime(year, 1, 1, 0, 0);
            birthday = birthday.plusDays(birthDate - 2);
            
            if(birthday.getYear() > year)  //date field exceeds max limit
                throw new InvalidNICNumberException("Digits from 3 to 5 are wrong.Please enter again");
            
            DateTime backwards = new DateTime();
            backwards.minusYears(-18);
            boolean voter = (backwards.compareTo(birthday) >= 0);
            nic.setIsVorter(voter);
            
            int recordSet = 0;
            nic.setRecordSetNumber(recordSet);
            nic.setBirthday(birthday);
        }
        catch(InvalidNICNumberException e) {
            throw e;
        }
        catch(RuntimeException e){
        throw new InvalidNICNumberException(e.getMessage());
        }
	}	
}