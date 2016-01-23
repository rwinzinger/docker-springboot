package winzinger.samples.dockerspringboot.account;

/**
 * Created by rwinzing on 13.11.15.
 */
public class Account {
    private int id;
    private int custId;

    public Account(int id, int custId) {
        this.id = id;
        this.custId = custId;
    }

    public int getId() {
        return id;
    }

    public int getCustId() {
        return custId;
    }
}
