import finance.*;

class Program {
    
    public static void main(String[] args) {
        double p = Double.parseDouble(args[0]);
        int m = 10;
        for(int n = 1; n <= m; ++n){
            //pattern matching switch
            double r = switch(args[1]) {
                case "EducationLoan" -> new EducationLoan().common(p, n);
                case "PersonalLoan" -> new PersonalLoan().common(p, n);
                case "HomeLoan" -> new HomeLoan().common(p, n);
                default -> throw new IllegalArgumentException("Invalid loan policy");
            };
            double emi = Loans.monthlyInstallment(p, n, r);
            System.out.printf("%-6d%12.2f%n", n, emi);
        }
    }
}
