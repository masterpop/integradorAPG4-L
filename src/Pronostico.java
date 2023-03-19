import com.company.Equipo;
import com.company.Partido;
import com.company.ResultadoEnum;

public class Pronostico {


    //Atributos:
        private int numero;
        private Partido partido;
        private Equipo equipo;
        private ResultadoEnum resultado;


        // Constructor
        public Pronostico(int numero, Partido partido, Equipo equipo, ResultadoEnum resultado) {
            this.numero = numero;
            this.partido = partido;
            this.equipo = equipo;
            this.resultado = resultado;
        }

        //Getters


    public Partido getPartido() {
            return partido;
        }

        public Equipo getEquipo() {
            return equipo;
        }

        public ResultadoEnum getResultado() {
            return resultado;
        }




        }


