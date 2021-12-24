import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            branch.newCustomer(customerName, initialTransaction);
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            branch.addCustomerTransaction(customerName, transaction);
            return true;
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getName().equals(branchName)) {
                return branches.get(i);
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        if (findBranch(branchName) != null) {
            if (printTransactions) {
                System.out.println("Customer details for branch " + branchName);
                for (int i = 0; i < findBranch(branchName).getCustomers().size(); i++) {
                    System.out.println("Customer: " + findBranch(branchName).getCustomers().get(i).getName() + "[" + (i + 1) + "]");
                    for (int j = 0; j < findBranch(branchName).getCustomers().get(i).getTransactions().size(); j++) {
                        System.out.println("[" + (j + 1) + "]" + " Amount " + findBranch(branchName).getCustomers().get(i)
                                .getTransactions().get(j));
                    }
                }
                return true;
            }
            System.out.println("Customer details for branch " + branchName);
            for (int i = 0; i < findBranch(branchName).getCustomers().size(); i++) {
                System.out.println("Customer: " + findBranch(branchName).getCustomers().get(i).getName() + "[" + i + "]");
                return true;
            }
        }
        return false;
    }
}
