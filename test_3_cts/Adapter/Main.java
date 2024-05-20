package TestPana.Adapter;

public class Main {
    public static void main(String[] args) {
        DOCXContractReader contract = new DOCXContractReader();
        contract.readContract();

        JSONContractReader contractJSON = new JSONContractReader();
        contractJSON.readContract();

        JSONAdapter adapter = new JSONAdapter(contractJSON);
        adapter.retrieveContractDetails();
    }
}
