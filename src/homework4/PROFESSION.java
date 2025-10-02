package homework4;

public enum PROFESSION {
    DIRECTOR(3),
    WORKER(2);

    private Integer koef;

    PROFESSION(Integer koef) {
        this.koef = koef;
    }

    public Integer getKoef() {
        return koef;
    }
}
