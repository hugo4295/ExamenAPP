package DatosExamen;

public class EstructuraDatos {
    String pregunta, r1, r2, r3, rc;

    public EstructuraDatos() {
    }

    public EstructuraDatos(String pregunta, String r1, String r2, String r3, String rc) {
        this.pregunta = pregunta;
        this.r1 = r1;
        this.r2 = r2;
        this.r3 = r3;
        this.rc = rc;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getR1() {
        return r1;
    }

    public void setR1(String r1) {
        this.r1 = r1;
    }

    public String getR2() {
        return r2;
    }

    public void setR2(String r2) {
        this.r2 = r2;
    }

    public String getR3() {
        return r3;
    }

    public void setR3(String r3) {
        this.r3 = r3;
    }

    public String getRc() {
        return rc;
    }

    public void setRc(String rc) {
        this.rc = rc;
    }
}
