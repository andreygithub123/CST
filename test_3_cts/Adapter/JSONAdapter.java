package TestPana.Adapter;

public class JSONAdapter implements OnlineContract{

    JSONContractReader jsonContractReader;

    public JSONAdapter(JSONContractReader jsonContractReader) {
        this.jsonContractReader = jsonContractReader;
    }

    @Override
    public String retrieveContractDetails() {
        return jsonContractReader.readContract();
    }
}
