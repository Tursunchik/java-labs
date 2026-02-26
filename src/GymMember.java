
   public  class GymMember{
       private  String memberId;
       private String memberName;
       private  double membershipFee;

        GymMember(String memberId, String memberName){
            this.memberId = memberId;
            this.memberName = memberName;
            this.membershipFee = 0.0;
        }
        public String getMemberID() {
         return memberId;
        }
        public String getMemberName() {
            return memberName;
           }
         public double getMembershipFee() {
            return membershipFee;
           }
         public void setMembershipFee(double membershipFee) {
            if(membershipFee < 0 ){
             System.out.println("Fee must be positive.");
            } else {
                this.membershipFee = membershipFee;
            }
           }
    }

