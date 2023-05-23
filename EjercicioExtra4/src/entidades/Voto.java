package entidades;

import java.util.HashSet;
import java.util.Objects;

public class Voto {

    private Alumno a1;
    private HashSet<Alumno> votados = new HashSet<>();

    public Voto() {
    }

    public Voto(Alumno a1) {
        this.a1 = a1;
    }

    public Alumno getA1() {
        return a1;
    }

    public void setA1(Alumno a1) {
        this.a1 = a1;
    }

    public HashSet<Alumno> getVotados() {
        return votados;
    }

    public void setVotados(HashSet<Alumno> votados) {
        this.votados = votados;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.a1);
        hash = 89 * hash + Objects.hashCode(this.votados);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Voto other = (Voto) obj;
        if (!Objects.equals(this.a1, other.a1)) {
            return false;
        }
        return Objects.equals(this.votados, other.votados);
    }

    @Override
    public String toString() {
        return a1 + "\n"
                + "Votados: \n"
                + votados;
    }

}
