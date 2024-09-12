package processor;

public class Proc {
    private ProcFrq procFrq;
    private ProcCore procCore;
    private ProcBrend procBrend;
    private double weight;

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
        return "processor.Proc{" +
                "procFrq=" + procFrq +
                ", procCore=" + procCore +
                ", procBrend=" + procBrend +
                ", weight=" + weight +
                '}';
    }
}
