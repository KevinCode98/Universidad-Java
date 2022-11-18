package Section20_FundamentosJava_Arreglos;

public class Persona {
    private String name;

    public Persona(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("name='").append(name).append('\'');
        sb.append(", direccion='").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
