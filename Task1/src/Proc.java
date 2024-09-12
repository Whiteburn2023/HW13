public class Proc {
    private final ProcFrq procFrq;
    private final ProcCore procCore;
    private final ProcBrend procBrend;
    private final double weight;

    public Proc(ProcFrq procFrq, ProcCore procCore, ProcBrend procBrend, double weight) {
        this.procFrq = procFrq;
        this.procCore = procCore;
        this.procBrend = procBrend;
        this.weight = weight;
    }

    public ProcFrq getProcFrq() {
        return procFrq;
    }

    public ProcCore getProcCore() {
        return procCore;
    }

    public ProcBrend getProcBrend() {
        return procBrend;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Proc{" +
                "procFrq=" + procFrq +
                ", procCore=" + procCore +
                ", procBrend=" + procBrend +
                ", weight=" + weight +
                '}';
    }
}
