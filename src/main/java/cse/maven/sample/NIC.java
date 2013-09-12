package cse.maven.sample;
import org.joda.time.DateTime;

public class NIC {
	private String number,gender;
        private int recordSetNumber;
        private boolean isVoter;
        private DateTime birthday;
	
	public NIC(String number) {
		super();
		this.number= number;
	}

	public String getNumber() {
		return number;
	}
        
        public void setBirthday(DateTime birthday){
        this.birthday=birthday;
        }
        
        public DateTime getBirthday(){
        return birthday;
        }
        
        public void setRecordSetNumber(int recordSetNumber){
        this.recordSetNumber=recordSetNumber;
        }
        
        public int getrecordSetNumber(){
        return recordSetNumber;
        }
        
        public void setGender(String gender){
        this.gender=gender;
        }
        
        public String getGender(){
        return gender;
        }
        
        public boolean isVoter(){
        return isVoter;
        }
        
        public void setIsVorter(boolean vorter){
        this.isVoter=vorter;
        }
        
}
