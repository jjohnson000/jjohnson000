public class Main {
    //sorts financial accounts into their proper financial statements
    public static void main(String[] args) {
        System.out.println(whichFinancialStatement("Accounts Receivable")); //should return balance sheet
        System.out.println(whichFinancialStatement("Cost of Goods Sold")); //should return income statement
        System.out.println(whichFinancialStatement("Profit")); //should return invalid entry
    }

    public static String whichFinancialStatement(String account){
        String answer = "";
        //arrays for each financial statement that contain all possible accounts on the financial statement
        String[] balanceSheet = {"Accounts Payable", "Accounts Receivable", "Accumulated Depreciation", "Capital paid in excess of par", "Cash", "Common Stock", "Inventory", "Long-term debt", "Notes Payable", "Plant and Equipment", "Preferred Stock"};
        String[] incomeStatement = {"Cost of Goods Sold", " Depreciation Expense", "Interest Expense", "Investments", "Preferred Stock Dividends", "Retained Earnings", "Sales", "Selling and Administrative Expenses", "Taxes"};

        //sets answer equal to the proper financial statement. If the account is not in either array, it lets the user know that they typed an invalid account.
        if(contains(balanceSheet, account)){
            answer = "Balance Sheet";
        } else if(contains(incomeStatement, account)) {
            answer = "Income Statement";
        } else {
            answer = "Invalid Entry";
        }
        return answer;
    }
    //checks to see if the account is contained in the financial statement array.
    public static boolean contains(String[] statement, String account){
        boolean contains = false;
        for (int i = 0; i < statement.length; i++) {
            if(statement[i] == account){
                contains = true;
                i = statement.length;
            }
        }
        return contains;
    }


}
